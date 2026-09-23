package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final h0 a;
    public static final h0 b;

    static {
        r0 r0Var = r0.c;
        h0 h0Var = null;
        try {
            h0Var = (h0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h0Var;
        b = new h0();
    }
}
