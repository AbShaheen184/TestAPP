package androidx.core.view;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class p1 extends o1 {
    public androidx.core.graphics.c s;

    public p1(z1 z1Var, p1 p1Var) {
        super(z1Var, p1Var);
        this.s = null;
        this.s = p1Var.s;
    }

    @Override // androidx.core.view.w1
    public z1 b() {
        return z1.d(null, this.c.consumeStableInsets());
    }

    @Override // androidx.core.view.w1
    public z1 c() {
        return z1.d(null, this.c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.w1
    public final androidx.core.graphics.c l() {
        if (this.s == null) {
            WindowInsets windowInsets = this.c;
            this.s = androidx.core.graphics.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s;
    }

    @Override // androidx.core.view.w1
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // androidx.core.view.w1
    public void z(androidx.core.graphics.c cVar) {
        this.s = cVar;
    }

    public p1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
        this.s = null;
    }
}
