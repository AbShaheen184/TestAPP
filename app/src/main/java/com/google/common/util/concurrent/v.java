package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends _COROUTINE.a {
    public final AtomicReferenceFieldUpdater m;
    public final AtomicIntegerFieldUpdater n;

    public v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.m = atomicReferenceFieldUpdater;
        this.n = atomicIntegerFieldUpdater;
    }

    @Override // _COROUTINE.a
    public final void C(c0 c0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(c0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c0Var) == null);
    }

    @Override // _COROUTINE.a
    public final int G(c0 c0Var) {
        return this.n.decrementAndGet(c0Var);
    }
}
