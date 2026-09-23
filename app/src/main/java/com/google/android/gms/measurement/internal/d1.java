package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends x1 {
    public static final Pair W = new Pair("", 0L);
    public SharedPreferences A;
    public c1 B;
    public final androidx.media3.exoplayer.l1 C;
    public final androidx.compose.foundation.lazy.layout.b1 D;
    public String E;
    public boolean F;
    public long G;
    public final androidx.media3.exoplayer.l1 H;
    public final b1 I;
    public final androidx.compose.foundation.lazy.layout.b1 J;
    public final com.google.firebase.messaging.n K;
    public final b1 L;
    public final androidx.media3.exoplayer.l1 M;
    public final androidx.media3.exoplayer.l1 N;
    public boolean O;
    public final b1 P;
    public final b1 Q;
    public final androidx.media3.exoplayer.l1 R;
    public final androidx.compose.foundation.lazy.layout.b1 S;
    public final androidx.compose.foundation.lazy.layout.b1 T;
    public final androidx.media3.exoplayer.l1 U;
    public final com.google.firebase.messaging.n V;
    public SharedPreferences z;

    public d1(p1 p1Var) {
        super(p1Var);
        this.H = new androidx.media3.exoplayer.l1(this, "session_timeout", 1800000L);
        this.I = new b1(this, "start_new_session", true);
        this.M = new androidx.media3.exoplayer.l1(this, "last_pause_time", 0L);
        this.N = new androidx.media3.exoplayer.l1(this, "session_id", 0L);
        this.J = new androidx.compose.foundation.lazy.layout.b1(this, "non_personalized_ads");
        this.K = new com.google.firebase.messaging.n(this, "last_received_uri_timestamps_by_source");
        this.L = new b1(this, "allow_remote_dynamite", false);
        this.C = new androidx.media3.exoplayer.l1(this, "first_open_time", 0L);
        com.google.android.gms.common.internal.x.d("app_install_time");
        this.D = new androidx.compose.foundation.lazy.layout.b1(this, "app_instance_id");
        this.P = new b1(this, "app_backgrounded", false);
        this.Q = new b1(this, "deep_link_retrieval_complete", false);
        this.R = new androidx.media3.exoplayer.l1(this, "deep_link_retrieval_attempts", 0L);
        this.S = new androidx.compose.foundation.lazy.layout.b1(this, "firebase_feature_rollouts");
        this.T = new androidx.compose.foundation.lazy.layout.b1(this, "deferred_attribution_cache");
        this.U = new androidx.media3.exoplayer.l1(this, "deferred_attribution_cache_timestamp", 0L);
        this.V = new com.google.firebase.messaging.n(this, "default_event_parameters");
    }

    public final SharedPreferences A() {
        v();
        x();
        if (this.A == null) {
            p1 p1Var = (p1) this.e;
            String strValueOf = String.valueOf(p1Var.e.getPackageName());
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            s0 s0Var = u0Var.K;
            String strConcat = strValueOf.concat("_preferences");
            s0Var.b(strConcat, "Default prefs file");
            this.A = p1Var.e.getSharedPreferences(strConcat, 0);
        }
        return this.A;
    }

    public final SparseArray B() {
        Bundle bundleJ = this.K.J();
        int[] intArray = bundleJ.getIntArray("uriSources");
        long[] longArray = bundleJ.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            u0 u0Var = ((p1) this.e).C;
            p1.m(u0Var);
            u0Var.C.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final c2 C() {
        v();
        return c2.c(z().getInt("consent_source", 100), z().getString("consent_settings", "G1"));
    }

    public final void D(boolean z) {
        v();
        u0 u0Var = ((p1) this.e).C;
        p1.m(u0Var);
        u0Var.K.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = z().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean E(long j) {
        return j - this.H.g() > this.M.g();
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final boolean w() {
        return true;
    }

    public final SharedPreferences z() {
        v();
        x();
        com.google.android.gms.common.internal.x.g(this.z);
        return this.z;
    }
}
