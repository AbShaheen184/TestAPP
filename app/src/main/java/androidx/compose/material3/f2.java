package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public static int a(androidx.compose.ui.layout.s sVar, ArrayList arrayList, int i, kotlin.jvm.functions.p pVar) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iJ = androidx.compose.material3.internal.i.j(i, sVar.i0(a2.c + a2.d));
        androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list4);
        if (p0Var != null) {
            iIntValue = ((Number) pVar.invoke(p0Var, Integer.valueOf(iJ))).intValue();
            iJ = androidx.compose.material3.internal.i.j(iJ, p0Var.B(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list5);
        if (p0Var2 != null) {
            iIntValue2 = ((Number) pVar.invoke(p0Var2, Integer.valueOf(iJ))).intValue();
            iJ = androidx.compose.material3.internal.i.j(iJ, p0Var2.B(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list2);
        int iIntValue3 = obj != null ? ((Number) pVar.invoke(obj, Integer.valueOf(iJ))).intValue() : 0;
        Object obj2 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list);
        int iIntValue4 = obj2 != null ? ((Number) pVar.invoke(obj2, Integer.valueOf(iJ))).intValue() : 0;
        Object obj3 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list3);
        int iIntValue5 = obj3 != null ? ((Number) pVar.invoke(obj3, Integer.valueOf(iJ))).intValue() : 0;
        boolean z = iIntValue5 > sVar.f0(coil3.svg.internal.a.x(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return a2.d(sVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, sVar.i0((i2 == 3 ? a2.b : a2.a) * 2), androidx.compose.ui.unit.b.b(0, 0, 15));
    }

    public static int b(androidx.compose.ui.layout.s sVar, ArrayList arrayList, int i, kotlin.jvm.functions.p pVar) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list4);
        int iIntValue = p0Var != null ? ((Number) pVar.invoke(p0Var, Integer.valueOf(i))).intValue() : 0;
        androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list5);
        int iIntValue2 = p0Var2 != null ? ((Number) pVar.invoke(p0Var2, Integer.valueOf(i))).intValue() : 0;
        androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list);
        int iIntValue3 = p0Var3 != null ? ((Number) pVar.invoke(p0Var3, Integer.valueOf(i))).intValue() : 0;
        androidx.compose.ui.layout.p0 p0Var4 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list2);
        int iIntValue4 = p0Var4 != null ? ((Number) pVar.invoke(p0Var4, Integer.valueOf(i))).intValue() : 0;
        androidx.compose.ui.layout.p0 p0Var5 = (androidx.compose.ui.layout.p0) kotlin.collections.p.D(list3);
        int iIntValue5 = p0Var5 != null ? ((Number) pVar.invoke(p0Var5, Integer.valueOf(i))).intValue() : 0;
        int iI0 = sVar.i0(a2.c + a2.d);
        long jB = androidx.compose.ui.unit.b.b(0, 0, 15);
        if (androidx.compose.ui.unit.a.d(jB)) {
            return androidx.compose.ui.unit.a.h(jB);
        }
        return iI0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }
}
