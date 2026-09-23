package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public abstract byte[] a();

    public final int b(ByteBuffer byteBuffer, int i, int i2) throws net.luminis.tls.alert.a {
        if (byteBuffer.limit() - byteBuffer.position() < 4) {
            kotlinx.coroutines.future.a.g("extension underflow");
            return 0;
        }
        if ((byteBuffer.getShort() & 65535) != i) {
            org.mozilla.javascript.c.a();
            return 0;
        }
        int i3 = byteBuffer.getShort() & 65535;
        if (i3 >= i2) {
            if (byteBuffer.limit() - byteBuffer.position() >= i3) {
                return i3;
            }
            kotlinx.coroutines.future.a.g("extension underflow");
            return 0;
        }
        throw new net.luminis.tls.alert.a(getClass().getSimpleName() + " can't be less than " + i2 + " bytes", 2);
    }
}
