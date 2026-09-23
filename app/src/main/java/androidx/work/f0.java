package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final f0 e;
    public static final f0 y;
    public static final /* synthetic */ f0[] z;

    static {
        f0 f0Var = new f0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        e = f0Var;
        f0 f0Var2 = new f0("DROP_WORK_REQUEST", 1);
        y = f0Var2;
        z = new f0[]{f0Var, f0Var2};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) z.clone();
    }
}
