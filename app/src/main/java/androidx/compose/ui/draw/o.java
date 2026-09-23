package androidx.compose.ui.draw;

import androidx.compose.animation.e0;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.node.w;
import androidx.compose.ui.q;
import kotlin.collections.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends q implements w, androidx.compose.ui.node.n {
    public androidx.compose.ui.graphics.painter.b L;
    public boolean M;
    public androidx.compose.ui.e N;
    public androidx.compose.ui.layout.h O;
    public float P;
    public androidx.compose.ui.graphics.m Q;

    public static boolean N0(long j) {
        return !androidx.compose.ui.geometry.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean O0(long j) {
        return !androidx.compose.ui.geometry.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.node.w
    public final int B(n0 n0Var, p0 p0Var, int i) {
        if (!M0()) {
            return p0Var.v(i);
        }
        long jP0 = P0(androidx.compose.ui.unit.b.b(0, i, 7));
        return Math.max(androidx.compose.ui.unit.a.j(jP0), p0Var.v(i));
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    public final boolean M0() {
        return this.M && this.L.h() != 9205357640488583168L;
    }

    public final long P0(long j) {
        boolean z = false;
        boolean z2 = androidx.compose.ui.unit.a.d(j) && androidx.compose.ui.unit.a.c(j);
        if (androidx.compose.ui.unit.a.f(j) && androidx.compose.ui.unit.a.e(j)) {
            z = true;
        }
        if ((!M0() && z2) || z) {
            return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.a.h(j), 0, androidx.compose.ui.unit.a.g(j), 0, 10);
        }
        long jH = this.L.h();
        int iRound = O0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : androidx.compose.ui.unit.a.j(j);
        int iRound2 = N0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : androidx.compose.ui.unit.a.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.b.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.b.g(iRound, j))) << 32);
        if (M0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!O0(this.L.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.L.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!N0(this.L.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.L.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : a0.n(jFloatToRawIntBits2, this.O.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return androidx.compose.ui.unit.a.a(j, androidx.compose.ui.unit.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, androidx.compose.ui.unit.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.n
    public final void X(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jH = this.L.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(O0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(N0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L);
        long jN = (Float.intBitsToFloat((int) (bVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) == 0.0f) ? 0L : a0.n(jFloatToRawIntBits, this.O.a(jFloatToRawIntBits, bVar.d()));
        long jA = this.N.a((((long) Math.round(Float.intBitsToFloat((int) (jN >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L), h0Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((com.google.firebase.platforminfo.d) bVar.y.y).r(f, f2);
        try {
            this.L.g(h0Var, jN, this.P, this.Q);
            ((com.google.firebase.platforminfo.d) bVar.y.y).r(-f, -f2);
            h0Var.b();
        } catch (Throwable th) {
            ((com.google.firebase.platforminfo.d) bVar.y.y).r(-f, -f2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.w
    public final int b0(n0 n0Var, p0 p0Var, int i) {
        if (!M0()) {
            return p0Var.a0(i);
        }
        long jP0 = P0(androidx.compose.ui.unit.b.b(i, 0, 13));
        return Math.max(androidx.compose.ui.unit.a.i(jP0), p0Var.a0(i));
    }

    @Override // androidx.compose.ui.node.w
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        d1 d1VarF = p0Var.F(P0(j));
        return s0Var.q(d1VarF.e, d1VarF.y, x.e, new e0(d1VarF, 3));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.L + ", sizeToIntrinsics=" + this.M + ", alignment=" + this.N + ", alpha=" + this.P + ", colorFilter=" + this.Q + ')';
    }

    @Override // androidx.compose.ui.node.w
    public final int v(n0 n0Var, p0 p0Var, int i) {
        if (!M0()) {
            return p0Var.B(i);
        }
        long jP0 = P0(androidx.compose.ui.unit.b.b(0, i, 7));
        return Math.max(androidx.compose.ui.unit.a.j(jP0), p0Var.B(i));
    }

    @Override // androidx.compose.ui.node.w
    public final int x0(n0 n0Var, p0 p0Var, int i) {
        if (!M0()) {
            return p0Var.b(i);
        }
        long jP0 = P0(androidx.compose.ui.unit.b.b(i, 0, 13));
        return Math.max(androidx.compose.ui.unit.a.i(jP0), p0Var.b(i));
    }
}
