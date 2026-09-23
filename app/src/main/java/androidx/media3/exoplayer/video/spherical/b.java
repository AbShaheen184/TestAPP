package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.r;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.media3.exoplayer.a {
    public final androidx.media3.decoder.e P;
    public final v Q;
    public a R;
    public long S;

    public b() {
        super(6);
        this.P = new androidx.media3.decoder.e(1);
        this.Q = new v();
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(r rVar) {
        return "application/x-camera-motion".equals(rVar.o) ? androidx.media3.exoplayer.a.f(4, 0, 0, 0) : androidx.media3.exoplayer.a.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.R = (a) obj;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        return l();
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void p() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) {
        this.S = Long.MIN_VALUE;
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.S < 100000 + j) {
            androidx.media3.decoder.e eVar = this.P;
            eVar.o();
            androidx.localbroadcastmanager.content.b bVar = this.z;
            bVar.p();
            if (y(bVar, eVar, 0) != -4 || eVar.e(4)) {
                return;
            }
            long j3 = eVar.D;
            this.S = j3;
            boolean z = j3 < this.I;
            if (this.R != null && !z) {
                eVar.r();
                ByteBuffer byteBuffer = eVar.B;
                String str = i0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    v vVar = this.Q;
                    vVar.K(bArrArray, iLimit);
                    vVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(vVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.R.a(this.S - this.H, fArr);
                }
            }
        }
    }
}
