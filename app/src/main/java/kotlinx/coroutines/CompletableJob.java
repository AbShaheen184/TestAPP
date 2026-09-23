package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface CompletableJob extends Job {
    boolean complete();

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.h
    /* synthetic */ i getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <R> R fold(CompletableJob completableJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(completableJob, r, pVar);
        }

        public static <E extends h> E get(CompletableJob completableJob, i iVar) {
            return (E) Job.DefaultImpls.get(completableJob, iVar);
        }

        public static j minusKey(CompletableJob completableJob, i iVar) {
            return Job.DefaultImpls.minusKey(completableJob, iVar);
        }

        public static j plus(CompletableJob completableJob, j jVar) {
            return Job.DefaultImpls.plus(completableJob, jVar);
        }

        @c
        public static Job plus(CompletableJob completableJob, Job job) {
            return Job.DefaultImpls.plus((Job) completableJob, job);
        }
    }
}
