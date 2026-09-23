package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugProbesKt {
    public static final <T> d<T> probeCoroutineCreated(d<? super T> dVar) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineResumed(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineSuspended(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(dVar);
    }
}
