package com.app.mlounge.data.providers;

import android.content.Context;
import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = kVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new j(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x0467 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:10:0x003c, B:49:0x015b, B:52:0x0163, B:55:0x016e, B:57:0x018b, B:60:0x0192, B:62:0x01ab, B:65:0x01b2, B:67:0x01cb, B:70:0x01d2, B:71:0x01e9, B:74:0x02f0, B:76:0x02f4, B:78:0x02f8, B:80:0x0323, B:83:0x0366, B:85:0x036a, B:88:0x0372, B:91:0x0384, B:94:0x038e, B:95:0x0399, B:97:0x039f, B:99:0x03b1, B:102:0x03bb, B:104:0x03c3, B:107:0x03ca, B:109:0x03d2, B:112:0x03d9, B:152:0x04b5, B:115:0x03e7, B:117:0x03fe, B:119:0x040d, B:121:0x0413, B:123:0x041a, B:125:0x0423, B:128:0x042c, B:140:0x0455, B:142:0x0467, B:144:0x047e, B:149:0x048f, B:132:0x0439, B:135:0x0444, B:153:0x04ba, B:79:0x0314, B:17:0x0067, B:45:0x0136, B:20:0x0087, B:41:0x010f, B:24:0x00a2, B:37:0x00ef, B:33:0x00cb), top: B:158:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x047c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0487  */
    /* JADX WARN: Code duplicated, block: B:148:0x048c  */
    /* JADX WARN: Code duplicated, block: B:160:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0314 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:10:0x003c, B:49:0x015b, B:52:0x0163, B:55:0x016e, B:57:0x018b, B:60:0x0192, B:62:0x01ab, B:65:0x01b2, B:67:0x01cb, B:70:0x01d2, B:71:0x01e9, B:74:0x02f0, B:76:0x02f4, B:78:0x02f8, B:80:0x0323, B:83:0x0366, B:85:0x036a, B:88:0x0372, B:91:0x0384, B:94:0x038e, B:95:0x0399, B:97:0x039f, B:99:0x03b1, B:102:0x03bb, B:104:0x03c3, B:107:0x03ca, B:109:0x03d2, B:112:0x03d9, B:152:0x04b5, B:115:0x03e7, B:117:0x03fe, B:119:0x040d, B:121:0x0413, B:123:0x041a, B:125:0x0423, B:128:0x042c, B:140:0x0455, B:142:0x0467, B:144:0x047e, B:149:0x048f, B:132:0x0439, B:135:0x0444, B:153:0x04ba, B:79:0x0314, B:17:0x0067, B:45:0x0136, B:20:0x0087, B:41:0x010f, B:24:0x00a2, B:37:0x00ef, B:33:0x00cb), top: B:158:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x039f A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:10:0x003c, B:49:0x015b, B:52:0x0163, B:55:0x016e, B:57:0x018b, B:60:0x0192, B:62:0x01ab, B:65:0x01b2, B:67:0x01cb, B:70:0x01d2, B:71:0x01e9, B:74:0x02f0, B:76:0x02f4, B:78:0x02f8, B:80:0x0323, B:83:0x0366, B:85:0x036a, B:88:0x0372, B:91:0x0384, B:94:0x038e, B:95:0x0399, B:97:0x039f, B:99:0x03b1, B:102:0x03bb, B:104:0x03c3, B:107:0x03ca, B:109:0x03d2, B:112:0x03d9, B:152:0x04b5, B:115:0x03e7, B:117:0x03fe, B:119:0x040d, B:121:0x0413, B:123:0x041a, B:125:0x0423, B:128:0x042c, B:140:0x0455, B:142:0x0467, B:144:0x047e, B:149:0x048f, B:132:0x0439, B:135:0x0444, B:153:0x04ba, B:79:0x0314, B:17:0x0067, B:45:0x0136, B:20:0x0087, B:41:0x010f, B:24:0x00a2, B:37:0x00ef, B:33:0x00cb), top: B:158:0x0018 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0314, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        k kVar;
        List listG;
        Object objFirst;
        String str;
        List list;
        int i;
        String str2;
        Object objFirst2;
        List list2;
        k kVar2;
        String str3;
        int i2;
        Object objFirst3;
        List list3;
        List list4;
        k kVar3;
        int i3;
        String str4;
        Object objFirst4;
        String str5;
        String str6;
        List list5;
        List list6;
        String str7;
        String str8;
        String str9;
        okhttp3.g0 g0VarE;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.f fVarM;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.g gVarL;
        ChqStream chqStream;
        String strH;
        String strH2;
        String strH3;
        String str10;
        String str11;
        List listU;
        String strI;
        String str12;
        String str13;
        Integer numW;
        Integer num;
        Integer num2;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i4 = this.label;
        try {
            if (i4 == 0) {
                kotlin.a.e(obj);
                m1 m1Var = this.this$0.tmdbHelper;
                String str14 = this.$tmdbId;
                String str15 = this.$mediaType;
                this.label = 1;
                objD = m1Var.d(str14, str15, this);
                if (objD != aVar) {
                }
                return aVar;
            }
            if (i4 == 1) {
                kotlin.a.e(obj);
                objD = obj;
            } else {
                if (i4 == 2) {
                    i = this.I$0;
                    listG = (List) this.L$3;
                    list = (List) this.L$2;
                    kVar = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    objFirst = obj;
                    str2 = (String) objFirst;
                    Flow flow = kVar.prefs.i;
                    this.L$0 = str;
                    this.L$1 = kVar;
                    this.L$2 = list;
                    this.L$3 = listG;
                    this.L$4 = str2;
                    this.I$0 = i;
                    this.label = 3;
                    objFirst2 = FlowKt.first(flow, this);
                    if (objFirst2 == aVar) {
                        list2 = listG;
                        kVar2 = kVar;
                        str3 = (String) objFirst2;
                        Flow flow2 = kVar2.prefs.j;
                        this.L$0 = str;
                        this.L$1 = kVar2;
                        this.L$2 = list;
                        this.L$3 = list2;
                        this.L$4 = str2;
                        this.L$5 = str3;
                        this.I$0 = i;
                        i2 = i;
                        this.label = 4;
                        objFirst3 = FlowKt.first(flow2, this);
                        if (objFirst3 != aVar) {
                            list3 = list;
                            list4 = list2;
                            kVar3 = kVar2;
                            i3 = i2;
                            str4 = (String) objFirst3;
                            Flow flow3 = kVar3.prefs.k;
                            this.L$0 = str;
                            this.L$1 = list3;
                            this.L$2 = list4;
                            this.L$3 = str2;
                            this.L$4 = str3;
                            this.L$5 = str4;
                            this.I$0 = i3;
                            this.label = 5;
                            objFirst4 = FlowKt.first(flow3, this);
                            if (objFirst4 != aVar) {
                                str5 = str4;
                                str6 = str3;
                                list5 = list4;
                                list6 = list3;
                                str7 = str;
                            }
                        }
                    }
                    return aVar;
                }
                if (i4 == 3) {
                    i = this.I$0;
                    String str16 = (String) this.L$4;
                    list2 = (List) this.L$3;
                    list = (List) this.L$2;
                    kVar = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    objFirst2 = obj;
                    str2 = str16;
                    kVar2 = kVar;
                    str3 = (String) objFirst2;
                    Flow flow4 = kVar2.prefs.j;
                    this.L$0 = str;
                    this.L$1 = kVar2;
                    this.L$2 = list;
                    this.L$3 = list2;
                    this.L$4 = str2;
                    this.L$5 = str3;
                    this.I$0 = i;
                    i2 = i;
                    this.label = 4;
                    objFirst3 = FlowKt.first(flow4, this);
                    if (objFirst3 != aVar) {
                        list3 = list;
                        list4 = list2;
                        kVar3 = kVar2;
                        i3 = i2;
                        str4 = (String) objFirst3;
                        Flow flow5 = kVar3.prefs.k;
                        this.L$0 = str;
                        this.L$1 = list3;
                        this.L$2 = list4;
                        this.L$3 = str2;
                        this.L$4 = str3;
                        this.L$5 = str4;
                        this.I$0 = i3;
                        this.label = 5;
                        objFirst4 = FlowKt.first(flow5, this);
                        if (objFirst4 != aVar) {
                            str5 = str4;
                            str6 = str3;
                            list5 = list4;
                            list6 = list3;
                            str7 = str;
                        }
                    }
                    return aVar;
                }
                if (i4 == 4) {
                    int i5 = this.I$0;
                    str3 = (String) this.L$5;
                    String str17 = (String) this.L$4;
                    list4 = (List) this.L$3;
                    list3 = (List) this.L$2;
                    k kVar4 = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    str2 = str17;
                    kVar3 = kVar4;
                    i3 = i5;
                    objFirst3 = obj;
                    str4 = (String) objFirst3;
                    Flow flow6 = kVar3.prefs.k;
                    this.L$0 = str;
                    this.L$1 = list3;
                    this.L$2 = list4;
                    this.L$3 = str2;
                    this.L$4 = str3;
                    this.L$5 = str4;
                    this.I$0 = i3;
                    this.label = 5;
                    objFirst4 = FlowKt.first(flow6, this);
                    if (objFirst4 != aVar) {
                        str5 = str4;
                        str6 = str3;
                        list5 = list4;
                        list6 = list3;
                        str7 = str;
                    }
                    return aVar;
                }
                if (i4 != 5) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str5 = (String) this.L$5;
                str6 = (String) this.L$4;
                String str18 = (String) this.L$3;
                list5 = (List) this.L$2;
                list6 = (List) this.L$1;
                str7 = (String) this.L$0;
                kotlin.a.e(obj);
                str2 = str18;
                objFirst4 = obj;
            }
            str8 = (String) objFirst4;
            if (str2 == null && str2.length() != 0) {
                list5.add(kotlin.collections.c0.k(new kotlin.k("service", "premiumize"), new kotlin.k("apiKey", str2)));
            }
            if (str6 != null && str6.length() != 0) {
                list5.add(kotlin.collections.c0.k(new kotlin.k("service", "torbox"), new kotlin.k("apiKey", str6)));
            }
            if (str5 != null && str5.length() != 0) {
                list5.add(kotlin.collections.c0.k(new kotlin.k("service", "alldebrid"), new kotlin.k("apiKey", str5)));
            }
            if (str8 != null && str8.length() != 0) {
                list5.add(kotlin.collections.c0.k(new kotlin.k("service", "realdebrid"), new kotlin.k("apiKey", str8)));
            }
            kotlin.collections.builders.b bVarC = kotlin.collections.q.c(list6);
            com.google.gson.j jVar2 = new com.google.gson.j();
            k kVar5 = this.this$0;
            jVar2.i("maxResultsPerResolution", new com.google.gson.k(new Integer(0)));
            jVar2.i("maxSize", new com.google.gson.k(new Integer(0)));
            Boolean bool = Boolean.FALSE;
            jVar2.j("cachedOnly", bool);
            jVar2.j("sortCachedUncachedTogether", bool);
            jVar2.j("removeTrash", Boolean.TRUE);
            jVar2.i("resultFormat", kVar5.gson.j(kotlin.collections.q.j("all")));
            jVar2.i("debridServices", kVar5.gson.j(bVarC));
            jVar2.j("enableTorrent", bool);
            jVar2.j("deduplicateStreams", bool);
            jVar2.j("scrapeDebridAccountTorrents", bool);
            jVar2.k("debridStreamProxyPassword", "");
            com.google.gson.j jVar3 = new com.google.gson.j();
            jVar3.i("required", kVar5.gson.j(wVar));
            jVar3.i("allowed", kVar5.gson.j(wVar));
            jVar3.i("exclude", kVar5.gson.j(wVar));
            jVar3.i("preferred", kVar5.gson.j(wVar));
            jVar2.i("languages", jVar3);
            jVar2.i("resolutions", new com.google.gson.j());
            com.google.gson.j jVar4 = new com.google.gson.j();
            jVar4.i("remove_ranks_under", new com.google.gson.k(new Long(-10000000000L)));
            jVar4.j("allow_english_in_languages", bool);
            jVar4.j("remove_unknown_languages", bool);
            jVar2.i("options", jVar4);
            byte[] bytes = this.this$0.gson.g(jVar2).getBytes(kotlin.text.a.a);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 10);
            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
                str9 = "stream/movie/" + str7 + ".json";
            } else {
                str9 = "stream/series/" + str7 + ":" + num + ":" + num2 + ".json";
            }
            String str19 = "https://comet.elfhosted.com/" + strEncodeToString + "/" + str9;
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str19);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null && (jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA)) != null && (fVarM = jVar.m("streams")) != null) {
                arrayList = new ArrayList();
                it = fVarM.e.iterator();
                while (it.hasNext()) {
                    com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                    gVarL = jVarE.l("url");
                    if (gVarL == null && (strH = gVarL.h()) != null) {
                        com.google.gson.g gVarL2 = jVarE.l("name");
                        if (gVarL2 == null || (strH2 = gVarL2.h()) == null) {
                            strH2 = "";
                        }
                        com.google.gson.g gVarL3 = jVarE.l("description");
                        if (gVarL3 == null || (strH3 = gVarL3.h()) == null) {
                            strH3 = "";
                        }
                        if (kotlin.text.k.z(strH2, "[🔄]", false)) {
                            chqStream = null;
                        } else {
                            Pattern patternCompile = Pattern.compile("[\\uD83D\\uDC64]\\s*(\\d+)");
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(strH3);
                            matcher.getClass();
                            kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strH3);
                            int iIntValue = (gVarA == null || (str13 = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) == null || (numW = kotlin.text.r.w(str13)) == null) ? 0 : numW.intValue();
                            if (kotlin.text.k.z(strH2, "2160", false) || kotlin.text.k.z(strH2, "4K", false)) {
                                str10 = "2160p";
                            } else if (kotlin.text.k.z(strH2, "1080", false)) {
                                str10 = "1080p";
                            } else if (kotlin.text.k.z(strH2, "720", false)) {
                                str10 = "720p";
                            } else {
                                if (kotlin.text.k.z(strH2, "480", false)) {
                                    str10 = "480p";
                                } else {
                                    str11 = null;
                                }
                                listU = kotlin.text.k.U(strH3, new String[]{"\n"}, 6);
                                if (listU.size() > 1) {
                                    strI = kotlin.collections.p.I(kotlin.collections.p.y(1, listU), " | ", null, null, null, 62);
                                } else {
                                    strI = null;
                                }
                                if (kotlin.text.k.z(strH, ".m3u8", false)) {
                                    str12 = "hls";
                                } else {
                                    str12 = "direct";
                                }
                                String str20 = str12;
                                chqStream = new ChqStream(strH2, strH, str11, str20, str20, null, null, new Integer(iIntValue), null, null, Boolean.FALSE, strI, null, 4864);
                            }
                            str11 = str10;
                            listU = kotlin.text.k.U(strH3, new String[]{"\n"}, 6);
                            if (listU.size() > 1) {
                                strI = kotlin.collections.p.I(kotlin.collections.p.y(1, listU), " | ", null, null, null, 62);
                            } else {
                                strI = null;
                            }
                            if (kotlin.text.k.z(strH, ".m3u8", false)) {
                                str12 = "hls";
                            } else {
                                str12 = "direct";
                            }
                            String str21 = str12;
                            chqStream = new ChqStream(strH2, strH, str11, str21, str21, null, null, new Integer(iIntValue), null, null, Boolean.FALSE, strI, null, 4864);
                        }
                    }
                    if (chqStream != null) {
                        arrayList.add(chqStream);
                    }
                }
                return kotlin.collections.p.X(15, kotlin.collections.p.W(arrayList, new androidx.constraintlayout.core.e(12)));
            }
            return wVar;
            String str22 = (String) objD;
            if (str22 != null) {
                kVar = this.this$0;
                listG = kotlin.collections.q.g();
                Flow flow7 = kVar.prefs.h;
                this.L$0 = str22;
                this.L$1 = kVar;
                this.L$2 = listG;
                this.L$3 = listG;
                this.I$0 = 0;
                this.label = 2;
                objFirst = FlowKt.first(flow7, this);
                if (objFirst != aVar) {
                    str = str22;
                    list = listG;
                    i = 0;
                    str2 = (String) objFirst;
                    Flow flow8 = kVar.prefs.i;
                    this.L$0 = str;
                    this.L$1 = kVar;
                    this.L$2 = list;
                    this.L$3 = listG;
                    this.L$4 = str2;
                    this.I$0 = i;
                    this.label = 3;
                    objFirst2 = FlowKt.first(flow8, this);
                    if (objFirst2 == aVar) {
                        list2 = listG;
                        kVar2 = kVar;
                        str3 = (String) objFirst2;
                        Flow flow9 = kVar2.prefs.j;
                        this.L$0 = str;
                        this.L$1 = kVar2;
                        this.L$2 = list;
                        this.L$3 = list2;
                        this.L$4 = str2;
                        this.L$5 = str3;
                        this.I$0 = i;
                        i2 = i;
                        this.label = 4;
                        objFirst3 = FlowKt.first(flow9, this);
                        if (objFirst3 != aVar) {
                            list3 = list;
                            list4 = list2;
                            kVar3 = kVar2;
                            i3 = i2;
                            str4 = (String) objFirst3;
                            Flow flow10 = kVar3.prefs.k;
                            this.L$0 = str;
                            this.L$1 = list3;
                            this.L$2 = list4;
                            this.L$3 = str2;
                            this.L$4 = str3;
                            this.L$5 = str4;
                            this.I$0 = i3;
                            this.label = 5;
                            objFirst4 = FlowKt.first(flow10, this);
                            if (objFirst4 != aVar) {
                                str5 = str4;
                                str6 = str3;
                                list5 = list4;
                                list6 = list3;
                                str7 = str;
                                str8 = (String) objFirst4;
                                if (str2 == null) {
                                }
                                if (str6 != null) {
                                    list5.add(kotlin.collections.c0.k(new kotlin.k("service", "torbox"), new kotlin.k("apiKey", str6)));
                                }
                                if (str5 != null) {
                                    list5.add(kotlin.collections.c0.k(new kotlin.k("service", "alldebrid"), new kotlin.k("apiKey", str5)));
                                }
                                if (str8 != null) {
                                    list5.add(kotlin.collections.c0.k(new kotlin.k("service", "realdebrid"), new kotlin.k("apiKey", str8)));
                                }
                                kotlin.collections.builders.b bVarC2 = kotlin.collections.q.c(list6);
                                com.google.gson.j jVar5 = new com.google.gson.j();
                                k kVar6 = this.this$0;
                                jVar5.i("maxResultsPerResolution", new com.google.gson.k(new Integer(0)));
                                jVar5.i("maxSize", new com.google.gson.k(new Integer(0)));
                                Boolean bool2 = Boolean.FALSE;
                                jVar5.j("cachedOnly", bool2);
                                jVar5.j("sortCachedUncachedTogether", bool2);
                                jVar5.j("removeTrash", Boolean.TRUE);
                                jVar5.i("resultFormat", kVar6.gson.j(kotlin.collections.q.j("all")));
                                jVar5.i("debridServices", kVar6.gson.j(bVarC2));
                                jVar5.j("enableTorrent", bool2);
                                jVar5.j("deduplicateStreams", bool2);
                                jVar5.j("scrapeDebridAccountTorrents", bool2);
                                jVar5.k("debridStreamProxyPassword", "");
                                com.google.gson.j jVar6 = new com.google.gson.j();
                                jVar6.i("required", kVar6.gson.j(wVar));
                                jVar6.i("allowed", kVar6.gson.j(wVar));
                                jVar6.i("exclude", kVar6.gson.j(wVar));
                                jVar6.i("preferred", kVar6.gson.j(wVar));
                                jVar5.i("languages", jVar6);
                                jVar5.i("resolutions", new com.google.gson.j());
                                com.google.gson.j jVar7 = new com.google.gson.j();
                                jVar7.i("remove_ranks_under", new com.google.gson.k(new Long(-10000000000L)));
                                jVar7.j("allow_english_in_languages", bool2);
                                jVar7.j("remove_unknown_languages", bool2);
                                jVar5.i("options", jVar7);
                                byte[] bytes2 = this.this$0.gson.g(jVar5).getBytes(kotlin.text.a.a);
                                bytes2.getClass();
                                String strEncodeToString2 = Base64.encodeToString(bytes2, 10);
                                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                                    str9 = "stream/movie/" + str7 + ".json";
                                } else {
                                    str9 = "stream/movie/" + str7 + ".json";
                                }
                                String str110 = "https://comet.elfhosted.com/" + strEncodeToString2 + "/" + str9;
                                okhttp3.a0 a0Var2 = new okhttp3.a0();
                                a0Var2.d(str110);
                                a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                                okhttp3.y yVar2 = this.this$0.client;
                                yVar2.getClass();
                                g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                if (g0VarE.N) {
                                    arrayList = new ArrayList();
                                    it = fVarM.e.iterator();
                                    while (it.hasNext()) {
                                        com.google.gson.j jVarE2 = ((com.google.gson.g) it.next()).e();
                                        gVarL = jVarE2.l("url");
                                        chqStream = gVarL == null ? null : null;
                                        if (chqStream != null) {
                                            arrayList.add(chqStream);
                                        }
                                    }
                                    return kotlin.collections.p.X(15, kotlin.collections.p.W(arrayList, new androidx.constraintlayout.core.e(12)));
                                }
                            }
                        }
                    }
                }
                return aVar;
            }
            return wVar;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "Comet");
            return wVar;
        }
    }
}
