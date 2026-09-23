package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.j2;
import androidx.compose.animation.core.x1;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.s1;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ListIterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(e2 e2Var, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.ui.e eVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        kotlin.jvm.functions.l lVar3;
        androidx.compose.runtime.s sVar2;
        j2 j2Var;
        v vVar;
        x1 x1VarB;
        androidx.compose.runtime.s sVar3;
        kotlin.jvm.functions.l lVar4 = lVar;
        sVar.c0(511725103);
        if ((i & 6) == 0) {
            i2 = (sVar.f(e2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(lVar4) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(eVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(lVar2) ? 16384 : 8192;
        }
        androidx.compose.runtime.internal.f fVar2 = fVar;
        if ((196608 & i) == 0) {
            i2 |= sVar.h(fVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (sVar.T(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            if (z || objQ == fVar3) {
                objQ = new v(e2Var, eVar);
                sVar.l0(objQ);
            }
            v vVar2 = (v) objQ;
            boolean z2 = i3 == 4;
            Object objQ2 = sVar.Q();
            Object obj = objQ2;
            if (z2 || objQ2 == fVar3) {
                Object[] objArr = {e2Var.a.n()};
                androidx.compose.runtime.snapshots.q qVar = new androidx.compose.runtime.snapshots.q();
                qVar.addAll(kotlin.collections.o.C(objArr));
                sVar.l0(qVar);
                obj = qVar;
            }
            androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj;
            boolean z3 = i3 == 4;
            Object objQ3 = sVar.Q();
            if (z3 || objQ3 == fVar3) {
                long[] jArr = androidx.collection.w0.a;
                objQ3 = new androidx.collection.o0();
                sVar.l0(objQ3);
            }
            androidx.collection.o0 o0Var = (androidx.collection.o0) objQ3;
            j2 j2Var2 = e2Var.a;
            j1 j1Var = e2Var.d;
            if (!qVar2.contains(j2Var2.n())) {
                qVar2.clear();
                qVar2.add(j2Var2.n());
            }
            if (kotlin.jvm.internal.l.a(j2Var2.n(), j1Var.getValue())) {
                if (qVar2.size() != 1 || !kotlin.jvm.internal.l.a(qVar2.get(0), j2Var2.n())) {
                    qVar2.clear();
                    qVar2.add(j2Var2.n());
                }
                if (o0Var.e != 1 || o0Var.c(j2Var2.n())) {
                    o0Var.a();
                }
                vVar2.b = eVar;
            }
            if (kotlin.jvm.internal.l.a(j2Var2.n(), j1Var.getValue()) || qVar2.contains(j1Var.getValue())) {
                j2Var = j2Var2;
            } else {
                ListIterator listIterator = qVar2.listIterator();
                int i4 = 0;
                while (true) {
                    androidx.compose.runtime.snapshots.u uVar = (androidx.compose.runtime.snapshots.u) listIterator;
                    j2Var = j2Var2;
                    if (!uVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.l.a(lVar2.invoke(uVar.next()), lVar2.invoke(j1Var.getValue()))) {
                            break;
                        }
                        i4++;
                        j2Var2 = j2Var;
                    }
                }
                if (i4 == -1) {
                    qVar2.add(j1Var.getValue());
                } else {
                    qVar2.set(i4, j1Var.getValue());
                }
            }
            if (o0Var.c(j1Var.getValue()) && o0Var.c(j2Var.n())) {
                sVar.b0(1925931827);
                sVar.p(false);
                lVar3 = lVar4;
            } else {
                sVar.b0(1966410449);
                o0Var.a();
                int size = qVar2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = qVar2.get(i5);
                    o0Var.m(obj2, androidx.compose.runtime.internal.k.c(-23915175, new j(e2Var, obj2, lVar4, vVar2, qVar2, fVar2), sVar));
                    i5++;
                    lVar4 = lVar4;
                    fVar2 = fVar;
                }
                lVar3 = lVar4;
                sVar.p(false);
            }
            boolean zF = sVar.f(e2Var.f()) | sVar.f(vVar2);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == fVar3) {
                objQ4 = (l0) lVar3.invoke(vVar2);
                sVar.l0(objQ4);
            }
            l0 l0Var = (l0) objQ4;
            e2 e2Var2 = vVar2.a;
            boolean zF2 = sVar.f(vVar2);
            Object objQ5 = sVar.Q();
            if (zF2 || objQ5 == fVar3) {
                objQ5 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ5);
            }
            androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ5;
            androidx.compose.runtime.a1 a1VarV = androidx.compose.runtime.t.v(l0Var.d, sVar);
            if (kotlin.jvm.internal.l.a(e2Var2.a.n(), e2Var2.d.getValue())) {
                a1Var.setValue(Boolean.FALSE);
            } else if (a1VarV.getValue() != null) {
                a1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            androidx.compose.ui.r rVar2 = androidx.compose.ui.o.b;
            if (zBooleanValue) {
                sVar.b0(1353077497);
                vVar = vVar2;
                androidx.compose.runtime.s sVar4 = sVar;
                x1VarB = i2.b(vVar2.a, androidx.compose.animation.core.e.q, null, sVar4, 0, 2);
                boolean zF3 = sVar4.f(x1VarB);
                Object objQ6 = sVar4.Q();
                if (zF3 || objQ6 == fVar3) {
                    objQ6 = androidx.compose.ui.draw.h.b(rVar2);
                    sVar4.l0(objQ6);
                }
                rVar2 = (androidx.compose.ui.r) objQ6;
                sVar4.p(false);
                sVar3 = sVar4;
            } else {
                androidx.compose.runtime.s sVar5 = sVar;
                vVar = vVar2;
                sVar5.b0(1353343539);
                sVar5.p(false);
                x1VarB = null;
                sVar3 = sVar5;
            }
            androidx.compose.ui.r rVarD = rVar.d(rVar2.d(new r(x1VarB, a1VarV, vVar)));
            Object objQ7 = sVar3.Q();
            if (objQ7 == fVar3) {
                objQ7 = new o(vVar);
                sVar3.l0(objQ7);
            }
            o oVar = (o) objQ7;
            int iHashCode = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL = sVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarD);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar4);
            } else {
                sVar3.o0();
            }
            androidx.compose.runtime.t.x(sVar3, oVar, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
            sVar3.b0(-860173498);
            int size2 = qVar2.size();
            int i6 = 0;
            while (i6 < size2) {
                androidx.compose.runtime.snapshots.q qVar3 = qVar2;
                Object obj3 = qVar3.get(i6);
                sVar3.X(-2026002954, lVar2.invoke(obj3), null, 0);
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) o0Var.g(obj3);
                if (pVar == null) {
                    sVar3.b0(1618454323);
                } else {
                    sVar3.b0(-2026001778);
                    pVar.invoke(sVar3, 0);
                }
                sVar3.p(false);
                sVar3.p(false);
                i6++;
                qVar2 = qVar3;
            }
            sVar3.p(false);
            sVar3.p(true);
            sVar2 = sVar3;
        } else {
            lVar3 = lVar4;
            androidx.compose.runtime.s sVar6 = sVar;
            sVar6.W();
            sVar2 = sVar6;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new k(e2Var, rVar, lVar3, eVar, lVar2, fVar, i);
        }
    }
}
