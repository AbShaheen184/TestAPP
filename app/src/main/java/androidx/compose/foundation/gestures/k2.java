package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends l0 implements androidx.compose.ui.input.key.e, androidx.compose.ui.node.u1 {
    public androidx.compose.foundation.n f0;
    public l g0;
    public final androidx.compose.ui.input.nestedscroll.d h0;
    public final u1 i0;
    public final l j0;
    public final r2 k0;
    public final e2 l0;
    public final androidx.compose.ui.focus.e0 m0;
    public final j n0;
    public androidx.compose.animation.core.g0 o0;
    public i2 p0;
    public n1 q0;

    public k2(androidx.compose.foundation.n nVar, l lVar, o1 o1Var, l2 l2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        super(c2.a, z, kVar, o1Var);
        this.f0 = nVar;
        this.g0 = lVar;
        androidx.compose.ui.input.nestedscroll.d dVar = new androidx.compose.ui.input.nestedscroll.d();
        this.h0 = dVar;
        u1 u1Var = new u1();
        u1Var.L = z;
        M0(u1Var);
        this.i0 = u1Var;
        l lVar2 = new l(new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(c2.d)));
        this.j0 = lVar2;
        androidx.compose.foundation.n nVar2 = this.f0;
        l lVar3 = this.g0;
        r2 r2Var = new r2(l2Var, nVar2, lVar3 == null ? lVar2 : lVar3, o1Var, z2, dVar, this, new f2(this, 0));
        this.k0 = r2Var;
        e2 e2Var = new e2(r2Var, z);
        this.l0 = e2Var;
        androidx.compose.ui.focus.e0 e0Var = new androidx.compose.ui.focus.e0(2, null, 10);
        M0(e0Var);
        this.m0 = e0Var;
        j jVar = new j(o1Var, r2Var, z2, new f2(this, 1));
        M0(jVar);
        this.n0 = jVar;
        M0(new androidx.compose.ui.input.nestedscroll.i(e2Var, dVar));
        androidx.compose.foundation.relocation.h hVar = new androidx.compose.foundation.relocation.h();
        hVar.L = jVar;
        M0(hVar);
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.foundation.gestures.l0, androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        ?? r0 = mVar.a;
        ?? r10 = mVar.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) this.O.invoke(new androidx.compose.ui.input.pointer.d0(((androidx.compose.ui.input.pointer.v) r0.get(i)).i))).booleanValue()) {
                super.D(mVar, nVar, j);
                break;
            }
        }
        if (this.P) {
            androidx.compose.ui.input.pointer.n nVar2 = androidx.compose.ui.input.pointer.n.e;
            if (nVar == nVar2 && mVar.f == 6) {
                if (this.q0 == null) {
                    this.q0 = new n1(this.k0, new com.google.firebase.platforminfo.d(ViewConfiguration.get(androidx.compose.ui.node.l.x(this).getContext())), new g2(2, this, k2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), androidx.compose.ui.node.l.v(this).W);
                }
                n1 n1Var = this.q0;
                if (n1Var != null) {
                    CoroutineScope coroutineScopeA0 = A0();
                    if (((Job) n1Var.g) == null) {
                        n1Var.g = BuildersKt__Builders_commonKt.launch$default(coroutineScopeA0, null, null, new androidx.activity.compose.p(n1Var, (kotlin.coroutines.d) null, 3), 3, null);
                    }
                }
            }
            n1 n1Var2 = this.q0;
            if (n1Var2 == null || mVar.f != 6) {
                return;
            }
            int size2 = r10.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((androidx.compose.ui.input.pointer.v) r10.get(i2)).b()) {
                    return;
                }
            }
            if (nVar == nVar2 && n1Var2.a) {
                n1Var2.d(mVar);
                int size3 = r10.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((androidx.compose.ui.input.pointer.v) r10.get(i3)).a();
                }
            }
            if (nVar == androidx.compose.ui.input.pointer.n.y && !n1Var2.a && n1Var2.d(mVar)) {
                int size4 = r10.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((androidx.compose.ui.input.pointer.v) r10.get(i4)).a();
                }
            }
        }
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        if (this.K) {
            androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.l.v(this).W;
            l lVar = this.j0;
            lVar.getClass();
            lVar.a = new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(cVar));
        }
        n1 n1Var = this.q0;
        if (n1Var != null) {
            n1Var.e = androidx.compose.ui.node.l.v(this).W;
        }
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final Object T0(k0 k0Var, k0 k0Var2) {
        r2 r2Var = this.k0;
        Object objF = r2Var.f(androidx.compose.foundation.j1.y, new androidx.compose.animation.b0(k0Var, r2Var, (kotlin.coroutines.d) null, 8), k0Var2);
        return objF == kotlin.coroutines.intrinsics.a.e ? objF : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final void Z0(w wVar) {
        BuildersKt__Builders_commonKt.launch$default(this.h0.c(), null, null, new androidx.activity.compose.p(wVar, this, null, 5), 3, null);
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.r1
    public final void b() {
        E();
        if (this.K) {
            androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.l.v(this).W;
            l lVar = this.j0;
            lVar.getClass();
            lVar.a = new androidx.compose.animation.core.x(new com.app.mlounge.data.music.e(cVar));
        }
        n1 n1Var = this.q0;
        if (n1Var != null) {
            n1Var.e = androidx.compose.ui.node.l.v(this).W;
        }
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final boolean e1() {
        r2 r2Var = this.k0;
        if (r2Var.a.a()) {
            return true;
        }
        androidx.compose.foundation.n nVar = r2Var.b;
        if (nVar == null) {
            return false;
        }
        androidx.compose.foundation.q0 q0Var = nVar.c;
        EdgeEffect edgeEffect = q0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = q0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = q0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = q0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? androidx.compose.foundation.q.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    public final void h1(androidx.compose.foundation.n nVar, l lVar, o1 o1Var, l2 l2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.P != z) {
            this.l0.y = z;
            this.i0.L = z;
            z3 = true;
        } else {
            z3 = false;
        }
        l lVar2 = lVar == null ? this.j0 : lVar;
        r2 r2Var = this.k0;
        if (!kotlin.jvm.internal.l.a(r2Var.a, l2Var)) {
            r2Var.a = l2Var;
            z5 = true;
        }
        r2Var.b = nVar;
        if (r2Var.d != o1Var) {
            r2Var.d = o1Var;
            z5 = true;
        }
        if (r2Var.e != z2) {
            r2Var.e = z2;
        } else {
            z4 = z5;
        }
        r2Var.c = lVar2;
        r2Var.f = this.h0;
        j jVar = this.n0;
        jVar.L = o1Var;
        jVar.N = z2;
        this.f0 = nVar;
        this.g0 = lVar;
        w1 w1Var = c2.a;
        o1 o1Var2 = r2Var.d;
        o1 o1Var3 = o1.e;
        if (o1Var2 != o1Var3) {
            o1Var3 = o1.y;
        }
        g1(w1Var, z, kVar, o1Var3, z4);
        if (z3) {
            this.o0 = null;
            this.p0 = null;
            androidx.compose.ui.node.l.m(this);
        }
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        if (this.P && (this.o0 == null || this.p0 == null)) {
            this.o0 = new androidx.compose.animation.core.g0(this, 1);
            this.p0 = new i2(this, null);
        }
        androidx.compose.animation.core.g0 g0Var = this.o0;
        if (g0Var != null) {
            kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
            a0Var.b(androidx.compose.ui.semantics.m.d, new androidx.compose.ui.semantics.a(null, g0Var));
        }
        i2 i2Var = this.p0;
        if (i2Var != null) {
            kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.y.a;
            a0Var.b(androidx.compose.ui.semantics.m.e, i2Var);
        }
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean x(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.P || ((!androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.b(keyEvent), androidx.compose.ui.input.key.a.D) && !androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C)) || androidx.compose.ui.input.key.c.c(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.k0.d == o1.e;
        j jVar = this.n0;
        if (z) {
            int i = (int) (jVar.R & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C) ? i : -i)));
        } else {
            int i2 = (int) (jVar.R >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.a.a(androidx.compose.ui.input.key.c.a(keyEvent.getKeyCode()), androidx.compose.ui.input.key.a.C) ? i2 : -i2)) << 32);
        }
        BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new i2(this, jFloatToRawIntBits, null, 0), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final void Y0(long j) {
    }
}
