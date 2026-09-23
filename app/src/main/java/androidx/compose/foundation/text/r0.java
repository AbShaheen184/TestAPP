package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.w1;
import androidx.compose.runtime.s1;
import androidx.compose.ui.platform.l2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final androidx.compose.runtime.j1 A;
    public final androidx.compose.runtime.j1 B;
    public w0 a;
    public final s1 b;
    public final l2 c;
    public final androidx.compose.foundation.text.input.internal.o d;
    public androidx.compose.ui.text.input.d0 e;
    public final androidx.compose.runtime.j1 f;
    public final androidx.compose.runtime.j1 g;
    public androidx.compose.ui.layout.x h;
    public final androidx.compose.runtime.j1 i;
    public androidx.compose.ui.text.g j;
    public final androidx.compose.runtime.j1 k;
    public final androidx.compose.runtime.j1 l;
    public final androidx.compose.runtime.j1 m;
    public final androidx.compose.runtime.j1 n;
    public final androidx.compose.runtime.j1 o;
    public boolean p;
    public final androidx.compose.runtime.j1 q;
    public final o0 r;
    public final androidx.compose.runtime.j1 s;
    public final androidx.compose.runtime.j1 t;
    public kotlin.jvm.functions.l u;
    public final s v;
    public final s w;
    public final s x;
    public final com.google.android.gms.cloudmessaging.n y;
    public long z;

    public r0(w0 w0Var, s1 s1Var, l2 l2Var) {
        this.a = w0Var;
        this.b = s1Var;
        this.c = l2Var;
        androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(22, false);
        androidx.compose.ui.text.g gVar = androidx.compose.ui.text.h.a;
        long j = androidx.compose.ui.text.l0.b;
        androidx.compose.ui.text.input.x xVar = new androidx.compose.ui.text.input.x(gVar, j, (androidx.compose.ui.text.l0) null);
        oVar.y = xVar;
        oVar.z = new androidx.compose.ui.text.input.h(gVar, xVar.b);
        this.d = oVar;
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.t.r(bool);
        this.g = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.f(0));
        this.i = androidx.compose.runtime.t.r(null);
        this.k = androidx.compose.runtime.t.r(g0.e);
        this.l = androidx.compose.runtime.t.r(bool);
        this.m = androidx.compose.runtime.t.r(bool);
        this.n = androidx.compose.runtime.t.r(bool);
        this.o = androidx.compose.runtime.t.r(bool);
        this.p = true;
        this.q = androidx.compose.runtime.t.r(Boolean.TRUE);
        this.r = new o0(l2Var);
        this.s = androidx.compose.runtime.t.r(bool);
        this.t = androidx.compose.runtime.t.r(bool);
        this.u = new w1(10);
        this.v = new s(this, 2);
        this.w = new s(this, 3);
        this.x = new s(this, 4);
        this.y = androidx.compose.ui.graphics.a0.g();
        this.z = androidx.compose.ui.graphics.t.i;
        this.A = androidx.compose.runtime.t.r(new androidx.compose.ui.text.l0(j));
        this.B = androidx.compose.runtime.t.r(new androidx.compose.ui.text.l0(j));
    }

    public final g0 a() {
        return (g0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final androidx.compose.ui.layout.x c() {
        androidx.compose.ui.layout.x xVar = this.h;
        if (xVar == null || !xVar.l()) {
            return null;
        }
        return xVar;
    }

    public final k1 d() {
        return (k1) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new androidx.compose.ui.text.l0(j));
    }

    public final void f(long j) {
        this.A.setValue(new androidx.compose.ui.text.l0(j));
    }
}
