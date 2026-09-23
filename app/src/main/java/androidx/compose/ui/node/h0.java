package androidx.compose.ui.node;

import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements androidx.compose.ui.graphics.drawscope.d {
    public final androidx.compose.ui.graphics.drawscope.b e = new androidx.compose.ui.graphics.drawscope.b();
    public n y;

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void A(long j, float f, long j2, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.e.A(j, f, j2, eVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final long H(float f) {
        return this.e.H(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float M(int i) {
        return this.e.M(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float P(float f) {
        return f / this.e.a();
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.e.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float W(float f) {
        return this.e.a() * f;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    public final void b() {
        androidx.compose.ui.graphics.drawscope.b bVar = this.e;
        androidx.compose.ui.graphics.r rVarV = bVar.y.v();
        j jVar = this.y;
        if (jVar == null) {
            throw androidx.compose.runtime.j.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) jVar;
        androidx.compose.ui.q qVarE = qVar.e.C;
        if (qVarE != null && (qVarE.A & 4) != 0) {
            while (true) {
                if (qVarE != null) {
                    int i = qVarE.z;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            qVarE = qVarE.C;
                        }
                    }
                }
                qVarE = null;
                break;
            }
        } else {
            qVarE = null;
            break;
        }
        if (qVarE == null) {
            d1 d1VarT = l.t(jVar, 4);
            if (d1VarT.U0() == qVar.e) {
                d1VarT = d1VarT.M;
                d1VarT.getClass();
            }
            d1VarT.j1(rVarV, (androidx.compose.ui.graphics.layer.b) bVar.y.z);
            return;
        }
        androidx.compose.runtime.collection.b bVar2 = null;
        while (qVarE != null) {
            if (qVarE instanceof n) {
                n nVar = (n) qVarE;
                androidx.compose.ui.graphics.layer.b bVar3 = (androidx.compose.ui.graphics.layer.b) bVar.y.z;
                d1 d1VarT2 = l.t(nVar, 4);
                long jF = coil3.network.g.F(d1VarT2.z);
                f0 f0Var = d1VarT2.L;
                f0Var.getClass();
                ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSharedDrawScope().c(rVarV, jF, d1VarT2, nVar, bVar3);
            } else if ((qVarE.z & 4) != 0 && (qVarE instanceof k)) {
                int i2 = 0;
                for (androidx.compose.ui.q qVar2 = ((k) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                    if ((qVar2.z & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            qVarE = qVar2;
                        } else {
                            if (bVar2 == null) {
                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                            }
                            if (qVarE != null) {
                                bVar2.b(qVarE);
                                qVarE = null;
                            }
                            bVar2.b(qVar2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            qVarE = l.e(bVar2);
        }
    }

    public final void c(androidx.compose.ui.graphics.r rVar, long j, d1 d1Var, n nVar, androidx.compose.ui.graphics.layer.b bVar) {
        n nVar2 = this.y;
        this.y = nVar;
        androidx.compose.ui.unit.m mVar = d1Var.L.X;
        androidx.compose.ui.graphics.drawscope.b bVar2 = this.e;
        c2 c2Var = bVar2.y;
        androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
        androidx.compose.ui.unit.c cVar = aVar.a;
        androidx.compose.ui.unit.m mVar2 = aVar.b;
        androidx.compose.ui.graphics.r rVarV = c2Var.v();
        c2 c2Var2 = bVar2.y;
        long jG = c2Var2.G();
        androidx.compose.ui.graphics.layer.b bVar3 = (androidx.compose.ui.graphics.layer.b) c2Var2.z;
        c2Var2.Z(d1Var);
        c2Var2.a0(mVar);
        c2Var2.Y(rVar);
        c2Var2.b0(j);
        c2Var2.z = bVar;
        rVar.f();
        try {
            nVar.X(this);
            rVar.q();
            c2Var2.Z(cVar);
            c2Var2.a0(mVar2);
            c2Var2.Y(rVarV);
            c2Var2.b0(jG);
            c2Var2.z = bVar3;
            this.y = nVar2;
        } catch (Throwable th) {
            rVar.q();
            c2Var2.Z(cVar);
            c2Var2.a0(mVar2);
            c2Var2.Y(rVarV);
            c2Var2.b0(jG);
            c2Var2.z = bVar3;
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final c2 c0() {
        return this.e.y;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final long d() {
        return this.e.d();
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void e(androidx.compose.ui.graphics.j jVar, androidx.compose.ui.graphics.p pVar, float f, androidx.compose.ui.graphics.drawscope.e eVar, int i) {
        this.e.e(jVar, pVar, f, eVar, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void e0(androidx.compose.ui.graphics.j jVar, long j, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.e.e0(jVar, j, eVar);
    }

    public final void f(androidx.compose.ui.graphics.p pVar, long j, long j2, float f, androidx.compose.ui.graphics.drawscope.e eVar) {
        androidx.compose.ui.graphics.drawscope.b bVar = this.e;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        bVar.e.c.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)), bVar.c(pVar, eVar, f, null, 3, 1));
    }

    @Override // androidx.compose.ui.unit.c
    public final int f0(long j) {
        return this.e.f0(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.e.e.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void h(androidx.compose.ui.graphics.g gVar, long j, long j2, long j3, float f, androidx.compose.ui.graphics.m mVar, int i) {
        this.e.h(gVar, j, j2, j3, f, mVar, i);
    }

    @Override // androidx.compose.ui.unit.c
    public final int i0(float f) {
        return this.e.i0(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final long k0() {
        return this.e.k0();
    }

    @Override // androidx.compose.ui.unit.c
    public final long m0(long j) {
        return this.e.m0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.e.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.e.o(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void r(long j, long j2, long j3, long j4, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.e.r(j, j2, j3, j4, eVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void s0(long j, float f, float f2, long j2, long j3, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.e.s0(j, f, f2, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t0(long j) {
        return this.e.t0(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void u0(long j, long j2, long j3, float f, int i) {
        this.e.u0(j, j2, j3, f, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void y(long j, long j2, long j3, float f, int i) {
        this.e.y(j, j2, j3, f, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void z0(androidx.compose.ui.graphics.p pVar, long j, long j2, long j3, float f, androidx.compose.ui.graphics.drawscope.e eVar) {
        this.e.z0(pVar, j, j2, j3, f, eVar);
    }
}
