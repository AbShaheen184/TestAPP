package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements j1 {
    public j1[] a;

    @Override // com.google.protobuf.j1
    public final v1 a(Class cls) {
        for (j1 j1Var : this.a) {
            if (j1Var.b(cls)) {
                return j1Var.a(cls);
            }
        }
        com.google.firebase.platforminfo.b.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.protobuf.j1
    public final boolean b(Class cls) {
        for (j1 j1Var : this.a) {
            if (j1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
