package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n {
    public int y;
    public byte[] z = new byte[0];
    public int A = -1;
    public int B = 28;
    public long e = 0;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        int iK = gVar.k();
        if (com.google.android.datatransport.runtime.a.a(iVar.L)) {
            return;
        }
        int i = this.B;
        if ((i != 28 || this.e == 0) && (i != 29 || this.e == 0)) {
            net.luminis.quic.log.a aVar = iVar.z;
            iVar.toString();
            aVar.getClass();
        } else {
            net.luminis.quic.log.a aVar2 = iVar.z;
            iVar.toString();
            net.luminis.quic.impl.i.c(this);
            aVar2.getClass();
            if (iVar.L == 2) {
                iVar.m0 = "Server closed connection: ".concat(net.luminis.quic.impl.i.c(this));
            }
        }
        iVar.T.i();
        iVar.W.a();
        net.luminis.quic.impl.n nVar = iVar.e.a;
        iVar.T.f(new b(), iK, net.luminis.quic.send.k.z);
        iVar.L = 5;
        try {
            iVar.N.schedule(new net.luminis.quic.impl.h(iVar, 4), iVar.T.d() * 3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return kotlin.coroutines.g.c(this.z.length) + kotlin.coroutines.g.c(0L) + kotlin.coroutines.g.c(this.e) + 1 + this.z.length;
    }

    @Override // net.luminis.quic.frame.n
    public final boolean e() {
        return false;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 28);
        kotlin.coroutines.g.d(this.e, byteBuffer);
        kotlin.coroutines.g.e(byteBuffer, 0);
        kotlin.coroutines.g.e(byteBuffer, this.z.length);
        byteBuffer.put(this.z);
    }

    public final void g(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        this.B = i;
        if (i != 28 && i != 29) {
            kotlinx.coroutines.future.a.a();
            return;
        }
        this.e = kotlin.coroutines.g.n(byteBuffer);
        if (this.B == 28) {
            this.y = kotlin.coroutines.g.m(byteBuffer);
        }
        int iM = kotlin.coroutines.g.m(byteBuffer);
        if (iM > 0) {
            byte[] bArr = new byte[iM];
            this.z = bArr;
            byteBuffer.get(bArr);
        }
        if (this.B == 28) {
            long j = this.e;
            if (j < 256 || j >= 512) {
                return;
            }
            this.A = (int) (j - 256);
        }
    }

    public final String toString() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder("ConnectionCloseFrame[");
        if (this.A != -1) {
            objValueOf = "TLS " + this.A;
        } else {
            objValueOf = Long.valueOf(this.e);
        }
        sb.append(objValueOf);
        sb.append("|");
        sb.append(this.y);
        sb.append("|");
        byte[] bArr = this.z;
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, bArr != null ? new String(bArr) : "-", "]");
    }
}
