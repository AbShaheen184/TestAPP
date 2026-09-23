package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 implements androidx.compose.ui.unit.c {
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c1 c1Var, d1 d1Var) {
        c1Var.getClass();
        if (d1Var instanceof androidx.compose.ui.node.x0) {
            ((androidx.compose.ui.node.x0) d1Var).O(c1Var.e);
        }
    }

    public static void i(c1 c1Var, d1 d1Var, int i, int i2) {
        c1Var.getClass();
        b(c1Var, d1Var);
        d1Var.l0(androidx.compose.ui.unit.j.c((((long) i2) & 4294967295L) | (((long) i) << 32), d1Var.B), 0.0f, null);
    }

    public static void k(c1 c1Var, d1 d1Var, long j) {
        c1Var.getClass();
        b(c1Var, d1Var);
        d1Var.l0(androidx.compose.ui.unit.j.c(j, d1Var.B), 0.0f, null);
    }

    public static void l(c1 c1Var, d1 d1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (c1Var.f() == androidx.compose.ui.unit.m.e || c1Var.g() == 0) {
            b(c1Var, d1Var);
            d1Var.l0(androidx.compose.ui.unit.j.c(j, d1Var.B), 0.0f, null);
        } else {
            int iG = (c1Var.g() - d1Var.e) - ((int) (j >> 32));
            b(c1Var, d1Var);
            d1Var.l0(androidx.compose.ui.unit.j.c((((long) iG) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), d1Var.B), 0.0f, null);
        }
    }

    public static void m(c1 c1Var, d1 d1Var, int i, int i2) {
        int i3 = f1.b;
        e1 e1Var = e1.z;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (c1Var.f() == androidx.compose.ui.unit.m.e || c1Var.g() == 0) {
            b(c1Var, d1Var);
            d1Var.l0(androidx.compose.ui.unit.j.c(j, d1Var.B), 0.0f, e1Var);
        } else {
            int iG = (c1Var.g() - d1Var.e) - ((int) (j >> 32));
            b(c1Var, d1Var);
            d1Var.l0(androidx.compose.ui.unit.j.c((((long) iG) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), d1Var.B), 0.0f, e1Var);
        }
    }

    public static void p(c1 c1Var, d1 d1Var, kotlin.jvm.functions.l lVar) {
        c1Var.getClass();
        long j = 0;
        b(c1Var, d1Var);
        d1Var.l0(androidx.compose.ui.unit.j.c((j & 4294967295L) | (j << 32), d1Var.B), 0.0f, lVar);
    }

    public static void s(c1 c1Var, d1 d1Var, long j) {
        int i = f1.b;
        e1 e1Var = e1.z;
        c1Var.getClass();
        b(c1Var, d1Var);
        d1Var.l0(androidx.compose.ui.unit.j.c(j, d1Var.B), 0.0f, e1Var);
    }

    public float c(p pVar) {
        return Float.NaN;
    }

    public abstract androidx.compose.ui.unit.m f();

    public abstract int g();
}
