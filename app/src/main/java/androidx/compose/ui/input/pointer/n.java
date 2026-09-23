package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final /* synthetic */ n[] A;
    public static final n e;
    public static final n y;
    public static final n z;

    static {
        n nVar = new n("Initial", 0);
        e = nVar;
        n nVar2 = new n("Main", 1);
        y = nVar2;
        n nVar3 = new n("Final", 2);
        z = nVar3;
        A = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) A.clone();
    }
}
