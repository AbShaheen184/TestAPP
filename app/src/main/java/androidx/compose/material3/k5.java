package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 {
    public static final /* synthetic */ k5[] A;
    public static final k5 e;
    public static final k5 y;
    public static final k5 z;

    static {
        k5 k5Var = new k5("Hidden", 0);
        e = k5Var;
        k5 k5Var2 = new k5("Expanded", 1);
        y = k5Var2;
        k5 k5Var3 = new k5("PartiallyExpanded", 2);
        z = k5Var3;
        A = new k5[]{k5Var, k5Var2, k5Var3};
    }

    public static k5 valueOf(String str) {
        return (k5) Enum.valueOf(k5.class, str);
    }

    public static k5[] values() {
        return (k5[]) A.clone();
    }
}
