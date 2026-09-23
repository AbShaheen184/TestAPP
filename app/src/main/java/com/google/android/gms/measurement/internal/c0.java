package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 {
    public long A;
    public final androidx.collection.f y;
    public final androidx.collection.f z;

    public c0(p1 p1Var) {
        super(p1Var);
        this.z = new androidx.collection.f(0);
        this.y = new androidx.collection.f(0);
    }

    public final void A(String str, long j, a3 a3Var) {
        p1 p1Var = (p1) this.e;
        if (a3Var == null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.K.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                u0 u0Var2 = p1Var.C;
                p1.m(u0Var2);
                u0Var2.K.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            p4.s0(a3Var, bundle, true);
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.C("am", "_xu", bundle);
        }
    }

    public final void B(long j) {
        androidx.collection.f fVar = this.y;
        Iterator it = ((androidx.collection.c) fVar.keySet()).iterator();
        while (it.hasNext()) {
            fVar.put((String) it.next(), Long.valueOf(j));
        }
        if (fVar.isEmpty()) {
            return;
        }
        this.A = j;
    }

    public final void w(String str, long j) {
        p1 p1Var = (p1) this.e;
        if (str == null || str.length() == 0) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = p1Var.D;
            p1.m(m1Var);
            m1Var.E(new a(this, str, j, 0));
        }
    }

    public final void x(String str, long j) {
        p1 p1Var = (p1) this.e;
        if (str == null || str.length() == 0) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = p1Var.D;
            p1.m(m1Var);
            m1Var.E(new a(this, str, j, 1));
        }
    }

    public final void y(long j) {
        d3 d3Var = ((p1) this.e).I;
        p1.l(d3Var);
        a3 a3VarZ = d3Var.z(false);
        androidx.collection.f fVar = this.y;
        for (String str : (androidx.collection.c) fVar.keySet()) {
            A(str, j - ((Long) fVar.get(str)).longValue(), a3VarZ);
        }
        if (!fVar.isEmpty()) {
            z(j - this.A, a3VarZ);
        }
        B(j);
    }

    public final void z(long j, a3 a3Var) {
        p1 p1Var = (p1) this.e;
        if (a3Var == null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.K.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.K.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            p4.s0(a3Var, bundle, true);
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.C("am", "_xa", bundle);
        }
    }
}
