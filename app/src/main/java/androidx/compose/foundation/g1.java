package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ h1 y;

    public /* synthetic */ g1(h1 h1Var, int i) {
        this.e = i;
        this.y = h1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.O0();
                return kotlin.y.a;
            case 1:
                return new androidx.compose.ui.geometry.b(this.y.T);
            default:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y.R.getValue();
                return new androidx.compose.ui.geometry.b(xVar != null ? xVar.X(0L) : 9205357640488583168L);
        }
    }
}
