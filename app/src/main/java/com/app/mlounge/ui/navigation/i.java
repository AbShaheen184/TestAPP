package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {
    public static final i g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = androidx.room.t.g;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(9.0f, 10.0f);
            gVar.A(8.0f);
            gVar.u(7.0f, -4.0f);
            gVar.l();
            gVar.v(21.0f, 6.0f);
            gVar.s(-7.58f);
            gVar.u(3.29f, -3.29f);
            gVar.t(16.0f, 2.0f);
            gVar.u(-4.0f, 4.0f);
            gVar.s(-0.03f);
            gVar.u(-4.0f, -4.0f);
            gVar.u(-0.69f, 0.71f);
            gVar.t(10.56f, 6.0f);
            gVar.t(3.0f, 6.0f);
            gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.A(12.0f);
            gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.s(18.0f);
            gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.t(23.0f, 8.0f);
            gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.l();
            gVar.v(21.0f, 20.0f);
            gVar.t(3.0f, 20.0f);
            gVar.t(3.0f, 8.0f);
            gVar.s(18.0f);
            gVar.A(12.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            androidx.room.t.g = fVarB;
        }
        g = new i("livetv", "Live TV", fVarB, _COROUTINE.a.O(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i);
    }

    public final int hashCode() {
        return -1958689329;
    }

    public final String toString() {
        return "LiveTv";
    }
}
