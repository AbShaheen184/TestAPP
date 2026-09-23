package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Toolbar y;

    public /* synthetic */ d2(Toolbar toolbar, int i) {
        this.e = i;
        this.y = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                h2 h2Var = this.y.k0;
                androidx.appcompat.view.menu.k kVar = h2Var == null ? null : h2Var.y;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                this.y.l();
                break;
        }
    }
}
