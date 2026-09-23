package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final /* synthetic */ p0[] A;
    public static final p0 e;
    public static final p0 y;
    public static final p0 z;

    static {
        p0 p0Var = new p0("IsPlacedInLookahead", 0);
        e = p0Var;
        p0 p0Var2 = new p0("IsPlacedInApproach", 1);
        y = p0Var2;
        p0 p0Var3 = new p0("IsNotPlaced", 2);
        z = p0Var3;
        A = new p0[]{p0Var, p0Var2, p0Var3};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) A.clone();
    }
}
