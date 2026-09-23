package androidx.media3.extractor;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h0 {
    public final byte[] a = new byte[4096];

    @Override // androidx.media3.extractor.h0
    public final void b(androidx.media3.common.util.v vVar, int i, int i2) {
        vVar.N(i);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = iVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
    }
}
