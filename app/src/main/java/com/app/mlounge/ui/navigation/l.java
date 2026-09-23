package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends w {
    public static final l g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = coil3.svg.internal.a.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(12.0f, 3.0f);
            gVar.u(0.01f, 10.55f);
            gVar.n(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
            gVar.m(7.79f, 13.0f, 6.0f, 14.79f, 6.0f, 17.0f);
            gVar.x(1.79f, 4.0f, 4.01f, 4.0f);
            gVar.w(14.0f, 19.21f, 14.0f, 17.0f);
            gVar.t(14.0f, 7.0f);
            gVar.s(4.0f);
            gVar.t(18.0f, 3.0f);
            gVar.s(-6.0f);
            gVar.l();
            gVar.v(10.01f, 19.0f);
            gVar.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
            gVar.x(0.9f, -2.0f, 2.0f, -2.0f);
            gVar.x(2.0f, 0.9f, 2.0f, 2.0f);
            gVar.x(-0.9f, 2.0f, -2.0f, 2.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            coil3.svg.internal.a.g = fVarB;
        }
        g = new l("music", "Music", fVarB, androidx.work.impl.v.x(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l);
    }

    public final int hashCode() {
        return 1600662724;
    }

    public final String toString() {
        return "Music";
    }
}
