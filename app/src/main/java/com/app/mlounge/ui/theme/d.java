package com.app.mlounge.ui.theme;

import androidx.compose.foundation.gestures.b2;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;
import com.app.mlounge.ui.screens.tvshows.r;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final t0 a;

    static {
        long j = b.f;
        long j2 = t.d;
        long j3 = b.g;
        long j4 = b.h;
        long j5 = t.b;
        long jB = t.b(0.3f, j4);
        long j6 = b.i;
        long j7 = b.a;
        long j8 = b.k;
        long j9 = b.b;
        long j10 = b.l;
        long j11 = b.c;
        long j12 = b.m;
        long j13 = b.o;
        long j14 = b.e;
        long jD = a0.d(4280953386L);
        long jD2 = a0.d(4281348144L);
        long jD3 = a0.d(4280821800L);
        long jD4 = a0.d(4279637526L);
        x2 x2Var = u0.a;
        a = new t0(j, j2, j3, j2, androidx.compose.material3.tokens.d.c, j4, j5, jB, j4, j6, j5, androidx.compose.material3.tokens.d.t, androidx.compose.material3.tokens.d.j, j7, j8, j9, j10, j11, j12, j, androidx.compose.material3.tokens.d.d, androidx.compose.material3.tokens.d.b, j13, j2, androidx.compose.material3.tokens.d.a, androidx.compose.material3.tokens.d.e, j14, jD, androidx.compose.material3.tokens.d.o, androidx.compose.material3.tokens.d.r, androidx.compose.material3.tokens.d.s, j9, jD3, jD2, jD4, j7, androidx.compose.material3.tokens.d.m, androidx.compose.material3.tokens.d.n, androidx.compose.material3.tokens.d.f, androidx.compose.material3.tokens.d.g, androidx.compose.material3.tokens.d.p, androidx.compose.material3.tokens.d.q, androidx.compose.material3.tokens.d.h, androidx.compose.material3.tokens.d.i, androidx.compose.material3.tokens.d.u, androidx.compose.material3.tokens.d.v, androidx.compose.material3.tokens.d.k, androidx.compose.material3.tokens.d.l);
    }

    public static final void a(c cVar, a aVar, androidx.compose.runtime.internal.f fVar, s sVar, int i) {
        sVar.c0(-2011003514);
        int i2 = (sVar.d(cVar.ordinal()) ? 4 : 2) | i | (sVar.d(aVar.ordinal()) ? 32 : 16);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            androidx.compose.runtime.t.a(g.a.a(aVar), k.c(-782960058, new r(cVar, fVar, 3), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b2(cVar, aVar, fVar, i, 19);
        }
    }
}
