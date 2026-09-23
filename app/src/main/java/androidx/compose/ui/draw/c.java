package androidx.compose.ui.draw;

import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.h1;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q implements h1, a, androidx.compose.ui.node.n {
    public final d L;
    public boolean M;
    public kotlin.jvm.functions.l N;

    public c(d dVar, kotlin.jvm.functions.l lVar) {
        this.L = dVar;
        this.N = lVar;
        dVar.e = this;
    }

    @Override // androidx.compose.ui.q
    public final void G0() {
        M0();
    }

    @Override // androidx.compose.ui.node.n
    public final void K() {
        M0();
    }

    public final void M0() {
        this.M = false;
        this.L.y = null;
        androidx.compose.ui.node.l.k(this);
    }

    @Override // androidx.compose.ui.node.j
    public final void O() {
        M0();
    }

    @Override // androidx.compose.ui.node.n
    public final void X(h0 h0Var) {
        boolean z = this.M;
        d dVar = this.L;
        if (!z) {
            dVar.y = null;
            androidx.compose.ui.node.l.r(this, new b(0, this, dVar));
            if (dVar.y == null) {
                throw androidx.compose.runtime.j.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.M = true;
        }
        i iVar = dVar.y;
        iVar.getClass();
        iVar.a.invoke(h0Var);
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.c a() {
        return androidx.compose.ui.node.l.v(this).W;
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.r1
    public final void b() {
        M0();
    }

    @Override // androidx.compose.ui.draw.a
    public final long d() {
        return coil3.network.g.F(androidx.compose.ui.node.l.t(this, 4).z);
    }

    @Override // androidx.compose.ui.node.h1
    public final void g0() {
        M0();
    }

    @Override // androidx.compose.ui.draw.a
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return androidx.compose.ui.node.l.v(this).X;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
    }
}
