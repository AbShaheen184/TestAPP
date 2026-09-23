package kotlinx.coroutines;

import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BuildersKt__BuildersKt {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T runBlocking(j jVar, p pVar) {
        EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core;
        j jVarNewCoroutineContext;
        Thread threadCurrentThread = Thread.currentThread();
        f fVar = (f) jVar.get(e.e);
        if (fVar == null) {
            eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, jVar.plus(eventLoopCurrentOrNull$kotlinx_coroutines_core));
        } else {
            EventLoop eventLoop = fVar instanceof EventLoop ? (EventLoop) fVar : null;
            if (eventLoop == null) {
                eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            } else {
                EventLoop eventLoop2 = eventLoop.shouldBeProcessedFromContext() ? eventLoop : null;
                if (eventLoop2 == null) {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
                } else {
                    eventLoopCurrentOrNull$kotlinx_coroutines_core = eventLoop2;
                }
            }
            jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, jVar);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(jVarNewCoroutineContext, threadCurrentThread, eventLoopCurrentOrNull$kotlinx_coroutines_core);
        blockingCoroutine.start(CoroutineStart.DEFAULT, blockingCoroutine, pVar);
        return (T) blockingCoroutine.joinBlocking();
    }

    public static /* synthetic */ Object runBlocking$default(j jVar, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = k.e;
        }
        return BuildersKt.runBlocking(jVar, pVar);
    }
}
