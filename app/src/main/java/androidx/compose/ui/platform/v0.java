package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements q2 {
    public final ViewConfiguration a;

    public v0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.q2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.q2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.q2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.b(this.a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.q2
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.q2
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.q2
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.a(this.a);
        }
        return 16.0f;
    }
}
