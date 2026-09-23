package androidx.media3.exoplayer.dash;

import androidx.media3.common.r;
import androidx.media3.common.util.i0;
import androidx.media3.exoplayer.source.x0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements x0 {
    public boolean A;
    public androidx.media3.exoplayer.dash.manifest.g B;
    public boolean C;
    public int D;
    public final r e;
    public long[] z;
    public final androidx.localbroadcastmanager.content.b y = new androidx.localbroadcastmanager.content.b(18);
    public long E = -9223372036854775807L;

    public n(androidx.media3.exoplayer.dash.manifest.g gVar, r rVar, boolean z) {
        this.e = rVar;
        this.B = gVar;
        this.z = gVar.b;
        c(gVar, z);
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        return true;
    }

    public final void c(androidx.media3.exoplayer.dash.manifest.g gVar, boolean z) {
        int i = this.D;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.z[i - 1];
        this.A = z;
        this.B = gVar;
        long[] jArr = gVar.b;
        this.z = jArr;
        long j3 = this.E;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.D = i0.b(jArr, j2, false);
            }
        } else {
            int iB = i0.b(jArr, j3, true);
            this.D = iB;
            if (this.A && iB == this.z.length) {
                j = j3;
            }
            this.E = j;
        }
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        int i2 = this.D;
        boolean z = i2 == this.z.length;
        if (z && !this.A) {
            eVar.y = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.C) {
            bVar.z = this.e;
            this.C = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.D = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrS = this.y.s(this.B.a[i2]);
            eVar.q(bArrS.length);
            eVar.B.put(bArrS);
        }
        eVar.D = this.z[i2];
        eVar.y = 1;
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        int iMax = Math.max(this.D, i0.b(this.z, j, true));
        int i = iMax - this.D;
        this.D = iMax;
        return i;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() {
    }
}
