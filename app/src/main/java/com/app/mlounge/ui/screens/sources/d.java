package com.app.mlounge.ui.screens.sources;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.downloads.e;
import com.app.mlounge.ui.viewmodel.w1;
import java.util.List;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r {
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ w1 z;

    public d(List list, boolean z, w1 w1Var) {
        this.e = list;
        this.y = z;
        this.z = w1Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (sVar.f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            ChqStream chqStream = (ChqStream) this.e.get(iIntValue);
            sVar.b0(1199800362);
            w1 w1Var = this.z;
            boolean zH = sVar.h(w1Var) | sVar.h(chqStream);
            Object objQ = sVar.Q();
            if (zH || objQ == n.a) {
                objQ = new e(8, w1Var, chqStream);
                sVar.l0(objQ);
            }
            a.b(chqStream, this.y, (kotlin.jvm.functions.a) objQ, sVar, 0);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return y.a;
    }
}
