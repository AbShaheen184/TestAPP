package kotlinx.coroutines;

import com.google.firebase.platforminfo.b;
import java.util.concurrent.CancellationException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface Job extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key implements i {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @InternalCoroutinesApi
    ChildHandle attachChild(ChildJob childJob);

    @c
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @c
    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @InternalCoroutinesApi
    CancellationException getCancellationException();

    kotlin.sequences.h getChildren();

    @Override // kotlin.coroutines.h
    /* synthetic */ i getKey();

    SelectClause0 getOnJoin();

    Job getParent();

    DisposableHandle invokeOnCompletion(l lVar);

    @InternalCoroutinesApi
    DisposableHandle invokeOnCompletion(boolean z, boolean z2, l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(d<? super y> dVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);

    @c
    Job plus(Job job);

    boolean start();

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(Job job, Throwable th, int i, Object obj) {
            if (obj != null) {
                b.n("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return job.cancel(th);
        }

        public static <R> R fold(Job job, R r, p pVar) {
            return (R) g.f(job, r, pVar);
        }

        public static <E extends h> E get(Job job, i iVar) {
            return (E) g.g(job, iVar);
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, boolean z2, l lVar, int i, Object obj) {
            if (obj != null) {
                b.n("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return job.invokeOnCompletion(z, z2, lVar);
        }

        public static j minusKey(Job job, i iVar) {
            return g.l(job, iVar);
        }

        public static j plus(Job job, j jVar) {
            return g.o(jVar, job);
        }

        @c
        public static Job plus(Job job, Job job2) {
            return job2;
        }

        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                b.n("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }
    }
}
