package kotlinx.coroutines.internal;

import kotlin.coroutines.j;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ThreadState {
    public final j context;
    private final ThreadContextElement<Object>[] elements;
    private int i;
    private final Object[] values;

    public ThreadState(j jVar, int i) {
        this.context = jVar;
        this.values = new Object[i];
        this.elements = new ThreadContextElement[i];
    }

    public final void append(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.elements;
        this.i = i + 1;
        threadContextElement.getClass();
        threadContextElementArr[i] = threadContextElement;
    }

    public final void restore(j jVar) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement<Object> threadContextElement = this.elements[length];
            threadContextElement.getClass();
            threadContextElement.restoreThreadContext(jVar, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
