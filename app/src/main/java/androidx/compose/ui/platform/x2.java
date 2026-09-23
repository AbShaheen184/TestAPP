package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View e;
    public final /* synthetic */ androidx.compose.runtime.y1 y;

    public x2(View view, androidx.compose.runtime.y1 y1Var) {
        this.e = view;
        this.y = y1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.e.removeOnAttachStateChangeListener(this);
        this.y.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
