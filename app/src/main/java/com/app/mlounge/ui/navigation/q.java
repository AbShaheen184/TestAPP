package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {
    public static final q g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = org.jsoup.helper.n.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Cloud", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            ArrayList arrayList = gVar.b;
            gVar.v(12.0f, 6.0f);
            gVar.n(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f);
            gVar.u(0.3f, 1.5f);
            gVar.u(1.53f, 0.11f);
            gVar.n(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f);
            gVar.n(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
            gVar.r(6.0f);
            gVar.n(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
            gVar.n(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
            gVar.u(1.07f, -0.11f);
            gVar.u(0.5f, -0.95f);
            gVar.m(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f);
            arrayList.add(new androidx.compose.ui.graphics.vector.w(0.0f, -2.0f));
            gVar.m(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
            gVar.m(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
            gVar.n(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
            gVar.s(13.0f);
            gVar.n(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
            gVar.n(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
            gVar.m(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
            fVarB = eVar.b();
            org.jsoup.helper.n.g = fVarB;
        }
        g = new q("services", "Services", fVarB, com.imsdk.a.m(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q);
    }

    public final int hashCode() {
        return -1143252641;
    }

    public final String toString() {
        return "Services";
    }
}
