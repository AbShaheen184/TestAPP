package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = c0Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b0(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.f fVarM;
        ChqStream chqStream;
        String strH;
        String strH2;
        String strH3;
        String str;
        String str2;
        com.google.gson.j jVarO;
        String str3;
        Integer num;
        Integer num2;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            m1 m1Var = this.this$0.tmdbHelper;
            String str4 = this.$tmdbId;
            String str5 = this.$mediaType;
            this.label = 1;
            objD = m1Var.d(str4, str5, this);
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
        String str6 = (String) objD;
        if (str6 != null) {
            String strR = (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) ? androidx.privacysandbox.ads.adservices.java.internal.a.r("https://hdhub.thevolecitor.qzz.io/eyJ0b3Jib3giOiJ1bnNldCIsInF1YWxpdGllcyI6IjIxNjBwLDEwODBwLDcyMHAsNDgwcCIsInNvcnQiOiJkZXNjIiwibXEiOjEwLCJtcCI6MTAsImNhdGFsb2dzIjoiIn0/stream/movie/", str6, ".json") : "https://hdhub.thevolecitor.qzz.io/eyJ0b3Jib3giOiJ1bnNldCIsInF1YWxpdGllcyI6IjIxNjBwLDEwODBwLDcyMHAsNDgwcCIsInNvcnQiOiJkZXNjIiwibXEiOjEwLCJtcCI6MTAsImNhdGFsb2dzIjoiIn0/stream/series/" + str6 + ":" + num + ":" + num2 + ".json";
            try {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(strR);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                a0Var.b("Accept", "application/json, */*");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null && (jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA)) != null && (fVarM = jVar.m("streams")) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fVarM.e.iterator();
                    while (it.hasNext()) {
                        com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                        com.google.gson.g gVarL = jVarE.l("url");
                        if (gVarL == null || (strH = gVarL.h()) == null) {
                            chqStream = null;
                        } else {
                            Set set = c0.EXCLUDED_HOSTS;
                            if (!(set instanceof Collection) || !set.isEmpty()) {
                                Iterator it2 = set.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (kotlin.text.k.z(strH, (String) it2.next(), true)) {
                                            chqStream = null;
                                        }
                                    }
                                }
                            }
                            com.google.gson.g gVarL2 = jVarE.l("name");
                            if (gVarL2 == null || (strH2 = gVarL2.h()) == null) {
                                strH2 = "HdHub";
                            }
                            com.google.gson.g gVarL3 = jVarE.l("description");
                            if (gVarL3 == null || (strH3 = gVarL3.h()) == null) {
                                strH3 = "";
                            }
                            String str7 = strH2 + " " + strH3;
                            if (kotlin.text.k.z(str7, "2160", false) || kotlin.text.k.z(str7, "4k", false)) {
                                str = "4K";
                            } else {
                                if (kotlin.text.k.z(str7, "1080", false)) {
                                    str3 = "1080p";
                                } else if (kotlin.text.k.z(str7, "720", false)) {
                                    str3 = "720p";
                                } else {
                                    str3 = kotlin.text.k.z(str7, "480", false) ? "480p" : "HD";
                                }
                                str = str3;
                            }
                            String str8 = "hls";
                            if (kotlin.text.k.z(strH, ".m3u8", false)) {
                                str2 = str8;
                            } else {
                                if (kotlin.text.k.z(strH, ".mpd", false)) {
                                    str8 = "dash";
                                } else {
                                    str2 = "mkv";
                                    if (!kotlin.text.k.z(strH, ".mkv", false)) {
                                        if (kotlin.text.k.z(strH, ".mp4", false)) {
                                            str2 = "mp4";
                                        } else if (kotlin.text.k.z(strH, "pixeldrain", false) || kotlin.text.k.z(strH, "qiwi.gg", false) || kotlin.text.k.z(strH, "gofile", false)) {
                                            if (!str.equals("4K")) {
                                                str2 = "mp4";
                                            }
                                        }
                                    }
                                }
                                str2 = str8;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            com.google.gson.j jVarO2 = jVarE.o("behaviorHints");
                            com.google.gson.j jVarO3 = (jVarO2 == null || (jVarO = jVarO2.o("proxyHeaders")) == null) ? null : jVarO.o("request");
                            if (jVarO3 != null) {
                                for (Map.Entry entry : (com.google.gson.internal.l) jVarO3.e.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((com.google.gson.g) entry.getValue()).h());
                                }
                            }
                            if (!linkedHashMap.containsKey("User-Agent")) {
                                linkedHashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                            }
                            if (!linkedHashMap.containsKey("Referer")) {
                                linkedHashMap.put("Referer", "https://hdhub.thevolecitor.qzz.io/");
                            }
                            chqStream = new ChqStream("HdHub - " + str, strH, str, str2, str2, null, linkedHashMap.isEmpty() ? null : linkedHashMap, null, null, null, null, null, null, 8064);
                        }
                        if (chqStream != null) {
                            arrayList.add(chqStream);
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                Context context = com.app.mlounge.util.a.a;
                androidx.room.b0.h("Error: ", e.getMessage(), "E", "HDHub");
                return wVar;
            }
        }
        return wVar;
    }
}
