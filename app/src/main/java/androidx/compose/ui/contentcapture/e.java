package androidx.compose.ui.contentcapture;

import androidx.compose.runtime.g2;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.o1;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.semantics.s;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.m;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar, p pVar, int i) {
        super(2);
        this.y = 3;
        this.z = uVar;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.y;
        y yVar = y.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                s sVar = (s) obj2;
                f fVar = (f) obj3;
                if (!((k2) obj4).b.b(sVar.g)) {
                    fVar.j(iIntValue, sVar);
                    fVar.E.mo28trySendJP2dKIU(yVar);
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    Boolean bool = (Boolean) ((f0) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    p pVar = (p) obj3;
                    sVar2.d0(bool);
                    boolean zG = sVar2.g(zBooleanValue);
                    if (zBooleanValue) {
                        pVar.invoke(sVar2, 0);
                    } else {
                        if (sVar2.l != 0) {
                            androidx.compose.runtime.u.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!sVar2.S) {
                            if (zG) {
                                g2 g2Var = sVar2.G;
                                int i2 = g2Var.g;
                                int i3 = g2Var.h;
                                androidx.compose.runtime.changelist.b bVar = sVar2.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.b.l.W(androidx.compose.runtime.changelist.i.c);
                                t.c(i2, sVar2.s, i3);
                                sVar2.G.t();
                            } else {
                                sVar2.V();
                            }
                        }
                    }
                    if (sVar2.y && sVar2.G.i == sVar2.z) {
                        sVar2.z = -1;
                        sVar2.y = false;
                    }
                    sVar2.p(false);
                }
                break;
            case 2:
                r rVar = (r) obj;
                androidx.compose.ui.graphics.layer.b bVar2 = (androidx.compose.ui.graphics.layer.b) obj2;
                d1 d1Var = (d1) obj4;
                androidx.compose.ui.node.f0 f0Var = d1Var.L;
                if (!f0Var.I()) {
                    d1Var.h0 = true;
                } else {
                    d1Var.e0 = rVar;
                    d1Var.d0 = bVar2;
                    o1 snapshotObserver = ((u) i0.a(f0Var)).getSnapshotObserver();
                    k0 k0Var = d1.j0;
                    snapshotObserver.a.d(d1Var, androidx.compose.ui.node.d.B, (c1) obj3);
                    d1Var.h0 = false;
                }
                break;
            default:
                ((Number) obj2).intValue();
                m0.a((u) obj4, (p) obj3, (androidx.compose.runtime.s) obj, t.A(1));
                break;
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        super(2);
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }
}
