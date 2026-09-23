package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w {
    public static final h g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = android.support.v4.media.session.b.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(13.0f, 3.0f);
            gVarJ.n(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
            gVarJ.t(1.0f, 12.0f);
            gVarJ.u(3.89f, 3.89f);
            gVarJ.u(0.07f, 0.14f);
            gVarJ.t(9.0f, 12.0f);
            gVarJ.t(6.0f, 12.0f);
            gVarJ.n(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
            gVarJ.x(7.0f, 3.13f, 7.0f, 7.0f);
            gVarJ.x(-3.13f, 7.0f, -7.0f, 7.0f);
            gVarJ.n(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
            gVarJ.u(-1.42f, 1.42f);
            gVarJ.m(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
            gVarJ.n(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
            gVarJ.x(-4.03f, -9.0f, -9.0f, -9.0f);
            gVarJ.l();
            gVarJ.v(12.0f, 8.0f);
            gVarJ.A(5.0f);
            gVarJ.u(4.25f, 2.52f);
            gVarJ.u(0.77f, -1.28f);
            gVarJ.u(-3.52f, -2.09f);
            gVarJ.t(13.5f, 8.0f);
            gVarJ.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
            fVarB = eVar.b();
            android.support.v4.media.session.b.g = fVarB;
        }
        g = new h("history", "History", fVarB, coil3.svg.internal.a.u(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return 152827763;
    }

    public final String toString() {
        return "History";
    }
}
