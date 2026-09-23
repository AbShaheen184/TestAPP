package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface ThreadContextElement<S> extends h {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r, p pVar) {
            return (R) g.f(threadContextElement, r, pVar);
        }

        public static <S, E extends h> E get(ThreadContextElement<S> threadContextElement, i iVar) {
            return (E) g.g(threadContextElement, iVar);
        }

        public static <S> j minusKey(ThreadContextElement<S> threadContextElement, i iVar) {
            return g.l(threadContextElement, iVar);
        }

        public static <S> j plus(ThreadContextElement<S> threadContextElement, j jVar) {
            return g.o(jVar, threadContextElement);
        }
    }

    @Override // kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlin.coroutines.h
    /* synthetic */ i getKey();

    @Override // kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    void restoreThreadContext(j jVar, S s);

    S updateThreadContext(j jVar);
}
