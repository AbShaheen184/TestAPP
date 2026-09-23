package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.extractor.n {
    public final b a = new b("audio/ac3");
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(2786);
    public boolean c;

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        androidx.media3.extractor.k kVar;
        int iE;
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(10);
        int i = 0;
        while (true) {
            kVar = (androidx.media3.extractor.k) oVar;
            kVar.e(vVar.a, 0, 10, false);
            vVar.M(0);
            if (vVar.C() != 4801587) {
                break;
            }
            vVar.N(3);
            int iY = vVar.y();
            i += iY + 10;
            kVar.a(iY, false);
        }
        kVar.C = 0;
        kVar.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            kVar.e(vVar.a, 0, 6, false);
            vVar.M(0);
            if (vVar.G() != 2935) {
                kVar.C = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                kVar.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 6) {
                    iE = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iE = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iE = androidx.media3.extractor.b.e((b & 192) >> 6, b & 63);
                }
                if (iE == -1) {
                    break;
                }
                kVar.a(iE - 6, false);
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
        int i = oVar.read(vVar.a, 0, 2786);
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
