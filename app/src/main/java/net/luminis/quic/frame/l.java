package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n {
    public byte[] e;

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return 9;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 27);
        byteBuffer.put(this.e);
    }

    public final String toString() {
        return "PathResponseFrame[" + kotlin.coroutines.intrinsics.h.c(this.e) + "]";
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
    }
}
