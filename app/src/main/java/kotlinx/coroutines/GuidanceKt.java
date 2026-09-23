package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class GuidanceKt {
    @c
    public static final <T> Deferred<T> async(j jVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Deferred async$default(j jVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = k.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return async(jVar, coroutineStart, pVar);
    }

    @c
    public static final Job launch(j jVar, CoroutineStart coroutineStart, p pVar) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Job launch$default(j jVar, CoroutineStart coroutineStart, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = k.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launch(jVar, coroutineStart, pVar);
    }
}
