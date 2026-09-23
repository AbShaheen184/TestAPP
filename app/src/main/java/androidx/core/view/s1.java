package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class s1 extends r1 {
    public static final z1 w = z1.d(null, WindowInsets.CONSUMED);

    public s1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public androidx.core.graphics.c i(int i) {
        return androidx.core.graphics.c.c(this.c.getInsets(x1.a(i)));
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public androidx.core.graphics.c j(int i) {
        return androidx.core.graphics.c.c(this.c.getInsetsIgnoringVisibility(x1.a(i)));
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public boolean u(int i) {
        return this.c.isVisible(x1.a(i));
    }

    public s1(z1 z1Var, s1 s1Var) {
        super(z1Var, s1Var);
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public final void d(View view) {
    }
}
