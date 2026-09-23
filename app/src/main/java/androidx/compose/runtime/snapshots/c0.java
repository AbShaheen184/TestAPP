package androidx.compose.runtime.snapshots;

import androidx.compose.material3.t3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends f {
    public final f e;
    public final boolean f;
    public final boolean g;
    public kotlin.jvm.functions.l h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f fVar, kotlin.jvm.functions.l lVar, boolean z, boolean z2) {
        kotlin.jvm.functions.l lVarE;
        super(0L, l.B);
        t3 t3Var = n.a;
        this.e = fVar;
        this.f = z;
        this.g = z2;
        this.h = n.k(lVar, (fVar == null || (lVarE = fVar.e()) == null) ? n.j.e : lVarE, z);
        this.i = androidx.compose.runtime.internal.k.b();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void c() {
        f fVar;
        this.c = true;
        if (!this.g || (fVar = this.e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final l d() {
        return v().d();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l e() {
        return this.h;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final boolean f() {
        return v().f();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final long g() {
        return v().g();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void k() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void l() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void m() {
        v().m();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void n(w wVar) {
        v().n(wVar);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        kotlin.jvm.functions.l lVarK = n.k(lVar, this.h, true);
        return !this.f ? n.g(v().u(null), lVarK, true) : v().u(lVarK);
    }

    public final f v() {
        f fVar = this.e;
        return fVar == null ? n.j : fVar;
    }
}
