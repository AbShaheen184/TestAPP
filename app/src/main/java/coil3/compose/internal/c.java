package coil3.compose.internal;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.n;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.w;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.y;
import coil3.compose.h;
import coil3.compose.i;
import coil3.compose.o;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q implements n, w, u1 {
    public androidx.compose.ui.e L;
    public j M;
    public float N = 1.0f;
    public boolean O = true;
    public String P;
    public o Q;
    public final i R;

    public c(i iVar, androidx.compose.ui.e eVar, j jVar, String str, o oVar) {
        this.L = eVar;
        this.M = jVar;
        this.P = str;
        this.Q = oVar;
        this.R = iVar;
    }

    @Override // androidx.compose.ui.node.w
    public final int B(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(0, i, 7);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.v(i);
        }
        long jN0 = N0(jB);
        return Math.max(androidx.compose.ui.unit.a.j(jN0), p0Var.v(i));
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        CoroutineScope coroutineScopeA0 = A0();
        i iVar = this.R;
        iVar.I = coroutineScopeA0;
        iVar.c();
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.R.b();
    }

    @Override // androidx.compose.ui.q
    public final void G0() {
        this.R.n(null);
    }

    public final long M0(long j) {
        if (androidx.compose.ui.geometry.e.e(j)) {
            return 0L;
        }
        long jH = this.R.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jA = this.M.a(jFloatToRawIntBits, j);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) > Float.MAX_VALUE) ? j : a0.n(jFloatToRawIntBits, jA);
    }

    public final long N0(long j) {
        float fJ;
        int i;
        float fC;
        boolean zF = androidx.compose.ui.unit.a.f(j);
        boolean zE = androidx.compose.ui.unit.a.e(j);
        if (zF && zE) {
            return j;
        }
        boolean z = androidx.compose.ui.unit.a.d(j) && androidx.compose.ui.unit.a.c(j);
        i iVar = this.R;
        long jH = iVar.h();
        if (jH == 9205357640488583168L) {
            return (!z || ((h) iVar.S.getValue()).a() == null) ? j : androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.a.h(j), 0, androidx.compose.ui.unit.a.g(j), 0, 10);
        }
        if (!z || (!zF && !zE)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i2 = g.b;
                fJ = i0.c(fIntBitsToFloat, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j));
            } else {
                fJ = androidx.compose.ui.unit.a.j(j);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i3 = g.b;
                fC = i0.c(fIntBitsToFloat2, androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.g(j));
            } else {
                i = androidx.compose.ui.unit.a.i(j);
            }
            long jM0 = M0((((long) Float.floatToRawIntBits(fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
            return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(kotlin.math.a.H(Float.intBitsToFloat((int) (jM0 >> 32))), j), 0, androidx.compose.ui.unit.b.f(kotlin.math.a.H(Float.intBitsToFloat((int) (jM0 & 4294967295L))), j), 0, 10);
        }
        fJ = androidx.compose.ui.unit.a.h(j);
        i = androidx.compose.ui.unit.a.g(j);
        fC = i;
        long jM1 = M0((((long) Float.floatToRawIntBits(fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
        return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(kotlin.math.a.H(Float.intBitsToFloat((int) (jM1 >> 32))), j), 0, androidx.compose.ui.unit.b.f(kotlin.math.a.H(Float.intBitsToFloat((int) (jM1 & 4294967295L))), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.n
    public final void X(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jM0 = M0(bVar.d());
        long jA = this.L.a(g.b(jM0), g.b(bVar.d()), h0Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        c2 c2Var = bVar.y;
        long jG = c2Var.G();
        c2Var.v().f();
        try {
            com.google.firebase.platforminfo.d dVar = (com.google.firebase.platforminfo.d) c2Var.y;
            c2 c2Var2 = (c2) dVar.e;
            if (this.O) {
                c2Var2.v().o(0.0f, 0.0f, Float.intBitsToFloat((int) (c2Var2.G() >> 32)), Float.intBitsToFloat((int) (4294967295L & c2Var2.G())), 1);
            }
            dVar.r(i, i2);
            this.R.g(h0Var, jM0, this.N, null);
            c2Var.v().q();
            c2Var.b0(jG);
            h0Var.b();
        } catch (Throwable th) {
            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(i, 0, 13);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.a0(i);
        }
        long jN0 = N0(jB);
        return Math.max(androidx.compose.ui.unit.a.i(jN0), p0Var.a0(i));
    }

    @Override // androidx.compose.ui.node.w
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        o oVar = this.Q;
        if (oVar != null) {
            oVar.g(j);
        }
        d1 d1VarF = p0Var.F(N0(j));
        return s0Var.q(d1VarF.e, d1VarF.y, x.e, new androidx.compose.foundation.layout.j(d1VarF, 12));
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        String str = this.P;
        if (str != null) {
            y.c(a0Var, str);
            y.d(a0Var, 5);
        }
    }

    @Override // androidx.compose.ui.node.w
    public final int v(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(0, i, 7);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.B(i);
        }
        long jN0 = N0(jB);
        return Math.max(androidx.compose.ui.unit.a.j(jN0), p0Var.B(i));
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(n0 n0Var, p0 p0Var, int i) {
        long jB = androidx.compose.ui.unit.b.b(i, 0, 13);
        o oVar = this.Q;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.R.h() == 9205357640488583168L) {
            return p0Var.b(i);
        }
        long jN0 = N0(jB);
        return Math.max(androidx.compose.ui.unit.a.i(jN0), p0Var.b(i));
    }
}
