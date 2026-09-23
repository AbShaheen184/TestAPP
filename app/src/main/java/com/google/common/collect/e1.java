package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends h0 {
    public final transient int A;
    public final transient int B;
    public final transient Object[] z;

    public e1(Object[] objArr, int i, int i2) {
        this.z = objArr;
        this.A = i;
        this.B = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        _COROUTINE.a.s(i, this.B);
        Object obj = this.z[(i * 2) + this.A];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B;
    }
}
