package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends n {
    public int e;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.cid.b bVar = iVar.Y;
        byte[] bArrJ = gVar.j();
        bVar.getClass();
        int i = this.e;
        boolean z = false;
        Integer num = null;
        for (Integer num2 : bVar.e.a.keySet()) {
            if (!z || num2.compareTo(num) > 0) {
                z = true;
                num = num2;
            }
        }
        if (i > (z ? num.intValue() : -1)) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "invalid connection ID sequence number");
            return;
        }
        int i2 = this.e;
        if (Arrays.equals(((net.luminis.quic.cid.a) bVar.e.a.get(Integer.valueOf(i2))).b, bArrJ)) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "cannot retire current connection ID");
        } else if (bVar.e.c(i2) != null) {
            bVar.b.getClass();
            if (bVar.e.b().size() < bVar.i) {
                bVar.a();
            }
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return kotlin.coroutines.g.c(this.e) + 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).e == this.e;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 25);
        kotlin.coroutines.g.e(byteBuffer, this.e);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.e, "]", new StringBuilder("RetireConnectionIdFrame["));
    }
}
