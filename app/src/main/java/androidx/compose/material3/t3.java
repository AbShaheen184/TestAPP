package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t3 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ t3(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.t tVar;
        androidx.compose.ui.text.e0 e0Var = null;
        k0Var = null;
        androidx.compose.ui.text.k0 k0Var = null;
        e0Var = null;
        int i = 0;
        switch (this.e) {
            case 0:
                return kotlin.y.a;
            case 1:
                androidx.compose.animation.core.n0 n0Var = (androidx.compose.animation.core.n0) obj;
                n0Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                n0Var.a(300, fValueOf).b = androidx.compose.material3.tokens.q.b;
                n0Var.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                n0Var.a(1800, fValueOf2);
                n0Var.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                n0Var.a(3300, fValueOf3);
                n0Var.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                n0Var.a(4800, fValueOf4);
                n0Var.a(6000, fValueOf4);
                return kotlin.y.a;
            case 2:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.l;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[5];
                ((androidx.compose.ui.semantics.a0) obj).b(zVar, Boolean.TRUE);
                return kotlin.y.a;
            case 3:
                float f = androidx.compose.material3.internal.b.a;
                return kotlin.y.a;
            case 4:
                androidx.compose.ui.node.z1 z1Var = (androidx.compose.ui.node.z1) obj;
                z1Var.getClass();
                androidx.compose.material3.internal.n0 n0Var2 = (androidx.compose.material3.internal.n0) z1Var;
                n0Var2.M = false;
                androidx.compose.ui.node.l.m(n0Var2);
                return Boolean.FALSE;
            case 5:
                androidx.compose.animation.z zVar2 = ((androidx.compose.runtime.c1) obj).a;
                if (zVar2 != null) {
                    zVar2.invoke();
                }
                return kotlin.y.a;
            case 6:
                return new androidx.compose.runtime.saveable.e((Map) obj);
            case 7:
                return obj;
            case 8:
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    ?? r0 = androidx.compose.runtime.snapshots.n.i;
                    int size = r0.size();
                    while (i < size) {
                        ((kotlin.jvm.functions.l) r0.get(i)).invoke(obj);
                        i++;
                    }
                }
                return kotlin.y.a;
            case 9:
                t3 t3Var = androidx.compose.runtime.snapshots.n.a;
                return kotlin.y.a;
            case 10:
                return Boolean.valueOf(!(((androidx.compose.ui.text.b) obj) instanceof androidx.compose.ui.text.s));
            case 11:
                androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(pVar.b);
                sb.append(", ");
                return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, pVar.c, ')');
            case 12:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) androidx.compose.ui.text.c0.h.z;
                Boolean bool = Boolean.FALSE;
                androidx.compose.ui.text.e0 e0Var2 = (kotlin.jvm.internal.l.a(obj2, bool) || obj2 == null) ? null : (androidx.compose.ui.text.e0) lVar.invoke(obj2);
                Object obj3 = list.get(1);
                androidx.compose.ui.text.e0 e0Var3 = (kotlin.jvm.internal.l.a(obj3, bool) || obj3 == null) ? null : (androidx.compose.ui.text.e0) lVar.invoke(obj3);
                Object obj4 = list.get(2);
                androidx.compose.ui.text.e0 e0Var4 = (kotlin.jvm.internal.l.a(obj4, bool) || obj4 == null) ? null : (androidx.compose.ui.text.e0) lVar.invoke(obj4);
                Object obj5 = list.get(3);
                if (!kotlin.jvm.internal.l.a(obj5, bool) && obj5 != null) {
                    e0Var = (androidx.compose.ui.text.e0) lVar.invoke(obj5);
                }
                return new androidx.compose.ui.text.k0(e0Var2, e0Var3, e0Var4, e0Var);
            case 13:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((kotlin.jvm.functions.l) androidx.compose.ui.text.c0.a.z).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new androidx.compose.ui.text.g(list3, str);
            case 14:
                obj.getClass();
                return new androidx.compose.ui.text.style.l(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list4 = (List) obj;
                return new androidx.compose.ui.text.style.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 16:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
                kotlin.jvm.functions.l lVar2 = androidx.compose.ui.text.c0.v.y;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj8, bool2);
                androidx.compose.ui.unit.o oVar = obj8 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj8) : null;
                oVar.getClass();
                long j = oVar.a;
                Object obj9 = list5.get(1);
                kotlin.jvm.internal.l.a(obj9, bool2);
                androidx.compose.ui.unit.o oVar2 = obj9 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj9) : null;
                oVar2.getClass();
                return new androidx.compose.ui.text.style.q(j, oVar2.a);
            case 17:
                obj.getClass();
                return new androidx.compose.ui.text.font.k(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                return new androidx.compose.ui.text.style.a(((Float) obj).floatValue());
            case 19:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new androidx.compose.ui.text.l0(androidx.compose.ui.text.d0.b(iIntValue, num2.intValue()));
            case 20:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = androidx.compose.ui.graphics.t.j;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj12, bool3);
                if (obj12 != null) {
                    tVar = kotlin.jvm.internal.l.a(obj12, Boolean.FALSE) ? new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.i) : new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.a0.c(((Integer) obj12).intValue()));
                } else {
                    tVar = null;
                }
                tVar.getClass();
                long j2 = tVar.a;
                Object obj13 = list7.get(1);
                androidx.compose.ui.text.b0 b0Var = androidx.compose.ui.text.c0.x;
                kotlin.jvm.internal.l.a(obj13, bool3);
                androidx.compose.ui.geometry.b bVar = obj13 != null ? (androidx.compose.ui.geometry.b) b0Var.y.invoke(obj13) : null;
                bVar.getClass();
                long j3 = bVar.a;
                Object obj14 = list7.get(2);
                Float f2 = obj14 != null ? (Float) obj14 : null;
                f2.getClass();
                return new androidx.compose.ui.graphics.m0(j2, j3, f2.floatValue());
            case 21:
                obj.getClass();
                return new androidx.compose.ui.text.style.k(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                androidx.compose.foundation.text.input.internal.o oVar3 = androidx.compose.ui.text.c0.i;
                if (!kotlin.jvm.internal.l.a(obj16, Boolean.FALSE) && obj16 != null) {
                    k0Var = (androidx.compose.ui.text.k0) ((kotlin.jvm.functions.l) oVar3.z).invoke(obj16);
                }
                return new androidx.compose.ui.text.l(str2, k0Var);
            case 23:
                obj.getClass();
                return new androidx.compose.ui.text.style.m(((Integer) obj).intValue());
            case 24:
                obj.getClass();
                return new androidx.compose.ui.text.style.d(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    androidx.compose.ui.text.e eVar = (kotlin.jvm.internal.l.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (androidx.compose.ui.text.e) ((kotlin.jvm.functions.l) androidx.compose.ui.text.c0.b.z).invoke(obj17);
                    eVar.getClass();
                    arrayList.add(eVar);
                    i++;
                }
                return arrayList;
            case 26:
                obj.getClass();
                return new androidx.compose.ui.text.font.i(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                return new androidx.compose.ui.text.font.j(((Integer) obj).intValue());
            case 28:
                Boolean bool4 = Boolean.FALSE;
                if (kotlin.jvm.internal.l.a(obj, bool4)) {
                    return new androidx.compose.ui.unit.o(androidx.compose.ui.unit.o.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f3 = obj18 != null ? (Float) obj18 : null;
                f3.getClass();
                float fFloatValue = f3.floatValue();
                Object obj19 = list10.get(1);
                androidx.compose.ui.text.b0 b0Var2 = androidx.compose.ui.text.c0.w;
                kotlin.jvm.internal.l.a(obj19, bool4);
                androidx.compose.ui.unit.p pVar2 = obj19 != null ? (androidx.compose.ui.unit.p) b0Var2.y.invoke(obj19) : null;
                pVar2.getClass();
                return new androidx.compose.ui.unit.o(coil3.svg.internal.a.H(fFloatValue, pVar2.a));
            default:
                if (kotlin.jvm.internal.l.a(obj, 0)) {
                    return new androidx.compose.ui.unit.p(8589934592L);
                }
                return kotlin.jvm.internal.l.a(obj, 1) ? new androidx.compose.ui.unit.p(4294967296L) : new androidx.compose.ui.unit.p(0L);
        }
    }
}
