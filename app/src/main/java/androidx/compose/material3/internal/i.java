package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.j6;
import androidx.compose.material3.l6;
import androidx.compose.material3.t3;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s1;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final androidx.compose.ui.text.w a = new androidx.compose.ui.text.w(null, new androidx.compose.ui.text.u());
    public static final StackTraceElement[] b = new StackTraceElement[0];

    public static final void a(androidx.compose.ui.window.c0 c0Var, androidx.compose.runtime.internal.f fVar, j6 j6Var, androidx.compose.runtime.internal.f fVar2, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.ui.window.c0 c0Var2;
        int i2;
        Object obj;
        boolean z;
        sVar.c0(-1221877520);
        if ((i & 6) == 0) {
            c0Var2 = c0Var;
            i2 = (sVar.f(c0Var2) ? 4 : 2) | i;
        } else {
            c0Var2 = c0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? sVar.f(j6Var) : sVar.h(j6Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i3 = i & 3072;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        if (i3 == 0) {
            i2 |= sVar.f(oVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= sVar.g(false) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= sVar.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= sVar.h(fVar2) ? 67108864 : 33554432;
        }
        if (sVar.T(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objQ = sVar.Q();
            Object obj2 = androidx.compose.runtime.n.a;
            if (objQ == obj2) {
                objQ = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj2) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ2;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, oVar);
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
            l6 l6Var = (l6) j6Var;
            if (l6Var.b()) {
                sVar.b0(-1891243071);
                androidx.compose.ui.window.c0 c0Var3 = c0Var2;
                obj = obj2;
                c(c0Var3, l6Var, coroutineScope, false, a1Var, fVar, sVar, ((i2 << 15) & 3670016) | (i2 & 14) | 196608 | ((i2 >> 3) & Token.ASSIGN_MOD) | ((i2 >> 6) & 896));
                z = false;
                sVar.p(false);
            } else {
                obj = obj2;
                z = false;
                sVar.b0(-1890863476);
                sVar.p(false);
            }
            d(l6Var, a1Var, fVar2, sVar, ((i2 >> 18) & 14) | 384 | ((i2 >> 3) & Token.ASSIGN_MOD) | ((i2 >> 12) & 7168) | (57344 & (i2 << 3)) | ((i2 >> 9) & 458752));
            sVar.p(true);
            boolean z2 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && sVar.h(l6Var))) ? true : z;
            Object objQ3 = sVar.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.g(l6Var, 27);
                sVar.l0(objQ3);
            }
            androidx.compose.runtime.l0.b(l6Var, (kotlin.jvm.functions.l) objQ3, sVar);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.material3.d(c0Var, fVar, j6Var, fVar2, i);
        }
    }

    public static final void b(long j, androidx.compose.ui.text.m0 m0Var, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-684938728);
        int i2 = (sVar.e(j) ? 4 : 2) | i | (sVar.f(m0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= sVar.h(pVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            androidx.compose.runtime.d0 d0Var = z5.a;
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{androidx.compose.material3.a1.a.a(new androidx.compose.ui.graphics.t(j)), d0Var.a(((androidx.compose.ui.text.m0) sVar.j(d0Var)).d(m0Var))}, pVar, sVar, ((i2 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new q0(j, m0Var, pVar, i, 0);
        }
    }

    public static final void c(androidx.compose.ui.window.c0 c0Var, j6 j6Var, CoroutineScope coroutineScope, boolean z, androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.ui.window.c0 c0Var2;
        int i2;
        sVar.c0(-1413720282);
        if ((i & 6) == 0) {
            c0Var2 = c0Var;
            i2 = (sVar.f(c0Var2) ? 4 : 2) | i;
        } else {
            c0Var2 = c0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(j6Var) : sVar.h(j6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(coroutineScope) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(a1Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.h(fVar) ? 1048576 : 524288;
        }
        if (sVar.T(i2 & 1, (599187 & i2) != 599186)) {
            String string = ((Resources) sVar.j(androidx.compose.ui.platform.m0.c)).getString(R.string.tooltip_description);
            boolean zH = ((i2 & Token.ASSIGN_MOD) == 32 || ((i2 & 64) != 0 && sVar.h(j6Var))) | ((i2 & 896) == 256) | sVar.h(coroutineScope) | ((458752 & i2) == 131072);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.foundation.gestures.g(4, j6Var, coroutineScope, a1Var);
                sVar.l0(objQ);
            }
            androidx.compose.ui.window.o.a(c0Var2, (kotlin.jvm.functions.a) objQ, new androidx.compose.ui.window.d0(14, z), androidx.compose.runtime.internal.k.c(-1287705660, new androidx.compose.material3.e0(5, string, fVar), sVar), sVar, (i2 & 14) | 3072, 0);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.l(c0Var, j6Var, coroutineScope, z, a1Var, fVar, i);
        }
    }

    public static final void d(j6 j6Var, androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(1873232064);
        if ((i & 6) == 0) {
            i2 = (sVar.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(j6Var) : sVar.h(j6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(a1Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.g(false) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i3 = i & 24576;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        if (i3 == 0) {
            i2 |= sVar.f(oVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.h(fVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (sVar.T(i2 & 1, (74899 & i2) != 74898)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ;
            androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(androidx.compose.ui.focus.d.t(androidx.compose.ui.input.pointer.h0.a(androidx.compose.ui.input.pointer.h0.a(oVar, j6Var, new w(j6Var, 0)), j6Var, new w(j6Var, 1)).d(new o0(new androidx.compose.animation.core.a(12, ((Resources) sVar.j(androidx.compose.ui.platform.m0.c)).getString(R.string.tooltip_label), coroutineScope, j6Var))), new androidx.activity.compose.h(29, coroutineScope, j6Var)), new androidx.compose.foundation.text.c0(2, j6Var, a1Var));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarE);
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
            fVar.invoke(sVar, Integer.valueOf((i2 >> 15) & 14));
            sVar.p(true);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(j6Var, a1Var, fVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.y = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj = gVar.e;
        int i2 = gVar.y;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                androidx.compose.animation.b0 b0Var = new androidx.compose.animation.b0(aVar, pVar, (kotlin.coroutines.d) null, 16);
                gVar.y = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(b0Var, gVar);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objCoroutineScope == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (e unused) {
        }
        return kotlin.y.a;
    }

    public static androidx.compose.ui.r f(androidx.compose.ui.r rVar) {
        return rVar.d(new y(new t3(0)));
    }

    public static final androidx.compose.ui.r g(androidx.compose.ui.r rVar, p pVar, kotlin.jvm.functions.p pVar2) {
        return rVar.d(new z(pVar, pVar2));
    }

    public static final Object h(androidx.compose.ui.layout.p0 p0Var) {
        Object objL = p0Var.L();
        androidx.compose.ui.layout.b0 b0Var = objL instanceof androidx.compose.ui.layout.b0 ? (androidx.compose.ui.layout.b0) objL : null;
        if (b0Var != null) {
            return b0Var.L;
        }
        return null;
    }

    public static final String i(int i, androidx.compose.runtime.s sVar) {
        sVar.j(androidx.compose.ui.platform.m0.a);
        return ((Context) sVar.j(androidx.compose.ui.platform.m0.b)).getResources().getString(i);
    }

    public static final int j(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
