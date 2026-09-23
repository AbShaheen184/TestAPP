package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ b(p pVar, int i) {
        this.e = i;
        this.y = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.invalidateMenu();
                break;
            default:
                p.f(this.y);
                break;
        }
    }
}
