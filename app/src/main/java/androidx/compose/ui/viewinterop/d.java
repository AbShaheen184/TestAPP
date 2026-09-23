package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.f0;
import java.util.List;
import kotlin.collections.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q0 {
    public final /* synthetic */ w a;
    public final /* synthetic */ f0 b;

    public d(w wVar, f0 f0Var) {
        this.a = wVar;
        this.b = f0Var;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        w wVar = this.a;
        int childCount = wVar.getChildCount();
        x xVar = x.e;
        if (childCount == 0) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), xVar, b.A);
        }
        if (androidx.compose.ui.unit.a.j(j) != 0) {
            wVar.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.a.j(j));
        }
        if (androidx.compose.ui.unit.a.i(j) != 0) {
            wVar.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.a.i(j));
        }
        int iJ = androidx.compose.ui.unit.a.j(j);
        int iH = androidx.compose.ui.unit.a.h(j);
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        layoutParams.getClass();
        int iK = h.k(wVar, iJ, iH, layoutParams.width);
        int i = androidx.compose.ui.unit.a.i(j);
        int iG = androidx.compose.ui.unit.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = wVar.getLayoutParams();
        layoutParams2.getClass();
        wVar.measure(iK, h.k(wVar, i, iG, layoutParams2.height));
        return s0Var.q(wVar.getMeasuredWidth(), wVar.getMeasuredHeight(), xVar, new c(wVar, this.b, 1));
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        w wVar = this.a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        layoutParams.getClass();
        wVar.measure(iMakeMeasureSpec, h.k(wVar, 0, i, layoutParams.height));
        return wVar.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        w wVar = this.a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        layoutParams.getClass();
        wVar.measure(h.k(wVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wVar.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        w wVar = this.a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        layoutParams.getClass();
        wVar.measure(iMakeMeasureSpec, h.k(wVar, 0, i, layoutParams.height));
        return wVar.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        w wVar = this.a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        layoutParams.getClass();
        wVar.measure(h.k(wVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wVar.getMeasuredHeight();
    }
}
