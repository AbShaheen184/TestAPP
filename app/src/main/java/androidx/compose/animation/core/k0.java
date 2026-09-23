package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final androidx.compose.runtime.collection.b a = new androidx.compose.runtime.collection.b(new h0[16]);
    public final androidx.compose.runtime.j1 b = androidx.compose.runtime.t.r(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final androidx.compose.runtime.j1 d = androidx.compose.runtime.t.r(Boolean.TRUE);

    public final void a(int i, androidx.compose.runtime.s sVar) {
        sVar.c0(-318043801);
        int i2 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = sVar.Q();
            kotlin.coroutines.d dVar = null;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ);
            }
            androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                sVar.b0(-144841960);
                boolean zH = sVar.h(this);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == fVar) {
                    objQ2 = new f(a1Var, this, dVar, 1);
                    sVar.l0(objQ2);
                }
                androidx.compose.runtime.l0.c(sVar, this, (kotlin.jvm.functions.p) objQ2);
            } else {
                sVar.b0(-151918981);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new g0(this, i, 0);
        }
    }
}
