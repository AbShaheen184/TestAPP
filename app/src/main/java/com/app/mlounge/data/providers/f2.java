package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ g2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(String str, Integer num, Integer num2, String str2, g2 g2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
        this.this$0 = g2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new f2(this.$mediaType, this.$season, this.$episode, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.g gVarL;
        String strH;
        okhttp3.j0 j0Var2;
        String strA2;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
                str = "https://vixsrc.to/api/movie/" + this.$tmdbId;
            } else {
                str = "https://vixsrc.to/api/tv/" + this.$tmdbId + "/" + num + "/" + num2;
            }
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/150 Safari/537.36");
            a0Var.b("Accept", "application/json, text/javascript, */*; q=0.01");
            a0Var.b("Referer", "https://vixsrc.to");
            a0Var.b("Origin", "https://vixsrc.to");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null && (jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA)) != null && (gVarL = jVar.l("src")) != null && (strH = gVarL.h()) != null) {
                String string = new URL(new URL("https://vixsrc.to"), strH).toString();
                string.getClass();
                okhttp3.a0 a0Var2 = new okhttp3.a0();
                a0Var2.d(string);
                a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/150 Safari/537.36");
                a0Var2.b("Accept", "text/html,application/xhtml+xml,*/*");
                a0Var2.b("Referer", "https://vixsrc.to");
                okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                okhttp3.y yVar2 = this.this$0.client;
                yVar2.getClass();
                okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                if (g0VarE2.N && (j0Var2 = g0VarE2.D) != null && (strA2 = j0Var2.A()) != null) {
                    Pattern patternCompile = Pattern.compile("token[\"']\\s*:\\s*[\"']([^\"']+)");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strA2);
                    matcher.getClass();
                    kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strA2);
                    if (gVarA != null && (str2 = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) != null) {
                        Pattern patternCompile2 = Pattern.compile("expires[\"']\\s*:\\s*[\"']([^\"']+)");
                        patternCompile2.getClass();
                        Matcher matcher2 = patternCompile2.matcher(strA2);
                        matcher2.getClass();
                        kotlin.text.g gVarA2 = kotlin.coroutines.g.a(matcher2, 0, strA2);
                        if (gVarA2 != null && (str3 = (String) ((kotlin.collections.d0) gVarA2.a()).get(1)) != null) {
                            Pattern patternCompile3 = Pattern.compile("url\\s*:\\s*[\"']([^\"']+)");
                            patternCompile3.getClass();
                            Matcher matcher3 = patternCompile3.matcher(strA2);
                            matcher3.getClass();
                            kotlin.text.g gVarA3 = kotlin.coroutines.g.a(matcher3, 0, strA2);
                            if (gVarA3 != null && (str4 = (String) ((kotlin.collections.d0) gVarA3.a()).get(1)) != null) {
                                String str5 = str4 + (kotlin.text.k.z(str4, "?", false) ? "&" : "?") + "token=" + str2 + "&expires=" + str3 + "&h=1&format=m3u8";
                                Map mapSingletonMap = Collections.singletonMap("Referer", str);
                                mapSingletonMap.getClass();
                                return kotlin.collections.q.j(new ChqStream("VixSrc", str5, "Multi (HLS)", "hls", "hls", null, mapSingletonMap, null, null, null, null, null, null, 8064));
                            }
                        }
                    }
                }
            }
            return wVar;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "VixSrc");
            return wVar;
        }
    }
}
