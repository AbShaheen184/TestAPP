package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final /* synthetic */ e0[] A;
    public static final e0 e;
    public static final e0 y;
    public static final e0 z;

    static {
        e0 e0Var = new e0("NOT_RUN", 0);
        e = e0Var;
        e0 e0Var2 = new e0("CANCELLED", 1);
        y = e0Var2;
        e0 e0Var3 = new e0("STARTED", 2);
        z = e0Var3;
        A = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) A.clone();
    }
}
