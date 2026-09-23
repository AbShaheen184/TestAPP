package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public long S;
    public long T;
    public final p1 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public Boolean q;
    public long r;
    public ArrayList s;
    public String t;
    public boolean u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public Long z;

    public z0(p1 p1Var, String str) {
        com.google.android.gms.common.internal.x.g(p1Var);
        com.google.android.gms.common.internal.x.d(str);
        this.a = p1Var;
        this.b = str;
        m1 m1Var = p1Var.D;
        p1.m(m1Var);
        m1Var.v();
    }

    public final void A(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.v != j;
        this.v = j;
    }

    public final void B(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.w != j;
        this.w = j;
    }

    public final void C(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.B != j;
        this.B = j;
    }

    public final String D() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.C;
    }

    public final String E() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.b;
    }

    public final String F() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.c;
    }

    public final void G(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.c, str);
        this.c = str;
    }

    public final String H() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.d;
    }

    public final void I(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= true ^ Objects.equals(this.d, str);
        this.d = str;
    }

    public final void J(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.e, str);
        this.e = str;
    }

    public final String K() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.f;
    }

    public final void L(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final void M(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.h != j;
        this.h = j;
    }

    public final void N(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.i != j;
        this.i = j;
    }

    public final String O() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.j;
    }

    public final void P(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long Q() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.k;
    }

    public final void R(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.k != j;
        this.k = j;
    }

    public final void S(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.l, str);
        this.l = str;
    }

    public final void T(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.m != j;
        this.m = j;
    }

    public final void a(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.n != j;
        this.n = j;
    }

    public final long b() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.r;
    }

    public final void c(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.r != j;
        this.r = j;
    }

    public final void d(boolean z) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.o != z;
        this.o = z;
    }

    public final void e(long j) {
        com.google.android.gms.common.internal.x.b(j >= 0);
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.g != j;
        this.g = j;
    }

    public final void f(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.S != j;
        this.S = j;
    }

    public final void g(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.T != j;
        this.T = j;
    }

    public final void h(long j) {
        p1 p1Var = this.a;
        m1 m1Var = p1Var.D;
        u0 u0Var = p1Var.C;
        p1.m(m1Var);
        m1Var.v();
        long j2 = this.g + j;
        String str = this.b;
        if (j2 > 2147483647L) {
            p1.m(u0Var);
            u0Var.F.b(u0.D(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.F + 1;
        if (j3 > 2147483647L) {
            p1.m(u0Var);
            u0Var.F.b(u0.D(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.R = true;
        this.g = j2;
        this.F = j3;
    }

    public final void i(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.K != j;
        this.K = j;
    }

    public final void j(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.L != j;
        this.L = j;
    }

    public final void k(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.M != j;
        this.M = j;
    }

    public final void l(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.N != j;
        this.N = j;
    }

    public final void m(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.P != j;
        this.P = j;
    }

    public final void n(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.O != j;
        this.O = j;
    }

    public final boolean o() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.R;
    }

    public final void p(int i) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.D != i;
        this.D = i;
    }

    public final void q(int i) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.E != i;
        this.E = i;
    }

    public final void r(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.F != j;
        this.F = j;
    }

    public final String s() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.G;
    }

    public final int t() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.I;
    }

    public final void u(long j) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= this.J != j;
        this.J = j;
    }

    public final String v() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        String str = this.Q;
        w(null);
        return str;
    }

    public final void w(String str) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        this.R |= !Objects.equals(this.Q, str);
        this.Q = str;
    }

    public final Boolean x() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.q;
    }

    public final void y(List list) {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        if (Objects.equals(this.s, list)) {
            return;
        }
        this.R = true;
        this.s = list != null ? new ArrayList(list) : null;
    }

    public final boolean z() {
        m1 m1Var = this.a.D;
        p1.m(m1Var);
        m1Var.v();
        return this.u;
    }
}
