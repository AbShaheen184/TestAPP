package coil3.fetch;

import java.nio.ByteBuffer;
import okio.h0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h0 {
    public final ByteBuffer e;
    public final int y;

    public e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.e = byteBufferSlice;
        this.y = byteBufferSlice.capacity();
    }

    @Override // okio.h0
    public final long K(okio.f fVar, long j) {
        ByteBuffer byteBuffer = this.e;
        int iPosition = byteBuffer.position();
        int i = this.y;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return fVar.write(byteBuffer);
    }

    @Override // okio.h0
    public final j0 e() {
        return j0.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
