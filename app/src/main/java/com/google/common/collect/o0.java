package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends p1 {
    public final Object e;
    public boolean y;

    public o0(Object obj) {
        this.e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.y) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.y = true;
        return this.e;
    }
}
