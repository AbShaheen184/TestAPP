package com.app.mlounge.ui.screens.search;

import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.settings.e0;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(List list, Object obj, int i) {
        this.e = i;
        this.y = list;
        this.z = obj;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        y yVar = y.a;
        Object obj5 = this.z;
        androidx.compose.runtime.f fVar = n.a;
        List list = this.y;
        int i2 = 4;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                q qVar = (q) obj5;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (sVar.f(jVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (!sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    sVar.W();
                } else {
                    IptvChannel iptvChannel = (IptvChannel) list.get(iIntValue);
                    sVar.b0(1121889313);
                    String strC = iptvChannel.c();
                    String strB = iptvChannel.b();
                    if (strB == null) {
                        strB = "";
                    }
                    String str = strB;
                    String strA = iptvChannel.a();
                    String strD = iptvChannel.d();
                    boolean zF = sVar.f(qVar) | sVar.f(iptvChannel);
                    Object objQ = sVar.Q();
                    if (zF || objQ == fVar) {
                        objQ = new com.app.mlounge.ui.screens.downloads.e(i2, qVar, iptvChannel);
                        sVar.l0(objQ);
                    }
                    b0.f(strC, str, (kotlin.jvm.functions.a) objQ, null, strA, strD, null, sVar, 0, 72);
                    sVar.p(false);
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar2 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (sVar2.f(dVar) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (!sVar2.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    sVar2.W();
                } else {
                    File file = (File) list.get(iIntValue3);
                    sVar2.b0(949174630);
                    String name = file.getName();
                    name.getClass();
                    androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.b.z;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(10.0f, 4.0f);
                        gVar.r(4.0f);
                        gVar.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar.t(2.0f, 18.0f);
                        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.s(16.0f);
                        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar.z(8.0f);
                        gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar.s(-8.0f);
                        gVar.u(-2.0f, -2.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
                        fVarB = eVar.b();
                        _COROUTINE.b.z = fVarB;
                    }
                    boolean zH = sVar2.h(file);
                    Object objQ2 = sVar2.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new com.app.mlounge.ui.screens.downloads.e(7, file, (a1) obj5);
                        sVar2.l0(objQ2);
                    }
                    e0.j(name, fVarB, (kotlin.jvm.functions.a) objQ2, sVar2, 0);
                    sVar2.p(false);
                }
                break;
        }
        return yVar;
    }
}
