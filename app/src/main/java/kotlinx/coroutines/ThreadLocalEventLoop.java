package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadLocalEventLoop {
    public static final ThreadLocalEventLoop INSTANCE = new ThreadLocalEventLoop();
    private static final ThreadLocal<EventLoop> ref = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    private ThreadLocalEventLoop() {
    }

    public final EventLoop currentOrNull$kotlinx_coroutines_core() {
        return ref.get();
    }

    public final EventLoop getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal<EventLoop> threadLocal = ref;
        EventLoop eventLoop = threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        EventLoop eventLoopCreateEventLoop = EventLoopKt.createEventLoop();
        threadLocal.set(eventLoopCreateEventLoop);
        return eventLoopCreateEventLoop;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        ref.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(EventLoop eventLoop) {
        ref.set(eventLoop);
    }
}
