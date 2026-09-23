package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ androidx.compose.ui.unit.k A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ kotlin.jvm.internal.y y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.y yVar, z zVar, androidx.compose.ui.unit.k kVar, long j, long j2) {
        super(0);
        this.y = yVar;
        this.z = zVar;
        this.A = kVar;
        this.B = j;
        this.C = j2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        z zVar = this.z;
        this.y.e = zVar.getPositionProvider().a(this.A, this.B, zVar.getParentLayoutDirection(), this.C);
        return kotlin.y.a;
    }
}
