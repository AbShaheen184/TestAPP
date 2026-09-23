package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends w {
    public static final k g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = coil3.network.g.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(4.0f, 6.47f);
            gVar.t(5.76f, 10.0f);
            gVar.r(20.0f);
            gVar.A(8.0f);
            gVar.r(4.0f);
            gVar.z(6.47f);
            gVar.v(22.0f, 4.0f);
            gVar.s(-4.0f);
            gVar.u(2.0f, 4.0f);
            gVar.s(-3.0f);
            gVar.u(-2.0f, -4.0f);
            gVar.s(-2.0f);
            gVar.u(2.0f, 4.0f);
            gVar.s(-3.0f);
            gVar.u(-2.0f, -4.0f);
            gVar.r(8.0f);
            gVar.u(2.0f, 4.0f);
            gVar.r(7.0f);
            gVar.t(5.0f, 4.0f);
            gVar.r(4.0f);
            gVar.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            gVar.t(2.0f, 18.0f);
            gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.s(16.0f);
            gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.z(4.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            coil3.network.g.g = fVarB;
        }
        g = new k("movies", "Movies", fVarB, androidx.room.t.u(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return -1924514684;
    }

    public final String toString() {
        return "Movies";
    }
}
