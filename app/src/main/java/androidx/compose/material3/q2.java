package androidx.compose.material3;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends androidx.compose.ui.platform.a {
    public final androidx.compose.runtime.j1 F;
    public boolean G;

    public q2(Context context) {
        super(context);
        this.F = androidx.compose.runtime.t.r(y0.a);
    }

    @Override // androidx.compose.ui.platform.a
    public final void a(int i, androidx.compose.runtime.s sVar) {
        sVar.c0(576708319);
        int i2 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            ((kotlin.jvm.functions.p) this.F.getValue()).invoke(sVar, 0);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.g0(this, i, 10);
        }
    }

    @Override // androidx.compose.ui.platform.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }
}
