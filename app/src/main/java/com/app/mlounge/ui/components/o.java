package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;

    public /* synthetic */ o(int i, boolean z) {
        this.e = 4;
        this.y = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5.b(this.y ? "Enter PIN" : "PIN", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 262142);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b("18+", androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), this.y ? com.app.mlounge.ui.theme.b.j : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).n, sVar2, 54, 0, 131064);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar, 12, 8);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, sVar3, 54);
                    int iHashCode = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL = sVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                    boolean z = this.y;
                    q1.b(z ? okhttp3.internal.platform.android.g.l() : kotlin.math.a.q(), null, i1.m(oVar, 14), z ? androidx.compose.ui.graphics.a0.d(4293467747L) : com.app.mlounge.ui.theme.b.m, sVar3, 432, 0);
                    z5.b("Favourites", null, z ? androidx.compose.ui.graphics.a0.d(4293467747L) : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(n6.a)).n, sVar3, 6, 0, 131066);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z2 = this.y;
                    z5.b(z2 ? "Connected" : "Not Connected", androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 8, 4), z2 ? com.app.mlounge.ui.theme.b.h : com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).o, sVar4, 48, 0, 131064);
                } else {
                    sVar4.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.l(this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o(boolean z, int i, byte b) {
        this.e = i;
        this.y = z;
    }
}
