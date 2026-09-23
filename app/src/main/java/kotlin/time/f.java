package kotlin.time;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final long e;

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? a.l(dagger.internal.d.d(j)) : dagger.internal.d.e(e.b(), j);
    }

    public static final long d(long j, long j2) {
        int i = e.b;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? dagger.internal.d.d(j) : dagger.internal.d.e(j, j2);
        }
        if (j != j2) {
            return a.l(dagger.internal.d.d(j2));
        }
        g gVar = a.y;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        return a.e(d(this.e, fVar.e), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.e == ((f) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.e + ')';
    }
}
