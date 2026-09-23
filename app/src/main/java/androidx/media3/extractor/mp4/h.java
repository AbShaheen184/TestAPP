package androidx.media3.extractor.mp4;

import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final h0 a;
    public u d;
    public f e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final androidx.media3.common.r j;
    public boolean m;
    public final t b = new t();
    public final v c = new v();
    public final v k = new v(1);
    public final v l = new v();

    public h(h0 h0Var, u uVar, f fVar, androidx.media3.common.r rVar) {
        this.a = h0Var;
        this.d = uVar;
        this.e = fVar;
        this.j = rVar;
        this.d = uVar;
        this.e = fVar;
        h0Var.e(rVar);
        e();
    }

    public final int a() {
        int i;
        if (this.m) {
            i = this.b.j[this.f] ? 1 : 0;
        } else {
            i = this.d.g[this.f];
        }
        return b() != null ? i | 1073741824 : i;
    }

    public final s b() {
        if (!this.m) {
            return null;
        }
        t tVar = this.b;
        f fVar = tVar.a;
        String str = i0.a;
        int i = fVar.a;
        s sVar = tVar.m;
        if (sVar == null) {
            sVar = this.d.a.l[i];
        }
        if (sVar == null || !sVar.a) {
            return null;
        }
        return sVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        v vVar;
        s sVarB = b();
        if (sVarB == null) {
            return 0;
        }
        int length = sVarB.d;
        t tVar = this.b;
        if (length != 0) {
            vVar = tVar.n;
        } else {
            byte[] bArr = sVarB.e;
            String str = i0.a;
            int length2 = bArr.length;
            v vVar2 = this.l;
            vVar2.K(bArr, length2);
            length = bArr.length;
            vVar = vVar2;
        }
        boolean z = tVar.k && tVar.l[this.f];
        boolean z2 = z || i2 != 0;
        v vVar3 = this.k;
        vVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        vVar3.M(0);
        h0 h0Var = this.a;
        h0Var.b(vVar3, 1, 1);
        h0Var.b(vVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        v vVar4 = this.c;
        if (!z) {
            vVar4.J(8);
            byte[] bArr2 = vVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            h0Var.b(vVar4, 8, 1);
            return length + 9;
        }
        v vVar5 = tVar.n;
        int iG = vVar5.G();
        vVar5.N(-2);
        int i3 = (iG * 6) + 2;
        if (i2 != 0) {
            vVar4.J(i3);
            byte[] bArr3 = vVar4.a;
            vVar5.k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            vVar4 = vVar5;
        }
        h0Var.b(vVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        t tVar = this.b;
        tVar.d = 0;
        tVar.p = 0L;
        tVar.q = false;
        tVar.k = false;
        tVar.o = false;
        tVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
