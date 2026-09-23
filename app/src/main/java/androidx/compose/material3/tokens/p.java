package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p A;
    public static final p B;
    public static final /* synthetic */ p[] C;
    public static final p e;
    public static final p y;
    public static final p z;

    static {
        p pVar = new p("DefaultSpatial", 0);
        e = pVar;
        p pVar2 = new p("FastSpatial", 1);
        y = pVar2;
        p pVar3 = new p("SlowSpatial", 2);
        p pVar4 = new p("DefaultEffects", 3);
        z = pVar4;
        p pVar5 = new p("FastEffects", 4);
        A = pVar5;
        p pVar6 = new p("SlowEffects", 5);
        B = pVar6;
        C = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) C.clone();
    }
}
