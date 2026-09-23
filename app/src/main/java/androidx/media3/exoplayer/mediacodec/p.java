package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Exception {
    public final String A;
    public final String e;
    public final boolean y;
    public final o z;

    public p(androidx.media3.common.r rVar, t tVar, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + rVar, tVar, rVar.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public p(String str, Throwable th, String str2, boolean z, o oVar, String str3) {
        super(str, th);
        this.e = str2;
        this.y = z;
        this.z = oVar;
        this.A = str3;
    }
}
