package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ m1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(String str, String str2, m1 m1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$tmdbId = str2;
        this.this$0 = m1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new k1(this.$mediaType, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String strH;
        String strH2;
        String str = "tv";
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                str = "movie";
            }
            String str2 = "https://api.themoviedb.org/3/" + str + "/" + this.$tmdbId;
            okhttp3.y yVar = this.this$0.client;
            this.this$0.getClass();
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str2);
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            m1 m1Var = this.this$0;
            try {
                if (g0VarE.N) {
                    com.google.gson.e eVar = m1Var.gson;
                    okhttp3.j0 j0Var = g0VarE.D;
                    com.google.gson.j jVar = (com.google.gson.j) eVar.d(com.google.gson.j.class, j0Var != null ? j0Var.A() : null);
                    if (jVar != null) {
                        com.google.gson.g gVarL = jVar.l("title");
                        String str3 = "";
                        if (gVarL == null || (strH = gVarL.h()) == null) {
                            com.google.gson.g gVarL2 = jVar.l("name");
                            strH = gVarL2 != null ? gVarL2.h() : null;
                            if (strH == null) {
                                strH = "";
                            }
                        }
                        com.google.gson.g gVarL3 = jVar.l("release_date");
                        if (gVarL3 == null || (strH2 = gVarL3.h()) == null) {
                            com.google.gson.g gVarL4 = jVar.l("first_air_date");
                            String strH3 = gVarL4 != null ? gVarL4.h() : null;
                            if (strH3 != null) {
                                str3 = strH3;
                            }
                        } else {
                            str3 = strH2;
                        }
                        j1 j1Var = new j1(kotlin.text.r.w(kotlin.text.k.e0(4, str3)), strH);
                        g0VarE.close();
                        return j1Var;
                    }
                    return null;
                }
                g0VarE.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
