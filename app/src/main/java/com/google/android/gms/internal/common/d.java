package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public final transient int A;
    public final /* synthetic */ e B;
    public final transient int z;

    public d(e eVar, int i, int i2) {
        this.B = eVar;
        this.z = i;
        this.A = i2;
    }

    @Override // com.google.android.gms.internal.common.a
    public final Object[] b() {
        return this.B.b();
    }

    @Override // com.google.android.gms.internal.common.a
    public final int c() {
        return this.B.c() + this.z;
    }

    @Override // com.google.android.gms.internal.common.a
    public final int d() {
        return this.B.c() + this.z + this.A;
    }

    @Override // java.util.List
    public final Object get(int i) {
        kotlin.math.a.T(i, this.A);
        return this.B.get(i + this.z);
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    /* JADX INFO: renamed from: h */
    public final e subList(int i, int i2) {
        kotlin.math.a.U(i, i2, this.A);
        int i3 = this.z;
        return this.B.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
