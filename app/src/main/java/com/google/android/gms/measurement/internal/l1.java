package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends Thread {
    public final /* synthetic */ m1 A;
    public final Object e;
    public final BlockingQueue y;
    public boolean z = false;

    public l1(m1 m1Var, String str, BlockingQueue blockingQueue) {
        this.A = m1Var;
        com.google.android.gms.common.internal.x.g(blockingQueue);
        this.e = new Object();
        this.y = blockingQueue;
        setName(str);
    }

    public final void a() {
        m1 m1Var = this.A;
        synchronized (m1Var.F) {
            try {
                if (!this.z) {
                    m1Var.G.release();
                    m1Var.F.notifyAll();
                    if (this == m1Var.z) {
                        m1Var.z = null;
                    } else if (this == m1Var.A) {
                        m1Var.A = null;
                    } else {
                        u0 u0Var = ((p1) m1Var.e).C;
                        p1.m(u0Var);
                        u0Var.C.a("Current scheduler thread is neither worker nor network");
                    }
                    this.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.A.G.acquire();
                z = true;
            } catch (InterruptedException e) {
                u0 u0Var = ((p1) this.A.e).C;
                p1.m(u0Var);
                u0Var.F.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.y;
                k1 k1Var = (k1) blockingQueue.poll();
                if (k1Var != null) {
                    Process.setThreadPriority(true != k1Var.y ? 10 : threadPriority);
                    k1Var.run();
                } else {
                    Object obj = this.e;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.A.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                u0 u0Var2 = ((p1) this.A.e).C;
                                p1.m(u0Var2);
                                u0Var2.F.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.A.F) {
                        if (this.y.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
