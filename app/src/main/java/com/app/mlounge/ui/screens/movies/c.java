package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.services.n;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ c(ChqStream chqStream, boolean z, kotlin.jvm.functions.a aVar, int i) {
        this.A = chqStream;
        this.z = z;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        switch (this.e) {
            case 0:
                androidx.compose.ui.graphics.vector.f fVar = (androidx.compose.ui.graphics.vector.f) this.A;
                String str = (String) this.y;
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 12;
                    o oVar2 = o.b;
                    r rVarR = androidx.compose.foundation.layout.b.r(oVar2, f, f);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.d, androidx.compose.ui.c.H, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    r rVarC = androidx.compose.ui.a.c(sVar, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
                    t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar, androidx.compose.ui.node.g.h);
                    t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    if (this.z) {
                        sVar.b0(-1407407818);
                        s4.a(i1.m(oVar2, 16), com.app.mlounge.ui.theme.b.l, 2, 0L, 0, 0.0f, sVar, 390, 56);
                        sVar = sVar;
                        sVar.p(false);
                        oVar = oVar2;
                    } else {
                        oVar = oVar2;
                        sVar.b0(-1407182386);
                        q1.b(fVar, null, i1.m(oVar, 16), com.app.mlounge.ui.theme.b.l, sVar, 432, 0);
                        sVar.p(false);
                    }
                    androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, 6));
                    s sVar2 = sVar;
                    z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((m6) sVar.j(n6.a)).o, sVar2, 0, 24576, 114682);
                    sVar2.p(true);
                } else {
                    sVar.W();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                n.c((String) this.y, this.z, (l) this.A, (s) obj, t.A(7));
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.b((ChqStream) this.A, this.z, (kotlin.jvm.functions.a) this.y, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ c(String str, boolean z, l lVar, int i) {
        this.y = str;
        this.z = z;
        this.A = lVar;
    }

    public /* synthetic */ c(boolean z, androidx.compose.ui.graphics.vector.f fVar, String str) {
        this.z = z;
        this.A = fVar;
        this.y = str;
    }
}
