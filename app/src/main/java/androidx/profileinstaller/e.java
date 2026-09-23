package androidx.profileinstaller;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ e(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.y, 1));
                break;
            default:
                c.t(this.y, new androidx.arch.core.executor.a(2), c.a, false);
                break;
        }
    }
}
