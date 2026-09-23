package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ long A;
    public final /* synthetic */ q1 B;
    public final /* synthetic */ n0 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, long j, long j2, q1 q1Var) {
        super(0);
        this.y = n0Var;
        this.z = j;
        this.A = j2;
        this.B = q1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        n0 n0Var = this.y;
        n0Var.F0().e = false;
        n0Var.F0().y = this.z;
        n0Var.F0().z = this.A;
        kotlin.jvm.functions.l lVarE = this.B.e.e();
        if (lVarE != null) {
            lVarE.invoke(n0Var.F0());
        }
        return kotlin.y.a;
    }
}
