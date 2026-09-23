package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements androidx.compose.ui.graphics.u {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ f1(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.compose.ui.graphics.u
    public final long a() {
        switch (this.e) {
            case 0:
                g1 g1Var = (g1) this.y;
                long jA = g1Var.Q.a();
                if (jA != 16) {
                    return jA;
                }
                w4 w4Var = (w4) androidx.compose.ui.node.l.h(g1Var, x4.a);
                if (w4Var != null) {
                    long j = w4Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((androidx.compose.ui.graphics.t) androidx.compose.ui.node.l.h(g1Var, a1.a)).a;
            default:
                return ((y4) this.y).c;
        }
    }
}
