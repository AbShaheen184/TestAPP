package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.r1;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.compose.ui.q implements z1, r1, androidx.compose.ui.node.i {
    public androidx.compose.ui.node.m L;
    public a M;
    public boolean N;

    public f(a aVar, androidx.compose.ui.node.m mVar) {
        this.L = mVar;
        this.M = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void D(m mVar, n nVar, long j) {
        if (nVar == n.y) {
            ?? r3 = mVar.a;
            int size = r3.size();
            for (int i = 0; i < size; i++) {
                if (P0(((v) r3.get(i)).i)) {
                    int i2 = mVar.f;
                    if (i2 == 4) {
                        this.N = true;
                        O0();
                        return;
                    } else {
                        if (i2 == 5) {
                            Q0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        Q0();
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        Q0();
    }

    public final void M0() {
        a aVar;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.compose.ui.node.l.z(this, new e(1));
        f fVar = (f) zVar.e;
        if (fVar == null || (aVar = fVar.M) == null) {
            aVar = this.M;
        }
        N0(aVar);
    }

    public abstract void N0(s sVar);

    public final void O0() {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.e = true;
        androidx.compose.ui.node.l.B(this, new androidx.compose.ui.draganddrop.f(vVar));
        if (vVar.e) {
            M0();
        }
    }

    public abstract boolean P0(int i);

    public final void Q0() {
        if (this.N) {
            this.N = false;
            if (this.K) {
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                androidx.compose.ui.node.l.z(this, new androidx.compose.ui.input.nestedscroll.j(1, zVar));
                f fVar = (f) zVar.e;
                if (fVar != null) {
                    fVar.M0();
                } else {
                    N0(null);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final long k() {
        androidx.compose.ui.node.m mVar = this.L;
        if (mVar == null) {
            return x1.a;
        }
        androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.l.v(this).W;
        int i = x1.b;
        return b1.c(cVar.i0(mVar.a), cVar.i0(mVar.b), cVar.i0(mVar.c), cVar.i0(mVar.d));
    }
}
