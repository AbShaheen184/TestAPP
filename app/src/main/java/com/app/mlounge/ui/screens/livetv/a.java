package com.app.mlounge.ui.screens.livetv;

import android.content.Context;
import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.i0;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.m;
import androidx.compose.foundation.s0;
import androidx.compose.foundation.text.contextmenu.internal.q;
import androidx.compose.material3.internal.r0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.r;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.data.iptv.n;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.c0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, -2076280898, new c0(18));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 238783682, new c0(19));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, 1806768004, new c0(20));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(false, 309707912, new c0(21));

    public static final void a(IptvChannel iptvChannel, n nVar, n nVar2, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, s sVar, int i) {
        sVar.c0(436657823);
        int i2 = i | (sVar.f(iptvChannel) ? 4 : 2) | (sVar.f(nVar) ? 32 : 16) | (sVar.f(nVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(aVar2) ? 16384 : 8192);
        if (sVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            k kVar = (k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            float f = 8;
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.l(androidx.compose.foundation.s.g(i1.e(o.b, 1.0f), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f)), kVar, aVar2, aVar), kVar, 1), androidx.compose.foundation.shape.e.a(f), ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1355346042, new b2(9, nVar, iptvChannel, nVar2), sVar), sVar, 12582912, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new q(iptvChannel, nVar, nVar2, aVar, aVar2, i);
        }
    }

    public static final void b(List list, Map map, l lVar, l lVar2, s sVar, int i) {
        sVar.c0(-2010160921);
        int i2 = i | (sVar.h(list) ? 4 : 2) | (sVar.h(map) ? 32 : 16) | (sVar.h(lVar) ? 256 : 128) | (sVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float f = 12;
            z0 z0Var = new z0(f, f, f, f);
            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(6);
            e0 e0Var = i1.c;
            boolean zH = ((i2 & 896) == 256) | sVar.h(list) | sVar.h(map) | sVar.e(jCurrentTimeMillis) | ((i2 & 7168) == 2048);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                d dVar = new d(list, map, lVar, lVar2, jCurrentTimeMillis);
                sVar.l0(dVar);
                objQ = dVar;
            }
            android.support.v4.media.session.b.c(e0Var, null, z0Var, fVarG, null, null, false, null, (l) objQ, sVar, 24966, 490);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(list, map, lVar, lVar2, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x035a  */
    /* JADX WARN: Code duplicated, block: B:73:0x036e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0374 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0376  */
    /* JADX WARN: Code duplicated, block: B:77:0x0379  */
    /* JADX WARN: Code duplicated, block: B:80:0x038d  */
    /* JADX WARN: Code duplicated, block: B:81:0x038f  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ab  */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, java.util.Map] */
    public static final void c(kotlin.jvm.functions.s sVar, a0 a0Var, s sVar2, int i) {
        a0 a0Var2;
        int i2;
        a0 a0Var3;
        Object obj;
        androidx.compose.runtime.f fVar;
        androidx.compose.ui.i iVar;
        String str;
        androidx.compose.runtime.f fVar2;
        int i3;
        a1 a1Var;
        a1 a1Var2;
        a0 a0Var4;
        List list;
        a1 a1Var3;
        androidx.compose.runtime.f fVar3;
        String strL;
        boolean zH;
        Object objQ;
        String str2;
        s sVar3 = sVar2;
        androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
        sVar.getClass();
        sVar3.c0(-1652149065);
        int i4 = i | (sVar3.h(sVar) ? 4 : 2) | 16;
        if (sVar3.T(i4 & 1, (i4 & 19) != 18)) {
            sVar3.Y();
            if ((i & 1) == 0 || sVar3.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar3);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-113);
                    a0Var3 = (a0) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(a0.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar3), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar3);
                }
            } else {
                sVar3.W();
                i2 = i4 & (-113);
                a0Var3 = a0Var;
            }
            sVar3.q();
            a1 a1VarG = androidx.compose.runtime.t.g(a0Var3.l, sVar3);
            a1 a1VarG2 = androidx.compose.runtime.t.g(a0Var3.s, sVar3);
            a1 a1VarG3 = androidx.compose.runtime.t.g(a0Var3.u, sVar3);
            a1 a1VarG4 = androidx.compose.runtime.t.g(a0Var3.w, sVar3);
            a1 a1VarG5 = androidx.compose.runtime.t.g(a0Var3.D, sVar3);
            a1 a1VarG6 = androidx.compose.runtime.t.g(a0Var3.o, sVar3);
            a1 a1VarG7 = androidx.compose.runtime.t.g(a0Var3.q, sVar3);
            a1 a1VarG8 = androidx.compose.runtime.t.g(a0Var3.F, sVar3);
            a1 a1VarG9 = androidx.compose.runtime.t.g(a0Var3.H, sVar3);
            a1 a1VarG10 = androidx.compose.runtime.t.g(a0Var3.J, sVar3);
            a1 a1VarG11 = androidx.compose.runtime.t.g(a0Var3.L, sVar3);
            a1 a1VarG12 = androidx.compose.runtime.t.g(a0Var3.R, sVar3);
            a1 a1VarG13 = androidx.compose.runtime.t.g(a0Var3.N, sVar3);
            Object objQ2 = sVar3.Q();
            androidx.compose.runtime.f fVar4 = androidx.compose.runtime.n.a;
            kotlin.coroutines.d dVar = null;
            if (objQ2 == fVar4) {
                objQ2 = androidx.compose.runtime.t.r(null);
                sVar3.l0(objQ2);
            }
            a1 a1Var4 = (a1) objQ2;
            Context context = (Context) sVar3.j(m0.b);
            boolean zH2 = sVar3.h(a0Var3) | sVar3.h(context);
            Object objQ3 = sVar3.Q();
            if (zH2 || objQ3 == fVar4) {
                objQ3 = new androidx.room.s(a0Var3, context, dVar, 13);
                sVar3.l0(objQ3);
            }
            l0.c(sVar3, y.a, (p) objQ3);
            e0 e0Var = i1.c;
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL = sVar3.l();
            r rVarC = androidx.compose.ui.a.c(sVar3, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar5);
            } else {
                sVar3.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar3, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar3, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar3, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar3, rVarC, eVar4);
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar3.j(n6.a)).e;
            long j = ((t0) sVar3.j(u0.a)).o;
            float f = 16;
            float f2 = 4;
            o oVar = o.b;
            androidx.compose.runtime.f fVar6 = fVar4;
            a0 a0Var5 = a0Var3;
            z5.b("Live TV", androidx.compose.foundation.layout.b.u(oVar, f, f, 0.0f, f2, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 54, 0, 131064);
            sVar3 = sVar2;
            float f3 = 12;
            r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar3), false), f3, f2);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(6), androidx.compose.ui.c.G, sVar3, 6);
            int iHashCode2 = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
            r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarR);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar5);
            } else {
                sVar3.o0();
            }
            androidx.compose.runtime.t.x(sVar3, f1VarA, eVar);
            androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar3, eVar3, sVar3, dVar2);
            androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
            sVar3.b0(-1756615263);
            final a0 a0Var6 = a0Var5;
            for (kotlin.k kVar : a0Var6.S) {
                final String str3 = (String) kVar.e;
                String str4 = (String) kVar.y;
                boolean zA = kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), str3);
                boolean zH3 = sVar3.h(a0Var6) | sVar3.f(str3);
                Object objQ4 = sVar3.Q();
                androidx.compose.runtime.f fVar7 = fVar6;
                if (zH3 || objQ4 == fVar7) {
                    final int i5 = 3;
                    objQ4 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    a0 a0Var7 = a0Var6;
                                    a0Var7.p.setValue(str3);
                                    a0Var7.j();
                                    break;
                                case 1:
                                    a0 a0Var8 = a0Var6;
                                    a0Var8.Q.setValue(str3);
                                    a0Var8.n();
                                    break;
                                case 2:
                                    a0 a0Var9 = a0Var6;
                                    a0Var9.K.setValue(str3);
                                    break;
                                default:
                                    a0 a0Var10 = a0Var6;
                                    String str5 = str3;
                                    str5.getClass();
                                    a0Var10.v.setValue(str5);
                                    a0Var10.p.setValue(null);
                                    a0Var10.K.setValue(null);
                                    a0Var10.I.setValue(kotlin.collections.w.e);
                                    Context context2 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str5));
                                    com.app.mlounge.util.a.f("livetv ".concat(str5));
                                    if (!str5.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                        a0Var10.G.setValue(Boolean.FALSE);
                                        a0Var10.E.setValue(x.e);
                                    }
                                    if (str5.equals("ntv")) {
                                        a0Var10.Q.setValue(null);
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str5, null, 29), 3, null);
                                    a0Var10.n();
                                    break;
                            }
                            return y.a;
                        }
                    };
                    sVar3.l0(objQ4);
                }
                e(str4, zA, (kotlin.jvm.functions.a) objQ4, sVar3, 0);
                fVar6 = fVar7;
            }
            androidx.compose.runtime.f fVar8 = fVar6;
            sVar3.p(false);
            sVar3.p(true);
            if (((List) a1VarG6.getValue()).isEmpty() || kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), "ntv")) {
                obj = "ntv";
                fVar = fVar8;
                iVar = iVar2;
                str = "All";
                sVar3.b0(2099004065);
                sVar3.p(false);
            } else {
                sVar3.b0(2098053636);
                r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar3), false), f3, f2);
                iVar = iVar2;
                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(8), iVar, sVar3, 54);
                int iHashCode3 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                r rVarC3 = androidx.compose.ui.a.c(sVar3, rVarR2);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar9 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar9);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA2, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar3, jVarL3, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar3, rVarC3, androidx.compose.ui.node.g.d);
                str = "All";
                obj = "ntv";
                q1.b(_COROUTINE.a.N(), "Filter groups", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar3, 432, 0);
                boolean z = ((String) a1VarG7.getValue()) == null;
                boolean zH4 = sVar3.h(a0Var6);
                Object objQ5 = sVar3.Q();
                if (zH4) {
                    fVar = fVar8;
                } else {
                    fVar = fVar8;
                    if (objQ5 == fVar) {
                    }
                    e(str, z, (kotlin.jvm.functions.a) objQ5, sVar3, 6);
                    sVar3.b0(-1996621739);
                    for (final String str5 : (List) a1VarG6.getValue()) {
                        if (kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), "plutotv")) {
                            strL = a0.l(str5);
                            if (strL == null) {
                                ?? r8 = b0.a;
                                String upperCase = strL.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                str2 = (String) r8.get(upperCase);
                                if (str2 != null) {
                                    strL = str2;
                                }
                            } else if (str5 == null) {
                                strL = "";
                            } else {
                                strL = str5;
                            }
                        } else {
                            strL = str5;
                        }
                        boolean zA2 = kotlin.jvm.internal.l.a((String) a1VarG7.getValue(), str5);
                        zH = sVar3.h(a0Var6) | sVar3.f(str5);
                        objQ = sVar3.Q();
                        if (zH || objQ == fVar) {
                            final int i6 = 0;
                            objQ = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            a0 a0Var7 = a0Var6;
                                            a0Var7.p.setValue(str5);
                                            a0Var7.j();
                                            break;
                                        case 1:
                                            a0 a0Var8 = a0Var6;
                                            a0Var8.Q.setValue(str5);
                                            a0Var8.n();
                                            break;
                                        case 2:
                                            a0 a0Var9 = a0Var6;
                                            a0Var9.K.setValue(str5);
                                            break;
                                        default:
                                            a0 a0Var10 = a0Var6;
                                            String str6 = str5;
                                            str6.getClass();
                                            a0Var10.v.setValue(str6);
                                            a0Var10.p.setValue(null);
                                            a0Var10.K.setValue(null);
                                            a0Var10.I.setValue(kotlin.collections.w.e);
                                            Context context2 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str6));
                                            com.app.mlounge.util.a.f("livetv ".concat(str6));
                                            if (!str6.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                                a0Var10.G.setValue(Boolean.FALSE);
                                                a0Var10.E.setValue(x.e);
                                            }
                                            if (str6.equals("ntv")) {
                                                a0Var10.Q.setValue(null);
                                            }
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str6, null, 29), 3, null);
                                            a0Var10.n();
                                            break;
                                    }
                                    return y.a;
                                }
                            };
                            sVar3.l0(objQ);
                        }
                        e(strL, zA2, (kotlin.jvm.functions.a) objQ, sVar3, 0);
                    }
                    androidx.room.b0.g(sVar3, false, true, false);
                }
                final int i7 = 0;
                objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                a0 a0Var7 = a0Var6;
                                a0Var7.p.setValue(null);
                                a0Var7.j();
                                break;
                            case 1:
                                a0 a0Var8 = a0Var6;
                                a0Var8.Q.setValue(null);
                                a0Var8.n();
                                break;
                            default:
                                a0Var6.K.setValue(null);
                                break;
                        }
                        return y.a;
                    }
                };
                sVar3.l0(objQ5);
                e(str, z, (kotlin.jvm.functions.a) objQ5, sVar3, 6);
                sVar3.b0(-1996621739);
                while (r5.hasNext()) {
                    if (kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), "plutotv")) {
                        strL = str5;
                    } else {
                        strL = a0.l(str5);
                        if (strL == null) {
                            ?? r9 = b0.a;
                            String upperCase2 = strL.toUpperCase(Locale.ROOT);
                            upperCase2.getClass();
                            str2 = (String) r9.get(upperCase2);
                            if (str2 != null) {
                                strL = str2;
                            }
                        } else if (str5 == null) {
                            strL = "";
                        } else {
                            strL = str5;
                        }
                    }
                    boolean zA3 = kotlin.jvm.internal.l.a((String) a1VarG7.getValue(), str5);
                    zH = sVar3.h(a0Var6) | sVar3.f(str5);
                    objQ = sVar3.Q();
                    if (zH) {
                        final int i8 = 0;
                        objQ = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        a0 a0Var7 = a0Var6;
                                        a0Var7.p.setValue(str5);
                                        a0Var7.j();
                                        break;
                                    case 1:
                                        a0 a0Var8 = a0Var6;
                                        a0Var8.Q.setValue(str5);
                                        a0Var8.n();
                                        break;
                                    case 2:
                                        a0 a0Var9 = a0Var6;
                                        a0Var9.K.setValue(str5);
                                        break;
                                    default:
                                        a0 a0Var10 = a0Var6;
                                        String str6 = str5;
                                        str6.getClass();
                                        a0Var10.v.setValue(str6);
                                        a0Var10.p.setValue(null);
                                        a0Var10.K.setValue(null);
                                        a0Var10.I.setValue(kotlin.collections.w.e);
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str6));
                                        com.app.mlounge.util.a.f("livetv ".concat(str6));
                                        if (!str6.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var10.G.setValue(Boolean.FALSE);
                                            a0Var10.E.setValue(x.e);
                                        }
                                        if (str6.equals("ntv")) {
                                            a0Var10.Q.setValue(null);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str6, null, 29), 3, null);
                                        a0Var10.n();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        sVar3.l0(objQ);
                    } else {
                        final int i9 = 0;
                        objQ = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        a0 a0Var7 = a0Var6;
                                        a0Var7.p.setValue(str5);
                                        a0Var7.j();
                                        break;
                                    case 1:
                                        a0 a0Var8 = a0Var6;
                                        a0Var8.Q.setValue(str5);
                                        a0Var8.n();
                                        break;
                                    case 2:
                                        a0 a0Var9 = a0Var6;
                                        a0Var9.K.setValue(str5);
                                        break;
                                    default:
                                        a0 a0Var10 = a0Var6;
                                        String str6 = str5;
                                        str6.getClass();
                                        a0Var10.v.setValue(str6);
                                        a0Var10.p.setValue(null);
                                        a0Var10.K.setValue(null);
                                        a0Var10.I.setValue(kotlin.collections.w.e);
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str6));
                                        com.app.mlounge.util.a.f("livetv ".concat(str6));
                                        if (!str6.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var10.G.setValue(Boolean.FALSE);
                                            a0Var10.E.setValue(x.e);
                                        }
                                        if (str6.equals("ntv")) {
                                            a0Var10.Q.setValue(null);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str6, null, 29), 3, null);
                                        a0Var10.n();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        sVar3.l0(objQ);
                    }
                    e(strL, zA3, (kotlin.jvm.functions.a) objQ, sVar3, 0);
                }
                androidx.room.b0.g(sVar3, false, true, false);
            }
            if (kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), obj)) {
                sVar3.b0(2099108039);
                r rVarR3 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar3), false), f3, f2);
                f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(8), iVar, sVar3, 54);
                int iHashCode4 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL4 = sVar3.l();
                r rVarC4 = androidx.compose.ui.a.c(sVar3, rVarR3);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar10 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar10);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA3, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar3, jVarL4, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode4), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar3, rVarC4, androidx.compose.ui.node.g.d);
                fVar2 = fVar;
                q1.b(_COROUTINE.a.N(), "Filter server", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar3, 432, 0);
                boolean z2 = ((String) a1VarG12.getValue()) == null;
                boolean zH5 = sVar3.h(a0Var6);
                Object objQ6 = sVar3.Q();
                if (zH5 || objQ6 == fVar2) {
                    final int i10 = 1;
                    objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    a0 a0Var7 = a0Var6;
                                    a0Var7.p.setValue(null);
                                    a0Var7.j();
                                    break;
                                case 1:
                                    a0 a0Var8 = a0Var6;
                                    a0Var8.Q.setValue(null);
                                    a0Var8.n();
                                    break;
                                default:
                                    a0Var6.K.setValue(null);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    sVar3.l0(objQ6);
                }
                e(str, z2, (kotlin.jvm.functions.a) objQ6, sVar3, 6);
                sVar3.b0(-716045851);
                for (final String str6 : a0Var6.P) {
                    String upperCase3 = str6.toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    boolean zA4 = kotlin.jvm.internal.l.a((String) a1VarG12.getValue(), str6);
                    boolean zH6 = sVar3.h(a0Var6) | sVar3.f(str6);
                    Object objQ7 = sVar3.Q();
                    if (zH6 || objQ7 == fVar2) {
                        final int i11 = 1;
                        objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        a0 a0Var7 = a0Var6;
                                        a0Var7.p.setValue(str6);
                                        a0Var7.j();
                                        break;
                                    case 1:
                                        a0 a0Var8 = a0Var6;
                                        a0Var8.Q.setValue(str6);
                                        a0Var8.n();
                                        break;
                                    case 2:
                                        a0 a0Var9 = a0Var6;
                                        a0Var9.K.setValue(str6);
                                        break;
                                    default:
                                        a0 a0Var10 = a0Var6;
                                        String str7 = str6;
                                        str7.getClass();
                                        a0Var10.v.setValue(str7);
                                        a0Var10.p.setValue(null);
                                        a0Var10.K.setValue(null);
                                        a0Var10.I.setValue(kotlin.collections.w.e);
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str7));
                                        com.app.mlounge.util.a.f("livetv ".concat(str7));
                                        if (!str7.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var10.G.setValue(Boolean.FALSE);
                                            a0Var10.E.setValue(x.e);
                                        }
                                        if (str7.equals("ntv")) {
                                            a0Var10.Q.setValue(null);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str7, null, 29), 3, null);
                                        a0Var10.n();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        sVar3.l0(objQ7);
                    }
                    e(upperCase3, zA4, (kotlin.jvm.functions.a) objQ7, sVar3, 0);
                }
                androidx.room.b0.g(sVar3, false, true, false);
            } else {
                fVar2 = fVar;
                sVar3.b0(2099994081);
                sVar3.p(false);
            }
            if (!kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), "sports") || ((List) a1VarG10.getValue()).isEmpty()) {
                i3 = 54;
                sVar3.b0(2101022785);
                sVar3.p(false);
            } else {
                sVar3.b0(2100133860);
                r rVarR4 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar3), false), f3, f2);
                f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.g(8), iVar, sVar3, 54);
                int iHashCode5 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL5 = sVar3.l();
                r rVarC5 = androidx.compose.ui.a.c(sVar3, rVarR4);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar11 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar11);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA4, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar3, jVarL5, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode5), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar3, rVarC5, androidx.compose.ui.node.g.d);
                i3 = 54;
                q1.b(_COROUTINE.a.N(), "Filter server", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar3, 432, 0);
                boolean z3 = ((String) a1VarG11.getValue()) == null;
                boolean zH7 = sVar3.h(a0Var6);
                Object objQ8 = sVar3.Q();
                if (zH7 || objQ8 == fVar2) {
                    final int i12 = 2;
                    objQ8 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    a0 a0Var7 = a0Var6;
                                    a0Var7.p.setValue(null);
                                    a0Var7.j();
                                    break;
                                case 1:
                                    a0 a0Var8 = a0Var6;
                                    a0Var8.Q.setValue(null);
                                    a0Var8.n();
                                    break;
                                default:
                                    a0Var6.K.setValue(null);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    sVar3.l0(objQ8);
                }
                e(str, z3, (kotlin.jvm.functions.a) objQ8, sVar3, 6);
                sVar3.b0(-430909666);
                for (final String str7 : a0Var6.O) {
                    boolean zA5 = kotlin.jvm.internal.l.a((String) a1VarG11.getValue(), str7);
                    boolean zH8 = sVar3.h(a0Var6) | sVar3.f(str7);
                    Object objQ9 = sVar3.Q();
                    if (zH8 || objQ9 == fVar2) {
                        final int i13 = 2;
                        objQ9 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.c
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i13) {
                                    case 0:
                                        a0 a0Var7 = a0Var6;
                                        a0Var7.p.setValue(str7);
                                        a0Var7.j();
                                        break;
                                    case 1:
                                        a0 a0Var8 = a0Var6;
                                        a0Var8.Q.setValue(str7);
                                        a0Var8.n();
                                        break;
                                    case 2:
                                        a0 a0Var9 = a0Var6;
                                        a0Var9.K.setValue(str7);
                                        break;
                                    default:
                                        a0 a0Var10 = a0Var6;
                                        String str8 = str7;
                                        str8.getClass();
                                        a0Var10.v.setValue(str8);
                                        a0Var10.p.setValue(null);
                                        a0Var10.K.setValue(null);
                                        a0Var10.I.setValue(kotlin.collections.w.e);
                                        Context context2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("D", "LiveTv", "provider=".concat(str8));
                                        com.app.mlounge.util.a.f("livetv ".concat(str8));
                                        if (!str8.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var10.G.setValue(Boolean.FALSE);
                                            a0Var10.E.setValue(x.e);
                                        }
                                        if (str8.equals("ntv")) {
                                            a0Var10.Q.setValue(null);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var10), null, null, new androidx.room.s(a0Var10, str8, null, 29), 3, null);
                                        a0Var10.n();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        sVar3.l0(objQ9);
                    }
                    e(str7, zA5, (kotlin.jvm.functions.a) objQ9, sVar3, 0);
                }
                androidx.room.b0.g(sVar3, false, true, false);
            }
            if (((Boolean) a1VarG2.getValue()).booleanValue()) {
                sVar3.b0(621965619);
                com.app.mlounge.ui.components.b0.n(null, sVar3, 0);
                sVar3.p(false);
                a0Var4 = a0Var6;
                a1Var2 = a1Var4;
            } else {
                if (!kotlin.jvm.internal.l.a((String) a1VarG4.getValue(), "sports") || ((List) a1VarG10.getValue()).isEmpty()) {
                    a0Var6 = a0Var6;
                    a1Var = a1Var4;
                    if (((String) a1VarG3.getValue()) != null && ((List) a1VarG.getValue()).isEmpty()) {
                        sVar3.b0(622018693);
                        String str8 = (String) a1VarG3.getValue();
                        str8.getClass();
                        boolean zH9 = sVar3.h(a0Var6);
                        Object objQ10 = sVar3.Q();
                        if (zH9 || objQ10 == fVar2) {
                            objQ10 = new s0(a0Var6);
                            sVar3.l0(objQ10);
                        }
                        com.app.mlounge.ui.components.b0.i(str8, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ10), sVar3, 0);
                        sVar3.s();
                    } else if (kotlin.jvm.internal.l.a(d(a1VarG4), com.app.mlounge.data.iptv.l.SLUG) && ((Boolean) a1VarG9.getValue()).booleanValue()) {
                        sVar3.b0(2102867626);
                        r rVarD = i1.d(oVar);
                        q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode6 = Long.hashCode(androidx.compose.runtime.t.n(sVar3));
                        androidx.compose.runtime.internal.j jVarA = sVar3.A();
                        r rVarC6 = androidx.compose.ui.a.c(sVar3, rVarD);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVarB = androidx.compose.ui.node.g.b();
                        sVar3.e0();
                        if (sVar3.E()) {
                            sVar3.k(fVarB);
                        } else {
                            sVar3.o0();
                        }
                        androidx.compose.runtime.t.x(sVar3, q0VarD, androidx.compose.ui.node.g.d());
                        androidx.compose.runtime.t.x(sVar3, jVarA, androidx.compose.ui.node.g.f());
                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode6), androidx.compose.ui.node.g.c());
                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.a());
                        androidx.compose.runtime.t.x(sVar3, rVarC6, androidx.compose.ui.node.g.e());
                        w wVarA2 = u.a(androidx.compose.foundation.layout.h.g(f3), androidx.compose.ui.c.K, sVar3, i3);
                        int iHashCode7 = Long.hashCode(androidx.compose.runtime.t.n(sVar3));
                        androidx.compose.runtime.internal.j jVarA2 = sVar3.A();
                        r rVarC7 = androidx.compose.ui.a.c(sVar3, oVar);
                        androidx.compose.ui.node.f fVarB2 = androidx.compose.ui.node.g.b();
                        sVar3.e0();
                        if (sVar3.E()) {
                            sVar3.k(fVarB2);
                        } else {
                            sVar3.o0();
                        }
                        androidx.compose.runtime.t.x(sVar3, wVarA2, androidx.compose.ui.node.g.d());
                        androidx.compose.runtime.t.x(sVar3, jVarA2, androidx.compose.ui.node.g.f());
                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode7), androidx.compose.ui.node.g.c());
                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.a());
                        androidx.compose.runtime.t.x(sVar3, rVarC7, androidx.compose.ui.node.g.e());
                        q1.b(_COROUTINE.a.O(), null, i1.m(oVar, 56), com.app.mlounge.ui.theme.b.d(), sVar3, 432, 0);
                        x2 x2Var = n6.a;
                        a0Var4 = a0Var6;
                        a1Var2 = a1Var;
                        z5.b("My IPTV not set up", null, com.app.mlounge.ui.theme.b.b(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).c(), sVar2, 6, 0, 131066);
                        z5.b("Please setup your provider in Settings > Custom IPTV provider", null, com.app.mlounge.ui.theme.b.d(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).a(), sVar2, 6, 0, 131066);
                        sVar3 = sVar2;
                        sVar3.r();
                        sVar3.r();
                        sVar3.s();
                        fVar2 = fVar2;
                    } else {
                        androidx.compose.runtime.f fVar12 = fVar2;
                        a1Var2 = a1Var;
                        if (!kotlin.jvm.internal.l.a(d(a1VarG4), com.app.mlounge.data.iptv.l.SLUG) || ((Map) a1VarG8.getValue()).isEmpty() || ((List) a1VarG.getValue()).isEmpty()) {
                            fVar2 = fVar12;
                            sVar3.b0(2104350759);
                            androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar3.j(com.app.mlounge.ui.theme.g.a)).y * 1.07f);
                            z0 z0VarA = androidx.compose.foundation.layout.b.a(f3);
                            float f4 = 8;
                            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                            androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                            r rVarD2 = i1.d(oVar);
                            boolean zF = sVar3.f(a1VarG) | sVar3.f(a1VarG4) | sVar3.h(a0Var6) | ((i2 & 14) == 4);
                            Object objQ11 = sVar3.Q();
                            if (zF || objQ11 == fVar2) {
                                i0 i0Var = new i0((Object) a1VarG, (Object) a0Var6, (kotlin.d) sVar, a1VarG4, 11);
                                a0Var4 = a0Var6;
                                sVar3.l0(i0Var);
                                objQ11 = i0Var;
                            } else {
                                a0Var4 = a0Var6;
                            }
                            v.b(aVar, rVarD2, null, z0VarA, fVarG2, fVarG, null, false, null, (l) objQ11, sVar2, 1772592, 916);
                            sVar3 = sVar2;
                            sVar3.s();
                        } else {
                            sVar3.b0(2103737300);
                            List list2 = (List) a1VarG.getValue();
                            Map map = (Map) a1VarG8.getValue();
                            boolean zH10 = sVar3.h(a0Var6) | ((i2 & 14) == 4);
                            Object objQ12 = sVar3.Q();
                            fVar2 = fVar12;
                            if (zH10 || objQ12 == fVar2) {
                                objQ12 = new r0(28, a0Var6, sVar);
                                sVar3.l0(objQ12);
                            }
                            l lVar = (l) objQ12;
                            boolean zH11 = sVar3.h(a0Var6);
                            Object objQ13 = sVar3.Q();
                            if (zH11 || objQ13 == fVar2) {
                                objQ13 = new s2(a0Var6, 15);
                                sVar3.l0(objQ13);
                            }
                            b(list2, map, lVar, (l) objQ13, sVar3, 0);
                            sVar3.s();
                            a0Var4 = a0Var6;
                        }
                    }
                } else {
                    sVar3.b0(2101203577);
                    if (((String) a1VarG11.getValue()) == null) {
                        list = (List) a1VarG10.getValue();
                    } else {
                        List list3 = (List) a1VarG10.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list3) {
                            if (kotlin.text.r.o(((SportsMatch) obj2).e(), (String) a1VarG11.getValue(), true)) {
                                arrayList.add(obj2);
                            }
                        }
                        list = arrayList;
                    }
                    z0 z0VarA2 = androidx.compose.foundation.layout.b.a(f3);
                    androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(8);
                    r rVarD3 = i1.d(oVar);
                    boolean zH12 = sVar3.h(list) | sVar3.h(a0Var6) | ((i2 & 14) == 4);
                    Object objQ14 = sVar3.Q();
                    if (zH12 || objQ14 == fVar2) {
                        i0 i0Var2 = new i0((Object) list, (Object) a0Var6, (kotlin.d) sVar, a1Var4, 10);
                        a1Var = a1Var4;
                        sVar3.l0(i0Var2);
                        objQ14 = i0Var2;
                    } else {
                        a1Var = a1Var4;
                    }
                    android.support.v4.media.session.b.c(rVarD3, null, z0VarA2, fVarG3, null, null, false, null, (l) objQ14, sVar3, 24966, 490);
                    sVar3.s();
                }
                a0Var4 = a0Var6;
                a1Var2 = a1Var;
            }
            sVar3.r();
            SportsMatch sportsMatch = (SportsMatch) a1Var2.getValue();
            if (sportsMatch == null) {
                sVar3.b0(1163290523);
                sVar3.s();
                fVar3 = fVar2;
            } else {
                sVar3.b0(1163290524);
                List listF = sportsMatch.f();
                if (listF == null) {
                    listF = kotlin.collections.w.e;
                }
                List list4 = listF;
                long j2 = com.app.mlounge.ui.theme.b.b;
                x2 x2Var2 = u0.a;
                long j3 = ((t0) sVar3.j(x2Var2)).q;
                long j4 = ((t0) sVar3.j(x2Var2)).s;
                Object objQ15 = sVar3.Q();
                if (objQ15 == fVar2) {
                    a1Var3 = a1Var2;
                    objQ15 = new m(a1Var3, 20);
                    sVar3.l0(objQ15);
                } else {
                    a1Var3 = a1Var2;
                }
                fVar3 = fVar2;
                androidx.compose.material3.q.a((kotlin.jvm.functions.a) objQ15, a, null, null, b, androidx.compose.runtime.internal.k.c(817549827, new q(list4, a0Var4, sportsMatch, sVar, a1Var3), sVar3), null, j2, 0L, j3, j4, 0.0f, null, sVar2, 1769526, 0, 12956);
                sVar3 = sVar2;
                sVar3.s();
            }
            String str9 = (String) a1VarG5.getValue();
            if (str9 == null) {
                str9 = (String) a1VarG13.getValue();
            }
            if (str9 != null) {
                sVar3.b0(1165200713);
                Object objQ16 = sVar3.Q();
                if (objQ16 == fVar3) {
                    objQ16 = new androidx.compose.runtime.c0(27);
                    sVar3.l0(objQ16);
                }
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1138298935, new com.app.mlounge.ui.components.r(str9, 5), sVar3);
                long j5 = com.app.mlounge.ui.theme.b.b;
                x2 x2Var3 = u0.a;
                androidx.compose.material3.q.a((kotlin.jvm.functions.a) objQ16, c, null, null, d, fVarC, null, j5, 0L, ((t0) sVar3.j(x2Var3)).q, ((t0) sVar3.j(x2Var3)).s, 0.0f, null, sVar2, 1769526, 0, 12956);
                sVar3 = sVar2;
                sVar3.s();
            } else {
                sVar3.b0(1165879179);
                sVar3.s();
            }
            a0Var2 = a0Var4;
        } else {
            sVar3.W();
            a0Var2 = a0Var;
        }
        s1 s1VarT = sVar3.t();
        if (s1VarT != null) {
            s1VarT.e(new androidx.compose.foundation.contextmenu.f(sVar, a0Var2, i, 20));
        }
    }

    public static final String d(a1 a1Var) {
        return (String) a1Var.getValue();
    }

    public static final void e(String str, boolean z, kotlin.jvm.functions.a aVar, s sVar, int i) {
        int i2;
        sVar.c0(375510118);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar.g(z) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            k kVar = (k) objQ;
            float f = 8;
            r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(o.b, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z2 = (i3 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new androidx.compose.material3.x2(10, aVar);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1531836543, new com.app.mlounge.ui.screens.adult.c(1, str, z), sVar), sVar, 12582912, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.selection.g(str, z, aVar, i);
        }
    }

    public static final void f(SportsMatch sportsMatch, kotlin.jvm.functions.a aVar, s sVar, int i) {
        int i2;
        sVar.c0(-1135449566);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(sportsMatch) : sVar.h(sportsMatch) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            k kVar = (k) objQ;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            float f = 8;
            r rVarG = androidx.compose.foundation.s.g(i1.e(o.b, 1.0f), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ2 = sVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new androidx.compose.material3.x2(11, aVar);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1252171069, new g0(sportsMatch, 23), sVar), sVar, 12582912, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new v1(sportsMatch, aVar, i, 11);
        }
    }
}
