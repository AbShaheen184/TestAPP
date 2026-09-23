package kotlin;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {
    public final int e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e ^ Integer.MIN_VALUE, ((r) obj).e ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.e == ((r) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(((long) this.e) & 4294967295L);
    }
}
