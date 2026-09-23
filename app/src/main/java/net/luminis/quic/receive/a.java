package net.luminis.quic.receive;

import java.net.DatagramPacket;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Long a;
    public final ByteBuffer b;

    public a(DatagramPacket datagramPacket, Long l) {
        this.a = l;
        this.b = ByteBuffer.wrap(datagramPacket.getData(), 0, datagramPacket.getLength());
    }
}
