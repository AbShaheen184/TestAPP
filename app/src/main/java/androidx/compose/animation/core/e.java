package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final o a = new o(Float.POSITIVE_INFINITY);
    public static final p b = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final q c = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final r d = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final o e = new o(Float.NEGATIVE_INFINITY);
    public static final p f = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final q g = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final r h = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] i = new float[91];
    public static final l2 j = new l2(new n1(3), new n1(20));
    public static final l2 k = new l2(new n1(4), new n1(5));
    public static final l2 l = new l2(new n1(6), new n1(7));
    public static final l2 m = new l2(new n1(8), new n1(9));
    public static final l2 n = new l2(new n1(10), new n1(11));
    public static final l2 o = new l2(new n1(12), new n1(13));
    public static final l2 p = new l2(new n1(14), new n1(15));
    public static final l2 q = new l2(new n1(16), new n1(17));
    public static final l2 r = new l2(new n1(18), new n1(19));

    public static d a(float f2) {
        return new d(Float.valueOf(f2), j, Float.valueOf(0.01f), 8);
    }

    public static n b(int i2, float f2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new n(j, Float.valueOf(0.0f), new o(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f2, float f3, float f4, m mVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.i iVar) {
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        l2 l2Var = j;
        kotlin.jvm.functions.l lVar = l2Var.a;
        s sVarC = (s) lVar.invoke(f7);
        if (sVarC == null) {
            sVarC = ((s) lVar.invoke(f5)).c();
        }
        s sVar = sVarC;
        Object objD = d(new n(l2Var, f5, sVar, 56), new t1(mVar, l2Var, f5, f6, sVar), Long.MIN_VALUE, new androidx.activity.compose.g(pVar, 1), iVar);
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objD != aVar) {
            objD = yVar;
        }
        return objD == aVar ? objD : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object d(n nVar, i iVar, long j2, final kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        s1 s1Var;
        final kotlin.jvm.internal.z zVar;
        final n nVar2;
        n nVar3;
        kotlin.jvm.internal.z zVar2;
        Object objA;
        kotlin.jvm.functions.l lVar2;
        l lVar3;
        l lVar4;
        Object objA2;
        final i iVar2 = iVar;
        androidx.compose.ui.platform.v1 v1Var = androidx.compose.ui.platform.v1.e;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i2 = s1Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1Var.C = i2 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(cVar);
            }
        } else {
            s1Var = new s1(cVar);
        }
        s1 s1Var2 = s1Var;
        Object obj = s1Var2.B;
        int i3 = s1Var2.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i3 == 0) {
            kotlin.a.e(obj);
            final Object objF = iVar2.f(0L);
            final s sVarD = iVar2.d(0L);
            zVar = new kotlin.jvm.internal.z();
            if (j2 == Long.MIN_VALUE) {
                try {
                    final float fJ = j(s1Var2.getContext());
                    nVar2 = nVar;
                    try {
                        kotlin.jvm.functions.l lVar5 = new kotlin.jvm.functions.l() { // from class: androidx.compose.animation.core.o1
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                i iVar3 = iVar2;
                                l2 l2VarC = iVar3.c();
                                Object objG = iVar3.g();
                                n nVar4 = nVar2;
                                l lVar6 = new l(objF, l2VarC, sVarD, jLongValue, objG, jLongValue, new p1(nVar4, 1));
                                e.i(lVar6, jLongValue, fJ, iVar3, nVar4, lVar);
                                zVar.e = lVar6;
                                return kotlin.y.a;
                            }
                        };
                        zVar2 = zVar;
                        try {
                            s1Var2.e = nVar2;
                            s1Var2.y = iVar2;
                            s1Var2.z = lVar;
                            s1Var2.A = zVar2;
                            s1Var2.C = 1;
                            if (!iVar2.a()) {
                                objA = androidx.compose.runtime.t.o(s1Var2.getContext()).a(new r1(0, lVar5), s1Var2);
                            } else {
                                if (s1Var2.getContext().get(v1Var) != null) {
                                    throw new ClassCastException();
                                }
                                objA = androidx.compose.runtime.t.o(s1Var2.getContext()).a(lVar5, s1Var2);
                            }
                            if (objA != aVar) {
                                nVar3 = nVar2;
                                lVar2 = lVar;
                                zVar = zVar2;
                            }
                            return aVar;
                        } catch (CancellationException e2) {
                            e = e2;
                            nVar3 = nVar2;
                            zVar = zVar2;
                            lVar3 = (l) zVar.e;
                            if (lVar3 != null) {
                                lVar3.i.setValue(Boolean.FALSE);
                            }
                            lVar4 = (l) zVar.e;
                            if (lVar4 != null) {
                                nVar3.C = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        nVar3 = nVar2;
                        lVar3 = (l) zVar.e;
                        if (lVar3 != null) {
                            lVar3.i.setValue(Boolean.FALSE);
                        }
                        lVar4 = (l) zVar.e;
                        if (lVar4 != null && lVar4.g == nVar3.A) {
                            nVar3.C = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    nVar2 = nVar;
                }
            } else {
                zVar2 = zVar;
                try {
                    l lVar6 = new l(objF, iVar2.c(), sVarD, j2, iVar2.g(), j2, new p1(nVar, 0));
                    i(lVar6, j2, j(s1Var2.getContext()), iVar2, nVar, lVar);
                    zVar2.e = lVar6;
                    nVar3 = nVar;
                    iVar2 = iVar;
                    lVar2 = lVar;
                    zVar = zVar2;
                } catch (CancellationException e5) {
                    e = e5;
                    nVar3 = nVar;
                    zVar = zVar2;
                    lVar3 = (l) zVar.e;
                    if (lVar3 != null) {
                        lVar3.i.setValue(Boolean.FALSE);
                    }
                    lVar4 = (l) zVar.e;
                    if (lVar4 != null) {
                        nVar3.C = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = s1Var2.A;
            lVar2 = s1Var2.z;
            iVar2 = s1Var2.y;
            nVar3 = s1Var2.e;
            try {
                kotlin.a.e(obj);
            } catch (CancellationException e6) {
                e = e6;
                lVar3 = (l) zVar.e;
                if (lVar3 != null) {
                    lVar3.i.setValue(Boolean.FALSE);
                }
                lVar4 = (l) zVar.e;
                if (lVar4 != null) {
                    nVar3.C = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = zVar.e;
            obj2.getClass();
            if (!((Boolean) ((l) obj2).i.getValue()).booleanValue()) {
                return kotlin.y.a;
            }
            final float fJ2 = j(s1Var2.getContext());
            final kotlin.jvm.internal.z zVar3 = zVar;
            final kotlin.jvm.functions.l lVar7 = lVar2;
            final i iVar3 = iVar2;
            final n nVar4 = nVar3;
            try {
                kotlin.jvm.functions.l lVar8 = new kotlin.jvm.functions.l() { // from class: androidx.compose.animation.core.q1
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = zVar3.e;
                        obj4.getClass();
                        e.i((l) obj4, jLongValue, fJ2, iVar3, nVar4, lVar7);
                        return kotlin.y.a;
                    }
                };
                zVar = zVar3;
                iVar2 = iVar3;
                nVar3 = nVar4;
                lVar2 = lVar7;
                s1Var2.e = nVar3;
                s1Var2.y = iVar2;
                s1Var2.z = lVar2;
                s1Var2.A = zVar;
                s1Var2.C = 2;
                if (!iVar2.a()) {
                    objA2 = androidx.compose.runtime.t.o(s1Var2.getContext()).a(new r1(0, lVar8), s1Var2);
                } else {
                    if (s1Var2.getContext().get(v1Var) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = androidx.compose.runtime.t.o(s1Var2.getContext()).a(lVar8, s1Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                zVar = zVar3;
                nVar3 = nVar4;
                lVar3 = (l) zVar.e;
                if (lVar3 != null) {
                    lVar3.i.setValue(Boolean.FALSE);
                }
                lVar4 = (l) zVar.e;
                if (lVar4 != null) {
                    nVar3.C = false;
                }
                throw e;
            }
        } while (objA2 != aVar);
        return aVar;
    }

    public static final h0 e(k0 k0Var, float f2, float f3, f0 f0Var, androidx.compose.runtime.s sVar) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        Object objQ = sVar.Q();
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        if (objQ == fVar) {
            objQ = new h0(k0Var, fValueOf, fValueOf2, f0Var);
            sVar.l0(objQ);
        }
        h0 h0Var = (h0) objQ;
        boolean zH = sVar.h(f0Var);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == fVar) {
            objQ2 = new l0(fValueOf, h0Var, fValueOf2, f0Var);
            sVar.l0(objQ2);
        }
        androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ2, sVar);
        boolean zH2 = sVar.h(k0Var);
        Object objQ3 = sVar.Q();
        if (zH2 || objQ3 == fVar) {
            objQ3 = new androidx.activity.compose.h(2, k0Var, h0Var);
            sVar.l0(objQ3);
        }
        androidx.compose.runtime.l0.b(h0Var, (kotlin.jvm.functions.l) objQ3, sVar);
        return h0Var;
    }

    public static final Object f(n nVar, Float f2, b0 b0Var, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object objD = d(nVar, new t1(b0Var, nVar.e, nVar.y.getValue(), f2, nVar.z), nVar.A, lVar, iVar);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : kotlin.y.a;
    }

    public static final s g(s sVar) {
        s sVarC = sVar.c();
        int iB = sVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            sVarC.e(i2, sVar.a(i2));
        }
        return sVarC;
    }

    public static n h(n nVar, float f2) {
        float f3 = ((o) nVar.z).a;
        return new n(nVar.e, Float.valueOf(f2), new o(f3), nVar.A, nVar.B, nVar.C);
    }

    public static final void i(l lVar, long j2, float f2, i iVar, n nVar, kotlin.jvm.functions.l lVar2) {
        long jB = f2 == 0.0f ? iVar.b() : (long) ((j2 - lVar.c) / f2);
        lVar.g = j2;
        lVar.e.setValue(iVar.f(jB));
        lVar.f = iVar.d(jB);
        if (iVar.e(jB)) {
            lVar.h = lVar.g;
            lVar.i.setValue(Boolean.FALSE);
        }
        p(lVar, nVar);
        lVar2.invoke(lVar);
    }

    public static final float j(kotlin.coroutines.j jVar) {
        androidx.compose.ui.t tVar = (androidx.compose.ui.t) jVar.get(androidx.compose.ui.c.M);
        float fG = tVar != null ? tVar.g() : 1.0f;
        if (fG >= 0.0f) {
            return fG;
        }
        v0.b("negative scale factor");
        return fG;
    }

    public static f0 k(y yVar) {
        return new f0(yVar, 0);
    }

    public static final k0 l(androidx.compose.runtime.s sVar) {
        Object objQ = sVar.Q();
        if (objQ == androidx.compose.runtime.n.a) {
            objQ = new k0();
            sVar.l0(objQ);
        }
        k0 k0Var = (k0) objQ;
        k0Var.a(0, sVar);
        return k0Var;
    }

    public static i1 m() {
        return new i1(0);
    }

    public static k1 n(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new k1(f2, f3, obj);
    }

    public static k2 o(int i2, int i3, z zVar) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            zVar = a0.a;
        }
        return new k2(i2, i4, zVar);
    }

    public static final void p(l lVar, n nVar) {
        nVar.y.setValue(lVar.e.getValue());
        s sVar = nVar.z;
        s sVar2 = lVar.f;
        int iB = sVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            sVar.e(i2, sVar2.a(i2));
        }
        nVar.B = lVar.h;
        nVar.A = lVar.g;
        nVar.C = ((Boolean) lVar.i.getValue()).booleanValue();
    }
}
