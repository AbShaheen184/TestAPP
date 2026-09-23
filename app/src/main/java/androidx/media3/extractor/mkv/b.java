package androidx.media3.extractor.mkv;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {
    public final long e;
    public final long y;
    public final long z;

    public b(long j, long j2, long j3) {
        this.e = j;
        this.y = j2;
        this.z = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.e, ((b) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.e == bVar.e && this.y == bVar.y && this.z == bVar.z;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.e), Long.valueOf(this.y), Long.valueOf(this.z));
    }
}
