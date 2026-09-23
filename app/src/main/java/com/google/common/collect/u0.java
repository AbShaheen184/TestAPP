package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractSequentialList implements Serializable {
    public final List e;
    public final com.google.common.base.d y;

    public u0(List list, com.google.common.base.d dVar) {
        list.getClass();
        this.e = list;
        this.y = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new s0(this, this.e.listIterator(i), 1);
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
