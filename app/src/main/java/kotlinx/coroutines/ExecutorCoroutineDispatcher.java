package kotlinx.coroutines;

import com.app.mlounge.ui.viewmodel.q0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.b;
import kotlin.coroutines.h;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    public static final Key Key = new Key(null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key extends b {
        private Key() {
            super(CoroutineDispatcher.Key, new q0(14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExecutorCoroutineDispatcher _init_$lambda$0(h hVar) {
            if (hVar instanceof ExecutorCoroutineDispatcher) {
                return (ExecutorCoroutineDispatcher) hVar;
            }
            return null;
        }

        public /* synthetic */ Key(f fVar) {
            this();
        }
    }
}
