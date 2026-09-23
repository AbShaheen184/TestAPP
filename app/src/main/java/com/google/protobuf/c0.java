package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final b0 a = new b0();
    public static final b0 b;

    static {
        Class cls = d.a;
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = b0Var;
    }
}
