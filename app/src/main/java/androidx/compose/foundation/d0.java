package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ e1 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.semantics.j z;

    public d0(e1 e1Var, boolean z, androidx.compose.ui.semantics.j jVar, kotlin.jvm.functions.a aVar) {
        this.e = e1Var;
        this.y = z;
        this.z = jVar;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        ((Number) obj3).intValue();
        sVar.b0(-1525724089);
        Object objQ = sVar.Q();
        if (objQ == androidx.compose.runtime.n.a) {
            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
        }
        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
        androidx.compose.ui.r rVarD = b1.a(androidx.compose.ui.o.b, kVar, this.e).d(new b0(kVar, null, false, this.y, null, this.z, this.A));
        sVar.p(false);
        return rVarD;
    }
}
