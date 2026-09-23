package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final q0 e;
    public static final q0 y;
    public static final /* synthetic */ q0[] z;

    static {
        q0 q0Var = new q0("Min", 0);
        e = q0Var;
        q0 q0Var2 = new q0("Max", 1);
        y = q0Var2;
        z = new q0[]{q0Var, q0Var2};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) z.clone();
    }
}
