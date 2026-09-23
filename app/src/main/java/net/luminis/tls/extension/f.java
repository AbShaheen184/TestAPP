package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public Long a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        Long l = this.a;
        int i = l == null ? 0 : 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(net.luminis.tls.d.early_data.e);
        byteBufferAllocate.putShort((short) i);
        if (l != null) {
            byteBufferAllocate.putInt((int) l.longValue());
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        String str;
        Long l = this.a;
        if (l == null) {
            str = "(empty)";
        } else {
            str = "[" + l + "]";
        }
        return "EarlyDataExtension ".concat(str);
    }
}
