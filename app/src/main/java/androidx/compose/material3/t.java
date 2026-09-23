package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements kotlin.jvm.functions.p {
    public final /* synthetic */ float e;
    public final /* synthetic */ float y;

    public t(float f, float f2) {
        this.e = f;
        this.y = f2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.layout.i1.n(androidx.compose.ui.o.b, this.e, this.y), sVar, 0);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
