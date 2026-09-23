package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.o;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.ui.a0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.screens.settings.u;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.List;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ w2 z;

    public /* synthetic */ e(a1 a1Var, com.app.mlounge.ui.viewmodel.g gVar, HiAnimeDetailData hiAnimeDetailData, r rVar, HiAnimeInfo hiAnimeInfo, y yVar, w2 w2Var) {
        this.y = a1Var;
        this.A = gVar;
        this.B = hiAnimeDetailData;
        this.C = rVar;
        this.D = hiAnimeInfo;
        this.E = yVar;
        this.z = w2Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar;
        float f;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.f fVar = n.a;
        Object obj4 = this.E;
        Object obj5 = this.D;
        w2 w2Var = this.z;
        Object obj6 = this.C;
        Object obj7 = this.B;
        Object obj8 = this.A;
        switch (i) {
            case 0:
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) obj8;
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) obj7;
                r rVar = (r) obj6;
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                y yVar2 = (y) obj4;
                s sVar2 = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar2.W();
                } else {
                    o oVar = o.b;
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(i1.e(oVar, 1.0f), 16, 0.0f, 2);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, sVar2, 6);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarS);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                    t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar2, androidx.compose.ui.node.g.h);
                    t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    a1 a1Var = this.y;
                    boolean zIsEmpty = ((List) a1Var.getValue()).isEmpty();
                    g1 g1Var = g1.a;
                    if (zIsEmpty) {
                        sVar = sVar2;
                        f = 1.0f;
                        sVar.b0(-915921186);
                        sVar.p(false);
                    } else {
                        sVar2.b0(-916811072);
                        androidx.compose.ui.graphics.vector.f fVarN = okhttp3.internal.platform.android.g.n();
                        boolean zF = sVar2.f(a1Var) | sVar2.h(gVar) | sVar2.h(hiAnimeDetailData) | sVar2.f(rVar) | sVar2.f(hiAnimeInfo);
                        Object objQ = sVar2.Q();
                        if (zF || objQ == fVar) {
                            f = 1.0f;
                            objQ = new b(a1Var, gVar, hiAnimeDetailData, rVar, hiAnimeInfo, 0);
                            sVar2.l0(objQ);
                        } else {
                            f = 1.0f;
                        }
                        com.app.mlounge.ui.screens.movies.a.b("Watch", fVarN, (kotlin.jvm.functions.a) objQ, androidx.compose.ui.focus.d.k(g1.a(g1Var, oVar, f), yVar2), false, sVar2, 6, 48);
                        sVar = sVar2;
                        sVar.p(false);
                    }
                    String str = ((Boolean) w2Var.getValue()).booleanValue() ? "Favourited" : "Favourite";
                    androidx.compose.ui.graphics.vector.f fVarL = ((Boolean) w2Var.getValue()).booleanValue() ? okhttp3.internal.platform.android.g.l() : kotlin.math.a.q();
                    boolean zH = sVar.h(gVar) | sVar.h(hiAnimeDetailData);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new com.app.mlounge.ui.screens.adult.b(2, gVar, hiAnimeDetailData);
                        sVar.l0(objQ2);
                    }
                    com.app.mlounge.ui.screens.movies.a.b(str, fVarL, (kotlin.jvm.functions.a) objQ2, g1.a(g1Var, oVar, f), false, sVar, 0, 48);
                    sVar.p(true);
                }
                break;
            default:
                String str2 = (String) obj8;
                p1 p1Var = (p1) obj7;
                a1 a1Var2 = (a1) obj6;
                a1 a1Var3 = (a1) obj5;
                w2 w2Var2 = (w2) obj4;
                s sVar3 = (s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((x) obj).getClass();
                if (!sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar3.W();
                } else {
                    androidx.compose.ui.graphics.vector.f fVarB = android.support.v4.media.session.b.c;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.v(20.0f, 6.0f);
                        gVar2.s(-8.0f);
                        gVar2.u(-2.0f, -2.0f);
                        gVar2.t(4.0f, 4.0f);
                        gVar2.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar2.t(2.0f, 18.0f);
                        gVar2.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar2.s(16.0f);
                        gVar2.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar2.t(22.0f, 8.0f);
                        gVar2.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar2.l();
                        gVar2.v(20.0f, 18.0f);
                        gVar2.t(4.0f, 18.0f);
                        gVar2.t(4.0f, 8.0f);
                        gVar2.s(16.0f);
                        gVar2.A(10.0f);
                        gVar2.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar2.b, 0, p0Var);
                        fVarB = eVar.b();
                        android.support.v4.media.session.b.c = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar3 = fVarB;
                    Object objQ3 = sVar3.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new a0(this.y, a1Var2, 3);
                        sVar3.l0(objQ3);
                    }
                    e0.o("Download Location", str2, fVar3, null, (kotlin.jvm.functions.a) objQ3, sVar3, 24582, 8);
                    String str3 = (String) w2Var.getValue();
                    if (str3 == null) {
                        str3 = "Built-in Downloader";
                    }
                    String str4 = str3;
                    androidx.compose.ui.graphics.vector.f fVarU = v.u();
                    Object objQ4 = sVar3.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.screens.settings.q(a1Var3, 10);
                        sVar3.l0(objQ4);
                    }
                    e0.o("Download Manager", str4, fVarU, null, (kotlin.jvm.functions.a) objQ4, sVar3, 24582, 8);
                    androidx.compose.ui.graphics.vector.f fVarU2 = v.u();
                    List listK = kotlin.collections.q.k("1", "2", "3", "5");
                    String strValueOf = String.valueOf(((Number) w2Var2.getValue()).intValue());
                    boolean zH2 = sVar3.h(p1Var);
                    Object objQ5 = sVar3.Q();
                    if (zH2 || objQ5 == fVar) {
                        objQ5 = new u(p1Var, 5);
                        sVar3.l0(objQ5);
                    }
                    e0.n("Simultaneous Downloads", "Maximum number of downloads at once", fVarU2, listK, strValueOf, (kotlin.jvm.functions.l) objQ5, sVar3, 3126);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ e(String str, p1 p1Var, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        this.A = str;
        this.B = p1Var;
        this.y = a1Var;
        this.C = a1Var2;
        this.z = a1Var3;
        this.D = a1Var4;
        this.E = a1Var5;
    }
}
