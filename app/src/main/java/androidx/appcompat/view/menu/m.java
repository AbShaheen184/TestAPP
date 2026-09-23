package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {
    public final /* synthetic */ n e;

    public m(n nVar) {
        this.e = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.e.c();
    }
}
