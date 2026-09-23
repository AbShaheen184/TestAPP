package androidx.compose.foundation;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.compose.ui.q implements androidx.compose.ui.node.n, androidx.compose.ui.node.h1, androidx.compose.ui.node.u1 {
    public long L;
    public androidx.compose.ui.graphics.p M;
    public float N;
    public androidx.compose.ui.graphics.n0 O;
    public long P;
    public androidx.compose.ui.unit.m Q;
    public androidx.compose.ui.graphics.a0 R;
    public androidx.compose.ui.graphics.n0 S;
    public androidx.compose.ui.graphics.a0 T;

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        androidx.compose.ui.graphics.a0 a0Var;
        androidx.compose.ui.graphics.p pVar;
        androidx.compose.ui.graphics.j jVar;
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        if (this.O == androidx.compose.ui.graphics.a0.b) {
            if (!androidx.compose.ui.graphics.t.c(this.L, androidx.compose.ui.graphics.t.i)) {
                androidx.compose.ui.graphics.drawscope.d.G(h0Var, this.L, 0L, 0L, 0.0f, Token.ELSE);
            }
            androidx.compose.ui.graphics.p pVar2 = this.M;
            if (pVar2 != null) {
                androidx.compose.ui.graphics.drawscope.d.Z(h0Var, pVar2, 0L, 0L, this.N, null, Token.AND);
            }
        } else {
            if (androidx.compose.ui.geometry.e.a(bVar.d(), this.P) && h0Var.getLayoutDirection() == this.Q && kotlin.jvm.internal.l.a(this.S, this.O)) {
                a0Var = this.R;
                a0Var.getClass();
            } else {
                androidx.compose.ui.node.l.r(this, new androidx.activity.compose.f(3, this, h0Var));
                a0Var = this.T;
                this.T = null;
            }
            this.R = a0Var;
            this.P = bVar.d();
            this.Q = h0Var.getLayoutDirection();
            this.S = this.O;
            a0Var.getClass();
            if (!androidx.compose.ui.graphics.t.c(this.L, androidx.compose.ui.graphics.t.i)) {
                androidx.compose.ui.graphics.a0.k(h0Var, a0Var, this.L);
            }
            androidx.compose.ui.graphics.p pVar3 = this.M;
            if (pVar3 != null) {
                float f = this.N;
                boolean z = a0Var instanceof androidx.compose.ui.graphics.h0;
                androidx.compose.ui.graphics.drawscope.g gVar = androidx.compose.ui.graphics.drawscope.g.a;
                if (z) {
                    androidx.compose.ui.geometry.c cVar = ((androidx.compose.ui.graphics.h0) a0Var).f;
                    float f2 = cVar.a;
                    h0Var.f(pVar3, (((long) Float.floatToRawIntBits(cVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), androidx.compose.ui.graphics.a0.v(cVar), f, gVar);
                } else {
                    if (a0Var instanceof androidx.compose.ui.graphics.i0) {
                        androidx.compose.ui.graphics.i0 i0Var = (androidx.compose.ui.graphics.i0) a0Var;
                        pVar = pVar3;
                        jVar = i0Var.g;
                        if (jVar == null) {
                            androidx.compose.ui.geometry.d dVar = i0Var.f;
                            float f3 = dVar.b;
                            float f4 = dVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.h >> 32));
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            float f5 = dVar.c - f4;
                            h0Var.z0(pVar, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.d - f3)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f, gVar);
                        }
                    } else if (!(a0Var instanceof androidx.compose.ui.graphics.g0)) {
                        coil3.g.a();
                        return;
                    } else {
                        androidx.compose.ui.graphics.j jVar2 = ((androidx.compose.ui.graphics.g0) a0Var).f;
                        pVar = pVar3;
                        jVar = jVar2;
                    }
                    h0Var.e(jVar, pVar, f, gVar, 3);
                }
            }
        }
        h0Var.b();
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.h1
    public final void g0() {
        this.P = 9205357640488583168L;
        this.Q = null;
        this.R = null;
        this.S = null;
        androidx.compose.ui.node.l.k(this);
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        androidx.compose.ui.semantics.y.e(a0Var, this.O);
    }
}
