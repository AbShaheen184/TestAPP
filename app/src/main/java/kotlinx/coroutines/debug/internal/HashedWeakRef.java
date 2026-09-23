package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HashedWeakRef<T> extends WeakReference<T> {
    public final int hash;

    public HashedWeakRef(T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.hash = t != null ? t.hashCode() : 0;
    }
}
