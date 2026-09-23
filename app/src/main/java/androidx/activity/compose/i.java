package androidx.activity.compose;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.text.n0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.room.b0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.navigation.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.CoroutineContextKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(b1 b1Var, boolean z, int i) {
        this.e = 1;
        this.z = b1Var;
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e0 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:43:0x0241 A[PHI: r36
  0x0241: PHI (r36v4 androidx.compose.ui.node.d) = (r36v3 androidx.compose.ui.node.d), (r36v5 androidx.compose.ui.node.d) binds: [B:41:0x023e, B:38:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0246 A[PHI: r36
  0x0246: PHI (r36v1 androidx.compose.ui.node.d) = 
  (r36v0 androidx.compose.ui.node.d)
  (r36v3 androidx.compose.ui.node.d)
  (r36v5 androidx.compose.ui.node.d)
  (r36v6 androidx.compose.ui.node.d)
 binds: [B:24:0x00e0, B:41:0x023e, B:38:0x0231, B:35:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x024a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0252  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00dd. Please report as an issue. */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.node.d dVar;
        androidx.compose.ui.graphics.vector.f fVarB;
        androidx.compose.ui.graphics.vector.f fVar;
        boolean z;
        boolean z2;
        androidx.compose.ui.graphics.vector.f fVarM;
        int i = this.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        y yVar = y.a;
        boolean z3 = this.y;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.a(z3, (kotlin.jvm.functions.a) obj3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                return yVar;
            case 1:
                ((Integer) obj2).getClass();
                n0.f((b1) obj3, z3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                okhttp3.internal.platform.android.g.a(z3, (kotlin.jvm.functions.p) obj3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                return yVar;
            case 3:
                w wVar = (w) obj3;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q1.b(z3 ? wVar.d : wVar.c, wVar.b, null, 0L, sVar, 0, 12);
                } else {
                    sVar.W();
                }
                return yVar;
            case 4:
                GamePlatform gamePlatform = (GamePlatform) obj3;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(gamePlatform.e(), androidx.compose.foundation.layout.b.r(oVar, 12, 8), z3 ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).n, sVar2, 48, 0, 131064);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 5:
                ChqStream chqStream = (ChqStream) obj3;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                    return yVar;
                }
                float f = 12;
                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), f);
                androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.e, iVar, sVar3, 54);
                int iHashCode = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL = sVar3.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarQ);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
                } else {
                    sVar3.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                androidx.compose.runtime.t.x(sVar3, f1VarA, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                androidx.compose.runtime.t.x(sVar3, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                androidx.compose.runtime.t.t(sVar3, dVar2);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                androidx.compose.runtime.t.x(sVar3, rVarC, eVar4);
                g1 g1Var = g1.a;
                androidx.compose.ui.r rVarA = g1.a(g1Var, oVar, 1.0f);
                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.a, iVar, sVar3, 48);
                int iHashCode2 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarA);
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA2, eVar);
                androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar3, eVar3, sVar3, dVar2);
                androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                String strL = chqStream.l();
                if (strL != null) {
                    switch (strL.hashCode()) {
                        case -1137141488:
                            dVar = dVar2;
                            if (!strL.equals("torrent")) {
                                fVarB = org.jsoup.helper.n.f;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i2 = h0.a;
                                    long j = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var = new p0(j);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                                    p0 p0Var2 = new p0(j);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList2, 0, p0Var2);
                                    p0 p0Var3 = new p0(j);
                                    ArrayList arrayList3 = new ArrayList(32);
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList3.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList3, 0, p0Var3);
                                    p0 p0Var4 = new p0(j);
                                    androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar.v(10.05f, 8.59f);
                                    gVar.t(6.03f, 4.55f);
                                    gVar.s(-0.01f);
                                    gVar.u(-0.31f, -0.32f);
                                    gVar.u(-1.42f, 1.41f);
                                    gVar.u(4.02f, 4.05f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, 0.01f, -0.01f, 0.31f, 0.32f);
                                    gVar.v(13.943f, 8.617f);
                                    gVar.u(4.405f, -4.392f);
                                    gVar.t(19.76f, 5.64f);
                                    gVar.u(-4.405f, 4.393f);
                                    gVar.l();
                                    gVar.v(10.01f, 15.36f);
                                    gVar.u(-1.42f, -1.41f);
                                    gVar.u(-4.03f, 4.01f);
                                    gVar.u(-0.32f, 0.33f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, 1.41f, 1.41f, 4.03f, -4.02f);
                                    gVar.v(19.76f, 18.3f);
                                    gVar.u(-3.99f, -4.01f);
                                    gVar.u(-0.36f, -0.35f);
                                    gVar.t(14.0f, 15.35f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, 3.99f, 4.01f, 0.35f, 0.35f);
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var4);
                                    p0 p0Var5 = new p0(j);
                                    ArrayList arrayList4 = new ArrayList(32);
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList4.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList4, 0, p0Var5);
                                    fVarB = eVar5.b();
                                    org.jsoup.helper.n.f = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarM = okhttp3.internal.platform.android.g.m();
                                fVar = fVarM;
                                sVar3 = sVar3;
                                g1Var = g1Var;
                                iVar = iVar;
                            }
                            break;
                        case -1081630870:
                            dVar = dVar2;
                            if (!strL.equals("magnet")) {
                                fVarB = org.jsoup.helper.n.f;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i3 = h0.a;
                                    long j2 = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var6 = new p0(j2);
                                    ArrayList arrayList5 = new ArrayList(32);
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList5.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList5, 0, p0Var6);
                                    p0 p0Var7 = new p0(j2);
                                    ArrayList arrayList6 = new ArrayList(32);
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList6.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList6, 0, p0Var7);
                                    p0 p0Var8 = new p0(j2);
                                    ArrayList arrayList7 = new ArrayList(32);
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList7.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList7, 0, p0Var8);
                                    p0 p0Var9 = new p0(j2);
                                    androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar2.v(10.05f, 8.59f);
                                    gVar2.t(6.03f, 4.55f);
                                    gVar2.s(-0.01f);
                                    gVar2.u(-0.31f, -0.32f);
                                    gVar2.u(-1.42f, 1.41f);
                                    gVar2.u(4.02f, 4.05f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar2, 0.01f, -0.01f, 0.31f, 0.32f);
                                    gVar2.v(13.943f, 8.617f);
                                    gVar2.u(4.405f, -4.392f);
                                    gVar2.t(19.76f, 5.64f);
                                    gVar2.u(-4.405f, 4.393f);
                                    gVar2.l();
                                    gVar2.v(10.01f, 15.36f);
                                    gVar2.u(-1.42f, -1.41f);
                                    gVar2.u(-4.03f, 4.01f);
                                    gVar2.u(-0.32f, 0.33f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar2, 1.41f, 1.41f, 4.03f, -4.02f);
                                    gVar2.v(19.76f, 18.3f);
                                    gVar2.u(-3.99f, -4.01f);
                                    gVar2.u(-0.36f, -0.35f);
                                    gVar2.t(14.0f, 15.35f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar2, 3.99f, 4.01f, 0.35f, 0.35f);
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.b, 0, p0Var9);
                                    p0 p0Var10 = new p0(j2);
                                    ArrayList arrayList8 = new ArrayList(32);
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList8.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList8, 0, p0Var10);
                                    fVarB = eVar6.b();
                                    org.jsoup.helper.n.f = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarM = okhttp3.internal.platform.android.g.m();
                                fVar = fVarM;
                                sVar3 = sVar3;
                                g1Var = g1Var;
                                iVar = iVar;
                            }
                            break;
                        case 103407:
                            dVar = dVar2;
                            if (!strL.equals("hls")) {
                                fVarB = org.jsoup.helper.n.f;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i4 = h0.a;
                                    long j3 = androidx.compose.ui.graphics.t.b;
                                    p0 p0Var11 = new p0(j3);
                                    ArrayList arrayList9 = new ArrayList(32);
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList9.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList9, 0, p0Var11);
                                    p0 p0Var12 = new p0(j3);
                                    ArrayList arrayList10 = new ArrayList(32);
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList10.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList10, 0, p0Var12);
                                    p0 p0Var13 = new p0(j3);
                                    ArrayList arrayList11 = new ArrayList(32);
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList11.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList11, 0, p0Var13);
                                    p0 p0Var14 = new p0(j3);
                                    androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar3.v(10.05f, 8.59f);
                                    gVar3.t(6.03f, 4.55f);
                                    gVar3.s(-0.01f);
                                    gVar3.u(-0.31f, -0.32f);
                                    gVar3.u(-1.42f, 1.41f);
                                    gVar3.u(4.02f, 4.05f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar3, 0.01f, -0.01f, 0.31f, 0.32f);
                                    gVar3.v(13.943f, 8.617f);
                                    gVar3.u(4.405f, -4.392f);
                                    gVar3.t(19.76f, 5.64f);
                                    gVar3.u(-4.405f, 4.393f);
                                    gVar3.l();
                                    gVar3.v(10.01f, 15.36f);
                                    gVar3.u(-1.42f, -1.41f);
                                    gVar3.u(-4.03f, 4.01f);
                                    gVar3.u(-0.32f, 0.33f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar3, 1.41f, 1.41f, 4.03f, -4.02f);
                                    gVar3.v(19.76f, 18.3f);
                                    gVar3.u(-3.99f, -4.01f);
                                    gVar3.u(-0.36f, -0.35f);
                                    gVar3.t(14.0f, 15.35f);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar3, 3.99f, 4.01f, 0.35f, 0.35f);
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, gVar3.b, 0, p0Var14);
                                    p0 p0Var15 = new p0(j3);
                                    ArrayList arrayList12 = new ArrayList(32);
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                    arrayList12.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                    androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList12, 0, p0Var15);
                                    fVarB = eVar7.b();
                                    org.jsoup.helper.n.f = fVarB;
                                }
                                fVar = fVarB;
                            } else {
                                fVarM = org.jsoup.helper.n.w();
                                fVar = fVarM;
                                sVar3 = sVar3;
                                g1Var = g1Var;
                                iVar = iVar;
                            }
                            break;
                        case 108273:
                            if (strL.equals("mp4")) {
                                fVarM = com.google.firebase.b.g;
                                if (fVarM != null) {
                                    dVar = dVar2;
                                } else {
                                    androidx.compose.ui.graphics.vector.e eVar8 = new androidx.compose.ui.graphics.vector.e("Filled.VideoFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i5 = h0.a;
                                    dVar = dVar2;
                                    p0 p0Var16 = new p0(androidx.compose.ui.graphics.t.b);
                                    androidx.compose.ui.graphics.vector.g gVar4 = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar4.v(14.0f, 2.0f);
                                    gVar4.r(6.01f);
                                    gVar4.n(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
                                    gVar4.t(4.0f, 20.0f);
                                    gVar4.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    gVar4.s(12.0f);
                                    gVar4.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                    gVar4.z(8.0f);
                                    gVar4.t(14.0f, 2.0f);
                                    gVar4.l();
                                    gVar4.v(13.0f, 9.0f);
                                    gVar4.z(3.5f);
                                    gVar4.t(18.5f, 9.0f);
                                    gVar4.r(13.0f);
                                    gVar4.l();
                                    gVar4.v(14.0f, 14.0f);
                                    gVar4.u(2.0f, -1.06f);
                                    gVar4.A(4.12f);
                                    gVar4.t(14.0f, 16.0f);
                                    gVar4.A(1.0f);
                                    gVar4.n(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                                    gVar4.r(9.0f);
                                    gVar4.n(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                    gVar4.A(-4.0f);
                                    gVar4.n(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                                    gVar4.s(4.0f);
                                    gVar4.n(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                                    gVar4.z(14.0f);
                                    gVar4.l();
                                    androidx.compose.ui.graphics.vector.e.a(eVar8, gVar4.b, 0, p0Var16);
                                    fVarM = eVar8.b();
                                    com.google.firebase.b.g = fVarM;
                                }
                                fVar = fVarM;
                                sVar3 = sVar3;
                                g1Var = g1Var;
                                iVar = iVar;
                                break;
                            }
                        default:
                            dVar = dVar2;
                            fVarB = org.jsoup.helper.n.f;
                            if (fVarB == null) {
                                androidx.compose.ui.graphics.vector.e eVar9 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i6 = h0.a;
                                long j4 = androidx.compose.ui.graphics.t.b;
                                p0 p0Var17 = new p0(j4);
                                ArrayList arrayList13 = new ArrayList(32);
                                arrayList13.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                                arrayList13.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                arrayList13.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList13.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList13, 0, p0Var17);
                                p0 p0Var18 = new p0(j4);
                                ArrayList arrayList14 = new ArrayList(32);
                                arrayList14.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                                arrayList14.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                arrayList14.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList14.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList14, 0, p0Var18);
                                p0 p0Var19 = new p0(j4);
                                ArrayList arrayList15 = new ArrayList(32);
                                arrayList15.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                                arrayList15.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                arrayList15.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList15.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList15, 0, p0Var19);
                                p0 p0Var110 = new p0(j4);
                                androidx.compose.ui.graphics.vector.g gVar5 = new androidx.compose.ui.graphics.vector.g(0);
                                gVar5.v(10.05f, 8.59f);
                                gVar5.t(6.03f, 4.55f);
                                gVar5.s(-0.01f);
                                gVar5.u(-0.31f, -0.32f);
                                gVar5.u(-1.42f, 1.41f);
                                gVar5.u(4.02f, 4.05f);
                                androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar5, 0.01f, -0.01f, 0.31f, 0.32f);
                                gVar5.v(13.943f, 8.617f);
                                gVar5.u(4.405f, -4.392f);
                                gVar5.t(19.76f, 5.64f);
                                gVar5.u(-4.405f, 4.393f);
                                gVar5.l();
                                gVar5.v(10.01f, 15.36f);
                                gVar5.u(-1.42f, -1.41f);
                                gVar5.u(-4.03f, 4.01f);
                                gVar5.u(-0.32f, 0.33f);
                                androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar5, 1.41f, 1.41f, 4.03f, -4.02f);
                                gVar5.v(19.76f, 18.3f);
                                gVar5.u(-3.99f, -4.01f);
                                gVar5.u(-0.36f, -0.35f);
                                gVar5.t(14.0f, 15.35f);
                                androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar5, 3.99f, 4.01f, 0.35f, 0.35f);
                                androidx.compose.ui.graphics.vector.e.a(eVar9, gVar5.b, 0, p0Var110);
                                p0 p0Var111 = new p0(j4);
                                ArrayList arrayList16 = new ArrayList(32);
                                arrayList16.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                                arrayList16.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                                arrayList16.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                                arrayList16.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                                androidx.compose.ui.graphics.vector.e.a(eVar9, arrayList16, 0, p0Var111);
                                fVarB = eVar9.b();
                                org.jsoup.helper.n.f = fVarB;
                            }
                            fVar = fVarB;
                            break;
                    }
                } else {
                    dVar = dVar2;
                    fVarB = org.jsoup.helper.n.f;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar10 = new androidx.compose.ui.graphics.vector.e("Filled.Stream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = h0.a;
                        long j5 = androidx.compose.ui.graphics.t.b;
                        p0 p0Var112 = new p0(j5);
                        ArrayList arrayList17 = new ArrayList(32);
                        arrayList17.add(new androidx.compose.ui.graphics.vector.o(20.0f, 12.0f));
                        arrayList17.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                        arrayList17.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList17.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList17, 0, p0Var112);
                        p0 p0Var113 = new p0(j5);
                        ArrayList arrayList18 = new ArrayList(32);
                        arrayList18.add(new androidx.compose.ui.graphics.vector.o(4.0f, 12.0f));
                        arrayList18.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                        arrayList18.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList18.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList18, 0, p0Var113);
                        p0 p0Var114 = new p0(j5);
                        ArrayList arrayList19 = new ArrayList(32);
                        arrayList19.add(new androidx.compose.ui.graphics.vector.o(12.0f, 20.0f));
                        arrayList19.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                        arrayList19.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList19.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList19, 0, p0Var114);
                        p0 p0Var115 = new p0(j5);
                        androidx.compose.ui.graphics.vector.g gVar6 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar6.v(10.05f, 8.59f);
                        gVar6.t(6.03f, 4.55f);
                        gVar6.s(-0.01f);
                        gVar6.u(-0.31f, -0.32f);
                        gVar6.u(-1.42f, 1.41f);
                        gVar6.u(4.02f, 4.05f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar6, 0.01f, -0.01f, 0.31f, 0.32f);
                        gVar6.v(13.943f, 8.617f);
                        gVar6.u(4.405f, -4.392f);
                        gVar6.t(19.76f, 5.64f);
                        gVar6.u(-4.405f, 4.393f);
                        gVar6.l();
                        gVar6.v(10.01f, 15.36f);
                        gVar6.u(-1.42f, -1.41f);
                        gVar6.u(-4.03f, 4.01f);
                        gVar6.u(-0.32f, 0.33f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar6, 1.41f, 1.41f, 4.03f, -4.02f);
                        gVar6.v(19.76f, 18.3f);
                        gVar6.u(-3.99f, -4.01f);
                        gVar6.u(-0.36f, -0.35f);
                        gVar6.t(14.0f, 15.35f);
                        androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar6, 3.99f, 4.01f, 0.35f, 0.35f);
                        androidx.compose.ui.graphics.vector.e.a(eVar10, gVar6.b, 0, p0Var115);
                        p0 p0Var116 = new p0(j5);
                        ArrayList arrayList110 = new ArrayList(32);
                        arrayList110.add(new androidx.compose.ui.graphics.vector.o(12.0f, 4.0f));
                        arrayList110.add(new androidx.compose.ui.graphics.vector.w(-2.0f, 0.0f));
                        arrayList110.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f));
                        arrayList110.add(new androidx.compose.ui.graphics.vector.s(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
                        androidx.compose.ui.graphics.vector.e.a(eVar10, arrayList110, 0, p0Var116);
                        fVarB = eVar10.b();
                        org.jsoup.helper.n.f = fVarB;
                    }
                    fVar = fVarB;
                }
                long j6 = com.app.mlounge.ui.theme.b.f;
                androidx.compose.ui.i iVar2 = iVar;
                androidx.compose.runtime.s sVar4 = sVar3;
                q1.b(fVar, null, i1.m(oVar, 24), j6, sVar4, 3504, 0);
                androidx.compose.foundation.layout.b.e(sVar4, i1.q(oVar, f));
                androidx.compose.ui.r rVarA2 = g1.a(g1Var, oVar, 1.0f);
                androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar4, 0);
                int iHashCode3 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar4.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar4, rVarA2);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar2);
                } else {
                    sVar4.o0();
                }
                androidx.compose.runtime.t.x(sVar4, wVarA, eVar);
                androidx.compose.runtime.t.x(sVar4, jVarL3, eVar2);
                androidx.compose.ui.node.d dVar3 = dVar;
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar4, eVar3, sVar4, dVar3);
                androidx.compose.runtime.t.x(sVar4, rVarC3, eVar4);
                String strG = chqStream.g();
                if (strG == null) {
                    strG = "Unknown Source";
                }
                x2 x2Var = n6.a;
                z5.b(strG, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar4.j(x2Var)).k, sVar4, 384, 24960, 110586);
                androidx.compose.runtime.s sVar5 = sVar4;
                f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, sVar5, 6);
                int iHashCode4 = Long.hashCode(sVar5.T);
                androidx.compose.runtime.internal.j jVarL4 = sVar5.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar5, oVar);
                sVar5.e0();
                if (sVar5.S) {
                    sVar5.k(fVar2);
                } else {
                    sVar5.o0();
                }
                androidx.compose.runtime.t.x(sVar5, f1VarA3, eVar);
                androidx.compose.runtime.t.x(sVar5, jVarL4, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar5, eVar3, sVar5, dVar3);
                androidx.compose.runtime.t.x(sVar5, rVarC4, eVar4);
                if (chqStream.c() != null) {
                    sVar5.b0(1221272914);
                    z5.b(chqStream.c(), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((m6) sVar5.j(x2Var)).o, sVar5, 384, 24960, 110586);
                    sVar5 = sVar5;
                    sVar5.p(false);
                    z = true;
                } else {
                    boolean z4 = false;
                    sVar5.b0(1221680099);
                    String strH = chqStream.h();
                    if (strH == null) {
                        sVar5.b0(1221674394);
                        sVar5.p(false);
                    } else {
                        sVar5.b0(1221674395);
                        z5.b(strH, null, com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).o, sVar5, 384, 0, 131066);
                        sVar5 = sVar5;
                        z4 = false;
                        sVar5.p(false);
                    }
                    String strL2 = chqStream.l();
                    if (strL2 == null) {
                        sVar5.b0(1221847591);
                        sVar5.p(z4);
                    } else {
                        sVar5.b0(1221847592);
                        String upperCase = strL2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        androidx.compose.runtime.s sVar6 = sVar5;
                        z5.b(upperCase, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).o, sVar6, 384, 0, 131066);
                        sVar5 = sVar6;
                        z4 = false;
                        sVar5.p(false);
                    }
                    String strJ = chqStream.j();
                    if (strJ == null) {
                        sVar5.b0(1222038675);
                        sVar5.p(z4);
                    } else {
                        sVar5.b0(1222038676);
                        androidx.compose.runtime.s sVar7 = sVar5;
                        z5.b(strJ, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).o, sVar7, 384, 0, 131066);
                        sVar5 = sVar7;
                        z4 = false;
                        sVar5.p(false);
                    }
                    Integer numI = chqStream.i();
                    if (numI == null) {
                        sVar5.b0(1222249165);
                        sVar5.p(z4);
                        z2 = z4;
                        z = true;
                    } else {
                        sVar5.b0(1222249166);
                        int iIntValue4 = numI.intValue();
                        if (iIntValue4 > 0) {
                            sVar5.b0(1604983391);
                            f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.g(2), iVar2, sVar5, 54);
                            int iHashCode5 = Long.hashCode(sVar5.T);
                            androidx.compose.runtime.internal.j jVarL5 = sVar5.l();
                            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar5, oVar);
                            sVar5.e0();
                            if (sVar5.S) {
                                sVar5.k(fVar2);
                            } else {
                                sVar5.o0();
                            }
                            androidx.compose.runtime.t.x(sVar5, f1VarA4, eVar);
                            androidx.compose.runtime.t.x(sVar5, jVarL5, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar5, eVar3, sVar5, dVar3);
                            androidx.compose.runtime.t.x(sVar5, rVarC5, eVar4);
                            androidx.compose.runtime.s sVar8 = sVar5;
                            q1.b(org.jsoup.helper.n.s(), "Seeders", i1.m(oVar, f), a0.d(4283215696L), sVar8, 3504, 0);
                            z5.b(String.valueOf(iIntValue4), null, a0.d(4283215696L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar8.j(x2Var)).o, sVar8, 384, 0, 131066);
                            sVar5 = sVar8;
                            z = true;
                            sVar5.p(true);
                            z2 = false;
                            sVar5.p(false);
                        } else {
                            z = true;
                            z2 = false;
                            sVar5.b0(1605871324);
                            sVar5.p(false);
                        }
                        sVar5.p(z2);
                    }
                    sVar5.p(z2);
                }
                b0.g(sVar5, z, z, z);
                androidx.compose.runtime.s sVar9 = sVar5;
                q1.b(z3 ? androidx.work.impl.v.u() : okhttp3.internal.platform.android.g.n(), z3 ? "Download" : "Play", i1.m(oVar, 20), j6, sVar9, 3456, 0);
                sVar9.p(true);
                return yVar;
            default:
                return CoroutineContextKt.foldCopies$lambda$1((z) obj3, z3, (kotlin.coroutines.j) obj, (kotlin.coroutines.h) obj2);
        }
    }

    public /* synthetic */ i(Serializable serializable, boolean z, int i) {
        this.e = i;
        this.z = serializable;
        this.y = z;
    }

    public /* synthetic */ i(boolean z, int i, Object obj) {
        this.e = i;
        this.y = z;
        this.z = obj;
    }

    public /* synthetic */ i(boolean z, kotlin.d dVar, int i, int i2) {
        this.e = i2;
        this.y = z;
        this.z = dVar;
    }
}
