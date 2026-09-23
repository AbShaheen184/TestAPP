package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends m implements Serializable {
    public final Object e;
    public final Object y;

    public c0(Object obj, Object obj2) {
        this.e = obj;
        this.y = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.y;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
