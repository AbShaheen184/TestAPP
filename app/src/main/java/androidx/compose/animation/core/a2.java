package androidx.compose.animation.core;

import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements w2 {
    public final androidx.compose.runtime.j1 A;
    public y0 B;
    public t1 C;
    public final androidx.compose.runtime.j1 D;
    public final androidx.compose.runtime.f1 E;
    public boolean F;
    public final androidx.compose.runtime.j1 G;
    public s H;
    public final androidx.compose.runtime.h1 I;
    public boolean J;
    public final k1 K;
    public final /* synthetic */ e2 L;
    public final l2 e;
    public final androidx.compose.runtime.j1 y;
    public final androidx.compose.runtime.j1 z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public a2(e2 e2Var, Object obj, s sVar, l2 l2Var) {
        this.L = e2Var;
        this.e = l2Var;
        androidx.compose.runtime.j1 j1VarR = androidx.compose.runtime.t.r(obj);
        this.y = j1VarR;
        Object objInvoke = null;
        this.z = androidx.compose.runtime.t.r(e.n(0.0f, 0.0f, null, 7));
        this.A = androidx.compose.runtime.t.r(new t1(c(), l2Var, obj, j1VarR.getValue(), sVar));
        this.D = androidx.compose.runtime.t.r(Boolean.TRUE);
        this.E = new androidx.compose.runtime.f1(-1.0f);
        this.G = androidx.compose.runtime.t.r(obj);
        this.H = sVar;
        this.I = new androidx.compose.runtime.h1(b().b());
        Float f = (Float) v2.a.get(l2Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            s sVar2 = (s) l2Var.a.invoke(obj);
            int iB = sVar2.b();
            for (int i = 0; i < iB; i++) {
                sVar2.e(i, fFloatValue);
            }
            objInvoke = this.e.b.invoke(sVar2);
        }
        this.K = e.n(0.0f, 0.0f, objInvoke, 3);
    }

    public final t1 b() {
        return (t1) this.A.getValue();
    }

    public final b0 c() {
        return (b0) this.z.getValue();
    }

    public final void d(long j) {
        if (this.E.g() == -1.0f) {
            this.J = true;
            if (kotlin.jvm.internal.l.a(b().c, b().d)) {
                e(b().c);
            } else {
                e(b().f(j));
                this.H = b().d(j);
            }
        }
    }

    public final void e(Object obj) {
        this.G.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        t1 t1Var = this.C;
        Object obj2 = t1Var != null ? t1Var.c : null;
        androidx.compose.runtime.j1 j1Var = this.y;
        boolean zA = kotlin.jvm.internal.l.a(obj2, j1Var.getValue());
        androidx.compose.runtime.h1 h1Var = this.I;
        androidx.compose.runtime.j1 j1Var2 = this.A;
        if (zA) {
            j1Var2.setValue(new t1(this.K, this.e, obj, obj, this.H.c()));
            this.F = true;
            h1Var.h(b().b());
            return;
        }
        b0 b0VarC = (!z || this.J || (c() instanceof k1)) ? c() : this.K;
        e2 e2Var = this.L;
        long jE = e2Var.e();
        androidx.compose.runtime.j1 j1Var3 = e2Var.h;
        j1Var2.setValue(new t1(jE <= 0 ? b0VarC : new l1(b0VarC, e2Var.e()), this.e, obj, j1Var.getValue(), this.H));
        h1Var.h(b().b());
        this.F = false;
        j1Var3.setValue(Boolean.TRUE);
        if (e2Var.g()) {
            androidx.compose.runtime.snapshots.q qVar = e2Var.i;
            int size = qVar.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                a2 a2Var = (a2) qVar.get(i);
                jMax = Math.max(jMax, a2Var.I.g());
                a2Var.d(0L);
            }
            j1Var3.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, b0 b0Var) {
        this.y.setValue(obj2);
        this.z.setValue(b0Var);
        if (kotlin.jvm.internal.l.a(b().d, obj) && kotlin.jvm.internal.l.a(b().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return this.G.getValue();
    }

    public final void h(Object obj, b0 b0Var) {
        if (this.F) {
            t1 t1Var = this.C;
            if (kotlin.jvm.internal.l.a(obj, t1Var != null ? t1Var.c : null)) {
                return;
            }
        }
        androidx.compose.runtime.j1 j1Var = this.y;
        boolean zA = kotlin.jvm.internal.l.a(j1Var.getValue(), obj);
        androidx.compose.runtime.f1 f1Var = this.E;
        if (zA && f1Var.g() == -1.0f) {
            return;
        }
        j1Var.setValue(obj);
        this.z.setValue(b0Var);
        Object value = f1Var.g() == -3.0f ? obj : this.G.getValue();
        androidx.compose.runtime.j1 j1Var2 = this.D;
        f(value, !((Boolean) j1Var2.getValue()).booleanValue());
        j1Var2.setValue(Boolean.valueOf(f1Var.g() == -3.0f));
        if (f1Var.g() >= 0.0f) {
            e(b().f((long) (f1Var.g() * b().b())));
        } else if (f1Var.g() == -3.0f) {
            e(obj);
        }
        this.F = false;
        f1Var.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.G.getValue() + ", target: " + this.y.getValue() + ", spec: " + c();
    }
}
