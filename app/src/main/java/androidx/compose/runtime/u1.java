package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {
    public static final u1 A;
    public static final u1 B;
    public static final u1 C;
    public static final /* synthetic */ u1[] D;
    public static final u1 e;
    public static final u1 y;
    public static final u1 z;

    static {
        u1 u1Var = new u1("ShutDown", 0);
        e = u1Var;
        u1 u1Var2 = new u1("ShuttingDown", 1);
        y = u1Var2;
        u1 u1Var3 = new u1("Inactive", 2);
        z = u1Var3;
        u1 u1Var4 = new u1("InactivePendingWork", 3);
        A = u1Var4;
        u1 u1Var5 = new u1("Idle", 4);
        B = u1Var5;
        u1 u1Var6 = new u1("PendingWork", 5);
        C = u1Var6;
        D = new u1[]{u1Var, u1Var2, u1Var3, u1Var4, u1Var5, u1Var6};
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) D.clone();
    }
}
