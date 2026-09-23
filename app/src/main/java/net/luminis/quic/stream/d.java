package net.luminis.quic.stream;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        throw new IOException("Stream is not writable");
    }

    @Override // net.luminis.quic.stream.o
    public final void a() {
    }

    @Override // net.luminis.quic.stream.o
    public final void g(long j) {
    }
}
