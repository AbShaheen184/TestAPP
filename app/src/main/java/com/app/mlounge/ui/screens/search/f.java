package com.app.mlounge.ui.screens.search;

import com.app.mlounge.data.remote.model.TmdbTvShow;
import kotlin.jvm.functions.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;
    public final /* synthetic */ TmdbTvShow z;

    public /* synthetic */ f(l lVar, TmdbTvShow tmdbTvShow, int i) {
        this.e = i;
        this.y = lVar;
        this.z = tmdbTvShow;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(Integer.valueOf(this.z.b()));
                break;
            default:
                this.y.invoke(Integer.valueOf(this.z.b()));
                break;
        }
        return y.a;
    }
}
