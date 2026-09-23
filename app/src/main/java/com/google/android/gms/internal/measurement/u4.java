package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 implements Iterator {
    public final /* synthetic */ Iterator e;

    public u4(Iterator it) {
        this.e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new g5((String) this.e.next());
    }
}
