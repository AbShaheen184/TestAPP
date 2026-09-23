package com.app.mlounge;

import androidx.room.b0;
import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.ui.g0;
import com.app.mlounge.ui.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c, g0, h0, dagger.hilt.android.internal.managers.c, dagger.hilt.internal.a {
    public final dagger.internal.e N;
    public final dagger.internal.e O;
    public final dagger.internal.e P;
    public final dagger.internal.e Q;
    public final dagger.internal.e R;
    public final dagger.internal.e S;
    public final dagger.internal.e T;
    public final dagger.internal.e U;
    public final dagger.internal.e V;
    public final dagger.internal.e W;
    public final androidx.media3.exoplayer.mediacodec.g a;
    public final h b = this;
    public final dagger.internal.e c = b0.d(this, 3);
    public final dagger.internal.e d = b0.d(this, 2);
    public final dagger.internal.e e = b0.d(this, 1);
    public final dagger.internal.e f = b0.d(this, 4);
    public final dagger.internal.e g = b0.d(this, 0);
    public final dagger.internal.e h = b0.d(this, 7);
    public final dagger.internal.e i = b0.d(this, 6);
    public final dagger.internal.e j = b0.d(this, 5);
    public final dagger.internal.e k = b0.d(this, 9);
    public final dagger.internal.e l = b0.d(this, 8);
    public final dagger.internal.e m = b0.d(this, 10);
    public final dagger.internal.e n = b0.d(this, 11);
    public final dagger.internal.e o = b0.d(this, 14);
    public final dagger.internal.e p = b0.d(this, 13);
    public final dagger.internal.e q = b0.d(this, 15);
    public final dagger.internal.e r = b0.d(this, 16);
    public final dagger.internal.e s = b0.d(this, 17);
    public final dagger.internal.e t = b0.d(this, 20);
    public final dagger.internal.e u = b0.d(this, 19);
    public final dagger.internal.e v = b0.d(this, 18);
    public final dagger.internal.e w = b0.d(this, 23);
    public final dagger.internal.e x = b0.d(this, 22);
    public final dagger.internal.e y = b0.d(this, 21);
    public final dagger.internal.e z = b0.d(this, 26);
    public final dagger.internal.e A = b0.d(this, 25);
    public final dagger.internal.e B = b0.d(this, 24);
    public final dagger.internal.e C = b0.d(this, 27);
    public final dagger.internal.e D = b0.d(this, 30);
    public final dagger.internal.e E = b0.d(this, 29);
    public final dagger.internal.e F = b0.d(this, 28);
    public final dagger.internal.e G = b0.d(this, 12);
    public final dagger.internal.e H = b0.d(this, 31);
    public final dagger.internal.e I = b0.d(this, 36);
    public final dagger.internal.e J = b0.d(this, 35);
    public final dagger.internal.e K = b0.d(this, 34);
    public final dagger.internal.a L = new dagger.internal.a();
    public final dagger.internal.e M = b0.d(this, 33);

    public h(androidx.media3.exoplayer.mediacodec.g gVar) {
        this.a = gVar;
        dagger.internal.a aVar = this.L;
        dagger.internal.e eVarD = b0.d(this, 32);
        if (aVar.a != null) {
            org.mozilla.javascript.c.a();
            throw null;
        }
        aVar.a = eVarD;
        this.N = b0.d(this, 37);
        this.O = b0.d(this, 38);
        this.P = b0.d(this, 39);
        this.Q = b0.d(this, 40);
        this.R = b0.d(this, 42);
        this.S = b0.d(this, 41);
        this.T = b0.d(this, 43);
        this.U = b0.d(this, 44);
        this.V = b0.d(this, 46);
        this.W = b0.d(this, 45);
    }

    public final com.app.mlounge.data.local.dao.i a() {
        AppDatabase appDatabase = (AppDatabase) this.k.get();
        appDatabase.getClass();
        com.app.mlounge.data.local.dao.i iVarU = appDatabase.u();
        dagger.internal.d.a(iVarU);
        return iVarU;
    }

    public final com.app.mlounge.data.local.dao.k b() {
        AppDatabase appDatabase = (AppDatabase) this.k.get();
        appDatabase.getClass();
        com.app.mlounge.data.local.dao.k kVarV = appDatabase.v();
        dagger.internal.d.a(kVarV);
        return kVarV;
    }
}
