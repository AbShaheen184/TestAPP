package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final s A;
    public static final s z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new s(i, 0);
        A = new s(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
