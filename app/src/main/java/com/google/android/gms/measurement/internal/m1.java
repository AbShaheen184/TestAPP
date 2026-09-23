package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends x1 {
    public static final AtomicLong H = new AtomicLong(Long.MIN_VALUE);
    public l1 A;
    public final PriorityBlockingQueue B;
    public final LinkedBlockingQueue C;
    public final j1 D;
    public final j1 E;
    public final Object F;
    public final Semaphore G;
    public l1 z;

    public m1(p1 p1Var) {
        super(p1Var);
        this.F = new Object();
        this.G = new Semaphore(2);
        this.B = new PriorityBlockingQueue();
        this.C = new LinkedBlockingQueue();
        this.D = new j1(this, "Thread death: Uncaught exception on worker thread");
        this.E = new j1(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A() {
        if (Thread.currentThread() != this.z) {
            return;
        }
        kotlinx.coroutines.future.a.u("Call not expected from worker thread");
    }

    public final boolean B() {
        return Thread.currentThread() == this.z;
    }

    public final k1 C(Callable callable) {
        x();
        k1 k1Var = new k1(this, callable, false);
        if (Thread.currentThread() != this.z) {
            I(k1Var);
            return k1Var;
        }
        if (!this.B.isEmpty()) {
            u0 u0Var = ((p1) this.e).C;
            p1.m(u0Var);
            u0Var.F.a("Callable skipped the worker queue.");
        }
        k1Var.run();
        return k1Var;
    }

    public final k1 D(Callable callable) {
        x();
        k1 k1Var = new k1(this, callable, true);
        if (Thread.currentThread() == this.z) {
            k1Var.run();
            return k1Var;
        }
        I(k1Var);
        return k1Var;
    }

    public final void E(Runnable runnable) {
        x();
        com.google.android.gms.common.internal.x.g(runnable);
        I(new k1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object F(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            m1 m1Var = ((p1) this.e).D;
            p1.m(m1Var);
            m1Var.E(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                u0 u0Var = ((p1) this.e).C;
                p1.m(u0Var);
                s0 s0Var = u0Var.F;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                s0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            u0 u0Var2 = ((p1) this.e).C;
            p1.m(u0Var2);
            u0Var2.F.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void G(Runnable runnable) {
        x();
        I(new k1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void H(Runnable runnable) {
        x();
        k1 k1Var = new k1(this, runnable, false, "Task exception on network thread");
        synchronized (this.F) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.C;
                linkedBlockingQueue.add(k1Var);
                l1 l1Var = this.A;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Network", linkedBlockingQueue);
                    this.A = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.E);
                    this.A.start();
                } else {
                    Object obj = l1Var.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(k1 k1Var) {
        synchronized (this.F) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.B;
                priorityBlockingQueue.add(k1Var);
                l1 l1Var = this.z;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Worker", priorityBlockingQueue);
                    this.z = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.D);
                    this.z.start();
                } else {
                    Object obj = l1Var.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.animation.core.j2
    public final void v() {
        if (Thread.currentThread() == this.z) {
            return;
        }
        kotlinx.coroutines.future.a.u("Call expected from worker thread");
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final boolean w() {
        return false;
    }

    public final void z() {
        if (Thread.currentThread() == this.A) {
            return;
        }
        kotlinx.coroutines.future.a.u("Call expected from network thread");
    }
}
