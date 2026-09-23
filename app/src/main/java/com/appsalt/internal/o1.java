package com.appsalt.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static final o1 e;
    public static final o1 y;
    public static final /* synthetic */ o1[] z;

    static {
        o1 o1Var = new o1("FAILED", 0);
        e = o1Var;
        o1 o1Var2 = new o1("SUCCEEDED", 1);
        y = o1Var2;
        z = new o1[]{o1Var, o1Var2};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) z.clone();
    }
}
