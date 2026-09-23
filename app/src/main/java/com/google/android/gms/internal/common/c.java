package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public final transient e z;

    public c(e eVar) {
        this.z = eVar;
    }

    @Override // com.google.android.gms.internal.common.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.z.contains(obj);
    }

    @Override // com.google.android.gms.internal.common.e
    public final e f() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.z;
        kotlin.math.a.T(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    /* JADX INFO: renamed from: h */
    public final e subList(int i, int i2) {
        e eVar = this.z;
        kotlin.math.a.U(i, i2, eVar.size());
        return eVar.subList(eVar.size() - i2, eVar.size() - i).f();
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.z;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.z;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.size();
    }
}
