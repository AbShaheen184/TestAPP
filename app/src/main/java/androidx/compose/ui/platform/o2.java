package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ n2 A;
    public final /* synthetic */ a y;
    public final /* synthetic */ androidx.appcompat.view.menu.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(a aVar, androidx.appcompat.view.menu.d dVar, n2 n2Var) {
        super(0);
        this.y = aVar;
        this.z = dVar;
        this.A = n2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.appcompat.view.menu.d dVar = this.z;
        a aVar = this.y;
        aVar.removeOnAttachStateChangeListener(dVar);
        coil3.network.g.s(aVar).a.remove(this.A);
        return kotlin.y.a;
    }
}
