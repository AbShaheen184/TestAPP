package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final /* synthetic */ j1[] A;
    public static final j1 e;
    public static final j1 y;
    public static final j1 z;

    static {
        j1 j1Var = new j1("Default", 0);
        e = j1Var;
        j1 j1Var2 = new j1("UserInput", 1);
        y = j1Var2;
        j1 j1Var3 = new j1("PreventUserInput", 2);
        z = j1Var3;
        A = new j1[]{j1Var, j1Var2, j1Var3};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) A.clone();
    }
}
