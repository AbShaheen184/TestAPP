package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final /* synthetic */ c0[] A;
    public static final c0 e;
    public static final c0 y;
    public static final c0 z;

    static {
        c0 c0Var = new c0("Vertical", 0);
        e = c0Var;
        c0 c0Var2 = new c0("Horizontal", 1);
        y = c0Var2;
        c0 c0Var3 = new c0("Both", 2);
        z = c0Var3;
        A = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) A.clone();
    }
}
