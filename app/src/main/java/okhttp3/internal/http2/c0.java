package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends IOException {
    public final b e;

    public c0(b bVar) {
        super("stream was reset: " + bVar);
        this.e = bVar;
    }
}
