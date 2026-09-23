package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public y1(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.internal.f fVar2, androidx.compose.runtime.internal.f fVar3, androidx.compose.runtime.internal.f fVar4, androidx.compose.runtime.internal.f fVar5) {
        this.y = fVar;
        this.z = fVar2;
        this.C = fVar3;
        this.A = fVar4;
        this.B = fVar5;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a2.b((kotlin.jvm.functions.p) this.y, (kotlin.jvm.functions.p) this.z, (androidx.compose.runtime.internal.f) this.C, (kotlin.jvm.functions.p) this.A, (kotlin.jvm.functions.p) this.B, sVar, 384);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                androidx.navigation.compose.n nVar = (androidx.navigation.compose.n) this.z;
                androidx.navigation.i iVar = (androidx.navigation.i) this.y;
                if ((iIntValue2 & 3) == 2 && sVar2.F()) {
                    sVar2.W();
                } else {
                    boolean zH = sVar2.h(iVar) | sVar2.h(nVar);
                    androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) this.B;
                    Object objQ = sVar2.Q();
                    if (zH || objQ == androidx.compose.runtime.n.a) {
                        objQ = new androidx.compose.animation.core.a(17, qVar, iVar, nVar);
                        sVar2.l0(objQ);
                    }
                    androidx.compose.runtime.l0.b(iVar, (kotlin.jvm.functions.l) objQ, sVar2);
                    com.google.firebase.b.a(iVar, (androidx.compose.runtime.saveable.d) this.A, androidx.compose.runtime.internal.k.c(-497631156, new e0(7, (androidx.navigation.compose.m) this.C, iVar), sVar2), sVar2, 384);
                }
                break;
        }
        return kotlin.y.a;
    }

    public y1(androidx.navigation.i iVar, androidx.navigation.compose.n nVar, androidx.compose.runtime.saveable.e eVar, androidx.compose.runtime.snapshots.q qVar, androidx.navigation.compose.m mVar) {
        this.y = iVar;
        this.z = nVar;
        this.A = eVar;
        this.B = qVar;
        this.C = mVar;
    }
}
