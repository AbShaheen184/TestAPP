package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f = this.a;
        return (0.0f > f && 0.0f > ((a) obj).a) || f == ((a) obj).a;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
