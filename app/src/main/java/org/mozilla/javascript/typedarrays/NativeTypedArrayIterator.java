package org.mozilla.javascript.typedarrays;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class NativeTypedArrayIterator<T> implements ListIterator<T> {
    private int lastPosition = -1;
    private int position;
    private final NativeTypedArrayView<T> view;

    public NativeTypedArrayIterator(NativeTypedArrayView<T> nativeTypedArrayView, int i) {
        this.view = nativeTypedArrayView;
        this.position = i;
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.position < this.view.length;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            c.a();
            return null;
        }
        T t = this.view.get(this.position);
        int i = this.position;
        this.lastPosition = i;
        this.position = i + 1;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            c.a();
            return null;
        }
        int i = this.position - 1;
        this.position = i;
        this.lastPosition = i;
        return this.view.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.position - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        int i = this.lastPosition;
        if (i >= 0) {
            this.view.js_set(i, t);
        } else {
            org.mozilla.javascript.c.a();
        }
    }
}
