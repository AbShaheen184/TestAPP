package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final g a = new g(-1.0f);
    public static final g b = new g(1.0f);
    public static final f c = new f(-1.0f);
    public static final f d = new f(1.0f);

    public static r a(r rVar, kotlin.jvm.functions.q qVar) {
        return rVar.d(new m(qVar));
    }

    public static final r b(androidx.compose.runtime.s sVar, r rVar) {
        if (rVar.b(n.y)) {
            return rVar;
        }
        sVar.X(1219399079, null, null, 0);
        r rVar2 = (r) rVar.a(o.b, new androidx.compose.animation.f(sVar, 1));
        sVar.p(false);
        return rVar2;
    }

    public static final r c(androidx.compose.runtime.s sVar, r rVar) {
        sVar.b0(439770924);
        r rVarB = b(sVar, rVar);
        sVar.p(false);
        return rVarB;
    }
}
