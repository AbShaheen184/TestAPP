package coil3.compose.internal;

import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j {
    public final j e;

    public d(j jVar) {
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        return l.a(this.e, obj);
    }

    @Override // kotlin.coroutines.j
    public final Object fold(Object obj, p pVar) {
        return this.e.fold(obj, pVar);
    }

    @Override // kotlin.coroutines.j
    public final h get(i iVar) {
        return this.e.get(iVar);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // kotlin.coroutines.j
    public final j minusKey(i iVar) {
        j jVarMinusKey = this.e.minusKey(iVar);
        int i = g.b;
        CoroutineDispatcher.Key key = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) jVarMinusKey.get(key);
        if ((coroutineDispatcher instanceof e) && !coroutineDispatcher.equals(coroutineDispatcher2)) {
            ((e) coroutineDispatcher).y = 0;
        }
        return new d(jVarMinusKey);
    }

    @Override // kotlin.coroutines.j
    public final j plus(j jVar) {
        j jVarPlus = this.e.plus(jVar);
        int i = g.b;
        CoroutineDispatcher.Key key = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) jVarPlus.get(key);
        if ((coroutineDispatcher instanceof e) && !coroutineDispatcher.equals(coroutineDispatcher2)) {
            ((e) coroutineDispatcher).y = 0;
        }
        return new d(jVarPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.e + ")";
    }
}
