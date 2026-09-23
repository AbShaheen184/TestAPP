package com.app.mlounge.data.providers;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $backend;
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ a2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(String str, Integer num, Integer num2, String str2, String str3, a2 a2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$backend = str2;
        this.$tmdbId = str3;
        this.this$0 = a2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new x1(this.$mediaType, this.$season, this.$episode, this.$backend, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String strE;
        String strA;
        String strH;
        Integer num;
        Integer num2;
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
            strE = androidx.room.b0.e("https://new.vidnest.fun/", this.$backend, "/movie/", this.$tmdbId);
        } else {
            StringBuilder sbQ = androidx.compose.runtime.j.q("https://new.vidnest.fun/", this.$backend, "/tv/", this.$tmdbId, "/");
            sbQ.append(num);
            sbQ.append("/");
            sbQ.append(num2);
            strE = sbQ.toString();
        }
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strE);
            a0Var.b("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/121.0");
            a0Var.b("Accept", "application/json, */*");
            a0Var.b("Origin", "https://vidnest.fun");
            a0Var.b("Referer", "https://vidnest.fun/");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (!g0VarE.N) {
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " HTTP " + g0VarE.A);
                return new kotlin.k(this.$backend, null);
            }
            okhttp3.j0 j0Var = g0VarE.D;
            if (j0Var != null && (strA = j0Var.A()) != null) {
                Context context2 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " body(100)=" + kotlin.text.k.e0(100, strA));
                com.google.gson.j jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA);
                if (jVar == null) {
                    return new kotlin.k(this.$backend, null);
                }
                com.google.gson.g gVarL = jVar.l("encrypted");
                com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " encrypted=" + gVarL + " type=" + (gVarL != null ? gVarL.getClass().getSimpleName() : null));
                com.google.gson.g gVarL2 = jVar.l("encrypted");
                if (gVarL2 == null || !gVarL2.b()) {
                    com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " not encrypted, raw data");
                    return new kotlin.k(this.$backend, jVar);
                }
                com.google.gson.g gVarL3 = jVar.l("data");
                if (gVarL3 != null && (strH = gVarL3.h()) != null) {
                    com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " encryptedData(50)=" + kotlin.text.k.e0(50, strH));
                    com.google.gson.j jVarB = a2.b(this.this$0, strH);
                    com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " decrypted=" + jVarB);
                    return new kotlin.k(this.$backend, jVarB);
                }
                return new kotlin.k(this.$backend, null);
            }
            return new kotlin.k(this.$backend, null);
        } catch (Exception e) {
            Context context3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "VidNest", this.$backend + " exception: " + e.getMessage());
            return new kotlin.k(this.$backend, null);
        }
    }
}
