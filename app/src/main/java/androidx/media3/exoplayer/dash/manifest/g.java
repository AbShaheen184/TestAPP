package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final androidx.media3.extractor.metadata.emsg.a[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public g(String str, String str2, long[] jArr, androidx.media3.extractor.metadata.emsg.a[] aVarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = aVarArr;
    }

    public final String a() {
        return this.c + "/" + this.d;
    }
}
