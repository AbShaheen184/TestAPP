package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {
    public final String a;
    public int b;
    public final p3 c;

    public h2(String str, int i, p3 p3Var) {
        this.a = str;
        this.b = i;
        this.c = p3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return kotlin.jvm.internal.l.a(this.a, h2Var.a) && this.b == h2Var.b && this.c.equals(h2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Message(id=" + ((Object) ("MessageId(value=" + this.a + ')')) + ", streamId=" + this.b + ", event=" + this.c + ')';
    }
}
