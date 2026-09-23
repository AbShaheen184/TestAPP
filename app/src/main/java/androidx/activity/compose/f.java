package androidx.activity.compose;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.textclassifier.TextClassification;
import androidx.appcompat.widget.c2;
import androidx.collection.p0;
import androidx.compose.animation.core.c1;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.d1;
import androidx.compose.foundation.u0;
import androidx.compose.material3.b3;
import androidx.compose.material3.j5;
import androidx.compose.material3.j6;
import androidx.compose.material3.k5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import androidx.lifecycle.m0;
import androidx.media3.ui.c0;
import androidx.work.impl.WorkDatabase;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import io.hopmonsdk.imsdk.ImsdkActivation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.i0;
import kotlin.collections.w;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(CoroutineScope coroutineScope, kotlin.jvm.functions.l lVar) {
        this.e = 12;
        this.y = coroutineScope;
        this.z = (kotlin.coroutines.jvm.internal.i) lVar;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0347  */
    /* JADX WARN: Code duplicated, block: B:162:0x0364  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5 A[LOOP:4: B:170:0x0381->B:180:0x03b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.l] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws PendingIntent.CanceledException {
        long j;
        k1 k1VarD;
        r0 r0Var;
        androidx.compose.ui.text.g gVar;
        List listO;
        g2 g2VarD;
        final boolean z;
        int i = 7;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        androidx.compose.runtime.tooling.i iVar = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (this.e) {
            case 0:
                ((m) this.y).c = (kotlin.jvm.functions.a) this.z;
                return y.a;
            case 1:
                ((q) this.y).d = (kotlin.jvm.functions.p) this.z;
                return y.a;
            case 2:
                ((Channel) this.y).mo28trySendJP2dKIU(this.z);
                return y.a;
            case 3:
                androidx.compose.foundation.t tVar = (androidx.compose.foundation.t) this.y;
                h0 h0Var = (h0) this.z;
                tVar.T = tVar.O.a(h0Var.e.d(), h0Var.getLayoutDirection(), h0Var);
                return y.a;
            case 4:
                ((z) this.y).e = androidx.compose.ui.node.l.h((u0) this.z, b1.a);
                return y.a;
            case 5:
                g0 g0Var = (g0) this.y;
                x xVar = (x) this.z;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) g0Var.getValue();
                return new androidx.compose.foundation.lazy.grid.i(xVar, hVar, new androidx.appcompat.widget.x((kotlin.ranges.d) xVar.d.f.getValue(), hVar));
            case 6:
                return new w0((androidx.compose.runtime.saveable.g) this.y, kotlin.collections.x.e, (androidx.compose.runtime.saveable.d) this.z);
            case 7:
                androidx.compose.ui.text.input.x xVar2 = (androidx.compose.ui.text.input.x) this.y;
                a1 a1Var = (a1) this.z;
                if (!l0.b(xVar2.b, ((androidx.compose.ui.text.input.x) a1Var.getValue()).b) || !kotlin.jvm.internal.l.a(xVar2.c, ((androidx.compose.ui.text.input.x) a1Var.getValue()).c)) {
                    a1Var.setValue(xVar2);
                }
                return y.a;
            case 8:
                ((z) this.y).e = ((kotlin.jvm.functions.a) this.z).invoke();
                return y.a;
            case 9:
                return new androidx.compose.ui.unit.j(androidx.room.t.F(((androidx.compose.foundation.text.contextmenu.provider.e) this.y).o0((androidx.compose.ui.layout.x) ((kotlin.jvm.functions.a) this.z).invoke())));
            case 10:
                ((androidx.compose.foundation.text.contextmenu.data.d) this.y).d.invoke((androidx.compose.foundation.text.contextmenu.data.g) this.z);
                return y.a;
            case 11:
                androidx.compose.foundation.text.contextmenu.internal.s.a((Context) this.y, (TextClassification) this.z);
                return y.a;
            case 12:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, CoroutineStart.UNDISPATCHED, new c1((kotlin.coroutines.jvm.internal.i) this.z, null), 1, null);
                return y.a;
            case 13:
                androidx.compose.foundation.text.selection.b1 b1Var = (androidx.compose.foundation.text.selection.b1) this.y;
                long j2 = ((androidx.compose.ui.unit.l) ((a1) this.z).getValue()).a;
                androidx.compose.ui.geometry.b bVarI = b1Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (bVarI != null) {
                    long j3 = bVarI.a;
                    androidx.compose.ui.text.g gVarM = b1Var.m();
                    if (gVarM != null && gVarM.y.length() != 0) {
                        f0 f0Var = (f0) b1Var.r.getValue();
                        int i5 = f0Var == null ? -1 : d1.a[f0Var.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1 || i5 == 2) {
                                long j4 = b1Var.n().b;
                                int i6 = l0.c;
                                j = j4 >> 32;
                            } else {
                                if (i5 != 3) {
                                    coil3.g.a();
                                    return null;
                                }
                                long j5 = b1Var.n().b;
                                int i7 = l0.c;
                                j = j5 & 4294967295L;
                            }
                            int i8 = (int) j;
                            r0 r0Var2 = b1Var.d;
                            if (r0Var2 != null && (k1VarD = r0Var2.d()) != null && (r0Var = b1Var.d) != null && (gVar = r0Var.a.a) != null) {
                                int iD = i0.d(b1Var.b.v(i8), 0, gVar.y.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (k1VarD.d(j3) >> 32));
                                j0 j0Var = k1VarD.a;
                                androidx.compose.ui.text.n nVar = j0Var.b;
                                int iD2 = nVar.d(iD);
                                float fD = j0Var.d(iD2);
                                float fE = j0Var.e(iD2);
                                float fC = i0.c(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (androidx.compose.ui.unit.l.a(j2, 0L) || Math.abs(fIntBitsToFloat - fC) <= ((int) (j2 >> 32)) / 2) {
                                    float f = nVar.f(iD2);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(((nVar.b(iD2) - f) / 2) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new androidx.compose.ui.geometry.b(jFloatToRawIntBits);
            case 14:
                j5 j5Var = (j5) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                if (((Boolean) j5Var.c.d.invoke(k5.z)).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var, b == true ? 1 : 0, i), 3, null);
                }
                return Boolean.TRUE;
            case 15:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, null, new androidx.compose.material3.internal.s((j6) this.z, b2 == true ? 1 : 0, i4), 3, null);
                return Boolean.TRUE;
            case 16:
                c2 c2Var = (c2) this.y;
                t1 t1Var = (t1) this.z;
                if (((androidx.compose.runtime.internal.a) c2Var.y).get() == 0) {
                    t1Var.invoke();
                }
                return y.a;
            case 17:
                p0 p0Var = (p0) this.y;
                androidx.compose.runtime.z zVar = (androidx.compose.runtime.z) this.z;
                Object[] objArr = p0Var.b;
                long[] jArr = p0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j6 = jArr[i9];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j6) < 128) {
                                    zVar.A(objArr[(i9 << 3) + i11]);
                                }
                                j6 >>= 8;
                            }
                            if (i10 == 8) {
                                if (i9 != length) {
                                    i9++;
                                }
                            }
                        } else if (i9 != length) {
                            i9++;
                        }
                    }
                }
                return y.a;
            case 18:
                androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) this.y;
                Object obj = this.z;
                androidx.compose.runtime.s sVar = dVar.e;
                h2 h2Var = sVar.c;
                g2 g2VarD2 = h2Var.d();
                int i12 = 0;
                while (true) {
                    try {
                        if (i12 < h2Var.y) {
                            if (g2VarD2.l(i12)) {
                                Object objN = g2VarD2.n(i12);
                                if (objN != obj) {
                                    androidx.compose.runtime.c2 c2Var2 = objN instanceof androidx.compose.runtime.c2 ? (androidx.compose.runtime.c2) objN : null;
                                    if ((c2Var2 != null ? c2Var2.a : null) == obj) {
                                    }
                                }
                                androidx.compose.runtime.tooling.i iVar2 = new androidx.compose.runtime.tooling.i(i12, null);
                                g2VarD2.c();
                                iVar = iVar2;
                                if (iVar != null) {
                                    int i13 = iVar.a;
                                    Integer num = iVar.b;
                                    g2VarD = h2Var.d();
                                    try {
                                        ArrayList arrayListQ = androidx.work.impl.v.Q(g2VarD, i13, num);
                                        g2VarD.c();
                                        listO = kotlin.collections.p.O(arrayListQ, sVar.J());
                                    } catch (Throwable th) {
                                        g2VarD.c();
                                        throw th;
                                    }
                                } else {
                                    listO = w.e;
                                }
                                return new androidx.compose.runtime.tooling.a(listO);
                            }
                            int[] iArr = g2VarD2.b;
                            int i14 = i12 + 1;
                            int iB = (i14 < g2VarD2.c ? iArr[(i14 * 5) + 4] : g2VarD2.e) - j2.b(i12, iArr);
                            int i15 = 0;
                            while (true) {
                                if (i15 >= iB) {
                                    i12 = i14;
                                } else {
                                    Object objH = g2VarD2.h(i12, i15);
                                    if (objH != obj) {
                                        androidx.compose.runtime.c2 c2Var3 = objH instanceof androidx.compose.runtime.c2 ? (androidx.compose.runtime.c2) objH : null;
                                        if ((c2Var3 != null ? c2Var3.a : null) != obj) {
                                            i15++;
                                        }
                                    }
                                    iVar = new androidx.compose.runtime.tooling.i(i12, Integer.valueOf(i15));
                                }
                            }
                        }
                        g2VarD2.c();
                        if (iVar != null) {
                            int i16 = iVar.a;
                            Integer num2 = iVar.b;
                            g2VarD = h2Var.d();
                            ArrayList arrayListQ2 = androidx.work.impl.v.Q(g2VarD, i16, num2);
                            g2VarD.c();
                            listO = kotlin.collections.p.O(arrayListQ2, sVar.J());
                        } else {
                            listO = w.e;
                        }
                        return new androidx.compose.runtime.tooling.a(listO);
                    } catch (Throwable th2) {
                        g2VarD2.c();
                        throw th2;
                    }
                }
            case 19:
                return com.google.firebase.b.k((Context) this.y, ((androidx.datastore.preferences.a) this.z).a.concat(".preferences_pb"));
            case 20:
                androidx.navigation.l lVar = (androidx.navigation.l) this.y;
                androidx.navigation.i iVar3 = (androidx.navigation.i) this.z;
                synchronized (lVar.a) {
                    try {
                        MutableStateFlow mutableStateFlow = lVar.b;
                        Iterable iterable = (Iterable) mutableStateFlow.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.l.a((androidx.navigation.i) obj2, iVar3)) {
                                mutableStateFlow.setValue(arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        mutableStateFlow.setValue(arrayList);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return y.a;
            case 21:
                ((androidx.navigation.compose.n) this.y).e((androidx.navigation.i) this.z, false);
                return y.a;
            case 22:
                androidx.work.impl.t tVar2 = (androidx.work.impl.t) this.y;
                androidx.work.h0 h0Var2 = (androidx.work.h0) this.z;
                androidx.work.impl.model.t tVarW = tVar2.c.w();
                List listD = tVarW.d(ImsdkActivation.WORK_PERIODIC);
                if (listD.size() > 1) {
                    com.google.firebase.platforminfo.b.n("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                androidx.work.impl.model.o oVar = (androidx.work.impl.model.o) kotlin.collections.p.D(listD);
                if (oVar == null) {
                    androidx.work.impl.utils.b.a(new androidx.work.impl.o(tVar2, ImsdkActivation.WORK_PERIODIC, androidx.work.m.y, kotlin.collections.q.j(h0Var2), 0));
                } else {
                    String str = oVar.a;
                    androidx.work.impl.model.p pVarC = tVarW.c(str);
                    if (pVarC == null) {
                        kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.r("WorkSpec with ", str, ", that matches a name \"DownloaderSdkQueryWork\", wasn't found"));
                        return null;
                    }
                    if (!pVarC.c()) {
                        com.google.firebase.platforminfo.b.n("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (oVar.b == androidx.work.i0.C) {
                        tVarW.a(str);
                        androidx.work.impl.utils.b.a(new androidx.work.impl.o(tVar2, ImsdkActivation.WORK_PERIODIC, androidx.work.m.y, kotlin.collections.q.j(h0Var2), 0));
                    } else {
                        final androidx.work.impl.model.p pVarB = androidx.work.impl.model.p.b(h0Var2.b, oVar.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        androidx.work.impl.d dVar2 = tVar2.f;
                        dVar2.getClass();
                        final WorkDatabase workDatabase = tVar2.c;
                        workDatabase.getClass();
                        androidx.work.b bVar = tVar2.b;
                        bVar.getClass();
                        final List list = tVar2.e;
                        list.getClass();
                        final Set set = h0Var2.c;
                        final String str2 = pVarB.a;
                        final androidx.work.impl.model.p pVarC2 = workDatabase.w().c(str2);
                        if (pVarC2 == null) {
                            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.r("Worker with ", str2, " doesn't exist"));
                            return null;
                        }
                        if (!pVarC2.b.a()) {
                            if (pVarC2.c() ^ pVarB.c()) {
                                StringBuilder sb = new StringBuilder("Can't update ");
                                sb.append(pVarC2.c() ? "Periodic" : "OneTime");
                                sb.append(" Worker to ");
                                throw new UnsupportedOperationException(androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, pVarB.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            synchronized (dVar2.k) {
                                z = dVar2.c(str2) != null;
                                break;
                            }
                            if (!z) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((androidx.work.impl.f) it.next()).e(str2);
                                }
                            }
                            workDatabase.o(new androidx.navigation.internal.h(new Runnable() { // from class: androidx.work.impl.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WorkDatabase workDatabase2 = workDatabase;
                                    androidx.work.impl.model.t tVarW2 = workDatabase2.w();
                                    androidx.work.impl.model.v vVarX = workDatabase2.x();
                                    androidx.work.impl.model.p pVar = pVarC2;
                                    androidx.work.i0 i0Var = pVar.b;
                                    int i17 = pVar.k;
                                    long j7 = pVar.n;
                                    int i18 = pVar.t + 1;
                                    int i19 = pVar.s;
                                    long j8 = pVar.u;
                                    int i20 = pVar.v;
                                    androidx.work.impl.model.p pVar2 = pVarB;
                                    androidx.work.impl.model.p pVarB2 = androidx.work.impl.model.p.b(pVar2, null, i0Var, null, null, i17, j7, i19, i18, j8, i20, 29613053);
                                    if (pVar2.v == 1) {
                                        pVarB2.u = pVar2.u;
                                        pVarB2.v++;
                                    }
                                    androidx.work.impl.model.p pVarC3 = androidx.work.impl.utils.g.c(list, pVarB2);
                                    tVarW2.getClass();
                                    okhttp3.internal.platform.android.g.t(tVarW2.a, false, true, new androidx.work.impl.model.r(tVarW2, pVarC3, 1));
                                    vVarX.getClass();
                                    String str3 = str2;
                                    str3.getClass();
                                    okhttp3.internal.platform.android.g.t(vVarX.a, false, true, new androidx.compose.material3.r(str3, 23));
                                    vVarX.a(str3, set);
                                    if (z) {
                                        return;
                                    }
                                    tVarW2.e(str3, -1L);
                                    androidx.work.impl.model.n nVarV = workDatabase2.v();
                                    nVarV.getClass();
                                    okhttp3.internal.platform.android.g.t(nVarV.a, false, true, new androidx.compose.material3.r(str3, 11));
                                }
                            }, i2));
                            if (!z) {
                                androidx.work.impl.i.b(bVar, workDatabase, list);
                            }
                        }
                    }
                }
                return y.a;
            case 23:
                androidx.compose.material3.internal.r0 r0Var3 = (androidx.compose.material3.internal.r0) this.y;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.z;
                synchronized (androidx.work.impl.constraints.i.b) {
                    LinkedHashMap linkedHashMap = androidx.work.impl.constraints.i.c;
                    linkedHashMap.remove(r0Var3);
                    if (linkedHashMap.isEmpty()) {
                        androidx.work.y.e().a(androidx.work.impl.constraints.j.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(androidx.work.impl.constraints.i.a);
                        androidx.work.impl.constraints.i.f = null;
                        androidx.work.impl.constraints.i.d = null;
                        androidx.work.impl.constraints.i.e = false;
                    }
                    break;
                }
                return y.a;
            case 24:
                androidx.work.impl.constraints.controllers.b bVar2 = (androidx.work.impl.constraints.controllers.b) this.y;
                androidx.work.impl.constraints.controllers.a aVar = (androidx.work.impl.constraints.controllers.a) this.z;
                androidx.navigation.u uVar = bVar2.a;
                uVar.getClass();
                synchronized (uVar.c) {
                    if (((LinkedHashSet) uVar.d).remove(aVar) && ((LinkedHashSet) uVar.d).isEmpty()) {
                        uVar.f();
                    }
                    break;
                }
                return y.a;
            case 25:
                String str3 = (String) this.y;
                androidx.work.impl.t tVar3 = (androidx.work.impl.t) this.z;
                WorkDatabase workDatabase2 = tVar3.c;
                workDatabase2.getClass();
                workDatabase2.o(new androidx.navigation.internal.h(new androidx.compose.foundation.text.contextmenu.internal.g(i, workDatabase2, str3, tVar3), i2));
                androidx.work.impl.i.b(tVar3.b, workDatabase2, tVar3.e);
                return y.a;
            case 26:
                androidx.work.impl.t tVar4 = (androidx.work.impl.t) this.y;
                UUID uuid = (UUID) this.z;
                WorkDatabase workDatabase3 = tVar4.c;
                workDatabase3.getClass();
                workDatabase3.o(new androidx.navigation.internal.h(new c0(5, tVar4, uuid), i2));
                androidx.work.impl.i.b(tVar4.b, tVar4.c, tVar4.e);
                return y.a;
            case 27:
                return kotlin.collections.q.j(new kotlin.k((coil3.fetch.h) this.y, (kotlin.jvm.internal.e) this.z));
            case 28:
                Context context = (Context) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                com.app.mlounge.util.c.a();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                com.app.mlounge.util.c.c((Application) applicationContext).setConsent(true);
                com.app.mlounge.util.c.a = true;
                lVar2.invoke(Boolean.TRUE);
                return y.a;
            default:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.a(cVar, (EpornerVideoDetail) this.z, b3 == true ? 1 : 0, i3), 3, null);
                return y.a;
        }
    }

    public /* synthetic */ f(androidx.navigation.l lVar, androidx.navigation.i iVar, boolean z) {
        this.e = 20;
        this.y = lVar;
        this.z = iVar;
    }

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
