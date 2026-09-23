package com.google.firebase.concurrent;

import com.google.android.datatransport.runtime.q;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {
    public static final Logger C = Logger.getLogger(h.class.getName());
    public final Executor e;
    public final ArrayDeque y = new ArrayDeque();
    public int z = 1;
    public long A = 0;
    public final o B = new o(this, 5);

    public h(Executor executor) {
        x.g(executor);
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x.g(runnable);
        synchronized (this.y) {
            int i = this.z;
            if (i != 4 && i != 3) {
                long j = this.A;
                q qVar = new q(3, runnable);
                this.y.add(qVar);
                this.z = 2;
                try {
                    this.e.execute(this.B);
                    if (this.z != 2) {
                        return;
                    }
                    synchronized (this.y) {
                        try {
                            if (this.A == j && this.z == 2) {
                                this.z = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.y) {
                        try {
                            int i2 = this.z;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.y.removeLastOccurrence(qVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.e + "}";
    }
}
