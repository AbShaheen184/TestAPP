package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public abstract void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l);

    public abstract int d();

    public boolean e() {
        return !(this instanceof a);
    }

    public abstract void f(ByteBuffer byteBuffer);
}
