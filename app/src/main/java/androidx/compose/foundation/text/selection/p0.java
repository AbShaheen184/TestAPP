package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements androidx.compose.ui.layout.q0 {
    public static final p0 a = new p0();

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.d1 d1VarF = ((androidx.compose.ui.layout.p0) list.get(i)).F(j);
            iMax = Math.max(iMax, d1VarF.e);
            iMax2 = Math.max(iMax2, d1VarF.y);
            arrayList.add(d1VarF);
        }
        return s0Var.q(iMax, iMax2, kotlin.collections.x.e, new o0(0, arrayList));
    }
}
