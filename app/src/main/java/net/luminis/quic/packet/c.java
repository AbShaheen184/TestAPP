package net.luminis.quic.packet;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.StringJoiner;
import net.luminis.quic.impl.n;
import net.luminis.quic.impl.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public byte[] h;

    @Override // net.luminis.quic.packet.g
    public final int a(net.luminis.quic.impl.i iVar, Long l) {
        if (!this.a.equals(iVar.e.a)) {
            n nVar = this.a;
            if (!nVar.equals(iVar.e.a) && nVar.equals(null) && iVar.A == 1) {
                iVar.A = 2;
                o oVar = iVar.e;
                oVar.getClass();
                oVar.a = nVar;
                net.luminis.quic.crypto.d dVar = iVar.B;
                dVar.b(dVar.i);
            }
        }
        net.luminis.quic.cid.b bVar = iVar.Y;
        byte[] bArr = this.g;
        net.luminis.quic.cid.d dVar2 = bVar.f;
        dVar2.a.put(0, new net.luminis.quic.cid.a(bArr, 0, 2));
        dVar2.b = bArr;
        iVar.h(this, l);
        iVar.i0 = true;
        return 1;
    }

    @Override // net.luminis.quic.packet.g
    public final int k() {
        return 1;
    }

    @Override // net.luminis.quic.packet.g
    public final int m() {
        return 1;
    }

    @Override // net.luminis.quic.packet.d
    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((net.luminis.quic.frame.n) it.next()).toString());
        }
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(this.f ? "P" : "");
        sb.append("Initial".charAt(0));
        sb.append("|");
        long j = this.b;
        sb.append(j >= 0 ? Long.valueOf(j) : ".");
        sb.append("|L|");
        int i = this.d;
        sb.append(i >= 0 ? Integer.valueOf(i) : ".");
        sb.append("|");
        sb.append(this.c.size());
        sb.append("  Token=");
        byte[] bArr = this.h;
        sb.append(bArr != null ? kotlin.coroutines.intrinsics.h.c(bArr) : "[]");
        sb.append(" ");
        sb.append(stringJoiner);
        return sb.toString();
    }

    @Override // net.luminis.quic.packet.d
    public final int v() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return 1;
        }
        return bArr.length + 1;
    }

    @Override // net.luminis.quic.packet.d
    public final void w(ByteBuffer byteBuffer) {
        byte[] bArr = this.h;
        if (bArr == null) {
            byteBuffer.put((byte) 0);
        } else {
            kotlin.coroutines.g.e(byteBuffer, bArr.length);
            byteBuffer.put(this.h);
        }
    }

    @Override // net.luminis.quic.packet.d
    public final byte x() {
        return (byte) (this.a.b() ? 1 : 0);
    }

    @Override // net.luminis.quic.packet.d
    public final void y(ByteBuffer byteBuffer) throws net.luminis.quic.impl.e {
        try {
            long jN = kotlin.coroutines.g.n(byteBuffer);
            if (jN > 0) {
                if (jN > byteBuffer.remaining()) {
                    throw new net.luminis.quic.impl.e();
                }
                byte[] bArr = new byte[(int) jN];
                this.h = bArr;
                byteBuffer.get(bArr);
            }
        } catch (net.luminis.quic.generic.a unused) {
            kotlinx.coroutines.future.a.m();
        }
    }
}
