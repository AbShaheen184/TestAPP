package androidx.compose.ui.viewinterop;

import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.t0;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.h1;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.compose.ui.node.k implements h1, androidx.compose.ui.node.i {
    public final e0 N;
    public h0 O;

    public t() {
        e0 e0Var = new e0(0, new t0(2, this, t.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 9);
        M0(e0Var);
        this.N = e0Var;
    }

    @Override // androidx.compose.ui.node.h1
    public final void g0() {
        z zVar = new z();
        androidx.compose.ui.node.l.r(this, new androidx.compose.ui.draw.b(8, zVar, this));
        h0 h0Var = (h0) zVar.e;
        if (this.N.R0().a()) {
            h0 h0Var2 = this.O;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.O = h0Var;
        }
    }
}
