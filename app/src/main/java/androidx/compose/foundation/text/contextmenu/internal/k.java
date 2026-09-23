package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.window.d0;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 636288403, new androidx.compose.foundation.text.contextmenu.a(1));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, -1357803046, new androidx.compose.foundation.text.contextmenu.a(2));

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.ui.r rVar2;
        androidx.compose.runtime.internal.f fVar2;
        sVar.c0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            if (objQ == fVar3) {
                j1 j1Var = new j1(null, androidx.compose.runtime.f.A);
                sVar.l0(j1Var);
                objQ = j1Var;
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar3) {
                objQ2 = new androidx.compose.foundation.lazy.m(a1Var, 5);
                sVar.l0(objQ2);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ2;
            d0 d0Var = n.a;
            androidx.compose.foundation.text.contextmenu.provider.c cVarD = com.google.firebase.b.d(b, sVar, 6);
            rVar2 = rVar;
            fVar2 = fVar;
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{androidx.compose.foundation.text.contextmenu.provider.g.b.a(e(aVar, sVar, 2)), androidx.compose.foundation.text.contextmenu.provider.g.a.a(cVarD)}, androidx.compose.runtime.internal.k.c(1070596993, new q(rVar2, a1Var, fVar2, cVarD, aVar, 0), sVar), sVar, 56);
        } else {
            rVar2 = rVar;
            fVar2 = fVar;
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar2, fVar2, i, i3);
        }
    }

    public static final void b(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(155925518);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = sVar.j(androidx.compose.foundation.text.contextmenu.provider.g.a) != null;
            boolean z2 = sVar.j(androidx.compose.foundation.text.contextmenu.provider.g.b) != null;
            if (z && z2) {
                sVar.b0(-1977187922);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                int iHashCode = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL = sVar.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar2);
                } else {
                    sVar.o0();
                }
                androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                fVar.invoke(sVar, Integer.valueOf((i2 >> 3) & 14));
                sVar.p(true);
                sVar.p(false);
            } else if (z) {
                sVar.b0(-1976997706);
                c(rVar, fVar, sVar, i2 & Token.ELSE);
                sVar.p(false);
            } else if (z2) {
                sVar.b0(-1976846922);
                n.d(rVar, fVar, sVar, i2 & Token.ELSE);
                sVar.p(false);
            } else {
                sVar.b0(-1976716505);
                a(rVar, fVar, sVar, i2 & Token.ELSE);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar, fVar, i, 3);
        }
    }

    public static final void c(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(2064964257);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            d(rVar, fVar, sVar, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar, fVar, i, 0);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(771959668);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (objQ == fVar2) {
                j1 j1Var = new j1(null, androidx.compose.runtime.f.A);
                sVar.l0(j1Var);
                objQ = j1Var;
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar2) {
                objQ2 = new androidx.compose.foundation.lazy.m(a1Var, 4);
                sVar.l0(objQ2);
            }
            androidx.compose.runtime.t.a(androidx.compose.foundation.text.contextmenu.provider.g.b.a(e((kotlin.jvm.functions.a) objQ2, sVar, 0)), androidx.compose.runtime.internal.k.c(-291176396, new b2(2, rVar, a1Var, fVar), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar, fVar, i, 1);
        }
    }

    public static final i e(kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        View view = (View) sVar.j(m0.f);
        boolean zF = sVar.f(view);
        Object objQ = sVar.Q();
        Object obj = androidx.compose.runtime.n.a;
        if (zF || objQ == obj) {
            objQ = new i(view, null, aVar);
            sVar.l0(objQ);
        }
        i iVar = (i) objQ;
        boolean zH = sVar.h(iVar);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == obj) {
            objQ2 = new a(iVar, 3);
            sVar.l0(objQ2);
        }
        l0.b(iVar, (kotlin.jvm.functions.l) objQ2, sVar);
        return iVar;
    }
}
