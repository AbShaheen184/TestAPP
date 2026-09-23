package androidx.compose.material3.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);
}
