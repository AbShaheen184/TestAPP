package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements androidx.compose.ui.text.input.s {
    public q a;

    @Override // androidx.compose.ui.text.input.s
    public final void c() {
        l2 l2Var;
        q qVar = this.a;
        if (qVar == null || (l2Var = (l2) androidx.compose.ui.node.l.h(qVar, l1.p)) == null) {
            return;
        }
        ((m1) l2Var).b();
    }

    @Override // androidx.compose.ui.text.input.s
    public final void e() {
        l2 l2Var;
        q qVar = this.a;
        if (qVar == null || (l2Var = (l2) androidx.compose.ui.node.l.h(qVar, l1.p)) == null) {
            return;
        }
        ((m1) l2Var).a();
    }

    public final void i(q qVar) {
        if (!(this.a == qVar)) {
            androidx.compose.foundation.internal.b.c("Expected textInputModifierNode to be " + qVar + " but was " + this.a);
        }
        this.a = null;
    }
}
