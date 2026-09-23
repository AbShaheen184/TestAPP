package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.ui.layout.q0 {
    public static final void c(ArrayList arrayList, kotlin.jvm.internal.x xVar, androidx.compose.ui.layout.s0 s0Var, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.x xVar2, ArrayList arrayList4, kotlin.jvm.internal.x xVar3, kotlin.jvm.internal.x xVar4) {
        float f = j.d;
        if (!arrayList.isEmpty()) {
            xVar.e = s0Var.i0(f) + xVar.e;
        }
        arrayList.add(0, kotlin.collections.p.b0(arrayList2));
        arrayList3.add(Integer.valueOf(xVar2.e));
        arrayList4.add(Integer.valueOf(xVar.e));
        xVar.e += xVar2.e;
        xVar3.e = Math.max(xVar3.e, xVar4.e);
        arrayList2.clear();
        xVar4.e = 0;
        xVar2.e = 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        ArrayList arrayList5 = new ArrayList();
        kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
        kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
        float f = j.c;
        float f2 = j.a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.layout.d1 d1VarF = ((androidx.compose.ui.layout.p0) list.get(i)).F(j);
            if (!arrayList5.isEmpty()) {
                ArrayList arrayList6 = arrayList2;
                kotlin.jvm.internal.x xVar5 = xVar2;
                if (s0Var.i0(f) + xVar3.e + d1VarF.e <= androidx.compose.ui.unit.a.h(j)) {
                    arrayList2 = arrayList6;
                    xVar2 = xVar5;
                } else {
                    arrayList2 = arrayList6;
                    xVar2 = xVar5;
                    c(arrayList2, xVar2, s0Var, arrayList5, arrayList3, xVar4, arrayList4, xVar, xVar3);
                }
            }
            if (!arrayList5.isEmpty()) {
                xVar3.e = s0Var.i0(f) + xVar3.e;
            }
            arrayList5.add(d1VarF);
            xVar3.e += d1VarF.e;
            xVar4.e = Math.max(xVar4.e, d1VarF.y);
            i++;
            arrayList2 = arrayList2;
        }
        ArrayList arrayList7 = arrayList2;
        if (arrayList5.isEmpty()) {
            arrayList = arrayList7;
        } else {
            float f3 = j.a;
            arrayList = arrayList7;
            c(arrayList, xVar2, s0Var, arrayList5, arrayList3, xVar4, arrayList4, xVar, xVar3);
        }
        int iMax = Math.max(xVar.e, androidx.compose.ui.unit.a.j(j));
        int iMax2 = Math.max(xVar2.e, androidx.compose.ui.unit.a.i(j));
        float f4 = j.a;
        return s0Var.q(iMax, iMax2, kotlin.collections.x.e, new androidx.compose.foundation.layout.e1(arrayList, s0Var, iMax, arrayList4));
    }
}
