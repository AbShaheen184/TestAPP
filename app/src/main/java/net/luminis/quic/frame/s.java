package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends n {
    public boolean e;
    public long y;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.log.a aVar = iVar.z;
        toString();
        aVar.getClass();
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return kotlin.coroutines.g.c(this.y) + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put(this.e ? (byte) 22 : (byte) 23);
        kotlin.coroutines.g.d(this.y, byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamsBlockedFrame[");
        sb.append(this.e ? "B" : "U");
        sb.append("|");
        return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.y, "]", sb);
    }
}
