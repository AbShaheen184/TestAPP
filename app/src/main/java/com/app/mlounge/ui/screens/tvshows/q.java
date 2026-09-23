package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.material3.p5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.t;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.components.s0;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements kotlin.jvm.functions.r {
    public final /* synthetic */ y A;
    public final /* synthetic */ w2 B;
    public final /* synthetic */ Object e;
    public final /* synthetic */ b2 y;
    public final /* synthetic */ int z;

    public q(List list, b2 b2Var, int i, y yVar, w2 w2Var) {
        this.e = list;
        this.y = b2Var;
        this.z = i;
        this.A = yVar;
        this.B = w2Var;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
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
            TmdbSeason tmdbSeason = (TmdbSeason) this.e.get(iIntValue);
            sVar.b0(849603997);
            TmdbSeason tmdbSeason2 = (TmdbSeason) this.B.getValue();
            boolean z = tmdbSeason2 != null && tmdbSeason2.e() == tmdbSeason.e();
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            float f = 8;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f);
            androidx.compose.ui.r rVarK = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarK, dVarA), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            b2 b2Var = this.y;
            boolean zH = sVar.h(b2Var);
            int i2 = this.z;
            boolean zD = zH | sVar.d(i2) | sVar.h(tmdbSeason);
            Object objQ2 = sVar.Q();
            if (zD || objQ2 == fVar) {
                objQ2 = new m(b2Var, i2, tmdbSeason);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarJ = androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28);
            if (iIntValue == 0) {
                rVarK = androidx.compose.ui.focus.d.k(rVarK, this.A);
            }
            p5.a(androidx.compose.foundation.s.n(rVarJ.d(rVarK), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1933927475, new s0(z, 2, tmdbSeason), sVar), sVar, 12582912, 120);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
