package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.j;
import com.google.android.gms.tasks.s;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {
    public final ExecutorService e;
    public final Object y = new Object();
    public s z = n.o(null);

    public b(ExecutorService executorService) {
        this.e = executorService;
    }

    public final s a(Runnable runnable) {
        s sVarD;
        synchronized (this.y) {
            sVarD = this.z.d(this.e, new j(runnable, 7));
            this.z = sVarD;
        }
        return sVarD;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.execute(runnable);
    }
}
