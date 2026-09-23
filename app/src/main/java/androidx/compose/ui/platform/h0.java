package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final h0 a = new h0();

    public final void a(View view, int i, boolean z) {
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
