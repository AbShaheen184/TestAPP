package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ k2 y;

    public /* synthetic */ f2(k2 k2Var, int i) {
        this.e = i;
        this.y = k2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(this.y.K);
            default:
                androidx.compose.ui.focus.e0 e0Var = this.y.m0;
                if (!e0Var.e.K) {
                    return null;
                }
                androidx.compose.ui.focus.c0 c0VarR0 = e0Var.R0();
                int iOrdinal = c0VarR0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    coil3.g.a();
                    return null;
                }
                if (c0VarR0.a()) {
                    return e0Var.P0(null);
                }
                androidx.compose.ui.focus.e0 e0VarF = ((androidx.compose.ui.focus.p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w(e0Var)).getFocusOwner()).f();
                if (e0VarF != null) {
                    return e0VarF.P0(androidx.compose.ui.node.l.u(e0Var));
                }
                return null;
        }
    }
}
