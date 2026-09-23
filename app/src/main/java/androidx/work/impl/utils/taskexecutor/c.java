package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.room.y;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final y a;
    public final CoroutineDispatcher b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final b d = new b(this, 0);

    public c(ExecutorService executorService) {
        y yVar = new y(executorService, 1);
        this.a = yVar;
        this.b = ExecutorsKt.from(yVar);
    }
}
