package com.app.mlounge.ui.screens.player;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ androidx.compose.runtime.a1 z;

    public /* synthetic */ i(String str, androidx.compose.runtime.a1 a1Var, int i) {
        this.e = i;
        this.y = str;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = this.y;
                    z5.b(k0.t(str), null, androidx.compose.ui.graphics.t.d, 0L, kotlin.jvm.internal.l.a((String) this.z.getValue(), str) ? androidx.compose.ui.text.font.k.C : androidx.compose.ui.text.font.k.z, 0L, null, 0L, 0, false, 0, 0, null, sVar, 384, 0, 262074);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(n6.a)).o;
                    String str2 = (String) this.z.getValue();
                    String str3 = this.y;
                    z5.b(str3, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 10, 6), kotlin.jvm.internal.l.a(str2, str3) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 48, 0, 131064);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
