package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ d0 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ androidx.compose.ui.unit.m C;
    public final /* synthetic */ z y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, kotlin.jvm.functions.a aVar, d0 d0Var, String str, androidx.compose.ui.unit.m mVar) {
        super(1);
        this.y = zVar;
        this.z = aVar;
        this.A = d0Var;
        this.B = str;
        this.C = mVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        z zVar = this.y;
        zVar.L.addView(zVar, zVar.M);
        zVar.l(this.z, this.A, this.B, this.C);
        return new androidx.activity.compose.d(zVar, 11);
    }
}
