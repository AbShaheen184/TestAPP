package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Exception {
    public final int e;
    public final boolean y;

    public i(int i, boolean z) {
        super(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "AudioOutput write failed: "));
        this.y = z;
        this.e = i;
    }
}
