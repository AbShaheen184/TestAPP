package kotlinx.coroutines.internal;

import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedKt {
    @InternalCoroutinesApi
    public static final <T> T synchronizedImpl(Object obj, kotlin.jvm.functions.a aVar) {
        T t;
        synchronized (obj) {
            t = (T) aVar.invoke();
        }
        return t;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}
