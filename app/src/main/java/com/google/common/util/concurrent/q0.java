package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AbstractOwnableSynchronizer implements Runnable {
    public final r0 e;

    public q0(r0 r0Var) {
        this.e = r0Var;
    }

    public static void a(q0 q0Var, Thread thread) {
        q0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
