package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends q0 {
    public static final String e = String.valueOf((char) 0);
    public final com.google.android.material.internal.k d;

    public i0(i0 i0Var) {
        super(5);
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(24, false);
        this.d = kVar;
        this.b = i0Var.b;
        this.c = i0Var.c;
        String strF = i0Var.d.F();
        kVar.C();
        kVar.y = strF;
    }

    @Override // org.jsoup.parser.q0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.C();
    }

    public String toString() {
        return this.d.F();
    }

    public i0() {
        super(5);
        this.d = new com.google.android.material.internal.k(24, false);
    }
}
