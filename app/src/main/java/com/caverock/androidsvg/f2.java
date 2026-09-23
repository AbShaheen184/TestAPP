package com.caverock.androidsvg;

import java.util.HashMap;
import org.mozilla.javascript.NativeSymbol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public static final f2 A;
    public static final HashMap B;
    public static final /* synthetic */ f2[] C;
    public static final f2 e;
    public static final f2 y;
    public static final f2 z;

    /* JADX INFO: Fake field, exist only in values array */
    f2 EF1;

    static {
        f2 f2Var = new f2("svg", 0);
        f2 f2Var2 = new f2("a", 1);
        f2 f2Var3 = new f2("circle", 2);
        f2 f2Var4 = new f2("clipPath", 3);
        f2 f2Var5 = new f2("defs", 4);
        f2 f2Var6 = new f2("desc", 5);
        e = f2Var6;
        f2 f2Var7 = new f2("ellipse", 6);
        f2 f2Var8 = new f2("g", 7);
        f2 f2Var9 = new f2("image", 8);
        f2 f2Var10 = new f2("line", 9);
        f2 f2Var11 = new f2("linearGradient", 10);
        f2 f2Var12 = new f2("marker", 11);
        f2 f2Var13 = new f2("mask", 12);
        f2 f2Var14 = new f2("path", 13);
        f2 f2Var15 = new f2("pattern", 14);
        f2 f2Var16 = new f2("polygon", 15);
        f2 f2Var17 = new f2("polyline", 16);
        f2 f2Var18 = new f2("radialGradient", 17);
        f2 f2Var19 = new f2("rect", 18);
        f2 f2Var20 = new f2("solidColor", 19);
        f2 f2Var21 = new f2("stop", 20);
        f2 f2Var22 = new f2("style", 21);
        f2 f2Var23 = new f2("SWITCH", 22);
        y = f2Var23;
        f2 f2Var24 = new f2(NativeSymbol.TYPE_NAME, 23);
        f2 f2Var25 = new f2("text", 24);
        f2 f2Var26 = new f2("textPath", 25);
        f2 f2Var27 = new f2("title", 26);
        z = f2Var27;
        f2 f2Var28 = new f2("tref", 27);
        f2 f2Var29 = new f2("tspan", 28);
        f2 f2Var30 = new f2("use", 29);
        f2 f2Var31 = new f2("view", 30);
        f2 f2Var32 = new f2("UNSUPPORTED", 31);
        A = f2Var32;
        C = new f2[]{f2Var, f2Var2, f2Var3, f2Var4, f2Var5, f2Var6, f2Var7, f2Var8, f2Var9, f2Var10, f2Var11, f2Var12, f2Var13, f2Var14, f2Var15, f2Var16, f2Var17, f2Var18, f2Var19, f2Var20, f2Var21, f2Var22, f2Var23, f2Var24, f2Var25, f2Var26, f2Var27, f2Var28, f2Var29, f2Var30, f2Var31, f2Var32};
        B = new HashMap();
        for (f2 f2Var33 : values()) {
            if (f2Var33 == y) {
                B.put("switch", f2Var33);
            } else if (f2Var33 != A) {
                B.put(f2Var33.name(), f2Var33);
            }
        }
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) C.clone();
    }
}
