package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ n1(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.internal.f fVar2, androidx.compose.runtime.internal.f fVar3, kotlin.jvm.functions.p pVar, boolean z, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.C = fVar;
        this.D = fVar2;
        this.E = fVar3;
        this.y = pVar;
        this.z = z;
        this.A = aVar;
        this.F = aVar2;
        this.B = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                q.f((androidx.compose.ui.r) this.C, this.A, this.z, (androidx.compose.ui.graphics.n0) this.D, (l1) this.E, (androidx.compose.foundation.interaction.k) this.F, this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x3.c((androidx.compose.runtime.internal.f) this.C, (androidx.compose.runtime.internal.f) this.D, (androidx.compose.runtime.internal.f) this.E, this.y, this.z, this.A, (kotlin.jvm.functions.a) this.F, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n1(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, l1 l1Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar, int i) {
        this.C = rVar;
        this.A = aVar;
        this.z = z;
        this.D = n0Var;
        this.E = l1Var;
        this.F = kVar;
        this.y = pVar;
        this.B = i;
    }
}
