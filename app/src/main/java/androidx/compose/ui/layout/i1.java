package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.compose.ui.platform.u uVar, androidx.compose.ui.platform.u0 u0Var, kotlin.jvm.functions.p pVar) {
        super(2);
        this.y = 1;
        this.A = uVar;
        this.B = u0Var;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                ((Number) obj2).intValue();
                a0.a((m1) this.A, (androidx.compose.ui.r) this.B, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(9));
                break;
            case 1:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.platform.l1.a((androidx.compose.ui.platform.u) this.A, (androidx.compose.ui.platform.u0) this.B, this.z, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Number) obj2).intValue();
                androidx.compose.ui.platform.l1.a((androidx.compose.ui.node.m1) this.A, (androidx.compose.ui.platform.u0) this.B, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
        }
        return kotlin.y.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, Object obj2, kotlin.jvm.functions.p pVar, int i, int i2) {
        super(2);
        this.y = i2;
        this.A = obj;
        this.B = obj2;
        this.z = pVar;
    }
}
