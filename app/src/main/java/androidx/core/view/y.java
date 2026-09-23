package androidx.core.view;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final x a;

    public y(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new w(nestedScrollView);
        } else {
            this.a = new com.google.firebase.heartbeatinfo.e(4);
        }
    }
}
