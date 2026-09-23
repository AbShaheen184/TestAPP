package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Iterator {
    public final Iterator e;

    public s(t tVar) {
        this.e = tVar.e.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.e.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
