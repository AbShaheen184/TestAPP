package kotlin.ranges;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public static final d A = new d(1, 0, 1);

    @Override // kotlin.ranges.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.e == dVar.e && this.y == dVar.y;
    }

    @Override // kotlin.ranges.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.y;
    }

    @Override // kotlin.ranges.b
    public final boolean isEmpty() {
        return this.e > this.y;
    }

    @Override // kotlin.ranges.b
    public final String toString() {
        return this.e + ".." + this.y;
    }
}
