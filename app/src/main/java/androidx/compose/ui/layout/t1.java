package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public static final androidx.collection.z a;
    public static final r1[] b;

    static {
        androidx.collection.z zVar = new androidx.collection.z(8);
        r1.a.getClass();
        s1 s1Var = q1.g;
        zVar.h(1, s1Var);
        s1 s1Var2 = q1.f;
        zVar.h(2, s1Var2);
        s1 s1Var3 = q1.b;
        zVar.h(4, s1Var3);
        s1 s1Var4 = q1.d;
        zVar.h(8, s1Var4);
        s1 s1Var5 = q1.h;
        zVar.h(16, s1Var5);
        s1 s1Var6 = q1.e;
        zVar.h(32, s1Var6);
        s1 s1Var7 = q1.i;
        zVar.h(64, s1Var7);
        s1 s1Var8 = q1.c;
        zVar.h(128, s1Var8);
        a = zVar;
        b = new r1[]{s1Var, s1Var2, s1Var3, s1Var7, s1Var5, s1Var6, s1Var4, q1.j, s1Var8};
    }

    public static final void a(androidx.compose.ui.node.k0 k0Var, q qVar, long j, int i, int i2) {
        if (a0.f(j, -1L)) {
            return;
        }
        k0Var.c(qVar.b(), (int) ((j >>> 48) & 65535));
        k0Var.c(qVar.d(), (int) ((j >>> 32) & 65535));
        k0Var.c(qVar.c(), i - ((int) ((j >>> 16) & 65535)));
        k0Var.c(qVar.a(), i2 - ((int) (j & 65535)));
    }
}
