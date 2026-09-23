package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Comparable {
    public final int A;
    public final long B;
    public final androidx.media3.common.m C;
    public final String D;
    public final String E;
    public final long F;
    public final long G;
    public final boolean H;
    public final String e;
    public final j y;
    public final long z;

    public k(String str, j jVar, long j, int i, long j2, androidx.media3.common.m mVar, String str2, String str3, long j3, long j4, boolean z) {
        this.e = str;
        this.y = jVar;
        this.z = j;
        this.A = i;
        this.B = j2;
        this.C = mVar;
        this.D = str2;
        this.E = str3;
        this.F = j3;
        this.G = j4;
        this.H = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.B;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
