package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final androidx.collection.o0 a = c(true);
    public static final androidx.collection.o0 b = c(false);
    public static final o c = o.b;

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-211209833);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, c, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new n(rVar, i);
        }
    }

    public static final void b(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.d1 d1Var, androidx.compose.ui.layout.p0 p0Var, androidx.compose.ui.unit.m mVar, int i, int i2, androidx.compose.ui.j jVar) {
        androidx.compose.ui.j jVar2;
        Object objL = p0Var.L();
        m mVar2 = objL instanceof m ? (m) objL : null;
        androidx.compose.ui.layout.c1.k(c1Var, d1Var, ((mVar2 == null || (jVar2 = mVar2.L) == null) ? jVar : jVar2).a((((long) d1Var.e) << 32) | (((long) d1Var.y) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), mVar));
    }

    public static final androidx.collection.o0 c(boolean z) {
        androidx.collection.o0 o0Var = new androidx.collection.o0(9);
        androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
        o0Var.m(jVar, new s(jVar, z));
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.y;
        o0Var.m(jVar2, new s(jVar2, z));
        androidx.compose.ui.j jVar3 = androidx.compose.ui.c.z;
        o0Var.m(jVar3, new s(jVar3, z));
        androidx.compose.ui.j jVar4 = androidx.compose.ui.c.A;
        o0Var.m(jVar4, new s(jVar4, z));
        androidx.compose.ui.j jVar5 = androidx.compose.ui.c.B;
        o0Var.m(jVar5, new s(jVar5, z));
        androidx.compose.ui.j jVar6 = androidx.compose.ui.c.C;
        o0Var.m(jVar6, new s(jVar6, z));
        androidx.compose.ui.j jVar7 = androidx.compose.ui.c.D;
        o0Var.m(jVar7, new s(jVar7, z));
        androidx.compose.ui.j jVar8 = androidx.compose.ui.c.E;
        o0Var.m(jVar8, new s(jVar8, z));
        androidx.compose.ui.j jVar9 = androidx.compose.ui.c.F;
        o0Var.m(jVar9, new s(jVar9, z));
        return o0Var;
    }

    public static final androidx.compose.ui.layout.q0 d(androidx.compose.ui.j jVar, boolean z) {
        androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) (z ? a : b).g(jVar);
        return q0Var == null ? new s(jVar, z) : q0Var;
    }
}
