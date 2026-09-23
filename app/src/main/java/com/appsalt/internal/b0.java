package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static x2 d;
    public static final j0 a = new j0(4);
    public static final j0 b = new j0(5);
    public static final com.app.mlounge.ui.theme.f c = new com.app.mlounge.ui.theme.f(2);
    public static final j0 e = new j0(6);
    public static final /* synthetic */ int[] f = {1, 2, 3, 4, 5, 6, 7};

    public static int a(Boolean bool) {
        if (kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
            return 2;
        }
        return kotlin.jvm.internal.l.a(bool, Boolean.FALSE) ? 3 : 1;
    }

    public static i3 b(androidx.work.impl.k kVar, int i) {
        kVar.getClass();
        p0 p0Var = (p0) kVar.z;
        x xVar = (x) kVar.y;
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return new d4(xVar, p0Var);
        }
        if (iE == 1) {
            return new l0(xVar, p0Var);
        }
        coil3.g.a();
        return null;
    }
}
