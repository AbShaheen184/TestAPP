package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.coroutines.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class NoOpContinuation implements d<Object> {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final j context = k.e;

    private NoOpContinuation() {
    }

    @Override // kotlin.coroutines.d
    public j getContext() {
        return context;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
    }
}
