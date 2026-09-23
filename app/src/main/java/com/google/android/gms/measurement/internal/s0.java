package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ u0 d;

    public s0(u0 u0Var, int i, boolean z, boolean z2) {
        this.d = u0Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.E(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.E(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.E(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
