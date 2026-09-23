package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements kotlin.coroutines.h {
    public final kotlin.coroutines.i e;
    public final a0 y;

    public a(kotlin.coroutines.i iVar, a0 a0Var) {
        a0Var.getClass();
        this.e = iVar;
        this.y = a0Var;
    }

    @Override // kotlin.coroutines.j
    public final Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return kotlin.coroutines.g.f(this, obj, pVar);
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.h get(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.g(this, iVar);
    }

    @Override // kotlin.coroutines.h
    public final kotlin.coroutines.i getKey() {
        return this.e;
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.j minusKey(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.j plus(kotlin.coroutines.j jVar) {
        return kotlin.coroutines.g.o(jVar, this);
    }
}
