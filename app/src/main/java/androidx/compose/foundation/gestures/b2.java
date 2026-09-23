package androidx.compose.foundation.gestures;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.v4;
import androidx.compose.material3.z5;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b2(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.d dVar;
        float f;
        androidx.compose.ui.node.f fVar;
        androidx.compose.ui.o oVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.h hVar;
        String str;
        androidx.compose.runtime.s sVar;
        androidx.compose.ui.o oVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.d dVar2;
        androidx.compose.ui.node.e eVar4;
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.node.e eVar5;
        boolean z4;
        com.app.mlounge.ui.screens.settings.f0 f0Var;
        Object fVar2;
        kotlin.jvm.functions.p pVar;
        androidx.compose.ui.h hVar3;
        int i;
        Context context;
        androidx.compose.ui.o oVar3;
        androidx.compose.ui.i iVar;
        int i2;
        int i3;
        androidx.compose.ui.h hVar4;
        PackageManager packageManager;
        androidx.compose.runtime.s sVar2;
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.y;
                r2 r2Var = (r2) this.z;
                q2 q2Var = (q2) this.A;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = r2Var.h(r2Var.d(fFloatValue - wVar.e));
                r2 r2Var2 = q2Var.a;
                wVar.e += r2Var.d(r2Var.g(r2Var2.c(r2Var2.k, jH, 1)));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.n0.e((androidx.compose.ui.r) this.y, (androidx.compose.foundation.text.selection.b1) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
            case 2:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) this.y;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.z;
                androidx.compose.runtime.internal.f fVar3 = (androidx.compose.runtime.internal.f) this.A;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = sVar3.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = new m2(a1Var, 2);
                        sVar3.l0(objQ);
                    }
                    androidx.compose.ui.r rVarL = androidx.compose.ui.layout.a0.l(rVar, (kotlin.jvm.functions.l) objQ);
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL = sVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarL);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar4);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                    fVar3.invoke(sVar3, 0);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
            case 3:
                ((Integer) obj2).getClass();
                com.google.firebase.b.a((androidx.navigation.i) this.y, (androidx.compose.runtime.saveable.d) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                androidx.compose.animation.core.h1 h1Var = (androidx.compose.animation.core.h1) this.z;
                androidx.navigation.i iVar2 = (androidx.navigation.i) this.A;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.c2(fFloatValue2, h1Var, iVar2, (kotlin.coroutines.d) null), 3, null);
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.components.b0.i((String) this.y, (androidx.compose.ui.r) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 6:
                String str2 = (String) this.y;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(str2, null, kotlin.jvm.internal.l.a(this.z, this.A) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 262138);
                } else {
                    sVar4.W();
                }
                return kotlin.y.a;
            case 7:
                String str3 = (String) this.y;
                String str4 = (String) this.z;
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) this.A;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z5.b(str4, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), kotlin.jvm.internal.l.a((String) a1Var2.getValue(), str3) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(n6.a)).n, sVar5, 48, 0, 131064);
                } else {
                    sVar5.W();
                }
                return kotlin.y.a;
            case 8:
                String str5 = (String) this.y;
                String str6 = (String) this.z;
                String str7 = (String) this.A;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z5.b(str5, null, kotlin.jvm.internal.l.a(str6, str7) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 0, 0, 262138);
                } else {
                    sVar6.W();
                }
                return kotlin.y.a;
            case 9:
                com.app.mlounge.data.iptv.n nVar = (com.app.mlounge.data.iptv.n) this.y;
                IptvChannel iptvChannel = (IptvChannel) this.z;
                com.app.mlounge.data.iptv.n nVar2 = (com.app.mlounge.data.iptv.n) this.A;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar5 = androidx.compose.ui.c.J;
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(cVar, hVar5, sVar7, 0);
                    int iHashCode2 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar7.l();
                    androidx.compose.ui.o oVar4 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar7, oVar4);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar5);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar7, wVarA, eVar6);
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar7, jVarL2, eVar7);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar7, numValueOf, eVar8);
                    androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar7, dVar3);
                    androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar7, rVarC2, eVar9);
                    float f2 = 12;
                    float f3 = 8;
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar4, f2, f3);
                    androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar7, 48);
                    int iHashCode3 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar7.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar7, rVarR);
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar5);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.runtime.t.x(sVar7, f1VarA, eVar6);
                    androidx.compose.runtime.t.x(sVar7, jVarL3, eVar7);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar7, eVar8, sVar7, dVar3);
                    androidx.compose.runtime.t.x(sVar7, rVarC3, eVar9);
                    String strB = iptvChannel.b();
                    if (strB == null || kotlin.text.k.J(strB)) {
                        eVar = eVar7;
                        dVar = dVar3;
                        f = f2;
                        fVar = fVar5;
                        oVar = oVar4;
                        sVar7.b0(652794435);
                        eVar2 = eVar8;
                        hVar = hVar5;
                        androidx.compose.material3.q1.b(_COROUTINE.a.O(), iptvChannel.c(), androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.i1.m(oVar, 52), 4), com.app.mlounge.ui.theme.b.m, sVar7, 384, 0);
                        sVar7.p(false);
                    } else {
                        sVar7.b0(653091694);
                        Object objQ2 = sVar7.Q();
                        androidx.compose.runtime.f fVar6 = androidx.compose.runtime.n.a;
                        if (objQ2 == fVar6) {
                            objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                            sVar7.l0(objQ2);
                        }
                        androidx.compose.runtime.a1 a1Var3 = (androidx.compose.runtime.a1) objQ2;
                        if (((Boolean) a1Var3.getValue()).booleanValue()) {
                            sVar7.b0(653211695);
                            eVar = eVar7;
                            f = f2;
                            oVar = oVar4;
                            hVar2 = hVar5;
                            androidx.compose.material3.q1.b(_COROUTINE.a.O(), iptvChannel.c(), androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.i1.m(oVar4, 52), 4), com.app.mlounge.ui.theme.b.m, sVar7, 384, 0);
                            z4 = false;
                            sVar7.p(false);
                            dVar = dVar3;
                            eVar5 = eVar8;
                            fVar = fVar5;
                        } else {
                            hVar2 = hVar5;
                            oVar = oVar4;
                            f = f2;
                            sVar7.b0(653542124);
                            String strB2 = iptvChannel.b();
                            String strC = iptvChannel.c();
                            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.i1.m(oVar, 52), androidx.compose.foundation.shape.e.a(6));
                            Object objQ3 = sVar7.Q();
                            if (objQ3 == fVar6) {
                                objQ3 = new m2(a1Var3, 10);
                                sVar7.l0(objQ3);
                            }
                            eVar = eVar7;
                            dVar = dVar3;
                            eVar5 = eVar8;
                            fVar = fVar5;
                            coil3.compose.k.a(strB2, strC, rVarA, (kotlin.jvm.functions.l) objQ3, androidx.compose.ui.layout.i.b, sVar7, 1597440, 1960);
                            z4 = false;
                            sVar7.p(false);
                        }
                        sVar7.p(z4);
                        eVar2 = eVar5;
                        hVar = hVar2;
                    }
                    androidx.compose.foundation.layout.b.e(sVar7, androidx.compose.foundation.layout.i1.q(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.t0 t0Var = new androidx.compose.foundation.layout.t0(1.0f, true);
                    androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(cVar, hVar, sVar7, 0);
                    int iHashCode4 = Long.hashCode(sVar7.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar7.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar7, t0Var);
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(fVar);
                    } else {
                        sVar7.o0();
                    }
                    androidx.compose.runtime.t.x(sVar7, wVarA2, eVar6);
                    androidx.compose.runtime.t.x(sVar7, jVarL4, eVar);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar7, eVar2, sVar7, dVar);
                    androidx.compose.runtime.t.x(sVar7, rVarC4, eVar9);
                    String strC2 = iptvChannel.c();
                    androidx.compose.runtime.x2 x2Var = n6.a;
                    androidx.compose.ui.node.e eVar10 = eVar;
                    androidx.compose.ui.node.e eVar11 = eVar6;
                    androidx.compose.ui.node.d dVar4 = dVar;
                    androidx.compose.ui.o oVar5 = oVar;
                    z5.b(strC2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar7.j(x2Var)).m, sVar7, 0, 24960, 110586);
                    if (nVar != null) {
                        sVar7.b0(1060735693);
                        str = "HH:mm";
                        z5.b(androidx.compose.runtime.j.i("▶  ", nVar.d()), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar7.j(x2Var)).k, sVar7, 0, 24960, 110586);
                        if (nVar2 != null) {
                            sVar = sVar7;
                            sVar.b0(1061149357);
                            String str8 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(nVar2.c()));
                            str8.getClass();
                            z5.b(androidx.room.b0.e("Next ", str8, ": ", nVar2.d()), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar.j(x2Var)).l, sVar, 0, 24960, 110586);
                            sVar = sVar;
                            z3 = false;
                            sVar.p(false);
                        } else {
                            sVar = sVar7;
                            z3 = false;
                            sVar.b0(1061554744);
                            sVar.p(false);
                        }
                        sVar.p(z3);
                    } else {
                        str = "HH:mm";
                        sVar7.b0(1061616310);
                        String strA = iptvChannel.a();
                        if (strA == null) {
                            strA = "";
                        }
                        z5.b(strA, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((m6) sVar7.j(x2Var)).l, sVar7, 0, 24576, 114682);
                        sVar = sVar7;
                        sVar.p(false);
                    }
                    sVar.p(true);
                    if (nVar != null) {
                        sVar.b0(655791608);
                        int iA = (int) ((nVar.a() - System.currentTimeMillis()) / 60000);
                        if (iA < 0) {
                            iA = 0;
                        }
                        androidx.compose.ui.h hVar6 = androidx.compose.ui.c.L;
                        androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(oVar5, f3, 0.0f, 0.0f, 0.0f, 14);
                        androidx.compose.foundation.layout.w wVarA3 = androidx.compose.foundation.layout.u.a(cVar, hVar6, sVar, 48);
                        int iHashCode5 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL5 = sVar.l();
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar, rVarU);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, wVarA3, eVar11);
                        androidx.compose.runtime.t.x(sVar, jVarL5, eVar10);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar, eVar2, sVar, dVar4);
                        androidx.compose.runtime.t.x(sVar, rVarC5, eVar9);
                        String str9 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(nVar.c()));
                        str9.getClass();
                        eVar11 = eVar11;
                        androidx.compose.runtime.s sVar8 = sVar;
                        eVar3 = eVar10;
                        eVar4 = eVar9;
                        dVar2 = dVar4;
                        oVar2 = oVar5;
                        z5.b(str9, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).o, sVar8, 0, 0, 131066);
                        z5.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("-", iA, "m"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar8.j(x2Var)).o, sVar8, 0, 0, 131066);
                        sVar = sVar8;
                        z = true;
                        sVar.p(true);
                        sVar.p(false);
                    } else {
                        oVar2 = oVar5;
                        eVar3 = eVar10;
                        dVar2 = dVar4;
                        eVar4 = eVar9;
                        z = true;
                        sVar.b0(656539266);
                        sVar.p(false);
                    }
                    sVar.p(z);
                    if (nVar != null) {
                        sVar.b0(-2092979325);
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.layout.i1.g(androidx.compose.foundation.layout.i1.e(oVar2, 1.0f), 2);
                        long jB = androidx.compose.ui.graphics.t.b(0.12f, androidx.compose.ui.graphics.t.d);
                        androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                        androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(rVarG, jB, j0Var);
                        androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                        int iHashCode6 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL6 = sVar.l();
                        androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar, rVarF);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, q0VarD2, eVar11);
                        androidx.compose.runtime.t.x(sVar, jVarL6, eVar3);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, sVar, eVar2, sVar, dVar2);
                        androidx.compose.runtime.t.x(sVar, rVarC6, eVar4);
                        androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(androidx.compose.foundation.layout.i1.c(androidx.compose.foundation.layout.i1.e(oVar2, nVar.b()), 1.0f), com.app.mlounge.ui.theme.b.f, j0Var), sVar, 0);
                        z2 = true;
                        sVar.p(true);
                        sVar.p(false);
                    } else {
                        z2 = true;
                        sVar.b0(-2092522850);
                        sVar.p(false);
                    }
                    sVar.p(z2);
                } else {
                    sVar7.W();
                }
                return kotlin.y.a;
            case 10:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.music.b.c((kotlin.jvm.functions.l) this.y, (kotlin.jvm.functions.l) this.z, (com.app.mlounge.ui.viewmodel.j0) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.k0.p((kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.a) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 12:
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.y;
                String str10 = (String) this.z;
                androidx.compose.runtime.a1 a1Var4 = (androidx.compose.runtime.a1) this.A;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar9.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    z5.b(str10, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 10, 6), ((com.app.mlounge.data.repository.a) a1Var4.getValue()) == aVar ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar9.j(n6.a)).o, sVar9, 48, 0, 131064);
                } else {
                    sVar9.W();
                }
                return kotlin.y.a;
            case 13:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.e((String) this.y, (String) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 14:
                List list = (List) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                String str11 = (String) this.A;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean z5 = false;
                boolean z6 = true;
                if (sVar10.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.foundation.layout.w wVarA4 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar10, 0);
                    int iHashCode7 = Long.hashCode(sVar10.T);
                    androidx.compose.runtime.internal.j jVarL7 = sVar10.l();
                    androidx.compose.ui.o oVar6 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(sVar10, oVar6);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar7 = androidx.compose.ui.node.g.b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(fVar7);
                    } else {
                        sVar10.o0();
                    }
                    androidx.compose.runtime.t.x(sVar10, wVarA4, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar10, jVarL7, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar10, Integer.valueOf(iHashCode7), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar10, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar10, rVarC7, androidx.compose.ui.node.g.d);
                    sVar10.b0(-1222499274);
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        kotlin.k kVar = (kotlin.k) it.next();
                        String str12 = (String) kVar.e;
                        String str13 = (String) kVar.y;
                        androidx.compose.ui.r rVarE = androidx.compose.foundation.layout.i1.e(oVar6, 1.0f);
                        boolean zF = sVar10.f(lVar) | sVar10.f(str12);
                        Object objQ4 = sVar10.Q();
                        androidx.compose.runtime.f fVar8 = androidx.compose.runtime.n.a;
                        if (zF || objQ4 == fVar8) {
                            objQ4 = new com.app.mlounge.ui.components.n0(lVar, str12, 2);
                            sVar10.l0(objQ4);
                        }
                        androidx.compose.ui.r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.k(rVarE, z5, null, (kotlin.jvm.functions.a) objQ4, 15), 4, 12);
                        androidx.compose.foundation.layout.f1 f1VarA2 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar10, 48);
                        int iHashCode8 = Long.hashCode(sVar10.T);
                        androidx.compose.runtime.internal.j jVarL8 = sVar10.l();
                        androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(sVar10, rVarR2);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar9 = androidx.compose.ui.node.g.b;
                        sVar10.e0();
                        if (sVar10.S) {
                            sVar10.k(fVar9);
                        } else {
                            sVar10.o0();
                        }
                        androidx.compose.runtime.t.x(sVar10, f1VarA2, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar10, jVarL8, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar10, Integer.valueOf(iHashCode8), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar10, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar10, rVarC8, androidx.compose.ui.node.g.d);
                        boolean zA = kotlin.jvm.internal.l.a(str11, str12);
                        boolean zF2 = sVar10.f(lVar) | sVar10.f(str12);
                        Object objQ5 = sVar10.Q();
                        if (zF2 || objQ5 == fVar8) {
                            objQ5 = new com.app.mlounge.ui.components.n0(lVar, str12, 3);
                            sVar10.l0(objQ5);
                        }
                        v4.a(zA, (kotlin.jvm.functions.a) objQ5, null, false, androidx.compose.material3.q.m(com.app.mlounge.ui.theme.b.f, com.app.mlounge.ui.theme.b.m, sVar10), sVar10, 0);
                        androidx.compose.foundation.layout.b.e(sVar10, androidx.compose.foundation.layout.i1.q(oVar6, 8));
                        androidx.compose.runtime.s sVar11 = sVar10;
                        z5.b(str13, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar10.j(n6.a)).k, sVar11, 0, 0, 131066);
                        sVar10 = sVar11;
                        sVar10.p(true);
                        z6 = true;
                        oVar6 = oVar6;
                        z5 = false;
                    }
                    sVar10.p(z5);
                    sVar10.p(z6);
                } else {
                    sVar10.W();
                }
                return kotlin.y.a;
            case 15:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.d((String) this.y, (kotlin.jvm.functions.l) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.h((kotlin.jvm.functions.p) this.y, (kotlin.jvm.functions.a) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(433));
                break;
            case 17:
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                PackageManager packageManager2 = (PackageManager) this.z;
                Context context2 = (Context) this.A;
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                androidx.compose.ui.i iVar3 = androidx.compose.ui.c.H;
                androidx.compose.ui.h hVar7 = androidx.compose.ui.c.J;
                int i4 = 1;
                int i5 = 2;
                if (sVar12.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    androidx.compose.foundation.c2 c2VarP = androidx.compose.foundation.s.p(sVar12);
                    androidx.compose.ui.o oVar7 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(oVar7, c2VarP, true);
                    androidx.compose.foundation.layout.w wVarA5 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, hVar7, sVar12, 0);
                    int iHashCode9 = Long.hashCode(sVar12.T);
                    androidx.compose.runtime.internal.j jVarL9 = sVar12.l();
                    androidx.compose.ui.r rVarC9 = androidx.compose.ui.a.c(sVar12, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.g.b;
                    sVar12.e0();
                    if (sVar12.S) {
                        sVar12.k(aVar2);
                    } else {
                        sVar12.o0();
                    }
                    androidx.compose.runtime.t.x(sVar12, wVarA5, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar12, jVarL9, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar12, Integer.valueOf(iHashCode9), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar12, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar12, rVarC9, androidx.compose.ui.node.g.d);
                    sVar12.b0(74567917);
                    androidx.compose.runtime.s sVar13 = sVar12;
                    for (com.app.mlounge.ui.screens.settings.f0 f0Var2 : com.app.mlounge.ui.screens.settings.e0.d) {
                        boolean zEquals = f0Var2.a.equals("internal");
                        Object obj3 = androidx.compose.runtime.n.a;
                        if (zEquals) {
                            sVar13.b0(-336249221);
                            Object objQ6 = sVar13.Q();
                            if (objQ6 == obj3) {
                                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar13);
                            }
                            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ6;
                            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.i1.e(oVar7, 1.0f), i5, ((Boolean) _COROUTINE.a.B(kVar2, sVar13, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean zF3 = sVar13.f(pVar2);
                            Object objQ7 = sVar13.Q();
                            if (zF3 || objQ7 == obj3) {
                                objQ7 = new com.app.mlounge.ui.screens.settings.e(1, pVar2);
                                sVar13.l0(objQ7);
                            }
                            float f4 = 12;
                            androidx.compose.ui.r rVarR3 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG2, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ7, 28), kVar2, i4), 4, f4);
                            androidx.compose.foundation.layout.f1 f1VarA3 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, iVar3, sVar13, 48);
                            int iHashCode10 = Long.hashCode(sVar13.T);
                            androidx.compose.runtime.internal.j jVarL10 = sVar13.l();
                            androidx.compose.ui.r rVarC10 = androidx.compose.ui.a.c(sVar13, rVarR3);
                            androidx.compose.ui.node.h.b.getClass();
                            kotlin.jvm.functions.a aVar3 = androidx.compose.ui.node.g.b;
                            sVar13.e0();
                            if (sVar13.S) {
                                sVar13.k(aVar3);
                            } else {
                                sVar13.o0();
                            }
                            androidx.compose.ui.node.e eVar12 = androidx.compose.ui.node.g.f;
                            androidx.compose.runtime.t.x(sVar13, f1VarA3, eVar12);
                            androidx.compose.ui.node.e eVar13 = androidx.compose.ui.node.g.e;
                            androidx.compose.runtime.t.x(sVar13, jVarL10, eVar13);
                            Integer numValueOf2 = Integer.valueOf(iHashCode10);
                            androidx.compose.ui.node.e eVar14 = androidx.compose.ui.node.g.g;
                            androidx.compose.runtime.t.p(sVar13, numValueOf2, eVar14);
                            androidx.compose.ui.node.d dVar5 = androidx.compose.ui.node.g.h;
                            androidx.compose.runtime.t.t(sVar13, dVar5);
                            androidx.compose.ui.node.e eVar15 = androidx.compose.ui.node.g.d;
                            androidx.compose.runtime.t.x(sVar13, rVarC10, eVar15);
                            PackageManager packageManager3 = packageManager2;
                            iVar = iVar3;
                            pVar = pVar2;
                            context = context2;
                            androidx.compose.ui.o oVar8 = oVar7;
                            androidx.compose.material3.q1.b(androidx.work.impl.v.u(), null, androidx.compose.foundation.layout.i1.m(oVar7, 24), com.app.mlounge.ui.theme.b.f, sVar13, 432, 0);
                            androidx.compose.foundation.layout.b.e(sVar13, androidx.compose.foundation.layout.i1.q(oVar8, f4));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.t0 t0Var2 = new androidx.compose.foundation.layout.t0(1.0f, true);
                            androidx.compose.foundation.layout.w wVarA6 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, hVar7, sVar13, 0);
                            int iHashCode11 = Long.hashCode(sVar13.T);
                            androidx.compose.runtime.internal.j jVarL11 = sVar13.l();
                            androidx.compose.ui.r rVarC11 = androidx.compose.ui.a.c(sVar13, t0Var2);
                            sVar13.e0();
                            if (sVar13.S) {
                                sVar13.k(aVar3);
                            } else {
                                sVar13.o0();
                            }
                            androidx.compose.runtime.t.x(sVar13, wVarA6, eVar12);
                            androidx.compose.runtime.t.x(sVar13, jVarL11, eVar13);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode11, sVar13, eVar14, sVar13, dVar5);
                            androidx.compose.runtime.t.x(sVar13, rVarC11, eVar15);
                            androidx.compose.runtime.r1 r1Var = n6.a;
                            androidx.compose.runtime.s sVar14 = sVar13;
                            z5.b("Built-in Downloader", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar13.j(r1Var)).k, sVar14, 6, 0, 131066);
                            z5.b("Default CinemaHQ downloader", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar14.j(r1Var)).l, sVar14, 6, 0, 131066);
                            sVar14.p(true);
                            sVar14.p(true);
                            androidx.compose.material3.q.d(null, 0.0f, com.app.mlounge.ui.theme.b.e, sVar14, 0, 3);
                            sVar2 = sVar14;
                            sVar2.p(false);
                            oVar3 = oVar8;
                            i2 = 2;
                            hVar4 = hVar7;
                            i3 = 1;
                            packageManager = packageManager3;
                        } else {
                            PackageManager packageManager4 = packageManager2;
                            androidx.compose.ui.i iVar4 = iVar3;
                            kotlin.jvm.functions.p pVar3 = pVar2;
                            Context context3 = context2;
                            androidx.compose.ui.o oVar9 = oVar7;
                            boolean z7 = i4;
                            sVar13.b0(-334747457);
                            packageManager4.getClass();
                            try {
                                packageManager4.getPackageInfo(f0Var2.a, 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                                z7 = 0;
                            }
                            Object objQ8 = sVar13.Q();
                            if (objQ8 == obj3) {
                                objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar13);
                            }
                            androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ8;
                            androidx.compose.ui.r rVarG3 = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.i1.e(oVar9, 1.0f), 2, ((Boolean) _COROUTINE.a.B(kVar3, sVar13, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean zG = sVar13.g(z7) | sVar13.f(pVar3) | sVar13.f(f0Var2) | sVar13.h(context3);
                            Object objQ9 = sVar13.Q();
                            if (zG || objQ9 == obj3) {
                                androidx.compose.ui.h hVar8 = hVar7;
                                f0Var = f0Var2;
                                pVar = pVar3;
                                hVar3 = hVar8;
                                i = 1;
                                fVar2 = new com.app.mlounge.ui.screens.settings.f(z7, pVar, f0Var, context3, 1);
                                context = context3;
                                sVar13.l0(fVar2);
                            } else {
                                pVar = pVar3;
                                context = context3;
                                i = 1;
                                hVar3 = hVar7;
                                f0Var = f0Var2;
                                fVar2 = objQ9;
                            }
                            androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG3, kVar3, null, false, null, (kotlin.jvm.functions.a) fVar2, 28), kVar3, i);
                            float f5 = 12;
                            androidx.compose.ui.r rVarR4 = androidx.compose.foundation.layout.b.r(rVarN, 4, f5);
                            androidx.compose.foundation.layout.f1 f1VarA4 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, iVar4, sVar13, 48);
                            int iHashCode12 = Long.hashCode(sVar13.T);
                            androidx.compose.runtime.internal.j jVarL12 = sVar13.l();
                            androidx.compose.ui.r rVarC12 = androidx.compose.ui.a.c(sVar13, rVarR4);
                            androidx.compose.ui.node.h.b.getClass();
                            kotlin.jvm.functions.a aVar4 = androidx.compose.ui.node.g.b;
                            sVar13.e0();
                            if (sVar13.S) {
                                sVar13.k(aVar4);
                            } else {
                                sVar13.o0();
                            }
                            androidx.compose.ui.node.e eVar16 = androidx.compose.ui.node.g.f;
                            androidx.compose.runtime.t.x(sVar13, f1VarA4, eVar16);
                            androidx.compose.ui.node.e eVar17 = androidx.compose.ui.node.g.e;
                            androidx.compose.runtime.t.x(sVar13, jVarL12, eVar17);
                            Integer numValueOf3 = Integer.valueOf(iHashCode12);
                            androidx.compose.ui.node.e eVar18 = androidx.compose.ui.node.g.g;
                            androidx.compose.runtime.t.p(sVar13, numValueOf3, eVar18);
                            androidx.compose.ui.node.d dVar6 = androidx.compose.ui.node.g.h;
                            androidx.compose.runtime.t.t(sVar13, dVar6);
                            androidx.compose.ui.node.e eVar19 = androidx.compose.ui.node.g.d;
                            androidx.compose.runtime.t.x(sVar13, rVarC12, eVar19);
                            androidx.compose.ui.h hVar9 = hVar3;
                            boolean z8 = z7;
                            oVar3 = oVar9;
                            iVar = iVar4;
                            i2 = 2;
                            com.app.mlounge.ui.screens.settings.f0 f0Var3 = f0Var;
                            i3 = 1;
                            androidx.compose.material3.q1.b(z7 != 0 ? coil3.network.g.q() : androidx.work.impl.v.r(), null, androidx.compose.foundation.layout.i1.m(oVar9, 24), z7 != 0 ? androidx.compose.ui.graphics.a0.d(4283215696L) : androidx.compose.ui.graphics.a0.d(4293212469L), sVar13, 432, 0);
                            androidx.compose.foundation.layout.b.e(sVar13, androidx.compose.foundation.layout.i1.q(oVar3, f5));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.t0 t0Var3 = new androidx.compose.foundation.layout.t0(1.0f, true);
                            androidx.compose.foundation.layout.w wVarA7 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, hVar9, sVar13, 0);
                            int iHashCode13 = Long.hashCode(sVar13.T);
                            androidx.compose.runtime.internal.j jVarL13 = sVar13.l();
                            androidx.compose.ui.r rVarC13 = androidx.compose.ui.a.c(sVar13, t0Var3);
                            sVar13.e0();
                            if (sVar13.S) {
                                sVar13.k(aVar4);
                            } else {
                                sVar13.o0();
                            }
                            androidx.compose.runtime.t.x(sVar13, wVarA7, eVar16);
                            androidx.compose.runtime.t.x(sVar13, jVarL13, eVar17);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode13, sVar13, eVar18, sVar13, dVar6);
                            androidx.compose.runtime.t.x(sVar13, rVarC13, eVar19);
                            String str14 = f0Var3.b;
                            androidx.compose.runtime.r1 r1Var2 = n6.a;
                            androidx.compose.runtime.s sVar15 = sVar13;
                            hVar4 = hVar9;
                            packageManager = packageManager4;
                            z5.b(str14, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar13.j(r1Var2)).k, sVar15, 0, 0, 131066);
                            z5.b(z8 ? "Installed" : "Not installed", null, z8 ? androidx.compose.ui.graphics.a0.d(4283215696L) : androidx.compose.ui.graphics.a0.d(4293212469L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar15.j(r1Var2)).l, sVar15, 0, 0, 131066);
                            sVar2 = sVar15;
                            androidx.room.b0.g(sVar2, true, true, false);
                        }
                        oVar7 = oVar3;
                        packageManager2 = packageManager;
                        i4 = i3;
                        hVar7 = hVar4;
                        context2 = context;
                        pVar2 = pVar;
                        i5 = i2;
                        iVar3 = iVar;
                        sVar13 = sVar2;
                    }
                    sVar13.p(false);
                    sVar13.p(i4);
                } else {
                    sVar12.W();
                }
                return kotlin.y.a;
            case 18:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.c((kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.w) this.z, (com.app.mlounge.ui.viewmodel.w1) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.theme.d.a((com.app.mlounge.ui.theme.c) this.y, (com.app.mlounge.ui.theme.a) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
