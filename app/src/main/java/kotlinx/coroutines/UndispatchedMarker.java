package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class UndispatchedMarker implements h, i {
    public static final UndispatchedMarker INSTANCE = new UndispatchedMarker();

    private UndispatchedMarker() {
    }

    @Override // kotlin.coroutines.j
    public <R> R fold(R r, p pVar) {
        return (R) g.f(this, r, pVar);
    }

    @Override // kotlin.coroutines.j
    public <E extends h> E get(i iVar) {
        return (E) g.g(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public j minusKey(i iVar) {
        return g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public j plus(j jVar) {
        return g.o(jVar, this);
    }

    @Override // kotlin.coroutines.h
    public i getKey() {
        return this;
    }
}
