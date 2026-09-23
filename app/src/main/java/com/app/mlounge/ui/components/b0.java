package com.app.mlounge.ui.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.compose.foundation.c2;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.b4;
import androidx.compose.material3.h3;
import androidx.compose.material3.h4;
import androidx.compose.material3.m6;
import androidx.compose.material3.n3;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.s4;
import androidx.compose.material3.u5;
import androidx.compose.material3.x2;
import androidx.compose.material3.x3;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.s1;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.l2;
import androidx.core.content.FileProvider;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 1420747848, new androidx.compose.foundation.contextmenu.b(6));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 97568902, new androidx.compose.foundation.contextmenu.b(7));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, -114378379, new androidx.compose.ui.text.x(26));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(false, -257344572, new androidx.compose.foundation.contextmenu.b(8));
    public static final androidx.compose.runtime.internal.f e = new androidx.compose.runtime.internal.f(false, 2100120916, new androidx.compose.ui.text.x(27));
    public static final androidx.compose.runtime.internal.f f = new androidx.compose.runtime.internal.f(false, 1166339773, new androidx.compose.ui.text.x(28));
    public static final androidx.compose.runtime.internal.f g = new androidx.compose.runtime.internal.f(false, 375476921, new androidx.compose.ui.text.x(29));
    public static final androidx.compose.runtime.internal.f h = new androidx.compose.runtime.internal.f(false, -926414122, new c0(0));
    public static final androidx.compose.runtime.internal.f i = new androidx.compose.runtime.internal.f(false, 1598825750, new androidx.compose.foundation.contextmenu.b(9));

    public static final void a(int i2, androidx.compose.runtime.s sVar, androidx.compose.ui.r rVar, String str, List list, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        String str2 = str;
        list.getClass();
        lVar.getClass();
        sVar2.c0(2081442240);
        int i3 = 2;
        int i4 = i2 | (sVar2.h(list) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16);
        boolean zH = sVar2.h(lVar);
        int i5 = LibretroCore.SCREEN_WIDTH;
        int i6 = i4 | (zH ? 256 : 128) | 3072;
        if (sVar2.T(i6 & 1, (i6 & 1171) != 1170)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar2), false), 12, f2);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.ui.o oVar2 = oVar;
            q1.b(_COROUTINE.a.N(), "Filters", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar2, 3504, 0);
            sVar2.b0(-1049252540);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                Object objQ = sVar2.Q();
                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                if (objQ == fVar2) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f2)), i3, ((Boolean) _COROUTINE.a.B(kVar, sVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                boolean zF = ((i6 & 896) == i5) | sVar2.f(str3);
                Object objQ2 = sVar2.Q();
                if (zF || objQ2 == fVar2) {
                    objQ2 = new n0(lVar, str3, 0);
                    sVar2.l0(objQ2);
                }
                str2 = str;
                p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), kotlin.jvm.internal.l.a(str2, str3) ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-18119321, new o0(str2, str3, 0, (byte) 0), sVar2), sVar, 12582912, 120);
                sVar2 = sVar;
                i6 = i6;
                i5 = i5;
                oVar2 = oVar2;
                i3 = 2;
            }
            sVar2.p(false);
            sVar2.p(true);
            rVar2 = oVar2;
        } else {
            sVar2.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new k0(list, str2, lVar, rVar2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        boolean z2;
        int i4;
        kotlin.jvm.functions.a aVar2;
        int i5;
        boolean z3;
        boolean z4;
        s1 s1VarT;
        kotlin.jvm.functions.a aVar3;
        Object objQ;
        androidx.compose.runtime.f fVar;
        a1 a1Var;
        Object objQ2;
        a1 a1Var2;
        Object objQ3;
        a1 a1Var3;
        Object objQ4;
        a1 a1Var4;
        Object objQ5;
        Object objQ6;
        boolean z5;
        Object objQ7;
        a1 a1Var5;
        androidx.compose.runtime.f fVar2;
        boolean z6;
        kotlin.jvm.functions.a aVar4;
        boolean z7;
        Object objQ8;
        sVar.c0(1889076387);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else if ((i2 & 6) == 0) {
            z2 = z;
            i4 = (sVar.g(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                aVar2 = aVar;
                i4 |= sVar.h(aVar2) ? 32 : 16;
            }
            i5 = i4;
            if ((i5 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i5 & 1, z3)) {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i7 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                objQ = sVar.Q();
                fVar = androidx.compose.runtime.n.a;
                if (objQ == fVar) {
                    objQ = androidx.compose.runtime.t.r(null);
                    sVar.l0(objQ);
                }
                a1Var = (a1) objQ;
                objQ2 = sVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ2);
                }
                a1Var2 = (a1) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == fVar) {
                    objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ3);
                }
                a1Var3 = (a1) objQ3;
                objQ4 = sVar.Q();
                if (objQ4 == fVar) {
                    objQ4 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ4);
                }
                a1Var4 = (a1) objQ4;
                objQ5 = sVar.Q();
                if (objQ5 == fVar) {
                    objQ5 = new androidx.compose.runtime.f1(0.0f);
                    sVar.l0(objQ5);
                }
                androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) objQ5;
                objQ6 = sVar.Q();
                if (objQ6 == fVar) {
                    objQ6 = androidx.compose.runtime.t.r(null);
                    sVar.l0(objQ6);
                }
                a1 a1Var6 = (a1) objQ6;
                Context context = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
                Boolean boolValueOf = Boolean.valueOf(z4);
                if ((i5 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objQ7 = sVar.Q();
                if (z5 || objQ7 == fVar) {
                    androidx.compose.foundation.g gVar = new androidx.compose.foundation.g(z4, a1Var, a1Var2, a1Var3, (kotlin.coroutines.d) null);
                    sVar.l0(gVar);
                    objQ7 = gVar;
                }
                androidx.compose.runtime.l0.c(sVar, boolValueOf, (kotlin.jvm.functions.p) objQ7);
                if (((Boolean) a1Var3.getValue()).booleanValue()) {
                    sVar.b0(519031306);
                    if ((i5 & Token.ASSIGN_MOD) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objQ8 = sVar.Q();
                    if (z7 || objQ8 == fVar) {
                        objQ8 = new a(aVar3, a1Var3, 0);
                        sVar.l0(objQ8);
                    }
                    fVar2 = fVar;
                    a1Var5 = a1Var4;
                    z6 = true;
                    t1.a((kotlin.jvm.functions.a) objQ8, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(936483249, new f(aVar3, a1Var3, 0), sVar), sVar, 432, 0);
                    sVar.p(false);
                } else {
                    a1Var5 = a1Var4;
                    fVar2 = fVar;
                    z6 = true;
                    sVar.b0(520281567);
                    sVar.p(false);
                }
                if (((Boolean) a1Var2.getValue()).booleanValue() || ((y0) a1Var.getValue()) == null) {
                    aVar4 = aVar3;
                    sVar.b0(526612511);
                    sVar.p(false);
                } else {
                    sVar.b0(520521693);
                    y0 y0Var = (y0) a1Var.getValue();
                    y0Var.getClass();
                    boolean z8 = (i5 & Token.ASSIGN_MOD) == 32 ? z6 : false;
                    Object objQ9 = sVar.Q();
                    if (z8 || objQ9 == fVar2) {
                        objQ9 = new androidx.compose.foundation.gestures.g(11, aVar3, a1Var5, a1Var2);
                        sVar.l0(objQ9);
                    }
                    aVar4 = aVar3;
                    t1.a((kotlin.jvm.functions.a) objQ9, new androidx.compose.ui.window.w(4, !((Boolean) a1Var5.getValue()).booleanValue(), !((Boolean) a1Var5.getValue()).booleanValue()), androidx.compose.runtime.internal.k.c(-1083105574, new i(y0Var, a1Var5, f1Var, a1Var6, context, aVar4, a1Var2, 0), sVar), sVar, 384, 0);
                    sVar.p(false);
                }
                aVar2 = aVar4;
            } else {
                sVar.W();
                z4 = z2;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new j(z4, aVar2, i2, i3);
            }
        }
        i4 |= 48;
        aVar2 = aVar;
        i5 = i4;
        if ((i5 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sVar.T(i5 & 1, z3)) {
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (i7 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            objQ = sVar.Q();
            fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ);
            }
            a1Var = (a1) objQ;
            objQ2 = sVar.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            a1Var2 = (a1) objQ2;
            objQ3 = sVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ3);
            }
            a1Var3 = (a1) objQ3;
            objQ4 = sVar.Q();
            if (objQ4 == fVar) {
                objQ4 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ4);
            }
            a1Var4 = (a1) objQ4;
            objQ5 = sVar.Q();
            if (objQ5 == fVar) {
                objQ5 = new androidx.compose.runtime.f1(0.0f);
                sVar.l0(objQ5);
            }
            androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) objQ5;
            objQ6 = sVar.Q();
            if (objQ6 == fVar) {
                objQ6 = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ6);
            }
            a1 a1Var7 = (a1) objQ6;
            Context context2 = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            if ((i5 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            objQ7 = sVar.Q();
            if (z5) {
                androidx.compose.foundation.g gVar2 = new androidx.compose.foundation.g(z4, a1Var, a1Var2, a1Var3, (kotlin.coroutines.d) null);
                sVar.l0(gVar2);
                objQ7 = gVar2;
            } else {
                androidx.compose.foundation.g gVar3 = new androidx.compose.foundation.g(z4, a1Var, a1Var2, a1Var3, (kotlin.coroutines.d) null);
                sVar.l0(gVar3);
                objQ7 = gVar3;
            }
            androidx.compose.runtime.l0.c(sVar, boolValueOf2, (kotlin.jvm.functions.p) objQ7);
            if (((Boolean) a1Var3.getValue()).booleanValue()) {
                sVar.b0(519031306);
                if ((i5 & Token.ASSIGN_MOD) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objQ8 = sVar.Q();
                if (z7) {
                    objQ8 = new a(aVar3, a1Var3, 0);
                    sVar.l0(objQ8);
                } else {
                    objQ8 = new a(aVar3, a1Var3, 0);
                    sVar.l0(objQ8);
                }
                fVar2 = fVar;
                a1Var5 = a1Var4;
                z6 = true;
                t1.a((kotlin.jvm.functions.a) objQ8, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(936483249, new f(aVar3, a1Var3, 0), sVar), sVar, 432, 0);
                sVar.p(false);
            } else {
                a1Var5 = a1Var4;
                fVar2 = fVar;
                z6 = true;
                sVar.b0(520281567);
                sVar.p(false);
            }
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                aVar4 = aVar3;
                sVar.b0(526612511);
                sVar.p(false);
            } else {
                aVar4 = aVar3;
                sVar.b0(526612511);
                sVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            sVar.W();
            z4 = z2;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new j(z4, aVar2, i2, i3);
        }
    }

    public static final void c(kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.runtime.s sVar2;
        lVar.getClass();
        sVar.c0(1662977352);
        int i3 = (sVar.h(lVar) ? 4 : 2) | i2;
        if (sVar.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.activity.compose.b(1);
                sVar.l0(objQ);
            }
            sVar2 = sVar;
            t1.a((kotlin.jvm.functions.a) objQ, new androidx.compose.ui.window.w(false, false, false), androidx.compose.runtime.internal.k.c(-1560458095, new k(context, lVar, 0), sVar), sVar2, 438, 0);
        } else {
            sVar2 = sVar;
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.grid.g(i2, lVar);
        }
    }

    public static final void d(int i2, androidx.compose.ui.r rVar, int i3, boolean z, androidx.compose.runtime.s sVar, int i4) {
        androidx.compose.ui.r rVar2;
        int i5;
        s1 s1VarT;
        kotlin.jvm.functions.p jVar;
        Object obj;
        int i6 = i2;
        sVar.c0(-1251020004);
        int i7 = i4 | (sVar.d(i6) ? 4 : 2) | 384 | (sVar.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i7 & 1, (i7 & 1171) != 1170)) {
            if (i6 <= 0) {
                s1VarT = sVar.t();
                if (s1VarT == null) {
                    return;
                } else {
                    jVar = new l(i6, i4, 0, rVar, z);
                }
            } else {
                Context context = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
                Object objQ = sVar.Q();
                Object obj2 = androidx.compose.runtime.n.a;
                if (objQ == obj2) {
                    objQ = Boolean.valueOf(_COROUTINE.a.y(context, "android.permission.RECORD_AUDIO") == 0);
                    sVar.l0(objQ);
                }
                if (((Boolean) objQ).booleanValue()) {
                    rVar2 = rVar;
                    i6 = i2;
                    sVar.b0(-1704963802);
                    sVar.p(false);
                    Object objQ2 = sVar.Q();
                    if (objQ2 == obj2) {
                        androidx.compose.runtime.snapshots.q qVar = new androidx.compose.runtime.snapshots.q();
                        for (int i8 = 0; i8 < 48; i8++) {
                            obj = objQ2;
                            qVar.add(Float.valueOf(0.0f));
                        }
                        obj = objQ2;
                        sVar.l0(qVar);
                        obj = qVar;
                    }
                    obj = objQ2;
                    androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj;
                    Integer numValueOf = Integer.valueOf(i6);
                    boolean z2 = (i7 & 14) == 4;
                    Object objQ3 = sVar.Q();
                    if (z2 || objQ3 == obj2) {
                        objQ3 = new androidx.compose.foundation.lazy.grid.v(i6, qVar2, 2);
                        sVar.l0(objQ3);
                    }
                    androidx.compose.runtime.l0.b(numValueOf, (kotlin.jvm.functions.l) objQ3, sVar);
                    sVar.b0(360738454);
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.p(qVar2, 10));
                    ListIterator listIterator = qVar2.listIterator();
                    while (true) {
                        androidx.compose.runtime.snapshots.u uVar = (androidx.compose.runtime.snapshots.u) listIterator;
                        if (!uVar.hasNext()) {
                            break;
                        }
                        float fFloatValue = ((Number) uVar.next()).floatValue();
                        if (!z) {
                            fFloatValue = 0.0f;
                        }
                        arrayList.add(androidx.compose.animation.core.h.b(fFloatValue, androidx.compose.animation.core.e.n(0.75f, 200.0f, null, 4), sVar, 3120, 20));
                    }
                    sVar.p(false);
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(rVar2.d(i1.c), 24, 48);
                    boolean zH = sVar.h(arrayList);
                    Object objQ4 = sVar.Q();
                    if (zH || objQ4 == obj2) {
                        objQ4 = new androidx.compose.foundation.text.selection.o0(1, arrayList);
                        sVar.l0(objQ4);
                    }
                    androidx.compose.foundation.s.b(rVarR, (kotlin.jvm.functions.l) objQ4, sVar, 0);
                    i5 = 48;
                } else {
                    sVar.b0(-1705301113);
                    androidx.compose.ui.r rVarD = rVar.d(i1.c);
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
                    androidx.compose.ui.node.h.b.getClass();
                    kotlin.jvm.functions.a aVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(aVar);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    z5.b("Audio Visualizer ready (Grant permission to see it)", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).l, sVar, 390, 0, 131066);
                    sVar.p(true);
                    sVar.p(false);
                    s1VarT = sVar.t();
                    if (s1VarT == null) {
                        return;
                    } else {
                        jVar = new l(i2, i4, 1, rVar, z);
                    }
                }
            }
            s1VarT.d = jVar;
        }
        rVar2 = rVar;
        sVar.W();
        i5 = i3;
        s1VarT = sVar.t();
        if (s1VarT != null) {
            jVar = new j(i6, i5, i4, rVar2, z);
            s1VarT.d = jVar;
        }
    }

    public static final void e(kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2) {
        kotlin.jvm.functions.a aVar2;
        androidx.compose.runtime.s sVar2;
        aVar.getClass();
        sVar.c0(1148872412);
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = sVar.Q();
            kotlin.coroutines.d dVar = null;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.TRUE);
                sVar.l0(objQ2);
            }
            a1 a1Var2 = (a1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar) {
                objQ3 = new androidx.room.s(a1Var, a1Var2, dVar, 10);
                sVar.l0(objQ3);
            }
            androidx.compose.runtime.l0.c(sVar, kotlin.y.a, (kotlin.jvm.functions.p) objQ3);
            aVar2 = aVar;
            sVar2 = sVar;
            t1.a(aVar2, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(-956950157, new g(aVar, a1Var2, a1Var, 0), sVar), sVar2, 438, 0);
        } else {
            aVar2 = aVar;
            sVar2 = sVar;
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new h(aVar2, i2, 0);
        }
    }

    public static final void f(String str, String str2, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, String str3, String str4, kotlin.jvm.functions.a aVar2, androidx.compose.runtime.s sVar, int i2, int i3) {
        kotlin.jvm.functions.a aVar3;
        int i4;
        androidx.compose.ui.r rVar2;
        kotlin.jvm.functions.a aVar4;
        kotlin.jvm.functions.a aVar5;
        boolean z;
        androidx.compose.ui.r rVarE;
        kotlin.jvm.functions.a aVar6;
        boolean z2;
        Object h0Var;
        str.getClass();
        aVar.getClass();
        sVar.c0(-921782718);
        int i5 = i2 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | 3072 | (sVar.f(str3) ? 16384 : 8192);
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i4 = i5 | (sVar.h(aVar3) ? 1048576 : 524288);
        }
        int i7 = i4;
        if (sVar.T(i7 & 1, (533651 & i7) != 533650)) {
            if (i6 != 0) {
                aVar3 = null;
            }
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            long j = ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            a1 a1Var = (a1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ3);
            }
            a1 a1Var2 = (a1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == fVar) {
                objQ4 = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == fVar) {
                objQ5 = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ5);
            }
            a1 a1Var3 = (a1) objQ5;
            float f2 = 8;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f2);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.foundation.interaction.k kVar2 = kVar;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, dVarA), 2, j, androidx.compose.foundation.shape.e.a(f2));
            if (aVar3 != null) {
                sVar.b0(1192861558);
                boolean zH = sVar.h(coroutineScope) | ((3670016 & i7) == 1048576) | ((i7 & 896) == 256);
                Object objQ6 = sVar.Q();
                if (zH || objQ6 == fVar) {
                    h0Var = new h0(coroutineScope, aVar, a1Var2, a1Var3, aVar3, a1Var);
                    aVar5 = aVar;
                    sVar.l0(h0Var);
                } else {
                    h0Var = objQ6;
                    aVar5 = aVar;
                }
                rVarE = androidx.compose.ui.input.key.c.e(oVar, (kotlin.jvm.functions.l) h0Var);
                z = false;
                sVar.p(false);
            } else {
                aVar5 = aVar;
                fVar = fVar;
                aVar3 = aVar3;
                kVar2 = kVar2;
                z = false;
                sVar.b0(-1069832278);
                sVar.p(false);
                rVarE = oVar;
            }
            androidx.compose.ui.r rVarD = rVarG.d(rVarE);
            if (aVar3 == null) {
                sVar.b0(1195346672);
                sVar.p(z);
                z2 = z;
                aVar6 = null;
            } else {
                sVar.b0(1195346673);
                boolean zF = sVar.f(aVar3);
                Object objQ7 = sVar.Q();
                if (zF || objQ7 == fVar) {
                    objQ7 = new a(aVar3, a1Var, 4);
                    sVar.l0(objQ7);
                }
                aVar6 = (kotlin.jvm.functions.a) objQ7;
                z2 = false;
                sVar.p(false);
            }
            if ((i7 & 896) == 256) {
                z2 = true;
            }
            Object objQ8 = sVar.Q();
            if (z2 || objQ8 == fVar) {
                objQ8 = new a(aVar5, a1Var, 5);
                sVar.l0(objQ8);
            }
            androidx.compose.material3.q.c(androidx.compose.foundation.s.n(androidx.compose.foundation.s.l(rVarD, kVar2, aVar6, (kotlin.jvm.functions.a) objQ8), kVar2, 1), androidx.compose.foundation.shape.e.a(f2), androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.d, sVar, 6), null, androidx.compose.runtime.internal.k.c(319724340, new e0(0, str2, str, str3), sVar), sVar, 196608, 24);
            aVar4 = aVar3;
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
            aVar4 = aVar3;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.tvshows.h(str, str2, aVar, rVar2, str3, str4, aVar4, i2, i3);
        }
    }

    public static final void g(kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2) {
        sVar.c0(184817345);
        int i3 = (sVar.h(aVar) ? 256 : 128) | i2;
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 12;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(i1.e(androidx.compose.ui.o.b, 1.0f), androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i3 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new x2(6, aVar);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(602840198, new androidx.compose.ui.text.x(25), sVar), sVar, 12582912, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new h(aVar, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0183  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x0204  */
    /* JADX WARN: Code duplicated, block: B:166:0x020b  */
    /* JADX WARN: Code duplicated, block: B:169:0x021e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:173:0x022d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0240  */
    /* JADX WARN: Code duplicated, block: B:179:0x0253  */
    /* JADX WARN: Code duplicated, block: B:182:0x0262  */
    /* JADX WARN: Code duplicated, block: B:185:0x028a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0296  */
    /* JADX WARN: Code duplicated, block: B:188:0x0298  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:207:0x030e  */
    /* JADX WARN: Code duplicated, block: B:208:0x031a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0326  */
    /* JADX WARN: Code duplicated, block: B:211:0x0328  */
    /* JADX WARN: Code duplicated, block: B:215:0x0336  */
    /* JADX WARN: Code duplicated, block: B:219:0x034c  */
    /* JADX WARN: Code duplicated, block: B:220:0x034e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0357  */
    /* JADX WARN: Code duplicated, block: B:224:0x0359  */
    /* JADX WARN: Code duplicated, block: B:228:0x0364  */
    /* JADX WARN: Code duplicated, block: B:231:0x0375  */
    /* JADX WARN: Code duplicated, block: B:233:0x037f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0381  */
    /* JADX WARN: Code duplicated, block: B:238:0x038a  */
    /* JADX WARN: Code duplicated, block: B:241:0x039e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0413  */
    /* JADX WARN: Code duplicated, block: B:246:0x042e  */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final void h(final String str, final String str2, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, Double d2, String str3, kotlin.jvm.functions.a aVar2, androidx.compose.ui.layout.j jVar, androidx.compose.ui.graphics.painter.b bVar, float f2, boolean z, boolean z2, float f3, String str4, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        androidx.compose.ui.r rVar2;
        int i5;
        Double d3;
        int i6;
        int i7;
        int i8;
        String str5;
        int i9;
        int i10;
        final kotlin.jvm.functions.a aVar3;
        int i11;
        int i12;
        int i13;
        final androidx.compose.ui.layout.j jVar2;
        int i14;
        int i15;
        boolean zH;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z3;
        final androidx.compose.ui.graphics.painter.b bVar2;
        final float f4;
        final androidx.compose.ui.r rVar3;
        final Double d4;
        final String str6;
        final kotlin.jvm.functions.a aVar4;
        final boolean z4;
        final boolean z5;
        final float f5;
        final String str7;
        s1 s1VarT;
        androidx.compose.ui.r rVarT;
        androidx.compose.ui.layout.j jVar3;
        androidx.compose.ui.graphics.painter.b bVar3;
        float f6;
        boolean z6;
        boolean z7;
        float f7;
        String str8;
        Object objQ;
        Object obj;
        a1 a1VarB;
        long j;
        int i35;
        float f8;
        Object objQ2;
        final a1 a1Var;
        Object objQ3;
        a1 a1Var2;
        Object objQ4;
        CoroutineScope coroutineScope;
        Object objQ5;
        a1 a1Var3;
        final kotlin.jvm.functions.a aVar5;
        Double d5;
        final String str9;
        int i36;
        boolean z8;
        androidx.compose.ui.r rVar4;
        boolean z9;
        boolean zF;
        Object objQ6;
        kotlin.jvm.functions.a aVar6;
        int i37;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objQ7;
        boolean z13;
        boolean z14;
        Object objQ8;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ9;
        str.getClass();
        aVar.getClass();
        sVar.c0(-1559002577);
        int i38 = (sVar.f(str) ? 4 : 2) | i2 | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        int i39 = i4 & 8;
        int i40 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i39 == 0) {
            if ((i2 & 3072) == 0) {
                rVar2 = rVar;
                i38 |= sVar.f(rVar2) ? 2048 : 1024;
            }
            i5 = i4 & 16;
            if (i5 != 0) {
                i7 = i38 | 24576;
                d3 = d2;
            } else {
                d3 = d2;
                if (sVar.f(d3)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i7 = i38 | i6;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i7 |= 196608;
                str5 = str3;
            } else {
                str5 = str3;
                if ((i2 & 196608) == 0) {
                    if (sVar.f(str5)) {
                        i9 = 131072;
                    } else {
                        i9 = Parser.ARGC_LIMIT;
                    }
                    i7 |= i9;
                }
            }
            i10 = i4 & 64;
            if (i10 != 0) {
                i12 = i7 | 1572864;
                aVar3 = aVar2;
            } else {
                aVar3 = aVar2;
                if (sVar.h(aVar3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i7 | i11;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i12 |= 12582912;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i2 & 12582912) == 0) {
                    if (sVar.f(jVar2)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i12 |= i14;
                }
            }
            i15 = i4 & LibretroCore.SCREEN_WIDTH;
            if (i15 != 0) {
                i16 = 100663296;
            } else {
                if ((i2 & 134217728) == 0) {
                    zH = sVar.f(bVar);
                } else {
                    zH = sVar.h(bVar);
                }
                if (zH) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
            }
            i17 = i12 | i16;
            i18 = i4 & 512;
            if (i18 != 0) {
                i20 = i17 | 805306368;
            } else {
                if (sVar.c(f2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i20 = i17 | i19;
            }
            i21 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i21 != 0) {
                i23 = i3 | 6;
            } else {
                if (sVar.g(z)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i23 = i3 | i22;
            }
            i24 = i4 & 2048;
            if (i24 != 0) {
                i26 = i23 | 48;
            } else {
                if (sVar.g(z2)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i26 = i23 | i25;
            }
            i27 = i26;
            i28 = i4 & 4096;
            if (i28 != 0) {
                i30 = i27 | 384;
            } else {
                i29 = i27;
                if ((i3 & 384) != 0) {
                    if (sVar.c(f3)) {
                        i31 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i31 = 128;
                    }
                    i29 |= i31;
                }
                i30 = i29;
            }
            i32 = i4 & 8192;
            if (i32 != 0) {
                i34 = i30 | 3072;
            } else {
                i33 = i30;
                if ((i3 & 3072) == 0) {
                    if (sVar.f(str4)) {
                        i40 = 2048;
                    }
                    i34 = i33 | i40;
                } else {
                    i34 = i33;
                }
            }
            if ((i20 & 306783379) == 306783378 || (i34 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i20 & 1, z3)) {
                rVarT = androidx.compose.ui.o.b;
                if (i39 != 0) {
                    rVar2 = rVarT;
                }
                if (i5 != 0) {
                    d3 = null;
                }
                if (i8 != 0) {
                    str5 = null;
                }
                if (i10 != 0) {
                    aVar3 = null;
                }
                if (i13 != 0) {
                    jVar3 = androidx.compose.ui.layout.i.a;
                } else {
                    jVar3 = jVar2;
                }
                if (i15 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i18 != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f2;
                }
                if (i21 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i24 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i28 != 0) {
                    f7 = 0.6666667f;
                } else {
                    f7 = f3;
                }
                if (i32 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                objQ = sVar.Q();
                obj = androidx.compose.runtime.n.a;
                if (objQ == obj) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = androidx.compose.ui.graphics.t.h;
                }
                i35 = i20;
                long j2 = j;
                final androidx.compose.ui.layout.j jVar4 = jVar3;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    f8 = 8;
                } else {
                    f8 = 2;
                }
                objQ2 = sVar.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ2);
                }
                a1Var = (a1) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == obj) {
                    objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ3);
                }
                a1Var2 = (a1) objQ3;
                objQ4 = sVar.Q();
                if (objQ4 == obj) {
                    objQ4 = androidx.compose.runtime.l0.f(sVar);
                    sVar.l0(objQ4);
                }
                coroutineScope = (CoroutineScope) objQ4;
                objQ5 = sVar.Q();
                if (objQ5 == obj) {
                    objQ5 = androidx.compose.runtime.t.r(null);
                    sVar.l0(objQ5);
                }
                a1Var3 = (a1) objQ5;
                float f9 = 8;
                final float f10 = f6;
                androidx.compose.ui.r rVar5 = rVar2;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar2, androidx.compose.foundation.shape.e.a(f9)), 2, j2, androidx.compose.foundation.shape.e.a(f9));
                if (aVar3 != null) {
                    sVar.b0(1532165806);
                    if ((i34 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zH2 = z15 | sVar.h(coroutineScope);
                    if ((i35 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z19 = zH2 | z16;
                    i36 = i35;
                    if ((i36 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objQ9 = sVar.Q();
                    if (!z18 || objQ9 == obj) {
                        String str10 = str8;
                        objQ9 = new i0(str10, coroutineScope, aVar, a1Var2, a1Var, a1Var3, aVar3);
                        str9 = str10;
                        aVar5 = aVar;
                        sVar.l0(objQ9);
                    } else {
                        aVar5 = aVar;
                        str9 = str8;
                    }
                    androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarT, (kotlin.jvm.functions.l) objQ9);
                    z8 = false;
                    sVar.p(false);
                    Double d6 = d3;
                    rVar4 = rVarE;
                    d5 = d6;
                } else {
                    aVar5 = aVar;
                    a1Var = a1Var;
                    d5 = d3;
                    str9 = str8;
                    i36 = i35;
                    z8 = false;
                    sVar.b0(742252983);
                    sVar.p(false);
                    rVar4 = rVarT;
                }
                androidx.compose.ui.r rVarD = rVarG.d(rVar4);
                if (aVar3 == null) {
                    sVar.b0(1535612819);
                    sVar.p(z8);
                    aVar6 = null;
                } else {
                    sVar.b0(1535612820);
                    if ((i34 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zF = z9 | sVar.f(aVar3);
                    objQ6 = sVar.Q();
                    if (zF || objQ6 == obj) {
                        final int i41 = 0;
                        objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i41) {
                                    case 0:
                                        String str11 = str9;
                                        kotlin.jvm.functions.a aVar7 = aVar3;
                                        a1 a1Var4 = a1Var;
                                        if (str11 != null) {
                                            Context context = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str11, "combined long-press fired");
                                        }
                                        a1Var4.setValue(Boolean.TRUE);
                                        aVar7.invoke();
                                        break;
                                    default:
                                        String str12 = str9;
                                        kotlin.jvm.functions.a aVar8 = aVar3;
                                        a1 a1Var5 = a1Var;
                                        if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                            if (str12 != null) {
                                                Context context2 = com.app.mlounge.util.a.a;
                                                com.app.mlounge.util.a.a("D", str12, "combinedClick swallowed (longClickFired reset)");
                                            }
                                            a1Var5.setValue(Boolean.FALSE);
                                        } else {
                                            if (str12 != null) {
                                                Context context3 = com.app.mlounge.util.a.a;
                                                com.app.mlounge.util.a.a("D", str12, "combinedClick dispatching onClick");
                                            }
                                            aVar8.invoke();
                                        }
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ6);
                    }
                    aVar6 = (kotlin.jvm.functions.a) objQ6;
                    sVar.p(false);
                }
                i37 = i34 & 7168;
                if (i37 == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = z10;
                if ((i36 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z20 | z11;
                objQ7 = sVar.Q();
                if (z12 || objQ7 == obj) {
                    final int i42 = 1;
                    objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i42) {
                                case 0:
                                    String str11 = str9;
                                    kotlin.jvm.functions.a aVar7 = aVar5;
                                    a1 a1Var4 = a1Var;
                                    if (str11 != null) {
                                        Context context = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str11, "combined long-press fired");
                                    }
                                    a1Var4.setValue(Boolean.TRUE);
                                    aVar7.invoke();
                                    break;
                                default:
                                    String str12 = str9;
                                    kotlin.jvm.functions.a aVar8 = aVar5;
                                    a1 a1Var5 = a1Var;
                                    if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                        if (str12 != null) {
                                            Context context2 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str12, "combinedClick swallowed (longClickFired reset)");
                                        }
                                        a1Var5.setValue(Boolean.FALSE);
                                    } else {
                                        if (str12 != null) {
                                            Context context3 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str12, "combinedClick dispatching onClick");
                                        }
                                        aVar8.invoke();
                                    }
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ7);
                }
                androidx.compose.ui.r rVarL = androidx.compose.foundation.s.l(rVarD, kVar, aVar6, (kotlin.jvm.functions.a) objQ7);
                if (str9 != null) {
                    sVar.b0(742281133);
                    if (i37 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ8 = sVar.Q();
                    if (z14 || objQ8 == obj) {
                        objQ8 = new com.app.mlounge.data.local.dao.l(str9, 4);
                        sVar.l0(objQ8);
                    }
                    rVarT = androidx.compose.ui.focus.d.t(rVarT, (kotlin.jvm.functions.l) objQ8);
                    z13 = false;
                } else {
                    z13 = false;
                    sVar.b0(742283255);
                }
                sVar.p(z13);
                final Double d7 = d5;
                final String str11 = str5;
                final boolean z21 = z6;
                final float f11 = f7;
                final boolean z22 = z7;
                final androidx.compose.ui.graphics.painter.b bVar4 = bVar3;
                androidx.compose.material3.q.c(androidx.compose.foundation.s.n(rVarL.d(rVarT), kVar, 1), androidx.compose.foundation.shape.e.a(f9), androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.d, sVar, 6), androidx.compose.material3.q.k(62, f8), androidx.compose.runtime.internal.k.c(1107814689, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.components.g0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v17 */
                    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r1v27 */
                    @Override // kotlin.jvm.functions.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
                        ?? r1;
                        long j3;
                        androidx.compose.runtime.s sVar2;
                        androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        androidx.compose.ui.j jVar5 = androidx.compose.ui.c.e;
                        ((androidx.compose.foundation.layout.x) obj2).getClass();
                        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar5, false);
                            int iHashCode = Long.hashCode(sVar3.T);
                            androidx.compose.runtime.internal.j jVarL = sVar3.l();
                            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, oVar);
                            androidx.compose.ui.node.h.b.getClass();
                            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                            sVar3.e0();
                            if (sVar3.S) {
                                sVar3.k(fVar);
                            } else {
                                sVar3.o0();
                            }
                            androidx.compose.runtime.t.x(sVar3, q0VarD, androidx.compose.ui.node.g.f);
                            androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                            androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                            androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                            androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                            androidx.compose.ui.graphics.painter.b bVarS = bVar4;
                            if (bVarS == null) {
                                sVar3.b0(-1992286185);
                                bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar3);
                            } else {
                                sVar3.b0(-1992286650);
                            }
                            sVar3.p(false);
                            androidx.compose.ui.graphics.painter.b bVar5 = bVarS;
                            String str12 = str2;
                            if (str12 == null) {
                                str12 = "";
                            }
                            androidx.compose.ui.r rVarE2 = i1.e(oVar, 1.0f);
                            float f12 = f11;
                            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.layout.b.g(rVarE2, f12);
                            String str13 = str;
                            coil3.compose.k.c(str12, str13, rVarG2, bVar5, bVar5, null, jVar4, sVar3, 36864, 0, 31712);
                            androidx.compose.ui.r rVarG3 = androidx.compose.foundation.layout.b.g(i1.e(oVar, 1.0f), f12);
                            kotlin.k kVar2 = new kotlin.k(Float.valueOf(0.35f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.h));
                            Float fValueOf = Float.valueOf(0.65f);
                            long j4 = androidx.compose.ui.graphics.t.b;
                            kotlin.k[] kVarArr = (kotlin.k[]) Arrays.copyOf(new kotlin.k[]{kVar2, new kotlin.k(fValueOf, new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.75f, j4))), new kotlin.k(Float.valueOf(1.0f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.97f, j4)))}, 3);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                            ArrayList arrayList = new ArrayList(kVarArr.length);
                            for (kotlin.k kVar3 : kVarArr) {
                                arrayList.add(new androidx.compose.ui.graphics.t(((androidx.compose.ui.graphics.t) kVar3.y).a));
                            }
                            ArrayList arrayList2 = new ArrayList(kVarArr.length);
                            for (kotlin.k kVar4 : kVarArr) {
                                arrayList2.add(Float.valueOf(((Number) kVar4.e).floatValue()));
                            }
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG3, new androidx.compose.ui.graphics.e0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2)), sVar3, 0);
                            Double d8 = d7;
                            if (d8 == null || d8.doubleValue() <= 0.0d) {
                                r1 = 0;
                                sVar3.b0(-1629421477);
                                sVar3.p(false);
                            } else {
                                sVar3.b0(-1630185906);
                                r1 = 0;
                                p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), androidx.compose.ui.c.z), androidx.compose.foundation.shape.e.a(4), d8.doubleValue() >= 7.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p) : d8.doubleValue() >= 5.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i) : androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.o), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1350699997, new androidx.compose.animation.core.g0(d8, 20), sVar3), sVar3, 12582912, 120);
                                sVar3.p(false);
                            }
                            if (z21) {
                                sVar3.b0(-1629330461);
                                p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), jVar5), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p), 0L, 0.0f, 0.0f, b0.e, sVar3, 12583296, 120);
                                sVar3.p(r1);
                            } else if (z22) {
                                sVar3.b0(-1628709438);
                                p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), jVar5), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i), 0L, 0.0f, 0.0f, b0.f, sVar3, 12583296, 120);
                                sVar3.p(r1);
                            } else {
                                sVar3.b0(-1628210245);
                                sVar3.p(r1);
                            }
                            androidx.compose.ui.j jVar6 = androidx.compose.ui.c.D;
                            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(androidx.compose.foundation.layout.t.e(oVar, jVar6), 1.0f), 8);
                            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, r1);
                            int iHashCode2 = Long.hashCode(sVar3.T);
                            androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarQ);
                            androidx.compose.ui.node.h.b.getClass();
                            kotlin.jvm.functions.a aVar7 = androidx.compose.ui.node.g.b;
                            sVar3.e0();
                            if (sVar3.S) {
                                sVar3.k(aVar7);
                            } else {
                                sVar3.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                            androidx.compose.runtime.t.x(sVar3, wVarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                            androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                            androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                            androidx.compose.runtime.t.t(sVar3, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                            androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                            r1 r1Var = n6.a;
                            androidx.compose.ui.text.m0 m0Var = ((m6) sVar3.j(r1Var)).n;
                            long j5 = androidx.compose.ui.graphics.t.d;
                            z5.b(str13, null, j5, 0L, null, 0L, new androidx.compose.ui.text.style.k(5), 0L, 2, false, 2, 0, m0Var, sVar3, 384, 24960, 109562);
                            androidx.compose.runtime.s sVar4 = sVar3;
                            String str14 = str11;
                            if (str14 != null) {
                                sVar4.b0(-1035013059);
                                j3 = j5;
                                z5.b(str14, null, androidx.compose.ui.graphics.t.b(0.7f, j5), 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar4.j(r1Var)).o, sVar4, 384, 24960, 110586);
                                androidx.compose.runtime.s sVar5 = sVar4;
                                sVar5.p(false);
                                sVar2 = sVar5;
                            } else {
                                j3 = j5;
                                sVar4.b0(-1034710747);
                                sVar4.p(false);
                                sVar2 = sVar4;
                            }
                            sVar2.p(true);
                            float f13 = f10;
                            if (f13 > 0.0f) {
                                sVar2.b0(-1627148991);
                                androidx.compose.ui.r rVarE3 = androidx.compose.foundation.layout.t.e(i1.g(i1.e(oVar, 1.0f), 3), jVar6);
                                androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar5, false);
                                int iHashCode3 = Long.hashCode(sVar2.T);
                                androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar2, rVarE3);
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(aVar7);
                                } else {
                                    sVar2.o0();
                                }
                                androidx.compose.runtime.t.x(sVar2, q0VarD2, eVar);
                                androidx.compose.runtime.t.x(sVar2, jVarL3, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                                androidx.compose.runtime.t.x(sVar2, rVarC3, eVar4);
                                androidx.compose.ui.r rVarE4 = i1.e(i1.c(oVar, 1.0f), 1.0f);
                                long jB = androidx.compose.ui.graphics.t.b(0.25f, j3);
                                androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(rVarE4, jB, j0Var), sVar2, 6);
                                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(i1.e(i1.c(oVar, 1.0f), kotlin.collections.i0.c(f13, 0.0f, 1.0f)), com.app.mlounge.ui.theme.b.f, j0Var), sVar2, 0);
                                sVar2.p(true);
                                sVar2.p(false);
                            } else {
                                sVar2.b0(-1626416709);
                                sVar2.p(false);
                            }
                            sVar2.p(true);
                        } else {
                            sVar3.W();
                        }
                        return kotlin.y.a;
                    }
                }, sVar), sVar, 196608, 16);
                kotlin.jvm.functions.a aVar7 = aVar3;
                str7 = str9;
                aVar4 = aVar7;
                z4 = z21;
                d4 = d7;
                str6 = str5;
                f5 = f7;
                bVar2 = bVar3;
                rVar3 = rVar5;
                f4 = f10;
                z5 = z22;
                jVar2 = jVar4;
            } else {
                sVar.W();
                bVar2 = bVar;
                f4 = f2;
                rVar3 = rVar2;
                d4 = d3;
                str6 = str5;
                aVar4 = aVar3;
                z4 = z;
                z5 = z2;
                f5 = f3;
                str7 = str4;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.d0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = androidx.compose.runtime.t.A(i2 | 1);
                        int iA2 = androidx.compose.runtime.t.A(i3);
                        b0.h(str, str2, aVar, rVar3, d4, str6, aVar4, jVar2, bVar2, f4, z4, z5, f5, str7, (androidx.compose.runtime.s) obj2, iA, iA2, i4);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i38 |= 3072;
        rVar2 = rVar;
        i5 = i4 & 16;
        if (i5 != 0) {
            i7 = i38 | 24576;
            d3 = d2;
        } else {
            d3 = d2;
            if (sVar.f(d3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i38 | i6;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            i7 |= 196608;
            str5 = str3;
        } else {
            str5 = str3;
            if ((i2 & 196608) == 0) {
                if (sVar.f(str5)) {
                    i9 = 131072;
                } else {
                    i9 = Parser.ARGC_LIMIT;
                }
                i7 |= i9;
            }
        }
        i10 = i4 & 64;
        if (i10 != 0) {
            i12 = i7 | 1572864;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            if (sVar.h(aVar3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i12 = i7 | i11;
        }
        i13 = i4 & 128;
        if (i13 != 0) {
            i12 |= 12582912;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i2 & 12582912) == 0) {
                if (sVar.f(jVar2)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i12 |= i14;
            }
        }
        i15 = i4 & LibretroCore.SCREEN_WIDTH;
        if (i15 != 0) {
            i16 = 100663296;
        } else {
            if ((i2 & 134217728) == 0) {
                zH = sVar.f(bVar);
            } else {
                zH = sVar.h(bVar);
            }
            if (zH) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
        }
        i17 = i12 | i16;
        i18 = i4 & 512;
        if (i18 != 0) {
            i20 = i17 | 805306368;
        } else {
            if (sVar.c(f2)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i20 = i17 | i19;
        }
        i21 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i21 != 0) {
            i23 = i3 | 6;
        } else {
            if (sVar.g(z)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i23 = i3 | i22;
        }
        i24 = i4 & 2048;
        if (i24 != 0) {
            i26 = i23 | 48;
        } else {
            if (sVar.g(z2)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i26 = i23 | i25;
        }
        i27 = i26;
        i28 = i4 & 4096;
        if (i28 != 0) {
            i30 = i27 | 384;
        } else {
            i29 = i27;
            if ((i3 & 384) != 0) {
                if (sVar.c(f3)) {
                    i31 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i31 = 128;
                }
                i29 |= i31;
            }
            i30 = i29;
        }
        i32 = i4 & 8192;
        if (i32 != 0) {
            i34 = i30 | 3072;
        } else {
            i33 = i30;
            if ((i3 & 3072) == 0) {
                if (sVar.f(str4)) {
                    i40 = 2048;
                }
                i34 = i33 | i40;
            } else {
                i34 = i33;
            }
        }
        if ((i20 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (sVar.T(i20 & 1, z3)) {
            rVarT = androidx.compose.ui.o.b;
            if (i39 != 0) {
                rVar2 = rVarT;
            }
            if (i5 != 0) {
                d3 = null;
            }
            if (i8 != 0) {
                str5 = null;
            }
            if (i10 != 0) {
                aVar3 = null;
            }
            if (i13 != 0) {
                jVar3 = androidx.compose.ui.layout.i.a;
            } else {
                jVar3 = jVar2;
            }
            if (i15 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i18 != 0) {
                f6 = 0.0f;
            } else {
                f6 = f2;
            }
            if (i21 != 0) {
                z6 = false;
            } else {
                z6 = z;
            }
            if (i24 != 0) {
                z7 = false;
            } else {
                z7 = z2;
            }
            if (i28 != 0) {
                f7 = 0.6666667f;
            } else {
                f7 = f3;
            }
            if (i32 != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            objQ = sVar.Q();
            obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ;
            a1VarB = _COROUTINE.a.B(kVar2, sVar, 6);
            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                j = com.app.mlounge.ui.theme.b.q;
            } else {
                j = androidx.compose.ui.graphics.t.h;
            }
            i35 = i20;
            long j3 = j;
            final androidx.compose.ui.layout.j jVar5 = jVar3;
            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                f8 = 8;
            } else {
                f8 = 2;
            }
            objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            a1Var = (a1) objQ2;
            objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ3);
            }
            a1Var2 = (a1) objQ3;
            objQ4 = sVar.Q();
            if (objQ4 == obj) {
                objQ4 = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ4);
            }
            coroutineScope = (CoroutineScope) objQ4;
            objQ5 = sVar.Q();
            if (objQ5 == obj) {
                objQ5 = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ5);
            }
            a1Var3 = (a1) objQ5;
            float f12 = 8;
            final float f13 = f6;
            androidx.compose.ui.r rVar6 = rVar2;
            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar2, androidx.compose.foundation.shape.e.a(f12)), 2, j3, androidx.compose.foundation.shape.e.a(f12));
            if (aVar3 != null) {
                sVar.b0(1532165806);
                if ((i34 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zH3 = z15 | sVar.h(coroutineScope);
                if ((i35 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z110 = zH3 | z16;
                i36 = i35;
                if ((i36 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z110 | z17;
                objQ9 = sVar.Q();
                if (z18) {
                    String str12 = str8;
                    objQ9 = new i0(str12, coroutineScope, aVar, a1Var2, a1Var, a1Var3, aVar3);
                    str9 = str12;
                    aVar5 = aVar;
                    sVar.l0(objQ9);
                } else {
                    String str13 = str8;
                    objQ9 = new i0(str13, coroutineScope, aVar, a1Var2, a1Var, a1Var3, aVar3);
                    str9 = str13;
                    aVar5 = aVar;
                    sVar.l0(objQ9);
                }
                androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarT, (kotlin.jvm.functions.l) objQ9);
                z8 = false;
                sVar.p(false);
                Double d8 = d3;
                rVar4 = rVarE2;
                d5 = d8;
            } else {
                aVar5 = aVar;
                a1Var = a1Var;
                d5 = d3;
                str9 = str8;
                i36 = i35;
                z8 = false;
                sVar.b0(742252983);
                sVar.p(false);
                rVar4 = rVarT;
            }
            androidx.compose.ui.r rVarD2 = rVarG2.d(rVar4);
            if (aVar3 == null) {
                sVar.b0(1535612819);
                sVar.p(z8);
                aVar6 = null;
            } else {
                sVar.b0(1535612820);
                if ((i34 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zF = z9 | sVar.f(aVar3);
                objQ6 = sVar.Q();
                if (zF) {
                    final int i43 = 0;
                    objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i43) {
                                case 0:
                                    String str14 = str9;
                                    kotlin.jvm.functions.a aVar8 = aVar3;
                                    a1 a1Var4 = a1Var;
                                    if (str14 != null) {
                                        Context context = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str14, "combined long-press fired");
                                    }
                                    a1Var4.setValue(Boolean.TRUE);
                                    aVar8.invoke();
                                    break;
                                default:
                                    String str15 = str9;
                                    kotlin.jvm.functions.a aVar9 = aVar3;
                                    a1 a1Var5 = a1Var;
                                    if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                        if (str15 != null) {
                                            Context context2 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str15, "combinedClick swallowed (longClickFired reset)");
                                        }
                                        a1Var5.setValue(Boolean.FALSE);
                                    } else {
                                        if (str15 != null) {
                                            Context context3 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str15, "combinedClick dispatching onClick");
                                        }
                                        aVar9.invoke();
                                    }
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ6);
                } else {
                    final int i44 = 0;
                    objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i44) {
                                case 0:
                                    String str14 = str9;
                                    kotlin.jvm.functions.a aVar8 = aVar3;
                                    a1 a1Var4 = a1Var;
                                    if (str14 != null) {
                                        Context context = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str14, "combined long-press fired");
                                    }
                                    a1Var4.setValue(Boolean.TRUE);
                                    aVar8.invoke();
                                    break;
                                default:
                                    String str15 = str9;
                                    kotlin.jvm.functions.a aVar9 = aVar3;
                                    a1 a1Var5 = a1Var;
                                    if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                        if (str15 != null) {
                                            Context context2 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str15, "combinedClick swallowed (longClickFired reset)");
                                        }
                                        a1Var5.setValue(Boolean.FALSE);
                                    } else {
                                        if (str15 != null) {
                                            Context context3 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", str15, "combinedClick dispatching onClick");
                                        }
                                        aVar9.invoke();
                                    }
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ6);
                }
                aVar6 = (kotlin.jvm.functions.a) objQ6;
                sVar.p(false);
            }
            i37 = i34 & 7168;
            if (i37 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z23 = z10;
            if ((i36 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z23 | z11;
            objQ7 = sVar.Q();
            if (z12) {
                final int i45 = 1;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i45) {
                            case 0:
                                String str14 = str9;
                                kotlin.jvm.functions.a aVar8 = aVar5;
                                a1 a1Var4 = a1Var;
                                if (str14 != null) {
                                    Context context = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.a("D", str14, "combined long-press fired");
                                }
                                a1Var4.setValue(Boolean.TRUE);
                                aVar8.invoke();
                                break;
                            default:
                                String str15 = str9;
                                kotlin.jvm.functions.a aVar9 = aVar5;
                                a1 a1Var5 = a1Var;
                                if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                    if (str15 != null) {
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str15, "combinedClick swallowed (longClickFired reset)");
                                    }
                                    a1Var5.setValue(Boolean.FALSE);
                                } else {
                                    if (str15 != null) {
                                        Context context3 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str15, "combinedClick dispatching onClick");
                                    }
                                    aVar9.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ7);
            } else {
                final int i46 = 1;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.f0
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i46) {
                            case 0:
                                String str14 = str9;
                                kotlin.jvm.functions.a aVar8 = aVar5;
                                a1 a1Var4 = a1Var;
                                if (str14 != null) {
                                    Context context = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.a("D", str14, "combined long-press fired");
                                }
                                a1Var4.setValue(Boolean.TRUE);
                                aVar8.invoke();
                                break;
                            default:
                                String str15 = str9;
                                kotlin.jvm.functions.a aVar9 = aVar5;
                                a1 a1Var5 = a1Var;
                                if (((Boolean) a1Var5.getValue()).booleanValue()) {
                                    if (str15 != null) {
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str15, "combinedClick swallowed (longClickFired reset)");
                                    }
                                    a1Var5.setValue(Boolean.FALSE);
                                } else {
                                    if (str15 != null) {
                                        Context context3 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", str15, "combinedClick dispatching onClick");
                                    }
                                    aVar9.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ7);
            }
            androidx.compose.ui.r rVarL2 = androidx.compose.foundation.s.l(rVarD2, kVar2, aVar6, (kotlin.jvm.functions.a) objQ7);
            if (str9 != null) {
                sVar.b0(742281133);
                if (i37 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ8 = sVar.Q();
                if (z14) {
                    objQ8 = new com.app.mlounge.data.local.dao.l(str9, 4);
                    sVar.l0(objQ8);
                } else {
                    objQ8 = new com.app.mlounge.data.local.dao.l(str9, 4);
                    sVar.l0(objQ8);
                }
                rVarT = androidx.compose.ui.focus.d.t(rVarT, (kotlin.jvm.functions.l) objQ8);
                z13 = false;
            } else {
                z13 = false;
                sVar.b0(742283255);
            }
            sVar.p(z13);
            final Double d9 = d5;
            final String str14 = str5;
            final boolean z24 = z6;
            final float f14 = f7;
            final boolean z25 = z7;
            final androidx.compose.ui.graphics.painter.b bVar5 = bVar3;
            androidx.compose.material3.q.c(androidx.compose.foundation.s.n(rVarL2.d(rVarT), kVar2, 1), androidx.compose.foundation.shape.e.a(f12), androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.d, sVar, 6), androidx.compose.material3.q.k(62, f8), androidx.compose.runtime.internal.k.c(1107814689, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.components.g0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v27 */
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
                    ?? r1;
                    long j4;
                    androidx.compose.runtime.s sVar2;
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.j jVar6 = androidx.compose.ui.c.e;
                    ((androidx.compose.foundation.layout.x) obj2).getClass();
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar6, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        androidx.compose.runtime.internal.j jVarL = sVar3.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, oVar);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(fVar);
                        } else {
                            sVar3.o0();
                        }
                        androidx.compose.runtime.t.x(sVar3, q0VarD, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                        androidx.compose.ui.graphics.painter.b bVarS = bVar5;
                        if (bVarS == null) {
                            sVar3.b0(-1992286185);
                            bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar3);
                        } else {
                            sVar3.b0(-1992286650);
                        }
                        sVar3.p(false);
                        androidx.compose.ui.graphics.painter.b bVar6 = bVarS;
                        String str15 = str2;
                        if (str15 == null) {
                            str15 = "";
                        }
                        androidx.compose.ui.r rVarE3 = i1.e(oVar, 1.0f);
                        float f15 = f14;
                        androidx.compose.ui.r rVarG3 = androidx.compose.foundation.layout.b.g(rVarE3, f15);
                        String str16 = str;
                        coil3.compose.k.c(str15, str16, rVarG3, bVar6, bVar6, null, jVar5, sVar3, 36864, 0, 31712);
                        androidx.compose.ui.r rVarG4 = androidx.compose.foundation.layout.b.g(i1.e(oVar, 1.0f), f15);
                        kotlin.k kVar3 = new kotlin.k(Float.valueOf(0.35f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.h));
                        Float fValueOf = Float.valueOf(0.65f);
                        long j5 = androidx.compose.ui.graphics.t.b;
                        kotlin.k[] kVarArr = (kotlin.k[]) Arrays.copyOf(new kotlin.k[]{kVar3, new kotlin.k(fValueOf, new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.75f, j5))), new kotlin.k(Float.valueOf(1.0f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.97f, j5)))}, 3);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                        ArrayList arrayList = new ArrayList(kVarArr.length);
                        for (kotlin.k kVar4 : kVarArr) {
                            arrayList.add(new androidx.compose.ui.graphics.t(((androidx.compose.ui.graphics.t) kVar4.y).a));
                        }
                        ArrayList arrayList2 = new ArrayList(kVarArr.length);
                        for (kotlin.k kVar5 : kVarArr) {
                            arrayList2.add(Float.valueOf(((Number) kVar5.e).floatValue()));
                        }
                        androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG4, new androidx.compose.ui.graphics.e0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2)), sVar3, 0);
                        Double d10 = d9;
                        if (d10 == null || d10.doubleValue() <= 0.0d) {
                            r1 = 0;
                            sVar3.b0(-1629421477);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-1630185906);
                            r1 = 0;
                            p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), androidx.compose.ui.c.z), androidx.compose.foundation.shape.e.a(4), d10.doubleValue() >= 7.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p) : d10.doubleValue() >= 5.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i) : androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.o), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1350699997, new androidx.compose.animation.core.g0(d10, 20), sVar3), sVar3, 12582912, 120);
                            sVar3.p(false);
                        }
                        if (z24) {
                            sVar3.b0(-1629330461);
                            p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), jVar6), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p), 0L, 0.0f, 0.0f, b0.e, sVar3, 12583296, 120);
                            sVar3.p(r1);
                        } else if (z25) {
                            sVar3.b0(-1628709438);
                            p5.a(androidx.compose.foundation.layout.t.e(androidx.compose.foundation.layout.b.q(oVar, 6), jVar6), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i), 0L, 0.0f, 0.0f, b0.f, sVar3, 12583296, 120);
                            sVar3.p(r1);
                        } else {
                            sVar3.b0(-1628210245);
                            sVar3.p(r1);
                        }
                        androidx.compose.ui.j jVar7 = androidx.compose.ui.c.D;
                        androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(androidx.compose.foundation.layout.t.e(oVar, jVar7), 1.0f), 8);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, r1);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarQ);
                        androidx.compose.ui.node.h.b.getClass();
                        kotlin.jvm.functions.a aVar8 = androidx.compose.ui.node.g.b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(aVar8);
                        } else {
                            sVar3.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar3, wVarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar3, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                        r1 r1Var = n6.a;
                        androidx.compose.ui.text.m0 m0Var = ((m6) sVar3.j(r1Var)).n;
                        long j6 = androidx.compose.ui.graphics.t.d;
                        z5.b(str16, null, j6, 0L, null, 0L, new androidx.compose.ui.text.style.k(5), 0L, 2, false, 2, 0, m0Var, sVar3, 384, 24960, 109562);
                        androidx.compose.runtime.s sVar4 = sVar3;
                        String str17 = str14;
                        if (str17 != null) {
                            sVar4.b0(-1035013059);
                            j4 = j6;
                            z5.b(str17, null, androidx.compose.ui.graphics.t.b(0.7f, j6), 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar4.j(r1Var)).o, sVar4, 384, 24960, 110586);
                            androidx.compose.runtime.s sVar5 = sVar4;
                            sVar5.p(false);
                            sVar2 = sVar5;
                        } else {
                            j4 = j6;
                            sVar4.b0(-1034710747);
                            sVar4.p(false);
                            sVar2 = sVar4;
                        }
                        sVar2.p(true);
                        float f16 = f13;
                        if (f16 > 0.0f) {
                            sVar2.b0(-1627148991);
                            androidx.compose.ui.r rVarE4 = androidx.compose.foundation.layout.t.e(i1.g(i1.e(oVar, 1.0f), 3), jVar7);
                            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar6, false);
                            int iHashCode3 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar2, rVarE4);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(aVar8);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.runtime.t.x(sVar2, q0VarD2, eVar);
                            androidx.compose.runtime.t.x(sVar2, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                            androidx.compose.runtime.t.x(sVar2, rVarC3, eVar4);
                            androidx.compose.ui.r rVarE5 = i1.e(i1.c(oVar, 1.0f), 1.0f);
                            long jB = androidx.compose.ui.graphics.t.b(0.25f, j4);
                            androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(rVarE5, jB, j0Var), sVar2, 6);
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(i1.e(i1.c(oVar, 1.0f), kotlin.collections.i0.c(f16, 0.0f, 1.0f)), com.app.mlounge.ui.theme.b.f, j0Var), sVar2, 0);
                            sVar2.p(true);
                            sVar2.p(false);
                        } else {
                            sVar2.b0(-1626416709);
                            sVar2.p(false);
                        }
                        sVar2.p(true);
                    } else {
                        sVar3.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar), sVar, 196608, 16);
            kotlin.jvm.functions.a aVar8 = aVar3;
            str7 = str9;
            aVar4 = aVar8;
            z4 = z24;
            d4 = d9;
            str6 = str5;
            f5 = f7;
            bVar2 = bVar3;
            rVar3 = rVar6;
            f4 = f13;
            z5 = z25;
            jVar2 = jVar5;
        } else {
            sVar.W();
            bVar2 = bVar;
            f4 = f2;
            rVar3 = rVar2;
            d4 = d3;
            str6 = str5;
            aVar4 = aVar3;
            z4 = z;
            z5 = z2;
            f5 = f3;
            str7 = str4;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.d0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.t.A(i2 | 1);
                    int iA2 = androidx.compose.runtime.t.A(i3);
                    b0.h(str, str2, aVar, rVar3, d4, str6, aVar4, jVar2, bVar2, f4, z4, z5, f5, str7, (androidx.compose.runtime.s) obj2, iA, iA2, i4);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void i(String str, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.c0(-261870357);
        int i3 = i2 | (sVar2.f(str) ? 4 : 2) | 48 | (sVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.layout.e0 e0Var = i1.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar2, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, oVar);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
            androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
            z5.b(str, null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).j, sVar, (i3 & 14) | 384, 0, 130042);
            sVar2 = sVar;
            if (aVar != null) {
                sVar2.b0(-1166736630);
                androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 16));
                z0 z0Var = androidx.compose.material3.x.a;
                long j = com.app.mlounge.ui.theme.b.f;
                long j2 = androidx.compose.ui.graphics.t.d;
                long j3 = androidx.compose.ui.graphics.t.i;
                androidx.compose.material3.t0 t0Var = (androidx.compose.material3.t0) sVar2.j(androidx.compose.material3.u0.a);
                androidx.compose.material3.w wVar = t0Var.W;
                if (wVar == null) {
                    wVar = new androidx.compose.material3.w(androidx.compose.material3.u0.c(t0Var, androidx.compose.material3.tokens.j.a), androidx.compose.material3.u0.c(t0Var, androidx.compose.material3.tokens.j.j), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.j.e, androidx.compose.material3.u0.c(t0Var, androidx.compose.material3.tokens.j.c)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.j.g, androidx.compose.material3.u0.c(t0Var, androidx.compose.material3.tokens.j.f)));
                    t0Var.W = wVar;
                }
                androidx.compose.material3.q.b(aVar, null, false, null, wVar.a(j, j2, j3, j3), null, null, null, null, d, sVar2, ((i3 >> 6) & 14) | 805306368, 494);
                sVar2.p(false);
            } else {
                sVar2.b0(-1166358957);
                sVar2.p(false);
            }
            sVar2.p(true);
            sVar2.p(true);
            rVar2 = oVar;
        } else {
            sVar2.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new b2(str, rVar2, aVar, i2, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0264  */
    /* JADX WARN: Code duplicated, block: B:108:0x0289 A[LOOP:3: B:106:0x0283->B:108:0x0289, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x0306  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:128:0x031b  */
    /* JADX WARN: Code duplicated, block: B:129:0x031d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0327  */
    /* JADX WARN: Code duplicated, block: B:133:0x0329  */
    /* JADX WARN: Code duplicated, block: B:137:0x0333  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:142:0x0361  */
    /* JADX WARN: Code duplicated, block: B:145:0x0390  */
    public static final void j(final List list, final TmdbGenre tmdbGenre, final String str, final Integer num, final boolean z, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final kotlin.jvm.functions.l lVar3, final kotlin.jvm.functions.l lVar4, androidx.compose.ui.r rVar, final boolean z2, androidx.compose.runtime.s sVar, final int i2) {
        androidx.compose.ui.r rVar2;
        String strB;
        Object next;
        String str2;
        androidx.compose.runtime.f fVar;
        String strValueOf;
        ArrayList arrayList;
        Iterator it;
        int i3;
        boolean z3;
        Object objQ;
        Object objQ2;
        a1 a1VarB;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objQ3;
        long jB;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        sVar.c0(1619764482);
        int i4 = i2 | (sVar.h(list) ? 4 : 2) | (sVar.f(tmdbGenre) ? 32 : 16) | (sVar.f(str) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.f(num) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.g(z) ? 16384 : 8192) | (sVar.h(lVar) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(lVar2) ? 1048576 : 524288) | (sVar.h(lVar3) ? 8388608 : 4194304) | (sVar.h(lVar4) ? 67108864 : 33554432) | 805306368;
        if (sVar.T(i4 & 1, ((306783379 & i4) == 306783378 && ((sVar.g(z2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), 12, f2);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarR);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            q1.b(_COROUTINE.a.N(), "Filters", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar, 3504, 0);
            if (tmdbGenre == null || (strB = tmdbGenre.b()) == null) {
                strB = "Genre";
            }
            List listJ = kotlin.collections.q.j(new kotlin.k(null, "All Genres"));
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TmdbGenre tmdbGenre2 = (TmdbGenre) it2.next();
                arrayList2.add(new kotlin.k(tmdbGenre2, tmdbGenre2.b()));
                strB = strB;
            }
            String str3 = strB;
            ArrayList arrayListO = kotlin.collections.p.O(listJ, arrayList2);
            boolean z7 = (i4 & 458752) == 131072;
            Object objQ4 = sVar.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            if (z7 || objQ4 == fVar3) {
                objQ4 = new androidx.compose.animation.core.r1(6, lVar);
                sVar.l0(objQ4);
            }
            int i5 = i4;
            k(str3, arrayListO, tmdbGenre, (kotlin.jvm.functions.l) objQ4, sVar, (i4 << 3) & 896);
            Iterator it3 = com.app.mlounge.util.b.a.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!kotlin.jvm.internal.l.a(((kotlin.k) next).e, str));
            kotlin.k kVar = (kotlin.k) next;
            if (kVar == null || (str2 = (String) kVar.y) == null) {
                str2 = "Sort By";
            }
            List listJ2 = kotlin.collections.q.j(new kotlin.k(null, "Default"));
            List<kotlin.k> list2 = com.app.mlounge.util.b.a;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(list2, 10));
            for (kotlin.k kVar2 : list2) {
                arrayList3.add(new kotlin.k(kVar2.e, kVar2.y));
            }
            ArrayList arrayListO2 = kotlin.collections.p.O(listJ2, arrayList3);
            boolean z8 = (3670016 & i5) == 1048576;
            Object objQ5 = sVar.Q();
            if (z8) {
                fVar = fVar3;
            } else {
                fVar = fVar3;
                if (objQ5 == fVar) {
                }
                k(str2, arrayListO2, str, (kotlin.jvm.functions.l) objQ5, sVar, i5 & 896);
                if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                    strValueOf = "Year";
                }
                List listJ3 = kotlin.collections.q.j(new kotlin.k(null, "All Years"));
                List list3 = com.app.mlounge.util.b.b;
                arrayList = new ArrayList(kotlin.collections.r.p(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    arrayList.add(new kotlin.k(Integer.valueOf(iIntValue), String.valueOf(iIntValue)));
                    i5 = i5;
                }
                i3 = i5;
                ArrayList arrayListO3 = kotlin.collections.p.O(listJ3, arrayList);
                if ((i3 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objQ = sVar.Q();
                if (z3 || objQ == fVar) {
                    objQ = new androidx.compose.animation.core.r1(8, lVar3);
                    sVar.l0(objQ);
                }
                k(strValueOf, arrayListO3, num, (kotlin.jvm.functions.l) objQ, sVar, (i3 >> 3) & 896);
                if (z2) {
                    sVar.b0(-1182192821);
                    objQ2 = sVar.Q();
                    if (objQ2 == fVar) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ2;
                    a1VarB = _COROUTINE.a.B(kVar3, sVar, 6);
                    androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                    float f3 = 2;
                    if (((Boolean) a1VarB.getValue()).booleanValue()) {
                        j = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(rVarA, f3, j, androidx.compose.foundation.shape.e.a(f2));
                    if ((i3 & 234881024) == 67108864) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i3 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z4 | z5;
                    objQ3 = sVar.Q();
                    if (z6 || objQ3 == fVar) {
                        objQ3 = new androidx.compose.foundation.selection.g(lVar4, z, 1);
                        sVar.l0(objQ3);
                    }
                    androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar3, 1);
                    if (z) {
                        jB = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.j);
                    } else {
                        jB = com.app.mlounge.ui.theme.b.c;
                    }
                    rVar2 = oVar;
                    p5.a(rVarN, androidx.compose.foundation.shape.e.a(f2), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(788676380, new o(z, 1, (byte) 0), sVar), sVar, 12582912, 120);
                    sVar.p(false);
                } else {
                    rVar2 = oVar;
                    sVar.b0(-1181038660);
                    sVar.p(false);
                }
                sVar.p(true);
            }
            objQ5 = new androidx.compose.animation.core.r1(7, lVar2);
            sVar.l0(objQ5);
            k(str2, arrayListO2, str, (kotlin.jvm.functions.l) objQ5, sVar, i5 & 896);
            if (num != null) {
                strValueOf = "Year";
            } else {
                strValueOf = "Year";
            }
            List listJ4 = kotlin.collections.q.j(new kotlin.k(null, "All Years"));
            List list4 = com.app.mlounge.util.b.b;
            arrayList = new ArrayList(kotlin.collections.r.p(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                arrayList.add(new kotlin.k(Integer.valueOf(iIntValue2), String.valueOf(iIntValue2)));
                i5 = i5;
            }
            i3 = i5;
            ArrayList arrayListO4 = kotlin.collections.p.O(listJ4, arrayList);
            if ((i3 & 29360128) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            objQ = sVar.Q();
            if (z3) {
                objQ = new androidx.compose.animation.core.r1(8, lVar3);
                sVar.l0(objQ);
            } else {
                objQ = new androidx.compose.animation.core.r1(8, lVar3);
                sVar.l0(objQ);
            }
            k(strValueOf, arrayListO4, num, (kotlin.jvm.functions.l) objQ, sVar, (i3 >> 3) & 896);
            if (z2) {
                sVar.b0(-1182192821);
                objQ2 = sVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ2;
                a1VarB = _COROUTINE.a.B(kVar4, sVar, 6);
                androidx.compose.ui.r rVarA2 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                float f4 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(rVarA2, f4, j, androidx.compose.foundation.shape.e.a(f2));
                if ((i3 & 234881024) == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i3 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objQ3 = sVar.Q();
                if (z6) {
                    objQ3 = new androidx.compose.foundation.selection.g(lVar4, z, 1);
                    sVar.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.foundation.selection.g(lVar4, z, 1);
                    sVar.l0(objQ3);
                }
                androidx.compose.ui.r rVarN2 = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG2, kVar4, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar4, 1);
                if (z) {
                    jB = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.j);
                } else {
                    jB = com.app.mlounge.ui.theme.b.c;
                }
                rVar2 = oVar;
                p5.a(rVarN2, androidx.compose.foundation.shape.e.a(f2), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(788676380, new o(z, 1, (byte) 0), sVar), sVar, 12582912, 120);
                sVar.p(false);
            } else {
                rVar2 = oVar;
                sVar.b0(-1181038660);
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            final androidx.compose.ui.r rVar3 = rVar2;
            s1VarT.d = new kotlin.jvm.functions.p(list, tmdbGenre, str, num, z, lVar, lVar2, lVar3, lVar4, rVar3, z2, i2) { // from class: com.app.mlounge.ui.components.m0
                public final /* synthetic */ Integer A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ kotlin.jvm.functions.l C;
                public final /* synthetic */ kotlin.jvm.functions.l D;
                public final /* synthetic */ kotlin.jvm.functions.l E;
                public final /* synthetic */ kotlin.jvm.functions.l F;
                public final /* synthetic */ androidx.compose.ui.r G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ List e;
                public final /* synthetic */ TmdbGenre y;
                public final /* synthetic */ String z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    b0.j(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void k(String str, ArrayList arrayList, Object obj, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i2) {
        int i3;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.c0(-74803891);
        if ((i2 & 6) == 0) {
            i3 = (sVar2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar2.h(arrayList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? sVar2.f(obj) : sVar2.h(obj) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar2.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar2.l0(objQ);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, oVar);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            float f2 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            Object objQ3 = sVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = new androidx.compose.foundation.lazy.m(a1Var, 9);
                sVar2.l0(objQ3);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), obj != null ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-724386066, new androidx.compose.foundation.contextmenu.f(15, obj, str), sVar2), sVar2, 12582912, 120);
            boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            Object objQ4 = sVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = new androidx.compose.foundation.lazy.m(a1Var, 10);
                sVar2.l0(objQ4);
            }
            androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, i1.i(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1), 0L, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2092769016, new androidx.compose.foundation.contextmenu.e(arrayList, lVar, obj, a1Var, 2), sVar2), sVar, 432, 2040);
            sVar2 = sVar;
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.material3.d(str, arrayList, obj, lVar, i2, 4);
        }
    }

    public static final void l(String str, long j, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2) {
        sVar.c0(-1583729884);
        int i3 = i2 | (sVar.e(j) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 12;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.ui.o.b, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i3 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new x2(4, aVar);
                sVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
            long j2 = com.app.mlounge.ui.theme.b.f;
            if (!androidx.compose.ui.graphics.t.c(j, j2)) {
                j2 = com.app.mlounge.ui.theme.b.b;
            }
            p5.a(rVarN, androidx.compose.foundation.shape.e.a(f2), j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-581934231, new androidx.compose.foundation.text.a(j, str, 2), sVar), sVar, 12582912, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.b(str, j, aVar, i2);
        }
    }

    public static final void m(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, final kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, final int i2) {
        int i3;
        final androidx.compose.ui.r rVar2;
        final boolean z2;
        aVar.getClass();
        pVar.getClass();
        sVar.c0(-563145657);
        if ((i2 & 6) == 0) {
            i3 = i2 | (sVar.h(aVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | 432;
        if (sVar.T(i4 & 1, (i4 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 2;
            long j = ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(8);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.g(oVar, f2, j, dVarA), true, null, kVar, null, androidx.compose.runtime.internal.k.c(797900009, new androidx.compose.runtime.saveable.a(pVar, 1, (byte) 0), sVar), sVar, (i4 & 14) | 1597824, 40);
            z2 = true;
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
            z2 = z;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.p
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b0.m(aVar, rVar2, z2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void n(androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.ui.r rVar2;
        sVar.c0(1372479750);
        int i3 = i2 | 6;
        if (sVar.T(i3 & 1, (i3 & 3) != 2)) {
            androidx.compose.foundation.layout.e0 e0Var = i1.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            s4.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar, 48, 61);
            sVar.p(true);
            rVar2 = androidx.compose.ui.o.b;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.p(rVar2, i2, 1);
        }
    }

    public static final void o(int i2, androidx.compose.runtime.s sVar, androidx.compose.ui.r rVar, final String str, List list, final kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.r rVar2;
        final boolean z;
        androidx.compose.runtime.s sVar2 = sVar;
        list.getClass();
        lVar.getClass();
        sVar2.c0(1292002578);
        int i3 = i2 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(list) ? 32 : 16) | (sVar2.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | 3072;
        if (sVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar2.l0(objQ);
            }
            final a1 a1Var = (a1) objQ;
            final List listX = kotlin.collections.p.X(4, list);
            final List listY = kotlin.collections.p.y(4, list);
            if (!listY.isEmpty()) {
                Iterator it = listY.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (v(str, (com.app.mlounge.ui.navigation.w) it.next())) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            long j = com.app.mlounge.ui.theme.b.f;
            long j2 = com.app.mlounge.ui.theme.b.m;
            long j3 = com.app.mlounge.ui.theme.b.r;
            long j4 = androidx.compose.ui.graphics.t.i;
            n3 n3VarO = androidx.compose.material3.q.o((androidx.compose.material3.t0) sVar2.j(androidx.compose.material3.u0.a));
            final n3 n3Var = new n3(j != 16 ? j : n3VarO.a, j != 16 ? j : n3VarO.b, j3 != 16 ? j3 : n3VarO.c, j2 != 16 ? j2 : n3VarO.d, j2 != 16 ? j2 : n3VarO.e, j4 != 16 ? j4 : n3VarO.f, j4 != 16 ? j4 : n3VarO.g);
            sVar2 = sVar;
            x3.a(com.app.mlounge.ui.theme.b.b, j2, 0.0f, null, androidx.compose.runtime.internal.k.c(-1162978375, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.components.p0
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    n3 n3Var2;
                    androidx.compose.runtime.f fVar2;
                    g1 g1Var = (g1) obj;
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    g1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= sVar3.f(g1Var) ? 4 : 2;
                    }
                    if (sVar3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        sVar3.b0(-930720086);
                        Iterator it2 = listX.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            n3Var2 = n3Var;
                            fVar2 = androidx.compose.runtime.n.a;
                            if (!zHasNext) {
                                break;
                            }
                            com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) it2.next();
                            boolean zV = b0.v(str, wVar);
                            kotlin.jvm.functions.l lVar2 = lVar;
                            boolean zF = sVar3.f(lVar2) | sVar3.f(wVar);
                            Object objQ2 = sVar3.Q();
                            if (zF || objQ2 == fVar2) {
                                objQ2 = new q0(lVar2, wVar, 0);
                                sVar3.l0(objQ2);
                            }
                            x3.b(g1Var, zV, (kotlin.jvm.functions.a) objQ2, androidx.compose.runtime.internal.k.c(1313410719, new androidx.activity.compose.i(zV, 3, wVar), sVar3), null, false, androidx.compose.runtime.internal.k.c(-1433332574, new androidx.compose.animation.core.g0(wVar, 21), sVar3), false, n3Var2, sVar3, (iIntValue & 14) | 1575936);
                        }
                        sVar3.p(false);
                        if (listY.isEmpty()) {
                            sVar3.b0(1213378377);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(1213068935);
                            Object objQ3 = sVar3.Q();
                            if (objQ3 == fVar2) {
                                objQ3 = new androidx.compose.foundation.lazy.m(a1Var, 12);
                                sVar3.l0(objQ3);
                            }
                            x3.b(g1Var, z, (kotlin.jvm.functions.a) objQ3, b0.g, null, false, b0.h, false, n3Var2, sVar3, (iIntValue & 14) | 1576320);
                            sVar3.p(false);
                        }
                    } else {
                        sVar3.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar2), sVar2, 197046);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                sVar2.b0(-1446231633);
                Object objQ2 = sVar2.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.foundation.lazy.m(a1Var, 11);
                    sVar2.l0(objQ2);
                }
                h3.a((kotlin.jvm.functions.a) objQ2, null, null, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, androidx.compose.runtime.internal.k.c(-1088262709, new androidx.compose.foundation.contextmenu.e(listY, str, lVar, a1Var, 3), sVar2), sVar, 6);
                sVar2 = sVar;
                sVar2.p(false);
            } else {
                sVar2.b0(-1444477808);
                sVar2.p(false);
            }
            rVar2 = androidx.compose.ui.o.b;
        } else {
            sVar2.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new k0(str, list, lVar, rVar2, i2);
        }
    }

    public static final void p(String str, kotlin.jvm.functions.l lVar, MusicGenre musicGenre, kotlin.jvm.functions.l lVar2, String str2, List list, kotlin.jvm.functions.l lVar3, androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.ui.r rVar2;
        List<String> list2 = list;
        androidx.compose.runtime.s sVar2 = sVar;
        str.getClass();
        lVar.getClass();
        musicGenre.getClass();
        lVar2.getClass();
        str2.getClass();
        list2.getClass();
        lVar3.getClass();
        sVar2.c0(-1891279626);
        int i3 = i2 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(lVar) ? 32 : 16) | (sVar2.h(musicGenre) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar2.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar2.f(str2) ? 16384 : 8192) | (sVar2.h(list2) ? 131072 : Parser.ARGC_LIMIT) | (sVar2.h(lVar3) ? 1048576 : 524288) | 12582912;
        if (sVar2.T(i3 & 1, (4793491 & i3) != 4793490)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar2), false), 12, f2);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            q1.b(_COROUTINE.a.N(), "Filters", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar, 3504, 0);
            sVar2 = sVar;
            List<String> listK = kotlin.collections.q.k("MusicMp3", "YouTube Music");
            ArrayList arrayList = new ArrayList(kotlin.collections.r.p(listK, 10));
            for (String str3 : listK) {
                arrayList.add(new kotlin.k(str3, str3));
            }
            boolean z = (i3 & Token.ASSIGN_MOD) == 32;
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (z || objQ == fVar2) {
                objQ = new androidx.compose.animation.core.r1(3, lVar);
                sVar2.l0(objQ);
            }
            k(str, arrayList, str, (kotlin.jvm.functions.l) objQ, sVar2, (i3 & 14) | ((i3 << 6) & 896));
            String strB = musicGenre.b();
            List<MusicGenre> list3 = com.app.mlounge.data.repository.a0.e;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(list3, 10));
            for (MusicGenre musicGenre2 : list3) {
                arrayList2.add(new kotlin.k(musicGenre2, musicGenre2.b()));
            }
            boolean z2 = (i3 & 7168) == 2048;
            Object objQ2 = sVar2.Q();
            if (z2 || objQ2 == fVar2) {
                objQ2 = new androidx.compose.animation.core.r1(4, lVar2);
                sVar2.l0(objQ2);
            }
            k(strB, arrayList2, musicGenre, (kotlin.jvm.functions.l) objQ2, sVar2, i3 & 896);
            list2 = list;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(list2, 10));
            for (String str4 : list2) {
                arrayList3.add(new kotlin.k(str4, str4));
            }
            boolean z3 = (3670016 & i3) == 1048576;
            Object objQ3 = sVar2.Q();
            if (z3 || objQ3 == fVar2) {
                objQ3 = new androidx.compose.animation.core.r1(5, lVar3);
                sVar2.l0(objQ3);
            }
            k(str2, arrayList3, str2, (kotlin.jvm.functions.l) objQ3, sVar2, ((i3 >> 12) & 14) | ((i3 >> 6) & 896));
            sVar2.p(true);
            rVar2 = oVar;
        } else {
            sVar2.W();
            rVar2 = rVar;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new l0(str, lVar, musicGenre, lVar2, str2, list2, lVar3, rVar2, i2);
        }
    }

    public static final void q(final com.app.mlounge.ui.navigation.w wVar, final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.ui.focus.y yVar, androidx.compose.runtime.s sVar, final int i2) {
        long j;
        long j2;
        androidx.compose.runtime.s sVar2 = sVar;
        String str = wVar.b;
        sVar2.c0(831523471);
        int i3 = i2 | (sVar2.f(wVar) ? 4 : 2) | (sVar2.g(z) ? 32 : 16) | (sVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar2.f(yVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
            if (z) {
                j = com.app.mlounge.ui.theme.b.r;
            } else {
                j = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : androidx.compose.ui.graphics.t.h;
            }
            long j3 = j;
            if (z) {
                j2 = com.app.mlounge.ui.theme.b.f;
            } else {
                j2 = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.l : com.app.mlounge.ui.theme.b.m;
            }
            long j4 = j2;
            long j5 = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 4;
            float f3 = 2;
            float f4 = 12;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.r(i1.e(oVar, 1.0f), f2, f3), androidx.compose.foundation.shape.e.a(f4)), f3, j5, androidx.compose.foundation.shape.e.a(f4)), j3, androidx.compose.foundation.shape.e.a(f4));
            boolean z2 = (i3 & 896) == 256;
            Object objQ2 = sVar2.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new x2(7, aVar);
                sVar2.l0(objQ2);
            }
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.n(androidx.compose.ui.focus.d.k(androidx.compose.foundation.s.j(rVarF, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), yVar), kVar, 1), f2, 8);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, hVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            q1.b(z ? wVar.d : wVar.c, str, i1.m(oVar, 24), j4, sVar2, 384, 0);
            androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f2));
            z5.b(str, null, j4, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 2, false, 1, 0, ((m6) sVar2.j(n6.a)).o, sVar, 0, 24960, 109562);
            sVar2 = sVar;
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(z, aVar, yVar, i2) { // from class: com.app.mlounge.ui.components.x0
                public final /* synthetic */ androidx.compose.ui.focus.y A;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    b0.q(this.e, this.y, this.z, this.A, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void r(final String str, final List list, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, final int i2) {
        androidx.compose.ui.focus.y yVar3;
        final androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s sVar2;
        Object obj;
        boolean z;
        androidx.compose.runtime.s sVar3 = sVar;
        list.getClass();
        lVar.getClass();
        yVar.getClass();
        yVar2.getClass();
        sVar3.c0(-1044233966);
        int i3 = i2 | (sVar3.f(str) ? 4 : 2) | (sVar3.h(list) ? 32 : 16) | (sVar3.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | 196608;
        if (sVar3.T(i3 & 1, (74899 & i3) != 74898)) {
            c2 c2VarP = androidx.compose.foundation.s.p(sVar3);
            boolean zF = sVar3.f(list);
            Object objQ = sVar3.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zF || objQ == fVar) {
                obj = objQ;
                int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iJ >= 16 ? iJ : 16);
                for (Object obj2 : list) {
                    linkedHashMap.put(obj2, new androidx.compose.ui.focus.y());
                }
                sVar3.l0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map = (Map) obj;
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(androidx.compose.foundation.layout.b.s(androidx.compose.foundation.s.f(i1.c(i1.q(oVar, 80), 1.0f), com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, f2, 1), c2VarP, true);
            Object objQ2 = sVar3.Q();
            if (objQ2 == fVar) {
                yVar3 = yVar2;
                objQ2 = new v0(yVar3, 0);
                sVar3.l0(objQ2);
            } else {
                yVar3 = yVar2;
            }
            androidx.compose.ui.r rVarI = androidx.compose.ui.focus.d.i(rVarQ, (kotlin.jvm.functions.l) objQ2);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar3, 48);
            int iHashCode = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL = sVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarI);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar2);
            } else {
                sVar3.o0();
            }
            androidx.compose.runtime.t.x(sVar3, wVarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
            float f3 = 12;
            androidx.compose.foundation.s.c(com.google.firebase.b.S(R.mipmap.ic_launcher_round, sVar3), i1.m(androidx.compose.foundation.layout.b.s(oVar, 0.0f, f3, 1), 40), null, null, 0.0f, sVar, 440);
            androidx.compose.runtime.s sVar4 = sVar;
            androidx.compose.material3.q.d(androidx.compose.foundation.layout.b.r(oVar, f3, 4), 0.0f, com.app.mlounge.ui.theme.b.e, sVar4, 390, 2);
            androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar, f2));
            sVar4.b0(482379739);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) it.next();
                boolean z2 = kotlin.jvm.internal.l.a(str, wVar.a) || (str != null && kotlin.text.r.u(str, kotlin.text.k.b0(wVar.a, "/"), false));
                androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) map.get(wVar);
                if (yVar4 == null) {
                    sVar4.b0(-805941422);
                    Object objQ3 = sVar4.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new androidx.compose.ui.focus.y();
                        sVar4.l0(objQ3);
                    }
                    yVar4 = (androidx.compose.ui.focus.y) objQ3;
                    z = false;
                } else {
                    z = false;
                    sVar4.b0(-1688566933);
                }
                sVar4.p(z);
                boolean zF2 = sVar4.f(wVar) | ((i3 & 896) == 256);
                Object objQ4 = sVar4.Q();
                if (zF2 || objQ4 == fVar) {
                    objQ4 = new q0(lVar, wVar, 1);
                    sVar4.l0(objQ4);
                }
                q(wVar, z2, (kotlin.jvm.functions.a) objQ4, z2 ? yVar : yVar4, sVar4, 0);
            }
            sVar4.p(false);
            sVar4.p(true);
            rVar2 = oVar;
            sVar2 = sVar4;
        } else {
            yVar3 = yVar2;
            sVar3.W();
            rVar2 = rVar;
            sVar2 = sVar3;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            final androidx.compose.ui.focus.y yVar5 = yVar3;
            s1VarT.d = new kotlin.jvm.functions.p(str, list, lVar, yVar, yVar5, rVar2, i2) { // from class: com.app.mlounge.ui.components.w0
                public final /* synthetic */ androidx.compose.ui.focus.y A;
                public final /* synthetic */ androidx.compose.ui.focus.y B;
                public final /* synthetic */ androidx.compose.ui.r C;
                public final /* synthetic */ String e;
                public final /* synthetic */ List y;
                public final /* synthetic */ kotlin.jvm.functions.l z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = androidx.compose.runtime.t.A(27649);
                    b0.r(this.e, this.y, this.z, this.A, this.B, this.C, (androidx.compose.runtime.s) obj3, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void s(String str, final String str2, boolean z, kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        boolean z2;
        int i4;
        kotlin.coroutines.d dVar;
        pVar.getClass();
        aVar.getClass();
        sVar.c0(-1833946259);
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 = i2 | 384;
            z2 = z;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i4 = (sVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        int i6 = i4 | 3072 | (sVar.h(pVar) ? 16384 : 8192);
        if (sVar.T(i6 & 1, (74899 & i6) != 74898)) {
            boolean z3 = i5 != 0 ? false : z2;
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = androidx.compose.runtime.t.r("");
                sVar.l0(objQ);
            }
            final a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.t.r("");
                sVar.l0(objQ2);
            }
            final a1 a1Var2 = (a1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ3);
            }
            final a1 a1Var3 = (a1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == obj) {
                objQ4 = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ4);
            }
            final a1 a1Var4 = (a1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == obj) {
                objQ5 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ5);
            }
            final a1 a1Var5 = (a1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == obj) {
                objQ6 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ6);
            }
            final a1 a1Var6 = (a1) objQ6;
            Object objQ7 = sVar.Q();
            if (objQ7 == obj) {
                objQ7 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ7);
            }
            final a1 a1Var7 = (a1) objQ7;
            final l2 l2Var = (l2) sVar.j(l1.p);
            Object objQ8 = sVar.Q();
            if (objQ8 == obj) {
                objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            final androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == obj) {
                objQ9 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            final androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == obj) {
                objQ10 = new androidx.compose.ui.focus.y();
                sVar.l0(objQ10);
            }
            final androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == obj) {
                objQ11 = new androidx.compose.ui.focus.y();
                sVar.l0(objQ11);
            }
            final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) objQ11;
            Object objQ12 = sVar.Q();
            if (objQ12 == obj) {
                objQ12 = new androidx.compose.ui.focus.y();
                sVar.l0(objQ12);
            }
            final androidx.compose.ui.focus.y yVar3 = (androidx.compose.ui.focus.y) objQ12;
            Object objQ13 = sVar.Q();
            if (objQ13 == obj) {
                objQ13 = new androidx.compose.ui.focus.y();
                sVar.l0(objQ13);
            }
            final androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) objQ13;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) a1Var6.getValue()).booleanValue());
            boolean zF = sVar.f(l2Var);
            Object objQ14 = sVar.Q();
            if (zF || objQ14 == obj) {
                objQ14 = new v(l2Var, a1Var6, null, 0);
                sVar.l0(objQ14);
            }
            androidx.compose.runtime.l0.c(sVar, boolValueOf, (kotlin.jvm.functions.p) objQ14);
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) a1Var7.getValue()).booleanValue());
            boolean zF2 = sVar.f(l2Var);
            Object objQ15 = sVar.Q();
            if (zF2 || objQ15 == obj) {
                dVar = null;
                objQ15 = new v(l2Var, a1Var7, null, 1);
                sVar.l0(objQ15);
            } else {
                dVar = null;
            }
            androidx.compose.runtime.l0.c(sVar, boolValueOf2, (kotlin.jvm.functions.p) objQ15);
            Object objQ16 = sVar.Q();
            if (objQ16 == obj) {
                objQ16 = new x(kVar, a1Var6, dVar, 0);
                sVar.l0(objQ16);
            }
            androidx.compose.runtime.l0.c(sVar, kVar, (kotlin.jvm.functions.p) objQ16);
            Object objQ17 = sVar.Q();
            if (objQ17 == obj) {
                objQ17 = new x(kVar2, a1Var7, dVar, 1);
                sVar.l0(objQ17);
            }
            androidx.compose.runtime.l0.c(sVar, kVar2, (kotlin.jvm.functions.p) objQ17);
            final boolean z4 = z3;
            androidx.compose.material3.q.a(aVar, androidx.compose.runtime.internal.k.c(-2004296155, new n(z4, pVar, yVar3, a1Var, a1Var4, a1Var2, a1Var5, yVar2, yVar, yVar4), sVar), null, androidx.compose.runtime.internal.k.c(967492195, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.q
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar4);
                        boolean z5 = z4;
                        boolean zG = sVar2.g(z5);
                        Object objQ18 = sVar2.Q();
                        if (zG || objQ18 == androidx.compose.runtime.n.a) {
                            objQ18 = new y(z5, yVar2, yVar, yVar3, 1);
                            sVar2.l0(objQ18);
                        }
                        androidx.compose.material3.q.i(aVar, androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) objQ18), false, null, null, null, null, b0.b, sVar2, 805306368, 508);
                    } else {
                        sVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar), androidx.compose.runtime.internal.k.c(-355686751, new r(str, 0), sVar), androidx.compose.runtime.internal.k.c(-1017276224, new kotlin.jvm.functions.p(str2, yVar, l2Var, z4, kVar, yVar2, kVar2, a1Var, a1Var6, a1Var3, yVar3, a1Var4, a1Var2, a1Var7, a1Var5) { // from class: com.app.mlounge.ui.components.s
                public final /* synthetic */ boolean A;
                public final /* synthetic */ androidx.compose.foundation.interaction.k B;
                public final /* synthetic */ androidx.compose.ui.focus.y C;
                public final /* synthetic */ androidx.compose.foundation.interaction.k D;
                public final /* synthetic */ a1 E;
                public final /* synthetic */ a1 F;
                public final /* synthetic */ a1 G;
                public final /* synthetic */ androidx.compose.ui.focus.y H;
                public final /* synthetic */ a1 I;
                public final /* synthetic */ a1 J;
                public final /* synthetic */ a1 K;
                public final /* synthetic */ String e;
                public final /* synthetic */ androidx.compose.ui.focus.y y;
                public final /* synthetic */ l2 z;

                /* JADX WARN: Code duplicated, block: B:44:0x0291  */
                /* JADX WARN: Code duplicated, block: B:47:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:48:0x02b4  */
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    Object zVar;
                    androidx.compose.ui.focus.y yVar5;
                    a1 a1Var8;
                    int i7;
                    a1 a1Var9;
                    boolean z5;
                    androidx.compose.runtime.f fVar;
                    Object objQ18;
                    Object objQ19;
                    a1 a1Var10;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.K, sVar2, 54);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL = sVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarE);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                        z5.b(this.e, null, 0L, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, null, sVar2, 0, 0, 261118);
                        a1 a1Var11 = this.E;
                        String str3 = (String) a1Var11.getValue();
                        a1 a1Var12 = this.F;
                        boolean z6 = !((Boolean) a1Var12.getValue()).booleanValue();
                        a1 a1Var13 = this.G;
                        boolean zBooleanValue = ((Boolean) a1Var13.getValue()).booleanValue();
                        androidx.compose.ui.text.input.g0 rVar = androidx.compose.ui.text.input.f0.e;
                        androidx.compose.ui.text.input.g0 rVar2 = zBooleanValue ? rVar : new androidx.compose.ui.text.input.r();
                        androidx.compose.foundation.text.q0 q0Var = new androidx.compose.foundation.text.q0(8, Token.EXPORT);
                        b4 b4Var = b4.a;
                        long j = com.app.mlounge.ui.theme.b.f;
                        long j2 = com.app.mlounge.ui.theme.b.e;
                        long j3 = com.app.mlounge.ui.theme.b.l;
                        u5 u5VarC = b4.c(j3, j3, j, j, j2, 0L, 0L, sVar2, 2147477244);
                        androidx.compose.ui.r rVarE2 = i1.e(oVar, 1.0f);
                        androidx.compose.ui.focus.y yVar6 = this.y;
                        androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(rVarE2, yVar6);
                        l2 l2Var2 = this.z;
                        boolean zF3 = sVar2.f(l2Var2);
                        boolean z7 = this.A;
                        boolean zG = zF3 | sVar2.g(z7);
                        Object objQ20 = sVar2.Q();
                        androidx.compose.ui.focus.y yVar7 = this.C;
                        androidx.compose.ui.focus.y yVar8 = this.H;
                        androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                        if (zG || objQ20 == fVar3) {
                            yVar5 = yVar7;
                            a1Var8 = a1Var12;
                            zVar = new z(l2Var2, z7, yVar5, yVar8, a1Var8);
                            sVar2.l0(zVar);
                        } else {
                            zVar = objQ20;
                            yVar5 = yVar7;
                            a1Var8 = a1Var12;
                        }
                        androidx.compose.ui.r rVarE3 = androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) zVar);
                        Object objQ21 = sVar2.Q();
                        if (objQ21 == fVar3) {
                            objQ21 = new m2(a1Var8, 7);
                            sVar2.l0(objQ21);
                        }
                        androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE3, (kotlin.jvm.functions.l) objQ21);
                        Object objQ22 = sVar2.Q();
                        a1 a1Var14 = this.I;
                        if (objQ22 == fVar3) {
                            i7 = 3;
                            objQ22 = new e(a1Var11, a1Var14, 3);
                            sVar2.l0(objQ22);
                        } else {
                            i7 = 3;
                        }
                        byte b2 = 0;
                        androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(1326687280, new o(z7, b2, b2), sVar2);
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(985855795, new androidx.compose.material3.m(a1Var13, i7), sVar2);
                        androidx.compose.ui.focus.y yVar9 = yVar5;
                        h4.a(str3, (kotlin.jvm.functions.l) objQ22, rVarT, false, z6, null, fVarC, null, null, fVarC2, rVar2, q0Var, null, true, 0, 0, this.B, null, u5VarC, sVar2, 806879280, 12779520, 6, 2964904);
                        androidx.compose.runtime.s sVar3 = sVar2;
                        if (z7) {
                            a1Var9 = a1Var14;
                            z5 = false;
                            sVar3.b0(-484777928);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-488717625);
                            a1 a1Var15 = this.J;
                            String str4 = (String) a1Var15.getValue();
                            a1 a1Var16 = this.K;
                            boolean z8 = !((Boolean) a1Var16.getValue()).booleanValue();
                            if (!((Boolean) a1Var13.getValue()).booleanValue()) {
                                rVar = new androidx.compose.ui.text.input.r();
                            }
                            androidx.compose.foundation.text.q0 q0Var2 = new androidx.compose.foundation.text.q0(8, Token.EXPORT);
                            u5 u5VarC2 = b4.c(j3, j3, j, j, j2, 0L, 0L, sVar3, 2147477244);
                            androidx.compose.ui.r rVarK2 = androidx.compose.ui.focus.d.k(i1.e(oVar, 1.0f), yVar9);
                            boolean zF4 = sVar3.f(l2Var2);
                            Object objQ23 = sVar3.Q();
                            if (zF4) {
                                fVar = fVar3;
                            } else {
                                fVar = fVar3;
                                if (objQ23 == fVar) {
                                }
                                androidx.compose.ui.r rVarE4 = androidx.compose.ui.input.key.c.e(rVarK2, (kotlin.jvm.functions.l) objQ23);
                                objQ18 = sVar3.Q();
                                if (objQ18 == fVar) {
                                    objQ18 = new m2(a1Var16, 6);
                                    sVar3.l0(objQ18);
                                }
                                androidx.compose.ui.r rVarT2 = androidx.compose.ui.focus.d.t(rVarE4, (kotlin.jvm.functions.l) objQ18);
                                objQ19 = sVar3.Q();
                                if (objQ19 == fVar) {
                                    a1Var10 = a1Var14;
                                    objQ19 = new e(a1Var15, a1Var10, 2);
                                    sVar3.l0(objQ19);
                                } else {
                                    a1Var10 = a1Var14;
                                }
                                a1Var9 = a1Var10;
                                h4.a(str4, (kotlin.jvm.functions.l) objQ19, rVarT2, false, z8, null, b0.c, null, null, null, rVar, q0Var2, null, true, 0, 0, this.D, null, u5VarC2, sVar3, 1572912, 12779520, 6, 2965416);
                                sVar3 = sVar3;
                                z5 = false;
                                sVar3.p(false);
                            }
                            objQ23 = new a0(l2Var2, yVar6, yVar8, a1Var16);
                            sVar3.l0(objQ23);
                            androidx.compose.ui.r rVarE5 = androidx.compose.ui.input.key.c.e(rVarK2, (kotlin.jvm.functions.l) objQ23);
                            objQ18 = sVar3.Q();
                            if (objQ18 == fVar) {
                                objQ18 = new m2(a1Var16, 6);
                                sVar3.l0(objQ18);
                            }
                            androidx.compose.ui.r rVarT3 = androidx.compose.ui.focus.d.t(rVarE5, (kotlin.jvm.functions.l) objQ18);
                            objQ19 = sVar3.Q();
                            if (objQ19 == fVar) {
                                a1Var10 = a1Var14;
                                objQ19 = new e(a1Var15, a1Var10, 2);
                                sVar3.l0(objQ19);
                            } else {
                                a1Var10 = a1Var14;
                            }
                            a1Var9 = a1Var10;
                            h4.a(str4, (kotlin.jvm.functions.l) objQ19, rVarT3, false, z8, null, b0.c, null, null, null, rVar, q0Var2, null, true, 0, 0, this.D, null, u5VarC2, sVar3, 1572912, 12779520, 6, 2965416);
                            sVar3 = sVar3;
                            z5 = false;
                            sVar3.p(false);
                        }
                        String str5 = (String) a1Var9.getValue();
                        if (str5 == null) {
                            sVar3.b0(-484749595);
                            sVar3.p(z5);
                        } else {
                            sVar3.b0(-484749594);
                            androidx.compose.runtime.s sVar4 = sVar3;
                            z5.b(str5, null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(n6.a)).l, sVar4, 384, 0, 131066);
                            sVar3 = sVar4;
                            sVar3.p(z5);
                        }
                        sVar3.b0(-483646056);
                        sVar3.p(z5);
                        sVar3.p(true);
                    } else {
                        sVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar), null, com.app.mlounge.ui.theme.b.b, 0L, com.app.mlounge.ui.theme.b.l, com.app.mlounge.ui.theme.b.m, 0.0f, null, sVar, 102435894, 54, 12948);
            z2 = z4;
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new t(str, str2, z2, pVar, aVar, i2, i3);
        }
    }

    public static final void t(Context context, File file) {
        try {
            Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriD, "application/vnd.android.package-archive");
            intent.setFlags(268435457);
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                u(context, "No installer found — allow 'Install unknown apps' for CinemaHQ, or install the APK manually");
            } else {
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            u(context, "Could not open installer: " + e2.getMessage());
        }
    }

    public static final void u(Context context, String str) {
        try {
            if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                Toast.makeText(context, str, 1).show();
            } else {
                new Handler(Looper.getMainLooper()).post(new androidx.media3.ui.c0(8, context, str));
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean v(String str, com.app.mlounge.ui.navigation.w wVar) {
        return kotlin.jvm.internal.l.a(str, wVar.a) || (str != null && kotlin.text.r.u(str, kotlin.text.k.b0(wVar.a, "/"), false));
    }

    public static final j0 w(androidx.compose.ui.graphics.vector.f fVar, long j, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.ui.graphics.vector.j0 j0VarD = androidx.compose.ui.graphics.vector.b.d(fVar, sVar);
        boolean zF = ((((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.e(j)) || (i2 & 48) == 32) | sVar.f(j0VarD);
        Object objQ = sVar.Q();
        if (zF || objQ == androidx.compose.runtime.n.a) {
            objQ = new j0(j0VarD, j);
            sVar.l0(objQ);
        }
        return (j0) objQ;
    }
}
