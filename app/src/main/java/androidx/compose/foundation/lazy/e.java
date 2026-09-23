package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y y;

    public /* synthetic */ e(y yVar, int i) {
        this.e = i;
        this.y = yVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf(this.y.i().n);
            case 1:
                y yVar = this.y;
                return new kotlin.k(Integer.valueOf(yVar.g()), Integer.valueOf(yVar.h()));
            default:
                y yVar2 = this.y;
                return new kotlin.k(Integer.valueOf(yVar2.g()), Integer.valueOf(yVar2.h()));
        }
    }
}
