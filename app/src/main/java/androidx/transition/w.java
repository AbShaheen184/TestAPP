package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v {
    @Override // _COROUTINE.a
    public final float T(View view) {
        return view.getTransitionAlpha();
    }

    @Override // _COROUTINE.a
    public final void b0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.v
    public final void d0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.v
    public final void e0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.v
    public final void f0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.v
    public final void g0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
