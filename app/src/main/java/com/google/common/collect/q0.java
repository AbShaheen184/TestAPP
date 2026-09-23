package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements ListIterator {
    public boolean e;
    public final /* synthetic */ ListIterator y;
    public final /* synthetic */ r0 z;

    public q0(r0 r0Var, ListIterator listIterator) {
        this.y = listIterator;
        this.z = r0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.y;
        listIterator.add(obj);
        listIterator.previous();
        this.e = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.y.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.y;
        if (listIterator.hasPrevious()) {
            this.e = true;
            return listIterator.previous();
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.z.b(this.y.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.y;
        if (listIterator.hasNext()) {
            this.e = true;
            return listIterator.next();
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        _COROUTINE.a.z("no calls to next() since the last call to remove()", this.e);
        this.y.remove();
        this.e = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        _COROUTINE.a.A(this.e);
        this.y.set(obj);
    }
}
