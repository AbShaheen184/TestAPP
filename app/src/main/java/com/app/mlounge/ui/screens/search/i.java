package com.app.mlounge.ui.screens.search;

import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.b1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ b1 z;

    public /* synthetic */ i(List list, b1 b1Var, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = b1Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (sVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbMovie tmdbMovie = (TmdbMovie) this.y.get(iIntValue);
                    sVar.b0(-1724350027);
                    String strE = tmdbMovie.e();
                    if (strE == null && (strE = tmdbMovie.b()) == null) {
                        strE = "Unknown";
                    }
                    String strC = j0.c(this.z.b, tmdbMovie.c());
                    if (strC == null) {
                        strC = "";
                    }
                    Double dF = tmdbMovie.f();
                    androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar);
                    l lVar = this.A;
                    boolean zF = sVar.f(lVar) | sVar.h(tmdbMovie);
                    Object objQ = sVar.Q();
                    if (zF || objQ == n.a) {
                        objQ = new com.app.mlounge.ui.screens.movies.i(lVar, tmdbMovie, 1);
                        sVar.l0(objQ);
                    }
                    b0.h(strE, strC, (kotlin.jvm.functions.a) objQ, null, dF, "MOVIE", null, null, bVarS, 0.0f, false, false, 0.0f, null, sVar, 134414336, 0, 16072);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                j jVar2 = (j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar2 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (sVar2.f(jVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) this.y.get(iIntValue3);
                    sVar2.b0(719989339);
                    String strC2 = tmdbTvShow.c();
                    if (strC2 == null && (strC2 = tmdbTvShow.e()) == null) {
                        strC2 = "Unknown";
                    }
                    String strC3 = j0.c(this.z.b, tmdbTvShow.f());
                    if (strC3 == null) {
                        strC3 = "";
                    }
                    Double dG = tmdbTvShow.g();
                    androidx.compose.ui.graphics.painter.b bVarS2 = com.google.firebase.b.S(R.drawable.ic_tv_placeholder, sVar2);
                    l lVar2 = this.A;
                    boolean zF2 = sVar2.f(lVar2) | sVar2.h(tmdbTvShow);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == n.a) {
                        objQ2 = new f(lVar2, tmdbTvShow, 0);
                        sVar2.l0(objQ2);
                    }
                    b0.h(strC2, strC3, (kotlin.jvm.functions.a) objQ2, null, dG, "TV", null, null, bVarS2, 0.0f, false, false, 0.0f, null, sVar2, 134414336, 0, 16072);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }
}
