package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.l;
import androidx.compose.ui.node.v;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import com.google.firebase.crashlytics.internal.model.t1;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements z1, v {
    public g L;
    public g M;
    public long N;

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.M = null;
        this.L = null;
    }

    public final boolean M0() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar.M0();
        }
        g gVar2 = this.M;
        if (gVar2 != null) {
            return gVar2.M0();
        }
        return false;
    }

    public final void N0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.N0();
            return;
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.N0();
        }
    }

    public final void O0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.O0();
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.O0();
        }
        this.L = null;
    }

    public final void P0(com.app.mlounge.data.music.e eVar) {
        z1 z1Var;
        g gVar;
        g gVar2 = this.L;
        if (gVar2 == null || !t1.e(gVar2, com.imsdk.a.p(eVar))) {
            if (this.e.K) {
                z zVar = new z();
                l.B(this, new androidx.compose.animation.h(3, zVar, this, eVar));
                z1Var = (z1) zVar.e;
            } else {
                z1Var = null;
            }
            gVar = (g) z1Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.N0();
            gVar.P0(eVar);
            g gVar3 = this.M;
            if (gVar3 != null) {
                gVar3.O0();
            }
        } else if (gVar == null && gVar2 != null) {
            g gVar4 = this.M;
            if (gVar4 != null) {
                gVar4.N0();
                gVar4.P0(eVar);
            }
            gVar2.O0();
        } else if (!kotlin.jvm.internal.l.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.N0();
                gVar.P0(eVar);
            }
            if (gVar2 != null) {
                gVar2.O0();
            }
        } else if (gVar != null) {
            gVar.P0(eVar);
        } else {
            g gVar5 = this.M;
            if (gVar5 != null) {
                gVar5.P0(eVar);
            }
        }
        this.L = gVar;
    }

    public final void Q0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.Q0();
            return;
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.Q0();
        }
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return e.a;
    }

    @Override // androidx.compose.ui.node.v
    public final void l(long j) {
        this.N = j;
    }
}
