package androidx.compose.ui.text;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.compose.animation.s0;
import androidx.datastore.core.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ y(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        e eVar;
        j jVar = null;
        jVar = null;
        switch (this.e) {
            case 0:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new androidx.compose.ui.geometry.b(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj3 = list.get(1);
                Float f2 = obj3 != null ? (Float) obj3 : null;
                f2.getClass();
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L));
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj4 = list2.get(i);
                    androidx.compose.ui.text.intl.a aVar = (kotlin.jvm.internal.l.a(obj4, Boolean.FALSE) || obj4 == null) ? null : (androidx.compose.ui.text.intl.a) ((kotlin.jvm.functions.l) c0.z.z).invoke(obj4);
                    aVar.getClass();
                    arrayList.add(aVar);
                }
                return new androidx.compose.ui.text.intl.b(arrayList);
            case 2:
                obj.getClass();
                String str = (String) obj;
                androidx.compose.ui.text.intl.c.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (kotlin.jvm.internal.l.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new androidx.compose.ui.text.intl.a(localeForLanguageTag);
            case 3:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                String str2 = obj5 != null ? (String) obj5 : null;
                str2.getClass();
                Object obj6 = list3.get(1);
                return new k(str2, (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (k0) ((kotlin.jvm.functions.l) c0.i.z).invoke(obj6));
            case 4:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f3 = androidx.compose.ui.text.style.f.b;
                b0 b0Var = c0.B;
                Boolean bool = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj7, bool);
                androidx.compose.ui.text.style.f fVar = obj7 != null ? (androidx.compose.ui.text.style.f) b0Var.y.invoke(obj7) : null;
                fVar.getClass();
                float f4 = fVar.a;
                Object obj8 = list4.get(1);
                b0 b0Var2 = c0.C;
                kotlin.jvm.internal.l.a(obj8, bool);
                androidx.compose.ui.text.style.h hVar = obj8 != null ? (androidx.compose.ui.text.style.h) b0Var2.y.invoke(obj8) : null;
                hVar.getClass();
                int i2 = hVar.a;
                Object obj9 = list4.get(2);
                b0 b0Var3 = c0.D;
                kotlin.jvm.internal.l.a(obj9, bool);
                androidx.compose.ui.text.style.g gVar = obj9 != null ? (androidx.compose.ui.text.style.g) b0Var3.y.invoke(obj9) : null;
                gVar.getClass();
                return new androidx.compose.ui.text.style.i(f4, i2, gVar.a);
            case 5:
                obj.getClass();
                float fFloatValue2 = ((Float) obj).floatValue();
                androidx.compose.ui.text.style.f.a(fFloatValue2);
                return new androidx.compose.ui.text.style.f(fFloatValue2);
            case 6:
                obj.getClass();
                return new androidx.compose.ui.text.style.h(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                i iVar = obj10 != null ? (i) obj10 : null;
                iVar.getClass();
                Object obj11 = list5.get(2);
                Integer num = obj11 != null ? (Integer) obj11 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj12 = list5.get(3);
                Integer num2 = obj12 != null ? (Integer) obj12 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj13 = list5.get(4);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                switch (iVar.ordinal()) {
                    case 0:
                        Object obj14 = list5.get(1);
                        s sVar = (kotlin.jvm.internal.l.a(obj14, Boolean.FALSE) || obj14 == null) ? null : (s) ((kotlin.jvm.functions.l) c0.g.z).invoke(obj14);
                        sVar.getClass();
                        eVar = new e(iIntValue, str3, sVar, iIntValue2);
                        break;
                    case 1:
                        Object obj15 = list5.get(1);
                        e0 e0Var = (kotlin.jvm.internal.l.a(obj15, Boolean.FALSE) || obj15 == null) ? null : (e0) ((kotlin.jvm.functions.l) c0.h.z).invoke(obj15);
                        e0Var.getClass();
                        eVar = new e(iIntValue, str3, e0Var, iIntValue2);
                        break;
                    case 2:
                        Object obj16 = list5.get(1);
                        o0 o0Var = (kotlin.jvm.internal.l.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (o0) ((kotlin.jvm.functions.l) c0.c.z).invoke(obj16);
                        o0Var.getClass();
                        eVar = new e(iIntValue, str3, o0Var, iIntValue2);
                        break;
                    case 3:
                        Object obj17 = list5.get(1);
                        n0 n0Var = (kotlin.jvm.internal.l.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (n0) ((kotlin.jvm.functions.l) c0.d.z).invoke(obj17);
                        n0Var.getClass();
                        eVar = new e(iIntValue, str3, n0Var, iIntValue2);
                        break;
                    case 4:
                        Object obj18 = list5.get(1);
                        l lVar = (kotlin.jvm.internal.l.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (l) ((kotlin.jvm.functions.l) c0.e.z).invoke(obj18);
                        lVar.getClass();
                        eVar = new e(iIntValue, str3, lVar, iIntValue2);
                        break;
                    case 5:
                        Object obj19 = list5.get(1);
                        k kVar = (kotlin.jvm.internal.l.a(obj19, Boolean.FALSE) || obj19 == null) ? null : (k) ((kotlin.jvm.functions.l) c0.f.z).invoke(obj19);
                        kVar.getClass();
                        eVar = new e(iIntValue, str3, kVar, iIntValue2);
                        break;
                    case 6:
                        Object obj20 = list5.get(1);
                        String str4 = obj20 != null ? (String) obj20 : null;
                        str4.getClass();
                        eVar = new e(iIntValue, str3, new g0(str4), iIntValue2);
                        break;
                    default:
                        coil3.g.a();
                        return null;
                }
                return eVar;
            case 8:
                obj.getClass();
                return new androidx.compose.ui.text.style.g(((Integer) obj).intValue());
            case 9:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new o0(str5);
            case 10:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new n0(str6);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                b0 b0Var4 = c0.q;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj21, bool2);
                androidx.compose.ui.text.style.k kVar2 = obj21 != null ? (androidx.compose.ui.text.style.k) b0Var4.y.invoke(obj21) : null;
                kVar2.getClass();
                int i3 = kVar2.a;
                Object obj22 = list6.get(1);
                b0 b0Var5 = c0.r;
                kotlin.jvm.internal.l.a(obj22, bool2);
                androidx.compose.ui.text.style.m mVar = obj22 != null ? (androidx.compose.ui.text.style.m) b0Var5.y.invoke(obj22) : null;
                mVar.getClass();
                int i4 = mVar.a;
                Object obj23 = list6.get(2);
                androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
                b0 b0Var6 = c0.v;
                kotlin.jvm.internal.l.a(obj23, bool2);
                androidx.compose.ui.unit.o oVar = obj23 != null ? (androidx.compose.ui.unit.o) b0Var6.y.invoke(obj23) : null;
                oVar.getClass();
                long j = oVar.a;
                Object obj24 = list6.get(3);
                androidx.compose.ui.text.style.q qVar = androidx.compose.ui.text.style.q.c;
                androidx.compose.ui.text.style.q qVar2 = (kotlin.jvm.internal.l.a(obj24, bool2) || obj24 == null) ? null : (androidx.compose.ui.text.style.q) ((kotlin.jvm.functions.l) c0.l.z).invoke(obj24);
                Object obj25 = list6.get(4);
                u uVar = (kotlin.jvm.internal.l.a(obj25, bool2) || obj25 == null) ? null : (u) ((kotlin.jvm.functions.l) d0.a.z).invoke(obj25);
                Object obj26 = list6.get(5);
                androidx.compose.ui.text.style.i iVar2 = androidx.compose.ui.text.style.i.d;
                androidx.compose.ui.text.style.i iVar3 = (kotlin.jvm.internal.l.a(obj26, bool2) || obj26 == null) ? null : (androidx.compose.ui.text.style.i) ((kotlin.jvm.functions.l) c0.A.z).invoke(obj26);
                Object obj27 = list6.get(6);
                androidx.compose.ui.text.style.e eVar2 = (kotlin.jvm.internal.l.a(obj27, bool2) || obj27 == null) ? null : (androidx.compose.ui.text.style.e) ((kotlin.jvm.functions.l) d0.c.z).invoke(obj27);
                eVar2.getClass();
                int i5 = eVar2.a;
                Object obj28 = list6.get(7);
                b0 b0Var7 = c0.s;
                kotlin.jvm.internal.l.a(obj28, bool2);
                androidx.compose.ui.text.style.d dVar = obj28 != null ? (androidx.compose.ui.text.style.d) b0Var7.y.invoke(obj28) : null;
                dVar.getClass();
                int i6 = dVar.a;
                Object obj29 = list6.get(8);
                return new s(i3, i4, j, qVar2, uVar, iVar3, i5, i6, (kotlin.jvm.internal.l.a(obj29, bool2) || obj29 == null) ? null : (androidx.compose.ui.text.style.s) ((kotlin.jvm.functions.l) d0.d.z).invoke(obj29));
            case 12:
                obj.getClass();
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i7 = androidx.compose.ui.graphics.t.j;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.l.a(obj30, bool3);
                androidx.compose.ui.graphics.t tVar = obj30 != null ? obj30.equals(bool3) ? new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.i) : new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.a0.c(((Integer) obj30).intValue())) : null;
                tVar.getClass();
                long j2 = tVar.a;
                Object obj31 = list7.get(1);
                androidx.compose.ui.unit.p[] pVarArr2 = androidx.compose.ui.unit.o.b;
                kotlin.jvm.functions.l lVar2 = c0.v.y;
                kotlin.jvm.internal.l.a(obj31, bool3);
                androidx.compose.ui.unit.o oVar2 = obj31 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj31) : null;
                oVar2.getClass();
                long j3 = oVar2.a;
                Object obj32 = list7.get(2);
                androidx.compose.ui.text.font.k kVar3 = androidx.compose.ui.text.font.k.y;
                androidx.compose.ui.text.font.k kVar4 = (kotlin.jvm.internal.l.a(obj32, bool3) || obj32 == null) ? null : (androidx.compose.ui.text.font.k) ((kotlin.jvm.functions.l) c0.m.z).invoke(obj32);
                Object obj33 = list7.get(3);
                androidx.compose.ui.text.font.i iVar4 = (kotlin.jvm.internal.l.a(obj33, bool3) || obj33 == null) ? null : (androidx.compose.ui.text.font.i) ((kotlin.jvm.functions.l) c0.t.z).invoke(obj33);
                Object obj34 = list7.get(4);
                androidx.compose.ui.text.font.j jVar2 = (kotlin.jvm.internal.l.a(obj34, bool3) || obj34 == null) ? null : (androidx.compose.ui.text.font.j) ((kotlin.jvm.functions.l) c0.u.z).invoke(obj34);
                Object obj35 = list7.get(6);
                String str7 = obj35 != null ? (String) obj35 : null;
                Object obj36 = list7.get(7);
                kotlin.jvm.internal.l.a(obj36, bool3);
                androidx.compose.ui.unit.o oVar3 = obj36 != null ? (androidx.compose.ui.unit.o) lVar2.invoke(obj36) : null;
                oVar3.getClass();
                long j4 = oVar3.a;
                Object obj37 = list7.get(8);
                androidx.compose.ui.text.style.a aVar2 = (kotlin.jvm.internal.l.a(obj37, bool3) || obj37 == null) ? null : (androidx.compose.ui.text.style.a) ((kotlin.jvm.functions.l) c0.n.z).invoke(obj37);
                Object obj38 = list7.get(9);
                androidx.compose.ui.text.style.p pVar = (kotlin.jvm.internal.l.a(obj38, bool3) || obj38 == null) ? null : (androidx.compose.ui.text.style.p) ((kotlin.jvm.functions.l) c0.k.z).invoke(obj38);
                Object obj39 = list7.get(10);
                androidx.compose.ui.text.intl.b bVar = androidx.compose.ui.text.intl.b.z;
                androidx.compose.ui.text.intl.b bVar2 = (kotlin.jvm.internal.l.a(obj39, bool3) || obj39 == null) ? null : (androidx.compose.ui.text.intl.b) ((kotlin.jvm.functions.l) c0.y.z).invoke(obj39);
                Object obj40 = list7.get(11);
                kotlin.jvm.internal.l.a(obj40, bool3);
                androidx.compose.ui.graphics.t tVar2 = obj40 != null ? obj40.equals(bool3) ? new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.i) : new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.a0.c(((Integer) obj40).intValue())) : null;
                tVar2.getClass();
                long j5 = tVar2.a;
                Object obj41 = list7.get(12);
                androidx.compose.ui.text.style.l lVar3 = (kotlin.jvm.internal.l.a(obj41, bool3) || obj41 == null) ? null : (androidx.compose.ui.text.style.l) ((kotlin.jvm.functions.l) c0.j.z).invoke(obj41);
                Object obj42 = list7.get(13);
                androidx.compose.ui.graphics.m0 m0Var = androidx.compose.ui.graphics.m0.d;
                return new e0(j2, j3, kVar4, iVar4, jVar2, (androidx.compose.ui.text.font.r) null, str7, j4, aVar2, pVar, bVar2, j5, lVar3, (kotlin.jvm.internal.l.a(obj42, bool3) || obj42 == null) ? null : (androidx.compose.ui.graphics.m0) ((kotlin.jvm.functions.l) c0.o.z).invoke(obj42), 49184);
            case 13:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                Boolean bool4 = obj43 != null ? (Boolean) obj43 : null;
                bool4.getClass();
                boolean zBooleanValue = bool4.booleanValue();
                Object obj44 = list8.get(1);
                boolean zA = kotlin.jvm.internal.l.a(obj44, Boolean.FALSE);
                androidx.compose.foundation.text.input.internal.o oVar4 = d0.b;
                if (!zA && obj44 != null) {
                    jVar = (j) ((kotlin.jvm.functions.l) oVar4.z).invoke(obj44);
                }
                jVar.getClass();
                return new u(jVar.a, zBooleanValue);
            case 14:
                obj.getClass();
                return new j(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                return new androidx.compose.ui.text.style.e(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                androidx.compose.ui.text.style.r rVar = (kotlin.jvm.internal.l.a(obj45, Boolean.FALSE) || obj45 == null) ? null : (androidx.compose.ui.text.style.r) ((kotlin.jvm.functions.l) d0.e.z).invoke(obj45);
                rVar.getClass();
                int i8 = rVar.a;
                Object obj46 = list9.get(1);
                Boolean bool5 = obj46 != null ? (Boolean) obj46 : null;
                bool5.getClass();
                return new androidx.compose.ui.text.style.s(i8, bool5.booleanValue());
            case 17:
                obj.getClass();
                return new androidx.compose.ui.text.style.r(((Integer) obj).intValue());
            case 18:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new e1(absolutePath);
            case 19:
                ((Context) obj).getClass();
                return kotlin.collections.w.e;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return androidx.compose.runtime.j.m(new StringBuilder("  "), ((androidx.datastore.preferences.core.d) entry.getKey()).a, " = ", value instanceof byte[] ? kotlin.collections.o.x((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 21:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 22:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 23:
                ((androidx.lifecycle.viewmodel.c) obj).getClass();
                return new androidx.navigation.m();
            case 24:
                androidx.navigation.t tVar3 = (androidx.navigation.t) obj;
                tVar3.getClass();
                return tVar3.z;
            case 25:
                androidx.navigation.t tVar4 = (androidx.navigation.t) obj;
                tVar4.getClass();
                if (!(tVar4 instanceof androidx.navigation.v)) {
                    return null;
                }
                androidx.fragment.app.h hVar2 = ((androidx.navigation.v) tVar4).C;
                return hVar2.z(hVar2.y);
            case 26:
                return new androidx.navigation.compose.a(androidx.lifecycle.m0.b((androidx.lifecycle.viewmodel.c) obj));
            case 27:
                androidx.navigation.t tVar5 = ((androidx.navigation.i) ((androidx.compose.animation.v) obj).c()).y;
                tVar5.getClass();
                int i9 = androidx.navigation.t.B;
                for (androidx.navigation.t tVar6 : androidx.navigation.f.b((androidx.navigation.compose.h) tVar5)) {
                }
                return null;
            case 28:
                return s0.b(androidx.compose.animation.core.e.o(700, 6, null), 2);
            default:
                return s0.c(androidx.compose.animation.core.e.o(700, 6, null), 2);
        }
    }
}
