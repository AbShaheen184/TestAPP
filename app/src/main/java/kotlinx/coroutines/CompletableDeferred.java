package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface CompletableDeferred<T> extends Deferred<T> {
    boolean complete(T t);

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.h
    /* synthetic */ i getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r, p pVar) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r, pVar);
        }

        public static <T, E extends h> E get(CompletableDeferred<T> completableDeferred, i iVar) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, iVar);
        }

        public static <T> j minusKey(CompletableDeferred<T> completableDeferred, i iVar) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, iVar);
        }

        public static <T> j plus(CompletableDeferred<T> completableDeferred, j jVar) {
            return Deferred.DefaultImpls.plus(completableDeferred, jVar);
        }

        @c
        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }
}
