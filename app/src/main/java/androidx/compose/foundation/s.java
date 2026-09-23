package androidx.compose.foundation;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.l2;
import androidx.compose.material3.y4;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final a0 a(float f, long j) {
        return new a0(f, new androidx.compose.ui.graphics.p0(j));
    }

    public static final void b(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-932836462);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar.h(lVar) ? 32 : 16);
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.foundation.layout.b.e(sVar, androidx.compose.ui.draw.h.c(rVar, lVar));
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.v1(rVar, lVar, i, 1);
        }
    }

    public static final void c(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.r rVar, androidx.compose.ui.e eVar, androidx.compose.ui.layout.j jVar, float f, androidx.compose.runtime.s sVar, int i) {
        float f2;
        sVar.c0(1142754848);
        int i2 = (sVar.h(bVar) ? 4 : 2) | i | 1797120;
        if (sVar.T(i2 & 1, (599187 & i2) != 599186)) {
            eVar = androidx.compose.ui.c.B;
            sVar.b0(1899222916);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = new androidx.compose.animation.core.n1(22);
                sVar.l0(objQ);
            }
            androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ);
            sVar.p(false);
            androidx.compose.ui.r rVarF = androidx.compose.ui.draw.h.f(androidx.compose.ui.draw.h.b(rVar.d(rVarA)), bVar, 1.0f, null, 2);
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar) {
                objQ2 = a1.a;
                sVar.l0(objQ2);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ2;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarF);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0Var, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            sVar.p(true);
            jVar = androidx.compose.ui.layout.i.b;
            f2 = 1.0f;
        } else {
            sVar.W();
            f2 = f;
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.ui.layout.j jVar2 = jVar;
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new z0(bVar, rVar, eVar2, jVar2, f2, i);
        }
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2, androidx.compose.ui.unit.c cVar) {
        float f3 = p0.a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) p0.a) * dA;
        float fExp = (float) (Math.exp((p0.b / p0.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? q.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iH = kotlin.math.a.H(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iH);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iH);
        }
        return f;
    }

    public static androidx.compose.ui.r e(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.e0 e0Var) {
        return rVar.d(new r(0L, e0Var, androidx.compose.ui.graphics.a0.b, 1));
    }

    public static final androidx.compose.ui.r f(androidx.compose.ui.r rVar, long j, androidx.compose.ui.graphics.n0 n0Var) {
        return rVar.d(new r(j, null, n0Var, 2));
    }

    public static final androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f, long j, androidx.compose.ui.graphics.n0 n0Var) {
        return rVar.d(new z(f, new androidx.compose.ui.graphics.p0(j), n0Var));
    }

    public static final void h(long j, androidx.compose.foundation.gestures.o1 o1Var) {
        if (o1Var == androidx.compose.foundation.gestures.o1.e) {
            if (androidx.compose.ui.unit.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            androidx.compose.foundation.internal.b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (androidx.compose.ui.unit.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            androidx.compose.foundation.internal.b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final androidx.compose.ui.r i(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, e1 e1Var, boolean z, androidx.compose.ui.semantics.j jVar, kotlin.jvm.functions.a aVar) {
        androidx.compose.ui.r rVarD;
        if (e1Var != null) {
            rVarD = new b0(kVar, e1Var, false, z, null, jVar, aVar);
        } else if (e1Var == null) {
            rVarD = new b0(kVar, null, false, z, null, jVar, aVar);
        } else {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            rVarD = kVar != null ? b1.a(oVar, kVar, e1Var).d(new b0(kVar, null, false, z, null, jVar, aVar)) : androidx.compose.ui.a.a(oVar, new d0(e1Var, z, jVar, aVar));
        }
        return rVar.d(rVarD);
    }

    public static /* synthetic */ androidx.compose.ui.r j(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, y4 y4Var, boolean z, androidx.compose.ui.semantics.j jVar, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            jVar = null;
        }
        return i(rVar, kVar, y4Var, z2, jVar, aVar);
    }

    public static androidx.compose.ui.r k(androidx.compose.ui.r rVar, boolean z, String str, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return rVar.d(new b0(null, null, true, z2, str, null, aVar));
    }

    public static androidx.compose.ui.r l(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        return rVar.d(new h0(kVar, aVar2, aVar));
    }

    public static final androidx.compose.ui.r m(androidx.compose.ui.r rVar, boolean z, androidx.compose.foundation.interaction.k kVar) {
        return rVar.d(z ? new r0(kVar) : androidx.compose.ui.o.b);
    }

    public static /* synthetic */ androidx.compose.ui.r n(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, int i) {
        if ((i & 2) != 0) {
            kVar = null;
        }
        return m(rVar, true, kVar);
    }

    public static final boolean o(KeyEvent keyEvent) {
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        int i = androidx.compose.ui.input.key.a.F;
        return androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.h) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.r) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.E) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.q);
    }

    public static final c2 p(androidx.compose.runtime.s sVar) {
        Object[] objArr = new Object[0];
        boolean zD = sVar.d(0);
        Object objQ = sVar.Q();
        if (zD || objQ == androidx.compose.runtime.n.a) {
            objQ = new androidx.activity.compose.b(8);
            sVar.l0(objQ);
        }
        return (c2) androidx.compose.runtime.saveable.l.c(objArr, c2.j, (kotlin.jvm.functions.a) objQ, sVar, 0);
    }

    public static androidx.compose.ui.r q(androidx.compose.ui.r rVar, c2 c2Var, boolean z) {
        androidx.compose.foundation.gestures.o1 o1Var = androidx.compose.foundation.gestures.o1.e;
        androidx.compose.foundation.gestures.o1 o1Var2 = z ? o1Var : androidx.compose.foundation.gestures.o1.y;
        androidx.compose.foundation.interaction.k kVar = c2Var.d;
        float f = g0.a;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        return rVar.d(o1Var2 == o1Var ? androidx.compose.ui.draw.h.a(oVar, y0.c) : androidx.compose.ui.draw.h.a(oVar, y0.b)).d(new d2(null, null, o1Var2, c2Var, kVar, true, true)).d(new f2(c2Var, z));
    }

    public static androidx.compose.ui.r r(androidx.compose.ui.r rVar, l2 l2Var, androidx.compose.foundation.gestures.o1 o1Var, n nVar, boolean z, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.interaction.k kVar) {
        float f = g0.a;
        androidx.compose.foundation.gestures.o1 o1Var2 = androidx.compose.foundation.gestures.o1.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        return rVar.d(o1Var == o1Var2 ? androidx.compose.ui.draw.h.a(oVar, y0.c) : androidx.compose.ui.draw.h.a(oVar, y0.b)).d(new d2(nVar, lVar, o1Var, l2Var, kVar, z, false));
    }

    public static final long s(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
