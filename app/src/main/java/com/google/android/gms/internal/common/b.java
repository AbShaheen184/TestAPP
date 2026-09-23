package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ListIterator, Iterator {
    public final int e;
    public int y;
    public final e z;

    public b(e eVar, int i) {
        int size = eVar.size();
        if (i < 0 || i > size) {
            com.google.firebase.platforminfo.b.l(kotlin.math.a.V(i, size, "index"));
            throw null;
        }
        this.e = size;
        this.y = i;
        this.z = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.z.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.y < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y;
        this.y = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y - 1;
        this.y = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.y - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
