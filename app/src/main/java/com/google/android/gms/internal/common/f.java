package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    public static final f B = new f(new Object[0], 0);
    public final transient int A;
    public final transient Object[] z;

    public f(Object[] objArr, int i) {
        this.z = objArr;
        this.A = i;
    }

    @Override // com.google.android.gms.internal.common.a
    public final Object[] b() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.common.a
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.a
    public final int d() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.common.e, com.google.android.gms.internal.common.a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.z;
        int i = this.A;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        kotlin.math.a.T(i, this.A);
        Object obj = this.z[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
