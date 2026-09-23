package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k {
    public int a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putShort(net.luminis.tls.d.pre_shared_key.e);
        byteBufferAllocate.putShort((short) 2);
        byteBufferAllocate.putShort((short) this.a);
        return byteBufferAllocate.array();
    }
}
