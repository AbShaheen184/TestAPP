package kotlin.coroutines;

import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {
    private final i key;

    public a(i iVar) {
        iVar.getClass();
        this.key = iVar;
    }

    @Override // kotlin.coroutines.j
    public /* bridge */ <R> R fold(R r, p pVar) {
        return (R) g.f(this, r, pVar);
    }

    @Override // kotlin.coroutines.j
    public /* bridge */ <E extends h> E get(i iVar) {
        return (E) g.g(this, iVar);
    }

    @Override // kotlin.coroutines.h
    public i getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.j
    public /* bridge */ j minusKey(i iVar) {
        return g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public /* bridge */ j plus(j jVar) {
        return g.o(jVar, this);
    }
}
