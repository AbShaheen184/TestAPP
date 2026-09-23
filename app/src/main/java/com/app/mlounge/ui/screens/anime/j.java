package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.p5;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.ui.components.r0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.r;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r {
    public final /* synthetic */ HiAnimeDetailData A;
    public final /* synthetic */ r B;
    public final /* synthetic */ HiAnimeInfo C;
    public final /* synthetic */ w2 D;
    public final /* synthetic */ w2 E;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.g z;

    public j(List list, Map map, com.app.mlounge.ui.viewmodel.g gVar, HiAnimeDetailData hiAnimeDetailData, r rVar, HiAnimeInfo hiAnimeInfo, w2 w2Var, w2 w2Var2) {
        this.e = list;
        this.y = map;
        this.z = gVar;
        this.A = hiAnimeDetailData;
        this.B = rVar;
        this.C = hiAnimeInfo;
        this.D = w2Var;
        this.E = w2Var2;
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
            HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) this.e.get(iIntValue);
            sVar.b0(-569877326);
            String strA = hiAnimeEpisode.a();
            if (strA == null) {
                strA = "";
            }
            String strConcat = "anime:".concat(strA);
            Float f = (Float) ((Map) this.D.getValue()).get(strConcat);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            boolean zContains = ((Set) this.E.getValue()).contains(strConcat);
            boolean zF = sVar.f(hiAnimeEpisode.b());
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = n.a;
            if (zF || objQ == fVar) {
                objQ = new y();
                sVar.l0(objQ);
            }
            y yVar = (y) objQ;
            boolean zF2 = sVar.f(hiAnimeEpisode);
            Map map = this.y;
            boolean zH = zF2 | sVar.h(map) | sVar.f(yVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new r0(1, hiAnimeEpisode, map, yVar);
                sVar.l0(objQ2);
            }
            l0.e((kotlin.jvm.functions.a) objQ2, sVar);
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            float f2 = 2;
            float f3 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.b.r(i1.e(o.b, 1.0f), 16, f2), f2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f3));
            boolean zF3 = sVar.f(hiAnimeEpisode);
            com.app.mlounge.ui.viewmodel.g gVar = this.z;
            boolean zH2 = zF3 | sVar.h(gVar);
            HiAnimeDetailData hiAnimeDetailData = this.A;
            boolean zH3 = zH2 | sVar.h(hiAnimeDetailData) | sVar.f(this.B);
            HiAnimeInfo hiAnimeInfo = this.C;
            boolean zF4 = zH3 | sVar.f(hiAnimeInfo);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == fVar) {
                objQ4 = new g(hiAnimeEpisode, gVar, hiAnimeDetailData, this.B, hiAnimeInfo);
                sVar.l0(objQ4);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.ui.focus.d.k(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), yVar), kVar, 1), androidx.compose.foundation.shape.e.a(f3), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1651769991, new h(fFloatValue, hiAnimeEpisode, zContains), sVar), sVar, 12583296, 120);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
