package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static final /* synthetic */ t0[] A;
    public static final t0 e;
    public static final t0 y;
    public static final t0 z;

    static {
        t0 t0Var = new t0("Yes", 0);
        e = t0Var;
        t0 t0Var2 = new t0("No", 1);
        y = t0Var2;
        t0 t0Var3 = new t0("NotInitialized", 2);
        z = t0Var3;
        A = new t0[]{t0Var, t0Var2, t0Var3};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) A.clone();
    }
}
