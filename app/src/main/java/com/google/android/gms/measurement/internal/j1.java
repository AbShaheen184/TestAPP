package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ m1 b;

    public j1(m1 m1Var, String str) {
        this.b = m1Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        u0 u0Var = ((p1) this.b.e).C;
        p1.m(u0Var);
        u0Var.C.b(th, this.a);
    }
}
