package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadLocalKey implements i {
    private final ThreadLocal<?> threadLocal;

    public ThreadLocalKey(ThreadLocal<?> threadLocal) {
        this.threadLocal = threadLocal;
    }

    private final ThreadLocal<?> component1() {
        return this.threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreadLocalKey copy$default(ThreadLocalKey threadLocalKey, ThreadLocal threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = threadLocalKey.threadLocal;
        }
        return threadLocalKey.copy(threadLocal);
    }

    public final ThreadLocalKey copy(ThreadLocal<?> threadLocal) {
        return new ThreadLocalKey(threadLocal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadLocalKey) && l.a(this.threadLocal, ((ThreadLocalKey) obj).threadLocal);
    }

    public int hashCode() {
        return this.threadLocal.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.threadLocal + ')';
    }
}
