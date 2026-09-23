package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.view.menu.e;
import androidx.work.impl.model.f;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.a3;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.d3;
import com.google.android.gms.measurement.internal.i2;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final p1 a;
    public final s2 b;

    public a(p1 p1Var) {
        x.g(p1Var);
        this.a = p1Var;
        s2 s2Var = p1Var.J;
        p1.l(s2Var);
        this.b = s2Var;
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final String c() {
        d3 d3Var = ((p1) this.b.e).I;
        p1.l(d3Var);
        a3 a3Var = d3Var.z;
        if (a3Var != null) {
            return a3Var.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final void e(String str, String str2, Bundle bundle) {
        this.b.z(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final String f() {
        d3 d3Var = ((p1) this.b.e).I;
        p1.l(d3Var);
        a3 a3Var = d3Var.z;
        if (a3Var != null) {
            return a3Var.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final void g(Bundle bundle) {
        s2 s2Var = this.b;
        ((p1) s2Var.e).H.getClass();
        s2Var.I(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final void h(String str) {
        p1 p1Var = this.a;
        c0 c0Var = p1Var.K;
        p1.j(c0Var);
        p1Var.H.getClass();
        c0Var.x(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final long i() {
        p4 p4Var = this.a.F;
        p1.k(p4Var);
        return p4Var.u0();
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final void j(String str) {
        p1 p1Var = this.a;
        c0 c0Var = p1Var.K;
        p1.j(c0Var);
        p1Var.H.getClass();
        c0Var.w(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final void k(String str, String str2, Bundle bundle) {
        s2 s2Var = this.a.J;
        p1.l(s2Var);
        s2Var.J(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final List l(String str, String str2) {
        s2 s2Var = this.b;
        p1 p1Var = (p1) s2Var.e;
        m1 m1Var = p1Var.D;
        u0 u0Var = p1Var.C;
        p1.m(m1Var);
        if (m1Var.B()) {
            p1.m(u0Var);
            u0Var.C.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (f.v()) {
            p1.m(u0Var);
            u0Var.C.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = p1Var.D;
        p1.m(m1Var2);
        m1Var2.F(atomicReference, 5000L, "get conditional user properties", new e(s2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return p4.q0(list);
        }
        p1.m(u0Var);
        u0Var.C.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final int m(String str) {
        s2 s2Var = this.b;
        s2Var.getClass();
        x.d(str);
        ((p1) s2Var.e).getClass();
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final String n() {
        return (String) this.b.D.get();
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final String o() {
        return this.b.K();
    }

    @Override // com.google.android.gms.measurement.internal.t2
    public final Map p(String str, String str2, boolean z) {
        s2 s2Var = this.b;
        p1 p1Var = (p1) s2Var.e;
        m1 m1Var = p1Var.D;
        u0 u0Var = p1Var.C;
        p1.m(m1Var);
        if (m1Var.B()) {
            p1.m(u0Var);
            u0Var.C.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (f.v()) {
            p1.m(u0Var);
            u0Var.C.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = p1Var.D;
        p1.m(m1Var2);
        m1Var2.F(atomicReference, 5000L, "get user properties", new i2(s2Var, atomicReference, str, str2, z));
        List<m4> list = (List) atomicReference.get();
        if (list == null) {
            p1.m(u0Var);
            u0Var.C.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        androidx.collection.f fVar = new androidx.collection.f(list.size());
        for (m4 m4Var : list) {
            Object objD = m4Var.d();
            if (objD != null) {
                fVar.put(m4Var.y, objD);
            }
        }
        return fVar;
    }
}
