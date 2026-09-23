package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ h(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.e(this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b0.g(this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(55));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.g(this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 3:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.material3.q.i(this.y, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.e, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.material3.q.i(this.y, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.g, sVar2, 805306368, 510);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 5:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objQ = sVar3.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar3);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                    androidx.compose.material3.q.i(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar3, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar, com.app.mlounge.ui.screens.settings.b.k, sVar3, 905969664, 252);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
            case 6:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objQ2 = sVar4.Q();
                    if (objQ2 == androidx.compose.runtime.n.a) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar4);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    androidx.compose.material3.q.i(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) _COROUTINE.a.B(kVar2, sVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar2, com.app.mlounge.ui.screens.settings.b.i, sVar4, 905969664, 252);
                } else {
                    sVar4.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objQ3 = sVar5.Q();
                    if (objQ3 == androidx.compose.runtime.n.a) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar5);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ3;
                    androidx.compose.material3.q.i(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) _COROUTINE.a.B(kVar3, sVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), false, null, null, null, kVar3, com.app.mlounge.ui.screens.settings.b.m, sVar5, 905969664, 252);
                } else {
                    sVar5.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ h(kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = aVar;
    }
}
