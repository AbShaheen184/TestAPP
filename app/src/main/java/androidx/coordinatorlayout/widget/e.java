package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout e;

    public e(CoordinatorLayout coordinatorLayout) {
        this.e = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.e.p(0);
        return true;
    }
}
