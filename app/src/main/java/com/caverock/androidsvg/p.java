package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p F;
    public static final p G;
    public static final /* synthetic */ p[] H;
    public static final p e;
    public static final p y;
    public static final p z;

    static {
        p pVar = new p("none", 0);
        e = pVar;
        p pVar2 = new p("xMinYMin", 1);
        y = pVar2;
        p pVar3 = new p("xMidYMin", 2);
        z = pVar3;
        p pVar4 = new p("xMaxYMin", 3);
        A = pVar4;
        p pVar5 = new p("xMinYMid", 4);
        B = pVar5;
        p pVar6 = new p("xMidYMid", 5);
        C = pVar6;
        p pVar7 = new p("xMaxYMid", 6);
        D = pVar7;
        p pVar8 = new p("xMinYMax", 7);
        E = pVar8;
        p pVar9 = new p("xMidYMax", 8);
        F = pVar9;
        p pVar10 = new p("xMaxYMax", 9);
        G = pVar10;
        H = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) H.clone();
    }
}
