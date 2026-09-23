package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class StackFrameContinuation<T> implements d<T>, kotlin.coroutines.jvm.internal.d {
    private final j context;
    private final d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(d<? super T> dVar, j jVar) {
        this.uCont = dVar;
        this.context = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d<T> dVar = this.uCont;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public j getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
