package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n {
    public byte[] e;

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return kotlin.coroutines.g.c(this.e.length) + 1 + this.e.length;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        kotlin.coroutines.g.e(byteBuffer, this.e.length);
        byteBuffer.put(this.e);
    }

    public final void g(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) {
        byteBuffer.get();
        byte[] bArr = new byte[kotlin.coroutines.g.m(byteBuffer)];
        this.e = bArr;
        byteBuffer.get(bArr);
        aVar.getClass();
    }

    public final String toString() {
        return "NewTokenFrame[" + kotlin.coroutines.intrinsics.h.c(this.e) + "]";
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
    }
}
