package com.app.mlounge.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import com.app.mlounge.ui.components.u0;
import com.app.mlounge.ui.screens.player.k0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ kotlin.d D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ kotlin.d H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ kotlin.jvm.functions.r y;
    public final /* synthetic */ w2 z;

    public /* synthetic */ y(androidx.navigation.y yVar, kotlin.jvm.functions.r rVar, a1 a1Var, kotlin.jvm.functions.w wVar, a1 a1Var2, kotlin.jvm.functions.s sVar, CoroutineScope coroutineScope, kotlin.jvm.functions.w wVar2, a1 a1Var3, a1 a1Var4, androidx.compose.ui.focus.y yVar2, a1 a1Var5) {
        this.B = yVar;
        this.y = rVar;
        this.A = a1Var;
        this.C = wVar;
        this.z = a1Var2;
        this.H = sVar;
        this.I = coroutineScope;
        this.D = wVar2;
        this.E = a1Var3;
        this.F = a1Var4;
        this.J = yVar2;
        this.G = a1Var5;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                final androidx.navigation.y yVar = (androidx.navigation.y) this.B;
                kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.C;
                kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) this.H;
                CoroutineScope coroutineScope = (CoroutineScope) this.I;
                kotlin.jvm.functions.w wVar2 = (kotlin.jvm.functions.w) this.D;
                w2 w2Var = (w2) this.E;
                w2 w2Var2 = (w2) this.F;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.J;
                w2 w2Var3 = (w2) this.G;
                androidx.navigation.w wVar3 = (androidx.navigation.w) obj;
                wVar3.getClass();
                String str = com.app.mlounge.ui.navigation.p.g.a;
                kotlin.jvm.functions.r rVar = this.y;
                final a1 a1Var = this.A;
                t1.p(wVar3, str, null, new androidx.compose.runtime.internal.f(true, -362629335, new m(yVar, rVar, a1Var, 0)), 254);
                final int i = 3;
                t1.p(wVar3, com.app.mlounge.ui.navigation.k.g.a, null, new androidx.compose.runtime.internal.f(true, 12014226, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str2 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        linkedHashMap.put(obj6, str2);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str3 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str4 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i2 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i3 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i4 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str5 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str3) | sVar7.h(yVar8) | sVar7.f(str5);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str3, yVar8, str5, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str3, str4, i2, i3, i4, str5, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                String str2 = com.app.mlounge.ui.navigation.j.g.a;
                List listJ = kotlin.collections.q.j(androidx.navigation.f.f("movieId", new com.app.mlounge.data.local.dao.g(20)));
                w2 w2Var4 = this.z;
                t1.p(wVar3, str2, listJ, new androidx.compose.runtime.internal.f(true, -330869583, new n(3, a1Var, w2Var4, yVar, wVar)), 252);
                final int i2 = 6;
                t1.p(wVar3, com.app.mlounge.ui.navigation.u.g.a, null, new androidx.compose.runtime.internal.f(true, -673753392, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i2) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i3 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i4 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i5 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i3, i4, i5, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                final int i3 = 7;
                t1.p(wVar3, com.app.mlounge.ui.navigation.g.g.a, null, new androidx.compose.runtime.internal.f(true, -1016637201, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i3) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i4 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i5 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i6 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i4, i5, i6, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                final int i4 = 1;
                t1.p(wVar3, com.app.mlounge.ui.navigation.f.g.a, kotlin.collections.q.k(androidx.navigation.f.f("platform", new t(4)), androidx.navigation.f.f("gameSlug", new t(5))), new androidx.compose.runtime.internal.f(true, -1359521010, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.v
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        androidx.compose.animation.p pVar = (androidx.compose.animation.p) obj2;
                        androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                        switch (i4) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null) {
                                    int i5 = bundleA.getInt("personId");
                                    androidx.navigation.y yVar3 = yVar;
                                    boolean zH = sVar2.h(yVar3);
                                    Object objQ = sVar2.Q();
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                    if (zH || objQ == fVar) {
                                        objQ = new androidx.navigation.k(yVar3, 10);
                                        sVar2.l0(objQ);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                                    boolean zH2 = sVar2.h(yVar3);
                                    Object objQ2 = sVar2.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        objQ2 = new l(yVar3, 2);
                                        sVar2.l0(objQ2);
                                    }
                                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                                    boolean zH3 = sVar2.h(yVar3);
                                    Object objQ3 = sVar2.Q();
                                    if (zH3 || objQ3 == fVar) {
                                        objQ3 = new l(yVar3, 3);
                                        sVar2.l0(objQ3);
                                    }
                                    com.app.mlounge.ui.screens.person.a.a(i5, aVar, lVar, (kotlin.jvm.functions.l) objQ3, null, sVar2, 0);
                                }
                                break;
                            default:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                androidx.navigation.internal.c cVar = iVar.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string = bundleA2.getString("platform")) == null) {
                                    string = "snes";
                                }
                                String str3 = string;
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("gameSlug")) != null) {
                                    androidx.navigation.y yVar4 = yVar;
                                    boolean zH4 = sVar3.h(yVar4);
                                    Object objQ4 = sVar3.Q();
                                    if (zH4 || objQ4 == androidx.compose.runtime.n.a) {
                                        objQ4 = new androidx.navigation.k(yVar4, 7);
                                        sVar3.l0(objQ4);
                                    }
                                    com.app.mlounge.ui.screens.games.a.a(string2, str3, (kotlin.jvm.functions.a) objQ4, null, sVar3, 0);
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                t1.p(wVar3, com.app.mlounge.ui.navigation.t.g.a, kotlin.collections.q.j(androidx.navigation.f.f("tvId", new t(6))), new androidx.compose.runtime.internal.f(true, -1702404819, new n(0, a1Var, w2Var4, yVar, wVar)), 252);
                t1.p(wVar3, com.app.mlounge.ui.navigation.i.g.a, null, new androidx.compose.runtime.internal.f(true, -2045288628, new androidx.compose.ui.text.platform.c(sVar, 3)), 254);
                final int i5 = 0;
                t1.p(wVar3, com.app.mlounge.ui.navigation.c.g.a, null, new androidx.compose.runtime.internal.f(true, 1906794859, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i5) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i6 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i7 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i8 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i6, i7, i8, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.d.g.a, kotlin.collections.q.j(androidx.navigation.f.f("animeId", new com.app.mlounge.data.local.dao.g(12))), new androidx.compose.runtime.internal.f(true, 1563911050, new n(1, a1Var, w2Var4, yVar, wVar)), 252);
                final int i6 = 1;
                t1.p(wVar3, com.app.mlounge.ui.navigation.a.g.a, null, new androidx.compose.runtime.internal.f(true, -302737122, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i6) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i7 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i8 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i9 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i7, i8, i9, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.b.g.a, kotlin.collections.q.j(androidx.navigation.f.f("videoId", new com.app.mlounge.data.local.dao.g(13))), new androidx.compose.runtime.internal.f(true, -645620931, new n(2, a1Var, w2Var4, yVar, wVar)), 252);
                final int i7 = 2;
                t1.p(wVar3, com.app.mlounge.ui.navigation.l.g.a, null, new androidx.compose.runtime.internal.f(true, -988504740, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i7) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i8 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i9 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i10 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i8, i9, i10, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.m.g.a, kotlin.collections.q.j(androidx.navigation.f.f("albumUrl", new com.app.mlounge.data.local.dao.g(14))), new androidx.compose.runtime.internal.f(true, -1331388549, new m(yVar, coroutineScope, wVar2, 1)), 252);
                final int i8 = 4;
                t1.p(wVar3, com.app.mlounge.ui.navigation.n.g.a, kotlin.collections.q.j(androidx.navigation.f.f("artistUrl", new com.app.mlounge.data.local.dao.g(15))), new androidx.compose.runtime.internal.f(true, -1674272358, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i8) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i9 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i10 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i11 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i9, i10, i11, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                t1.p(wVar3, com.app.mlounge.ui.navigation.v.g.a, null, new androidx.compose.runtime.internal.f(true, -2017156167, new q(yVar, rVar, a1Var, w2Var, w2Var2, yVar2, 0)), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.e.g.a, null, new androidx.compose.runtime.internal.f(true, 1934927320, new androidx.compose.ui.text.platform.c(wVar, 4)), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.h.g.a, null, new androidx.compose.runtime.internal.f(true, 1592043511, new q(yVar, rVar, a1Var, w2Var, w2Var3, yVar2, 1)), 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.q.g.a, null, a.a, 254);
                t1.p(wVar3, com.app.mlounge.ui.navigation.r.g.a, null, a.b, 254);
                final int i9 = 5;
                t1.p(wVar3, "player?url={url}&title={title}&headers={headers}&contentType={contentType}&streamType={streamType}&tmdbId={tmdbId}&season={season}&episode={episode}&contentKey={contentKey}&fallbackUrl={fallbackUrl}", kotlin.collections.q.k(androidx.navigation.f.f("url", new com.app.mlounge.data.local.dao.g(16)), androidx.navigation.f.f("title", new com.app.mlounge.data.local.dao.g(17)), androidx.navigation.f.f("headers", new com.app.mlounge.data.local.dao.g(18)), androidx.navigation.f.f("contentType", new com.app.mlounge.data.local.dao.g(19)), androidx.navigation.f.f("streamType", new com.app.mlounge.data.local.dao.g(21)), androidx.navigation.f.f("tmdbId", new com.app.mlounge.data.local.dao.g(22)), androidx.navigation.f.f("season", new com.app.mlounge.data.local.dao.g(23)), androidx.navigation.f.f("episode", new com.app.mlounge.data.local.dao.g(24)), androidx.navigation.f.f("contentKey", new com.app.mlounge.data.local.dao.g(25)), androidx.navigation.f.f("fallbackUrl", new com.app.mlounge.data.local.dao.g(26))), new androidx.compose.runtime.internal.f(true, 1952766687, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.o
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        switch (i9) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = sVar2.h(yVar3);
                                Object objQ = sVar2.Q();
                                if (zH || objQ == androidx.compose.runtime.n.a) {
                                    objQ = new b(yVar3, a1Var, 14);
                                    sVar2.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.m.b((kotlin.jvm.functions.l) objQ, null, sVar2, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = sVar3.h(yVar4);
                                Object objQ2 = sVar3.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.n.a) {
                                    objQ2 = new b(yVar4, a1Var, 19);
                                    sVar3.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.h.b((kotlin.jvm.functions.l) objQ2, null, sVar3, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = sVar4.h(yVar5);
                                Object objQ3 = sVar4.Q();
                                a1 a1Var2 = a1Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new b(yVar5, a1Var2, 4);
                                    sVar4.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = sVar4.h(yVar5);
                                Object objQ4 = sVar4.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new b(yVar5, a1Var2, 5);
                                    sVar4.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.b.c(lVar, (kotlin.jvm.functions.l) objQ4, null, sVar4, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = sVar5.h(yVar6);
                                Object objQ5 = sVar5.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.n.a) {
                                    objQ5 = new b(yVar6, a1Var, 18);
                                    sVar5.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, sVar5, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = sVar6.h(yVar7);
                                    Object objQ6 = sVar6.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 4);
                                        sVar6.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = sVar6.h(yVar7);
                                    Object objQ7 = sVar6.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new b(yVar7, a1Var, 13);
                                        sVar6.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.b.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, sVar6, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.J(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listU = kotlin.text.k.U(string4, new String[]{"\n"}, 6);
                                    int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(listU, 10));
                                    if (iJ < 16) {
                                        iJ = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iJ);
                                    Iterator it = listU.iterator();
                                    while (it.hasNext()) {
                                        List listU2 = kotlin.text.k.U((String) it.next(), new String[]{"="}, 2);
                                        Object obj6 = listU2.get(0);
                                        String str3 = (String) kotlin.collections.p.E(1, listU2);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                String str4 = string5;
                                Bundle bundleA6 = cVar.a();
                                String str5 = (bundleA6 == null || (string8 = bundleA6.getString("streamType")) == null) ? "" : string8;
                                Bundle bundleA7 = cVar.a();
                                int i10 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i11 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i12 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str6 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? r4 : string7;
                                Bundle bundleA11 = cVar.a();
                                if (bundleA11 == null || (string6 = bundleA11.getString("fallbackUrl")) == null) {
                                    string6 = "";
                                }
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = sVar7.h(yVar8);
                                Object objQ8 = sVar7.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    sVar7.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = sVar7.f(str4) | sVar7.h(yVar8) | sVar7.f(str6);
                                Object objQ9 = sVar7.Q();
                                if (zF || objQ9 == fVar3) {
                                    n nVar = new n(str4, yVar8, str6, a1Var, 5);
                                    sVar7.l0(nVar);
                                    objQ9 = nVar;
                                }
                                k0.l(string2, string3, linkedHashMap, str4, str5, i10, i11, i12, str6, string6, aVar2, (kotlin.jvm.functions.r) objQ9, null, sVar7, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = sVar8.h(yVar9);
                                Object objQ10 = sVar8.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.n.a) {
                                    objQ10 = new b(yVar9, a1Var, 8);
                                    sVar8.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, sVar8, 0);
                                break;
                            default:
                                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = sVar9.h(yVar10);
                                Object objQ11 = sVar9.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.n.a) {
                                    objQ11 = new c(yVar10, a1Var, 1);
                                    sVar9.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, sVar9, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                t1.p(wVar3, com.app.mlounge.ui.navigation.s.g.a, kotlin.collections.q.k(androidx.navigation.f.f("type", new com.app.mlounge.data.local.dao.g(27)), androidx.navigation.f.f("id", new com.app.mlounge.data.local.dao.g(28)), androidx.navigation.f.f("title", new com.app.mlounge.data.local.dao.g(29)), androidx.navigation.f.f("season", new t(0)), androidx.navigation.f.f("episode", new t(1)), androidx.navigation.f.f("mode", new t(2))), new androidx.compose.runtime.internal.f(true, 1609882878, new u(0, yVar, wVar)), 252);
                final int i10 = 0;
                t1.p(wVar3, com.app.mlounge.ui.navigation.o.g.a, kotlin.collections.q.j(androidx.navigation.f.f("personId", new t(3))), new androidx.compose.runtime.internal.f(true, 1266999069, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.v
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        androidx.compose.animation.p pVar = (androidx.compose.animation.p) obj2;
                        androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                        switch (i10) {
                            case 0:
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null) {
                                    int i11 = bundleA.getInt("personId");
                                    androidx.navigation.y yVar3 = yVar;
                                    boolean zH = sVar2.h(yVar3);
                                    Object objQ = sVar2.Q();
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                    if (zH || objQ == fVar) {
                                        objQ = new androidx.navigation.k(yVar3, 10);
                                        sVar2.l0(objQ);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                                    boolean zH2 = sVar2.h(yVar3);
                                    Object objQ2 = sVar2.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        objQ2 = new l(yVar3, 2);
                                        sVar2.l0(objQ2);
                                    }
                                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                                    boolean zH3 = sVar2.h(yVar3);
                                    Object objQ3 = sVar2.Q();
                                    if (zH3 || objQ3 == fVar) {
                                        objQ3 = new l(yVar3, 3);
                                        sVar2.l0(objQ3);
                                    }
                                    com.app.mlounge.ui.screens.person.a.a(i11, aVar, lVar, (kotlin.jvm.functions.l) objQ3, null, sVar2, 0);
                                }
                                break;
                            default:
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                androidx.navigation.internal.c cVar = iVar.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string = bundleA2.getString("platform")) == null) {
                                    string = "snes";
                                }
                                String str3 = string;
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("gameSlug")) != null) {
                                    androidx.navigation.y yVar4 = yVar;
                                    boolean zH4 = sVar3.h(yVar4);
                                    Object objQ4 = sVar3.Q();
                                    if (zH4 || objQ4 == androidx.compose.runtime.n.a) {
                                        objQ4 = new androidx.navigation.k(yVar4, 7);
                                        sVar3.l0(objQ4);
                                    }
                                    com.app.mlounge.ui.screens.games.a.a(string2, str3, (kotlin.jvm.functions.a) objQ4, null, sVar3, 0);
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                break;
            default:
                List list = (List) this.B;
                Map map = (Map) this.C;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.D;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.E;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.F;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.G;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.H;
                com.app.mlounge.ui.viewmodel.s sVar2 = (com.app.mlounge.ui.viewmodel.s) this.I;
                Context context = (Context) this.J;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                hVar.q(list.size(), new androidx.compose.foundation.text.c0(12, new com.app.mlounge.ui.components.c0(17), list), new u0(5, list), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.history.e(list, map, lVar, lVar2, this.y, lVar3, lVar4, list, aVar, sVar2, context, this.z, this.A)));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ y(List list, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.r rVar, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, com.app.mlounge.ui.viewmodel.s sVar, Context context, a1 a1Var, a1 a1Var2) {
        this.B = list;
        this.C = map;
        this.D = lVar;
        this.E = lVar2;
        this.y = rVar;
        this.F = lVar3;
        this.G = lVar4;
        this.H = aVar;
        this.I = sVar;
        this.J = context;
        this.z = a1Var;
        this.A = a1Var2;
    }
}
