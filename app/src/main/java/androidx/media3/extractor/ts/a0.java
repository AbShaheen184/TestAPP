package androidx.media3.extractor.ts;

import androidx.media3.common.util.g0;
import androidx.media3.common.util.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements f0 {
    public final z a;
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public a0(z zVar) {
        this.a = zVar;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void a() {
        this.f = true;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void b(int i, androidx.media3.common.util.v vVar) {
        int iZ;
        boolean z = (i & 1) != 0;
        if (z) {
            iZ = vVar.b + vVar.z();
        } else {
            iZ = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            vVar.M(iZ);
            this.d = 0;
        }
        while (vVar.a() > 0) {
            int i2 = this.d;
            androidx.media3.common.util.v vVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = vVar.z();
                    vVar.M(vVar.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(vVar.a(), 3 - this.d);
                vVar.k(vVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    vVar2.M(0);
                    vVar2.L(3);
                    vVar2.N(1);
                    int iZ3 = vVar2.z();
                    int iZ4 = vVar2.z();
                    this.e = (iZ3 & 128) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = vVar2.a;
                    if (bArr.length < i4) {
                        vVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(vVar.a(), this.c - this.d);
                vVar.k(vVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        vVar2.L(i6);
                    } else {
                        if (i0.p(0, vVar2.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        vVar2.L(this.c - 4);
                    }
                    vVar2.M(0);
                    this.a.c(vVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void d(g0 g0Var, androidx.media3.extractor.p pVar, e0 e0Var) {
        this.a.d(g0Var, pVar, e0Var);
        this.f = true;
    }
}
