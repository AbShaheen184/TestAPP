package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ x0 y;

    public /* synthetic */ t0(x0 x0Var, int i) {
        this.e = i;
        this.y = x0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.b();
                break;
            default:
                this.y.onCancel();
                break;
        }
        return kotlin.y.a;
    }
}
