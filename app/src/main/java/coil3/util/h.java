package coil3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h A;
    public static final h B;
    public static final /* synthetic */ h[] C;
    public static final h e;
    public static final h y;
    public static final h z;

    static {
        h hVar = new h("Verbose", 0);
        e = hVar;
        h hVar2 = new h("Debug", 1);
        y = hVar2;
        h hVar3 = new h("Info", 2);
        z = hVar3;
        h hVar4 = new h("Warn", 3);
        A = hVar4;
        h hVar5 = new h("Error", 4);
        B = hVar5;
        C = new h[]{hVar, hVar2, hVar3, hVar4, hVar5};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) C.clone();
    }
}
