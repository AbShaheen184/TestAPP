package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends e1 {
    public final WindowInsetsAnimation e;

    public d1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static androidx.core.graphics.c f(WindowInsetsAnimation.Bounds bounds) {
        return androidx.core.graphics.c.c(bounds.getUpperBound());
    }

    public static androidx.core.graphics.c g(WindowInsetsAnimation.Bounds bounds) {
        return androidx.core.graphics.c.c(bounds.getLowerBound());
    }

    public static void h(View view, w0 w0Var) {
        view.setWindowInsetsAnimationCallback(w0Var != null ? new c1(w0Var) : null);
    }

    @Override // androidx.core.view.e1
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // androidx.core.view.e1
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // androidx.core.view.e1
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // androidx.core.view.e1
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // androidx.core.view.e1
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
