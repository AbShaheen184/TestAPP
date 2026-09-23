package com.app.mlounge.ui.screens.downloads;

import androidx.compose.runtime.a1;
import androidx.compose.ui.focus.y;
import com.app.mlounge.data.download.h;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.ui.screens.livetv.i;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.jvm.functions.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ Object z;

    public d(b2 b2Var, TmdbEpisode tmdbEpisode, a1 a1Var, a1 a1Var2) {
        this.e = 2;
        this.z = b2Var;
        this.A = tmdbEpisode;
        this.y = a1Var;
        this.B = a1Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                o oVar = (o) this.z;
                long j = ((com.app.mlounge.data.local.entity.a) this.A).a;
                h hVar = oVar.b;
                ConcurrentHashMap concurrentHashMap = hVar.f;
                Job job = (Job) concurrentHashMap.get(Long.valueOf(j));
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                concurrentHashMap.remove(Long.valueOf(j));
                BuildersKt__Builders_commonKt.launch$default(hVar.e, null, null, new com.app.mlounge.data.download.b(hVar, j, null, 1), 3, null);
                if (((List) this.y.getValue()).size() > 1) {
                    try {
                        y.a((y) this.B);
                        break;
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                SportsMatch sportsMatch = (SportsMatch) this.z;
                List listF = sportsMatch.f();
                if (listF == null) {
                    listF = w.e;
                }
                if (!listF.isEmpty()) {
                    if (listF.size() == 1) {
                        MatchSource matchSource = (MatchSource) p.B(listF);
                        if (matchSource.a() != null) {
                            ((a0) this.A).m(sportsMatch, matchSource.a(), matchSource.c(), new i((s) this.B, 1));
                        }
                    } else {
                        this.y.setValue(sportsMatch);
                    }
                }
                break;
            default:
                b2 b2Var = (b2) this.z;
                TmdbEpisode tmdbEpisode = (TmdbEpisode) this.A;
                b2Var.j.h(tmdbEpisode.a());
                this.y.setValue(tmdbEpisode);
                ((a1) this.B).setValue(Boolean.TRUE);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, a1 a1Var, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.y = a1Var;
    }
}
