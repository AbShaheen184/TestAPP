package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, Integer num, Integer num2, f0 f0Var, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = f0Var;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e0(this.$mediaType, this.$season, this.$episode, this.this$0, this.$tmdbId, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        com.google.gson.g gVarL;
        String str;
        kotlin.collections.w wVar;
        int i;
        boolean z;
        boolean z2;
        String strA;
        com.google.gson.g gVarL2;
        String strH;
        String str2 = "/";
        kotlin.collections.w wVar2 = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && this.$season != null && this.$episode != null) {
                    m1 m1Var = this.this$0.tmdbHelper;
                    String str3 = this.$tmdbId;
                    this.label = 1;
                    objD = m1Var.d(str3, "tv", this);
                    if (objD == aVar) {
                        return aVar;
                    }
                }
                return wVar2;
            }
            if (i2 != 1) {
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
                boolean z3 = false;
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N) {
                    com.google.gson.e eVar = this.this$0.gson;
                    okhttp3.j0 j0Var = g0VarE.D;
                    com.google.gson.j jVar = (com.google.gson.j) eVar.d(com.google.gson.j.class, j0Var != null ? j0Var.A() : null);
                    if (jVar != null && (gVarL = jVar.l("mal_id")) != null) {
                        int iC = gVarL.c();
                        com.google.gson.g gVarL3 = jVar.l("mal_episode");
                        int iC2 = gVarL3 != null ? gVarL3.c() : this.$episode.intValue();
                        ArrayList arrayList = new ArrayList();
                        for (String str6 : kotlin.collections.q.k("sub", "dub")) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                try {
                                    sb.append("https://megaplay.buzz/stream/mal/");
                                    sb.append(iC);
                                    sb.append(str2);
                                    sb.append(iC2);
                                    sb.append(str2);
                                    sb.append(str6);
                                    String string = sb.toString();
                                    okhttp3.a0 a0Var2 = new okhttp3.a0();
                                    a0Var2.d(string);
                                    a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                    a0Var2.b("Referer", string);
                                    str = str2;
                                    try {
                                        okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                                        okhttp3.y yVar2 = this.this$0.client;
                                        yVar2.getClass();
                                        wVar = wVar2;
                                        try {
                                            i = iC2;
                                            boolean z4 = false;
                                            try {
                                                try {
                                                    okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                                    if (g0VarE2.N) {
                                                        okhttp3.j0 j0Var2 = g0VarE2.D;
                                                        if (j0Var2 == null || (strA = j0Var2.A()) == null) {
                                                            z = false;
                                                            z2 = true;
                                                            z3 = z;
                                                            str2 = str;
                                                            wVar2 = wVar;
                                                            iC2 = i;
                                                        } else {
                                                            Pattern patternCompile = Pattern.compile("data-id=\"([^\"]+)\"");
                                                            patternCompile.getClass();
                                                            Matcher matcher = patternCompile.matcher(strA);
                                                            matcher.getClass();
                                                            z4 = false;
                                                            kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strA);
                                                            if (gVarA != null) {
                                                                try {
                                                                    try {
                                                                        String str7 = (String) ((kotlin.collections.d0) gVarA.a()).get(1);
                                                                        if (str7 != null) {
                                                                            okhttp3.a0 a0Var3 = new okhttp3.a0();
                                                                            a0Var3.d("https://megaplay.buzz/stream/getSources?id=" + str7 + "&id=" + str7);
                                                                            a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                                                            a0Var3.b("X-Requested-With", "XMLHttpRequest");
                                                                            a0Var3.b("Referer", string);
                                                                            a0Var3.b("Origin", "https://megaplay.buzz");
                                                                            okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                                                            okhttp3.y yVar3 = this.this$0.client;
                                                                            yVar3.getClass();
                                                                            z = false;
                                                                            try {
                                                                                okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                                                                if (g0VarE3.N) {
                                                                                    com.google.gson.e eVar2 = this.this$0.gson;
                                                                                    okhttp3.j0 j0Var3 = g0VarE3.D;
                                                                                    com.google.gson.j jVar2 = (com.google.gson.j) eVar2.d(com.google.gson.j.class, j0Var3 != null ? j0Var3.A() : null);
                                                                                    if (jVar2 != null) {
                                                                                        com.google.gson.g gVarL4 = jVar2.l("sources");
                                                                                        if (gVarL4 == null || !(gVarL4 instanceof com.google.gson.j)) {
                                                                                            if (gVarL4 != null) {
                                                                                                z2 = true;
                                                                                                if ((gVarL4 instanceof com.google.gson.f) && gVarL4.d().e.size() > 0 && (gVarL2 = gVarL4.d().i().e().l("file")) != null) {
                                                                                                    strH = gVarL2.h();
                                                                                                }
                                                                                            } else {
                                                                                                z2 = true;
                                                                                            }
                                                                                            strH = null;
                                                                                        } else {
                                                                                            com.google.gson.g gVarL5 = gVarL4.e().l("file");
                                                                                            if (gVarL5 != null) {
                                                                                                strH = gVarL5.h();
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                z2 = true;
                                                                                                strH = null;
                                                                                            }
                                                                                        }
                                                                                        if (strH != null) {
                                                                                            try {
                                                                                                arrayList.add(new ChqStream("HiAnime [MegaPlay] (" + str6 + ")", strH, "Multi", "hls", "hls", null, kotlin.collections.c0.k(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", "https://megaplay.buzz/"), new kotlin.k("Origin", "https://megaplay.buzz")), null, null, null, null, null, null, 8064));
                                                                                            } catch (Exception unused) {
                                                                                            }
                                                                                        }
                                                                                        z3 = z;
                                                                                        str2 = str;
                                                                                        wVar2 = wVar;
                                                                                        iC2 = i;
                                                                                    }
                                                                                }
                                                                                z3 = false;
                                                                                str2 = str;
                                                                                wVar2 = wVar;
                                                                                iC2 = i;
                                                                            } catch (Exception unused2) {
                                                                                z2 = true;
                                                                            }
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                        z2 = true;
                                                                        z = false;
                                                                    }
                                                                } catch (Exception unused4) {
                                                                    z2 = true;
                                                                }
                                                            }
                                                            z = false;
                                                            z2 = true;
                                                            z3 = z;
                                                            str2 = str;
                                                            wVar2 = wVar;
                                                            iC2 = i;
                                                        }
                                                    } else {
                                                        str2 = str;
                                                        wVar2 = wVar;
                                                        iC2 = i;
                                                        z3 = false;
                                                    }
                                                } catch (Exception unused5) {
                                                    z = false;
                                                }
                                            } catch (Exception unused6) {
                                                z = z4;
                                            }
                                        } catch (Exception unused7) {
                                            i = iC2;
                                            z = false;
                                            z2 = true;
                                            z3 = z;
                                            str2 = str;
                                            wVar2 = wVar;
                                            iC2 = i;
                                        }
                                    } catch (Exception unused8) {
                                        wVar = wVar2;
                                        i = iC2;
                                        z = false;
                                        z2 = true;
                                        z3 = z;
                                        str2 = str;
                                        wVar2 = wVar;
                                        iC2 = i;
                                    }
                                } catch (Exception unused9) {
                                    str = str2;
                                }
                            } catch (Exception unused10) {
                                str = str2;
                                wVar = wVar2;
                                i = iC2;
                                z = z3;
                            }
                        }
                        return arrayList;
                    }
                }
            }
            return wVar2;
        } catch (Exception e) {
            kotlin.collections.w wVar3 = wVar2;
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "HiAnime");
            return wVar3;
        }
    }
}
