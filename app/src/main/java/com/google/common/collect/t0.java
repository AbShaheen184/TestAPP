package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractList implements RandomAccess, Serializable {
    public final List e;
    public final com.google.common.base.d y;

    public t0(List list, com.google.common.base.d dVar) {
        list.getClass();
        this.e = list;
        this.y = dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.y.apply(this.e.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new s0(this, this.e.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.y.apply(this.e.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.e.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }
}
