package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static final boolean b = x2.d;
    public s5 a;

    public static int a(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void c(byte[] bArr, int i, int i2);

    public abstract void d(int i, int i2);

    public abstract void e(int i, int i2);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, long j);

    public abstract void i(int i, long j);

    public abstract void j(int i, boolean z);

    public abstract void k(int i, String str);

    public abstract void l(int i, t0 t0Var);

    public abstract void m(t0 t0Var);

    public abstract void n(byte[] bArr, int i);

    public abstract void o(m0 m0Var);

    public abstract void p(byte b2);

    public abstract void q(int i);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(long j);

    public abstract void u(long j);

    public abstract void v(String str);
}
