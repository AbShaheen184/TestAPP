package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public /* synthetic */ h(kotlin.jvm.functions.p pVar, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = i;
        this.y = pVar;
        this.z = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.internal.f fVar = this.z;
        kotlin.jvm.functions.p pVar = this.y;
        int i2 = 0;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    if (pVar == null) {
                        sVar.b0(-1102039173);
                    } else {
                        sVar.b0(795734342);
                        pVar.invoke(sVar, 0);
                    }
                    sVar.p(false);
                    fVar.invoke(sVar, 0);
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    float f = j.a;
                    j.b(androidx.compose.runtime.internal.k.c(-459506658, new h(pVar, fVar, i2), sVar2), sVar2, 438);
                }
                break;
        }
        return yVar;
    }
}
