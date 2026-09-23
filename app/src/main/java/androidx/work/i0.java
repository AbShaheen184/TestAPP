package androidx.work;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final i0 A;
    public static final i0 B;
    public static final i0 C;
    public static final /* synthetic */ i0[] D;
    public static final i0 e;
    public static final i0 y;
    public static final i0 z;

    static {
        i0 i0Var = new i0("ENQUEUED", 0);
        e = i0Var;
        i0 i0Var2 = new i0(DebugCoroutineInfoImplKt.RUNNING, 1);
        y = i0Var2;
        i0 i0Var3 = new i0("SUCCEEDED", 2);
        z = i0Var3;
        i0 i0Var4 = new i0("FAILED", 3);
        A = i0Var4;
        i0 i0Var5 = new i0("BLOCKED", 4);
        B = i0Var5;
        i0 i0Var6 = new i0("CANCELLED", 5);
        C = i0Var6;
        D = new i0[]{i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) D.clone();
    }

    public final boolean a() {
        return this == z || this == A || this == C;
    }
}
