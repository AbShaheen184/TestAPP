package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final t A;
    public static final /* synthetic */ t[] B;
    public static final t e;
    public static final t y;
    public static final t z;

    static {
        t tVar = new t("LookaheadMeasurement", 0);
        e = tVar;
        t tVar2 = new t("LookaheadPlacement", 1);
        y = tVar2;
        t tVar3 = new t("Measurement", 2);
        z = tVar3;
        t tVar4 = new t("Placement", 3);
        A = tVar4;
        B = new t[]{tVar, tVar2, tVar3, tVar4};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) B.clone();
    }
}
