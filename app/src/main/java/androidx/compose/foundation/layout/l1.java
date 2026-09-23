package androidx.compose.foundation.layout;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends o0 {
    public androidx.compose.foundation.gestures.w1 O;
    public v1 P;

    @Override // androidx.compose.foundation.layout.k0, androidx.compose.ui.q
    public final void E0() {
        View viewX = androidx.compose.ui.node.l.x(this);
        WeakHashMap weakHashMap = v1.w;
        v1 v1VarG = t.g(viewX);
        v1VarG.a(viewX);
        this.O.getClass();
        a aVar = v1VarG.c;
        if (!kotlin.jvm.internal.l.a(aVar, this.N)) {
            this.N = aVar;
            N0();
        }
        this.P = v1VarG;
        super.E0();
    }

    @Override // androidx.compose.foundation.layout.k0, androidx.compose.ui.q
    public final void F0() {
        View viewX = androidx.compose.ui.node.l.x(this);
        v1 v1Var = this.P;
        if (v1Var != null) {
            int i = v1Var.u - 1;
            v1Var.u = i;
            if (i == 0) {
                Field field = androidx.core.view.s0.a;
                androidx.core.view.k0.c(viewX, null);
                androidx.core.view.s0.o(viewX, null);
                viewX.removeOnAttachStateChangeListener(v1Var.v);
            }
        }
        super.F0();
    }
}
