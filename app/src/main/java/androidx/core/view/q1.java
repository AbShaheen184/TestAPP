package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class q1 extends p1 {
    public q1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
    }

    @Override // androidx.core.view.w1
    public z1 a() {
        return z1.d(null, this.c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Objects.equals(this.c, q1Var.c) && Objects.equals(this.g, q1Var.g) && o1.M(this.h, q1Var.h);
    }

    @Override // androidx.core.view.w1
    public h h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // androidx.core.view.w1
    public int hashCode() {
        return this.c.hashCode();
    }

    public q1(z1 z1Var, q1 q1Var) {
        super(z1Var, q1Var);
    }
}
