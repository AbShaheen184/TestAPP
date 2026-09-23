package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Exception {
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i, int i2, int i3, int i4, androidx.media3.common.r rVar, boolean z, n nVar) {
        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("AudioTrack init failed 0 Config(", ", ", i, ", ", i2);
        sbW.append(i3);
        sbW.append(", ");
        sbW.append(i4);
        sbW.append(") ");
        sbW.append(rVar);
        sbW.append(z ? " (recoverable)" : "");
        super(sbW.toString(), nVar);
        this.e = z;
    }
}
