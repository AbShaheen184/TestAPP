package androidx.work;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Worker y;

    public /* synthetic */ l0(Worker worker, int i) {
        this.e = i;
        this.y = worker;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return this.y.doWork();
            default:
                return this.y.getForegroundInfo();
        }
    }
}
