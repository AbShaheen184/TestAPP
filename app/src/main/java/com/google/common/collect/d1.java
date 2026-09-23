package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends k0 {
    public final transient f1 A;
    public final transient e1 B;

    public d1(f1 f1Var, e1 e1Var) {
        this.A = f1Var;
        this.B = e1Var;
    }

    @Override // com.google.common.collect.k0, com.google.common.collect.b0
    public final h0 b() {
        return this.B;
    }

    @Override // com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        return this.B.c(i, objArr);
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A.get(obj) != null;
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return true;
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return this.B.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A.C;
    }
}
