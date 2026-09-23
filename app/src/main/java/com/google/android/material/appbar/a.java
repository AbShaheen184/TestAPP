package com.google.android.material.appbar;

import android.view.View;
import androidx.compose.animation.core.u2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.s0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.coordinatorlayout.widget.a {
    public u2 a;

    @Override // androidx.coordinatorlayout.widget.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new u2(view);
        }
        u2 u2Var = this.a;
        View view2 = (View) u2Var.z;
        u2Var.e = view2.getTop();
        u2Var.y = view2.getLeft();
        u2 u2Var2 = this.a;
        View view3 = (View) u2Var2.z;
        int top = 0 - (view3.getTop() - u2Var2.e);
        Field field = s0.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - u2Var2.y));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
