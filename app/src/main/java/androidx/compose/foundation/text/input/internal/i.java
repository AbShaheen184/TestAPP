package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.semantics.a0;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.input.d0;
import androidx.compose.ui.text.input.e0;
import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.node.k implements u1 {
    public e0 N;
    public androidx.compose.ui.text.input.x O;
    public r0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public androidx.compose.ui.text.input.q T;
    public b1 U;
    public androidx.compose.ui.text.input.k V;
    public y W;

    public static void P0(r0 r0Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        d0 d0Var = r0Var.e;
        androidx.compose.foundation.text.s sVar = r0Var.v;
        if (d0Var == null) {
            int length = str.length();
            sVar.invoke(new androidx.compose.ui.text.input.x(4, androidx.compose.ui.text.d0.b(length, length), str));
        } else {
            androidx.compose.ui.text.input.x xVarJ = r0Var.d.j(kotlin.collections.q.k(new androidx.compose.ui.text.input.d(), new androidx.compose.ui.text.input.a(str, 1)));
            d0Var.a(null, xVarJ);
            sVar.invoke(xVarJ);
        }
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(a0 a0Var) {
        boolean z = this.S;
        androidx.compose.ui.text.g gVar = this.O.a;
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
        z zVar = androidx.compose.ui.semantics.w.E;
        kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.y.a;
        kotlin.reflect.j jVar = jVarArr2[18];
        a0Var.b(zVar, gVar);
        androidx.compose.ui.text.g gVar2 = this.N.a;
        z zVar2 = androidx.compose.ui.semantics.w.F;
        kotlin.reflect.j jVar2 = jVarArr2[19];
        a0Var.b(zVar2, gVar2);
        long j = this.O.b;
        z zVar3 = androidx.compose.ui.semantics.w.G;
        kotlin.reflect.j jVar3 = jVarArr2[20];
        a0Var.b(zVar3, new l0(j));
        z zVar4 = androidx.compose.ui.semantics.w.r;
        kotlin.reflect.j jVar4 = jVarArr2[9];
        a0Var.b(zVar4, androidx.compose.ui.autofill.n.a);
        androidx.compose.ui.autofill.g gVarI = androidx.media3.common.audio.h.i(this.O.a);
        if (gVarI != null) {
            z zVar5 = androidx.compose.ui.semantics.w.s;
            kotlin.reflect.j jVar5 = jVarArr2[10];
            a0Var.b(zVar5, gVarI);
        }
        boolean z2 = false;
        androidx.compose.ui.semantics.y.b(a0Var, new h(this, 0));
        int i = this.V.d;
        if (i == 6) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar = androidx.compose.ui.autofill.o.c;
            z zVar6 = androidx.compose.ui.semantics.w.q;
            kotlin.reflect.j jVar6 = jVarArr2[8];
            a0Var.b(zVar6, fVar);
        } else if (i == 7 || i == 8) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar2 = androidx.compose.ui.autofill.o.b;
            z zVar7 = androidx.compose.ui.semantics.w.q;
            kotlin.reflect.j jVar7 = jVarArr2[8];
            a0Var.b(zVar7, fVar2);
        } else if (i == 4) {
            androidx.compose.ui.autofill.p.a.getClass();
            androidx.compose.ui.autofill.f fVar3 = androidx.compose.ui.autofill.o.d;
            z zVar8 = androidx.compose.ui.semantics.w.q;
            kotlin.reflect.j jVar8 = jVarArr2[8];
            a0Var.b(zVar8, fVar3);
        }
        boolean z3 = this.R;
        kotlin.y yVar = kotlin.y.a;
        if (!z3) {
            a0Var.b(androidx.compose.ui.semantics.w.i, yVar);
        }
        if (z) {
            a0Var.b(androidx.compose.ui.semantics.w.K, yVar);
        }
        if (this.R && !this.Q) {
            z2 = true;
        }
        z zVar9 = androidx.compose.ui.semantics.w.N;
        kotlin.reflect.j jVar9 = jVarArr2[26];
        a0Var.b(zVar9, Boolean.valueOf(z2));
        androidx.compose.ui.semantics.y.a(a0Var, new h(this, 1));
        if (z2) {
            a0Var.b(androidx.compose.ui.semantics.m.k, new androidx.compose.ui.semantics.a(null, new h(this, 2)));
            a0Var.b(androidx.compose.ui.semantics.m.o, new androidx.compose.ui.semantics.a(null, new h(this, a0Var)));
        }
        a0Var.b(androidx.compose.ui.semantics.m.j, new androidx.compose.ui.semantics.a(null, new androidx.compose.foundation.gestures.y(this, 3)));
        int i2 = this.V.e;
        g gVar3 = new g(this, 6);
        a0Var.b(androidx.compose.ui.semantics.w.H, new androidx.compose.ui.text.input.j(i2));
        a0Var.b(androidx.compose.ui.semantics.m.p, new androidx.compose.ui.semantics.a(null, gVar3));
        a0Var.b(androidx.compose.ui.semantics.m.b, new androidx.compose.ui.semantics.a(null, new g(this, 7)));
        a0Var.b(androidx.compose.ui.semantics.m.c, new androidx.compose.ui.semantics.a(null, new g(this, 1)));
        if (!l0.c(this.O.b) && !z) {
            a0Var.b(androidx.compose.ui.semantics.m.q, new androidx.compose.ui.semantics.a(null, new g(this, 2)));
            if (this.R && !this.Q) {
                a0Var.b(androidx.compose.ui.semantics.m.r, new androidx.compose.ui.semantics.a(null, new g(this, 3)));
            }
        }
        if (!this.R || this.Q) {
            return;
        }
        a0Var.b(androidx.compose.ui.semantics.m.s, new androidx.compose.ui.semantics.a(null, new g(this, 5)));
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean v0() {
        return true;
    }
}
