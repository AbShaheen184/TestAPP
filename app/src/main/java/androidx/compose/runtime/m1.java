package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final m1 A;
    public static final m1 B;
    public static final m1 C;
    public static final m1 D;
    public static final /* synthetic */ m1[] E;
    public static final m1 e;
    public static final m1 y;
    public static final m1 z;

    static {
        m1 m1Var = new m1("Invalid", 0);
        e = m1Var;
        m1 m1Var2 = new m1("Cancelled", 1);
        y = m1Var2;
        m1 m1Var3 = new m1("InitialPending", 2);
        z = m1Var3;
        m1 m1Var4 = new m1("RecomposePending", 3);
        A = m1Var4;
        m1 m1Var5 = new m1("Recomposing", 4);
        B = m1Var5;
        m1 m1Var6 = new m1("ApplyPending", 5);
        C = m1Var6;
        m1 m1Var7 = new m1("Applied", 6);
        D = m1Var7;
        E = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) E.clone();
    }
}
