package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.s1;
import androidx.compose.ui.focus.d0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final i a = new i();

    public static final void a(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.savedstate.g gVar;
        Object obj = b.C;
        sVar.c0(-180024211);
        if ((i & 6) == 0) {
            i2 = (sVar.h(lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= sVar.h(obj) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(lVar2) ? 16384 : 8192;
        }
        if (sVar.T(i3 & 1, (i3 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar.d(p.b).d(d0.b).d(u.b).d(s.b));
            androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(l1.h);
            androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) sVar.j(l1.n);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.lifecycle.v vVar = (androidx.lifecycle.v) sVar.j(androidx.lifecycle.compose.c.a);
            androidx.savedstate.g gVar2 = (androidx.savedstate.g) sVar.j(androidx.savedstate.compose.a.a);
            sVar.b0(1314774735);
            int i4 = i3 & 14;
            int iHashCode2 = Long.hashCode(sVar.T);
            Context context = (Context) sVar.j(m0.b);
            androidx.compose.runtime.q qVarU = androidx.compose.runtime.t.u(sVar);
            androidx.compose.runtime.saveable.g gVar3 = (androidx.compose.runtime.saveable.g) sVar.j(androidx.compose.runtime.saveable.i.a);
            View view = (View) sVar.j(m0.f);
            boolean zH = sVar.h(context) | ((((i4 & 14) ^ 6) > 4 && sVar.f(lVar)) || (i4 & 6) == 4) | sVar.h(qVarU) | sVar.h(gVar3) | sVar.d(iHashCode2) | sVar.h(view);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                gVar = gVar2;
                Object mVar2 = new m(context, lVar, qVarU, gVar3, iHashCode2, view);
                sVar.l0(mVar2);
                objQ = mVar2;
            } else {
                gVar = gVar2;
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
            sVar.X(Token.IF, null, null, 1);
            sVar.r = true;
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.x(sVar, rVarC, l.B);
            androidx.compose.runtime.t.x(sVar, cVar, l.C);
            androidx.compose.runtime.t.x(sVar, vVar, l.D);
            androidx.compose.runtime.t.x(sVar, gVar, l.E);
            androidx.compose.runtime.t.x(sVar, mVar, l.F);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.x(sVar, lVar2, l.z);
            androidx.compose.runtime.t.x(sVar, obj, l.A);
            sVar.p(true);
            sVar.p(false);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new k(lVar, rVar, lVar2, i);
        }
    }

    public static final void b(kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        b bVar = b.C;
        sVar.c0(-1783766393);
        int i4 = (sVar.h(lVar) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (sVar.h(lVar2) ? LibretroCore.SCREEN_WIDTH : 128);
        }
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            if (i5 != 0) {
                lVar2 = bVar;
            }
            a(lVar, rVar, lVar2, sVar, (i3 & 14) | 3120 | ((i3 << 6) & 57344));
        } else {
            sVar.W();
        }
        kotlin.jvm.functions.l lVar3 = lVar2;
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new k(lVar, rVar, lVar3, i, i2);
        }
    }

    public static final View c(androidx.compose.ui.q qVar) {
        w wVar = androidx.compose.ui.node.l.v(qVar.e).M;
        View interopView = wVar != null ? wVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        kotlinx.coroutines.future.a.u("Could not fetch interop view");
        return null;
    }

    public static final void d(w wVar, f0 f0Var) {
        long jX = ((androidx.compose.ui.node.s) f0Var.d0.d).X(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jX >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jX & 4294967295L)));
        wVar.layout(iRound, iRound2, wVar.getMeasuredWidth() + iRound, wVar.getMeasuredHeight() + iRound2);
    }

    public static final w e(f0 f0Var) {
        w wVar = f0Var.M;
        if (wVar != null) {
            return wVar;
        }
        throw androidx.compose.runtime.j.a("Required value was null.");
    }
}
