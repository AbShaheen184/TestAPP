package androidx.media3.extractor.text.webvtt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final int e;
    public final b y;

    public f(int i, b bVar) {
        this.e = i;
        this.y = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.e, ((f) obj).e);
    }
}
