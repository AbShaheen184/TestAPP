package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.y;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.r0;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements kotlin.jvm.functions.r {
    public final /* synthetic */ b2 A;
    public final /* synthetic */ w2 B;
    public final /* synthetic */ w2 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ List e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Map z;

    public o(List list, int i, Map map, b2 b2Var, w2 w2Var, w2 w2Var2, a1 a1Var, a1 a1Var2) {
        this.e = list;
        this.y = i;
        this.z = map;
        this.A = b2Var;
        this.B = w2Var;
        this.C = w2Var2;
        this.D = a1Var;
        this.E = a1Var2;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (sVar.f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            TmdbEpisode tmdbEpisode = (TmdbEpisode) this.e.get(iIntValue);
            sVar.b0(-147727579);
            int iF = tmdbEpisode.f();
            int iA = tmdbEpisode.a();
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", this.y, ":", iF);
            sbW.append(iA);
            String string = sbW.toString();
            boolean zD = sVar.d(tmdbEpisode.a());
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zD || objQ == fVar) {
                objQ = new y();
                sVar.l0(objQ);
            }
            y yVar = (y) objQ;
            Map map = this.z;
            boolean zH = sVar.h(map) | sVar.f(tmdbEpisode) | sVar.f(yVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new r0(5, map, tmdbEpisode, yVar);
                sVar.l0(objQ2);
            }
            l0.e((kotlin.jvm.functions.a) objQ2, sVar);
            androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar);
            String strG = tmdbEpisode.g();
            b2 b2Var = this.A;
            b2Var.b.getClass();
            String strB = j0.b(strG, "w300");
            Float f = (Float) ((Map) this.B.getValue()).get(string);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            boolean zContains = ((Set) this.C.getValue()).contains(string);
            boolean zH2 = sVar.h(b2Var) | sVar.f(tmdbEpisode);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == fVar) {
                objQ3 = new com.app.mlounge.ui.screens.downloads.d(b2Var, tmdbEpisode, this.D, this.E);
                sVar.l0(objQ3);
            }
            a.b(rVarK, tmdbEpisode, strB, fFloatValue, zContains, (kotlin.jvm.functions.a) objQ3, sVar, 0);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
