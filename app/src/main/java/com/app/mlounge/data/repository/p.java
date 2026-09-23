package com.app.mlounge.data.repository;

import android.content.Context;
import com.app.mlounge.data.providers.f1;
import com.app.mlounge.data.remote.api.ChqApi;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int B;
    public Object C;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i, a aVar, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = aVar;
        this.z = rVar;
        this.A = str;
        this.B = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new p(this.B, (a) this.C, (r) this.z, (String) this.A, dVar);
            case 1:
                return new p(this.B, (r) this.z, (String) this.A, (String) this.C, dVar);
            default:
                return new p((b2) this.z, this.B, (TmdbSeason) this.A, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((p) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v55, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v60 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List listJ;
        String string;
        String strConcat;
        Object next;
        String strConcat2;
        Object next2;
        String str;
        String str2;
        kotlin.text.g gVarS;
        String str3;
        String string2;
        String strConcat3;
        String str4;
        String string3;
        androidx.collection.m0 m0Var;
        String str5;
        String str6;
        String string4;
        ?? r10;
        String strConcat4;
        String str7;
        String str8;
        Integer numW;
        Object objG;
        Object tvSeason;
        MutableStateFlow mutableStateFlow;
        switch (this.e) {
            case 0:
                int i = this.B;
                String str9 = (String) this.A;
                r rVar = (r) this.z;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objG = obj;
                    return (EpornerSearchDetails) objG;
                }
                kotlin.a.e(obj);
                int iOrdinal = ((a) this.C).ordinal();
                if (iOrdinal == 0) {
                    com.app.mlounge.data.providers.s sVar = rVar.b;
                    sVar.getClass();
                    str9.getClass();
                    String lowerCase = str9.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int i3 = 0;
                    int i4 = i - 1;
                    String str10 = "https://www.xvideos.com/?k=" + kotlin.text.r.s(lowerCase, " ", "+", false) + "&p=" + i4;
                    Context context = com.app.mlounge.util.a.a;
                    String str11 = "D";
                    com.app.mlounge.util.a.a("D", "EpornerScraper", "searchVideos: ".concat(str10));
                    String strB = sVar.b(str10);
                    if (strB != null) {
                        ArrayList arrayList = new ArrayList();
                        kotlin.text.g gVarS2 = androidx.compose.runtime.j.s("setDataSearch\\s*\\(\\s*(\\[[\\s\\S]+?])\\s*\\)", 0, strB, strB);
                        if (gVarS2 != null) {
                            androidx.collection.m0 m0Var2 = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("\\{[^{}]+\\}"), (String) ((kotlin.collections.d0) gVarS2.a()).get(1)));
                            while (m0Var2.hasNext()) {
                                String strGroup = ((kotlin.text.g) m0Var2.next()).a.group();
                                strGroup.getClass();
                                Pattern patternCompile = Pattern.compile("\"u\"\\s*:\\s*\"(/video[^\"]+)\"");
                                patternCompile.getClass();
                                Matcher matcher = patternCompile.matcher(strGroup);
                                matcher.getClass();
                                kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, i3, strGroup);
                                if (gVarA == null || (str5 = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) == null) {
                                    m0Var = m0Var2;
                                } else {
                                    m0Var = m0Var2;
                                    kotlin.text.g gVarS3 = androidx.compose.runtime.j.s("\"t\"\\s*:\\s*\"([^\"]{1,200})\"", 0, strGroup, strGroup);
                                    if (gVarS3 != null && (str6 = (String) ((kotlin.collections.d0) gVarS3.a()).get(1)) != null && (string4 = kotlin.text.k.g0(str6).toString()) != null) {
                                        kotlin.text.g gVarS4 = androidx.compose.runtime.j.s("\"tf2\"\\s*:\\s*\"([^\"]+)\"", 0, strGroup, strGroup);
                                        if (gVarS4 == null || (strConcat4 = (String) ((kotlin.collections.d0) gVarS4.a()).get(1)) == null) {
                                            r10 = 0;
                                            kotlin.text.g gVarS5 = androidx.compose.runtime.j.s("\"tf\"\\s*:\\s*\"([^\"]+)\"", 0, strGroup, strGroup);
                                            if (gVarS5 != null) {
                                                strConcat4 = (String) ((kotlin.collections.d0) gVarS5.a()).get(1);
                                                r10 = 0;
                                            } else {
                                                strConcat4 = "";
                                            }
                                        } else {
                                            r10 = 0;
                                        }
                                        if (kotlin.text.r.u(strConcat4, "//", r10)) {
                                            strConcat4 = "https:".concat(strConcat4);
                                        } else if (kotlin.text.r.u(strConcat4, "/", r10)) {
                                            strConcat4 = "https://www.xvideos.com".concat(strConcat4);
                                        }
                                        kotlin.text.g gVarS6 = androidx.compose.runtime.j.s("\"d\"\\s*:\\s*(\\d+)", r10, strGroup, strGroup);
                                        int iIntValue = (gVarS6 == null || (str8 = (String) ((kotlin.collections.d0) gVarS6.a()).get(1)) == null || (numW = kotlin.text.r.w(str8)) == null) ? 0 : numW.intValue();
                                        if (iIntValue > 0) {
                                            str7 = (iIntValue / 60) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue % 60)}, 1));
                                        } else {
                                            str7 = "";
                                        }
                                        arrayList.add(new EpornerVideo("xvideos_".concat(str5), string4, null, null, null, null, str7, strConcat4.length() > 0 ? new EpornerThumb(strConcat4, null, null) : null, null, "https://www.xvideos.com".concat(str5)));
                                    }
                                }
                                m0Var2 = m0Var;
                                i3 = 0;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Context context2 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "EpornerScraper", "JS parse gave 0 — falling back to HTML block parse");
                            arrayList = new ArrayList();
                            Pattern patternCompile2 = Pattern.compile("(?=<div\\s[^>]*id=[\"']video[_-][a-zA-Z0-9]+[\"'])");
                            patternCompile2.getClass();
                            kotlin.text.k.S(0);
                            Matcher matcher2 = patternCompile2.matcher(strB);
                            if (matcher2.find()) {
                                ArrayList arrayList2 = new ArrayList(10);
                                int iEnd = 0;
                                do {
                                    arrayList2.add(strB.subSequence(iEnd, matcher2.start()).toString());
                                    iEnd = matcher2.end();
                                } while (matcher2.find());
                                arrayList2.add(strB.subSequence(iEnd, strB.length()).toString());
                                listJ = arrayList2;
                            } else {
                                listJ = kotlin.collections.q.j(strB.toString());
                            }
                            Iterator it = listJ.iterator();
                            while (it.hasNext()) {
                                String str12 = (String) it.next();
                                Pattern patternCompile3 = Pattern.compile("id=[\"']video[_-][a-zA-Z0-9]+[\"']");
                                patternCompile3.getClass();
                                str12.getClass();
                                if (patternCompile3.matcher(str12).find() && ((gVarS = androidx.compose.runtime.j.s("href=\"(/video[.\\-a-zA-Z0-9]*/[^\"?#\\s]+)", 0, str12, str12)) != null || (gVarS = androidx.compose.runtime.j.s("href=\"(/video\\d+/[^\"?#\\s]+)", 0, str12, str12)) != null)) {
                                    String str13 = (String) ((kotlin.collections.d0) gVarS.a()).get(1);
                                    Iterator it2 = it;
                                    kotlin.text.g gVarS7 = androidx.compose.runtime.j.s("title=\"([^\"]{2,200})\"", 0, str12, str12);
                                    if (gVarS7 != null && (str3 = (String) ((kotlin.collections.d0) gVarS7.a()).get(1)) != null && (string2 = kotlin.text.k.g0(str3).toString()) != null) {
                                        kotlin.text.g gVarS8 = androidx.compose.runtime.j.s("data-src=\"((?:https?:)?//[^\"]+)", 0, str12, str12);
                                        if (gVarS8 == null) {
                                            gVarS8 = androidx.compose.runtime.j.s("<img\\s[^>]*src=\"((?:https?:)?//[^\"]+cdn[^\"]+)", 0, str12, str12);
                                        }
                                        if (gVarS8 == null || (strConcat3 = (String) ((kotlin.collections.d0) gVarS8.a()).get(1)) == null) {
                                            strConcat3 = "";
                                        }
                                        if (kotlin.text.r.u(strConcat3, "//", false)) {
                                            strConcat3 = "https:".concat(strConcat3);
                                        }
                                        kotlin.text.g gVarS9 = androidx.compose.runtime.j.s("<span\\s+class=[\"']duration[\"'][^>]*>([^<]+)</span>", 0, str12, str12);
                                        arrayList.add(new EpornerVideo(androidx.compose.runtime.j.i("xvideos_", str13), string2, null, null, null, null, (gVarS9 == null || (str4 = (String) ((kotlin.collections.d0) gVarS9.a()).get(1)) == null || (string3 = kotlin.text.k.g0(str4).toString()) == null) ? "" : string3, strConcat3.length() > 0 ? new EpornerThumb(strConcat3, null, null) : null, null, androidx.compose.runtime.j.i("https://www.xvideos.com", str13)));
                                    }
                                    it = it2;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                kotlin.text.i iVar = new kotlin.text.i("href=\"(/video[^\"]+)\"[^>]*?title=\"([^\"]{2,200})\"");
                                kotlin.text.i iVar2 = new kotlin.text.i("data-src=\"((?:https?:)?//[^\"]+?)\"");
                                kotlin.text.i iVar3 = new kotlin.text.i("<span\\s+class=[\"']duration[\"'][^>]*>([^<]+)</span>");
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                androidx.collection.m0 m0Var3 = new androidx.collection.m0(kotlin.text.i.b(iVar, strB));
                                while (m0Var3.hasNext()) {
                                    kotlin.text.g gVar = (kotlin.text.g) m0Var3.next();
                                    m0Var3 = m0Var3;
                                    String str14 = (String) ((kotlin.collections.d0) gVar.a()).get(1);
                                    str11 = str11;
                                    String string5 = kotlin.text.k.g0((String) ((kotlin.collections.d0) gVar.a()).get(2)).toString();
                                    if (!linkedHashSet.contains(str14)) {
                                        linkedHashSet.add(str14);
                                        LinkedHashSet linkedHashSet2 = linkedHashSet;
                                        int iH = kotlin.text.k.H(strB, "href=\"" + str14 + "\"", 0, false, 6);
                                        if (iH >= 0) {
                                            String strSubstring = strB.substring(iH, Math.min(strB.length(), iH + 600));
                                            kotlin.text.g gVarA2 = iVar2.a(strSubstring);
                                            if (gVarA2 == null || (strConcat = (String) ((kotlin.collections.d0) gVarA2.a()).get(1)) == null) {
                                                strConcat = "";
                                            }
                                            if (kotlin.text.r.u(strConcat, "//", false)) {
                                                strConcat = "https:".concat(strConcat);
                                            }
                                            kotlin.text.g gVarA3 = iVar3.a(strSubstring);
                                            if (gVarA3 == null || (str2 = (String) ((kotlin.collections.d0) gVarA3.a()).get(1)) == null || (string = kotlin.text.k.g0(str2).toString()) == null) {
                                                string = "";
                                            }
                                        } else {
                                            string = "";
                                            strConcat = string;
                                        }
                                        if (strConcat.length() == 0) {
                                            String strSubstring2 = strB.substring(Math.max(0, gVar.b().e - 700), gVar.b().e);
                                            androidx.collection.m0 m0Var4 = new androidx.collection.m0(kotlin.text.i.b(iVar2, strSubstring2));
                                            if (m0Var4.hasNext()) {
                                                next = m0Var4.next();
                                                while (m0Var4.hasNext()) {
                                                    next = m0Var4.next();
                                                }
                                            } else {
                                                next = null;
                                            }
                                            kotlin.text.g gVar2 = (kotlin.text.g) next;
                                            if (gVar2 == null || (strConcat2 = (String) ((kotlin.collections.d0) gVar2.a()).get(1)) == null) {
                                                strConcat2 = "";
                                            }
                                            if (kotlin.text.r.u(strConcat2, "//", false)) {
                                                strConcat2 = "https:".concat(strConcat2);
                                            }
                                            if (string.length() == 0) {
                                                androidx.collection.m0 m0Var5 = new androidx.collection.m0(kotlin.text.i.b(iVar3, strSubstring2));
                                                if (m0Var5.hasNext()) {
                                                    next2 = m0Var5.next();
                                                    while (m0Var5.hasNext()) {
                                                        next2 = m0Var5.next();
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                                kotlin.text.g gVar3 = (kotlin.text.g) next2;
                                                if (gVar3 == null || (str = (String) ((kotlin.collections.d0) gVar3.a()).get(1)) == null || (string = kotlin.text.k.g0(str).toString()) == null) {
                                                    string = "";
                                                }
                                            }
                                            strConcat = strConcat2;
                                        }
                                        arrayList.add(new EpornerVideo(androidx.compose.runtime.j.i("xvideos_", str14), string5, null, null, null, null, string, strConcat.length() > 0 ? new EpornerThumb(strConcat, null, null) : null, null, androidx.compose.runtime.j.i("https://www.xvideos.com", str14)));
                                        iVar2 = iVar2;
                                        linkedHashSet = linkedHashSet2;
                                    }
                                }
                            }
                        } else {
                            Context context3 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "EpornerScraper", "JS setDataSearch: " + arrayList.size() + " videos");
                        }
                        String str15 = str11;
                        Integer numValueOf = null;
                        ArrayList arrayList3 = arrayList;
                        if (arrayList3.isEmpty()) {
                            Context context4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("W", "EpornerScraper", "searchVideos — no items parsed for query=".concat(str9));
                        }
                        Set setP = kotlin.sequences.k.P(kotlin.sequences.k.N(kotlin.text.i.b(new kotlin.text.i("[?&](?:amp;)?p=(\\d+)[^>]*>"), strB), new com.app.mlounge.data.local.dao.g(8)));
                        if (!setP.isEmpty()) {
                            Iterator it3 = setP.iterator();
                            if (!it3.hasNext()) {
                                org.mozilla.javascript.typedarrays.c.a();
                                return null;
                            }
                            Comparable comparable = (Comparable) it3.next();
                            while (it3.hasNext()) {
                                Comparable comparable2 = (Comparable) it3.next();
                                if (comparable.compareTo(comparable2) < 0) {
                                    comparable = comparable2;
                                }
                            }
                            int iIntValue2 = ((Number) comparable).intValue();
                            if (iIntValue2 > i4) {
                                numValueOf = Integer.valueOf(iIntValue2 + 1);
                            }
                        }
                        Context context5 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a(str15, "EpornerScraper", "searchVideos: page=" + i + ", totalPages=" + numValueOf + ", videos=" + arrayList3.size());
                        return new EpornerSearchDetails(null, numValueOf, Integer.valueOf(i), 30, arrayList3);
                    }
                } else {
                    if (iOrdinal == 1) {
                        return rVar.c.e(i, str9);
                    }
                    if (iOrdinal == 2) {
                        f1 f1Var = rVar.d;
                        this.y = 1;
                        objG = f1Var.g(i, str9, this);
                        if (objG == aVar) {
                            return aVar;
                        }
                        return (EpornerSearchDetails) objG;
                    }
                    coil3.g.a();
                }
                return null;
            case 1:
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                ChqApi chqApi = ((r) this.z).a;
                String str16 = (String) this.A;
                String str17 = (String) this.C;
                int i6 = this.B;
                this.y = 1;
                Object objSearchGames = chqApi.searchGames(str16, str17, i6, 20, this);
                return objSearchGames == aVar2 ? aVar2 : objSearchGames;
            default:
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                int i7 = this.y;
                try {
                    if (i7 == 0) {
                        kotlin.a.e(obj);
                        b2 b2Var = (b2) this.z;
                        MutableStateFlow mutableStateFlow2 = b2Var.N;
                        j0 j0Var = b2Var.b;
                        int i8 = this.B;
                        int iE = ((TmdbSeason) this.A).e();
                        this.C = mutableStateFlow2;
                        this.y = 1;
                        tvSeason = j0Var.a.getTvSeason(i8, iE, this);
                        if (tvSeason == aVar3) {
                            return aVar3;
                        }
                        mutableStateFlow = mutableStateFlow2;
                    } else {
                        if (i7 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = (MutableStateFlow) this.C;
                        kotlin.a.e(obj);
                        tvSeason = obj;
                    }
                    mutableStateFlow.setValue(tvSeason);
                    break;
                } catch (Exception unused) {
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i, r rVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = rVar;
        this.A = str;
        this.C = str2;
        this.B = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b2 b2Var, int i, TmdbSeason tmdbSeason, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = b2Var;
        this.B = i;
        this.A = tmdbSeason;
    }
}
