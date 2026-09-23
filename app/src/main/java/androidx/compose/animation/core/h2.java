package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements androidx.compose.runtime.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ h2(e2 e2Var, int i) {
        this.a = i;
        this.b = e2Var;
    }

    @Override // androidx.compose.runtime.i0
    public final void dispose() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                e2Var.i();
                e2Var.a.u();
                break;
            default:
                e2 e2Var2 = this.b;
                e2Var2.i();
                e2Var2.a.u();
                break;
        }
    }
}
