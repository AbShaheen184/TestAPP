package net.luminis.quic.crypto;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Exception {
    public final int e;

    public g(int i, boolean z) {
        StringBuilder sb = new StringBuilder("Missing keys for encryption level ");
        sb.append(com.google.android.datatransport.runtime.a.y(i));
        sb.append(z ? " (keys discarded)" : " (keys not installed)");
        super(sb.toString());
        this.e = z ? 2 : 1;
    }
}
