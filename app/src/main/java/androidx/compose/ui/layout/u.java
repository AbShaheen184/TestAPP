package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u e;
    public static final u y;
    public static final /* synthetic */ u[] z;

    static {
        u uVar = new u("Width", 0);
        e = uVar;
        u uVar2 = new u("Height", 1);
        y = uVar2;
        z = new u[]{uVar, uVar2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) z.clone();
    }
}
