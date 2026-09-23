package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w {
    public static final a g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = androidx.work.impl.v.D;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(18.0f, 8.0f);
            gVar.s(-1.0f);
            gVar.t(17.0f, 6.0f);
            gVar.n(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
            gVar.w(7.0f, 3.24f, 7.0f, 6.0f);
            gVar.A(2.0f);
            gVar.t(6.0f, 8.0f);
            gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.A(10.0f);
            gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.s(12.0f);
            gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.t(20.0f, 10.0f);
            gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.l();
            gVar.v(9.0f, 6.0f);
            gVar.n(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
            gVar.x(3.0f, 1.34f, 3.0f, 3.0f);
            gVar.A(2.0f);
            gVar.t(9.0f, 8.0f);
            gVar.t(9.0f, 6.0f);
            gVar.l();
            gVar.v(18.0f, 20.0f);
            gVar.t(6.0f, 20.0f);
            gVar.t(6.0f, 10.0f);
            gVar.s(12.0f);
            gVar.A(10.0f);
            gVar.l();
            gVar.v(12.0f, 17.0f);
            gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.x(-0.9f, -2.0f, -2.0f, -2.0f);
            gVar.x(-2.0f, 0.9f, -2.0f, 2.0f);
            gVar.x(0.9f, 2.0f, 2.0f, 2.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            androidx.work.impl.v.D = fVarB;
        }
        g = new a("adult", "Adult", fVarB, _COROUTINE.b.v(), 16);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public final int hashCode() {
        return 1589076057;
    }

    public final String toString() {
        return "Adult";
    }
}
