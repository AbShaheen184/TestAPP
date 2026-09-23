package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final t g;

    public q(p1 p1Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        t tVar;
        com.google.android.gms.common.internal.x.d(str2);
        com.google.android.gms.common.internal.x.d(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.b(u0.D(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.a("Param name can't be null");
                    it.remove();
                } else {
                    p4 p4Var = p1Var.F;
                    p1.k(p4Var);
                    Object objE = p4Var.E(bundle2.get(next), next);
                    if (objE == null) {
                        u0 u0Var3 = p1Var.C;
                        p1.m(u0Var3);
                        u0Var3.F.b(p1Var.G.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        p4 p4Var2 = p1Var.F;
                        p1.k(p4Var2);
                        p4Var2.M(bundle2, next, objE);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.g = tVar;
    }

    public final q a(p1 p1Var, long j) {
        return new q(p1Var, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String string = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        androidx.room.b0.i(sb, "Event{appId='", str, "', name='", str2);
        return androidx.compose.runtime.j.m(sb, "', params=", string, "}");
    }

    public q(p1 p1Var, String str, String str2, String str3, long j, long j2, long j3, t tVar) {
        com.google.android.gms.common.internal.x.d(str2);
        com.google.android.gms.common.internal.x.d(str3);
        com.google.android.gms.common.internal.x.g(tVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.c(u0.D(str2), u0.D(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = tVar;
    }
}
