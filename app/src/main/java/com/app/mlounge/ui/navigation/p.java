package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends w {
    public static final p g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = com.google.android.gms.dynamite.g.j;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(15.5f, 14.0f);
            gVar.s(-0.79f);
            gVar.u(-0.28f, -0.27f);
            gVar.m(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
            gVar.m(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
            gVar.w(3.0f, 5.91f, 3.0f, 9.5f);
            gVar.w(5.91f, 16.0f, 9.5f, 16.0f);
            gVar.n(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
            gVar.u(0.27f, 0.28f);
            gVar.A(0.79f);
            gVar.u(5.0f, 4.99f);
            gVar.t(20.49f, 19.0f);
            gVar.u(-4.99f, -5.0f);
            gVar.l();
            gVar.v(9.5f, 14.0f);
            gVar.m(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
            gVar.w(7.01f, 5.0f, 9.5f, 5.0f);
            gVar.w(14.0f, 7.01f, 14.0f, 9.5f);
            gVar.w(11.99f, 14.0f, 9.5f, 14.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            com.google.android.gms.dynamite.g.j = fVarB;
        }
        g = new p("search", "Search", fVarB, com.google.android.gms.dynamite.g.x(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p);
    }

    public final int hashCode() {
        return -1762592023;
    }

    public final String toString() {
        return "Search";
    }
}
