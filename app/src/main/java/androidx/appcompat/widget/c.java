package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ActionBarOverlayLayout y;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.e = i;
        this.y = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.y;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.Q = actionBarOverlayLayout.z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.R);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.Q = actionBarOverlayLayout2.z.animate().translationY(-actionBarOverlayLayout2.z.getHeight()).setListener(actionBarOverlayLayout2.R);
                break;
        }
    }
}
