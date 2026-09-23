package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ View y;

    public /* synthetic */ z(View view, int i) {
        this.e = i;
        this.y = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                View view = this.y;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                View view2 = this.y;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
