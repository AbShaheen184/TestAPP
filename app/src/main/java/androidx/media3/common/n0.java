package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final o a;

    public n0(o oVar) {
        this.a = oVar;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return this.a.equals(((n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
