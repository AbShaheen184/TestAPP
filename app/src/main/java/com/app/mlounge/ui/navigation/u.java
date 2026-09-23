package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {
    public static final u g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = com.imsdk.a.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(21.0f, 3.0f);
            gVar.t(3.0f, 3.0f);
            gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.A(12.0f);
            gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.s(5.0f);
            gVar.A(2.0f);
            gVar.s(8.0f);
            gVar.A(-2.0f);
            gVar.s(5.0f);
            gVar.n(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
            gVar.t(23.0f, 5.0f);
            gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.l();
            gVar.v(21.0f, 17.0f);
            gVar.t(3.0f, 17.0f);
            gVar.t(3.0f, 5.0f);
            gVar.s(18.0f);
            gVar.A(12.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            com.imsdk.a.h = fVarB;
        }
        g = new u("tvshows", "TV Shows", fVarB, com.google.android.gms.dynamite.g.y(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u);
    }

    public final int hashCode() {
        return -1739761005;
    }

    public final String toString() {
        return "TvShows";
    }
}
