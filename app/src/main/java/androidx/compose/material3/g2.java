package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {
    public static final androidx.compose.runtime.x2 a;

    static {
        kotlin.a.d(new androidx.activity.compose.b(21));
        a = new androidx.compose.runtime.x2(new androidx.activity.compose.b(22));
    }

    public static final void a(t0 t0Var, l3 l3Var, c5 c5Var, m6 m6Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(904511636);
        if ((i & 6) == 0) {
            i2 = (sVar.f(t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(l3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(c5Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(m6Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(fVar) ? 16384 : 8192;
        }
        if (sVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            sVar.Y();
            if ((i & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            y4 y4VarA = x4.a(false, 0.0f, 7);
            long j = t0Var.a;
            boolean zE = sVar.e(j);
            Object objQ = sVar.Q();
            if (zE || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.foundation.text.selection.i1(j, androidx.compose.ui.graphics.t.b(0.4f, j));
                sVar.l0(objQ);
            }
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{u0.a.a(t0Var), a.a(l3Var), androidx.compose.foundation.b1.a.a(y4VarA), d5.a.a(c5Var), androidx.compose.foundation.text.selection.j1.a.a((androidx.compose.foundation.text.selection.i1) objQ), n6.a.a(m6Var)}, androidx.compose.runtime.internal.k.c(-1750539308, new e0(2, m6Var, fVar), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.g2(t0Var, l3Var, c5Var, m6Var, fVar, i, 1);
        }
    }

    public static final void b(t0 t0Var, c5 c5Var, m6 m6Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        t0 t0Var2;
        androidx.compose.runtime.s sVar2;
        androidx.compose.runtime.internal.f fVar2;
        m6 m6Var2;
        c5 c5Var2;
        sVar.c0(-449719819);
        int i2 = i | 16 | (sVar.f(m6Var) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                c5Var = (c5) sVar.j(d5.a);
            } else {
                sVar.W();
            }
            int i3 = i2 & (-113);
            c5 c5Var3 = c5Var;
            sVar.q();
            int i4 = i3 << 3;
            t0Var2 = t0Var;
            sVar2 = sVar;
            a(t0Var2, (l3) sVar.j(a), c5Var3, m6Var, fVar, sVar2, (i4 & 7168) | 6 | (i4 & 57344));
            m6Var2 = m6Var;
            fVar2 = fVar;
            c5Var2 = c5Var3;
        } else {
            t0Var2 = t0Var;
            sVar2 = sVar;
            fVar2 = fVar;
            m6Var2 = m6Var;
            sVar2.W();
            c5Var2 = c5Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(t0Var2, c5Var2, m6Var2, fVar2, i);
        }
    }
}
