package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.i1;
import androidx.compose.runtime.s1;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.window.d0;
import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final d0 a = new d0(14, true);

    public static final void a(androidx.compose.foundation.text.contextmenu.data.g gVar, androidx.compose.foundation.text.contextmenu.data.c cVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        Context context;
        sVar.c0(1904307118);
        int i2 = (sVar.f(gVar) ? 4 : 2) | i | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sVar.b0(-1009482584);
                context = (Context) sVar.j(m0.b);
                sVar.p(false);
            } else {
                sVar.b0(-1009433480);
                sVar.p(false);
                context = null;
            }
            boolean zH = sVar.h(cVar) | ((i2 & 14) == 4) | sVar.h(context);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.animation.core.a(6, cVar, context, gVar);
                sVar.l0(objQ);
            }
            sVar2 = sVar;
            androidx.compose.foundation.contextmenu.m.b(null, null, (kotlin.jvm.functions.l) objQ, sVar2, 0, 3);
        } else {
            sVar2 = sVar;
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(gVar, cVar, i, 6);
        }
    }

    public static final void b(final int i, final long j, androidx.compose.runtime.s sVar, final int i2) throws XmlPullParserException, IOException {
        int i3;
        final long j2;
        sVar.c0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (sVar.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.e(j) ? 32 : 16;
        }
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) sVar.j(m0.b);
            boolean zF = ((i3 & 14) == 4) | sVar.f(context);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (zF || objQ == obj) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                sVar.l0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                s1 s1VarT = sVar.t();
                if (s1VarT != null) {
                    final int i4 = 1;
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                            int i5 = i4;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    n.b(i, j, sVar2, androidx.compose.runtime.t.A(i2 | 1));
                                    break;
                                default:
                                    n.b(i, j, sVar2, androidx.compose.runtime.t.A(i2 | 1));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = true;
            j2 = j;
            androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(iIntValue, sVar);
            if ((i3 & Token.ASSIGN_MOD) != 32) {
                z = false;
            }
            Object objQ2 = sVar.Q();
            if (z || objQ2 == obj) {
                objQ2 = j2 == 16 ? null : new androidx.compose.ui.graphics.m(j2, 5);
                sVar.l0(objQ2);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.f(i1.m(androidx.compose.ui.o.b, androidx.compose.foundation.contextmenu.h.j), bVarS, 0.0f, (androidx.compose.ui.graphics.m) objQ2, 22), sVar, 0);
        } else {
            j2 = j;
            sVar.W();
        }
        s1 s1VarT2 = sVar.t();
        if (s1VarT2 != null) {
            final int i5 = 0;
            s1VarT2.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.contextmenu.internal.l
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    int i6 = i5;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            n.b(i, j2, sVar2, androidx.compose.runtime.t.A(i2 | 1));
                            break;
                        default:
                            n.b(i, j2, sVar2, androidx.compose.runtime.t.A(i2 | 1));
                            break;
                    }
                    return y.a;
                }
            };
        }
    }

    public static final void c(androidx.compose.foundation.text.contextmenu.data.g gVar, androidx.compose.foundation.text.contextmenu.provider.e eVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(gVar) : sVar.h(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(eVar) : sVar.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        boolean z = false;
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i2 & Token.ASSIGN_MOD) == 32 || ((i2 & 64) != 0 && sVar.f(eVar));
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (z2 || objQ == fVar) {
                objQ = new p(new com.app.mlounge.data.music.e(new androidx.activity.compose.f(9, eVar, aVar), 8));
                sVar.l0(objQ);
            }
            p pVar = (p) objQ;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && sVar.h(gVar))) {
                z = true;
            }
            Object objQ2 = sVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new androidx.activity.w(gVar, 11);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.window.o.a(pVar, (kotlin.jvm.functions.a) objQ2, a, androidx.compose.runtime.internal.k.c(1315155414, new androidx.compose.foundation.contextmenu.f(5, eVar, gVar), sVar), sVar, 3456, 0);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(gVar, eVar, aVar, i, 4);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(1392105195);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            com.google.firebase.b.b(rVar, androidx.compose.foundation.text.contextmenu.provider.g.a, fVar, sVar, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(rVar, fVar, i, 2);
        }
    }
}
