package kotlinx.coroutines.internal;

import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final i key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal) {
        this.value = t;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    public <R> R fold(R r, p pVar) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r, pVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    public <E extends h> E get(i iVar) {
        if (l.a(getKey(), iVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.h
    public i getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    public j minusKey(i iVar) {
        return l.a(getKey(), iVar) ? k.e : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    public j plus(j jVar) {
        return ThreadContextElement.DefaultImpls.plus(this, jVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(j jVar, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(j jVar) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
