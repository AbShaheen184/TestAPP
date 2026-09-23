package com.app.mlounge.ui.screens.movies;

import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import java.io.IOException;
import kotlin.jvm.functions.q;
import kotlin.y;
import okhttp3.internal.http2.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
        this.A = obj2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                q qVar = (q) this.z;
                TmdbMovieDetailResponse tmdbMovieDetailResponse = (TmdbMovieDetailResponse) this.A;
                String strValueOf = String.valueOf(this.y);
                String strK = tmdbMovieDetailResponse.k();
                if (strK == null) {
                    strK = "Movie";
                }
                qVar.invoke("movie", strValueOf, strK);
                break;
            default:
                p pVar = (p) this.z;
                try {
                    pVar.U.N(this.y, (okhttp3.internal.http2.b) this.A);
                } catch (IOException e) {
                    okhttp3.internal.http2.b bVar = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                    pVar.a(bVar, bVar, e);
                }
                break;
        }
        return y.a;
    }
}
