package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final p1 a;
    public static final p1 b;

    static {
        Class cls = d.a;
        p1 p1Var = null;
        try {
            p1Var = (p1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p1Var;
        b = new p1();
    }
}
