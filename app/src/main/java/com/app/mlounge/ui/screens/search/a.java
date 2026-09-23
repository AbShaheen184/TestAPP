package com.app.mlounge.ui.screens.search;

import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.c0;
import androidx.compose.foundation.text.p0;
import androidx.compose.foundation.text.q0;
import androidx.compose.material3.b4;
import androidx.compose.material3.h4;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.u5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.v;
import com.app.mlounge.ui.viewmodel.b1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.a0;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 1777120365, new com.app.mlounge.ui.screens.music.a(4));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 1933362543, new com.app.mlounge.ui.screens.music.a(5));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, 42387881, new com.app.mlounge.ui.screens.music.a(6));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(false, 2060991508, new androidx.compose.foundation.contextmenu.b(21));

    /* JADX WARN: Code duplicated, block: B:102:0x0473  */
    /* JADX WARN: Code duplicated, block: B:105:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:111:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x0519  */
    /* JADX WARN: Code duplicated, block: B:120:0x051e  */
    /* JADX WARN: Code duplicated, block: B:126:0x053f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0564  */
    /* JADX WARN: Code duplicated, block: B:130:0x056e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0765  */
    /* JADX WARN: Code duplicated, block: B:166:0x0783  */
    /* JADX WARN: Code duplicated, block: B:168:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:169:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x0804  */
    /* JADX WARN: Code duplicated, block: B:175:0x0812  */
    /* JADX WARN: Code duplicated, block: B:178:0x0833  */
    /* JADX WARN: Code duplicated, block: B:179:0x0836  */
    /* JADX WARN: Code duplicated, block: B:183:0x0853  */
    /* JADX WARN: Code duplicated, block: B:186:0x0881  */
    /* JADX WARN: Code duplicated, block: B:188:0x088c  */
    /* JADX WARN: Code duplicated, block: B:191:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:194:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:196:0x0914  */
    /* JADX WARN: Code duplicated, block: B:197:0x0918  */
    /* JADX WARN: Code duplicated, block: B:200:0x096b  */
    /* JADX WARN: Code duplicated, block: B:202:0x098a  */
    /* JADX WARN: Code duplicated, block: B:204:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:206:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:208:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:210:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:211:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:214:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:217:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:218:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:221:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:222:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:225:0x0a14 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:227:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:232:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:235:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:242:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:245:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:246:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:249:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:250:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:253:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:254:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:257:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:258:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:261:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:262:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:265:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:266:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:279:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:290:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:208:0x09d5, please report this as an issue */
    public static final void a(final l lVar, final l lVar2, final l lVar3, final p pVar, final q qVar, final l lVar4, final l lVar5, final l lVar6, b1 b1Var, s sVar, int i) {
        b1 b1Var2;
        int i2;
        b1 b1Var3;
        int i3;
        kotlin.coroutines.d dVar;
        Object obj;
        Object obj2;
        a1 a1Var;
        Object obj3;
        Object objQ;
        Object obj4;
        Object obj5;
        b1 b1Var4;
        List listK;
        List listN;
        float f;
        float f2;
        androidx.compose.ui.i iVar;
        Iterator it;
        int i4;
        a1 a1Var2;
        float f3;
        float f4;
        androidx.compose.ui.i iVar2;
        b1 b1Var5;
        Object obj6;
        b1 b1Var6;
        a1 a1Var3;
        float f5;
        androidx.compose.ui.i iVar3;
        float f6;
        Object obj7;
        final boolean z;
        char c2;
        b1 b1Var7;
        Object obj8;
        boolean z2;
        final b1 b1Var8;
        final boolean z3;
        final boolean z4;
        boolean z5;
        final boolean z6;
        int iIntValue;
        List list;
        int iB;
        boolean z7;
        boolean z8;
        final boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        final List list2;
        boolean z13;
        boolean z14;
        boolean z15;
        final boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ2;
        b1 b1Var9;
        s1 s1VarT;
        kotlin.jvm.functions.a aVar;
        s1 s1VarT2;
        kotlin.jvm.functions.a aVar2;
        Object objQ3;
        Object obj9;
        Object objI;
        a1 a1VarB;
        long j;
        b1 b1Var10;
        boolean zH;
        Object obj10;
        char c3;
        long jB;
        Object objI2;
        Object next;
        int i5;
        Object objQ4;
        Object obj11;
        Object objI3;
        a1 a1VarB2;
        long j2;
        b1 b1Var11;
        boolean zH2;
        int i6;
        Object obj12;
        long jB2;
        androidx.compose.ui.i iVar4 = androidx.compose.ui.c.H;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        qVar.getClass();
        sVar.c0(134865149);
        int i7 = sVar.S ? -sVar.I.v : sVar.G.i;
        int i8 = i | (sVar.h(lVar) ? 4 : 2) | (sVar.h(lVar2) ? 32 : 16) | (sVar.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(pVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(qVar) ? 16384 : 8192) | (sVar.h(lVar4) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(lVar5) ? 1048576 : 524288) | (sVar.h(lVar6) ? 8388608 : 4194304) | 33554432;
        if (sVar.T(i8 & 1, (i8 & 38347923) != 38347922)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i8 & (-234881025);
                    b1Var3 = (b1) _COROUTINE.b.J(a0.a(b1.class), y0VarA, n.n(y0VarA, sVar), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                }
            } else {
                sVar.W();
                i2 = i8 & (-234881025);
                b1Var3 = b1Var;
            }
            int i9 = i2;
            sVar.q();
            a1 a1VarG = t.g(b1Var3.i, sVar);
            final a1 a1VarG2 = t.g(b1Var3.k, sVar);
            final a1 a1VarG3 = t.g(b1Var3.m, sVar);
            final a1 a1VarG4 = t.g(b1Var3.o, sVar);
            final a1 a1VarG5 = t.g(b1Var3.q, sVar);
            final a1 a1VarG6 = t.g(b1Var3.s, sVar);
            final a1 a1VarG7 = t.g(b1Var3.u, sVar);
            a1 a1VarG8 = t.g(b1Var3.w, sVar);
            a1 a1VarG9 = t.g(b1Var3.y, sVar);
            a1 a1VarG10 = t.g(b1Var3.A, sVar);
            a1 a1VarG11 = t.g(b1Var3.C, sVar);
            final a1 a1VarG12 = t.g(b1Var3.E, sVar);
            a1 a1VarG13 = t.g(b1Var3.G, sVar);
            final a1 a1VarG14 = t.g(b1Var3.I, sVar);
            a1 a1VarG15 = t.g(b1Var3.K, sVar);
            a1 a1VarG16 = t.g(b1Var3.M, sVar);
            Flow flow = b1Var3.N;
            Boolean bool = Boolean.FALSE;
            a1 a1VarF = t.f(flow, bool, null, sVar, 48, 2);
            x xVarA = z.a(0, 0, sVar, 3);
            boolean zF = sVar.f(xVarA) | sVar.h(b1Var3);
            Object objQ5 = sVar.Q();
            Object obj13 = androidx.compose.runtime.n.a;
            Object obj14 = objQ5;
            if (zF || objQ5 == obj13) {
                Object sVar2 = new androidx.room.s(xVarA, b1Var3, null, 19);
                sVar.l0(sVar2);
                obj14 = sVar2;
            }
            l0.c(sVar, xVarA, (p) obj14);
            e0 e0Var = i1.c;
            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            kotlin.jvm.functions.a aVar3 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(aVar3);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            t.x(sVar, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            t.x(sVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            t.p(sVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
            t.t(sVar, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            t.x(sVar, rVarC, eVar4);
            sVar.b0(-249688002);
            m0 m0Var = ((m6) sVar.j(n6.a)).e;
            long j3 = ((t0) sVar.j(u0.a)).o;
            float f7 = 16;
            float f8 = 4;
            o oVar = o.b;
            b1 b1Var12 = b1Var3;
            z5.b("Search", androidx.compose.foundation.layout.b.u(oVar, f7, f7, 0.0f, f8, 4), j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 54, 0, 131064);
            Object objQ6 = sVar.Q();
            Object obj15 = objQ6;
            if (objQ6 == obj13) {
                Object objR = t.r(bool);
                sVar.l0(objR);
                obj15 = objR;
            }
            a1 a1Var4 = (a1) obj15;
            l2 l2Var = (l2) sVar.j(l1.p);
            Object objQ7 = sVar.Q();
            Object objI4 = objQ7;
            if (objQ7 == obj13) {
                objI4 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            k kVar = (k) objI4;
            androidx.compose.ui.focus.l lVar7 = (androidx.compose.ui.focus.l) sVar.j(l1.i);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) a1Var4.getValue()).booleanValue());
            boolean zF2 = sVar.f(l2Var);
            Object objQ8 = sVar.Q();
            if (zF2 || objQ8 == obj13) {
                i3 = 2;
                dVar = null;
                Object vVar = new v(l2Var, a1Var4, null, 2);
                sVar.l0(vVar);
                obj = vVar;
            } else {
                i3 = 2;
                dVar = null;
                obj = objQ8;
            }
            l0.c(sVar, boolValueOf, (p) obj);
            Object objQ9 = sVar.Q();
            Object obj16 = objQ9;
            if (objQ9 == obj13) {
                Object xVar = new com.app.mlounge.ui.components.x(kVar, a1Var4, dVar, i3);
                sVar.l0(xVar);
                obj16 = xVar;
            }
            l0.c(sVar, kVar, (p) obj16);
            String str = (String) a1VarG.getValue();
            boolean zH3 = sVar.h(b1Var12);
            Object objQ10 = sVar.Q();
            if (zH3 || objQ10 == obj13) {
                objQ10 = new androidx.compose.foundation.c(1, b1Var12, b1.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, 14);
                sVar.l0(objQ10);
            }
            kotlin.reflect.e eVar5 = (kotlin.reflect.e) objQ10;
            boolean z20 = !((Boolean) a1Var4.getValue()).booleanValue();
            q0 q0Var = new q0(0, Token.INC);
            Object objQ11 = sVar.Q();
            Object obj17 = objQ11;
            if (objQ11 == obj13) {
                Object tVar = new com.app.mlounge.ui.t(23);
                sVar.l0(tVar);
                obj17 = tVar;
            }
            p0 p0Var = new p0(47, (l) obj17);
            b4 b4Var = b4.a;
            long j4 = com.app.mlounge.ui.theme.b.f;
            long j5 = com.app.mlounge.ui.theme.b.e;
            long j6 = com.app.mlounge.ui.theme.b.l;
            u5 u5VarC = b4.c(j6, j6, j4, j4, j5, 0L, 0L, sVar, 2147477244);
            r rVarR = androidx.compose.foundation.layout.b.r(i1.e(oVar, 1.0f), f7, f8);
            boolean zF3 = sVar.f(l2Var) | sVar.h(lVar7);
            Object objQ12 = sVar.Q();
            if (!zF3) {
                if (objQ12 != obj2) {
                    obj2 = obj13;
                    a1Var = a1Var4;
                    obj3 = objQ12;
                }
                r rVarE = androidx.compose.ui.input.key.c.e(rVarR, (l) obj3);
                objQ = sVar.Q();
                obj4 = objQ;
                if (objQ == obj2) {
                    Object m2Var = new m2(a1Var, 12);
                    sVar.l0(m2Var);
                    obj4 = m2Var;
                }
                obj5 = obj2;
                b1Var4 = b1Var12;
                h4.a(str, (l) eVar5, androidx.compose.ui.focus.d.t(rVarE, (l) obj4), false, z20, null, a, null, b, androidx.compose.runtime.internal.k.c(2011483632, new androidx.compose.foundation.contextmenu.f(24, b1Var12, a1VarG), sVar), null, q0Var, p0Var, true, 0, 0, kVar, null, u5VarC, sVar, 907542528, 12779520, 6, 2915496);
                listK = kotlin.collections.q.k("Movies", "TV Shows", "Anime", "Games", "Live TV", "Music");
                listN = listK;
                if (((Boolean) a1VarF.getValue()).booleanValue()) {
                    listN = kotlin.collections.p.N(listK, "Adult");
                }
                f = 12;
                f2 = 8;
                r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), f, f2);
                iVar = iVar4;
                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f2), iVar, sVar, 54);
                int iHashCode2 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                r rVarC2 = androidx.compose.ui.a.c(sVar, rVarR2);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(aVar3);
                } else {
                    sVar.o0();
                }
                t.x(sVar, f1VarA, eVar);
                t.x(sVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar2);
                t.x(sVar, rVarC2, eVar4);
                sVar.b0(1881746978);
                it = listN.iterator();
                i4 = 0;
                while (true) {
                    int i10 = 6;
                    if (it.hasNext()) {
                        a1Var2 = a1VarG13;
                        f3 = f;
                        f4 = f2;
                        iVar2 = iVar;
                        b1Var5 = b1Var4;
                        obj6 = obj5;
                        sVar.p(false);
                        boolean z21 = true;
                        sVar.p(true);
                        if (((Boolean) a1VarF.getValue()).booleanValue() || b(a1Var2) != 6) {
                            b1Var6 = b1Var5;
                            a1Var3 = a1Var2;
                            f5 = f8;
                            iVar3 = iVar2;
                            f6 = f3;
                            obj7 = obj6;
                            z = true;
                            sVar.b0(-242489989);
                            sVar.p(false);
                        } else {
                            sVar.b0(-244315889);
                            List listK2 = kotlin.collections.q.k(new kotlin.k(com.app.mlounge.data.repository.a.e, "XVideos"), new kotlin.k(com.app.mlounge.data.repository.a.y, "EPorner"));
                            float f9 = f8;
                            float f10 = f3;
                            r rVarR3 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), f10, f9);
                            androidx.compose.ui.i iVar5 = iVar2;
                            f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar5, sVar, 54);
                            int iHashCode3 = Long.hashCode(sVar.T);
                            androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                            r rVarC3 = androidx.compose.ui.a.c(sVar, rVarR3);
                            androidx.compose.ui.node.h.b.getClass();
                            kotlin.jvm.functions.a aVar4 = androidx.compose.ui.node.g.b;
                            sVar.e0();
                            if (sVar.S) {
                                sVar.k(aVar4);
                            } else {
                                sVar.o0();
                            }
                            t.x(sVar, f1VarA2, androidx.compose.ui.node.g.f);
                            t.x(sVar, jVarL3, androidx.compose.ui.node.g.e);
                            t.p(sVar, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                            t.t(sVar, androidx.compose.ui.node.g.h);
                            t.x(sVar, rVarC3, androidx.compose.ui.node.g.d);
                            sVar.b0(-579403207);
                            Iterator it2 = listK2.iterator();
                            while (it2.hasNext()) {
                                kotlin.k kVar2 = (kotlin.k) it2.next();
                                com.app.mlounge.data.repository.a aVar5 = (com.app.mlounge.data.repository.a) kVar2.e;
                                String str2 = (String) kVar2.y;
                                Object objQ13 = sVar.Q();
                                Object obj18 = obj6;
                                if (objQ13 == obj18) {
                                    objI2 = objQ13;
                                    objI2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                                }
                                objI2 = objQ13;
                                k kVar3 = (k) objI2;
                                float f11 = f9;
                                r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f4)), 2, ((Boolean) _COROUTINE.a.B(kVar3, sVar, i10).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                                boolean zH4 = sVar.h(b1Var5) | sVar.d(aVar5.ordinal());
                                Object objQ14 = sVar.Q();
                                Object obj19 = objQ14;
                                if (zH4 || objQ14 == obj18) {
                                    Object bVar = new com.app.mlounge.ui.screens.adult.b(15, b1Var5, aVar5);
                                    sVar.l0(bVar);
                                    obj19 = bVar;
                                }
                                p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) obj19, 28), kVar3, 1), androidx.compose.foundation.shape.e.a(f4), ((com.app.mlounge.data.repository.a) a1VarG16.getValue()) == aVar5 ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1474502154, new b2(12, aVar5, str2, a1VarG16), sVar), sVar, 12582912, 120);
                                f10 = f10;
                                z21 = true;
                                f9 = f11;
                                iVar5 = iVar5;
                                it2 = it2;
                                a1Var2 = a1Var2;
                                b1Var5 = b1Var5;
                                obj6 = obj18;
                                i10 = 6;
                            }
                            z = z21;
                            iVar3 = iVar5;
                            b1Var6 = b1Var5;
                            a1Var3 = a1Var2;
                            obj7 = obj6;
                            f5 = f9;
                            f6 = f10;
                            b0.g(sVar, false, z, false);
                        }
                        c2 = 5;
                        if (b(a1Var3) == 5) {
                            sVar.b0(-242368438);
                            List<String> listK3 = kotlin.collections.q.k("MusicMp3", "YouTube Music");
                            r rVarR4 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), f6, f5);
                            f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar3, sVar, 54);
                            int iHashCode4 = Long.hashCode(sVar.T);
                            androidx.compose.runtime.internal.j jVarL4 = sVar.l();
                            r rVarC4 = androidx.compose.ui.a.c(sVar, rVarR4);
                            androidx.compose.ui.node.h.b.getClass();
                            aVar2 = androidx.compose.ui.node.g.b;
                            sVar.e0();
                            if (sVar.S) {
                                sVar.k(aVar2);
                            } else {
                                sVar.o0();
                            }
                            t.x(sVar, f1VarA3, androidx.compose.ui.node.g.f);
                            t.x(sVar, jVarL4, androidx.compose.ui.node.g.e);
                            t.p(sVar, Integer.valueOf(iHashCode4), androidx.compose.ui.node.g.g);
                            t.t(sVar, androidx.compose.ui.node.g.h);
                            t.x(sVar, rVarC4, androidx.compose.ui.node.g.d);
                            sVar.b0(-1900970340);
                            for (String str3 : listK3) {
                                objQ3 = sVar.Q();
                                obj9 = obj7;
                                if (objQ3 == obj9) {
                                    objI = objQ3;
                                    objI = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                                }
                                objI = objQ3;
                                k kVar4 = (k) objI;
                                a1VarB = _COROUTINE.a.B(kVar4, sVar, 6);
                                r rVarA = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f4));
                                float f12 = 2;
                                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                                    j = com.app.mlounge.ui.theme.b.q;
                                } else {
                                    j = androidx.compose.ui.graphics.t.h;
                                }
                                r rVarG2 = androidx.compose.foundation.s.g(rVarA, f12, j, androidx.compose.foundation.shape.e.a(f4));
                                b1Var10 = b1Var6;
                                zH = sVar.h(b1Var10) | sVar.f(str3);
                                Object objQ15 = sVar.Q();
                                obj10 = objQ15;
                                if (zH || objQ15 == obj9) {
                                    Object bVar2 = new com.app.mlounge.ui.screens.adult.b(14, b1Var10, str3);
                                    sVar.l0(bVar2);
                                    obj10 = bVar2;
                                }
                                r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG2, kVar4, null, false, null, (kotlin.jvm.functions.a) obj10, 28), kVar4, z ? 1 : 0);
                                if (kotlin.jvm.internal.l.a((String) a1VarG15.getValue(), str3)) {
                                    c3 = 52429;
                                    jB = androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f);
                                } else {
                                    c3 = 52429;
                                    jB = com.app.mlounge.ui.theme.b.d;
                                }
                                b1Var6 = b1Var10;
                                p5.a(rVarN, androidx.compose.foundation.shape.e.a(f4), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(490656028, new com.app.mlounge.ui.screens.player.i(str3, a1VarG15, z ? 1 : 0), sVar), sVar, 12582912, 120);
                                obj7 = obj9;
                                c2 = 5;
                            }
                            b1Var7 = b1Var6;
                            obj8 = obj7;
                            z2 = false;
                            b0.g(sVar, false, z, false);
                        } else {
                            b1Var7 = b1Var6;
                            obj8 = obj7;
                            z2 = false;
                            sVar.b0(-240629989);
                            sVar.p(false);
                        }
                        if (((String) a1VarG.getValue()).length() < 2) {
                            sVar.b0(-240379013);
                            sVar.s();
                            if (((Boolean) a1VarG11.getValue()).booleanValue()) {
                                b1Var8 = b1Var7;
                                sVar.b0(-240324453);
                                sVar.s();
                                if (b(a1Var3) == 0) {
                                    z3 = z ? 1 : 0;
                                } else {
                                    z3 = false;
                                }
                                z4 = b(a1Var3) == z ? z ? 1 : 0 : false;
                                if (b(a1Var3) == 2) {
                                    z5 = z ? 1 : 0;
                                } else {
                                    z5 = false;
                                }
                                if (b(a1Var3) == 3) {
                                    z6 = z ? 1 : 0;
                                } else {
                                    z6 = false;
                                }
                                iIntValue = ((Number) a1VarG14.getValue()).intValue();
                                if (iIntValue != 0) {
                                    list = (List) a1VarG8.getValue();
                                } else if (iIntValue != z) {
                                    list = (List) a1VarG10.getValue();
                                } else {
                                    list = (List) a1VarG9.getValue();
                                }
                                iB = b(a1Var3);
                                z7 = z ? 1 : 0;
                                if (iB != 4) {
                                    z = false;
                                }
                                if (b(a1Var3) == 5) {
                                    z8 = z7 ? 1 : 0;
                                } else {
                                    z8 = false;
                                }
                                if (((Boolean) a1VarF.getValue()).booleanValue() || b(a1Var3) != 6) {
                                    z9 = false;
                                } else {
                                    z9 = z7 ? 1 : 0;
                                }
                                androidx.compose.foundation.lazy.grid.a aVar6 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(com.app.mlounge.ui.theme.g.a)).y);
                                z0 z0VarA = androidx.compose.foundation.layout.b.a(f6);
                                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                                androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                                r rVarD = i1.d(oVar);
                                boolean z22 = (((sVar.g(z6) ? 1 : 0) | (sVar.h(b1Var8) ? 1 : 0)) | (sVar.f(a1VarG14) ? 1 : 0) ? 1 : 0) | (sVar.g(z3) ? 1 : 0) | (sVar.f(a1VarG2) ? 1 : 0);
                                if ((i9 & 14) == 4) {
                                    z10 = z7 ? 1 : 0;
                                } else {
                                    z10 = false;
                                }
                                boolean z23 = ((z10 | (z22 ? 1 : 0)) | (sVar.g(z4) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG3) ? 1 : 0);
                                if ((i9 & Token.ASSIGN_MOD) == 32) {
                                    z11 = z7 ? 1 : 0;
                                } else {
                                    z11 = false;
                                }
                                boolean z24 = (z23 | z11 ? 1 : 0) | (sVar.g(z5) ? 1 : 0) | (sVar.f(a1VarG4) ? 1 : 0);
                                if ((i9 & 896) == 256) {
                                    z12 = z7 ? 1 : 0;
                                } else {
                                    z12 = false;
                                }
                                boolean z25 = (z24 ? 1 : 0) | z12 | (sVar.h(list) ? 1 : 0);
                                list2 = list;
                                if ((i9 & 7168) == 2048) {
                                    z13 = z7 ? 1 : 0;
                                } else {
                                    z13 = false;
                                }
                                boolean z26 = ((z13 | (z25 ? 1 : 0)) | (sVar.g(z) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG5) ? 1 : 0);
                                if ((57344 & i9) == 16384) {
                                    z14 = z7 ? 1 : 0;
                                } else {
                                    z14 = false;
                                }
                                boolean z27 = (z26 | z14 ? 1 : 0) | (sVar.g(z9) ? 1 : 0) | (sVar.f(a1VarG7) ? 1 : 0);
                                if ((i9 & 29360128) == 8388608) {
                                    z15 = z7 ? 1 : 0;
                                } else {
                                    z15 = false;
                                }
                                boolean z28 = (((z27 ? 1 : 0) | z15) | (sVar.g(z8) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG6) ? 1 : 0);
                                z16 = z8;
                                if ((i9 & 458752) == 131072) {
                                    z17 = z7 ? 1 : 0;
                                } else {
                                    z17 = false;
                                }
                                boolean z29 = z28 | z17;
                                z18 = z7;
                                if ((3670016 & i9) != 1048576) {
                                    z18 = false;
                                }
                                z19 = (z29 ? 1 : 0) | z18 | (sVar.f(a1VarG12) ? 1 : 0);
                                objQ2 = sVar.Q();
                                if (!z19 || objQ2 == obj8) {
                                    final boolean z30 = z5;
                                    Object obj20 = new l() { // from class: com.app.mlounge.ui.screens.search.e
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj21) {
                                            androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj21;
                                            hVar.getClass();
                                            boolean z31 = z6;
                                            b1 b1Var13 = b1Var8;
                                            a1 a1Var5 = a1VarG14;
                                            if (z31) {
                                                androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(true, -1972710186, new androidx.compose.foundation.contextmenu.i(8, b1Var13, a1Var5)), new com.app.mlounge.ui.t(22));
                                            }
                                            if (z3) {
                                                List list3 = (List) a1VarG2.getValue();
                                                hVar.q(list3.size(), new c0(23, new com.app.mlounge.ui.screens.music.a(7), list3), new com.app.mlounge.ui.components.u0(19, list3), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list3, b1Var13, lVar, 0)));
                                            }
                                            if (z4) {
                                                List list4 = (List) a1VarG3.getValue();
                                                hVar.q(list4.size(), new c0(26, new com.app.mlounge.ui.screens.music.a(8), list4), new com.app.mlounge.ui.components.u0(20, list4), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list4, b1Var13, lVar2, 1)));
                                            }
                                            if (z30) {
                                                List list5 = (List) a1VarG4.getValue();
                                                hVar.q(list5.size(), new c0(27, new com.app.mlounge.ui.screens.music.a(9), list5), new com.app.mlounge.ui.components.u0(14, list5), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list5, lVar3, 4)));
                                            }
                                            if (z31) {
                                                com.app.mlounge.ui.screens.music.a aVar7 = new com.app.mlounge.ui.screens.music.a(10);
                                                List list6 = list2;
                                                hVar.q(list6.size(), new c0(21, aVar7, list6), new com.app.mlounge.ui.components.u0(15, list6), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list6, a1Var5, pVar, 2)));
                                            }
                                            if (z) {
                                                List list7 = (List) a1VarG5.getValue();
                                                hVar.q(list7.size(), new c0(22, new com.app.mlounge.ui.screens.music.a(11), list7), new com.app.mlounge.ui.components.u0(16, list7), new androidx.compose.runtime.internal.f(true, -1942245546, new h(list7, qVar, 0)));
                                            }
                                            if (z9) {
                                                List list8 = (List) a1VarG7.getValue();
                                                hVar.q(list8.size(), new c0(24, new com.app.mlounge.ui.screens.music.a(12), list8), new com.app.mlounge.ui.components.u0(17, list8), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list8, lVar6, 5)));
                                            }
                                            if (z16) {
                                                List list9 = (List) a1VarG6.getValue();
                                                hVar.q(list9.size(), new c0(25, new com.app.mlounge.ui.screens.music.a(13), list9), new com.app.mlounge.ui.components.u0(18, list9), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list9, lVar4, lVar5, 3)));
                                            }
                                            if (((Boolean) a1VarG12.getValue()).booleanValue()) {
                                                androidx.compose.foundation.lazy.grid.h.p(7, hVar, a.d, null);
                                            }
                                            return y.a;
                                        }
                                    };
                                    b1Var9 = b1Var8;
                                    sVar.l0(obj20);
                                    objQ2 = obj20;
                                } else {
                                    b1Var9 = b1Var8;
                                }
                                androidx.work.impl.v.b(aVar6, rVarD, xVarA, z0VarA, fVarG2, fVarG, null, false, null, (l) objQ2, sVar, 1772592, 912);
                                sVar.s();
                                sVar.r();
                                b1Var2 = b1Var9;
                                break;
                            }
                            sVar.b0(-240353283);
                            com.app.mlounge.ui.components.b0.n(null, sVar, 0);
                            sVar.w(i7);
                            s1VarT = sVar.t();
                            if (s1VarT != null) {
                                s1VarT.e(new d(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, b1Var7, i, 1));
                                return;
                            }
                            return;
                        }
                        sVar.b0(-240591394);
                        e0 e0Var2 = i1.c;
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, z2);
                        int iHashCode5 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL5 = sVar.l();
                        r rVarC5 = androidx.compose.ui.a.c(sVar, e0Var2);
                        androidx.compose.ui.node.h.b.getClass();
                        aVar = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(aVar);
                        } else {
                            sVar.o0();
                        }
                        t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                        t.x(sVar, jVarL5, androidx.compose.ui.node.g.e);
                        t.p(sVar, Integer.valueOf(iHashCode5), androidx.compose.ui.node.g.g);
                        t.t(sVar, androidx.compose.ui.node.g.h);
                        t.x(sVar, rVarC5, androidx.compose.ui.node.g.e());
                        z5.b("Type at least 2 characters to search", null, com.app.mlounge.ui.theme.b.c(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 390, 0, 262138);
                        sVar.r();
                        sVar.w(i7);
                        s1VarT2 = sVar.t();
                        if (s1VarT2 != null) {
                            s1VarT2.e(new d(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, b1Var7, i, 0));
                            return;
                        }
                        return;
                    }
                    next = it.next();
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        kotlin.collections.q.o();
                        throw null;
                    }
                    String str4 = (String) next;
                    objQ4 = sVar.Q();
                    obj11 = obj5;
                    if (objQ4 == obj11) {
                        objI3 = objQ4;
                        objI3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    objI3 = objQ4;
                    k kVar5 = (k) objI3;
                    a1VarB2 = _COROUTINE.a.B(kVar5, sVar, 6);
                    r rVarA2 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                    float f13 = 2;
                    if (((Boolean) a1VarB2.getValue()).booleanValue()) {
                        j2 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j2 = androidx.compose.ui.graphics.t.h;
                    }
                    r rVarG3 = androidx.compose.foundation.s.g(rVarA2, f13, j2, androidx.compose.foundation.shape.e.a(f2));
                    b1Var11 = b1Var4;
                    zH2 = sVar.h(b1Var11) | sVar.d(i4);
                    Object objQ16 = sVar.Q();
                    if (!zH2 || objQ16 == obj11) {
                        i6 = 1;
                        Object cVar = new c(b1Var11, i4, 1);
                        sVar.l0(cVar);
                        obj12 = cVar;
                    } else {
                        i6 = 1;
                        obj12 = objQ16;
                    }
                    r rVarN2 = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG3, kVar5, null, false, null, (kotlin.jvm.functions.a) obj12, 28), kVar5, i6);
                    if (b(a1VarG13) == i4) {
                        jB2 = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f);
                    } else {
                        jB2 = com.app.mlounge.ui.theme.b.c;
                    }
                    p5.a(rVarN2, androidx.compose.foundation.shape.e.a(f2), jB2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1906919490, new b(i4, str4, a1VarG13, 0), sVar), sVar, 12582912, 120);
                    b1Var4 = b1Var11;
                    i4 = i5;
                    f2 = f2;
                    iVar = iVar;
                    f = f;
                    obj5 = obj11;
                }
            } else {
                obj2 = obj13;
            }
            obj2 = obj13;
            a1Var = a1Var4;
            Object gVar = new g(l2Var, lVar7, a1Var, 0);
            sVar.l0(gVar);
            obj3 = gVar;
            r rVarE2 = androidx.compose.ui.input.key.c.e(rVarR, (l) obj3);
            objQ = sVar.Q();
            obj4 = objQ;
            if (objQ == obj2) {
                Object m2Var2 = new m2(a1Var, 12);
                sVar.l0(m2Var2);
                obj4 = m2Var2;
            }
            obj5 = obj2;
            b1Var4 = b1Var12;
            h4.a(str, (l) eVar5, androidx.compose.ui.focus.d.t(rVarE2, (l) obj4), false, z20, null, a, null, b, androidx.compose.runtime.internal.k.c(2011483632, new androidx.compose.foundation.contextmenu.f(24, b1Var12, a1VarG), sVar), null, q0Var, p0Var, true, 0, 0, kVar, null, u5VarC, sVar, 907542528, 12779520, 6, 2915496);
            listK = kotlin.collections.q.k("Movies", "TV Shows", "Anime", "Games", "Live TV", "Music");
            listN = listK;
            if (((Boolean) a1VarF.getValue()).booleanValue()) {
                listN = kotlin.collections.p.N(listK, "Adult");
            }
            f = 12;
            f2 = 8;
            r rVarR5 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), f, f2);
            iVar = iVar4;
            f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.g(f2), iVar, sVar, 54);
            int iHashCode6 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL6 = sVar.l();
            r rVarC6 = androidx.compose.ui.a.c(sVar, rVarR5);
            sVar.e0();
            if (sVar.S) {
                sVar.k(aVar3);
            } else {
                sVar.o0();
            }
            t.x(sVar, f1VarA4, eVar);
            t.x(sVar, jVarL6, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, sVar, eVar3, sVar, dVar2);
            t.x(sVar, rVarC6, eVar4);
            sVar.b0(1881746978);
            it = listN.iterator();
            i4 = 0;
            while (true) {
                int i11 = 6;
                if (it.hasNext()) {
                    a1Var2 = a1VarG13;
                    f3 = f;
                    f4 = f2;
                    iVar2 = iVar;
                    b1Var5 = b1Var4;
                    obj6 = obj5;
                    sVar.p(false);
                    boolean z210 = true;
                    sVar.p(true);
                    if (((Boolean) a1VarF.getValue()).booleanValue()) {
                        b1Var6 = b1Var5;
                        a1Var3 = a1Var2;
                        f5 = f8;
                        iVar3 = iVar2;
                        f6 = f3;
                        obj7 = obj6;
                        z = true;
                        sVar.b0(-242489989);
                        sVar.p(false);
                    } else {
                        b1Var6 = b1Var5;
                        a1Var3 = a1Var2;
                        f5 = f8;
                        iVar3 = iVar2;
                        f6 = f3;
                        obj7 = obj6;
                        z = true;
                        sVar.b0(-242489989);
                        sVar.p(false);
                    }
                    c2 = 5;
                    if (b(a1Var3) == 5) {
                        sVar.b0(-242368438);
                        List<String> listK4 = kotlin.collections.q.k("MusicMp3", "YouTube Music");
                        r rVarR6 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar), false), f6, f5);
                        f1 f1VarA5 = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar3, sVar, 54);
                        int iHashCode7 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL7 = sVar.l();
                        r rVarC7 = androidx.compose.ui.a.c(sVar, rVarR6);
                        androidx.compose.ui.node.h.b.getClass();
                        aVar2 = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(aVar2);
                        } else {
                            sVar.o0();
                        }
                        t.x(sVar, f1VarA5, androidx.compose.ui.node.g.f);
                        t.x(sVar, jVarL7, androidx.compose.ui.node.g.e);
                        t.p(sVar, Integer.valueOf(iHashCode7), androidx.compose.ui.node.g.g);
                        t.t(sVar, androidx.compose.ui.node.g.h);
                        t.x(sVar, rVarC7, androidx.compose.ui.node.g.d);
                        sVar.b0(-1900970340);
                        while (r15.hasNext()) {
                            objQ3 = sVar.Q();
                            obj9 = obj7;
                            if (objQ3 == obj9) {
                                objI = objQ3;
                                objI = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                            }
                            objI = objQ3;
                            k kVar6 = (k) objI;
                            a1VarB = _COROUTINE.a.B(kVar6, sVar, 6);
                            r rVarA3 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f4));
                            float f14 = 2;
                            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                                j = com.app.mlounge.ui.theme.b.q;
                            } else {
                                j = androidx.compose.ui.graphics.t.h;
                            }
                            r rVarG4 = androidx.compose.foundation.s.g(rVarA3, f14, j, androidx.compose.foundation.shape.e.a(f4));
                            b1Var10 = b1Var6;
                            zH = sVar.h(b1Var10) | sVar.f(str3);
                            Object objQ17 = sVar.Q();
                            obj10 = objQ17;
                            if (zH) {
                                Object bVar3 = new com.app.mlounge.ui.screens.adult.b(14, b1Var10, str3);
                                sVar.l0(bVar3);
                                obj10 = bVar3;
                            } else {
                                Object bVar4 = new com.app.mlounge.ui.screens.adult.b(14, b1Var10, str3);
                                sVar.l0(bVar4);
                                obj10 = bVar4;
                            }
                            r rVarN3 = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG4, kVar6, null, false, null, (kotlin.jvm.functions.a) obj10, 28), kVar6, z ? 1 : 0);
                            if (kotlin.jvm.internal.l.a((String) a1VarG15.getValue(), str3)) {
                                c3 = 52429;
                                jB = androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f);
                            } else {
                                c3 = 52429;
                                jB = com.app.mlounge.ui.theme.b.d;
                            }
                            b1Var6 = b1Var10;
                            p5.a(rVarN3, androidx.compose.foundation.shape.e.a(f4), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(490656028, new com.app.mlounge.ui.screens.player.i(str3, a1VarG15, z ? 1 : 0), sVar), sVar, 12582912, 120);
                            obj7 = obj9;
                            c2 = 5;
                        }
                        b1Var7 = b1Var6;
                        obj8 = obj7;
                        z2 = false;
                        b0.g(sVar, false, z, false);
                    } else {
                        b1Var7 = b1Var6;
                        obj8 = obj7;
                        z2 = false;
                        sVar.b0(-240629989);
                        sVar.p(false);
                    }
                    if (((String) a1VarG.getValue()).length() < 2) {
                        sVar.b0(-240379013);
                        sVar.s();
                        if (((Boolean) a1VarG11.getValue()).booleanValue()) {
                            b1Var8 = b1Var7;
                            sVar.b0(-240324453);
                            sVar.s();
                            if (b(a1Var3) == 0) {
                                z3 = z ? 1 : 0;
                            } else {
                                z3 = false;
                            }
                            if (b(a1Var3) == z) {
                            }
                            if (b(a1Var3) == 2) {
                                z5 = z ? 1 : 0;
                            } else {
                                z5 = false;
                            }
                            if (b(a1Var3) == 3) {
                                z6 = z ? 1 : 0;
                            } else {
                                z6 = false;
                            }
                            iIntValue = ((Number) a1VarG14.getValue()).intValue();
                            if (iIntValue != 0) {
                                list = (List) a1VarG8.getValue();
                            } else if (iIntValue != z) {
                                list = (List) a1VarG10.getValue();
                            } else {
                                list = (List) a1VarG9.getValue();
                            }
                            iB = b(a1Var3);
                            z7 = z ? 1 : 0;
                            if (iB != 4) {
                                z = false;
                            }
                            if (b(a1Var3) == 5) {
                                z8 = z7 ? 1 : 0;
                            } else {
                                z8 = false;
                            }
                            if (((Boolean) a1VarF.getValue()).booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            androidx.compose.foundation.lazy.grid.a aVar7 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(com.app.mlounge.ui.theme.g.a)).y);
                            z0 z0VarA2 = androidx.compose.foundation.layout.b.a(f6);
                            androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f4);
                            androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f4);
                            r rVarD2 = i1.d(oVar);
                            boolean z211 = (((sVar.g(z6) ? 1 : 0) | (sVar.h(b1Var8) ? 1 : 0)) | (sVar.f(a1VarG14) ? 1 : 0) ? 1 : 0) | (sVar.g(z3) ? 1 : 0) | (sVar.f(a1VarG2) ? 1 : 0);
                            if ((i9 & 14) == 4) {
                                z10 = z7 ? 1 : 0;
                            } else {
                                z10 = false;
                            }
                            boolean z212 = ((z10 | (z211 ? 1 : 0)) | (sVar.g(z4) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG3) ? 1 : 0);
                            if ((i9 & Token.ASSIGN_MOD) == 32) {
                                z11 = z7 ? 1 : 0;
                            } else {
                                z11 = false;
                            }
                            boolean z213 = (z212 | z11 ? 1 : 0) | (sVar.g(z5) ? 1 : 0) | (sVar.f(a1VarG4) ? 1 : 0);
                            if ((i9 & 896) == 256) {
                                z12 = z7 ? 1 : 0;
                            } else {
                                z12 = false;
                            }
                            boolean z214 = (z213 ? 1 : 0) | z12 | (sVar.h(list) ? 1 : 0);
                            list2 = list;
                            if ((i9 & 7168) == 2048) {
                                z13 = z7 ? 1 : 0;
                            } else {
                                z13 = false;
                            }
                            boolean z215 = ((z13 | (z214 ? 1 : 0)) | (sVar.g(z) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG5) ? 1 : 0);
                            if ((57344 & i9) == 16384) {
                                z14 = z7 ? 1 : 0;
                            } else {
                                z14 = false;
                            }
                            boolean z216 = (z215 | z14 ? 1 : 0) | (sVar.g(z9) ? 1 : 0) | (sVar.f(a1VarG7) ? 1 : 0);
                            if ((i9 & 29360128) == 8388608) {
                                z15 = z7 ? 1 : 0;
                            } else {
                                z15 = false;
                            }
                            boolean z217 = (((z216 ? 1 : 0) | z15) | (sVar.g(z8) ? 1 : 0) ? 1 : 0) | (sVar.f(a1VarG6) ? 1 : 0);
                            z16 = z8;
                            if ((i9 & 458752) == 131072) {
                                z17 = z7 ? 1 : 0;
                            } else {
                                z17 = false;
                            }
                            boolean z218 = z217 | z17;
                            z18 = z7;
                            if ((3670016 & i9) != 1048576) {
                                z18 = false;
                            }
                            z19 = (z218 ? 1 : 0) | z18 | (sVar.f(a1VarG12) ? 1 : 0);
                            objQ2 = sVar.Q();
                            if (z19) {
                                final boolean z31 = z5;
                                Object obj21 = new l() { // from class: com.app.mlounge.ui.screens.search.e
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj22) {
                                        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj22;
                                        hVar.getClass();
                                        boolean z32 = z6;
                                        b1 b1Var13 = b1Var8;
                                        a1 a1Var5 = a1VarG14;
                                        if (z32) {
                                            androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(true, -1972710186, new androidx.compose.foundation.contextmenu.i(8, b1Var13, a1Var5)), new com.app.mlounge.ui.t(22));
                                        }
                                        if (z3) {
                                            List list3 = (List) a1VarG2.getValue();
                                            hVar.q(list3.size(), new c0(23, new com.app.mlounge.ui.screens.music.a(7), list3), new com.app.mlounge.ui.components.u0(19, list3), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list3, b1Var13, lVar, 0)));
                                        }
                                        if (z4) {
                                            List list4 = (List) a1VarG3.getValue();
                                            hVar.q(list4.size(), new c0(26, new com.app.mlounge.ui.screens.music.a(8), list4), new com.app.mlounge.ui.components.u0(20, list4), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list4, b1Var13, lVar2, 1)));
                                        }
                                        if (z31) {
                                            List list5 = (List) a1VarG4.getValue();
                                            hVar.q(list5.size(), new c0(27, new com.app.mlounge.ui.screens.music.a(9), list5), new com.app.mlounge.ui.components.u0(14, list5), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list5, lVar3, 4)));
                                        }
                                        if (z32) {
                                            com.app.mlounge.ui.screens.music.a aVar8 = new com.app.mlounge.ui.screens.music.a(10);
                                            List list6 = list2;
                                            hVar.q(list6.size(), new c0(21, aVar8, list6), new com.app.mlounge.ui.components.u0(15, list6), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list6, a1Var5, pVar, 2)));
                                        }
                                        if (z) {
                                            List list7 = (List) a1VarG5.getValue();
                                            hVar.q(list7.size(), new c0(22, new com.app.mlounge.ui.screens.music.a(11), list7), new com.app.mlounge.ui.components.u0(16, list7), new androidx.compose.runtime.internal.f(true, -1942245546, new h(list7, qVar, 0)));
                                        }
                                        if (z9) {
                                            List list8 = (List) a1VarG7.getValue();
                                            hVar.q(list8.size(), new c0(24, new com.app.mlounge.ui.screens.music.a(12), list8), new com.app.mlounge.ui.components.u0(17, list8), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list8, lVar6, 5)));
                                        }
                                        if (z16) {
                                            List list9 = (List) a1VarG6.getValue();
                                            hVar.q(list9.size(), new c0(25, new com.app.mlounge.ui.screens.music.a(13), list9), new com.app.mlounge.ui.components.u0(18, list9), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list9, lVar4, lVar5, 3)));
                                        }
                                        if (((Boolean) a1VarG12.getValue()).booleanValue()) {
                                            androidx.compose.foundation.lazy.grid.h.p(7, hVar, a.d, null);
                                        }
                                        return y.a;
                                    }
                                };
                                b1Var9 = b1Var8;
                                sVar.l0(obj21);
                                objQ2 = obj21;
                            } else {
                                final boolean z32 = z5;
                                Object obj22 = new l() { // from class: com.app.mlounge.ui.screens.search.e
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj23) {
                                        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj23;
                                        hVar.getClass();
                                        boolean z33 = z6;
                                        b1 b1Var13 = b1Var8;
                                        a1 a1Var5 = a1VarG14;
                                        if (z33) {
                                            androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(true, -1972710186, new androidx.compose.foundation.contextmenu.i(8, b1Var13, a1Var5)), new com.app.mlounge.ui.t(22));
                                        }
                                        if (z3) {
                                            List list3 = (List) a1VarG2.getValue();
                                            hVar.q(list3.size(), new c0(23, new com.app.mlounge.ui.screens.music.a(7), list3), new com.app.mlounge.ui.components.u0(19, list3), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list3, b1Var13, lVar, 0)));
                                        }
                                        if (z4) {
                                            List list4 = (List) a1VarG3.getValue();
                                            hVar.q(list4.size(), new c0(26, new com.app.mlounge.ui.screens.music.a(8), list4), new com.app.mlounge.ui.components.u0(20, list4), new androidx.compose.runtime.internal.f(true, -1942245546, new i(list4, b1Var13, lVar2, 1)));
                                        }
                                        if (z32) {
                                            List list5 = (List) a1VarG4.getValue();
                                            hVar.q(list5.size(), new c0(27, new com.app.mlounge.ui.screens.music.a(9), list5), new com.app.mlounge.ui.components.u0(14, list5), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list5, lVar3, 4)));
                                        }
                                        if (z33) {
                                            com.app.mlounge.ui.screens.music.a aVar8 = new com.app.mlounge.ui.screens.music.a(10);
                                            List list6 = list2;
                                            hVar.q(list6.size(), new c0(21, aVar8, list6), new com.app.mlounge.ui.components.u0(15, list6), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list6, a1Var5, pVar, 2)));
                                        }
                                        if (z) {
                                            List list7 = (List) a1VarG5.getValue();
                                            hVar.q(list7.size(), new c0(22, new com.app.mlounge.ui.screens.music.a(11), list7), new com.app.mlounge.ui.components.u0(16, list7), new androidx.compose.runtime.internal.f(true, -1942245546, new h(list7, qVar, 0)));
                                        }
                                        if (z9) {
                                            List list8 = (List) a1VarG7.getValue();
                                            hVar.q(list8.size(), new c0(24, new com.app.mlounge.ui.screens.music.a(12), list8), new com.app.mlounge.ui.components.u0(17, list8), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list8, lVar6, 5)));
                                        }
                                        if (z16) {
                                            List list9 = (List) a1VarG6.getValue();
                                            hVar.q(list9.size(), new c0(25, new com.app.mlounge.ui.screens.music.a(13), list9), new com.app.mlounge.ui.components.u0(18, list9), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(list9, lVar4, lVar5, 3)));
                                        }
                                        if (((Boolean) a1VarG12.getValue()).booleanValue()) {
                                            androidx.compose.foundation.lazy.grid.h.p(7, hVar, a.d, null);
                                        }
                                        return y.a;
                                    }
                                };
                                b1Var9 = b1Var8;
                                sVar.l0(obj22);
                                objQ2 = obj22;
                            }
                            androidx.work.impl.v.b(aVar7, rVarD2, xVarA, z0VarA2, fVarG4, fVarG3, null, false, null, (l) objQ2, sVar, 1772592, 912);
                            sVar.s();
                            sVar.r();
                            b1Var2 = b1Var9;
                            break;
                        }
                        sVar.b0(-240353283);
                        com.app.mlounge.ui.components.b0.n(null, sVar, 0);
                        sVar.w(i7);
                        s1VarT = sVar.t();
                        if (s1VarT != null) {
                            s1VarT.e(new d(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, b1Var7, i, 1));
                            return;
                        }
                        return;
                    }
                    sVar.b0(-240591394);
                    e0 e0Var3 = i1.c;
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, z2);
                    int iHashCode8 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL8 = sVar.l();
                    r rVarC8 = androidx.compose.ui.a.c(sVar, e0Var3);
                    androidx.compose.ui.node.h.b.getClass();
                    aVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(aVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, q0VarD2, androidx.compose.ui.node.g.f);
                    t.x(sVar, jVarL8, androidx.compose.ui.node.g.e);
                    t.p(sVar, Integer.valueOf(iHashCode8), androidx.compose.ui.node.g.g);
                    t.t(sVar, androidx.compose.ui.node.g.h);
                    t.x(sVar, rVarC8, androidx.compose.ui.node.g.e());
                    z5.b("Type at least 2 characters to search", null, com.app.mlounge.ui.theme.b.c(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 390, 0, 262138);
                    sVar.r();
                    sVar.w(i7);
                    s1VarT2 = sVar.t();
                    if (s1VarT2 != null) {
                        s1VarT2.e(new d(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, b1Var7, i, 0));
                        return;
                    }
                    return;
                }
                next = it.next();
                i5 = i4 + 1;
                if (i4 >= 0) {
                    kotlin.collections.q.o();
                    throw null;
                }
                String str5 = (String) next;
                objQ4 = sVar.Q();
                obj11 = obj5;
                if (objQ4 == obj11) {
                    objI3 = objQ4;
                    objI3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                objI3 = objQ4;
                k kVar7 = (k) objI3;
                a1VarB2 = _COROUTINE.a.B(kVar7, sVar, 6);
                r rVarA4 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                float f15 = 2;
                if (((Boolean) a1VarB2.getValue()).booleanValue()) {
                    j2 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j2 = androidx.compose.ui.graphics.t.h;
                }
                r rVarG5 = androidx.compose.foundation.s.g(rVarA4, f15, j2, androidx.compose.foundation.shape.e.a(f2));
                b1Var11 = b1Var4;
                zH2 = sVar.h(b1Var11) | sVar.d(i4);
                Object objQ18 = sVar.Q();
                if (zH2) {
                    i6 = 1;
                    Object cVar2 = new c(b1Var11, i4, 1);
                    sVar.l0(cVar2);
                    obj12 = cVar2;
                } else {
                    i6 = 1;
                    Object cVar3 = new c(b1Var11, i4, 1);
                    sVar.l0(cVar3);
                    obj12 = cVar3;
                }
                r rVarN4 = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG5, kVar7, null, false, null, (kotlin.jvm.functions.a) obj12, 28), kVar7, i6);
                if (b(a1VarG13) == i4) {
                    jB2 = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f);
                } else {
                    jB2 = com.app.mlounge.ui.theme.b.c;
                }
                p5.a(rVarN4, androidx.compose.foundation.shape.e.a(f2), jB2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1906919490, new b(i4, str5, a1VarG13, 0), sVar), sVar, 12582912, 120);
                b1Var4 = b1Var11;
                i4 = i5;
                f2 = f2;
                iVar = iVar;
                f = f;
                obj5 = obj11;
            }
        } else {
            sVar.W();
            b1Var2 = b1Var;
        }
        s1 s1VarT3 = sVar.t();
        if (s1VarT3 != null) {
            s1VarT3.e(new d(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, b1Var2, i, 2));
        }
    }

    public static final int b(a1 a1Var) {
        return ((Number) a1Var.getValue()).intValue();
    }
}
