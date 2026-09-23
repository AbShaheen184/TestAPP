package androidx.compose.runtime;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final j1 f = new j1(androidx.compose.runtime.internal.j.A, f.B);
    public final /* synthetic */ s g;

    public q(s sVar, long j, boolean z, boolean z2, com.app.mlounge.data.music.e eVar) {
        this.g = sVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // androidx.compose.runtime.w
    public final void a(z zVar, kotlin.jvm.functions.p pVar) {
        this.g.b.a(zVar, pVar);
    }

    @Override // androidx.compose.runtime.w
    public final androidx.collection.p0 b(z zVar, androidx.compose.ui.graphics.a aVar, kotlin.jvm.functions.p pVar) {
        return this.g.b.b(zVar, aVar, pVar);
    }

    @Override // androidx.compose.runtime.w
    public final void c() {
        this.g.A--;
    }

    @Override // androidx.compose.runtime.w
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // androidx.compose.runtime.w
    public final boolean e() {
        return this.b;
    }

    @Override // androidx.compose.runtime.w
    public final boolean f() {
        return this.c;
    }

    @Override // androidx.compose.runtime.w
    public final long g() {
        return this.a;
    }

    @Override // androidx.compose.runtime.w
    public final v h() {
        return this.g.h;
    }

    @Override // androidx.compose.runtime.w
    public final androidx.compose.runtime.internal.j i() {
        return (androidx.compose.runtime.internal.j) this.f.getValue();
    }

    @Override // androidx.compose.runtime.w
    public final kotlin.coroutines.j j() {
        return this.g.b.j();
    }

    @Override // androidx.compose.runtime.w
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // androidx.compose.runtime.w
    public final void l(z zVar) {
        s sVar = this.g;
        sVar.b.l(sVar.h);
        sVar.b.l(zVar);
    }

    @Override // androidx.compose.runtime.w
    public final y0 m(z0 z0Var) {
        return this.g.b.m(z0Var);
    }

    @Override // androidx.compose.runtime.w
    public final androidx.collection.p0 n(z zVar, androidx.compose.ui.graphics.a aVar, androidx.collection.p0 p0Var) {
        return this.g.b.n(zVar, aVar, p0Var);
    }

    @Override // androidx.compose.runtime.w
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // androidx.compose.runtime.w
    public final void p(s sVar) {
        this.e.add(sVar);
    }

    @Override // androidx.compose.runtime.w
    public final void q(s1 s1Var) {
        this.g.b.q(s1Var);
    }

    @Override // androidx.compose.runtime.w
    public final void r(z zVar) {
        this.g.b.r(zVar);
    }

    @Override // androidx.compose.runtime.w
    public final g s(androidx.compose.animation.z zVar) {
        return this.g.b.s(zVar);
    }

    @Override // androidx.compose.runtime.w
    public final void t() {
        this.g.A++;
    }

    @Override // androidx.compose.runtime.w
    public final void u(s sVar) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                sVar.getClass();
                set.remove(sVar.z());
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        kotlin.jvm.internal.c0.a(linkedHashSet);
        linkedHashSet.remove(sVar);
    }

    @Override // androidx.compose.runtime.w
    public final void v(z zVar) {
        this.g.b.v(zVar);
    }

    public final void w() {
        LinkedHashSet<s> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (s sVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(sVar.z());
                }
            }
        }
        linkedHashSet.clear();
    }
}
