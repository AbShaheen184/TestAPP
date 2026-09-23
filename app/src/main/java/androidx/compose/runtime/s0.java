package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final s0 A;
    public static final /* synthetic */ s0[] B;
    public static final s0 e;
    public static final s0 y;
    public static final s0 z;

    static {
        s0 s0Var = new s0("IGNORED", 0);
        e = s0Var;
        s0 s0Var2 = new s0("SCHEDULED", 1);
        y = s0Var2;
        s0 s0Var3 = new s0("DEFERRED", 2);
        z = s0Var3;
        s0 s0Var4 = new s0("IMMINENT", 3);
        A = s0Var4;
        B = new s0[]{s0Var, s0Var2, s0Var3, s0Var4};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) B.clone();
    }
}
