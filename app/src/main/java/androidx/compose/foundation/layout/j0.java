package androidx.compose.foundation.layout;

import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ k0 y;

    public /* synthetic */ j0(k0 k0Var, int i) {
        this.e = i;
        this.y = k0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        z1 z1Var = (z1) obj;
        switch (this.e) {
            case 0:
                z1Var.getClass();
                k0 k0Var = (k0) z1Var;
                u1 u1Var = this.y.M;
                if (!kotlin.jvm.internal.l.a(k0Var.L, u1Var)) {
                    k0Var.L = u1Var;
                    k0Var.N0();
                }
                return androidx.compose.ui.node.y1.y;
            default:
                z1Var.getClass();
                this.y.L = ((k0) z1Var).M;
                return Boolean.FALSE;
        }
    }
}
