package androidx.media3.exoplayer.mediacodec;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.media3.decoder.e {
    public long G;
    public int H;
    public int I;

    @Override // androidx.media3.decoder.e
    public final void o() {
        super.o();
        this.H = 0;
    }

    public final boolean s(androidx.media3.decoder.e eVar) {
        ByteBuffer byteBuffer;
        _COROUTINE.a.o(!eVar.e(1073741824));
        _COROUTINE.a.o(!eVar.e(268435456));
        _COROUTINE.a.o(!eVar.e(4));
        if (t()) {
            if (this.H >= this.I) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.B;
            if (byteBuffer2 != null && (byteBuffer = this.B) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.H;
        this.H = i + 1;
        if (i == 0) {
            this.D = eVar.D;
            if (eVar.e(1)) {
                this.y = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.B;
        if (byteBuffer3 != null) {
            q(byteBuffer3.remaining());
            this.B.put(byteBuffer3);
        }
        this.G = eVar.D;
        return true;
    }

    public final boolean t() {
        return this.H > 0;
    }
}
