package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.foundation.text.selection.b1 y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public /* synthetic */ l(androidx.compose.foundation.text.selection.b1 b1Var, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.e = i2;
        this.y = b1Var;
        this.z = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                n0.b(this.y, this.z, sVar, androidx.compose.runtime.t.A(this.A | 1));
                break;
            default:
                n0.c(this.y, this.z, sVar, androidx.compose.runtime.t.A(this.A | 1));
                break;
        }
        return kotlin.y.a;
    }
}
