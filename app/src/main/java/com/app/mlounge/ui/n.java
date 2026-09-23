package com.app.mlounge.ui;

import android.os.Bundle;
import androidx.compose.animation.core.v1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ Object z;

    public /* synthetic */ n(int i, a1 a1Var, w2 w2Var, androidx.navigation.y yVar, kotlin.jvm.functions.w wVar) {
        this.e = i;
        this.y = yVar;
        this.z = wVar;
        this.A = w2Var;
        this.B = a1Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        final String string;
        final String string2;
        String str;
        switch (this.e) {
            case 0:
                final kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.z;
                w2 w2Var = (w2) this.A;
                androidx.navigation.i iVar = (androidx.navigation.i) obj2;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar.getClass();
                Bundle bundleA = iVar.E.a();
                if (bundleA != null) {
                    final int i = bundleA.getInt("tvId");
                    final androidx.navigation.y yVar = this.y;
                    boolean zH = sVar.h(yVar);
                    Object objQ = sVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (zH || objQ == fVar) {
                        objQ = new androidx.navigation.k(yVar, 3);
                        sVar.l0(objQ);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                    boolean zH2 = sVar.h(yVar);
                    Object objQ2 = sVar.Q();
                    final a1 a1Var = this.B;
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new b(yVar, a1Var, 6);
                        sVar.l0(objQ2);
                    }
                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                    boolean zH3 = sVar.h(yVar);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == fVar) {
                        objQ3 = new b(yVar, a1Var, 7);
                        sVar.l0(objQ3);
                    }
                    kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ3;
                    boolean zF = sVar.f(wVar) | sVar.d(i);
                    Object objQ4 = sVar.Q();
                    if (zF || objQ4 == fVar) {
                        final int i2 = 0;
                        objQ4 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.h
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i2) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        str2.getClass();
                                        str3.getClass();
                                        Integer numValueOf = Integer.valueOf(i);
                                        wVar.c(str2, str3, (Map) obj7, "tv", null, numValueOf, 0, 0, "");
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str4.getClass();
                                        str5.getClass();
                                        Integer numValueOf2 = Integer.valueOf(i);
                                        wVar.c(str4, str5, (Map) obj7, "movie", null, numValueOf2, 0, 0, "");
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ4);
                    }
                    kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ4;
                    boolean zF2 = sVar.f(w2Var) | sVar.f(wVar) | sVar.h(yVar);
                    Object objQ5 = sVar.Q();
                    if (zF2 || objQ5 == fVar) {
                        objQ5 = new i(wVar, yVar, w2Var, a1Var);
                        sVar.l0(objQ5);
                    }
                    kotlin.jvm.functions.s sVar2 = (kotlin.jvm.functions.s) objQ5;
                    boolean zH4 = sVar.h(yVar);
                    Object objQ6 = sVar.Q();
                    if (zH4 || objQ6 == fVar) {
                        objQ6 = new kotlin.jvm.functions.s() { // from class: com.app.mlounge.ui.j
                            @Override // kotlin.jvm.functions.s
                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                String str2 = (String) obj5;
                                String str3 = (String) obj6;
                                String str4 = (String) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                int iIntValue2 = ((Integer) obj9).intValue();
                                str2.getClass();
                                str3.getClass();
                                str4.getClass();
                                a1 a1Var2 = a1Var;
                                if (!f0.b(a1Var2)) {
                                    a1Var2.setValue(Boolean.TRUE);
                                    com.app.mlounge.ui.navigation.s.g.getClass();
                                    androidx.navigation.y.b(yVar, com.app.mlounge.ui.navigation.s.a(str2, str3, str4, iIntValue, "download", iIntValue2));
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ6);
                    }
                    com.app.mlounge.ui.screens.tvshows.a.c(i, aVar, lVar, lVar2, qVar, sVar2, (kotlin.jvm.functions.s) objQ6, null, sVar, 0);
                }
                return kotlin.y.a;
            case 1:
                final kotlin.jvm.functions.w wVar2 = (kotlin.jvm.functions.w) this.z;
                w2 w2Var2 = (w2) this.A;
                androidx.navigation.i iVar2 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar2.getClass();
                Bundle bundleA2 = iVar2.E.a();
                if (bundleA2 != null && (string = bundleA2.getString("animeId")) != null) {
                    androidx.navigation.y yVar2 = this.y;
                    boolean zH5 = sVar3.h(yVar2);
                    Object objQ7 = sVar3.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zH5 || objQ7 == fVar2) {
                        objQ7 = new androidx.navigation.k(yVar2, 8);
                        sVar3.l0(objQ7);
                    }
                    kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ7;
                    boolean zH6 = sVar3.h(yVar2);
                    Object objQ8 = sVar3.Q();
                    a1 a1Var2 = this.B;
                    if (zH6 || objQ8 == fVar2) {
                        objQ8 = new b(yVar2, a1Var2, 20);
                        sVar3.l0(objQ8);
                    }
                    kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ8;
                    boolean zF3 = sVar3.f(wVar2) | sVar3.f(string);
                    Object objQ9 = sVar3.Q();
                    if (zF3 || objQ9 == fVar2) {
                        final int i3 = 1;
                        objQ9 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.e
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i3) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        str2.getClass();
                                        str3.getClass();
                                        wVar2.c(str2, str3, (Map) obj7, "adult", null, 0, 0, 0, string);
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str4.getClass();
                                        str5.getClass();
                                        wVar2.c(str4, str5, (Map) obj7, "anime", null, 0, 0, 0, string);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ9);
                    }
                    kotlin.jvm.functions.q qVar2 = (kotlin.jvm.functions.q) objQ9;
                    boolean zF4 = sVar3.f(w2Var2) | sVar3.f(wVar2) | sVar3.h(yVar2);
                    Object objQ10 = sVar3.Q();
                    if (zF4 || objQ10 == fVar2) {
                        n nVar = new n(wVar2, yVar2, w2Var2, a1Var2, 4);
                        sVar3.l0(nVar);
                        objQ10 = nVar;
                    }
                    com.app.mlounge.ui.screens.anime.m.a(string, aVar2, lVar3, qVar2, (kotlin.jvm.functions.r) objQ10, null, sVar3, 0, 32);
                }
                return kotlin.y.a;
            case 2:
                final kotlin.jvm.functions.w wVar3 = (kotlin.jvm.functions.w) this.z;
                final w2 w2Var3 = (w2) this.A;
                androidx.navigation.i iVar3 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar3.getClass();
                Bundle bundleA3 = iVar3.E.a();
                if (bundleA3 != null && (string2 = bundleA3.getString("videoId")) != null) {
                    final androidx.navigation.y yVar3 = this.y;
                    boolean zH7 = sVar4.h(yVar3);
                    Object objQ11 = sVar4.Q();
                    androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                    if (zH7 || objQ11 == fVar3) {
                        objQ11 = new androidx.navigation.k(yVar3, 2);
                        sVar4.l0(objQ11);
                    }
                    kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) objQ11;
                    boolean zF5 = sVar4.f(wVar3) | sVar4.f(string2);
                    Object objQ12 = sVar4.Q();
                    if (zF5 || objQ12 == fVar3) {
                        final int i4 = 0;
                        objQ12 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.e
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i4) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        str2.getClass();
                                        str3.getClass();
                                        wVar3.c(str2, str3, (Map) obj7, "adult", null, 0, 0, 0, string2);
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str4.getClass();
                                        str5.getClass();
                                        wVar3.c(str4, str5, (Map) obj7, "anime", null, 0, 0, 0, string2);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar4.l0(objQ12);
                    }
                    kotlin.jvm.functions.q qVar3 = (kotlin.jvm.functions.q) objQ12;
                    boolean zF6 = sVar4.f(w2Var3) | sVar4.f(wVar3) | sVar4.h(yVar3);
                    Object objQ13 = sVar4.Q();
                    if (zF6 || objQ13 == fVar3) {
                        final int i5 = 0;
                        final a1 a1Var3 = this.B;
                        objQ13 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.g
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i5) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        String str4 = (String) obj7;
                                        str2.getClass();
                                        str3.getClass();
                                        str4.getClass();
                                        if (((Boolean) w2Var3.getValue()).booleanValue()) {
                                            wVar3.c("", str4, null, "adult", null, 0, 0, 0, str3);
                                        } else {
                                            a1 a1Var4 = a1Var3;
                                            if (!f0.b(a1Var4)) {
                                                a1Var4.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar3, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str2, str3, str4, 0, 0, 56));
                                            }
                                        }
                                        break;
                                    default:
                                        String str5 = (String) obj5;
                                        String str6 = (String) obj6;
                                        String str7 = (String) obj7;
                                        str5.getClass();
                                        str6.getClass();
                                        str7.getClass();
                                        if (((Boolean) w2Var3.getValue()).booleanValue()) {
                                            Integer numW = kotlin.text.r.w(str6);
                                            wVar3.c("", str7, null, "movie", null, Integer.valueOf(numW != null ? numW.intValue() : 0), 0, 0, "");
                                        } else {
                                            a1 a1Var5 = a1Var3;
                                            if (!f0.b(a1Var5)) {
                                                a1Var5.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar3, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str5, str6, str7, 0, 0, 56));
                                            }
                                        }
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar4.l0(objQ13);
                    }
                    com.app.mlounge.ui.screens.adult.h.a(string2, aVar3, qVar3, (kotlin.jvm.functions.q) objQ13, null, sVar4, 0);
                }
                return kotlin.y.a;
            case 3:
                final kotlin.jvm.functions.w wVar4 = (kotlin.jvm.functions.w) this.z;
                final w2 w2Var4 = (w2) this.A;
                androidx.navigation.i iVar4 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar4.getClass();
                Bundle bundleA4 = iVar4.E.a();
                if (bundleA4 != null) {
                    final int i6 = bundleA4.getInt("movieId");
                    final androidx.navigation.y yVar4 = this.y;
                    boolean zH8 = sVar5.h(yVar4);
                    Object objQ14 = sVar5.Q();
                    androidx.compose.runtime.f fVar4 = androidx.compose.runtime.n.a;
                    if (zH8 || objQ14 == fVar4) {
                        objQ14 = new androidx.navigation.k(yVar4, 5);
                        sVar5.l0(objQ14);
                    }
                    kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ14;
                    boolean zH9 = sVar5.h(yVar4);
                    Object objQ15 = sVar5.Q();
                    final a1 a1Var4 = this.B;
                    if (zH9 || objQ15 == fVar4) {
                        objQ15 = new b(yVar4, a1Var4, 15);
                        sVar5.l0(objQ15);
                    }
                    kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ15;
                    boolean zH10 = sVar5.h(yVar4);
                    Object objQ16 = sVar5.Q();
                    if (zH10 || objQ16 == fVar4) {
                        objQ16 = new b(yVar4, a1Var4, 16);
                        sVar5.l0(objQ16);
                    }
                    kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ16;
                    boolean zF7 = sVar5.f(wVar4) | sVar5.d(i6);
                    Object objQ17 = sVar5.Q();
                    if (zF7 || objQ17 == fVar4) {
                        final int i7 = 1;
                        objQ17 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.h
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i7) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        str2.getClass();
                                        str3.getClass();
                                        Integer numValueOf = Integer.valueOf(i6);
                                        wVar4.c(str2, str3, (Map) obj7, "tv", null, numValueOf, 0, 0, "");
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        str4.getClass();
                                        str5.getClass();
                                        Integer numValueOf2 = Integer.valueOf(i6);
                                        wVar4.c(str4, str5, (Map) obj7, "movie", null, numValueOf2, 0, 0, "");
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar5.l0(objQ17);
                    }
                    kotlin.jvm.functions.q qVar4 = (kotlin.jvm.functions.q) objQ17;
                    boolean zF8 = sVar5.f(w2Var4) | sVar5.f(wVar4) | sVar5.h(yVar4);
                    Object objQ18 = sVar5.Q();
                    if (zF8 || objQ18 == fVar4) {
                        final int i8 = 1;
                        kotlin.jvm.functions.q qVar5 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.g
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i8) {
                                    case 0:
                                        String str2 = (String) obj5;
                                        String str3 = (String) obj6;
                                        String str4 = (String) obj7;
                                        str2.getClass();
                                        str3.getClass();
                                        str4.getClass();
                                        if (((Boolean) w2Var4.getValue()).booleanValue()) {
                                            wVar4.c("", str4, null, "adult", null, 0, 0, 0, str3);
                                        } else {
                                            a1 a1Var5 = a1Var4;
                                            if (!f0.b(a1Var5)) {
                                                a1Var5.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar4, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str2, str3, str4, 0, 0, 56));
                                            }
                                        }
                                        break;
                                    default:
                                        String str5 = (String) obj5;
                                        String str6 = (String) obj6;
                                        String str7 = (String) obj7;
                                        str5.getClass();
                                        str6.getClass();
                                        str7.getClass();
                                        if (((Boolean) w2Var4.getValue()).booleanValue()) {
                                            Integer numW = kotlin.text.r.w(str6);
                                            wVar4.c("", str7, null, "movie", null, Integer.valueOf(numW != null ? numW.intValue() : 0), 0, 0, "");
                                        } else {
                                            a1 a1Var6 = a1Var4;
                                            if (!f0.b(a1Var6)) {
                                                a1Var6.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar4, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str5, str6, str7, 0, 0, 56));
                                            }
                                        }
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar5.l0(qVar5);
                        objQ18 = qVar5;
                    }
                    kotlin.jvm.functions.q qVar6 = (kotlin.jvm.functions.q) objQ18;
                    boolean zH11 = sVar5.h(yVar4);
                    Object objQ19 = sVar5.Q();
                    if (zH11 || objQ19 == fVar4) {
                        objQ19 = new androidx.compose.foundation.contextmenu.i(4, yVar4, a1Var4);
                        sVar5.l0(objQ19);
                    }
                    kotlin.jvm.functions.q qVar7 = (kotlin.jvm.functions.q) objQ19;
                    boolean zH12 = sVar5.h(yVar4) | sVar5.d(i6);
                    Object objQ20 = sVar5.Q();
                    if (zH12 || objQ20 == fVar4) {
                        objQ20 = new v1(yVar4, i6, a1Var4, 9);
                        sVar5.l0(objQ20);
                    }
                    com.app.mlounge.ui.screens.movies.a.c(i6, aVar4, lVar4, lVar5, qVar4, qVar6, qVar7, (kotlin.jvm.functions.p) objQ20, null, sVar5, 0);
                }
                return kotlin.y.a;
            case 4:
                kotlin.jvm.functions.w wVar5 = (kotlin.jvm.functions.w) this.z;
                w2 w2Var5 = (w2) this.A;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                Integer num = (Integer) obj4;
                int iIntValue = num.intValue();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                if (((Boolean) w2Var5.getValue()).booleanValue()) {
                    wVar5.c("", str4, null, "anime", null, 0, 0, num, str3);
                } else {
                    a1 a1Var5 = this.B;
                    if (!f0.b(a1Var5)) {
                        a1Var5.setValue(Boolean.TRUE);
                        androidx.navigation.y.b(this.y, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str2, str3, str4, 0, iIntValue, 40));
                    }
                }
                return kotlin.y.a;
            default:
                String str5 = (String) this.z;
                androidx.navigation.y yVar5 = this.y;
                String str6 = (String) this.A;
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                String str7 = (String) obj4;
                str7.getClass();
                a1 a1Var6 = this.B;
                if (!f0.b(a1Var6)) {
                    a1Var6.setValue(Boolean.TRUE);
                    try {
                        String strB0 = kotlin.text.k.b0(kotlin.text.k.b0(str7, " - "), " S");
                        if (str5.equals("anime")) {
                            str = strB0 + " - Episode " + iIntValue4;
                        } else {
                            str = strB0 + " S" + iIntValue3 + "E" + iIntValue4;
                        }
                        com.app.mlounge.ui.navigation.s sVar6 = com.app.mlounge.ui.navigation.s.g;
                        String strD0 = str5.equals("anime") ? kotlin.text.k.d0(str6, "-ep-") : String.valueOf(iIntValue2);
                        String str8 = str;
                        sVar6.getClass();
                        yVar5.a(com.app.mlounge.ui.navigation.s.a(str5, strD0, str8, iIntValue3, "play", iIntValue4), new l(yVar5, 0));
                    } finally {
                        a1Var6.setValue(Boolean.FALSE);
                    }
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ n(Object obj, androidx.navigation.y yVar, Object obj2, a1 a1Var, int i) {
        this.e = i;
        this.z = obj;
        this.y = yVar;
        this.A = obj2;
        this.B = a1Var;
    }
}
