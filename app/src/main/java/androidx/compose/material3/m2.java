package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ i2 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public m2(i2 i2Var, boolean z, androidx.compose.runtime.internal.f fVar) {
        this.e = i2Var;
        this.y = z;
        this.z = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            sVar.b0(-864293207);
            sVar.p(false);
            androidx.compose.runtime.d0 d0Var = a1.a;
            boolean z = this.y;
            i2 i2Var = this.e;
            androidx.compose.runtime.t.a(d0Var.a(new androidx.compose.ui.graphics.t(z ? i2Var.a : i2Var.d)), androidx.compose.runtime.internal.k.c(-893579015, new j0(this.z, 1), sVar), sVar, 56);
            sVar.b0(-863072055);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
