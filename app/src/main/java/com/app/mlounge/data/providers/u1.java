package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ v1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(String str, String str2, Integer num, Integer num2, v1 v1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = v1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new u1(this.$tmdbId, this.$mediaType, this.$season, this.$episode, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.j jVarO;
        com.google.gson.f fVarM;
        String strH;
        ChqStream chqStream;
        String str;
        Integer num;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            ArrayList arrayListL = kotlin.collections.q.l("tmdb=" + this.$tmdbId, "type=" + this.$mediaType);
            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && (num = this.$season) != null && this.$episode != null) {
                arrayListL.add("season=" + num);
                arrayListL.add("episode=" + this.$episode);
            }
            String strConcat = "https://streamdata.vaplayer.ru/api.php?".concat(kotlin.collections.p.I(arrayListL, "&", null, null, null, 62));
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strConcat);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/121.0.0.0 Safari/537.36");
            a0Var.b("Referer", "https://nextgencloudfabric.com/");
            a0Var.b("Origin", "https://nextgencloudfabric.com");
            a0Var.b("Accept", "*/*");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null && (jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA)) != null) {
                com.google.gson.g gVarL = jVar.l("status_code");
                if (kotlin.jvm.internal.l.a(gVarL != null ? gVarL.h() : null, "200") && (jVarO = jVar.o("data")) != null && (fVarM = jVarO.m("stream_urls")) != null) {
                    com.google.gson.g gVarL2 = jVarO.l("file_name");
                    if (gVarL2 == null || (strH = gVarL2.h()) == null) {
                        strH = "";
                    }
                    Pattern patternCompile = Pattern.compile("(\\d+)p");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strH);
                    matcher.getClass();
                    kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strH);
                    String strConcat2 = (gVarA == null || (str = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) == null) ? "Auto" : str.concat("p");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fVarM.e.iterator();
                    while (it.hasNext()) {
                        String strH2 = ((com.google.gson.g) it.next()).h();
                        if (strH2 == null) {
                            chqStream = null;
                        } else {
                            String str2 = "hls";
                            if (!kotlin.text.k.z(strH2, ".m3u8", false)) {
                                if (kotlin.text.k.z(strH2, ".mpd", false)) {
                                    str2 = "dash";
                                } else if (kotlin.text.k.z(strH2, ".mp4", false) || kotlin.text.k.z(strH2, ".mkv", false)) {
                                    str2 = "mp4";
                                }
                            }
                            String str3 = str2;
                            chqStream = new ChqStream("VidApi", strH2, strConcat2, str3, str3, null, null, null, null, null, null, null, null, 8064);
                        }
                        if (chqStream != null) {
                            arrayList.add(chqStream);
                        }
                    }
                    return arrayList;
                }
            }
            return wVar;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "VidApi");
            return wVar;
        }
    }
}
