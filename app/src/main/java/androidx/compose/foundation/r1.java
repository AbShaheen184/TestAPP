package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {
    public static final androidx.compose.runtime.d0 a = new androidx.compose.runtime.d0(new androidx.compose.animation.core.n1(25));

    public static final n a(androidx.compose.runtime.s sVar) {
        sVar.b0(282942128);
        o oVar = (o) sVar.j(a);
        if (oVar == null) {
            sVar.p(false);
            return null;
        }
        boolean zF = sVar.f(oVar);
        Object objQ = sVar.Q();
        if (zF || objQ == androidx.compose.runtime.n.a) {
            Object nVar = new n(oVar.a, oVar.b, oVar.c, oVar.d);
            sVar.l0(nVar);
            objQ = nVar;
        }
        n nVar2 = (n) objQ;
        sVar.p(false);
        return nVar2;
    }
}
