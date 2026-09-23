package androidx.core.view;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a2 {
    @Override // org.jsoup.helper.n
    public final void K(boolean z) {
        if (!z) {
            T(16);
            return;
        }
        Window window = this.l;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        S(16);
    }
}
