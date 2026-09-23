package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ e2 y;

    public /* synthetic */ f2(e2 e2Var, int i) {
        this.e = i;
        this.y = e2Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return new h2(this.y, 1);
            default:
                return new h2(this.y, 0);
        }
    }
}
