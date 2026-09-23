package kotlinx.coroutines.internal;

import kotlin.coroutines.h;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final p countAll;
    private static final p findOne;
    private static final p updateState;

    static {
        final int i = 1;
        countAll = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (h) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (h) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (h) obj2);
                }
            }
        };
        final int i2 = 2;
        findOne = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (h) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (h) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (h) obj2);
                }
            }
        };
        final int i3 = 0;
        updateState = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (h) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (h) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (h) obj2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, h hVar) {
        if (!(hVar instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? hVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement<?> findOne$lambda$1(ThreadContextElement<?> threadContextElement, h hVar) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (hVar instanceof ThreadContextElement) {
            return (ThreadContextElement) hVar;
        }
        return null;
    }

    public static final void restoreThreadContext(j jVar, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(jVar);
            return;
        }
        Object objFold = jVar.fold(null, findOne);
        objFold.getClass();
        ((ThreadContextElement) objFold).restoreThreadContext(jVar, obj);
    }

    public static final Object threadContextElements(j jVar) {
        Object objFold = jVar.fold(0, countAll);
        objFold.getClass();
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, h hVar) {
        if (hVar instanceof ThreadContextElement) {
            ThreadContextElement<?> threadContextElement = (ThreadContextElement) hVar;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(j jVar, Object obj) {
        if (obj == null) {
            obj = threadContextElements(jVar);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return jVar.fold(new ThreadState(jVar, ((Number) obj).intValue()), updateState);
        }
        obj.getClass();
        return ((ThreadContextElement) obj).updateThreadContext(jVar);
    }
}
