package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final i1 y = new i1(2);

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
