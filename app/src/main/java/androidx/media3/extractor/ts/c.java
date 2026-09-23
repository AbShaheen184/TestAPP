package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.extractor.n {
    public final b a = new b(null, 0, "audio/ac4", 1);
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(16384);
    public boolean c;

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        androidx.media3.extractor.k kVar;
        int i;
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(10);
        int i2 = 0;
        while (true) {
            kVar = (androidx.media3.extractor.k) oVar;
            kVar.e(vVar.a, 0, 10, false);
            vVar.M(0);
            if (vVar.C() != 4801587) {
                break;
            }
            vVar.N(3);
            int iY = vVar.y();
            i2 += iY + 10;
            kVar.a(iY, false);
        }
        kVar.C = 0;
        kVar.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            kVar.e(vVar.a, 0, 7, false);
            vVar.M(0);
            int iG = vVar.G();
            if (iG == 44096 || iG == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iG == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                kVar.a(i - 7, false);
            } else {
                kVar.C = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                kVar.a(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        androidx.media3.common.util.v vVar = this.b;
        int i = oVar.read(vVar.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        vVar.M(0);
        vVar.L(i);
        boolean z = this.c;
        b bVar = this.a;
        if (!z) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(vVar);
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        this.a.f(pVar, new e0(0, 1));
        pVar.r();
        pVar.h(new androidx.media3.extractor.s(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
