package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements j0 {
    public j0[] a;

    @Override // androidx.datastore.preferences.protobuf.j0
    public final t0 a(Class cls) {
        for (j0 j0Var : this.a) {
            if (j0Var.b(cls)) {
                return j0Var.a(cls);
            }
        }
        com.google.firebase.platforminfo.b.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean b(Class cls) {
        for (j0 j0Var : this.a) {
            if (j0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
