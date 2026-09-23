package androidx.compose.material3;

import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g5 {
    public static final float a = 22;
    public static final androidx.compose.animation.core.k2 b = androidx.compose.animation.core.e.o(300, 2, androidx.compose.animation.core.a0.a);

    public static final void a(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(1033612924);
        if (sVar.T(i & 1, (i & 19) != 18)) {
            String strI = androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_drag_handle_description, sVar);
            androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(androidx.compose.ui.c.K);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, h0Var);
            androidx.compose.ui.node.h.b.getClass();
            kotlin.jvm.functions.a aVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
            }
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            float f = d6.a;
            int iI0 = ((androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h)).i0(g6.a);
            boolean zD = sVar.d(iI0);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (zD || objQ == obj) {
                objQ = new h6(iI0);
                sVar.l0(objQ);
            }
            h6 h6Var = (h6) objQ;
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(2059851063, new androidx.compose.foundation.text.contextmenu.internal.m(strI, 3), sVar);
            androidx.compose.foundation.o1 o1Var = androidx.compose.material3.internal.r.a;
            boolean zG = sVar.g(false) | sVar.f(o1Var);
            Object objQ2 = sVar.Q();
            if (zG || objQ2 == obj) {
                objQ2 = new l6(o1Var);
                sVar.l0(objQ2);
            }
            g6.b(h6Var, fVarC, (l6) objQ2, null, false, fVar, sVar, 100663344);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.layout.x0(fVar, i, 2);
        }
    }
}
