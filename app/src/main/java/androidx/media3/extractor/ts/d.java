package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.media3.extractor.n {
    public final androidx.media3.common.util.v c;
    public final androidx.media3.common.util.u d;
    public androidx.media3.extractor.p e;
    public long f;
    public boolean h;
    public boolean i;
    public final e a = new e(0, null, "audio/mp4a-latm", true);
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(2048);
    public long g = -1;

    public d(int i) {
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(10);
        this.c = vVar;
        byte[] bArr = vVar.a;
        this.d = new androidx.media3.common.util.u(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        int i = 0;
        while (true) {
            androidx.media3.common.util.v vVar = this.c;
            oVar.w(vVar.a, 0, 10);
            vVar.M(0);
            if (vVar.C() != 4801587) {
                break;
            }
            vVar.N(3);
            int iY = vVar.y();
            i += iY + 10;
            oVar.g(iY);
        }
        oVar.n();
        oVar.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            androidx.media3.common.util.v vVar2 = this.c;
            androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) oVar;
            kVar.e(vVar2.a, 0, 2, false);
            vVar2.M(0);
            if ((vVar2.G() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                kVar.e(vVar2.a, 0, 4, false);
                androidx.media3.common.util.u uVar = this.d;
                uVar.m(14);
                int iG = uVar.g(13);
                if (iG <= 6) {
                    i2++;
                    kVar.C = 0;
                    kVar.a(i2, false);
                } else {
                    kVar.a(iG - 6, false);
                    i4 += iG;
                }
            } else {
                i2++;
                kVar.C = 0;
                kVar.a(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        this.e.getClass();
        oVar.getLength();
        androidx.media3.common.util.v vVar = this.b;
        int i = oVar.read(vVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.h(new androidx.media3.extractor.s(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        vVar.M(0);
        vVar.L(i);
        boolean z2 = this.h;
        e eVar = this.a;
        if (!z2) {
            eVar.u = this.f;
            this.h = true;
        }
        eVar.c(vVar);
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        this.e = pVar;
        this.a.f(pVar, new e0(0, 1));
        pVar.r();
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
