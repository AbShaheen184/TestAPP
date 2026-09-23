package androidx.compose.ui.node;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    public static final androidx.collection.f0 a;

    static {
        androidx.collection.f0 f0Var = androidx.collection.t0.a;
        a = new androidx.collection.f0();
    }

    public static final void a(androidx.compose.ui.q qVar, int i, int i2) {
        if (!(qVar instanceof k)) {
            b(qVar, i & qVar.z, i2);
            return;
        }
        k kVar = (k) qVar;
        int i3 = kVar.L;
        b(qVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (androidx.compose.ui.q qVar2 = kVar.M; qVar2 != null; qVar2 = qVar2.C) {
            a(qVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(androidx.compose.ui.q qVar, int i, int i2) {
        if (i2 != 0 || qVar.B0()) {
            if ((i & 2) != 0 && (qVar instanceof w)) {
                l.l((w) qVar);
                if (i2 == 2) {
                    l.t(qVar, 2).g1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                l.v(qVar).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                l.v(qVar).W(false);
            }
            if ((i & LibretroCore.SCREEN_WIDTH) != 0 && (qVar instanceof o)) {
                if (i2 == 1) {
                    f0 f0VarV = l.v(qVar);
                    f0VarV.c0(f0VarV.n0 + 1);
                } else if (i2 == 2) {
                    f0 f0VarV2 = l.v(qVar);
                    f0VarV2.c0(f0VarV2.n0 - 1);
                }
                if (i2 != 2) {
                    f0 f0VarV3 = l.v(qVar);
                    if (f0VarV3.n0 != 0 && !f0VarV3.q() && !f0VarV3.r() && !f0VarV3.m0) {
                        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(f0VarV3);
                        androidx.compose.foundation.text.input.internal.o oVar = uVar.u0.e;
                        oVar.getClass();
                        if (f0VarV3.n0 > 0) {
                            ((androidx.compose.runtime.collection.b) oVar.y).b(f0VarV3);
                            f0VarV3.m0 = true;
                        }
                        uVar.H(null);
                    }
                }
            }
            if ((i & 4) != 0 && (qVar instanceof n)) {
                l.k((n) qVar);
            }
            if ((i & 8) != 0 && (qVar instanceof u1)) {
                l.v(qVar).P = true;
            }
            if ((i & 64) != 0 && (qVar instanceof p1)) {
                j0 j0Var = l.v((p1) qVar).e0;
                j0Var.p.N = true;
                r0 r0Var = j0Var.q;
                if (r0Var != null) {
                    r0Var.T = true;
                }
            }
            if ((i & 2048) != 0 && (qVar instanceof androidx.compose.ui.focus.w)) {
                androidx.compose.ui.focus.w wVar = (androidx.compose.ui.focus.w) qVar;
                c.b = null;
                wVar.u(c.a);
                if (c.b != null) {
                    androidx.compose.ui.q qVar2 = (androidx.compose.ui.q) wVar;
                    if (!qVar2.e.K) {
                        androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
                    }
                    androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                    androidx.compose.ui.q qVar3 = qVar2.e;
                    androidx.compose.ui.q qVar4 = qVar3.C;
                    if (qVar4 == null) {
                        l.b(bVar, qVar3);
                    } else {
                        bVar.b(qVar4);
                    }
                    while (true) {
                        int i3 = bVar.z;
                        if (i3 == 0) {
                            break;
                        }
                        androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar.k(i3 - 1);
                        if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                            l.b(bVar, qVarE);
                        } else {
                            while (qVarE != null) {
                                if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                    androidx.compose.runtime.collection.b bVar2 = null;
                                    while (qVarE != null) {
                                        if (qVarE instanceof androidx.compose.ui.focus.e0) {
                                            androidx.compose.ui.focus.e0 e0Var = (androidx.compose.ui.focus.e0) qVarE;
                                            androidx.compose.ui.focus.i iVar = ((androidx.compose.ui.focus.p) ((androidx.compose.ui.platform.u) l.w(e0Var)).getFocusOwner()).d;
                                            if (iVar.c.a(e0Var)) {
                                                iVar.a();
                                            }
                                        } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof k)) {
                                            int i4 = 0;
                                            for (androidx.compose.ui.q qVar5 = ((k) qVarE).M; qVar5 != null; qVar5 = qVar5.C) {
                                                if ((qVar5.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        qVarE = qVar5;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                        }
                                                        if (qVarE != null) {
                                                            bVar2.b(qVarE);
                                                            qVarE = null;
                                                        }
                                                        bVar2.b(qVar5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        qVarE = l.e(bVar2);
                                    }
                                    break;
                                }
                                qVarE = qVarE.C;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(qVar instanceof androidx.compose.ui.focus.g)) {
                return;
            }
            androidx.compose.ui.focus.g gVar = (androidx.compose.ui.focus.g) qVar;
            androidx.compose.ui.focus.i iVar2 = ((androidx.compose.ui.focus.p) ((androidx.compose.ui.platform.u) l.w(gVar)).getFocusOwner()).d;
            if (iVar2.d.a(gVar)) {
                iVar2.a();
            }
        }
    }

    public static final void c(androidx.compose.ui.q qVar) {
        if (!qVar.K) {
            androidx.compose.ui.internal.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qVar, -1, 0);
    }

    public static final int d(androidx.compose.ui.p pVar) {
        int i = pVar instanceof androidx.compose.ui.layout.c0 ? 3 : 1;
        if (pVar instanceof androidx.compose.ui.draw.g) {
            i |= 4;
        }
        if (pVar instanceof androidx.compose.ui.semantics.p) {
            i |= 8;
        }
        if (pVar instanceof androidx.compose.ui.input.pointer.a0) {
            i |= 16;
        }
        if (pVar instanceof androidx.compose.animation.q) {
            i |= 64;
        }
        return pVar instanceof androidx.compose.ui.relocation.a ? 524288 | i : i;
    }

    public static final int e(androidx.compose.ui.q qVar) {
        int i = qVar.z;
        if (i != 0) {
            return i;
        }
        Class<?> cls = qVar.getClass();
        androidx.collection.f0 f0Var = a;
        int iD = f0Var.d(cls);
        if (iD >= 0) {
            return f0Var.c[iD];
        }
        int i2 = qVar instanceof w ? 3 : 1;
        if (qVar instanceof n) {
            i2 |= 4;
        }
        if (qVar instanceof u1) {
            i2 |= 8;
        }
        if (qVar instanceof r1) {
            i2 |= 16;
        }
        if (qVar instanceof androidx.compose.ui.modifier.c) {
            i2 |= 32;
        }
        if (qVar instanceof p1) {
            i2 |= 64;
        }
        if (qVar instanceof androidx.compose.ui.layout.z0) {
            i2 |= 128;
        } else if (qVar instanceof v) {
            i2 |= 4194432;
        }
        if (qVar instanceof o) {
            i2 |= LibretroCore.SCREEN_WIDTH;
        }
        if (qVar instanceof androidx.compose.ui.focus.e0) {
            i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (qVar instanceof androidx.compose.ui.focus.w) {
            i2 |= 2048;
        }
        if (qVar instanceof androidx.compose.ui.focus.g) {
            i2 |= 4096;
        }
        if (qVar instanceof androidx.compose.ui.input.key.e) {
            i2 |= 8192;
        }
        if (qVar instanceof androidx.compose.ui.platform.k) {
            i2 |= 16384;
        }
        if (qVar instanceof i) {
            i2 |= 32768;
        }
        if (qVar instanceof z1) {
            i2 |= 262144;
        }
        if (qVar instanceof androidx.compose.ui.relocation.a) {
            i2 |= 524288;
        }
        if (qVar instanceof androidx.compose.ui.input.indirect.c) {
            i2 |= 2097152;
        }
        if (qVar instanceof androidx.compose.foundation.lazy.layout.p) {
            i2 |= 8388608;
        }
        f0Var.g(i2, cls);
        return i2;
    }

    public static final int f(androidx.compose.ui.q qVar) {
        if (!(qVar instanceof k)) {
            return e(qVar);
        }
        k kVar = (k) qVar;
        int iF = kVar.L;
        for (androidx.compose.ui.q qVar2 = kVar.M; qVar2 != null; qVar2 = qVar2.C) {
            iF |= f(qVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
