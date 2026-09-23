package kotlinx.coroutines.sync;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.y;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface Mutex {
    SelectClause2<Object, Mutex> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, d<? super y> dVar);

    boolean tryLock(Object obj);

    void unlock(Object obj);

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static /* synthetic */ Object lock$default(Mutex mutex, Object obj, d dVar, int i, Object obj2) {
            if (obj2 != null) {
                com.google.firebase.platforminfo.b.n("Super calls with default arguments not supported in this target, function: lock");
                return null;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.lock(obj, dVar);
        }

        public static /* synthetic */ boolean tryLock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                com.google.firebase.platforminfo.b.n("Super calls with default arguments not supported in this target, function: tryLock");
                return false;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                com.google.firebase.platforminfo.b.n("Super calls with default arguments not supported in this target, function: unlock");
                return;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }

        @c
        public static /* synthetic */ void getOnLock$annotations() {
        }
    }
}
