package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Executor {
    public static final s0 C = new s0(w0.class);
    public final Executor e;
    public final ArrayDeque y = new ArrayDeque();
    public int z = 1;
    public long A = 0;
    public final com.google.android.gms.tasks.o B = new com.google.android.gms.tasks.o(this, 4);

    public w0(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.y) {
            int i = this.z;
            if (i != 4 && i != 3) {
                long j = this.A;
                com.google.android.datatransport.runtime.q qVar = new com.google.android.datatransport.runtime.q(2, runnable);
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
                } catch (Throwable th2) {
                    synchronized (this.y) {
                        try {
                            int i2 = this.z;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.y.removeLastOccurrence(qVar)) {
                                z = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.e + "}";
    }
}
