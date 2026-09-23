package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = zVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new y(this.this$0, this.$tmdbId, this.$mediaType, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        okhttp3.j0 j0Var;
        String strA;
        okhttp3.j0 j0Var2;
        String strA2;
        String strA3;
        com.google.gson.j jVarO;
        ChqStream chqStream;
        String strH;
        String strH2;
        String str;
        String str2;
        Object next;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            m1 m1Var = this.this$0.tmdbHelper;
            String str3 = this.$tmdbId;
            String str4 = this.$mediaType;
            this.label = 1;
            objD = m1Var.d(str3, str4, this);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objD = obj;
        }
        String str5 = (String) objD;
        Context context = com.app.mlounge.util.a.a;
        androidx.room.b0.h("imdbId=", str5, "D", "FshareTV");
        if (str5 != null) {
            try {
                String strConcat = "https://fsharetv.cc/movie/".concat(str5);
                com.app.mlounge.util.a.a("D", "FshareTV", "movieUrl=".concat(strConcat));
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(strConcat);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                a0Var.b("Accept", "text/html,application/xhtml+xml");
                a0Var.b("Accept-Language", "en-US,en;q=0.9");
                a0Var.b("Referer", "https://fsharetv.cc");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                com.app.mlounge.util.a.a("D", "FshareTV", "movieResp code=" + g0VarE.A);
                if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null) {
                    com.app.mlounge.util.a.a("D", "FshareTV", "movieHtml length=" + strA.length());
                    Pattern patternCompile = Pattern.compile("href=\"(/w/[^\"]+)\"");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strA);
                    matcher.getClass();
                    kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strA);
                    String str6 = gVarA != null ? (String) ((kotlin.collections.d0) gVarA.a()).get(1) : null;
                    com.app.mlounge.util.a.a("D", "FshareTV", "watchPath=" + str6);
                    if (str6 != null) {
                        String string = new URL(new URL("https://fsharetv.cc"), str6).toString();
                        string.getClass();
                        com.app.mlounge.util.a.a("D", "FshareTV", "watchUrl=".concat(string));
                        okhttp3.a0 a0Var2 = new okhttp3.a0();
                        a0Var2.d(string);
                        a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                        a0Var2.b("Accept", "text/html,application/xhtml+xml");
                        a0Var2.b("Accept-Language", "en-US,en;q=0.9");
                        a0Var2.b("Referer", "https://fsharetv.cc");
                        okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                        okhttp3.y yVar2 = this.this$0.client;
                        yVar2.getClass();
                        okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                        com.app.mlounge.util.a.a("D", "FshareTV", "watchResp code=" + g0VarE2.A);
                        if (g0VarE2.N && (j0Var2 = g0VarE2.D) != null && (strA2 = j0Var2.A()) != null) {
                            com.app.mlounge.util.a.a("D", "FshareTV", "watchHtml length=" + strA2.length());
                            Iterator it = kotlin.collections.q.j(new kotlin.text.i("Movie\\.setSource\\(\"([^\"]+)\"|setSource\\(\"([^\"]+)\"|setSource\\('([^']+)'|\"source_id\"\\s*:\\s*\"([^\"]+)\"|source_id\\s*=\\s*\"([^\"]+)\"|\"file_id\"\\s*:\\s*\"([^\"]+)\"|file_id\\s*=\\s*\"([^\"]+)\"")).iterator();
                            String str7 = null;
                            while (it.hasNext()) {
                                kotlin.text.g gVarA2 = ((kotlin.text.i) it.next()).a(strA2);
                                if (gVarA2 != null) {
                                    Iterator it2 = kotlin.collections.p.y(1, gVarA2.a()).iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (((String) next).length() <= 0);
                                    str7 = (String) next;
                                    if (str7 != null) {
                                        break;
                                    }
                                }
                            }
                            Context context2 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "FshareTV", "sourceId=" + str7);
                            if (str7 != null) {
                                String str8 = "https://fsharetv.cc/api/file/" + str7 + "/source?trailer=Png81APqcxU&type=watch";
                                com.app.mlounge.util.a.a("D", "FshareTV", "apiUrl=" + str8);
                                okhttp3.a0 a0Var3 = new okhttp3.a0();
                                a0Var3.d(str8);
                                a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                                a0Var3.b("Accept", "application/json, */*; q=0.01");
                                a0Var3.b("Accept-Language", "en-US,en;q=0.9");
                                a0Var3.b("X-Requested-With", "XMLHttpRequest");
                                a0Var3.b("Referer", "https://fsharetv.cc/");
                                okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                okhttp3.y yVar3 = this.this$0.client;
                                yVar3.getClass();
                                okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                if (!g0VarE3.N) {
                                    com.app.mlounge.util.a.a("D", "FshareTV", "apiResp not successful: " + g0VarE3.A);
                                    return wVar;
                                }
                                okhttp3.j0 j0Var3 = g0VarE3.D;
                                if (j0Var3 != null && (strA3 = j0Var3.A()) != null) {
                                    com.app.mlounge.util.a.a("D", "FshareTV", "apiBody(200)=" + kotlin.text.k.e0(org.mozilla.javascript.Context.VERSION_ES6, strA3));
                                    com.google.gson.j jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA3);
                                    if (jVar != null) {
                                        com.app.mlounge.util.a.a("D", "FshareTV", "apiJson status=" + jVar.l("status"));
                                        com.google.gson.g gVarL = jVar.l("status");
                                        if (!kotlin.jvm.internal.l.a(gVarL != null ? gVarL.h() : null, "ok")) {
                                            com.app.mlounge.util.a.a("D", "FshareTV", "api status not ok");
                                            return wVar;
                                        }
                                        com.google.gson.j jVarO2 = jVar.o("data");
                                        if (jVarO2 != null && (jVarO = jVarO2.o("file")) != null) {
                                            ArrayList<com.google.gson.j> arrayList = new ArrayList();
                                            com.google.gson.f fVarM = jVarO.m("sources");
                                            if (fVarM != null) {
                                                Iterator it3 = fVarM.e.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList.add(((com.google.gson.g) it3.next()).e());
                                                }
                                            }
                                            com.google.gson.f fVarM2 = jVarO.m("backups");
                                            if (fVarM2 != null) {
                                                Iterator it4 = fVarM2.e.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add(((com.google.gson.g) it4.next()).e());
                                                }
                                            }
                                            com.google.gson.f fVarM3 = jVarO.m("alternatives");
                                            if (fVarM3 != null) {
                                                for (com.google.gson.g gVar : fVarM3.e) {
                                                    gVar.getClass();
                                                    if (gVar instanceof com.google.gson.f) {
                                                        Iterator it5 = gVar.d().e.iterator();
                                                        while (it5.hasNext()) {
                                                            arrayList.add(((com.google.gson.g) it5.next()).e());
                                                        }
                                                    }
                                                }
                                            }
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (com.google.gson.j jVar2 : arrayList) {
                                                com.google.gson.g gVarL2 = jVar2.l("src");
                                                if (gVarL2 == null || (strH = gVarL2.h()) == null) {
                                                    chqStream = null;
                                                } else if (linkedHashSet.add(strH)) {
                                                    if (!kotlin.text.r.u(strH, "http", false)) {
                                                        strH = new URL(new URL("https://fsharetv.cc"), strH).toString();
                                                        strH.getClass();
                                                    }
                                                    com.google.gson.g gVarL3 = jVar2.l("label");
                                                    if (gVarL3 == null || (strH2 = gVarL3.h()) == null) {
                                                        strH2 = "Auto";
                                                    }
                                                    Pattern patternCompile2 = Pattern.compile("(\\d+)p");
                                                    patternCompile2.getClass();
                                                    Matcher matcher2 = patternCompile2.matcher(strH2);
                                                    matcher2.getClass();
                                                    kotlin.text.g gVarA3 = kotlin.coroutines.g.a(matcher2, 0, strH2);
                                                    if (gVarA3 != null) {
                                                        strH2 = ((kotlin.collections.d0) gVarA3.a()).get(1) + "p";
                                                    }
                                                    String str9 = strH2;
                                                    if (kotlin.text.k.z(strH, ".m3u8", false)) {
                                                        str2 = "hls";
                                                    } else {
                                                        if (kotlin.text.k.z(strH, ".mpd", false)) {
                                                            str2 = "dash";
                                                        } else {
                                                            if (!kotlin.text.k.z(strH, ".mp4", false)) {
                                                                kotlin.text.k.z(strH, ".mkv", false);
                                                            }
                                                            str = "mp4";
                                                        }
                                                        Map mapSingletonMap = Collections.singletonMap("Referer", "https://fsharetv.cc");
                                                        mapSingletonMap.getClass();
                                                        chqStream = new ChqStream("FshareTV", strH, str9, str, str, null, mapSingletonMap, null, null, null, null, null, null, 8064);
                                                    }
                                                    str = str2;
                                                    Map mapSingletonMap2 = Collections.singletonMap("Referer", "https://fsharetv.cc");
                                                    mapSingletonMap2.getClass();
                                                    chqStream = new ChqStream("FshareTV", strH, str9, str, str, null, mapSingletonMap2, null, null, null, null, null, null, 8064);
                                                } else {
                                                    chqStream = null;
                                                }
                                                if (chqStream != null) {
                                                    arrayList2.add(chqStream);
                                                }
                                            }
                                            return arrayList2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Context context3 = com.app.mlounge.util.a.a;
                androidx.room.b0.h("Error: ", e.getMessage(), "E", "FshareTV");
                return wVar;
            }
        }
        return wVar;
    }
}
