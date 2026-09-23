package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ boolean y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlin.jvm.functions.a aVar, boolean z) {
        super(1);
        this.y = z;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.graphics.k0) obj).g(!this.y && ((Boolean) this.z.invoke()).booleanValue());
        return kotlin.y.a;
    }
}
