package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends org.jsoup.helper.n {
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;

    public g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.l = atomicReferenceFieldUpdater;
        this.m = atomicReferenceFieldUpdater2;
        this.n = atomicReferenceFieldUpdater3;
        this.o = atomicReferenceFieldUpdater4;
        this.p = atomicReferenceFieldUpdater5;
    }

    @Override // org.jsoup.helper.n
    public final void H(q qVar, q qVar2) {
        this.m.lazySet(qVar, qVar2);
    }

    @Override // org.jsoup.helper.n
    public final void I(q qVar, Thread thread) {
        this.l.lazySet(qVar, thread);
    }

    @Override // org.jsoup.helper.n
    public final boolean i(r rVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == fVar);
        return false;
    }

    @Override // org.jsoup.helper.n
    public final boolean j(r rVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == obj);
        return false;
    }

    @Override // org.jsoup.helper.n
    public final boolean k(r rVar, q qVar, q qVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, qVar, qVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == qVar);
        return false;
    }

    @Override // org.jsoup.helper.n
    public final f p(r rVar) {
        return (f) this.o.getAndSet(rVar, f.d);
    }

    @Override // org.jsoup.helper.n
    public final q q(r rVar) {
        return (q) this.n.getAndSet(rVar, q.c);
    }
}
