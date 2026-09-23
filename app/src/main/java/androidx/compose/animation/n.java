package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ androidx.compose.ui.layout.d1[] y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.ui.layout.d1[] d1VarArr, o oVar, int i, int i2) {
        super(1);
        this.y = d1VarArr;
        this.z = oVar;
        this.A = i;
        this.B = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
        for (androidx.compose.ui.layout.d1 d1Var : this.y) {
            if (d1Var != null) {
                long jA = this.z.a.b.a((((long) d1Var.e) << 32) | (((long) d1Var.y) & 4294967295L), (((long) this.A) << 32) | (((long) this.B) & 4294967295L), androidx.compose.ui.unit.m.e);
                androidx.compose.ui.layout.c1.i(c1Var, d1Var, (int) (jA >> 32), (int) (jA & 4294967295L));
            }
        }
        return kotlin.y.a;
    }
}
