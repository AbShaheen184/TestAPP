package androidx.compose.foundation.selection;

import androidx.compose.material3.internal.n0;
import androidx.compose.ui.autofill.q;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.semantics.a0;
import androidx.compose.ui.semantics.y;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ a0 y;

    public /* synthetic */ f(a0 a0Var, int i) {
        this.e = i;
        this.y = a0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        switch (this.e) {
            case 0:
                Boolean boolA = ((androidx.compose.ui.autofill.g) ((q) obj)).a();
                if (boolA != null) {
                    y.f(this.y, boolA.booleanValue() ? androidx.compose.ui.state.a.e : androidx.compose.ui.state.a.y);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                z1 z1Var = (z1) obj;
                z1Var.getClass();
                n0 n0Var = (n0) z1Var;
                n0Var.M = true;
                n0Var.L.invoke(this.y);
                androidx.compose.ui.node.l.m(n0Var);
                return Boolean.FALSE;
        }
    }
}
