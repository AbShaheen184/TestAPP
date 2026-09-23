package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ParentJob extends Job {
    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @InternalCoroutinesApi
    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.h
    /* synthetic */ i getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(parentJob, r, pVar);
        }

        public static <E extends h> E get(ParentJob parentJob, i iVar) {
            return (E) Job.DefaultImpls.get(parentJob, iVar);
        }

        public static j minusKey(ParentJob parentJob, i iVar) {
            return Job.DefaultImpls.minusKey(parentJob, iVar);
        }

        public static j plus(ParentJob parentJob, j jVar) {
            return Job.DefaultImpls.plus(parentJob, jVar);
        }

        @c
        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }
    }
}
