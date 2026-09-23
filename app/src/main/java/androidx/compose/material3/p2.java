package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends androidx.compose.ui.q implements androidx.compose.ui.node.i, androidx.compose.ui.node.w {
    public LinkedHashMap L;

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float f = ((androidx.compose.ui.unit.f) androidx.compose.ui.node.l.h(this, t1.c)).e;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j);
        boolean z = this.K && !Float.isNaN(f) && androidx.compose.ui.unit.f.a(f, f2) > 0;
        int iI0 = !Float.isNaN(f) ? s0Var.i0(f) : 0;
        int iMax = d1VarF.e;
        if (z) {
            iMax = Math.max(iMax, iI0);
        }
        int iMax2 = d1VarF.y;
        if (z) {
            iMax2 = Math.max(iMax2, iI0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.L;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.L = linkedHashMap;
            }
            androidx.compose.ui.layout.o1 o1Var = t1.b;
            int iRound = Math.round((iI0 - d1VarF.e) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(o1Var, Integer.valueOf(iRound));
            androidx.compose.ui.layout.n nVar = t1.a;
            int iRound2 = Math.round((iI0 - d1VarF.y) / 2.0f);
            linkedHashMap.put(nVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.L;
        if (map == null) {
            map = kotlin.collections.x.e;
        }
        return s0Var.q(iMax, iMax2, map, new androidx.compose.foundation.layout.n0(iMax, iMax2, d1VarF));
    }
}
