package com.google.common.util.concurrent;

import com.google.android.gms.internal.measurement.rc;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {
    public final ScheduledExecutorService e;
    public final ScheduledExecutorService y;

    public v0(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.e = scheduledExecutorService;
        this.y = scheduledExecutorService;
    }

    public final ListenableFuture a(rc rcVar) {
        return (ListenableFuture) super.submit(rcVar);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.e.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (scheduledExecutorService = this.e).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.e.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.e.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new z0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        z0 z0Var = new z0(Executors.callable(runnable, null));
        return new t0(z0Var, this.y.schedule(z0Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        u0 u0Var = new u0(runnable);
        return new t0(u0Var, this.y.scheduleAtFixedRate(u0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        u0 u0Var = new u0(runnable);
        return new t0(u0Var, this.y.scheduleWithFixedDelay(u0Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.e.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.e.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.e + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new z0(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        z0 z0Var = new z0(callable);
        return new t0(z0Var, this.y.schedule(z0Var, j, timeUnit));
    }
}
