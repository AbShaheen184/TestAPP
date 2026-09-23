package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ j5 y;

    public /* synthetic */ v(j5 j5Var, int i) {
        this.e = i;
        this.y = j5Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.k0 k0Var = (androidx.compose.ui.graphics.k0) obj;
        switch (this.e) {
            case 0:
                androidx.compose.material3.internal.p pVar = this.y.c;
                float fG = pVar.j.g();
                float fC = pVar.d().c();
                float f = fG < fC ? fC - fG : 0.0f;
                k0Var.k(f > 0.0f ? 1 / ((Float.intBitsToFloat((int) (k0Var.I & 4294967295L)) + f) / Float.intBitsToFloat((int) (k0Var.I & 4294967295L))) : 1.0f);
                k0Var.s(androidx.compose.ui.graphics.a0.h(0.5f, 0.0f));
                break;
            default:
                androidx.compose.material3.internal.p pVar2 = this.y.c;
                float fG2 = pVar2.j.g();
                float fC2 = pVar2.d().c();
                float f2 = fG2 < fC2 ? fC2 - fG2 : 0.0f;
                k0Var.k(f2 > 0.0f ? (Float.intBitsToFloat((int) (k0Var.I & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & k0Var.I)) : 1.0f);
                k0Var.s(androidx.compose.ui.graphics.a0.h(0.5f, 0.0f));
                break;
        }
        return kotlin.y.a;
    }
}
