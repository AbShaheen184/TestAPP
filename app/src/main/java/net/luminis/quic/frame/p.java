package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {
    public int e;
    public long y;
    public long z;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        try {
            net.luminis.quic.stream.n nVar = iVar.W;
            net.luminis.quic.stream.e eVar = (net.luminis.quic.stream.e) nVar.a.get(Integer.valueOf(this.e));
            if (eVar != null) {
                nVar.x = eVar.e.A(this.z) + nVar.x;
            }
        } catch (net.luminis.quic.impl.l e) {
            iVar.e(4, e.e.e, null);
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return kotlin.coroutines.g.c(this.z) + kotlin.coroutines.g.c(this.y) + kotlin.coroutines.g.c(this.e) + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 4);
        kotlin.coroutines.g.e(byteBuffer, this.e);
        kotlin.coroutines.g.d(this.y, byteBuffer);
        kotlin.coroutines.g.d(this.z, byteBuffer);
    }

    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.e = kotlin.coroutines.g.m(byteBuffer);
        this.y = kotlin.coroutines.g.n(byteBuffer);
        this.z = kotlin.coroutines.g.n(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResetStreamFrame[");
        sb.append(this.e);
        sb.append("|");
        sb.append(this.y);
        sb.append("|");
        return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.z, "]", sb);
    }
}
