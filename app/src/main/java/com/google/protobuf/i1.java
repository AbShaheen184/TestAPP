package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static final h1 a;
    public static final h1 b;

    static {
        Class cls = d.a;
        h1 h1Var = null;
        try {
            h1Var = (h1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h1Var;
        b = new h1();
    }
}
