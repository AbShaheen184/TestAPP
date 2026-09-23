package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements kotlin.coroutines.h {
    public static final com.google.firebase.heartbeatinfo.e y = new com.google.firebase.heartbeatinfo.e(17);
    public final o e;

    public p(o oVar) {
        this.e = oVar;
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
        return y;
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
