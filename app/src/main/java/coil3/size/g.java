package coil3.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g e;
    public static final g y;
    public static final /* synthetic */ g[] z;

    static {
        g gVar = new g("FILL", 0);
        e = gVar;
        g gVar2 = new g("FIT", 1);
        y = gVar2;
        z = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) z.clone();
    }
}
