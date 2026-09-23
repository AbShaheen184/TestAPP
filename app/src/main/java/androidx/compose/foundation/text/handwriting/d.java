package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.m;
import androidx.compose.ui.focus.a0;
import androidx.compose.ui.focus.c0;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.input.pointer.n;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.r1;
import androidx.compose.ui.node.x1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements r1, g, a0 {
    public kotlin.jvm.functions.a N;
    public boolean O;
    public final l0 P;

    public d(kotlin.jvm.functions.a aVar) {
        this.N = aVar;
        m mVar = new m(this, 4);
        androidx.compose.ui.input.pointer.m mVar2 = h0.a;
        l0 l0Var = new l0(null, null, mVar);
        M0(l0Var);
        this.P = l0Var;
    }

    @Override // androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, n nVar, long j) {
        this.P.D(mVar, nVar, j);
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        this.P.E();
    }

    @Override // androidx.compose.ui.focus.g
    public final void Y(c0 c0Var) {
        this.O = c0Var.a();
    }

    @Override // androidx.compose.ui.node.r1
    public final long k() {
        androidx.compose.ui.node.m mVar = b.a;
        androidx.compose.ui.unit.c cVar = l.v(this).W;
        mVar.getClass();
        int i = x1.b;
        return b1.c(cVar.i0(mVar.a), cVar.i0(mVar.b), cVar.i0(mVar.c), cVar.i0(mVar.d));
    }
}
