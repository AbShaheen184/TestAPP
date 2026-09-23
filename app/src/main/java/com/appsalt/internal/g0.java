package com.appsalt.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final g0 e;
    public static final g0 y;
    public static final /* synthetic */ g0[] z;

    static {
        g0 g0Var = new g0("STANDARD", 0);
        e = g0Var;
        g0 g0Var2 = new g0("FOREGROUND", 1);
        y = g0Var2;
        z = new g0[]{g0Var, g0Var2};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) z.clone();
    }
}
