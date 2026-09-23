package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final b0 a;
    public final b0 b;

    public z(b0 b0Var, b0 b0Var2) {
        this.a = b0Var;
        this.b = b0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.a.equals(zVar.a) && this.b.equals(zVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        b0 b0Var = this.a;
        sb.append(b0Var);
        b0 b0Var2 = this.b;
        if (b0Var.equals(b0Var2)) {
            str = "";
        } else {
            str = ", " + b0Var2;
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, str, "]");
    }
}
