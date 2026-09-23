package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends q0 {
    public final com.google.android.material.internal.k d;

    public j0() {
        super(4);
        this.d = new com.google.android.material.internal.k(24, false);
    }

    @Override // org.jsoup.parser.q0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.C();
    }

    public final void g(char c) {
        this.d.k(c);
    }

    public final String toString() {
        return "<!--" + this.d.F() + "-->";
    }
}
