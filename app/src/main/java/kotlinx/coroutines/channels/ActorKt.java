package kotlinx.coroutines.channels;

import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ActorKt {
    @ObsoleteCoroutinesApi
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, j jVar, int i, CoroutineStart coroutineStart, l lVar, p pVar) {
        j jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, jVar);
        Channel channelChannel$default = ChannelKt.Channel$default(i, null, null, 6, null);
        ActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(jVarNewCoroutineContext, channelChannel$default, pVar) : new ActorCoroutine(jVarNewCoroutineContext, channelChannel$default, true);
        if (lVar != null) {
            ((JobSupport) lazyActorCoroutine).invokeOnCompletion(lVar);
        }
        ((AbstractCoroutine) lazyActorCoroutine).start(coroutineStart, lazyActorCoroutine, pVar);
        return (SendChannel<E>) lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, j jVar, int i, CoroutineStart coroutineStart, l lVar, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = k.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return actor(coroutineScope, jVar, i, coroutineStart2, lVar, pVar);
    }
}
