package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends u1 {
    public v1(z1 z1Var, WindowInsets windowInsets) {
        super(z1Var, windowInsets);
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(y1.a(i));
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(y1.a(i));
    }

    public v1(z1 z1Var, v1 v1Var) {
        super(z1Var, v1Var);
    }

    @Override // androidx.core.view.o1, androidx.core.view.w1
    public void q() {
    }
}
