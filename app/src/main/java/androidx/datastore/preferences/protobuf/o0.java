package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static final n0 a;
    public static final n0 b;

    static {
        r0 r0Var = r0.c;
        n0 n0Var = null;
        try {
            n0Var = (n0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = n0Var;
        b = new n0();
    }
}
