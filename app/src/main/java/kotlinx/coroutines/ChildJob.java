package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ChildJob extends Job {
    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.h
    /* synthetic */ i getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @InternalCoroutinesApi
    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r, p pVar) {
            return (R) Job.DefaultImpls.fold(childJob, r, pVar);
        }

        public static <E extends h> E get(ChildJob childJob, i iVar) {
            return (E) Job.DefaultImpls.get(childJob, iVar);
        }

        public static j minusKey(ChildJob childJob, i iVar) {
            return Job.DefaultImpls.minusKey(childJob, iVar);
        }

        public static j plus(ChildJob childJob, j jVar) {
            return Job.DefaultImpls.plus(childJob, jVar);
        }

        @c
        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }
}
