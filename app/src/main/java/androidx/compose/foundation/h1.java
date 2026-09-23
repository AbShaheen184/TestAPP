package androidx.compose.foundation;

import android.view.View;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends androidx.compose.ui.q implements androidx.compose.ui.node.o, androidx.compose.ui.node.n, androidx.compose.ui.node.u1, androidx.compose.ui.node.h1 {
    public androidx.compose.foundation.text.selection.g1 L;
    public androidx.compose.foundation.text.selection.e1 M;
    public t1 N;
    public View O;
    public androidx.compose.ui.unit.c P;
    public s1 Q;
    public androidx.compose.runtime.g0 S;
    public androidx.compose.ui.unit.l U;
    public Channel V;
    public final androidx.compose.runtime.j1 R = new androidx.compose.runtime.j1(null, androidx.compose.runtime.f.A);
    public long T = 9205357640488583168L;

    public h1(androidx.compose.foundation.text.selection.g1 g1Var, androidx.compose.foundation.text.selection.e1 e1Var, t1 t1Var) {
        this.L = g1Var;
        this.M = e1Var;
        this.N = t1Var;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        g0();
        this.V = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(A0(), null, CoroutineStart.UNDISPATCHED, new androidx.compose.animation.core.c1(this, null, 4), 1, null);
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        s1 s1Var = this.Q;
        if (s1Var != null) {
            ((u1) s1Var).b();
        }
        this.Q = null;
    }

    public final long M0() {
        if (this.S == null) {
            this.S = androidx.compose.runtime.t.k(new g1(this, 2));
        }
        androidx.compose.runtime.g0 g0Var = this.S;
        if (g0Var != null) {
            return ((androidx.compose.ui.geometry.b) g0Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void N0() {
        s1 s1Var = this.Q;
        if (s1Var != null) {
            ((u1) s1Var).b();
        }
        View viewX = this.O;
        if (viewX == null) {
            viewX = androidx.compose.ui.node.l.x(this);
        }
        this.O = viewX;
        androidx.compose.ui.unit.c cVar = this.P;
        if (cVar == null) {
            cVar = androidx.compose.ui.node.l.v(this).W;
        }
        this.P = cVar;
        this.Q = this.N.b(viewX, cVar);
        P0();
    }

    public final void O0() {
        androidx.compose.ui.unit.c cVar = this.P;
        if (cVar == null) {
            cVar = androidx.compose.ui.node.l.v(this).W;
            this.P = cVar;
        }
        long j = ((androidx.compose.ui.geometry.b) this.L.invoke(cVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & M0()) == 9205357640488583168L) {
            this.T = 9205357640488583168L;
            s1 s1Var = this.Q;
            if (s1Var != null) {
                ((u1) s1Var).b();
                return;
            }
            return;
        }
        this.T = androidx.compose.ui.geometry.b.e(M0(), j);
        if (this.Q == null) {
            N0();
        }
        s1 s1Var2 = this.Q;
        if (s1Var2 != null) {
            s1Var2.a(this.T, 9205357640488583168L);
        }
        P0();
    }

    public final void P0() {
        androidx.compose.ui.unit.c cVar;
        s1 s1Var = this.Q;
        if (s1Var == null || (cVar = this.P) == null) {
            return;
        }
        u1 u1Var = (u1) s1Var;
        long jC = u1Var.c();
        androidx.compose.ui.unit.l lVar = this.U;
        if (lVar != null && jC == lVar.a) {
            return;
        }
        this.M.invoke(new androidx.compose.ui.unit.h(cVar.o(coil3.network.g.F(u1Var.c()))));
        this.U = new androidx.compose.ui.unit.l(u1Var.c());
    }

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        h0Var.b();
        Channel channel = this.V;
        if (channel != null) {
            ChannelResult.m42boximpl(channel.mo28trySendJP2dKIU(kotlin.y.a));
        }
    }

    @Override // androidx.compose.ui.node.h1
    public final void g0() {
        androidx.compose.ui.node.l.r(this, new g1(this, 0));
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        a0Var.b(i1.a, new g1(this, 1));
    }

    @Override // androidx.compose.ui.node.o
    public final void w0(androidx.compose.ui.node.d1 d1Var) {
        this.R.setValue(d1Var);
    }
}
