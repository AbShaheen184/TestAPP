package com.app.mlounge.ui.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final /* synthetic */ n0[] A;
    public static final n0 e;
    public static final n0 y;
    public static final n0 z;

    static {
        n0 n0Var = new n0("SEARCHING", 0);
        e = n0Var;
        n0 n0Var2 = new n0("DONE", 1);
        y = n0Var2;
        n0 n0Var3 = new n0("FAILED", 2);
        z = n0Var3;
        A = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) A.clone();
    }
}
