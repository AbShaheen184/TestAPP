package androidx.compose.material3;

import com.app.mlounge.R;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public g3(j5 j5Var, kotlin.jvm.functions.a aVar, CoroutineScope coroutineScope, boolean z, String str, String str2, String str3, kotlin.jvm.functions.p pVar) {
        this.z = j5Var;
        this.A = aVar;
        this.B = coroutineScope;
        this.C = z;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.y = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0143  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x020f  */
    /* JADX WARN: Code duplicated, block: B:71:0x026d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0273  */
    /* JADX WARN: Code duplicated, block: B:79:0x0298  */
    /* JADX WARN: Code duplicated, block: B:81:0x029c  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0331  */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        androidx.compose.ui.text.m0 m0Var;
        Object obj4;
        Object obj5;
        androidx.compose.ui.text.style.o bVar;
        androidx.compose.ui.text.font.k kVar;
        androidx.compose.ui.text.font.k kVar2;
        androidx.compose.ui.text.style.a aVar;
        float f;
        androidx.compose.ui.text.style.p pVar;
        androidx.compose.ui.text.style.p pVar2;
        androidx.compose.ui.text.style.p pVar3;
        androidx.compose.ui.graphics.m0 m0Var2;
        androidx.compose.ui.graphics.m0 m0Var3;
        androidx.compose.ui.text.v vVar;
        androidx.compose.ui.text.v vVar2;
        androidx.compose.ui.text.style.q qVar;
        androidx.compose.ui.text.style.q qVar2;
        androidx.compose.ui.text.u uVar;
        androidx.compose.ui.text.u uVar2;
        androidx.compose.ui.text.u uVar3;
        boolean z;
        boolean z2;
        androidx.compose.ui.text.u uVar4;
        androidx.compose.runtime.w2 w2Var;
        int i = this.e;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        boolean z3 = this.C;
        kotlin.y yVar = kotlin.y.a;
        Object obj6 = this.y;
        Object obj7 = this.z;
        Object obj8 = this.F;
        Object obj9 = this.D;
        Object obj10 = this.E;
        Object obj11 = this.B;
        Object obj12 = this.A;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                CoroutineScope coroutineScope = (CoroutineScope) obj11;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj12;
                final j5 j5Var = (j5) obj7;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = sVar.f(j5Var) | sVar.f(aVar2) | sVar.h(coroutineScope);
                    Object objQ = sVar.Q();
                    if (zF || objQ == fVar) {
                        obj3 = objQ;
                        y2 y2Var = new y2(j5Var, aVar2, coroutineScope);
                        sVar.l0(y2Var);
                        obj3 = y2Var;
                    }
                    androidx.compose.ui.m mVar = new androidx.compose.ui.m(new androidx.compose.foundation.c0(false ? 1 : 0, (kotlin.jvm.functions.a) obj3));
                    boolean zG = sVar.g(z3) | sVar.f(j5Var) | sVar.f((String) obj9) | sVar.f(aVar2) | sVar.f((String) obj10) | sVar.h(coroutineScope) | sVar.f((String) obj8);
                    final String str = (String) obj9;
                    final String str2 = (String) obj10;
                    final String str3 = (String) obj8;
                    final kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) obj12;
                    final CoroutineScope coroutineScope2 = (CoroutineScope) obj11;
                    Object objQ2 = sVar.Q();
                    if (zG || objQ2 == fVar) {
                        final boolean z4 = this.C;
                        objQ2 = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.f3
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj13) {
                                j5 j5Var2 = j5Var;
                                androidx.compose.material3.internal.p pVar4 = j5Var2.c;
                                androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj13;
                                if (z4) {
                                    x2 x2Var = new x2(1, aVar3);
                                    kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                                    a0Var.b(androidx.compose.ui.semantics.m.v, new androidx.compose.ui.semantics.a(str, x2Var));
                                    k5 k5Var = (k5) pVar4.g.getValue();
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    k5 k5Var2 = k5.z;
                                    if (k5Var == k5Var2) {
                                        a0Var.b(androidx.compose.ui.semantics.m.t, new androidx.compose.ui.semantics.a(str2, new androidx.compose.foundation.gestures.g(3, j5Var2, coroutineScope3, j5Var2)));
                                    } else if (pVar4.d().a.containsKey(k5Var2)) {
                                        a0Var.b(androidx.compose.ui.semantics.m.u, new androidx.compose.ui.semantics.a(str3, new androidx.activity.compose.f(14, j5Var2, coroutineScope3)));
                                    }
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(mVar, true, (kotlin.jvm.functions.l) objQ2);
                    kotlin.jvm.functions.p pVar4 = (kotlin.jvm.functions.p) obj6;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarA);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
                    if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
                    }
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    pVar4.invoke(sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                j5 j5Var2 = (j5) obj7;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                androidx.compose.animation.core.d dVar = (androidx.compose.animation.core.d) obj9;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.r rVarZ = androidx.compose.foundation.layout.b.z(androidx.compose.foundation.layout.i1.e(androidx.compose.ui.o.b, 1.0f), (androidx.compose.foundation.layout.u1) ((kotlin.jvm.functions.p) obj6).invoke(sVar2, 0));
                    boolean zH = sVar2.h(dVar);
                    Object objQ3 = sVar2.Q();
                    if (zH || objQ3 == fVar) {
                        objQ3 = new androidx.activity.compose.g(dVar, 24);
                        sVar2.l0(objQ3);
                    }
                    androidx.compose.ui.r rVarO = androidx.compose.ui.graphics.a0.o(androidx.compose.ui.graphics.a0.o(rVarZ, (kotlin.jvm.functions.l) objQ3), new v(j5Var2, 0));
                    kotlin.jvm.functions.p pVar5 = (kotlin.jvm.functions.p) obj10;
                    androidx.compose.runtime.internal.f fVar3 = (androidx.compose.runtime.internal.f) obj8;
                    kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) obj12;
                    CoroutineScope coroutineScope3 = (CoroutineScope) obj11;
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarO);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar4);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.g;
                    if (sVar2.S || !kotlin.jvm.internal.l.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, sVar2, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                    if (pVar5 != null) {
                        sVar2.b0(1352934765);
                        g5.a(androidx.compose.runtime.internal.k.c(2000500644, new g3(j5Var2, aVar4, coroutineScope3, this.C, androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_dismiss_description, sVar2), androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_expand_description, sVar2), androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_collapse_description, sVar2), pVar5), sVar2), sVar2, 54);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1356009965);
                        sVar2.p(false);
                    }
                    fVar3.invoke(androidx.compose.foundation.layout.x.a, sVar2, 6);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return yVar;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.text.m0 m0Var4 = (androidx.compose.ui.text.m0) obj7;
                    androidx.compose.ui.text.m0 m0Var5 = (androidx.compose.ui.text.m0) obj12;
                    float fFloatValue = ((Number) ((androidx.compose.runtime.w2) obj11).getValue()).floatValue();
                    androidx.compose.ui.text.e0 e0Var = m0Var4.a;
                    androidx.compose.ui.text.e0 e0Var2 = m0Var5.a;
                    androidx.compose.ui.text.style.o oVar = androidx.compose.ui.text.f0.d;
                    androidx.compose.ui.text.style.o oVar2 = e0Var.a;
                    androidx.compose.ui.text.style.o oVar3 = e0Var2.a;
                    boolean z5 = oVar2 instanceof androidx.compose.ui.text.style.b;
                    androidx.compose.ui.text.style.o oVar4 = androidx.compose.ui.text.style.n.a;
                    if (z5) {
                        obj4 = obj6;
                    } else {
                        obj4 = obj6;
                        if (!(oVar3 instanceof androidx.compose.ui.text.style.b)) {
                            obj5 = obj8;
                            long jS = androidx.compose.ui.graphics.a0.s(oVar2.b(), oVar3.b(), fFloatValue);
                            if (jS != 16) {
                                bVar = new androidx.compose.ui.text.style.c(jS);
                                oVar4 = bVar;
                            }
                        }
                        androidx.compose.ui.text.style.o oVar5 = oVar4;
                        androidx.compose.ui.text.font.r rVar = (androidx.compose.ui.text.font.r) androidx.compose.ui.text.f0.b(e0Var.f, e0Var2.f, fFloatValue);
                        long jC = androidx.compose.ui.text.f0.c(e0Var.b, e0Var2.b, fFloatValue);
                        kVar = e0Var.c;
                        if (kVar == null) {
                            kVar = androidx.compose.ui.text.font.k.z;
                        }
                        kVar2 = e0Var2.c;
                        if (kVar2 == null) {
                            kVar2 = androidx.compose.ui.text.font.k.z;
                        }
                        androidx.compose.ui.text.font.k kVar3 = new androidx.compose.ui.text.font.k(kotlin.collections.i0.d(com.google.firebase.b.N(fFloatValue, kVar.e, kVar2.e), 1, 1000));
                        androidx.compose.ui.text.font.i iVar = (androidx.compose.ui.text.font.i) androidx.compose.ui.text.f0.b(e0Var.d, e0Var2.d, fFloatValue);
                        androidx.compose.ui.text.font.j jVar = (androidx.compose.ui.text.font.j) androidx.compose.ui.text.f0.b(e0Var.e, e0Var2.e, fFloatValue);
                        String str4 = (String) androidx.compose.ui.text.f0.b(e0Var.g, e0Var2.g, fFloatValue);
                        long jC2 = androidx.compose.ui.text.f0.c(e0Var.h, e0Var2.h, fFloatValue);
                        aVar = e0Var.i;
                        if (aVar != null) {
                            f = aVar.a;
                        } else {
                            f = 0.0f;
                        }
                        androidx.compose.ui.text.style.a aVar5 = e0Var2.i;
                        float fM = com.google.firebase.b.M(f, aVar5 != null ? aVar5.a : 0.0f, fFloatValue);
                        pVar = e0Var.j;
                        pVar2 = androidx.compose.ui.text.style.p.c;
                        if (pVar == null) {
                            pVar = pVar2;
                        }
                        pVar3 = e0Var2.j;
                        if (pVar3 != null) {
                            pVar2 = pVar3;
                        }
                        androidx.compose.ui.text.style.p pVar6 = new androidx.compose.ui.text.style.p(com.google.firebase.b.M(pVar.a, pVar2.a, fFloatValue), com.google.firebase.b.M(pVar.b, pVar2.b, fFloatValue));
                        androidx.compose.ui.text.intl.b bVar2 = (androidx.compose.ui.text.intl.b) androidx.compose.ui.text.f0.b(e0Var.k, e0Var2.k, fFloatValue);
                        long jS2 = androidx.compose.ui.graphics.a0.s(e0Var.l, e0Var2.l, fFloatValue);
                        androidx.compose.ui.text.style.l lVar = (androidx.compose.ui.text.style.l) androidx.compose.ui.text.f0.b(e0Var.m, e0Var2.m, fFloatValue);
                        m0Var2 = e0Var.n;
                        if (m0Var2 == null) {
                            m0Var2 = new androidx.compose.ui.graphics.m0();
                        }
                        m0Var3 = e0Var2.n;
                        if (m0Var3 == null) {
                            m0Var3 = new androidx.compose.ui.graphics.m0();
                        }
                        long jS3 = androidx.compose.ui.graphics.a0.s(m0Var2.a, m0Var3.a, fFloatValue);
                        long j = m0Var2.b;
                        long j2 = m0Var3.b;
                        androidx.compose.ui.graphics.m0 m0Var6 = new androidx.compose.ui.graphics.m0(jS3, (((long) Float.floatToRawIntBits(com.google.firebase.b.M(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), fFloatValue))) << 32) | (((long) Float.floatToRawIntBits(com.google.firebase.b.M(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), fFloatValue))) & 4294967295L), com.google.firebase.b.M(m0Var2.c, m0Var3.c, fFloatValue));
                        vVar = e0Var.o;
                        androidx.compose.ui.text.v vVar3 = e0Var2.o;
                        if (vVar == null || vVar3 != null) {
                            if (vVar == null) {
                                vVar = androidx.compose.ui.text.v.a;
                            }
                            vVar2 = vVar;
                        } else {
                            vVar2 = null;
                        }
                        androidx.compose.ui.text.e0 e0Var3 = new androidx.compose.ui.text.e0(oVar5, jC, kVar3, iVar, jVar, rVar, str4, jC2, new androidx.compose.ui.text.style.a(fM), pVar6, bVar2, jS2, lVar, m0Var6, vVar2, (androidx.compose.ui.graphics.drawscope.e) androidx.compose.ui.text.f0.b(e0Var.p, e0Var2.p, fFloatValue));
                        androidx.compose.ui.text.s sVar4 = m0Var4.b;
                        androidx.compose.ui.text.s sVar5 = m0Var5.b;
                        int i2 = androidx.compose.ui.text.t.b;
                        int i3 = ((androidx.compose.ui.text.style.k) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.k(sVar4.a), new androidx.compose.ui.text.style.k(sVar5.a), fFloatValue)).a;
                        int i4 = ((androidx.compose.ui.text.style.m) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.m(sVar4.b), new androidx.compose.ui.text.style.m(sVar5.b), fFloatValue)).a;
                        long jC3 = androidx.compose.ui.text.f0.c(sVar4.c, sVar5.c, fFloatValue);
                        qVar = sVar4.d;
                        if (qVar == null) {
                            qVar = androidx.compose.ui.text.style.q.c;
                        }
                        qVar2 = sVar5.d;
                        if (qVar2 == null) {
                            qVar2 = androidx.compose.ui.text.style.q.c;
                        }
                        androidx.compose.ui.text.style.q qVar3 = new androidx.compose.ui.text.style.q(androidx.compose.ui.text.f0.c(qVar.a, qVar2.a, fFloatValue), androidx.compose.ui.text.f0.c(qVar.b, qVar2.b, fFloatValue));
                        uVar = sVar4.e;
                        uVar2 = sVar5.e;
                        if (uVar == null || uVar2 != null) {
                            uVar3 = androidx.compose.ui.text.u.c;
                            if (uVar == null) {
                                uVar = uVar3;
                            }
                            z = uVar.a;
                            if (uVar2 == null) {
                                uVar2 = uVar3;
                            }
                            z2 = uVar2.a;
                            if (z == z2) {
                                uVar4 = uVar;
                            } else {
                                uVar4 = new androidx.compose.ui.text.u(((androidx.compose.ui.text.j) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.j(uVar.b), new androidx.compose.ui.text.j(uVar2.b), fFloatValue)).a, ((Boolean) androidx.compose.ui.text.f0.b(Boolean.valueOf(z), Boolean.valueOf(z2), fFloatValue)).booleanValue());
                            }
                        } else {
                            uVar4 = null;
                        }
                        m0Var = new androidx.compose.ui.text.m0(e0Var3, new androidx.compose.ui.text.s(i3, i4, jC3, qVar3, uVar4, (androidx.compose.ui.text.style.i) androidx.compose.ui.text.f0.b(sVar4.f, sVar5.f, fFloatValue), ((androidx.compose.ui.text.style.e) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.e(sVar4.g), new androidx.compose.ui.text.style.e(sVar5.g), fFloatValue)).a, ((androidx.compose.ui.text.style.d) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.d(sVar4.h), new androidx.compose.ui.text.style.d(sVar5.h), fFloatValue)).a, (androidx.compose.ui.text.style.s) androidx.compose.ui.text.f0.b(sVar4.i, sVar5.i, fFloatValue)));
                        w2Var = (androidx.compose.runtime.w2) obj10;
                        if (z3) {
                            m0Var = androidx.compose.ui.text.m0.a(m0Var, ((androidx.compose.ui.graphics.t) w2Var.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                        }
                        androidx.compose.material3.internal.a1.b(((androidx.compose.ui.graphics.t) ((androidx.compose.runtime.w2) obj9).getValue()).a, m0Var, androidx.compose.runtime.internal.k.c(1157484991, new e0((kotlin.jvm.functions.q) obj5, (androidx.compose.material3.internal.x0) obj4), sVar3), sVar3, 384);
                    }
                    obj5 = obj8;
                    if (z5 && (oVar3 instanceof androidx.compose.ui.text.style.b)) {
                        androidx.compose.ui.text.style.b bVar3 = (androidx.compose.ui.text.style.b) oVar2;
                        androidx.compose.ui.text.style.b bVar4 = (androidx.compose.ui.text.style.b) oVar3;
                        androidx.compose.ui.graphics.p pVar7 = (androidx.compose.ui.graphics.p) androidx.compose.ui.text.f0.b(bVar3.a, bVar4.a, fFloatValue);
                        float fM2 = com.google.firebase.b.M(bVar3.b, bVar4.b, fFloatValue);
                        if (pVar7 != null) {
                            if (pVar7 instanceof androidx.compose.ui.graphics.p0) {
                                long jR = okhttp3.internal.platform.android.g.r(fM2, ((androidx.compose.ui.graphics.p0) pVar7).a);
                                if (jR != 16) {
                                    bVar = new androidx.compose.ui.text.style.c(jR);
                                }
                            } else {
                                if (!(pVar7 instanceof androidx.compose.ui.graphics.l0)) {
                                    coil3.g.a();
                                    return null;
                                }
                                bVar = new androidx.compose.ui.text.style.b((androidx.compose.ui.graphics.l0) pVar7, fM2);
                            }
                            oVar4 = bVar;
                        }
                    } else {
                        oVar4 = (androidx.compose.ui.text.style.o) androidx.compose.ui.text.f0.b(oVar2, oVar3, fFloatValue);
                    }
                    androidx.compose.ui.text.style.o oVar6 = oVar4;
                    androidx.compose.ui.text.font.r rVar2 = (androidx.compose.ui.text.font.r) androidx.compose.ui.text.f0.b(e0Var.f, e0Var2.f, fFloatValue);
                    long jC4 = androidx.compose.ui.text.f0.c(e0Var.b, e0Var2.b, fFloatValue);
                    kVar = e0Var.c;
                    if (kVar == null) {
                        kVar = androidx.compose.ui.text.font.k.z;
                    }
                    kVar2 = e0Var2.c;
                    if (kVar2 == null) {
                        kVar2 = androidx.compose.ui.text.font.k.z;
                    }
                    androidx.compose.ui.text.font.k kVar4 = new androidx.compose.ui.text.font.k(kotlin.collections.i0.d(com.google.firebase.b.N(fFloatValue, kVar.e, kVar2.e), 1, 1000));
                    androidx.compose.ui.text.font.i iVar2 = (androidx.compose.ui.text.font.i) androidx.compose.ui.text.f0.b(e0Var.d, e0Var2.d, fFloatValue);
                    androidx.compose.ui.text.font.j jVar2 = (androidx.compose.ui.text.font.j) androidx.compose.ui.text.f0.b(e0Var.e, e0Var2.e, fFloatValue);
                    String str5 = (String) androidx.compose.ui.text.f0.b(e0Var.g, e0Var2.g, fFloatValue);
                    long jC5 = androidx.compose.ui.text.f0.c(e0Var.h, e0Var2.h, fFloatValue);
                    aVar = e0Var.i;
                    if (aVar != null) {
                        f = aVar.a;
                    } else {
                        f = 0.0f;
                    }
                    androidx.compose.ui.text.style.a aVar6 = e0Var2.i;
                    float fM3 = com.google.firebase.b.M(f, aVar6 != null ? aVar6.a : 0.0f, fFloatValue);
                    pVar = e0Var.j;
                    pVar2 = androidx.compose.ui.text.style.p.c;
                    if (pVar == null) {
                        pVar = pVar2;
                    }
                    pVar3 = e0Var2.j;
                    if (pVar3 != null) {
                        pVar2 = pVar3;
                    }
                    androidx.compose.ui.text.style.p pVar8 = new androidx.compose.ui.text.style.p(com.google.firebase.b.M(pVar.a, pVar2.a, fFloatValue), com.google.firebase.b.M(pVar.b, pVar2.b, fFloatValue));
                    androidx.compose.ui.text.intl.b bVar5 = (androidx.compose.ui.text.intl.b) androidx.compose.ui.text.f0.b(e0Var.k, e0Var2.k, fFloatValue);
                    long jS4 = androidx.compose.ui.graphics.a0.s(e0Var.l, e0Var2.l, fFloatValue);
                    androidx.compose.ui.text.style.l lVar2 = (androidx.compose.ui.text.style.l) androidx.compose.ui.text.f0.b(e0Var.m, e0Var2.m, fFloatValue);
                    m0Var2 = e0Var.n;
                    if (m0Var2 == null) {
                        m0Var2 = new androidx.compose.ui.graphics.m0();
                    }
                    m0Var3 = e0Var2.n;
                    if (m0Var3 == null) {
                        m0Var3 = new androidx.compose.ui.graphics.m0();
                    }
                    long jS5 = androidx.compose.ui.graphics.a0.s(m0Var2.a, m0Var3.a, fFloatValue);
                    long j3 = m0Var2.b;
                    long j4 = m0Var3.b;
                    androidx.compose.ui.graphics.m0 m0Var7 = new androidx.compose.ui.graphics.m0(jS5, (((long) Float.floatToRawIntBits(com.google.firebase.b.M(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 >> 32)), fFloatValue))) << 32) | (((long) Float.floatToRawIntBits(com.google.firebase.b.M(Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 & 4294967295L)), fFloatValue))) & 4294967295L), com.google.firebase.b.M(m0Var2.c, m0Var3.c, fFloatValue));
                    vVar = e0Var.o;
                    androidx.compose.ui.text.v vVar4 = e0Var2.o;
                    if (vVar == null) {
                        if (vVar == null) {
                            vVar = androidx.compose.ui.text.v.a;
                        }
                        vVar2 = vVar;
                    } else {
                        if (vVar == null) {
                            vVar = androidx.compose.ui.text.v.a;
                        }
                        vVar2 = vVar;
                    }
                    androidx.compose.ui.text.e0 e0Var4 = new androidx.compose.ui.text.e0(oVar6, jC4, kVar4, iVar2, jVar2, rVar2, str5, jC5, new androidx.compose.ui.text.style.a(fM3), pVar8, bVar5, jS4, lVar2, m0Var7, vVar2, (androidx.compose.ui.graphics.drawscope.e) androidx.compose.ui.text.f0.b(e0Var.p, e0Var2.p, fFloatValue));
                    androidx.compose.ui.text.s sVar6 = m0Var4.b;
                    androidx.compose.ui.text.s sVar7 = m0Var5.b;
                    int i5 = androidx.compose.ui.text.t.b;
                    int i6 = ((androidx.compose.ui.text.style.k) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.k(sVar6.a), new androidx.compose.ui.text.style.k(sVar7.a), fFloatValue)).a;
                    int i7 = ((androidx.compose.ui.text.style.m) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.m(sVar6.b), new androidx.compose.ui.text.style.m(sVar7.b), fFloatValue)).a;
                    long jC6 = androidx.compose.ui.text.f0.c(sVar6.c, sVar7.c, fFloatValue);
                    qVar = sVar6.d;
                    if (qVar == null) {
                        qVar = androidx.compose.ui.text.style.q.c;
                    }
                    qVar2 = sVar7.d;
                    if (qVar2 == null) {
                        qVar2 = androidx.compose.ui.text.style.q.c;
                    }
                    androidx.compose.ui.text.style.q qVar4 = new androidx.compose.ui.text.style.q(androidx.compose.ui.text.f0.c(qVar.a, qVar2.a, fFloatValue), androidx.compose.ui.text.f0.c(qVar.b, qVar2.b, fFloatValue));
                    uVar = sVar6.e;
                    uVar2 = sVar7.e;
                    if (uVar == null) {
                        uVar3 = androidx.compose.ui.text.u.c;
                        if (uVar == null) {
                            uVar = uVar3;
                        }
                        z = uVar.a;
                        if (uVar2 == null) {
                            uVar2 = uVar3;
                        }
                        z2 = uVar2.a;
                        if (z == z2) {
                            uVar4 = uVar;
                        } else {
                            uVar4 = new androidx.compose.ui.text.u(((androidx.compose.ui.text.j) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.j(uVar.b), new androidx.compose.ui.text.j(uVar2.b), fFloatValue)).a, ((Boolean) androidx.compose.ui.text.f0.b(Boolean.valueOf(z), Boolean.valueOf(z2), fFloatValue)).booleanValue());
                        }
                    } else {
                        uVar3 = androidx.compose.ui.text.u.c;
                        if (uVar == null) {
                            uVar = uVar3;
                        }
                        z = uVar.a;
                        if (uVar2 == null) {
                            uVar2 = uVar3;
                        }
                        z2 = uVar2.a;
                        if (z == z2) {
                            uVar4 = uVar;
                        } else {
                            uVar4 = new androidx.compose.ui.text.u(((androidx.compose.ui.text.j) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.j(uVar.b), new androidx.compose.ui.text.j(uVar2.b), fFloatValue)).a, ((Boolean) androidx.compose.ui.text.f0.b(Boolean.valueOf(z), Boolean.valueOf(z2), fFloatValue)).booleanValue());
                        }
                    }
                    m0Var = new androidx.compose.ui.text.m0(e0Var4, new androidx.compose.ui.text.s(i6, i7, jC6, qVar4, uVar4, (androidx.compose.ui.text.style.i) androidx.compose.ui.text.f0.b(sVar6.f, sVar7.f, fFloatValue), ((androidx.compose.ui.text.style.e) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.e(sVar6.g), new androidx.compose.ui.text.style.e(sVar7.g), fFloatValue)).a, ((androidx.compose.ui.text.style.d) androidx.compose.ui.text.f0.b(new androidx.compose.ui.text.style.d(sVar6.h), new androidx.compose.ui.text.style.d(sVar7.h), fFloatValue)).a, (androidx.compose.ui.text.style.s) androidx.compose.ui.text.f0.b(sVar6.i, sVar7.i, fFloatValue)));
                    w2Var = (androidx.compose.runtime.w2) obj10;
                    if (z3) {
                        m0Var = androidx.compose.ui.text.m0.a(m0Var, ((androidx.compose.ui.graphics.t) w2Var.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                    }
                    androidx.compose.material3.internal.a1.b(((androidx.compose.ui.graphics.t) ((androidx.compose.runtime.w2) obj9).getValue()).a, m0Var, androidx.compose.runtime.internal.k.c(1157484991, new e0((kotlin.jvm.functions.q) obj5, (androidx.compose.material3.internal.x0) obj4), sVar3), sVar3, 384);
                } else {
                    sVar3.W();
                }
                return yVar;
        }
    }

    public g3(androidx.compose.ui.text.m0 m0Var, androidx.compose.ui.text.m0 m0Var2, androidx.compose.animation.core.a2 a2Var, androidx.compose.animation.core.a2 a2Var2, boolean z, androidx.compose.animation.core.a2 a2Var3, kotlin.jvm.functions.q qVar, androidx.compose.material3.internal.x0 x0Var) {
        this.z = m0Var;
        this.A = m0Var2;
        this.B = a2Var;
        this.D = a2Var2;
        this.C = z;
        this.E = a2Var3;
        this.F = qVar;
        this.y = x0Var;
    }

    public g3(kotlin.jvm.functions.p pVar, androidx.compose.animation.core.d dVar, j5 j5Var, kotlin.jvm.functions.p pVar2, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, CoroutineScope coroutineScope, boolean z) {
        this.y = pVar;
        this.D = dVar;
        this.z = j5Var;
        this.E = pVar2;
        this.F = fVar;
        this.A = aVar;
        this.B = coroutineScope;
        this.C = z;
    }
}
