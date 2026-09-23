package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends q0 {
    public final com.google.android.material.internal.k d;
    public String e;
    public final com.google.android.material.internal.k f;
    public final com.google.android.material.internal.k g;
    public final com.google.android.material.internal.k h;
    public boolean i;
    public boolean j;

    public k0() {
        super(1);
        int i = 24;
        boolean z = false;
        this.d = new com.google.android.material.internal.k(i, z);
        this.e = null;
        this.f = new com.google.android.material.internal.k(i, z);
        this.g = new com.google.android.material.internal.k(i, z);
        this.h = new com.google.android.material.internal.k(i, z);
        this.i = false;
        this.j = false;
    }

    @Override // org.jsoup.parser.q0
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.C();
        this.e = null;
        this.f.C();
        this.g.C();
        this.h.C();
        this.i = false;
        this.j = false;
    }

    public final String toString() {
        return "<!doctype " + this.d.F() + ">";
    }
}
