package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ androidx.compose.ui.text.m0 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ androidx.compose.foundation.layout.z0 D;
    public final /* synthetic */ z4 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public p0(z4 z4Var, boolean z, boolean z2, androidx.compose.runtime.internal.f fVar, androidx.compose.ui.text.m0 m0Var, float f, androidx.compose.foundation.layout.z0 z0Var) {
        this.e = z4Var;
        this.y = z;
        this.z = z2;
        this.A = fVar;
        this.B = m0Var;
        this.C = f;
        this.D = z0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            z4 z4Var = this.e;
            boolean z = this.y;
            boolean z2 = this.z;
            if (z) {
                j = !z2 ? z4Var.b : z4Var.k;
            } else {
                j = z4Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? z4Var.c : z4Var.l;
            } else {
                j2 = z4Var.g;
            }
            if (z) {
                j3 = !z2 ? z4Var.d : z4Var.m;
            } else {
                j3 = z4Var.h;
            }
            q0.a(this.A, this.B, j4, j2, j3, this.C, this.D, sVar, 0);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
