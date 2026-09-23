package com.app.mlounge.ui.screens.tvshows;

import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.viewmodel.b2;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlin.jvm.functions.a {
    public final /* synthetic */ b2 e;
    public final /* synthetic */ int y;
    public final /* synthetic */ TmdbSeason z;

    public m(b2 b2Var, int i, TmdbSeason tmdbSeason) {
        this.e = b2Var;
        this.y = i;
        this.z = tmdbSeason;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        TmdbSeason tmdbSeason = this.z;
        tmdbSeason.getClass();
        b2 b2Var = this.e;
        b2Var.L.setValue(tmdbSeason);
        BuildersKt__Builders_commonKt.launch$default(m0.g(b2Var), null, null, new com.app.mlounge.data.repository.p(b2Var, this.y, tmdbSeason, null), 3, null);
        return y.a;
    }
}
