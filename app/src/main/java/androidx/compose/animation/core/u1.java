package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ e2 y;

    public /* synthetic */ u1(e2 e2Var, int i) {
        this.e = i;
        this.y = e2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                e2 e2Var = this.y;
                return Boolean.valueOf((kotlin.jvm.internal.l.a(e2Var.d.getValue(), e2Var.a.n()) && e2Var.g.g() == Long.MIN_VALUE && !((Boolean) e2Var.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.y.b());
        }
    }
}
