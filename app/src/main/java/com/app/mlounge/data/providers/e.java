package com.app.mlounge.data.providers;

import android.content.Context;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = fVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e eVar = new e(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
        eVar.L$0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x03e3 A[PHI: r0
  0x03e3: PHI (r0v9 com.google.gson.f) = (r0v8 com.google.gson.f), (r0v8 com.google.gson.f), (r0v8 com.google.gson.f), (r0v45 com.google.gson.f) binds: [B:139:0x033a, B:141:0x033e, B:146:0x034e, B:316:0x03e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x022c A[PHI: r2
  0x022c: PHI (r2v96 java.lang.String) = (r2v92 java.lang.String), (r2v94 java.lang.String), (r2v97 java.lang.String) binds: [B:92:0x023a, B:95:0x0242, B:85:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        String str;
        String strA;
        com.google.gson.f fVar;
        ArrayList arrayList;
        com.google.gson.j jVarO;
        com.google.gson.f fVarM;
        com.google.gson.f fVar2;
        String str2;
        com.google.gson.f fVar3;
        com.google.gson.g gVarL;
        String strH;
        ArrayList arrayList2;
        String str3;
        Class cls;
        String str4;
        String strH2;
        String str5;
        String str6;
        ArrayList arrayList3;
        String str7;
        String str8;
        Class cls2;
        com.google.gson.j jVarO2;
        com.google.gson.f fVarM2;
        String strH3;
        String strH4;
        String strH5;
        com.google.gson.j jVarO3;
        e eVar = this;
        String str9 = "data";
        kotlin.collections.w wVar = kotlin.collections.w.e;
        String str10 = "Castle";
        String str11 = "languageId";
        str10 = "episodes";
        CoroutineScope coroutineScope = (CoroutineScope) eVar.L$0;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = eVar.label;
        if (i == 0) {
            kotlin.a.e(obj);
            m1 m1Var = eVar.this$0.tmdbHelper;
            String str12 = eVar.$tmdbId;
            String str13 = eVar.$mediaType;
            eVar.L$0 = coroutineScope;
            eVar.label = 1;
            objC = m1Var.c(str12, str13, eVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objC = obj;
        }
        j1 j1Var = (j1) objC;
        if (j1Var != null) {
            try {
                com.google.gson.j jVarG = f.g(eVar.this$0);
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "Castle", "keyJson=" + jVarG);
                if (jVarG == null) {
                    com.app.mlounge.util.a.a("D", "Castle", "keyJson null");
                    return wVar;
                }
                com.google.gson.g gVarL2 = jVarG.l("data");
                String strH6 = gVarL2 != null ? gVarL2.h() : null;
                com.app.mlounge.util.a.a("D", "Castle", "securityKey=" + strH6);
                if (strH6 == null) {
                    com.app.mlounge.util.a.a("D", "Castle", "securityKey null");
                    return wVar;
                }
                com.google.gson.g gVarL3 = jVarG.l("code");
                try {
                    if (gVarL3 != null) {
                        try {
                            if (gVarL3.c() == 200) {
                                if (j1Var.b() != null) {
                                    strA = j1Var.a() + " " + j1Var.b();
                                } else {
                                    strA = j1Var.a();
                                }
                                String strF = eVar.this$0.f("https://api.hlowb.com/film-api/v1.1.0/movie/searchByKeyword?channel=IndiaA&clientType=1&keyword=" + URLEncoder.encode(strA, "UTF-8") + "&lang=en-US&mode=1&packageName=com.external.castle&page=1&size=30", null);
                                com.app.mlounge.util.a.a("D", "Castle", "searchCipher=" + (strF != null ? kotlin.text.k.e0(30, strF) : null) + "...");
                                if (strF == null) {
                                    com.app.mlounge.util.a.a("D", "Castle", "searchCipher is null");
                                    return wVar;
                                }
                                String strB = f.b(eVar.this$0, strF, strH6);
                                com.app.mlounge.util.a.a("D", "Castle", "searchDecrypted=" + kotlin.text.k.e0(50, strB) + "...");
                                Class cls3 = com.google.gson.j.class;
                                com.google.gson.j jVar = (com.google.gson.j) eVar.this$0.gson.d(cls3, strB);
                                com.app.mlounge.util.a.a("D", "Castle", "searchData=" + jVar);
                                com.google.gson.f fVarM3 = (jVar == null || (jVarO3 = jVar.o("data")) == null) ? null : jVarO3.m("rows");
                                com.app.mlounge.util.a.a("D", "Castle", "rows=" + (fVarM3 != null ? new Integer(fVarM3.e.size()) : null));
                                if (fVarM3 != null) {
                                    ArrayList arrayList4 = fVarM3.e;
                                    String lowerCase = j1Var.a().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    Iterator it = arrayList4.iterator();
                                    it.getClass();
                                    String str14 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            fVar = fVarM3;
                                            arrayList = arrayList4;
                                            break;
                                        }
                                        com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                                        fVar = fVarM3;
                                        com.google.gson.g gVarL4 = jVarE.l("title");
                                        if (gVarL4 == null || (strH4 = gVarL4.h()) == null) {
                                            com.google.gson.g gVarL5 = jVarE.l("name");
                                            strH4 = gVarL5 != null ? gVarL5.h() : null;
                                            if (strH4 == null) {
                                                strH4 = "";
                                            }
                                        }
                                        arrayList = arrayList4;
                                        String lowerCase2 = strH4.toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                        if (kotlin.text.k.z(lowerCase2, lowerCase, false) || kotlin.text.k.z(lowerCase, lowerCase2, false)) {
                                            com.google.gson.g gVarL6 = jVarE.l("id");
                                            if (gVarL6 == null || (strH5 = gVarL6.h()) == null) {
                                                com.google.gson.g gVarL7 = jVarE.l("redirectId");
                                                strH5 = gVarL7 != null ? gVarL7.h() : null;
                                                if (strH5 != null) {
                                                    str14 = strH5;
                                                } else {
                                                    com.google.gson.g gVarL8 = jVarE.l("redirectIdStr");
                                                    if (gVarL8 != null) {
                                                        strH5 = gVarL8.h();
                                                        str14 = strH5;
                                                    } else {
                                                        str14 = null;
                                                    }
                                                }
                                            } else {
                                                str14 = strH5;
                                            }
                                            if (str14 != null) {
                                                break;
                                            }
                                        }
                                        fVarM3 = fVar;
                                        arrayList4 = arrayList;
                                    }
                                    if (str14 == null && arrayList.size() > 0) {
                                        com.google.gson.j jVarE2 = fVar.i().e();
                                        com.google.gson.g gVarL9 = jVarE2.l("id");
                                        if (gVarL9 == null || (strH3 = gVarL9.h()) == null) {
                                            com.google.gson.g gVarL10 = jVarE2.l("redirectId");
                                            strH3 = gVarL10 != null ? gVarL10.h() : null;
                                            if (strH3 == null) {
                                                com.google.gson.g gVarL11 = jVarE2.l("redirectIdStr");
                                                strH3 = gVarL11 != null ? gVarL11.h() : null;
                                            }
                                        }
                                        str14 = strH3;
                                    }
                                    if (str14 == null) {
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", "Castle", "movieId null after search");
                                        return wVar;
                                    }
                                    String strF2 = eVar.this$0.f("https://api.hlowb.com/film-api/v1.9.9/movie?channel=IndiaA&clientType=1&lang=en-US&movieId=" + str14 + "&packageName=com.external.castle", null);
                                    Context context3 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.a("D", "Castle", "detailsCipher=" + (strF2 != null ? kotlin.text.k.e0(30, strF2) : null) + "...");
                                    if (strF2 == null) {
                                        com.app.mlounge.util.a.a("D", "Castle", "detailsCipher null");
                                        return wVar;
                                    }
                                    String strB2 = f.b(eVar.this$0, strF2, strH6);
                                    com.app.mlounge.util.a.a("D", "Castle", "detailsDecrypted=" + kotlin.text.k.e0(50, strB2) + "...");
                                    com.google.gson.j jVar2 = (com.google.gson.j) eVar.this$0.gson.d(cls3, strB2);
                                    com.app.mlounge.util.a.a("D", "Castle", "detailsData=" + jVar2);
                                    if (jVar2 != null && (jVarO = jVar2.o("data")) != null && (fVarM = jVarO.m(str10)) != null) {
                                        if (!kotlin.jvm.internal.l.a(eVar.$mediaType, "tv") || eVar.$season == null) {
                                            fVar2 = fVarM;
                                            str2 = null;
                                            fVar3 = fVar2;
                                        } else {
                                            com.google.gson.j jVarO4 = jVar2.o("data");
                                            com.google.gson.f fVarM4 = jVarO4 != null ? jVarO4.m("seasons") : null;
                                            if (fVarM4 != null) {
                                                Iterator it2 = fVarM4.e.iterator();
                                                it2.getClass();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        com.google.gson.g gVar = (com.google.gson.g) it2.next();
                                                        fVar2 = fVarM;
                                                        com.google.gson.g gVarL12 = gVar.e().l("number");
                                                        if (gVarL12 != null && gVarL12.c() == eVar.$season.intValue()) {
                                                            com.google.gson.g gVarL13 = gVar.e().l("movieId");
                                                            String strH7 = gVarL13 != null ? gVarL13.h() : null;
                                                            if (strH7 == null || strH7.equals(str14)) {
                                                                str2 = null;
                                                            } else {
                                                                str2 = null;
                                                                String strF3 = eVar.this$0.f("https://api.hlowb.com/film-api/v1.9.9/movie?channel=IndiaA&clientType=1&lang=en-US&movieId=" + strH7 + "&packageName=com.external.castle", null);
                                                                if (strF3 != null) {
                                                                    com.google.gson.j jVar3 = (com.google.gson.j) eVar.this$0.gson.d(cls3, f.b(eVar.this$0, strF3, strH6));
                                                                    if (jVar3 != null) {
                                                                        com.google.gson.j jVarO5 = jVar3.o("data");
                                                                        if (jVarO5 == null || (fVarM2 = jVarO5.m(str10)) == null) {
                                                                            fVarM2 = fVar2;
                                                                        }
                                                                        str14 = strH7;
                                                                        fVar3 = fVarM2;
                                                                    }
                                                                }
                                                            }
                                                            fVar3 = fVar2;
                                                        }
                                                        fVarM = fVar2;
                                                        it2 = it2;
                                                    } else {
                                                        fVar2 = fVarM;
                                                        str2 = null;
                                                        fVar3 = fVar2;
                                                    }
                                                }
                                            } else {
                                                fVar2 = fVarM;
                                                str2 = null;
                                                fVar3 = fVar2;
                                            }
                                        }
                                        ArrayList arrayList5 = fVar3.e;
                                        if (kotlin.jvm.internal.l.a(eVar.$mediaType, "tv") && eVar.$episode != null) {
                                            Iterator it3 = arrayList5.iterator();
                                            it3.getClass();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    com.google.gson.g gVar2 = (com.google.gson.g) it3.next();
                                                    com.google.gson.g gVarL14 = gVar2.e().l("number");
                                                    if (gVarL14 != null && gVarL14.c() == eVar.$episode.intValue()) {
                                                        com.google.gson.g gVarL15 = gVar2.e().l("id");
                                                        if (gVarL15 != null) {
                                                            strH = gVarL15.h();
                                                            break;
                                                        }
                                                    }
                                                }
                                                strH = str2;
                                                break;
                                            }
                                        }
                                        if (arrayList5.size() <= 0 || (gVarL = fVar3.i().e().l("id")) == null) {
                                            strH = str2;
                                            break;
                                        }
                                        strH = gVarL.h();
                                        if (strH != null) {
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it4 = arrayList5.iterator();
                                            it4.getClass();
                                            while (it4.hasNext()) {
                                                com.google.gson.g gVar3 = (com.google.gson.g) it4.next();
                                                com.google.gson.g gVarL16 = gVar3.e().l("id");
                                                if (kotlin.jvm.internal.l.a(gVarL16 != null ? gVarL16.h() : str2, strH)) {
                                                    com.google.gson.f fVarM5 = gVar3.e().m("tracks");
                                                    if (fVarM5 == null) {
                                                        break;
                                                    }
                                                    Iterator it5 = fVarM5.e.iterator();
                                                    it5.getClass();
                                                    while (it5.hasNext()) {
                                                        arrayList6.add(((com.google.gson.g) it5.next()).e());
                                                    }
                                                    break;
                                                }
                                            }
                                            ArrayList arrayList7 = new ArrayList();
                                            Iterator it6 = arrayList6.iterator();
                                            while (true) {
                                                it6 = it6;
                                                str10 = str10;
                                                arrayList2 = arrayList7;
                                                str3 = str9;
                                                cls = cls3;
                                                str4 = strH6;
                                                if (!it6.hasNext()) {
                                                    break;
                                                }
                                                try {
                                                    com.google.gson.j jVar4 = (com.google.gson.j) it6.next();
                                                    String str15 = strH;
                                                    com.google.gson.g gVarL17 = jVar4.l("languageName");
                                                    if (gVarL17 == null || (strH2 = gVarL17.h()) == null) {
                                                        com.google.gson.g gVarL18 = jVar4.l("abbreviate");
                                                        strH2 = gVarL18 != null ? gVarL18.h() : null;
                                                        if (strH2 == null) {
                                                            strH2 = "Unknown";
                                                        }
                                                    }
                                                    String str16 = strH2;
                                                    com.google.gson.g gVarL19 = jVar4.l("existIndividualVideo");
                                                    if (gVarL19 != null) {
                                                        String str17 = str14;
                                                        if (gVarL19.b()) {
                                                            str11 = str11;
                                                            if (jVar4.l(str11) != null) {
                                                                String strH8 = jVar4.l(str11).h();
                                                                com.google.gson.e eVar2 = eVar.this$0.gson;
                                                                try {
                                                                    com.google.gson.j jVar5 = new com.google.gson.j();
                                                                    jVar5.k("mode", "1");
                                                                    jVar5.k("appMarket", "GuanWang");
                                                                    jVar5.k("clientType", "1");
                                                                    jVar5.k("woolUser", "false");
                                                                    jVar5.k("apkSignKey", "ED0955EB04E67A1D9F3305B95454FED485261475");
                                                                    jVar5.k("androidVersion", "13");
                                                                    str5 = str17;
                                                                    jVar5.k("movieId", str5);
                                                                    str6 = str15;
                                                                    jVar5.k("episodeId", str6);
                                                                    jVar5.k(str11, strH8);
                                                                    jVar5.k("isNewUser", "true");
                                                                    jVar5.k("resolution", String.valueOf(2));
                                                                    jVar5.k("packageName", "com.external.castle");
                                                                    String strG = eVar2.g(jVar5);
                                                                    eVar = this;
                                                                    try {
                                                                        String strF4 = eVar.this$0.f("https://api.hlowb.com/film-api/v2.0.1/movie/getVideo2?clientType=1&packageName=com.external.castle&channel=IndiaA&lang=en-US", strG);
                                                                        if (strF4 == null) {
                                                                            str9 = str3;
                                                                            strH6 = str4;
                                                                            cls3 = cls;
                                                                        } else {
                                                                            str8 = str4;
                                                                            cls2 = cls;
                                                                            com.google.gson.j jVar6 = (com.google.gson.j) eVar.this$0.gson.d(cls2, f.b(eVar.this$0, strF4, str8));
                                                                            if (jVar6 != null) {
                                                                                str7 = str3;
                                                                                jVarO2 = jVar6.o(str7);
                                                                            } else {
                                                                                str7 = str3;
                                                                                jVarO2 = null;
                                                                            }
                                                                            if (jVarO2 != null) {
                                                                                arrayList3 = arrayList2;
                                                                                arrayList3.addAll(f.e(eVar.this$0, jVarO2, str16));
                                                                            } else {
                                                                                str9 = str7;
                                                                                strH6 = str8;
                                                                                cls3 = cls2;
                                                                            }
                                                                        }
                                                                        str14 = str5;
                                                                        strH = str6;
                                                                        arrayList7 = arrayList2;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    eVar = this;
                                                                }
                                                            } else {
                                                                str11 = str11;
                                                                strH = str15;
                                                                arrayList7 = arrayList2;
                                                                str10 = str10;
                                                                str9 = str3;
                                                                strH6 = str4;
                                                                cls3 = cls;
                                                                str14 = str17;
                                                            }
                                                        } else {
                                                            str5 = str17;
                                                            eVar = eVar;
                                                            str11 = str11;
                                                            str6 = str15;
                                                            arrayList3 = arrayList2;
                                                            str7 = str3;
                                                            str8 = str4;
                                                            cls2 = cls;
                                                        }
                                                    } else {
                                                        str5 = str14;
                                                        str11 = str11;
                                                        str6 = str15;
                                                        arrayList3 = arrayList2;
                                                        str7 = str3;
                                                        str8 = str4;
                                                        cls2 = cls;
                                                        eVar = eVar;
                                                    }
                                                    str9 = str7;
                                                    strH6 = str8;
                                                    cls3 = cls2;
                                                    str11 = str11;
                                                    eVar = eVar;
                                                    str10 = str10;
                                                    str14 = str5;
                                                    strH = str6;
                                                    arrayList7 = arrayList3;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                }
                                                e = e;
                                            }
                                            String str18 = str14;
                                            eVar = eVar;
                                            if (arrayList2.isEmpty()) {
                                                com.google.gson.e eVar3 = eVar.this$0.gson;
                                                try {
                                                    com.google.gson.j jVar7 = new com.google.gson.j();
                                                    jVar7.k("mode", "1");
                                                    jVar7.k("appMarket", "GuanWang");
                                                    jVar7.k("clientType", "1");
                                                    jVar7.k("woolUser", "false");
                                                    jVar7.k("apkSignKey", "ED0955EB04E67A1D9F3305B95454FED485261475");
                                                    jVar7.k("androidVersion", "13");
                                                    jVar7.k("movieId", str18);
                                                    jVar7.k("episodeId", strH);
                                                    jVar7.k("isNewUser", "true");
                                                    jVar7.k("resolution", String.valueOf(2));
                                                    jVar7.k("packageName", "com.external.castle");
                                                    String strF5 = this.this$0.f("https://api.hlowb.com/film-api/v2.0.1/movie/getVideo2?clientType=1&packageName=com.external.castle&channel=IndiaA&lang=en-US", eVar3.g(jVar7));
                                                    if (strF5 != null) {
                                                        com.google.gson.j jVar8 = (com.google.gson.j) this.this$0.gson.d(cls, f.b(this.this$0, strF5, str4));
                                                        com.google.gson.j jVarO6 = jVar8 != null ? jVar8.o(str3) : null;
                                                        if (jVarO6 != null) {
                                                            arrayList2.addAll(f.e(this.this$0, jVarO6, "Shared"));
                                                            return arrayList2;
                                                        }
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                }
                                            }
                                            return arrayList2;
                                        }
                                    }
                                }
                                str = str10;
                                Context context4 = com.app.mlounge.util.a.a;
                                androidx.room.b0.h("Error: ", e.getMessage(), "E", str);
                                return wVar;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str10 = str10;
                        }
                    }
                    str = "Castle";
                    try {
                        com.app.mlounge.util.a.a("D", str, "code not 200: " + jVarG.l("code"));
                        return wVar;
                    } catch (Exception e6) {
                        e = e6;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Exception e8) {
                e = e8;
                str = "Castle";
            }
        }
        return wVar;
    }
}
