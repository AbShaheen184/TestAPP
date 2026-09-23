package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final h1 c = new h1(0, false);
    public final int a;
    public final boolean b;

    public h1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && this.b == h1Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
