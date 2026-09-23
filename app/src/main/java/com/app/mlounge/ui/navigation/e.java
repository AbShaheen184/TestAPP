package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w {
    public static final e g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.a.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(19.0f, 9.0f);
            gVar.s(-4.0f);
            gVar.t(15.0f, 3.0f);
            gVar.t(9.0f, 3.0f);
            gVar.A(6.0f);
            gVar.t(5.0f, 9.0f);
            androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, 7.0f, 7.0f, 7.0f, -7.0f);
            gVar.v(11.0f, 11.0f);
            gVar.t(11.0f, 5.0f);
            gVar.s(2.0f);
            gVar.A(6.0f);
            gVar.s(1.17f);
            gVar.t(12.0f, 13.17f);
            gVar.t(9.83f, 11.0f);
            gVar.t(11.0f, 11.0f);
            gVar.l();
            gVar.v(5.0f, 18.0f);
            gVar.s(14.0f);
            gVar.A(2.0f);
            gVar.t(5.0f, 20.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            _COROUTINE.a.g = fVarB;
        }
        g = new e("downloads", "Downloads", fVarB, androidx.work.impl.v.u(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e);
    }

    public final int hashCode() {
        return 425795594;
    }

    public final String toString() {
        return "Downloads";
    }
}
