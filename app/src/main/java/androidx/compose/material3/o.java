package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.foundation.c2 A;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ androidx.compose.runtime.internal.f F;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.animation.core.p0 y;
    public final /* synthetic */ androidx.compose.runtime.a1 z;

    public o(androidx.compose.ui.r rVar, androidx.compose.animation.core.p0 p0Var, androidx.compose.runtime.a1 a1Var, androidx.compose.foundation.c2 c2Var, androidx.compose.ui.graphics.n0 n0Var, long j, float f, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = p0Var;
        this.z = a1Var;
        this.A = c2Var;
        this.B = n0Var;
        this.C = j;
        this.D = f;
        this.E = f2;
        this.F = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            n2.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, sVar, 384);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
