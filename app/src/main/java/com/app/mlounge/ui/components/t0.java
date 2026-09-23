package com.app.mlounge.ui.components;

import androidx.compose.material3.q1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean e;

    public t0(boolean z) {
        this.e = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            sVar.W();
        } else if (this.e) {
            sVar.b0(-703839667);
            q1.b(coil3.svg.internal.a.s(), "Current", null, com.app.mlounge.ui.theme.b.f, sVar, 3120, 4);
            sVar.p(false);
        } else {
            sVar.b0(-703568665);
            sVar.p(false);
        }
        return kotlin.y.a;
    }
}
