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
public final /* synthetic */ class o0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ o0(String str, String str2, int i) {
        this.e = 1;
        this.y = str;
        this.z = str2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar.j(n6.a)).n;
                    String str = this.y;
                    String str2 = this.z;
                    z5.b(str2, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), kotlin.jvm.internal.l.a(str, str2) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 48, 0, 131064);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.e(this.y, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(7));
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar, 12, 8);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, sVar2, 54);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    androidx.compose.ui.text.m0 m0Var2 = ((m6) sVar2.j(n6.a)).n;
                    String str3 = this.y;
                    z5.b(this.z, null, str3 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var2, sVar2, 0, 0, 131066);
                    q1.b(okhttp3.internal.platform.android.g.i(), null, i1.m(oVar, 16), str3 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, sVar2, 432, 0);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o0(String str, String str2, int i, byte b) {
        this.e = i;
        this.y = str;
        this.z = str2;
    }
}
