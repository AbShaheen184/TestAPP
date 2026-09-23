package okio;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface g extends f0, WritableByteChannel {
    g J(i iVar);

    g S(long j);

    f d();

    @Override // okio.f0, java.io.Flushable
    void flush();

    g w(byte[] bArr, int i);

    g write(byte[] bArr);

    g writeByte(int i);

    g writeInt(int i);

    g writeShort(int i);

    g y(String str);
}
