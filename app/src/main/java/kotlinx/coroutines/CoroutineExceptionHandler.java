package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface CoroutineExceptionHandler extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r, p pVar) {
            return (R) g.f(coroutineExceptionHandler, r, pVar);
        }

        public static <E extends h> E get(CoroutineExceptionHandler coroutineExceptionHandler, i iVar) {
            return (E) g.g(coroutineExceptionHandler, iVar);
        }

        public static j minusKey(CoroutineExceptionHandler coroutineExceptionHandler, i iVar) {
            return g.l(coroutineExceptionHandler, iVar);
        }

        public static j plus(CoroutineExceptionHandler coroutineExceptionHandler, j jVar) {
            return g.o(jVar, coroutineExceptionHandler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key implements i {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlin.coroutines.h
    /* synthetic */ i getKey();

    void handleException(j jVar, Throwable th);

    @Override // kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);
}
