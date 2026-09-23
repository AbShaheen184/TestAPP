package androidx.compose.ui.node;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.compose.ui.unit.c {
    public final /* synthetic */ n0 A;
    public boolean e;
    public long y = 9223372034707292159L;
    public long z = 0;

    public k0(n0 n0Var) {
        this.A = n0Var;
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.A.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.A.a();
    }

    public final androidx.compose.ui.layout.x b() {
        this.e = true;
        n0 n0Var = this.A;
        androidx.compose.ui.layout.x xVarY0 = n0Var.y0();
        if (androidx.compose.ui.unit.j.a(this.y, 9223372034707292159L)) {
            this.y = androidx.room.t.F(xVarY0.E(0L));
            this.z = xVarY0.u();
        }
        n0Var.B0().e0.b();
        return xVarY0;
    }

    public final void c(androidx.compose.ui.layout.p pVar, float f) {
        n0 n0Var = this.A;
        androidx.appcompat.widget.o oVar = n0Var.J;
        if (oVar == null) {
            oVar = new androidx.appcompat.widget.o();
            n0Var.J = oVar;
        }
        int iW = kotlin.collections.o.w(pVar, (androidx.compose.ui.layout.p[]) oVar.b);
        if (iW >= 0) {
            float[] fArr = (float[]) oVar.c;
            if (fArr[iW] != f) {
                fArr[iW] = f;
                ((byte[]) oVar.d)[iW] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) oVar.d;
                if (bArr[iW] == 2) {
                    bArr[iW] = 0;
                    return;
                }
                return;
            }
        }
        int i = oVar.a;
        androidx.compose.ui.layout.p[] pVarArr = (androidx.compose.ui.layout.p[]) oVar.b;
        if (i == pVarArr.length) {
            int i2 = i * 2;
            oVar.b = (androidx.compose.ui.layout.p[]) Arrays.copyOf(pVarArr, i2);
            oVar.c = Arrays.copyOf((float[]) oVar.c, i2);
            oVar.d = Arrays.copyOf((byte[]) oVar.d, i2);
        }
        ((androidx.compose.ui.layout.p[]) oVar.b)[i] = pVar;
        ((byte[]) oVar.d)[i] = 3;
        ((float[]) oVar.c)[i] = f;
        oVar.a++;
    }
}
