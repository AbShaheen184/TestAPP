package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int y;
    public final /* synthetic */ p[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(p[] pVarArr, int i) {
        super(2);
        this.y = i;
        this.z = pVarArr;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                return Float.valueOf(a0.c((c1) obj, true, this.z, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(a0.c((c1) obj, false, this.z, ((Number) obj2).floatValue()));
        }
    }
}
