package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends q0 {
    public final com.google.android.material.internal.k d;
    public String e;
    public boolean f;
    public org.jsoup.nodes.b g;
    public final com.google.android.material.internal.k h;
    public final com.google.android.material.internal.k i;
    public boolean j;

    public o0(int i, l3 l3Var) {
        super(i);
        this.d = new com.google.android.material.internal.k(24, false);
        this.f = false;
        int i2 = 24;
        boolean z = false;
        this.h = new com.google.android.material.internal.k(i2, z);
        this.i = new com.google.android.material.internal.k(i2, z);
        this.j = false;
        l3Var.getClass();
    }

    public final void g(char c, int i, int i2) {
        this.i.k(c);
    }

    public final void h(int[] iArr, int i, int i2) {
        for (int i3 : iArr) {
            com.google.android.material.internal.k kVar = this.i;
            StringBuilder sb = (StringBuilder) kVar.z;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) kVar.y) != null) {
                StringBuilder sbB = org.jsoup.internal.k.b();
                kVar.z = sbB;
                sbB.append((String) kVar.y);
                kVar.y = null;
                ((StringBuilder) kVar.z).appendCodePoint(i3);
            } else {
                kVar.y = String.valueOf(Character.toChars(i3));
            }
        }
    }

    public final void i(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        com.google.android.material.internal.k kVar = this.d;
        kVar.l(strReplace);
        this.e = org.jsoup.internal.b.d(kVar.F());
    }

    public final void j(String str) {
        com.google.android.material.internal.k kVar = this.d;
        kVar.C();
        kVar.y = str;
        this.e = org.jsoup.internal.b.d(kVar.F());
    }

    public final void k() {
        String strF;
        if (this.g == null) {
            this.g = new org.jsoup.nodes.b();
        }
        com.google.android.material.internal.k kVar = this.h;
        boolean zT = kVar.t();
        com.google.android.material.internal.k kVar2 = this.i;
        if (zT && this.g.size() < 512) {
            String strTrim = kVar.F().trim();
            if (!strTrim.isEmpty()) {
                if (kVar2.t()) {
                    strF = kVar2.F();
                } else {
                    strF = this.j ? "" : null;
                }
                this.g.c(strTrim, strF);
            }
        }
        kVar.C();
        kVar2.C();
        this.j = false;
    }

    public final String l() {
        String str = this.e;
        if (str == null || str.isEmpty()) {
            throw new org.jsoup.helper.o("Must be false");
        }
        return this.e;
    }

    @Override // org.jsoup.parser.q0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o0 f() {
        this.b = -1;
        this.c = -1;
        this.d.C();
        this.e = null;
        this.f = false;
        this.g = null;
        this.h.C();
        this.i.C();
        this.j = false;
        return this;
    }

    public final String n() {
        String strF = this.d.F();
        return strF.isEmpty() ? "[unset]" : strF;
    }
}
