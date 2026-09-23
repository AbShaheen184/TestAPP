package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ d2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(String str, Integer num, Integer num2, String str2, d2 d2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
        this.this$0 = d2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new c2(this.$mediaType, this.$season, this.$episode, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.j jVarE;
        com.google.gson.g gVarL;
        String strH;
        String str2;
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
                str = "movie/" + this.$tmdbId;
            } else {
                str = "tv/" + this.$tmdbId + "/" + num + "/" + num2;
            }
            String strConcat = "https://vidrock.ru/api/".concat(str);
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strConcat);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
            a0Var.b("Accept", "application/json, */*");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Origin", "https://vidrock.ru");
            a0Var.b("Referer", "https://vidrock.ru/");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null) {
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "Vidrock", "Raw body: ".concat(strA));
                if (!strA.equals("null") && kotlin.text.k.g0(strA).toString().length() != 0 && (jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA)) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((com.google.gson.internal.l) jVar.e.entrySet()).iterator();
                    while (((com.google.gson.internal.k) it).hasNext()) {
                        com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it).c();
                        String str3 = (String) mVarC.getKey();
                        if (!kotlin.text.r.o(str3, "Luna", true)) {
                            Object value = mVarC.getValue();
                            com.google.gson.g gVar = (com.google.gson.g) value;
                            gVar.getClass();
                            if (!(gVar instanceof com.google.gson.j)) {
                                value = null;
                            }
                            com.google.gson.g gVar2 = (com.google.gson.g) value;
                            if (gVar2 != null && (gVarL = (jVarE = gVar2.e()).l("url")) != null && !(gVarL instanceof com.google.gson.i)) {
                                String strH2 = gVarL.h();
                                d2 d2Var = this.this$0;
                                strH2.getClass();
                                String strB = d2.b(d2Var, strH2);
                                if (strB != null && kotlin.text.r.u(strB, "http", false) && !kotlin.text.k.z(strB, "binge.vaporeen.workers.dev", false)) {
                                    String strE = d2.e(this.this$0, strB);
                                    com.google.gson.g gVarL2 = jVarE.l("type");
                                    if (gVarL2 == null || (strH = gVarL2.h()) == null) {
                                        strH = "";
                                    }
                                    if (kotlin.text.k.z(strE, ".m3u8", false)) {
                                        str2 = "hls";
                                    } else {
                                        if (kotlin.text.k.z(strE, ".mp4", false)) {
                                            strH = "mp4";
                                        } else if (strH.length() <= 0) {
                                            str2 = "hls";
                                        }
                                        str2 = strH;
                                    }
                                    arrayList.add(new ChqStream("Vidrock - " + str3, strE, "Auto", str2, str2, null, kotlin.collections.c0.k(new kotlin.k("Referer", "https://vidrock.ru"), new kotlin.k("Origin", "https://vidrock.ru")), null, null, null, null, null, null, 8064));
                                }
                            }
                        }
                    }
                    return arrayList;
                }
            }
            return wVar;
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "Vidrock");
            return wVar;
        }
    }
}
