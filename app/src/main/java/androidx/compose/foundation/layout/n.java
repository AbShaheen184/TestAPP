package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ int z;

    public /* synthetic */ n(androidx.compose.ui.r rVar, int i) {
        this.y = rVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p.a(this.y, sVar, androidx.compose.runtime.t.A(this.z | 1));
                break;
            default:
                androidx.compose.foundation.text.d.b(this.y, sVar, androidx.compose.runtime.t.A(1), this.z);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n(androidx.compose.ui.r rVar, int i, int i2) {
        this.y = rVar;
        this.z = i2;
    }
}
