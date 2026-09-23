package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends androidx.compose.ui.node.c0 {
    public static final g1 b = new g1("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        int size = list.size();
        kotlin.collections.x xVar = kotlin.collections.x.e;
        if (size == 0) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), xVar, e1.A);
        }
        if (size == 1) {
            d1 d1VarF = ((p0) list.get(0)).F(j);
            return s0Var.q(androidx.compose.ui.unit.b.g(d1VarF.e, j), androidx.compose.ui.unit.b.f(d1VarF.y, j), xVar, new androidx.compose.animation.e0(d1VarF, 4));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            d1 d1VarF2 = ((p0) list.get(i)).F(j);
            iMax = Math.max(d1VarF2.e, iMax);
            iMax2 = Math.max(d1VarF2.y, iMax2);
            arrayList.add(d1VarF2);
        }
        return s0Var.q(androidx.compose.ui.unit.b.g(iMax, j), androidx.compose.ui.unit.b.f(iMax2, j), xVar, new androidx.compose.animation.w(1, arrayList));
    }
}
