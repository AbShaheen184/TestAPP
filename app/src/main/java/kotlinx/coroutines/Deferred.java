package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface Deferred<T> extends Job {
    Object await(d<? super T> dVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @ExperimentalCoroutinesApi
    T getCompleted();

    @ExperimentalCoroutinesApi
    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.h
    /* synthetic */ i getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(deferred, r, pVar);
        }

        public static <T, E extends h> E get(Deferred<? extends T> deferred, i iVar) {
            return (E) Job.DefaultImpls.get(deferred, iVar);
        }

        public static <T> j minusKey(Deferred<? extends T> deferred, i iVar) {
            return Job.DefaultImpls.minusKey(deferred, iVar);
        }

        public static <T> j plus(Deferred<? extends T> deferred, j jVar) {
            return Job.DefaultImpls.plus(deferred, jVar);
        }

        @c
        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }
    }
}
