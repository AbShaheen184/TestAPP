package com.google.common.collect;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class r0 extends AbstractList {
    public final List e;

    public r0(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.e.add(b(i), obj);
    }

    public final int b(int i) {
        int size = this.e.size();
        _COROUTINE.a.w(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.e;
        int size = list.size();
        _COROUTINE.a.s(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new q0(this, this.e.listIterator(b(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.e;
        int size = list.size();
        _COROUTINE.a.s(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.e;
        int size = list.size();
        _COROUTINE.a.s(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.e;
        _COROUTINE.a.x(i, i2, list.size());
        return q.r(list.subList(b(i2), b(i)));
    }
}
