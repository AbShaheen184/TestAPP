package androidx.media3.extractor.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {
    public final long e;
    public final byte[] y;

    public g(long j, byte[] bArr) {
        this.e = j;
        this.y = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.e, ((g) obj).e);
    }
}
