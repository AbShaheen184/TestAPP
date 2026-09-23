package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends t1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final t e;

    public e1(String str, String str2, int i, int i2, t tVar) {
        super(str);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.l.a(this.a, e1Var.a) && kotlin.jvm.internal.l.a(this.b, e1Var.b) && this.c == e1Var.c && this.d == e1Var.d && this.e == e1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((androidx.constraintlayout.core.g.e(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Connect(proxyId=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", port=");
        sb.append(this.c);
        sb.append(", protocol=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "TCP";
        } else {
            str = "UDP";
        }
        sb.append(str);
        sb.append(", ipType=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
