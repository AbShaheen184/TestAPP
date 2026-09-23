package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.c1;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.l2;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.lazy.layout.j0;
import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.foundation.lazy.layout.o0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.j1;
import androidx.compose.ui.node.f0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements l2 {
    public static final androidx.compose.foundation.text.input.internal.o x = androidx.compose.runtime.saveable.l.b(new b2(3), new w1(3));
    public final a a;
    public boolean b;
    public s c;
    public boolean d;
    public final u e;
    public final j1 f;
    public final androidx.compose.foundation.interaction.k g;
    public float h;
    public final androidx.compose.foundation.gestures.n i;
    public final boolean j;
    public f0 k;
    public final w l;
    public final androidx.compose.foundation.lazy.layout.f m;
    public final androidx.compose.foundation.lazy.layout.v n;
    public final com.google.firebase.platforminfo.d o;
    public final m0 p;
    public final com.google.firebase.platforminfo.d q;
    public final j0 r;
    public final a1 s;
    public final j1 t;
    public final j1 u;
    public final a1 v;
    public final o0 w;

    public y(int i, int i2) {
        a aVar = new a();
        aVar.a = -1;
        aVar.c = -1;
        this.a = aVar;
        this.e = new u(i, i2, 0);
        this.f = new j1(b0.a, androidx.compose.runtime.f.A);
        this.g = new androidx.compose.foundation.interaction.k();
        this.i = new androidx.compose.foundation.gestures.n(new androidx.activity.compose.g(this, 9));
        this.j = true;
        this.l = new w(this, 0);
        this.m = new androidx.compose.foundation.lazy.layout.f();
        this.n = new androidx.compose.foundation.lazy.layout.v();
        this.o = new com.google.firebase.platforminfo.d(9);
        this.p = new m0(new v(this, i));
        this.q = new com.google.firebase.platforminfo.d(this);
        this.r = new j0();
        this.s = androidx.compose.foundation.lazy.layout.m.h();
        Boolean bool = Boolean.FALSE;
        this.t = androidx.compose.runtime.t.r(bool);
        this.u = androidx.compose.runtime.t.r(bool);
        this.v = androidx.compose.foundation.lazy.layout.m.h();
        this.w = new o0();
    }

    public static Object k(y yVar, int i, kotlin.coroutines.jvm.internal.i iVar) {
        yVar.getClass();
        Object objC = yVar.c(androidx.compose.foundation.j1.e, new c1(yVar, i, null, 6), iVar);
        return objC == kotlin.coroutines.intrinsics.a.e ? objC : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean a() {
        return this.i.a();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.i.c(r6, r7, r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.foundation.gestures.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.compose.foundation.j1 r6, kotlin.jvm.functions.p r7, kotlin.coroutines.jvm.internal.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.x
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.x r0 = (androidx.compose.foundation.lazy.x) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.x r0 = new androidx.compose.foundation.lazy.x
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r8)
            goto L6b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r6)
            r6 = 0
            return r6
        L31:
            kotlin.coroutines.jvm.internal.i r6 = r0.y
            r7 = r6
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.p) r7
            androidx.compose.foundation.j1 r6 = r0.e
            kotlin.a.e(r8)
            goto L5b
        L3c:
            kotlin.a.e(r8)
            androidx.compose.runtime.j1 r8 = r5.f
            java.lang.Object r8 = r8.getValue()
            androidx.compose.foundation.lazy.s r1 = androidx.compose.foundation.lazy.b0.a
            if (r8 != r1) goto L5b
            r0.e = r6
            r8 = r7
            kotlin.coroutines.jvm.internal.i r8 = (kotlin.coroutines.jvm.internal.i) r8
            r0.y = r8
            r0.B = r3
            androidx.compose.foundation.lazy.layout.f r8 = r5.m
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r4) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.e = r8
            r0.y = r8
            r0.B = r2
            androidx.compose.foundation.gestures.n r8 = r5.i
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r4) goto L6b
        L6a:
            return r4
        L6b:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.y.c(androidx.compose.foundation.j1, kotlin.jvm.functions.p, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final float e(float f) {
        return this.i.e(f);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(s sVar, boolean z, boolean z2) {
        ?? r2 = sVar.k;
        int i = sVar.n;
        int i2 = sVar.b;
        t tVar = sVar.a;
        this.p.e = r2.size();
        o0 o0Var = this.w;
        u uVar = this.e;
        if (!z && this.b) {
            this.c = sVar;
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                if (((Number) o0Var.b.y.getValue()).floatValue() != 0.0f && tVar != null && tVar.a == uVar.b.g() && i2 == uVar.c.g()) {
                    Job job = o0Var.a;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    o0Var.b = new androidx.compose.animation.core.n(androidx.compose.animation.core.e.j, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((tVar != null ? tVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(sVar.c));
        this.h -= sVar.d;
        this.f.setValue(sVar);
        if (z2) {
            uVar.getClass();
            if (!(((float) i2) >= 0.0f)) {
                androidx.compose.foundation.internal.b.c("scrollOffset should be non-negative");
            }
            uVar.c.h(i2);
        } else {
            t tVar2 = (t) kotlin.collections.p.D(r2);
            t tVar3 = (t) kotlin.collections.p.K(r2);
            androidx.compose.ui.platform.coreshims.b.E("firstVisibleItem:index", tVar2 != null ? tVar2.a : -1L);
            androidx.compose.ui.platform.coreshims.b.E("lastVisibleItem:index", tVar3 != null ? tVar3.a : -1L);
            uVar.getClass();
            uVar.e = tVar != null ? tVar.i : null;
            if (uVar.d || i > 0) {
                uVar.d = true;
                if (!(((float) i2) >= 0.0f)) {
                    androidx.compose.foundation.internal.b.c("scrollOffset should be non-negative");
                }
                uVar.a(tVar != null ? tVar.a : 0, i2);
            }
            if (this.j) {
                a aVar = this.a;
                int i3 = aVar.a;
                boolean z3 = aVar.b;
                if (i3 != -1 && !r2.isEmpty() && i3 != a.a(sVar, z3)) {
                    aVar.a = -1;
                    l0 l0Var = (l0) aVar.e;
                    if (l0Var != null) {
                        l0Var.cancel();
                    }
                    aVar.e = null;
                }
                int i4 = aVar.c;
                if (i4 != -1 && aVar.d != 0.0f && i4 != i && !r2.isEmpty()) {
                    int iA = a.a(sVar, aVar.d < 0.0f);
                    if (iA >= 0 && iA < i) {
                        aVar.a = iA;
                        aVar.e = com.google.firebase.platforminfo.d.o(this.q, iA);
                    }
                }
                aVar.c = i;
            }
        }
        if (z) {
            o0Var.a(sVar.f, sVar.i, sVar.h);
        }
    }

    public final int g() {
        return this.e.b.g();
    }

    public final int h() {
        return this.e.c.g();
    }

    public final s i() {
        return (s) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void j(float f, s sVar) {
        l0 l0Var;
        l0 l0Var2;
        if (this.j) {
            boolean zIsEmpty = sVar.k.isEmpty();
            a aVar = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = a.a(sVar, z);
                if (iA >= 0 && iA < sVar.n) {
                    if (iA != aVar.a) {
                        if (aVar.b != z) {
                            aVar.a = -1;
                            l0 l0Var3 = (l0) aVar.e;
                            if (l0Var3 != null) {
                                l0Var3.cancel();
                            }
                            aVar.e = null;
                        }
                        aVar.b = z;
                        aVar.a = iA;
                        aVar.e = com.google.firebase.platforminfo.d.o(this.q, iA);
                    }
                    ?? r2 = sVar.k;
                    if (z) {
                        t tVar = (t) kotlin.collections.p.J(r2);
                        if (((tVar.l + tVar.m) + sVar.q) - sVar.m < (-f) && (l0Var2 = (l0) aVar.e) != null) {
                            l0Var2.a();
                        }
                    } else if (sVar.l - ((t) kotlin.collections.p.B(r2)).l < f && (l0Var = (l0) aVar.e) != null) {
                        l0Var.a();
                    }
                }
            }
            aVar.d = f;
        }
    }
}
