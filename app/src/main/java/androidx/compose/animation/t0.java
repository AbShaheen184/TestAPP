package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ h B;
    public final /* synthetic */ androidx.compose.ui.layout.d1 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.compose.ui.layout.d1 d1Var, long j, long j2, h hVar) {
        super(1);
        this.y = d1Var;
        this.z = j;
        this.A = j2;
        this.B = hVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
        long j = this.z;
        long j2 = this.A;
        c1Var.getClass();
        androidx.compose.ui.layout.d1 d1Var = this.y;
        androidx.compose.ui.layout.c1.b(c1Var, d1Var);
        d1Var.l0(androidx.compose.ui.unit.j.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), d1Var.B), 0.0f, this.B);
        return kotlin.y.a;
    }
}
