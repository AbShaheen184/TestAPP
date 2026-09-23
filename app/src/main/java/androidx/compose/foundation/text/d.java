package androidx.compose.foundation.text;

import androidx.compose.runtime.s1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(androidx.compose.foundation.text.selection.m mVar, androidx.compose.ui.r rVar, long j, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(1776202187);
        int i3 = (sVar.f(mVar) ? 4 : 2) | i | (sVar.f(rVar) ? 32 : 16) | 128;
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                sVar.W();
                i2 = i3 & (-897);
            }
            sVar.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objQ = sVar.Q();
            if (z || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.activity.compose.g(mVar, 15);
                sVar.l0(objQ);
            }
            kotlin.math.a.a(mVar, androidx.compose.ui.c.y, androidx.compose.runtime.internal.k.c(-1653527038, new a(j, androidx.compose.ui.semantics.q.a(rVar, false, (kotlin.jvm.functions.l) objQ), 0), sVar), sVar, i4 | 432);
        } else {
            sVar.W();
        }
        long j2 = j;
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b(mVar, rVar, j2, i);
        }
    }

    public static final void b(androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        sVar.c0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        if (sVar.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                rVar = androidx.compose.ui.o.b;
            }
            androidx.compose.foundation.layout.b.e(sVar, androidx.compose.ui.a.a(androidx.compose.foundation.layout.i1.n(rVar, b, a), new androidx.compose.foundation.contextmenu.b(1)));
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.layout.n(rVar, i, i2);
        }
    }
}
