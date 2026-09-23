package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.screens.settings.e0;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.functions.q;
import kotlin.y;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ a(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listB;
        switch (this.e) {
            case 0:
                s sVar = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a1 a1Var = this.y;
                    if (((List) a1Var.getValue()).isEmpty()) {
                        sVar.b0(1719262463);
                        sVar.p(false);
                    } else {
                        sVar.b0(1718956865);
                        float f = 16;
                        o oVar = o.b;
                        androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
                        z5.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Episodes (", ((List) a1Var.getValue()).size(), ")"), androidx.compose.foundation.layout.b.s(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).h, sVar, 432, 0, 131064);
                        androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 8));
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
            case 1:
                s sVar2 = (s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarS = n.s();
                    Object objQ = sVar2.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = new com.app.mlounge.ui.screens.settings.q(this.y, 6);
                        sVar2.l0(objQ);
                    }
                    e0.j("..", fVarS, (kotlin.jvm.functions.a) objQ, sVar2, 390);
                } else {
                    sVar2.W();
                }
                break;
            default:
                s sVar3 = (s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    TmdbSeason tmdbSeason = (TmdbSeason) this.y.getValue();
                    if (tmdbSeason == null || (listB = tmdbSeason.b()) == null) {
                        listB = w.e;
                    }
                    if (listB.isEmpty()) {
                        sVar3.b0(-253832693);
                        sVar3.p(false);
                    } else {
                        sVar3.b0(-254120032);
                        float f2 = 16;
                        o oVar2 = o.b;
                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar2, f2));
                        z5.b("Episodes", androidx.compose.foundation.layout.b.s(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(n6.a)).h, sVar3, 438, 0, 131064);
                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar2, 8));
                        sVar3.p(false);
                    }
                } else {
                    sVar3.W();
                }
                break;
        }
        return y.a;
    }
}
