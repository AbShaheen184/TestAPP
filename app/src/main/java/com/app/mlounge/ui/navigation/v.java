package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {
    public static final v g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.b.D;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(16.5f, 3.0f);
            gVarJ.n(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
            gVarJ.m(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
            gVarJ.m(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
            gVarJ.n(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
            gVarJ.t(12.0f, 21.35f);
            gVarJ.u(1.45f, -1.32f);
            gVarJ.m(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
            gVarJ.m(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
            gVarJ.l();
            gVarJ.v(12.1f, 18.55f);
            gVarJ.u(-0.1f, 0.1f);
            gVarJ.u(-0.1f, -0.1f);
            gVarJ.m(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
            gVarJ.m(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
            gVarJ.n(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
            gVarJ.s(1.87f);
            gVarJ.m(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
            gVarJ.n(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
            gVarJ.n(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
            gVarJ.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
            fVarB = eVar.b();
            _COROUTINE.b.D = fVarB;
        }
        g = new v("watchlist", "Favourites", fVarB, okhttp3.internal.platform.android.g.l(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v);
    }

    public final int hashCode() {
        return -1166848756;
    }

    public final String toString() {
        return "Watchlist";
    }
}
