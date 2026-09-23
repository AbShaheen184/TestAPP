package androidx.compose.ui.viewinterop;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.compose.ui.q implements androidx.compose.ui.focus.w {
    @Override // androidx.compose.ui.focus.w
    public final void u(androidx.compose.ui.focus.r rVar) {
        View viewC = j.c(this);
        rVar.d(this.e.K && j.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.h(androidx.compose.ui.focus.h.a(viewFindFocus, viewC));
        }
    }
}
