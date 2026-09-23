package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.m;
import androidx.compose.foundation.text.selection.t0;
import androidx.compose.runtime.j1;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.compose.ui.node.k implements androidx.compose.ui.node.i, o {
    public t0 N;
    public final j1 O = new j1(null, androidx.compose.runtime.f.A);

    public g(t0 t0Var) {
        this.N = t0Var;
        m mVar = new m(this, 3);
        androidx.compose.ui.input.pointer.m mVar2 = h0.a;
        M0(new l0(null, null, mVar));
    }

    @Override // androidx.compose.ui.node.o
    public final void w0(d1 d1Var) {
        this.O.setValue(d1Var);
    }
}
