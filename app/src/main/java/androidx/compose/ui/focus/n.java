package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ kotlin.jvm.internal.z y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i, kotlin.jvm.internal.z zVar) {
        super(1);
        this.y = zVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((e0) obj).T0(this.z));
        this.y.e = boolValueOf;
        return boolValueOf;
    }
}
