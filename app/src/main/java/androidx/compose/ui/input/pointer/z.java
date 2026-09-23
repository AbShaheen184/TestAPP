package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final /* synthetic */ z[] A;
    public static final z e;
    public static final z y;
    public static final z z;

    static {
        z zVar = new z("Unknown", 0);
        e = zVar;
        z zVar2 = new z("Dispatching", 1);
        y = zVar2;
        z zVar3 = new z("NotDispatching", 2);
        z = zVar3;
        A = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) A.clone();
    }
}
