package androidx.core.view;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class r1 extends q1 {
    public androidx.core.graphics.c t;
    public androidx.core.graphics.c u;
    public androidx.core.graphics.c v;

    public r1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // androidx.core.view.w1
    public androidx.core.graphics.c k() {
        if (this.u == null) {
            this.u = androidx.core.graphics.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.u;
    }

    @Override // androidx.core.view.w1
    public androidx.core.graphics.c m() {
        if (this.t == null) {
            this.t = androidx.core.graphics.c.c(this.c.getSystemGestureInsets());
        }
        return this.t;
    }

    @Override // androidx.core.view.w1
    public androidx.core.graphics.c o() {
        if (this.v == null) {
            this.v = androidx.core.graphics.c.c(this.c.getTappableElementInsets());
        }
        return this.v;
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public z1 r(int i, int i2, int i3, int i4) {
        return z1.d(null, this.c.inset(i, i2, i3, i4));
    }

    public r1(z1 z1Var, r1 r1Var) {
        super(z1Var, r1Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // androidx.core.view.p1, androidx.core.view.w1
    public void z(androidx.core.graphics.c cVar) {
    }
}
