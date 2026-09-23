package kotlin;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparable {
    public final long e;

    public /* synthetic */ t(long j) {
        this.e = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.c(this.e ^ Long.MIN_VALUE, ((t) obj).e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.e == ((t) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return a.g(10, this.e);
    }
}
