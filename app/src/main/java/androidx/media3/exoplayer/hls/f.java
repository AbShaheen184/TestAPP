package androidx.media3.exoplayer.hls;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.media3.exoplayer.source.chunk.f {
    public byte[] G;
    public volatile boolean H;
    public byte[] I;

    @Override // androidx.media3.exoplayer.upstream.k
    public final void f() {
        try {
            this.F.t(this.y);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.H) {
                byte[] bArr = this.G;
                if (bArr.length < i2 + 16384) {
                    this.G = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.F.read(this.G, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.H) {
                this.I = Arrays.copyOf(this.G, i2);
            }
        } finally {
            com.google.android.gms.dynamite.g.l(this.F);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void i() {
        this.H = true;
    }
}
