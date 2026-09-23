package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Integer num, Integer num2, c cVar, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = cVar;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        b bVar = new b(this.$mediaType, this.$season, this.$episode, this.this$0, this.$tmdbId, dVar);
        bVar.L$0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x015a A[Catch: Exception -> 0x002a, PHI: r10
  0x015a: PHI (r10v14 java.lang.String) = (r10v13 java.lang.String), (r10v18 java.lang.String) binds: [B:44:0x00f4, B:60:0x0156] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002a, blocks: (B:5:0x0024, B:21:0x005e, B:24:0x0064, B:27:0x00ad, B:29:0x00b7, B:31:0x00bd, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:40:0x00e6, B:42:0x00ee, B:45:0x00f6, B:48:0x012a, B:50:0x0132, B:52:0x0138, B:55:0x0142, B:57:0x014a, B:59:0x0152, B:62:0x015a, B:65:0x01b0, B:67:0x01b4, B:70:0x01bc, B:72:0x01d2, B:75:0x01e3, B:78:0x0222, B:80:0x0226, B:83:0x022e, B:85:0x0244, B:90:0x0273, B:87:0x024f, B:89:0x0265, B:39:0x00e0, B:18:0x004a), top: B:94:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0244 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:5:0x0024, B:21:0x005e, B:24:0x0064, B:27:0x00ad, B:29:0x00b7, B:31:0x00bd, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:40:0x00e6, B:42:0x00ee, B:45:0x00f6, B:48:0x012a, B:50:0x0132, B:52:0x0138, B:55:0x0142, B:57:0x014a, B:59:0x0152, B:62:0x015a, B:65:0x01b0, B:67:0x01b4, B:70:0x01bc, B:72:0x01d2, B:75:0x01e3, B:78:0x0222, B:80:0x0226, B:83:0x022e, B:85:0x0244, B:90:0x0273, B:87:0x024f, B:89:0x0265, B:39:0x00e0, B:18:0x004a), top: B:94:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x024f A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:5:0x0024, B:21:0x005e, B:24:0x0064, B:27:0x00ad, B:29:0x00b7, B:31:0x00bd, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:40:0x00e6, B:42:0x00ee, B:45:0x00f6, B:48:0x012a, B:50:0x0132, B:52:0x0138, B:55:0x0142, B:57:0x014a, B:59:0x0152, B:62:0x015a, B:65:0x01b0, B:67:0x01b4, B:70:0x01bc, B:72:0x01d2, B:75:0x01e3, B:78:0x0222, B:80:0x0226, B:83:0x022e, B:85:0x0244, B:90:0x0273, B:87:0x024f, B:89:0x0265, B:39:0x00e0, B:18:0x004a), top: B:94:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0265 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:5:0x0024, B:21:0x005e, B:24:0x0064, B:27:0x00ad, B:29:0x00b7, B:31:0x00bd, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:40:0x00e6, B:42:0x00ee, B:45:0x00f6, B:48:0x012a, B:50:0x0132, B:52:0x0138, B:55:0x0142, B:57:0x014a, B:59:0x0152, B:62:0x015a, B:65:0x01b0, B:67:0x01b4, B:70:0x01bc, B:72:0x01d2, B:75:0x01e3, B:78:0x0222, B:80:0x0226, B:83:0x022e, B:85:0x0244, B:90:0x0273, B:87:0x024f, B:89:0x0265, B:39:0x00e0, B:18:0x004a), top: B:94:0x0020 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x015a, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        com.google.gson.g gVarL;
        okhttp3.g0 g0VarE;
        okhttp3.j0 j0Var;
        String strA;
        kotlin.text.g gVarA;
        String str;
        String str2;
        okhttp3.g0 g0VarE2;
        okhttp3.j0 j0Var2;
        String strA2;
        kotlin.text.g gVarA2;
        kotlin.text.g gVarA3;
        String strGroup;
        com.google.gson.j jVarO;
        com.google.gson.g gVarL2;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && this.$season != null && this.$episode != null) {
                    m1 m1Var = this.this$0.tmdbHelper;
                    String str3 = this.$tmdbId;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    objD = m1Var.d(str3, "tv", this);
                    if (objD == aVar) {
                        return aVar;
                    }
                }
                return wVar;
            }
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objD = obj;
            String str4 = (String) objD;
            if (str4 != null) {
                String str5 = "https://id-mapping-api-malid.hf.space/api/resolve?id=" + str4 + "&s=" + this.$season + "&e=" + this.$episode;
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str5);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE3.N) {
                    com.google.gson.e eVar = this.this$0.gson;
                    okhttp3.j0 j0Var3 = g0VarE3.D;
                    com.google.gson.j jVar = (com.google.gson.j) eVar.d(com.google.gson.j.class, j0Var3 != null ? j0Var3.A() : null);
                    if (jVar != null && (gVarL = jVar.l("mal_id")) != null) {
                        int iC = gVarL.c();
                        com.google.gson.g gVarL3 = jVar.l("mal_episode");
                        int iC2 = gVarL3 != null ? gVarL3.c() : this.$episode.intValue();
                        com.google.gson.g gVarL4 = jVar.l("anime_title");
                        String strH = gVarL4 != null ? gVarL4.h() : null;
                        if (strH == null) {
                            c cVar = this.this$0;
                            String str6 = "https://api.jikan.moe/v4/anime/" + iC;
                            okhttp3.a0 a0Var2 = new okhttp3.a0();
                            a0Var2.d(str6);
                            a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                            okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                            okhttp3.y yVar2 = cVar.client;
                            yVar2.getClass();
                            okhttp3.g0 g0VarE4 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                            if (g0VarE4.N) {
                                com.google.gson.e eVar2 = cVar.gson;
                                okhttp3.j0 j0Var4 = g0VarE4.D;
                                com.google.gson.j jVar2 = (com.google.gson.j) eVar2.d(com.google.gson.j.class, j0Var4 != null ? j0Var4.A() : null);
                                if (jVar2 != null && (jVarO = jVar2.o("data")) != null && (gVarL2 = jVarO.l("title")) != null && (strH = gVarL2.h()) != null) {
                                    String str7 = "https://anizone.to/anime?search=" + URLEncoder.encode(kotlin.text.k.g0((String) kotlin.text.k.U(strH, new String[]{":"}, 6).get(0)).toString(), "UTF-8");
                                    okhttp3.a0 a0Var3 = new okhttp3.a0();
                                    a0Var3.d(str7);
                                    a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                    a0Var3.b("Referer", "https://anizone.to/");
                                    okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                    okhttp3.y yVar3 = this.this$0.client;
                                    yVar3.getClass();
                                    g0VarE = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                    if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null) {
                                        Pattern patternCompile = Pattern.compile("/anime/([a-zA-Z0-9-]+)");
                                        patternCompile.getClass();
                                        Matcher matcher = patternCompile.matcher(strA);
                                        matcher.getClass();
                                        gVarA = kotlin.coroutines.g.a(matcher, 0, strA);
                                        if (gVarA != null && (str = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) != null) {
                                            str2 = "https://anizone.to/anime/" + str + "/" + iC2;
                                            okhttp3.a0 a0Var4 = new okhttp3.a0();
                                            a0Var4.d(str2);
                                            a0Var4.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                            a0Var4.b("Referer", "https://anizone.to/");
                                            okhttp3.b0 b0Var4 = new okhttp3.b0(a0Var4);
                                            okhttp3.y yVar4 = this.this$0.client;
                                            yVar4.getClass();
                                            g0VarE2 = new okhttp3.internal.connection.m(yVar4, b0Var4, false).e();
                                            if (g0VarE2.N && (j0Var2 = g0VarE2.D) != null && (strA2 = j0Var2.A()) != null) {
                                                Pattern patternCompile2 = Pattern.compile("https://[^\"']+/master\\.m3u8");
                                                patternCompile2.getClass();
                                                Matcher matcher2 = patternCompile2.matcher(strA2);
                                                matcher2.getClass();
                                                gVarA2 = kotlin.coroutines.g.a(matcher2, 0, strA2);
                                                if (gVarA2 != null) {
                                                    strGroup = gVarA2.a.group();
                                                    strGroup.getClass();
                                                } else {
                                                    Pattern patternCompile3 = Pattern.compile("<media-player[^>]*src=\"([^\"]+)\"");
                                                    patternCompile3.getClass();
                                                    Matcher matcher3 = patternCompile3.matcher(strA2);
                                                    matcher3.getClass();
                                                    gVarA3 = kotlin.coroutines.g.a(matcher3, 0, strA2);
                                                    if (gVarA3 != null) {
                                                        strGroup = (String) ((kotlin.collections.d0) gVarA3.a()).get(1);
                                                    }
                                                }
                                                return kotlin.collections.q.j(new ChqStream("AniZone", strGroup, "Multi", "hls", "hls", null, kotlin.collections.c0.k(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", str2)), null, null, null, null, null, null, 8064));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            String str8 = "https://anizone.to/anime?search=" + URLEncoder.encode(kotlin.text.k.g0((String) kotlin.text.k.U(strH, new String[]{":"}, 6).get(0)).toString(), "UTF-8");
                            okhttp3.a0 a0Var5 = new okhttp3.a0();
                            a0Var5.d(str8);
                            a0Var5.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                            a0Var5.b("Referer", "https://anizone.to/");
                            okhttp3.b0 b0Var5 = new okhttp3.b0(a0Var5);
                            okhttp3.y yVar5 = this.this$0.client;
                            yVar5.getClass();
                            g0VarE = new okhttp3.internal.connection.m(yVar5, b0Var5, false).e();
                            if (g0VarE.N) {
                                Pattern patternCompile4 = Pattern.compile("/anime/([a-zA-Z0-9-]+)");
                                patternCompile4.getClass();
                                Matcher matcher4 = patternCompile4.matcher(strA);
                                matcher4.getClass();
                                gVarA = kotlin.coroutines.g.a(matcher4, 0, strA);
                                if (gVarA != null) {
                                    str2 = "https://anizone.to/anime/" + str + "/" + iC2;
                                    okhttp3.a0 a0Var6 = new okhttp3.a0();
                                    a0Var6.d(str2);
                                    a0Var6.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                    a0Var6.b("Referer", "https://anizone.to/");
                                    okhttp3.b0 b0Var6 = new okhttp3.b0(a0Var6);
                                    okhttp3.y yVar6 = this.this$0.client;
                                    yVar6.getClass();
                                    g0VarE2 = new okhttp3.internal.connection.m(yVar6, b0Var6, false).e();
                                    if (g0VarE2.N) {
                                        Pattern patternCompile5 = Pattern.compile("https://[^\"']+/master\\.m3u8");
                                        patternCompile5.getClass();
                                        Matcher matcher5 = patternCompile5.matcher(strA2);
                                        matcher5.getClass();
                                        gVarA2 = kotlin.coroutines.g.a(matcher5, 0, strA2);
                                        if (gVarA2 != null) {
                                            strGroup = gVarA2.a.group();
                                            strGroup.getClass();
                                        } else {
                                            Pattern patternCompile6 = Pattern.compile("<media-player[^>]*src=\"([^\"]+)\"");
                                            patternCompile6.getClass();
                                            Matcher matcher6 = patternCompile6.matcher(strA2);
                                            matcher6.getClass();
                                            gVarA3 = kotlin.coroutines.g.a(matcher6, 0, strA2);
                                            if (gVarA3 != null) {
                                                strGroup = (String) ((kotlin.collections.d0) gVarA3.a()).get(1);
                                            }
                                        }
                                        return kotlin.collections.q.j(new ChqStream("AniZone", strGroup, "Multi", "hls", "hls", null, kotlin.collections.c0.k(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", str2)), null, null, null, null, null, null, 8064));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "AniZone");
        }
        return wVar;
    }
}
