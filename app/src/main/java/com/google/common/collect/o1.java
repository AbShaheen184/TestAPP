package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements Iterator {
    public final Iterator e;

    public o1(Iterator it) {
        it.getClass();
        this.e = it;
    }

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.e.remove();
    }
}
