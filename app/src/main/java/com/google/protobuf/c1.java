package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public static final b1 a;
    public static final b1 b;

    static {
        Class cls = d.a;
        b1 b1Var = null;
        try {
            b1Var = (b1) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b1Var;
        b = new b1();
    }
}
