package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends h0, ReadableByteChannel {
    boolean B(long j, i iVar);

    String C(Charset charset);

    long O(g gVar);

    void R(long j);

    InputStream V();

    int W(v vVar);

    f d();

    i l(long j);

    byte[] o();

    long p(i iVar);

    void q(f fVar, long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    String t(long j);
}
