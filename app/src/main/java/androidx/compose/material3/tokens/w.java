package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final w A;
    public static final w B;
    public static final w C;
    public static final w D;
    public static final /* synthetic */ w[] E;
    public static final w e;
    public static final w y;
    public static final w z;

    /* JADX INFO: Fake field, exist only in values array */
    w EF0;

    static {
        w wVar = new w("CornerExtraExtraLarge", 0);
        w wVar2 = new w("CornerExtraLarge", 1);
        e = wVar2;
        w wVar3 = new w("CornerExtraLargeIncreased", 2);
        w wVar4 = new w("CornerExtraLargeTop", 3);
        y = wVar4;
        w wVar5 = new w("CornerExtraSmall", 4);
        z = wVar5;
        w wVar6 = new w("CornerExtraSmallTop", 5);
        w wVar7 = new w("CornerFull", 6);
        A = wVar7;
        w wVar8 = new w("CornerLarge", 7);
        w wVar9 = new w("CornerLargeEnd", 8);
        w wVar10 = new w("CornerLargeIncreased", 9);
        w wVar11 = new w("CornerLargeStart", 10);
        w wVar12 = new w("CornerLargeTop", 11);
        w wVar13 = new w("CornerMedium", 12);
        B = wVar13;
        w wVar14 = new w("CornerNone", 13);
        C = wVar14;
        w wVar15 = new w("CornerSmall", 14);
        D = wVar15;
        E = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) E.clone();
    }
}
