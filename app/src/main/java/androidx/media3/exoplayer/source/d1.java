package androidx.media3.exoplayer.source;

import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements androidx.media3.exoplayer.upstream.k {
    public final androidx.media3.datasource.l e;
    public final androidx.media3.datasource.y y;
    public byte[] z;

    public d1(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar) {
        n.b.getAndIncrement();
        this.e = lVar;
        this.y = new androidx.media3.datasource.y(hVar);
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void f() {
        androidx.media3.datasource.y yVar = this.y;
        yVar.y = 0L;
        try {
            yVar.t(this.e);
            int i = 0;
            while (i != -1) {
                int i2 = (int) yVar.y;
                byte[] bArr = this.z;
                if (bArr == null) {
                    this.z = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                } else if (i2 == bArr.length) {
                    this.z = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.z;
                i = yVar.read(bArr2, i2, bArr2.length - i2);
            }
        } finally {
            com.google.android.gms.dynamite.g.l(yVar);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void i() {
    }
}
