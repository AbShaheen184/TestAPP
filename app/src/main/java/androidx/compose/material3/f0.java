package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ long e;
    public final /* synthetic */ androidx.compose.foundation.layout.z0 y;
    public final /* synthetic */ kotlin.jvm.functions.q z;

    public f0(long j, androidx.compose.foundation.layout.z0 z0Var, kotlin.jvm.functions.q qVar) {
        this.e = j;
        this.y = z0Var;
        this.z = qVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.material3.internal.i.b(this.e, ((m6) sVar.j(n6.a)).m, androidx.compose.runtime.internal.k.c(417635459, new e0(0, this.y, this.z), sVar), sVar, 384);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
