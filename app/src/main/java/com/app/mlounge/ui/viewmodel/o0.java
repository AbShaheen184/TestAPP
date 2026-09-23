package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public final String a;
    public final n0 b;
    public final int c;

    public o0(String str, n0 n0Var, int i) {
        str.getClass();
        this.a = str;
        this.b = n0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.l.a(this.a, o0Var.a) && this.b == o0Var.b && this.c == o0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderStatus(name=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", streamCount=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.c, ")", sb);
    }
}
