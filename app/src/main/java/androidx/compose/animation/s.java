package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ u y;
    public final /* synthetic */ androidx.compose.ui.layout.d1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, androidx.compose.ui.layout.d1 d1Var, long j) {
        super(1);
        this.y = uVar;
        this.z = d1Var;
        this.A = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.e eVar = this.y.N.b;
        androidx.compose.ui.layout.d1 d1Var = this.z;
        androidx.compose.ui.layout.c1.k((androidx.compose.ui.layout.c1) obj, d1Var, eVar.a((((long) d1Var.y) & 4294967295L) | (((long) d1Var.e) << 32), this.A, androidx.compose.ui.unit.m.e));
        return kotlin.y.a;
    }
}
