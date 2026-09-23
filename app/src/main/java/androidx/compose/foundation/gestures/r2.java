package androidx.compose.foundation.gestures;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {
    public l2 a;
    public androidx.compose.foundation.n b;
    public l c;
    public o1 d;
    public boolean e;
    public androidx.compose.ui.input.nestedscroll.d f;
    public final k2 g;
    public final f2 h;
    public boolean i;
    public int j = 1;
    public t1 k = c2.b;
    public final q2 l = new q2(this);
    public final androidx.activity.compose.g m = new androidx.activity.compose.g(this, 6);

    public r2(l2 l2Var, androidx.compose.foundation.n nVar, l lVar, o1 o1Var, boolean z, androidx.compose.ui.input.nestedscroll.d dVar, k2 k2Var, f2 f2Var) {
        this.a = l2Var;
        this.b = nVar;
        this.c = lVar;
        this.d = o1Var;
        this.e = z;
        this.f = dVar;
        this.g = k2Var;
        this.h = f2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        n2 n2Var;
        r2 r2Var;
        Throwable th;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof n2) {
            n2Var = (n2) cVar;
            int i = n2Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2Var.A = i - Integer.MIN_VALUE;
            } else {
                n2Var = new n2(this, cVar);
            }
        } else {
            n2Var = new n2(this, cVar);
        }
        Object obj = n2Var.y;
        int i2 = n2Var.A;
        if (i2 != 0) {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yVar = n2Var.e;
            try {
                kotlin.a.e(obj);
                r2Var = this;
                r2Var.i = false;
                return new androidx.compose.ui.unit.q(yVar.e);
            } catch (Throwable th2) {
                th = th2;
                r2Var = this;
                r2Var.i = false;
                throw th;
            }
        }
        kotlin.a.e(obj);
        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        yVar2.e = j;
        this.i = true;
        try {
            androidx.compose.foundation.j1 j1Var = androidx.compose.foundation.j1.e;
            r2Var = this;
            try {
                p2 p2Var = new p2(r2Var, yVar2, j, null);
                n2Var.e = yVar2;
                n2Var.A = 1;
                Object objF = f(j1Var, p2Var, n2Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objF == aVar) {
                    return aVar;
                }
                yVar = yVar2;
                r2Var.i = false;
                return new androidx.compose.ui.unit.q(yVar.e);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                r2Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r2Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object b(long j, boolean z, kotlin.coroutines.jvm.internal.i iVar) {
        int i;
        long jA;
        androidx.compose.foundation.n nVar;
        kotlin.coroutines.intrinsics.a aVar;
        Object objInvokeSuspend;
        kotlin.y yVar = kotlin.y.a;
        if (z) {
            l lVar = this.c;
            w1 w1Var = c2.a;
            if (!(lVar instanceof l)) {
                if (this.d == o1.y) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = androidx.compose.ui.unit.q.a(j, 0.0f, 0.0f, i);
                com.app.mlounge.ui.screens.player.y0 y0Var = new com.app.mlounge.ui.screens.player.y0(this, null);
                nVar = this.b;
                aVar = kotlin.coroutines.intrinsics.a.e;
                if (nVar == null && (this.a.d() || this.a.b())) {
                    Object objB = nVar.b(jA, y0Var, iVar);
                    if (objB == aVar) {
                        return objB;
                    }
                } else {
                    com.app.mlounge.ui.screens.player.y0 y0Var2 = new com.app.mlounge.ui.screens.player.y0(this, iVar);
                    y0Var2.B = jA;
                    objInvokeSuspend = y0Var2.invokeSuspend(yVar);
                    if (objInvokeSuspend == aVar) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.d == o1.y) {
                i = 1;
            } else {
                i = 2;
            }
            jA = androidx.compose.ui.unit.q.a(j, 0.0f, 0.0f, i);
            com.app.mlounge.ui.screens.player.y0 y0Var3 = new com.app.mlounge.ui.screens.player.y0(this, null);
            nVar = this.b;
            aVar = kotlin.coroutines.intrinsics.a.e;
            if (nVar == null) {
                com.app.mlounge.ui.screens.player.y0 y0Var4 = new com.app.mlounge.ui.screens.player.y0(this, iVar);
                y0Var4.B = jA;
                objInvokeSuspend = y0Var4.invokeSuspend(yVar);
                if (objInvokeSuspend == aVar) {
                    return objInvokeSuspend;
                }
            } else {
                com.app.mlounge.ui.screens.player.y0 y0Var5 = new com.app.mlounge.ui.screens.player.y0(this, iVar);
                y0Var5.B = jA;
                objInvokeSuspend = y0Var5.invokeSuspend(yVar);
                if (objInvokeSuspend == aVar) {
                    return objInvokeSuspend;
                }
            }
        }
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.b] */
    public final long c(t1 t1Var, long j, int i) {
        int i2;
        androidx.compose.ui.input.nestedscroll.i iVar;
        androidx.compose.ui.input.nestedscroll.i iVar2;
        long j2;
        long jP0;
        androidx.compose.ui.node.z1 z1Var;
        androidx.compose.ui.node.a1 a1Var;
        ?? E;
        androidx.compose.ui.node.z1 z1Var2;
        androidx.compose.ui.node.a1 a1Var2;
        ?? E2;
        androidx.compose.ui.input.nestedscroll.i iVar3 = this.f.a;
        int i3 = 262144;
        int i4 = 1;
        Object obj = null;
        if (iVar3 == null || !iVar3.K) {
            i2 = 262144;
            iVar = null;
        } else {
            if (!iVar3.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar = iVar3.e.B;
            androidx.compose.ui.node.f0 f0VarV = androidx.compose.ui.node.l.v(iVar3);
            loop0: while (true) {
                if (f0VarV == null) {
                    i2 = i3;
                    z1Var2 = null;
                    break;
                }
                if ((((androidx.compose.ui.q) f0VarV.d0.g).A & i3) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & i3) != 0) {
                            ?? bVar = 0;
                            ?? r13 = qVar;
                            while (r13 != 0) {
                                if (r13 instanceof androidx.compose.ui.node.z1) {
                                    z1Var2 = (androidx.compose.ui.node.z1) r13;
                                    i2 = i3;
                                    if (kotlin.jvm.internal.l.a(iVar3.i(), z1Var2.i()) && androidx.compose.ui.input.nestedscroll.i.class == z1Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                    if ((r13.z & i2) != 0 && (r13 instanceof androidx.compose.ui.node.k)) {
                                        androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.k) r13).M;
                                        int i5 = 0;
                                        while (qVar2 != null) {
                                            if ((qVar2.z & i2) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    E2 = r13;
                                                    bVar = bVar;
                                                    bVar = bVar;
                                                    E2 = qVar2;
                                                } else {
                                                    if (bVar == 0) {
                                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (E2 != 0) {
                                                        bVar.b(E2);
                                                        E2 = 0;
                                                    }
                                                    bVar.b(qVar2);
                                                }
                                            } else {
                                                E2 = r13;
                                                bVar = bVar;
                                            }
                                            qVar2 = qVar2.C;
                                            E2 = E2;
                                            bVar = bVar;
                                        }
                                        if (i5 == 1) {
                                            E2 = r13;
                                            bVar = bVar;
                                        }
                                    }
                                    i3 = i2;
                                    r13 = E2;
                                    bVar = bVar;
                                }
                                E2 = r13;
                                bVar = bVar;
                                E2 = androidx.compose.ui.node.l.e(bVar);
                                i3 = i2;
                                r13 = E2;
                                bVar = bVar;
                            }
                        }
                        qVar = qVar.B;
                        i3 = i3;
                    }
                }
                int i6 = i3;
                f0VarV = f0VarV.v();
                qVar = (f0VarV == null || (a1Var2 = f0VarV.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var2.f;
                i3 = i6;
            }
            iVar = (androidx.compose.ui.input.nestedscroll.i) z1Var2;
        }
        long J = iVar != null ? iVar.J(i, j) : 0L;
        long jD = androidx.compose.ui.geometry.b.d(j, J);
        long jE = e(h(t1Var.a(g(e(this.d == o1.y ? androidx.compose.ui.geometry.b.a(jD, 0.0f, 1) : androidx.compose.ui.geometry.b.a(jD, 0.0f, 2))))));
        k2 k2Var = this.g;
        if (k2Var.K) {
            ViewTreeObserver viewTreeObserver = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w(k2Var)).getViewTreeObserver();
            try {
                if (androidx.compose.ui.platform.u.m1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    androidx.compose.ui.platform.u.m1 = declaredMethod;
                }
                Method method = androidx.compose.ui.platform.u.m1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = androidx.compose.ui.geometry.b.d(jD, jE);
        androidx.compose.ui.input.nestedscroll.i iVar4 = this.f.a;
        if (iVar4 == null || !iVar4.K) {
            iVar2 = null;
        } else {
            if (!iVar4.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar3 = iVar4.e.B;
            androidx.compose.ui.node.f0 f0VarV2 = androidx.compose.ui.node.l.v(iVar4);
            loop3: while (true) {
                if (f0VarV2 == null) {
                    z1Var = null;
                    break;
                }
                if ((((androidx.compose.ui.q) f0VarV2.d0.g).A & i2) != 0) {
                    while (qVar3 != null) {
                        if ((qVar3.z & i2) != 0) {
                            ?? r7 = qVar3;
                            ?? bVar2 = obj;
                            while (r7 != 0) {
                                if (r7 instanceof androidx.compose.ui.node.z1) {
                                    androidx.compose.ui.node.z1 z1Var3 = (androidx.compose.ui.node.z1) r7;
                                    if (kotlin.jvm.internal.l.a(iVar4.i(), z1Var3.i()) && androidx.compose.ui.input.nestedscroll.i.class == z1Var3.getClass()) {
                                        z1Var = z1Var3;
                                        break loop3;
                                    }
                                } else {
                                    if ((r7.z & i2) != 0 && (r7 instanceof androidx.compose.ui.node.k)) {
                                        androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.k) r7).M;
                                        int i7 = 0;
                                        while (qVar4 != null) {
                                            if ((qVar4.z & i2) == 0) {
                                                E = r7;
                                                bVar2 = bVar2;
                                                E = E;
                                            } else {
                                                i7++;
                                                if (i7 == i4) {
                                                    E = r7;
                                                    bVar2 = bVar2;
                                                    E = E;
                                                    E = qVar4;
                                                    E = r7;
                                                    bVar2 = bVar2;
                                                    E = E;
                                                } else {
                                                    bVar2 = bVar2 == 0 ? new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]) : bVar2;
                                                    if (E != 0) {
                                                        bVar2.b(E);
                                                        E = 0;
                                                    }
                                                    bVar2.b(qVar4);
                                                }
                                            }
                                            qVar4 = qVar4.C;
                                            i4 = 1;
                                            E = E;
                                            bVar2 = bVar2;
                                        }
                                        if (i7 == i4) {
                                            E = r7;
                                            bVar2 = bVar2;
                                        }
                                    }
                                    r7 = E;
                                    bVar2 = bVar2;
                                }
                                E = r7;
                                bVar2 = bVar2;
                                E = androidx.compose.ui.node.l.e(bVar2);
                                r7 = E;
                                bVar2 = bVar2;
                            }
                        }
                        qVar3 = qVar3.B;
                        obj = null;
                    }
                }
                f0VarV2 = f0VarV2.v();
                qVar3 = (f0VarV2 == null || (a1Var = f0VarV2.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
                obj = null;
            }
            iVar2 = (androidx.compose.ui.input.nestedscroll.i) z1Var;
        }
        if (iVar2 != null) {
            jP0 = iVar2.p0(jE, jD2, i);
            j2 = jE;
        } else {
            j2 = jE;
            jP0 = 0;
        }
        return androidx.compose.ui.geometry.b.e(androidx.compose.ui.geometry.b.e(J, j2), jP0);
    }

    public final float d(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long e(long j) {
        return this.e ? androidx.compose.ui.geometry.b.f(-1.0f, j) : j;
    }

    public final Object f(androidx.compose.foundation.j1 j1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objC = this.a.c(j1Var, new androidx.compose.animation.b0(this, pVar, (kotlin.coroutines.d) null, 9), cVar);
        return objC == kotlin.coroutines.intrinsics.a.e ? objC : kotlin.y.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == o1.y ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == o1.y) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        o1 o1Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (o1Var == o1.e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (o1Var == o1.y) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
