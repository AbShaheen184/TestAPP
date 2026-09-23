package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends h0 {
    public final ListenableFuture F;

    public i0(ListenableFuture listenableFuture) {
        this.F = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.r, com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.F.a(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.r, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.F.cancel(z);
    }

    @Override // com.google.common.util.concurrent.r, java.util.concurrent.Future
    public final Object get() {
        return this.F.get();
    }

    @Override // com.google.common.util.concurrent.r, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.F.isCancelled();
    }

    @Override // com.google.common.util.concurrent.r, java.util.concurrent.Future
    public final boolean isDone() {
        return this.F.isDone();
    }

    @Override // com.google.common.util.concurrent.r
    public final String toString() {
        return this.F.toString();
    }

    @Override // com.google.common.util.concurrent.r, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.F.get(j, timeUnit);
    }
}
