package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v4 {
    public static final float a;
    public static final float b = 12;
    public static final float c;

    static {
        float f = 2;
        a = f;
        c = f;
    }

    public static final void a(final boolean z, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z2, final t4 t4Var, androidx.compose.runtime.s sVar, final int i) {
        final androidx.compose.ui.r rVar2;
        final boolean z3;
        boolean z4;
        androidx.compose.ui.r rVar3;
        long j;
        Object objV;
        androidx.compose.ui.r rVarA;
        sVar.c0(408580840);
        int i2 = i | (sVar.g(z) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | 3456 | (sVar.f(t4Var) ? 16384 : 8192) | 196608;
        if (sVar.T(i2 & 1, (74899 & i2) != 74898)) {
            sVar.Y();
            int i3 = i & 1;
            androidx.compose.ui.r rVar4 = androidx.compose.ui.o.b;
            if (i3 == 0 || sVar.C()) {
                z4 = true;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar;
                z4 = z2;
            }
            sVar.q();
            androidx.compose.runtime.w2 w2VarA = androidx.compose.animation.core.h.a(z ? b / 2 : 0, q.r(androidx.compose.material3.tokens.p.y, sVar), sVar);
            if (z4 && z) {
                j = t4Var.a;
            } else if (!z4 || z) {
                j = (z4 || !z) ? t4Var.d : t4Var.c;
            } else {
                j = t4Var.b;
            }
            if (z4) {
                sVar.b0(1194696477);
                objV = androidx.compose.animation.e1.a(j, q.r(androidx.compose.material3.tokens.p.z, sVar), sVar);
                sVar.p(false);
            } else {
                sVar.b0(1194874138);
                objV = androidx.compose.runtime.t.v(new androidx.compose.ui.graphics.t(j), sVar);
                sVar.p(false);
            }
            Object obj = objV;
            if (aVar != null) {
                z3 = z4;
                rVarA = androidx.compose.foundation.selection.c.a(rVar4, z, null, x4.a(false, androidx.compose.material3.tokens.v.e / 2, 4), z3, new androidx.compose.ui.semantics.j(3), aVar);
            } else {
                z3 = z4;
                rVarA = rVar4;
            }
            if (aVar != null) {
                androidx.compose.ui.layout.n nVar = t1.a;
                rVar4 = o2.b;
            }
            androidx.compose.ui.r rVarJ = androidx.compose.foundation.layout.i1.j(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.i1.t(rVar3.d(rVar4).d(rVarA)), a), androidx.compose.material3.tokens.v.c);
            boolean zF = sVar.f(obj) | sVar.f(w2VarA);
            Object objQ = sVar.Q();
            if (zF || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.activity.compose.h(28, obj, w2VarA);
                sVar.l0(objQ);
            }
            androidx.compose.foundation.s.b(rVarJ, (kotlin.jvm.functions.l) objQ, sVar, 0);
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
            z3 = z2;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(z, aVar, rVar2, z3, t4Var, i) { // from class: androidx.compose.material3.u4
                public final /* synthetic */ boolean A;
                public final /* synthetic */ t4 B;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ kotlin.jvm.functions.a y;
                public final /* synthetic */ androidx.compose.ui.r z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    v4.a(this.e, this.y, this.z, this.A, this.B, (androidx.compose.runtime.s) obj2, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
