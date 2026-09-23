package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.animation.core.k1 A;
    public final /* synthetic */ kotlin.jvm.functions.p B;
    public final /* synthetic */ n3 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public v3(n3 n3Var, boolean z, boolean z2, androidx.compose.animation.core.k1 k1Var, kotlin.jvm.functions.p pVar) {
        this.e = n3Var;
        this.y = z;
        this.z = z2;
        this.A = k1Var;
        this.B = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.text.m0 m0VarA = n6.a(androidx.compose.material3.tokens.r.h, sVar);
            boolean z = this.z;
            n3 n3Var = this.e;
            if (z) {
                j = this.y ? n3Var.b : n3Var.e;
            } else {
                j = n3Var.g;
            }
            androidx.compose.material3.internal.i.b(((androidx.compose.ui.graphics.t) androidx.compose.animation.e1.a(j, this.A, sVar).getValue()).a, m0VarA, this.B, sVar, 0);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
