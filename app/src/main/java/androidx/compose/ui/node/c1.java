package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ d1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, int i) {
        super(0);
        this.y = i;
        this.z = d1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                d1 d1Var = this.z;
                androidx.compose.ui.graphics.r rVar = d1Var.e0;
                rVar.getClass();
                d1Var.O0(rVar, d1Var.d0);
                break;
            default:
                d1 d1Var2 = this.z.N;
                if (d1Var2 != null) {
                    d1Var2.b1();
                }
                break;
        }
        return kotlin.y.a;
    }
}
