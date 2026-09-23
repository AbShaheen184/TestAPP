package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.layout.d1 y;

    public /* synthetic */ j(androidx.compose.ui.layout.d1 d1Var, int i) {
        this.e = i;
        this.y = d1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 1:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 2:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 3:
                androidx.compose.ui.unit.m mVarF = c1Var.f();
                androidx.compose.ui.unit.m mVar = androidx.compose.ui.unit.m.e;
                androidx.compose.ui.layout.d1 d1Var = this.y;
                if (mVarF == mVar || c1Var.g() == 0) {
                    androidx.compose.ui.layout.c1.b(c1Var, d1Var);
                    d1Var.l0(androidx.compose.ui.unit.j.c(0L, d1Var.B), 0.0f, null);
                } else {
                    int i = (int) 0;
                    long jG = ((long) ((c1Var.g() - d1Var.e) - i)) << 32;
                    androidx.compose.ui.layout.c1.b(c1Var, d1Var);
                    d1Var.l0(androidx.compose.ui.unit.j.c((((long) i) & 4294967295L) | jG, d1Var.B), 0.0f, null);
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 5:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 6:
                androidx.compose.ui.layout.c1.i(c1Var, this.y, 0, 0);
                break;
            case 7:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
            case 8:
                androidx.compose.ui.layout.c1.i(c1Var, this.y, 0, 0);
                break;
            case 9:
                androidx.compose.ui.layout.c1.i(c1Var, this.y, 0, 0);
                break;
            case 10:
                androidx.compose.ui.layout.c1.i(c1Var, this.y, 0, 0);
                break;
            case 11:
                androidx.compose.ui.layout.c1.i(c1Var, this.y, 0, 0);
                break;
            default:
                androidx.compose.ui.layout.c1.l(c1Var, this.y, 0, 0);
                break;
        }
        return kotlin.y.a;
    }
}
