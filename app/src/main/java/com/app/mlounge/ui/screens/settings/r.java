package com.app.mlounge.ui.screens.settings;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.lifecycle.m0;
import com.app.mlounge.ui.viewmodel.j1;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.q {
    public final /* synthetic */ w2 A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ w2 y;
    public final /* synthetic */ p1 z;

    public /* synthetic */ r(a1 a1Var, p1 p1Var, a1 a1Var2) {
        this.y = a1Var;
        this.z = p1Var;
        this.A = a1Var2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar.b0(1997174172);
                    final p1 p1Var = this.z;
                    Iterator it = p1Var.I.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        w2 w2Var = this.y;
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                        if (zHasNext) {
                            final String str = (String) it.next();
                            String str2 = !((Set) w2Var.getValue()).contains(str) ? "Enabled" : "Disabled";
                            boolean z = !((Set) w2Var.getValue()).contains(str);
                            boolean zH = sVar.h(p1Var) | sVar.f(str);
                            Object objQ = sVar.Q();
                            if (zH || objQ == fVar) {
                                final int i = 0;
                                objQ = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.t
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj4) {
                                        int i2 = i;
                                        ((Boolean) obj4).getClass();
                                        switch (i2) {
                                            case 0:
                                                String str3 = str;
                                                str3.getClass();
                                                p1 p1Var2 = p1Var;
                                                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var2), null, null, new j1(p1Var2, str3, null, 7), 3, null);
                                                break;
                                            default:
                                                String str4 = str;
                                                str4.getClass();
                                                p1 p1Var3 = p1Var;
                                                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str4, null, 7), 3, null);
                                                break;
                                        }
                                        return kotlin.y.a;
                                    }
                                };
                                sVar.l0(objQ);
                            }
                            e0.r(str, str2, z, (kotlin.jvm.functions.l) objQ, com.imsdk.a.m(), false, sVar, 0, 32);
                        } else {
                            sVar.p(false);
                            if (((Boolean) this.A.getValue()).booleanValue()) {
                                sVar.b0(1783383787);
                                for (final String str3 : p1Var.J) {
                                    String str4 = !((Set) w2Var.getValue()).contains(str3) ? "Enabled" : "Disabled";
                                    boolean z2 = !((Set) w2Var.getValue()).contains(str3);
                                    boolean zH2 = sVar.h(p1Var) | sVar.f(str3);
                                    Object objQ2 = sVar.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        final int i2 = 1;
                                        objQ2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.t
                                            @Override // kotlin.jvm.functions.l
                                            public final Object invoke(Object obj4) {
                                                int i3 = i2;
                                                ((Boolean) obj4).getClass();
                                                switch (i3) {
                                                    case 0:
                                                        String str5 = str3;
                                                        str5.getClass();
                                                        p1 p1Var2 = p1Var;
                                                        BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var2), null, null, new j1(p1Var2, str5, null, 7), 3, null);
                                                        break;
                                                    default:
                                                        String str6 = str3;
                                                        str6.getClass();
                                                        p1 p1Var3 = p1Var;
                                                        BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str6, null, 7), 3, null);
                                                        break;
                                                }
                                                return kotlin.y.a;
                                            }
                                        };
                                        sVar.l0(objQ2);
                                    }
                                    e0.r(str3, str4, z2, (kotlin.jvm.functions.l) objQ2, com.imsdk.a.m(), false, sVar, 0, 32);
                                }
                                sVar.p(false);
                            } else {
                                sVar.b0(1783862365);
                                sVar.p(false);
                            }
                        }
                    }
                } else {
                    sVar.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                boolean z3 = true;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Set setD = kotlin.collections.o.D(new String[]{"Movies", "TV Shows", "Live TV", "Anime", "Music", "Games", "Favourites", "Downloads", "History", "Services"});
                    List list = com.app.mlounge.ui.navigation.w.f;
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((com.app.mlounge.ui.navigation.w) it2.next()).a);
                    }
                    w2 w2Var2 = this.y;
                    if (!((List) w2Var2.getValue()).isEmpty()) {
                        Set setF0 = kotlin.collections.p.f0((List) w2Var2.getValue());
                        List list2 = (List) w2Var2.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (!setF0.contains((String) obj4)) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList = kotlin.collections.p.O(list2, arrayList2);
                    }
                    List list3 = com.app.mlounge.ui.navigation.w.f;
                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(list3, 10));
                    if (iJ < 16) {
                        iJ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
                    for (Object obj5 : list3) {
                        linkedHashMap.put(((com.app.mlounge.ui.navigation.w) obj5).a, obj5);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) linkedHashMap.get((String) it3.next());
                        if (wVar != null) {
                            arrayList3.add(wVar);
                        }
                    }
                    int size = arrayList3.size();
                    sVar2.b0(-1825435526);
                    int i3 = 0;
                    for (Object obj6 : arrayList3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            kotlin.collections.q.o();
                            throw null;
                        }
                        final com.app.mlounge.ui.navigation.w wVar2 = (com.app.mlounge.ui.navigation.w) obj6;
                        String str5 = wVar2.a;
                        String str6 = wVar2.b;
                        sVar2.X(111434693, str5, null, 0);
                        boolean zContains = ((Set) this.A.getValue()).contains(str6) ^ z3;
                        boolean zContains2 = setD.contains(str6);
                        boolean z4 = i3 == 0 ? z3 : false;
                        boolean z5 = i3 == size + (-1) ? z3 : false;
                        final p1 p1Var2 = this.z;
                        boolean zH3 = sVar2.h(p1Var2) | sVar2.f(wVar2);
                        Object objQ3 = sVar2.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                        if (zH3 || objQ3 == fVar2) {
                            final int i5 = 0;
                            objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            p1 p1Var3 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            p1 p1Var4 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var4), null, null, new androidx.compose.foundation.g(p1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            p1 p1Var5 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var5), null, null, new androidx.compose.foundation.g(p1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar2.l0(objQ3);
                        }
                        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ3;
                        boolean zH4 = sVar2.h(p1Var2) | sVar2.f(wVar2);
                        Object objQ4 = sVar2.Q();
                        if (zH4 || objQ4 == fVar2) {
                            final int i6 = 1;
                            objQ4 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            p1 p1Var3 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            p1 p1Var4 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var4), null, null, new androidx.compose.foundation.g(p1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            p1 p1Var5 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var5), null, null, new androidx.compose.foundation.g(p1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar2.l0(objQ4);
                        }
                        kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ4;
                        boolean zH5 = sVar2.h(p1Var2) | sVar2.f(wVar2);
                        Object objQ5 = sVar2.Q();
                        if (zH5 || objQ5 == fVar2) {
                            final int i7 = 2;
                            objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            p1 p1Var3 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            p1 p1Var4 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var4), null, null, new androidx.compose.foundation.g(p1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            p1 p1Var5 = p1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var5), null, null, new androidx.compose.foundation.g(p1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar2.l0(objQ5);
                        }
                        e0.l(wVar2, zContains, zContains2, z4, z5, aVar, aVar2, (kotlin.jvm.functions.a) objQ5, sVar2, 0);
                        sVar2.p(false);
                        i3 = i4;
                        z3 = true;
                    }
                    sVar2.p(false);
                    z5.b("↑ First visible item is the default page on launch", androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 16, 8), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).l, sVar2, 54, 0, 131064);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ r(p1 p1Var, a1 a1Var, a1 a1Var2) {
        this.z = p1Var;
        this.y = a1Var;
        this.A = a1Var2;
    }
}
