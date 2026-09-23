package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.j1;
import androidx.compose.ui.node.d1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.compose.ui.q implements androidx.compose.ui.node.i, androidx.compose.ui.node.o {
    public t L;
    public r0 M;
    public b1 N;
    public final j1 O = androidx.compose.runtime.t.r(null);

    public q(t tVar, r0 r0Var, b1 b1Var) {
        this.L = tVar;
        this.M = r0Var;
        this.N = b1Var;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        t tVar = this.L;
        if (tVar.a != null) {
            androidx.compose.foundation.internal.b.c("Expected textInputModifierNode to be null");
        }
        tVar.a = this;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.L.i(this);
    }

    @Override // androidx.compose.ui.node.o
    public final void w0(d1 d1Var) {
        this.O.setValue(d1Var);
    }
}
