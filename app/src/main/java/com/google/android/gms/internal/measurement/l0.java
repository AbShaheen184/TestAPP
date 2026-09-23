package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Iterator {
    public final /* synthetic */ Iterator e;
    public final /* synthetic */ Iterator y;

    public l0(l1 l1Var, Iterator it, Iterator it2) {
        this.e = it;
        this.y = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e.hasNext()) {
            return true;
        }
        return this.y.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.e;
        if (it.hasNext()) {
            return new g5(((Integer) it.next()).toString());
        }
        Iterator it2 = this.y;
        if (it2.hasNext()) {
            return new g5((String) it2.next());
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }
}
