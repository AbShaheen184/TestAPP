package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int B = 0;
    public Thread A;
    public com.google.android.material.internal.k e;
    public Executor y;
    public Runnable z;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == e0.y) {
            this.y = null;
            this.e = null;
            return;
        }
        this.A = Thread.currentThread();
        try {
            com.google.android.material.internal.k kVar = this.e;
            Objects.requireNonNull(kVar);
            com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) kVar.z;
            if (((Thread) jVar.y) == this.A) {
                this.e = null;
                _COROUTINE.a.A(((Runnable) jVar.z) == null);
                jVar.z = runnable;
                Executor executor = this.y;
                Objects.requireNonNull(executor);
                jVar.A = executor;
                this.y = null;
            } else {
                Executor executor2 = this.y;
                Objects.requireNonNull(executor2);
                this.y = null;
                this.z = runnable;
                executor2.execute(this);
            }
        } finally {
            this.A = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.A) {
            Runnable runnable = this.z;
            Objects.requireNonNull(runnable);
            this.z = null;
            runnable.run();
            return;
        }
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(16, false);
        jVar.y = threadCurrentThread;
        com.google.android.material.internal.k kVar = this.e;
        Objects.requireNonNull(kVar);
        kVar.z = jVar;
        this.e = null;
        try {
            Runnable runnable2 = this.z;
            Objects.requireNonNull(runnable2);
            this.z = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) jVar.z;
                if (runnable3 == null || (executor = (Executor) jVar.A) == null) {
                    break;
                }
                jVar.z = null;
                jVar.A = null;
                executor.execute(runnable3);
            }
            jVar.y = null;
        } catch (Throwable th) {
            jVar.y = null;
            throw th;
        }
    }
}
