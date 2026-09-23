package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ TmdbMovieDetailResponse A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ f0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f0 f0Var, TmdbMovieDetailResponse tmdbMovieDetailResponse, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = f0Var;
        this.A = tmdbMovieDetailResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c0(this.z, this.A, dVar, 0);
            default:
                return new c0(this.z, this.A, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                f0 f0Var = this.z;
                com.app.mlounge.data.repository.j0 j0Var = f0Var.b;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.x xVar = f0Var.c;
                    TmdbMovieDetailResponse tmdbMovieDetailResponse = this.A;
                    String strN = androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbMovieDetailResponse.d(), "movie_");
                    String strK = tmdbMovieDetailResponse.k();
                    if (strK == null) {
                        strK = "";
                    }
                    com.app.mlounge.data.local.entity.c cVar = new com.app.mlounge.data.local.entity.c(strN, "movie", strK, com.app.mlounge.data.repository.j0.c(j0Var, tmdbMovieDetailResponse.f()), com.app.mlounge.data.repository.j0.a(j0Var, tmdbMovieDetailResponse.a()), tmdbMovieDetailResponse.m(), tmdbMovieDetailResponse.g(), tmdbMovieDetailResponse.e(), 0L, String.valueOf(tmdbMovieDetailResponse.d()), null, null, null, 30464);
                    this.y = 1;
                    Object objA = xVar.a(cVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                f0 f0Var2 = this.z;
                com.app.mlounge.data.repository.j0 j0Var2 = f0Var2.b;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.x xVar2 = f0Var2.c;
                    TmdbMovieDetailResponse tmdbMovieDetailResponse2 = this.A;
                    String strN2 = androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbMovieDetailResponse2.d(), "movie_");
                    String strK2 = tmdbMovieDetailResponse2.k();
                    if (strK2 == null) {
                        strK2 = "";
                    }
                    com.app.mlounge.data.local.entity.f fVar = new com.app.mlounge.data.local.entity.f(strN2, "movie", strK2, com.app.mlounge.data.repository.j0.c(j0Var2, tmdbMovieDetailResponse2.f()), com.app.mlounge.data.repository.j0.a(j0Var2, tmdbMovieDetailResponse2.a()), tmdbMovieDetailResponse2.m(), tmdbMovieDetailResponse2.g(), tmdbMovieDetailResponse2.e(), 0L, String.valueOf(tmdbMovieDetailResponse2.d()), null, 1280);
                    this.y = 1;
                    Object objF = xVar2.f(fVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }
}
