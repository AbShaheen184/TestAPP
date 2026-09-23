package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final a0 a;
    public static final a0 b;

    static {
        r0 r0Var = r0.c;
        a0 a0Var = null;
        try {
            a0Var = (a0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = a0Var;
        b = new a0();
    }
}
