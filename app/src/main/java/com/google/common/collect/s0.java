package com.google.common.collect;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends o1 implements ListIterator {
    public final /* synthetic */ int y;
    public final /* synthetic */ AbstractList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.y = i;
        this.z = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o1
    public final Object b(Object obj) {
        switch (this.y) {
            case 0:
                return ((t0) this.z).y.apply(obj);
            default:
                return ((u0) this.z).y.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.e).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.e).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.e).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.e).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
