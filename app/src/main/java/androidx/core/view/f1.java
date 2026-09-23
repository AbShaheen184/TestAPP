package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public e1 a;

    public f1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d1(b1.b(i, interpolator, j));
        } else {
            this.a = new a1(i, interpolator, j);
        }
    }
}
