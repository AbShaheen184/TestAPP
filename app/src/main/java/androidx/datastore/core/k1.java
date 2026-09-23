package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements kotlin.coroutines.h {
    public final k1 e;
    public final z y;

    public k1(k1 k1Var, z zVar) {
        this.e = k1Var;
        this.y = zVar;
    }

    public final void a(z zVar) {
        if (this.y == zVar) {
            kotlinx.coroutines.future.a.u("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        k1 k1Var = this.e;
        if (k1Var != null) {
            k1Var.a(zVar);
        }
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return kotlin.coroutines.g.f(this, obj, pVar);
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.h get(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.g(this, iVar);
    }

    @Override // kotlin.coroutines.h
    public final kotlin.coroutines.i getKey() {
        return j1.e;
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j minusKey(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j plus(kotlin.coroutines.j jVar) {
        return kotlin.coroutines.g.o(jVar, this);
    }
}
