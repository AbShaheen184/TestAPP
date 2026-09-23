package androidx.compose.foundation.contextmenu;

import androidx.compose.animation.core.c1;
import androidx.compose.animation.core.i0;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.text.r0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.s2;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.r;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.l0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.screens.settings.u;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(p pVar, g gVar, q qVar, kotlin.jvm.functions.a aVar) {
        this.e = 0;
        this.y = pVar;
        this.z = gVar;
        this.A = qVar;
        this.B = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object objE;
        float f;
        Object next;
        String str;
        int i = this.e;
        int i2 = 9;
        y yVar = y.a;
        androidx.compose.runtime.f fVar = n.a;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        switch (i) {
            case 0:
                p pVar = (p) obj7;
                g gVar = (g) obj6;
                q qVar = (q) obj5;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
                d dVar = (d) obj;
                s sVar = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= sVar.f(dVar) ? 4 : 2;
                }
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str2 = (String) pVar.invoke(sVar, 0);
                    if (kotlin.text.k.J(str2)) {
                        androidx.compose.foundation.internal.b.c("Label must not be blank");
                    }
                    gVar.getClass();
                    c.a.a(str2, Boolean.TRUE, dVar, qVar, aVar, sVar, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                p0 p0Var = (p0) obj7;
                r0 r0Var = (r0) obj6;
                x xVar = (x) obj5;
                long j = xVar.b;
                androidx.compose.ui.text.input.q qVar2 = (androidx.compose.ui.text.input.q) obj4;
                r rVar = (r) obj;
                s sVar2 = (s) obj2;
                ((Integer) obj3).getClass();
                sVar2.b0(-84507373);
                boolean zBooleanValue = ((Boolean) sVar2.j(l1.w)).booleanValue();
                boolean zG = sVar2.g(zBooleanValue);
                Object objQ = sVar2.Q();
                if (zG || objQ == fVar) {
                    objQ = new androidx.compose.foundation.text.input.internal.l(zBooleanValue);
                    sVar2.l0(objQ);
                }
                androidx.compose.foundation.text.input.internal.l lVar = (androidx.compose.foundation.text.input.internal.l) objQ;
                boolean z2 = p0Var.a != 16;
                if (((Boolean) ((y1) ((s2) sVar2.j(l1.t))).a.getValue()).booleanValue() && r0Var.b() && l0.c(j) && z2) {
                    sVar2.b0(-707487962);
                    androidx.compose.ui.text.g gVar2 = xVar.a;
                    l0 l0Var = new l0(j);
                    boolean zH = sVar2.h(lVar);
                    Object objQ2 = sVar2.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new c1(lVar, null, i2);
                        sVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.l0.d(gVar2, l0Var, (p) objQ2, sVar2);
                    boolean zH2 = sVar2.h(lVar) | sVar2.h(qVar2) | sVar2.f(xVar) | sVar2.h(r0Var) | sVar2.f(p0Var);
                    Object objQ3 = sVar2.Q();
                    if (zH2 || objQ3 == fVar) {
                        androidx.activity.compose.c cVar = new androidx.activity.compose.c(lVar, qVar2, xVar, r0Var, p0Var, 2);
                        sVar2.l0(cVar);
                        objQ3 = cVar;
                    }
                    objE = androidx.compose.ui.draw.h.e(rVar, (kotlin.jvm.functions.l) objQ3);
                    z = false;
                    sVar2.p(false);
                } else {
                    z = false;
                    sVar2.b0(-705473241);
                    sVar2.p(false);
                    objE = o.b;
                }
                sVar2.p(z);
                return objE;
            case 2:
                ArrayList<kotlin.k> arrayList = (ArrayList) obj7;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj6;
                a1 a1Var = (a1) obj4;
                s sVar3 = (s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (kotlin.k kVar : arrayList) {
                        Object obj8 = kVar.e;
                        androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1096007537, new b2(6, (String) kVar.y, obj8, obj5), sVar3);
                        boolean zF = sVar3.f(lVar2) | sVar3.h(obj8);
                        Object objQ4 = sVar3.Q();
                        if (zF || objQ4 == fVar) {
                            objQ4 = new androidx.compose.foundation.gestures.g(12, lVar2, obj8, a1Var);
                            sVar3.l0(objQ4);
                        }
                        androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ4, null, false, null, null, sVar3, 6);
                    }
                } else {
                    sVar3.W();
                }
                return yVar;
            case 3:
                List list = (List) obj7;
                String str3 = (String) obj6;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj5;
                a1 a1Var2 = (a1) obj4;
                s sVar4 = (s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zH3 = sVar4.h(list) | sVar4.f(str3) | sVar4.f(lVar3);
                    Object objQ5 = sVar4.Q();
                    if (zH3 || objQ5 == fVar) {
                        i0 i0Var = new i0((Object) list, (Object) str3, (kotlin.d) lVar3, a1Var2, 6);
                        sVar4.l0(i0Var);
                        objQ5 = i0Var;
                    }
                    android.support.v4.media.session.b.c(null, null, null, null, null, null, false, null, (kotlin.jvm.functions.l) objQ5, sVar4, 0, 511);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 4:
                ArrayList<kotlin.k> arrayList2 = (ArrayList) obj7;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) obj6;
                String str4 = (String) obj5;
                a1 a1Var3 = (a1) obj4;
                s sVar5 = (s) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    for (kotlin.k kVar2 : arrayList2) {
                        String str5 = (String) kVar2.e;
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(1666631618, new b2(8, (String) kVar2.y, str5, str4), sVar5);
                        boolean zF2 = sVar5.f(lVar4) | sVar5.f(str5);
                        Object objQ6 = sVar5.Q();
                        if (zF2 || objQ6 == fVar) {
                            objQ6 = new androidx.compose.foundation.gestures.g(15, lVar4, str5, a1Var3);
                            sVar5.l0(objQ6);
                        }
                        androidx.compose.material3.p.b(fVarC2, (kotlin.jvm.functions.a) objQ6, null, false, null, null, sVar5, 6);
                    }
                } else {
                    sVar5.W();
                }
                return yVar;
            default:
                p1 p1Var = (p1) obj7;
                String str6 = (String) obj6;
                w2 w2Var = (w2) obj5;
                a1 a1Var4 = (a1) obj4;
                s sVar6 = (s) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                List list2 = e0.b;
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String str7 = (String) w2Var.getValue();
                    if (str7 == null) {
                        str7 = "Built-in Player";
                    }
                    String str8 = str7;
                    androidx.compose.ui.graphics.vector.f fVarN = okhttp3.internal.platform.android.g.n();
                    Object objQ7 = sVar6.Q();
                    if (objQ7 == fVar) {
                        objQ7 = new com.app.mlounge.ui.screens.settings.q(a1Var4, 14);
                        sVar6.l0(objQ7);
                    }
                    e0.o("External Player", str8, fVarN, null, (kotlin.jvm.functions.a) objQ7, sVar6, 24582, 8);
                    boolean zBooleanValue2 = ((Boolean) t.f(p1Var.h, Boolean.TRUE, null, sVar6, 48, 2).getValue()).booleanValue();
                    boolean zH4 = sVar6.h(p1Var);
                    Object objQ8 = sVar6.Q();
                    int i3 = 10;
                    if (zH4 || objQ8 == fVar) {
                        objQ8 = new u(p1Var, i3);
                        sVar6.l0(objQ8);
                    }
                    kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ8;
                    androidx.compose.ui.graphics.vector.f fVarB = com.imsdk.a.f;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SkipNext", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = h0.a;
                        p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar3.v(6.0f, 18.0f);
                        gVar3.u(8.5f, -6.0f);
                        gVar3.t(6.0f, 6.0f);
                        gVar3.A(12.0f);
                        gVar3.l();
                        gVar3.v(16.0f, 6.0f);
                        gVar3.A(12.0f);
                        gVar3.s(2.0f);
                        gVar3.z(6.0f);
                        gVar3.s(-2.0f);
                        gVar3.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar3.b, 0, p0Var2);
                        fVarB = eVar.b();
                        com.imsdk.a.f = fVarB;
                    }
                    e0.r("Auto Play Next Episode", "Automatically find and play the next episode of a TV show", zBooleanValue2, lVar5, fVarB, false, sVar6, 54, 32);
                    a1 a1VarF = t.f(p1Var.i, Boolean.FALSE, null, sVar6, 48, 2);
                    String str9 = ((Boolean) a1VarF.getValue()).booleanValue() ? "Instantly play movies or episodes from the details screen.\nTo make this much faster, disable unused providers in Settings > Sources." : "Instantly play movies or episodes from the details screen";
                    boolean zBooleanValue3 = ((Boolean) a1VarF.getValue()).booleanValue();
                    boolean zH5 = sVar6.h(p1Var);
                    Object objQ9 = sVar6.Q();
                    if (zH5 || objQ9 == fVar) {
                        objQ9 = new u(p1Var, 11);
                        sVar6.l0(objQ9);
                    }
                    e0.r("One Click Play", str9, zBooleanValue3, (kotlin.jvm.functions.l) objQ9, coil3.svg.internal.a.y(), false, sVar6, 6, 32);
                    androidx.compose.ui.graphics.vector.f fVarB2 = androidx.room.t.c;
                    if (fVarB2 != null) {
                        f = 9.56f;
                    } else {
                        androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.Forward30", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = h0.a;
                        long j2 = androidx.compose.ui.graphics.t.b;
                        p0 p0Var3 = new p0(j2);
                        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(18.0f, 13.0f);
                        gVarJ.n(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
                        gVarJ.x(-6.0f, -2.69f, -6.0f, -6.0f);
                        gVarJ.x(2.69f, -6.0f, 6.0f, -6.0f);
                        gVarJ.A(4.0f);
                        gVarJ.u(5.0f, -5.0f);
                        gVarJ.u(-5.0f, -5.0f);
                        gVarJ.A(4.0f);
                        gVarJ.n(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
                        gVarJ.n(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        gVarJ.x(8.0f, -3.58f, 8.0f, -8.0f);
                        gVarJ.r(18.0f);
                        gVarJ.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVarJ.b, 0, p0Var3);
                        p0 p0Var4 = new p0(j2);
                        androidx.compose.ui.graphics.vector.g gVarJ2 = androidx.privacysandbox.ads.adservices.java.internal.a.j(10.06f, 15.38f);
                        gVarJ2.n(-0.29f, 0.0f, -0.62f, -0.17f, -0.62f, -0.54f);
                        gVarJ2.r(8.59f);
                        gVarJ2.n(0.0f, 0.97f, 0.9f, 1.23f, 1.45f, 1.23f);
                        gVarJ2.n(0.87f, 0.0f, 1.51f, -0.46f, 1.51f, -1.25f);
                        gVarJ2.n(0.0f, -0.66f, -0.45f, -0.9f, -0.71f, -1.0f);
                        gVarJ2.n(0.11f, -0.05f, 0.65f, -0.32f, 0.65f, -0.92f);
                        gVarJ2.n(0.0f, -0.21f, -0.05f, -1.22f, -1.44f, -1.22f);
                        gVarJ2.n(-0.62f, 0.0f, -1.4f, 0.35f, -1.4f, 1.16f);
                        gVarJ2.s(0.85f);
                        gVarJ2.n(0.0f, -0.34f, 0.31f, -0.48f, 0.57f, -0.48f);
                        gVarJ2.n(0.59f, 0.0f, 0.58f, 0.5f, 0.58f, 0.54f);
                        gVarJ2.n(0.0f, 0.52f, -0.41f, 0.59f, -0.63f, 0.59f);
                        f = 9.56f;
                        gVarJ2.r(9.56f);
                        gVarJ2.A(0.66f);
                        gVarJ2.s(0.45f);
                        gVarJ2.n(0.65f, 0.0f, 0.7f, 0.42f, 0.7f, 0.64f);
                        gVarJ2.m(10.71f, 15.11f, 10.5f, 15.38f, 10.06f, 15.38f);
                        gVarJ2.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVarJ2.b, 0, p0Var4);
                        p0 p0Var5 = new p0(j2);
                        androidx.compose.ui.graphics.vector.g gVarJ3 = androidx.privacysandbox.ads.adservices.java.internal.a.j(13.85f, 11.68f);
                        gVarJ3.n(-0.14f, 0.0f, -1.44f, -0.08f, -1.44f, 1.82f);
                        gVarJ3.A(0.74f);
                        gVarJ3.n(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
                        gVarJ3.n(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
                        gVarJ3.z(13.5f);
                        gVarJ3.m(15.3f, 11.59f, 13.99f, 11.68f, 13.85f, 11.68f);
                        gVarJ3.l();
                        gVarJ3.v(14.45f, 14.35f);
                        gVarJ3.n(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
                        gVarJ3.n(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
                        gVarJ3.A(-0.97f);
                        gVarJ3.n(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
                        gVarJ3.n(0.38f, 0.0f, 0.6f, 0.26f, 0.6f, 1.01f);
                        gVarJ3.z(14.35f);
                        gVarJ3.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVarJ3.b, 0, p0Var5);
                        fVarB2 = eVar2.b();
                        androidx.room.t.c = fVarB2;
                    }
                    List list3 = e0.a;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add((String) ((kotlin.k) it.next()).y);
                    }
                    boolean zH6 = sVar6.h(p1Var);
                    Object objQ10 = sVar6.Q();
                    if (zH6 || objQ10 == fVar) {
                        objQ10 = new u(p1Var, 12);
                        sVar6.l0(objQ10);
                    }
                    e0.n("Next Episode Button", "How soon before the end it appears in the player", fVarB2, arrayList3, str6, (kotlin.jvm.functions.l) objQ10, sVar6, 54);
                    long jLongValue = ((Number) t.f(p1Var.k, 30000L, null, sVar6, 48, 2).getValue()).longValue();
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long jAbs = Math.abs(((Number) ((kotlin.k) next).e).longValue() - jLongValue);
                            do {
                                Object next2 = it2.next();
                                long jAbs2 = Math.abs(((Number) ((kotlin.k) next2).e).longValue() - jLongValue);
                                if (jAbs > jAbs2) {
                                    next = next2;
                                    jAbs = jAbs2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    kotlin.k kVar3 = (kotlin.k) next;
                    if (kVar3 == null || (str = (String) kVar3.y) == null) {
                        str = "30s";
                    }
                    String str10 = str;
                    androidx.compose.ui.graphics.vector.f fVarB3 = android.support.v4.media.session.b.e;
                    if (fVarB3 == null) {
                        androidx.compose.ui.graphics.vector.e eVar3 = new androidx.compose.ui.graphics.vector.e("Filled.Replay30", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = h0.a;
                        long j3 = androidx.compose.ui.graphics.t.b;
                        p0 p0Var6 = new p0(j3);
                        androidx.compose.ui.graphics.vector.g gVar4 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar4.v(12.0f, 5.0f);
                        gVar4.z(1.0f);
                        gVar4.t(7.0f, 6.0f);
                        gVar4.u(5.0f, 5.0f);
                        gVar4.z(7.0f);
                        gVar4.n(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                        gVar4.x(-2.69f, 6.0f, -6.0f, 6.0f);
                        gVar4.x(-6.0f, -2.69f, -6.0f, -6.0f);
                        gVar4.r(4.0f);
                        gVar4.n(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        gVar4.x(8.0f, -3.58f, 8.0f, -8.0f);
                        gVar4.w(16.42f, 5.0f, 12.0f, 5.0f);
                        gVar4.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar3, gVar4.b, 0, p0Var6);
                        p0 p0Var7 = new p0(j3);
                        androidx.compose.ui.graphics.vector.g gVar5 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar5.v(f, 13.49f);
                        gVar5.s(0.45f);
                        gVar5.n(0.21f, 0.0f, 0.37f, -0.05f, 0.48f, -0.16f);
                        gVar5.x(0.16f, -0.25f, 0.16f, -0.43f);
                        gVar5.n(0.0f, -0.08f, -0.01f, -0.15f, -0.04f, -0.22f);
                        gVar5.x(-0.06f, -0.12f, -0.11f, -0.17f);
                        gVar5.x(-0.11f, -0.09f, -0.18f, -0.11f);
                        gVar5.x(-0.16f, -0.04f, -0.25f, -0.04f);
                        gVar5.n(-0.08f, 0.0f, -0.15f, 0.01f, -0.22f, 0.03f);
                        gVar5.x(-0.13f, 0.05f, -0.18f, 0.1f);
                        gVar5.x(-0.09f, 0.09f, -0.12f, 0.15f);
                        gVar5.x(-0.05f, 0.13f, -0.05f, 0.2f);
                        gVar5.r(8.65f);
                        gVar5.n(0.0f, -0.18f, 0.04f, -0.34f, 0.11f, -0.48f);
                        gVar5.x(0.17f, -0.27f, 0.3f, -0.37f);
                        gVar5.x(0.27f, -0.18f, 0.44f, -0.23f);
                        gVar5.x(0.35f, -0.08f, 0.54f, -0.08f);
                        gVar5.n(0.21f, 0.0f, 0.41f, 0.03f, 0.59f, 0.08f);
                        gVar5.x(0.33f, 0.13f, 0.46f, 0.23f);
                        gVar5.x(0.23f, 0.23f, 0.3f, 0.38f);
                        gVar5.x(0.11f, 0.33f, 0.11f, 0.53f);
                        gVar5.n(0.0f, 0.09f, -0.01f, 0.18f, -0.04f, 0.27f);
                        gVar5.x(-0.07f, 0.17f, -0.13f, 0.25f);
                        gVar5.x(-0.12f, 0.15f, -0.2f, 0.22f);
                        gVar5.x(-0.17f, 0.12f, -0.28f, 0.17f);
                        gVar5.n(0.24f, 0.09f, 0.42f, 0.21f, 0.54f, 0.39f);
                        gVar5.x(0.18f, 0.38f, 0.18f, 0.61f);
                        gVar5.n(0.0f, 0.2f, -0.04f, 0.38f, -0.12f, 0.53f);
                        gVar5.x(-0.18f, 0.29f, -0.32f, 0.39f);
                        gVar5.x(-0.29f, 0.19f, -0.48f, 0.24f);
                        gVar5.x(-0.38f, 0.08f, -0.6f, 0.08f);
                        gVar5.n(-0.18f, 0.0f, -0.36f, -0.02f, -0.53f, -0.07f);
                        gVar5.x(-0.33f, -0.12f, -0.46f, -0.23f);
                        gVar5.x(-0.25f, -0.23f, -0.33f, -0.38f);
                        gVar5.x(-0.12f, -0.34f, -0.12f, -0.55f);
                        gVar5.s(0.85f);
                        gVar5.n(0.0f, 0.08f, 0.02f, 0.15f, 0.05f, 0.22f);
                        gVar5.x(0.07f, 0.12f, 0.13f, 0.17f);
                        gVar5.x(0.12f, 0.09f, 0.2f, 0.11f);
                        gVar5.x(0.16f, 0.04f, 0.25f, 0.04f);
                        gVar5.n(0.1f, 0.0f, 0.19f, -0.01f, 0.27f, -0.04f);
                        gVar5.x(0.15f, -0.07f, 0.2f, -0.12f);
                        gVar5.x(0.1f, -0.11f, 0.13f, -0.18f);
                        gVar5.x(0.04f, -0.15f, 0.04f, -0.24f);
                        gVar5.n(0.0f, -0.11f, -0.02f, -0.21f, -0.05f, -0.29f);
                        gVar5.x(-0.08f, -0.15f, -0.14f, -0.2f);
                        gVar5.x(-0.13f, -0.09f, -0.22f, -0.11f);
                        gVar5.x(-0.18f, -0.04f, -0.29f, -0.04f);
                        gVar5.r(f);
                        gVar5.z(13.49f);
                        gVar5.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar3, gVar5.b, 0, p0Var7);
                        p0 p0Var8 = new p0(j3);
                        androidx.compose.ui.graphics.vector.g gVarJ4 = androidx.privacysandbox.ads.adservices.java.internal.a.j(15.3f, 14.24f);
                        gVarJ4.n(0.0f, 0.32f, -0.03f, 0.6f, -0.1f, 0.82f);
                        gVarJ4.x(-0.17f, 0.42f, -0.29f, 0.57f);
                        gVarJ4.x(-0.28f, 0.26f, -0.45f, 0.33f);
                        gVarJ4.x(-0.37f, 0.1f, -0.59f, 0.1f);
                        gVarJ4.x(-0.41f, -0.03f, -0.59f, -0.1f);
                        gVarJ4.x(-0.33f, -0.18f, -0.46f, -0.33f);
                        gVarJ4.x(-0.23f, -0.34f, -0.3f, -0.57f);
                        gVarJ4.x(-0.11f, -0.5f, -0.11f, -0.82f);
                        gVarJ4.z(13.5f);
                        gVarJ4.n(0.0f, -0.32f, 0.03f, -0.6f, 0.1f, -0.82f);
                        gVarJ4.x(0.17f, -0.42f, 0.29f, -0.57f);
                        gVarJ4.x(0.28f, -0.26f, 0.45f, -0.33f);
                        gVarJ4.x(0.37f, -0.1f, 0.59f, -0.1f);
                        gVarJ4.x(0.41f, 0.03f, 0.59f, 0.1f);
                        gVarJ4.x(0.33f, 0.18f, 0.46f, 0.33f);
                        gVarJ4.x(0.23f, 0.34f, 0.3f, 0.57f);
                        gVarJ4.x(0.11f, 0.5f, 0.11f, 0.82f);
                        gVarJ4.z(14.24f);
                        gVarJ4.l();
                        gVarJ4.v(14.45f, 13.38f);
                        gVarJ4.n(0.0f, -0.19f, -0.01f, -0.35f, -0.04f, -0.48f);
                        gVarJ4.n(-0.03f, -0.13f, -0.07f, -0.23f, -0.12f, -0.31f);
                        gVarJ4.x(-0.11f, -0.14f, -0.19f, -0.17f);
                        gVarJ4.x(-0.16f, -0.05f, -0.25f, -0.05f);
                        gVarJ4.x(-0.18f, 0.02f, -0.25f, 0.05f);
                        gVarJ4.x(-0.14f, 0.09f, -0.19f, 0.17f);
                        gVarJ4.x(-0.09f, 0.18f, -0.12f, 0.31f);
                        gVarJ4.x(-0.04f, 0.29f, -0.04f, 0.48f);
                        gVarJ4.A(0.97f);
                        gVarJ4.n(0.0f, 0.19f, 0.01f, 0.35f, 0.04f, 0.48f);
                        gVarJ4.x(0.07f, 0.24f, 0.12f, 0.32f);
                        gVarJ4.x(0.11f, 0.14f, 0.19f, 0.17f);
                        gVarJ4.x(0.16f, 0.05f, 0.25f, 0.05f);
                        gVarJ4.x(0.18f, -0.02f, 0.25f, -0.05f);
                        gVarJ4.x(0.14f, -0.09f, 0.19f, -0.17f);
                        gVarJ4.x(0.09f, -0.19f, 0.11f, -0.32f);
                        gVarJ4.n(0.03f, -0.13f, 0.04f, -0.29f, 0.04f, -0.48f);
                        gVarJ4.z(13.38f);
                        gVarJ4.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar3, gVarJ4.b, 0, p0Var8);
                        fVarB3 = eVar3.b();
                        android.support.v4.media.session.b.e = fVarB3;
                    }
                    androidx.compose.ui.graphics.vector.f fVar2 = fVarB3;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.r.p(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add((String) ((kotlin.k) it3.next()).y);
                    }
                    boolean zH7 = sVar6.h(p1Var);
                    Object objQ11 = sVar6.Q();
                    if (zH7 || objQ11 == fVar) {
                        objQ11 = new u(p1Var, 13);
                        sVar6.l0(objQ11);
                    }
                    e0.n("Skip Forward / Back", "How far the player jumps on skip", fVar2, arrayList4, str10, (kotlin.jvm.functions.l) objQ11, sVar6, 54);
                } else {
                    sVar6.W();
                }
                return yVar;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
