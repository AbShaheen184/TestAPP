package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.compose.ui.q implements androidx.compose.ui.node.n {
    public final androidx.compose.foundation.interaction.j L;
    public boolean M;
    public boolean N;
    public boolean O;

    public n0(androidx.compose.foundation.interaction.j jVar) {
        this.L = jVar;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new androidx.compose.animation.core.c1(this, null, 2), 3, null);
    }

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        h0Var.b();
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        if (this.M) {
            androidx.compose.ui.graphics.drawscope.d.G(h0Var, androidx.compose.ui.graphics.t.b(0.3f, androidx.compose.ui.graphics.t.b), 0L, bVar.d(), 0.0f, Token.FUNCTION);
        } else if (this.N || this.O) {
            androidx.compose.ui.graphics.drawscope.d.G(h0Var, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.b), 0L, bVar.d(), 0.0f, Token.FUNCTION);
        }
    }
}
