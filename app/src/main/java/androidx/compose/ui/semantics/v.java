package androidx.compose.ui.semantics;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.collection.o0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.u1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final androidx.compose.ui.geometry.c a = new androidx.compose.ui.geometry.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final s a(f0 f0Var, boolean z) {
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) f0Var.d0.g;
        androidx.compose.ui.node.j jVar = null;
        if ((qVar.A & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.z & 8) == 0) {
                    if ((qVar.A & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.C;
                } else {
                    androidx.compose.ui.q qVarE = qVar;
                    androidx.compose.runtime.collection.b bVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof u1) {
                            jVar = qVarE;
                            break loop0;
                        }
                        if ((qVarE.z & 8) != 0 && (qVarE instanceof androidx.compose.ui.node.k)) {
                            int i = 0;
                            for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.k) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                if ((qVar2.z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVarE = qVar2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (qVarE != null) {
                                            bVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        bVar.b(qVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVarE = androidx.compose.ui.node.l.e(bVar);
                    }
                    if ((qVar.A & 8) != 0) {
                        break;
                    }
                    qVar = qVar.C;
                }
            }
        }
        jVar.getClass();
        androidx.compose.ui.q qVar3 = ((androidx.compose.ui.q) ((u1) jVar)).e;
        n nVarX = f0Var.x();
        if (nVarX == null) {
            nVarX = new n();
        }
        return new s(qVar3, z, f0Var, nVarX);
    }

    public static final androidx.collection.z b(u uVar, kotlin.jvm.functions.l lVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            s sVarA = uVar.a();
            f0 f0Var = sVarA.c;
            if (f0Var.I() && f0Var.H()) {
                androidx.collection.z zVar = new androidx.collection.z(48);
                com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(19);
                androidx.compose.ui.unit.k kVarM = androidx.work.impl.v.M(sVarA.g());
                ((Region) eVar.y).set(kVarM.a, kVarM.b, kVarM.c, kVarM.d);
                c(eVar, sVarA, zVar, lVar, sVarA, new com.app.mlounge.data.music.e(19));
                return zVar;
            }
            androidx.collection.z zVar2 = androidx.collection.o.a;
            zVar2.getClass();
            return zVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(com.app.mlounge.data.music.e eVar, s sVar, androidx.collection.z zVar, kotlin.jvm.functions.l lVar, s sVar2, com.app.mlounge.data.music.e eVar2) {
        androidx.compose.ui.geometry.c cVarP1;
        f0 f0Var;
        s sVar3 = sVar;
        int i = sVar3.g;
        com.app.mlounge.data.music.e eVar3 = eVar2;
        Region region = (Region) eVar3.y;
        f0 f0Var2 = sVar2.c;
        int i2 = sVar2.g;
        boolean z = (f0Var2.I() && f0Var2.H()) ? false : true;
        com.app.mlounge.data.music.e eVar4 = eVar;
        Region region2 = (Region) eVar4.y;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || sVar2.e) {
                androidx.compose.ui.node.j jVarF = sVar2.f();
                if (jVarF == null) {
                    cVarP1 = ((androidx.compose.ui.node.s) f0Var2.d0.d).p1();
                } else {
                    androidx.compose.ui.q qVar = ((androidx.compose.ui.q) jVarF).e;
                    Object objG = sVar2.d.e.g(m.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z2 = objG != null;
                    if (!qVar.e.K) {
                        cVarP1 = androidx.compose.ui.geometry.c.e;
                    } else if (z2) {
                        cVarP1 = androidx.compose.ui.node.l.t(qVar, 8).p1();
                    } else {
                        d1 d1VarT = androidx.compose.ui.node.l.t(qVar, 8);
                        cVarP1 = androidx.compose.ui.layout.a0.g(d1VarT).s(d1VarT, true);
                    }
                }
                androidx.compose.ui.unit.k kVarM = androidx.work.impl.v.M(cVarP1);
                region.set(kVarM.a, kVarM.b, kVarM.c, kVarM.d);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (sVar2.e) {
                        s sVarL = sVar2.l();
                        zVar.h(i2, new t(sVar2, androidx.work.impl.v.M((sVarL == null || (f0Var = sVarL.c) == null || !f0Var.I()) ? a : sVarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            zVar.h(i2, new t(sVar2, new androidx.compose.ui.unit.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                zVar.h(i2, new t(sVar2, new androidx.compose.ui.unit.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = s.j(4, sVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) lVar.invoke(listJ.get(size))).booleanValue()) {
                        c(eVar4, sVar3, zVar, lVar, (s) listJ.get(size), eVar3);
                    }
                    size--;
                    eVar4 = eVar;
                    sVar3 = sVar;
                    eVar3 = eVar2;
                }
                if (f(sVar2)) {
                    region2.op(kVarM.a, kVarM.b, kVarM.c, kVarM.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(n nVar, z zVar) {
        Object objG = nVar.e.g(zVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(s sVar) {
        d1 d1VarD = sVar.d();
        o0 o0Var = sVar.d.e;
        return (d1VarD != null ? d1VarD.c1() : false) || o0Var.c(w.p) || o0Var.c(w.o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(s sVar) {
        if (!e(sVar)) {
            n nVar = sVar.d;
            if (nVar.z) {
                return true;
            }
            o0 o0Var = nVar.e;
            Object[] objArr = o0Var.b;
            Object[] objArr2 = o0Var.c;
            long[] jArr = o0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((z) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }
}
