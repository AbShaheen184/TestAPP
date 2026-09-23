package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ v0 y;

    public /* synthetic */ t0(v0 v0Var, int i) {
        this.e = i;
        this.y = v0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Float.valueOf(this.y.M.b());
            case 1:
                return Float.valueOf(this.y.M.d());
            default:
                v0 v0Var = this.y;
                return Float.valueOf(v0Var.M.a() - v0Var.M.c());
        }
    }
}
