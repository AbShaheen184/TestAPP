package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: loaded from: classes.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, jVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, pVar, dVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, j jVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, jVar, coroutineStart, pVar);
    }

    public static final <T> T runBlocking(j jVar, p pVar) {
        return (T) BuildersKt__BuildersKt.runBlocking(jVar, pVar);
    }

    public static final <T> Object withContext(j jVar, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.withContext(jVar, pVar, dVar);
    }
}
