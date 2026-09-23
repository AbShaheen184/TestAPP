package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static Object a(u0 u0Var, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        u0Var.getClass();
        return CoroutineScopeKt.coroutineScope(new t0(u0Var, lVar, null), dVar);
    }
}
