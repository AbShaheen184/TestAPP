package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {
    public final /* synthetic */ int e;
    public long y;

    public /* synthetic */ d(int i) {
        this.e = i;
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        switch (this.e) {
            case 0:
                net.luminis.quic.log.a aVar = iVar.z;
                toString();
                aVar.getClass();
                return;
            default:
                net.luminis.quic.stream.b bVar = iVar.K;
                synchronized (bVar) {
                    try {
                        long j = this.y;
                        long j2 = bVar.e;
                        if (j > j2) {
                            boolean z = j2 == bVar.f;
                            bVar.e = j;
                            if (z) {
                                for (Map.Entry entry : bVar.j.entrySet()) {
                                    Integer num = (Integer) entry.getKey();
                                    net.luminis.quic.stream.r rVar = (net.luminis.quic.stream.r) entry.getValue();
                                    if (!((Long) bVar.h.get(num)).equals(bVar.g.get(num))) {
                                        num.getClass();
                                        rVar.e.b.i(new net.luminis.quic.stream.p(rVar, 0), 20, rVar.N(), new net.luminis.quic.stream.q(rVar, 0), false);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        int iC;
        switch (this.e) {
            case 0:
                iC = kotlin.coroutines.g.c(this.y);
                break;
            default:
                iC = kotlin.coroutines.g.c(this.y);
                break;
        }
        return iC + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        switch (this.e) {
            case 0:
                byteBuffer.put((byte) 20);
                kotlin.coroutines.g.d(this.y, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 16);
                kotlin.coroutines.g.d(this.y, byteBuffer);
                break;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.y, "]", new StringBuilder("DataBlockedFrame["));
            default:
                return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.y, "]", new StringBuilder("MaxDataFrame["));
        }
    }
}
