package com.app.mlounge.ui.screens.anime;

import android.content.Context;
import androidx.compose.foundation.gestures.y;
import androidx.compose.runtime.a1;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.room.coroutines.c0;
import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.f0;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(MatchSource matchSource, a0 a0Var, SportsMatch sportsMatch, a1 a1Var, s sVar) {
        this.e = 1;
        this.z = matchSource;
        this.A = a0Var;
        this.B = sportsMatch;
        this.y = a1Var;
        this.C = sVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        String strA;
        switch (this.e) {
            case 0:
                a1 a1Var = (a1) this.y;
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) this.z;
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) this.A;
                r rVar = (r) this.B;
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) this.C;
                HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) p.D((List) a1Var.getValue());
                if (hiAnimeEpisode != null && (strA = hiAnimeEpisode.a()) != null) {
                    String strC = hiAnimeEpisode.c();
                    if (strC == null) {
                        strC = "Episode 1";
                    }
                    String str = strC;
                    Integer numB = hiAnimeEpisode.b();
                    int iIntValue = numB != null ? numB.intValue() : 1;
                    gVar.D.h(iIntValue);
                    BuildersKt__Builders_commonKt.launch$default(m0.g(gVar), null, null, new c0(hiAnimeDetailData, gVar, str, (kotlin.coroutines.d) null, 18), 3, null);
                    rVar.invoke("anime", strA, androidx.compose.runtime.j.j(hiAnimeInfo.c(), " - ", str), Integer.valueOf(iIntValue));
                }
                break;
            case 1:
                MatchSource matchSource = (MatchSource) this.z;
                a0 a0Var = (a0) this.A;
                SportsMatch sportsMatch = (SportsMatch) this.B;
                a1 a1Var2 = (a1) this.y;
                s sVar = (s) this.C;
                a1Var2.setValue(null);
                if (matchSource.a() != null) {
                    a0Var.m(sportsMatch, matchSource.a(), matchSource.c(), new y(sVar, 8));
                }
                break;
            default:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, null, new androidx.compose.animation.core.f((f0) this.z, (TmdbMovieDetailResponse) this.A, (kotlin.jvm.functions.p) this.B, (Context) this.C, null, 17), 3, null);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b(Object obj, s0 s0Var, Object obj2, kotlin.d dVar, Object obj3, int i) {
        this.e = i;
        this.y = obj;
        this.z = s0Var;
        this.A = obj2;
        this.B = dVar;
        this.C = obj3;
    }
}
