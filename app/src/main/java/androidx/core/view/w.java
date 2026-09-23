package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements x {
    public final ScrollFeedbackProvider e;

    public w(NestedScrollView nestedScrollView) {
        this.e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.x
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.e.onScrollLimit(i, i2, i3, z);
    }

    @Override // androidx.core.view.x
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.e.onScrollProgress(i, i2, i3, i4);
    }
}
