package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Comparable {
    public final int e;
    public final t2 y;
    public final boolean z;

    public j0(int i, t2 t2Var, boolean z, boolean z2) {
        this.e = i;
        this.y = t2Var;
        this.z = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.e - ((j0) obj).e;
    }
}
