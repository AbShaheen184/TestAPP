package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ u(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
