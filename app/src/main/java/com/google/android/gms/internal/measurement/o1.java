package com.google.android.gms.internal.measurement;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends AbstractList {
    public final m1 e;
    public final n1 y;

    public o1(m1 m1Var, n1 n1Var) {
        this.e = m1Var;
        this.y = n1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iD = ((j1) this.e).d(i);
        ((f1) this.y).getClass();
        k0 k0VarD = k0.d(iD);
        return k0VarD == null ? k0.UNKNOWN : k0VarD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((j1) this.e).z;
    }
}
