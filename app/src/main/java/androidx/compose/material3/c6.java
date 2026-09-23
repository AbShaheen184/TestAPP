package androidx.compose.material3;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public androidx.compose.foundation.interaction.j L;
    public boolean M;
    public androidx.compose.animation.core.k1 N;
    public boolean O;
    public androidx.compose.animation.core.d P;
    public androidx.compose.animation.core.d Q;
    public float R;
    public float S;

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new androidx.compose.animation.core.c1(this, null, 13), 3, null);
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float f;
        boolean z = (p0Var.b(androidx.compose.ui.unit.a.h(j)) == 0 || p0Var.B(androidx.compose.ui.unit.a.g(j)) == 0) ? false : true;
        if (this.O) {
            f = androidx.compose.material3.tokens.a0.n;
        } else {
            f = (z || this.M) ? t5.a : t5.b;
        }
        float fW = s0Var.W(f);
        androidx.compose.animation.core.d dVar = this.Q;
        int iFloatValue = (int) (dVar != null ? ((Number) dVar.d()).floatValue() : fW);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            androidx.compose.ui.unit.i.a("width and height must be >= 0");
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fW2 = s0Var.W((t5.d - s0Var.P(fW)) / 2.0f);
        float fW3 = s0Var.W((t5.c - t5.a) - t5.e);
        boolean z2 = this.O;
        if (z2 && this.M) {
            fW2 = fW3 - s0Var.W(androidx.compose.material3.tokens.a0.s);
        } else if (z2 && !this.M) {
            fW2 = s0Var.W(androidx.compose.material3.tokens.a0.s);
        } else if (this.M) {
            fW2 = fW3;
        }
        androidx.compose.animation.core.d dVar2 = this.Q;
        kotlin.coroutines.d dVar3 = null;
        Float f2 = dVar2 != null ? (Float) dVar2.e.getValue() : null;
        if (f2 == null || f2.floatValue() != fW) {
            BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new b6(this, fW, dVar3, 0), 3, null);
        }
        androidx.compose.animation.core.d dVar4 = this.P;
        Float f3 = dVar4 != null ? (Float) dVar4.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fW2) {
            BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new b6(this, fW2, dVar3, 1), 3, null);
        }
        if (Float.isNaN(this.S) && Float.isNaN(this.R)) {
            this.S = fW;
            this.R = fW2;
        }
        return s0Var.q(iFloatValue, iFloatValue, kotlin.collections.x.e, new androidx.compose.foundation.gestures.e3(d1VarF, this, fW2));
    }
}
