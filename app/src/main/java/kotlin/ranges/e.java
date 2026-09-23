package kotlin.ranges;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, kotlin.jvm.internal.markers.a {
    public long A;
    public final long e;
    public final long y;
    public boolean z;

    public e(long j, long j2, long j3) {
        this.e = j3;
        this.y = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.z = z;
        this.A = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.A;
        if (j != this.y) {
            this.A = this.e + j;
            return j;
        }
        if (this.z) {
            this.z = false;
            return j;
        }
        org.mozilla.javascript.typedarrays.c.a();
        return 0L;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
