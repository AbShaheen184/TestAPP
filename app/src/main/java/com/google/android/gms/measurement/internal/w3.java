package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 {
    public static final w3 e;
    public static final w3 y;
    public static final /* synthetic */ w3[] z;

    static {
        w3 w3Var = new w3("CONSENT", 0);
        e = w3Var;
        w3 w3Var2 = new w3("LEGITIMATE_INTEREST", 1);
        w3 w3Var3 = new w3("FLEXIBLE_CONSENT", 2);
        w3 w3Var4 = new w3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        y = w3Var4;
        z = new w3[]{w3Var, w3Var2, w3Var3, w3Var4};
    }

    public static w3[] values() {
        return (w3[]) z.clone();
    }
}
