package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ m1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(m1 m1Var, int i) {
        super(2);
        this.y = i;
        this.z = m1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                this.z.a().y = (androidx.compose.runtime.w) obj2;
                break;
            case 1:
                m0 m0VarA = this.z.a();
                ((androidx.compose.ui.node.f0) obj).e0(new j0(m0VarA, (kotlin.jvm.functions.p) obj2, m0VarA.M));
                break;
            default:
                androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) obj;
                m1 m1Var = this.z;
                androidx.compose.foundation.text.input.internal.o oVar = m1Var.a;
                m0 m0Var = f0Var.f0;
                if (m0Var == null) {
                    m0Var = new m0(f0Var, oVar);
                    f0Var.f0 = m0Var;
                }
                m1Var.b = m0Var;
                m1Var.a().g();
                m0 m0VarA2 = m1Var.a();
                if (m0VarA2.z != oVar) {
                    m0VarA2.z = oVar;
                    m0VarA2.h(false);
                    androidx.compose.ui.node.f0.X(m0VarA2.e, false, 7);
                }
                break;
        }
        return kotlin.y.a;
    }
}
