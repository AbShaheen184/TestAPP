package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ g1 y;

    public /* synthetic */ e1(g1 g1Var, int i) {
        this.e = i;
        this.y = g1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.e;
        g1 g1Var = this.y;
        switch (i) {
            case 0:
                w4 w4Var = (w4) androidx.compose.ui.node.l.h(g1Var, x4.a);
                androidx.compose.material.ripple.a aVar = g1Var.R;
                if (w4Var == null) {
                    if (aVar != null) {
                        g1Var.N0(aVar);
                    }
                    g1Var.R = null;
                } else if (aVar == null) {
                    f1 f1Var = new f1(g1Var, 0);
                    e1 e1Var = new e1(g1Var, 1);
                    androidx.compose.foundation.interaction.j jVar = g1Var.N;
                    boolean z = g1Var.O;
                    float f = g1Var.P;
                    androidx.compose.animation.core.k2 k2Var = androidx.compose.material.ripple.f.a;
                    androidx.compose.material.ripple.a aVar2 = new androidx.compose.material.ripple.a(jVar, z, f, f1Var, e1Var);
                    g1Var.M0(aVar2);
                    g1Var.R = aVar2;
                }
                return kotlin.y.a;
            default:
                return q.c;
        }
    }
}
