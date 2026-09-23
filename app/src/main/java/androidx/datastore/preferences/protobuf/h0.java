package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static g0 a(Object obj, Object obj2) {
        g0 g0VarB = (g0) obj;
        g0 g0Var = (g0) obj2;
        if (!g0Var.isEmpty()) {
            if (!g0VarB.e) {
                g0VarB = g0VarB.b();
            }
            g0VarB.a();
            if (!g0Var.isEmpty()) {
                g0VarB.putAll(g0Var);
            }
        }
        return g0VarB;
    }
}
