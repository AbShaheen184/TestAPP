package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    public /* synthetic */ v0(long j, kotlin.jvm.functions.p pVar, int i) {
        this.e = i;
        this.y = j;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a1.c(this.y, this.z, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a1.c(this.y, this.z, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
