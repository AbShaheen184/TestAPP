package net.luminis.tls.extension;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g {
    public List a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        List list = this.a;
        int size = list.size() * 2;
        int i = size + 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(net.luminis.tls.d.signature_algorithms.e);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) (list.size() * 2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((net.luminis.tls.h) it.next()).e);
        }
        return byteBufferAllocate.array();
    }
}
