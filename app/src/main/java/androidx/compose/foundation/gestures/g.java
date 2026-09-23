package androidx.compose.foundation.gestures;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;
import androidx.compose.material3.j5;
import androidx.compose.material3.j6;
import androidx.compose.material3.k5;
import androidx.compose.material3.l6;
import androidx.work.impl.WorkDatabase;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(androidx.compose.runtime.s sVar, androidx.compose.runtime.changelist.a aVar, androidx.compose.runtime.g2 g2Var, androidx.compose.runtime.z0 z0Var) {
        this.e = 5;
        this.y = sVar;
        this.z = aVar;
        this.A = g2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        kotlin.y yVar;
        int i;
        switch (this.e) {
            case 0:
                j jVar = (j) this.y;
                g3 g3Var = (g3) this.z;
                c cVar = (c) this.A;
                com.app.mlounge.data.music.e eVar = jVar.P;
                while (true) {
                    androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) eVar.y;
                    int i2 = bVar.z;
                    yVar = kotlin.y.a;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            androidx.transition.k.m("MutableVector is empty.");
                            return null;
                        }
                        androidx.compose.ui.geometry.c cVar2 = (androidx.compose.ui.geometry.c) ((f) bVar.e[i2 - 1]).a.invoke();
                        if (cVar2 == null ? true : j.N0(jVar, cVar2, 0L, 0L, 3)) {
                            androidx.compose.runtime.collection.b bVar2 = (androidx.compose.runtime.collection.b) eVar.y;
                            ((f) bVar2.k(bVar2.z - 1)).b.resumeWith(yVar);
                        }
                    }
                }
                if (jVar.Q) {
                    androidx.compose.ui.geometry.c cVar3 = (androidx.compose.ui.geometry.c) jVar.O.invoke();
                    if (cVar3 != null && j.N0(jVar, cVar3, 0L, 0L, 3)) {
                        jVar.Q = false;
                    }
                }
                g3Var.e = j.M0(jVar, cVar, 0L);
                return yVar;
            case 1:
                androidx.compose.runtime.g0 g0Var = (androidx.compose.runtime.g0) this.y;
                androidx.compose.foundation.lazy.y yVar2 = (androidx.compose.foundation.lazy.y) this.z;
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) this.A;
                androidx.compose.foundation.lazy.j jVar2 = (androidx.compose.foundation.lazy.j) g0Var.getValue();
                return new androidx.compose.foundation.lazy.l(yVar2, jVar2, dVar, new androidx.appcompat.widget.x((kotlin.ranges.d) yVar2.e.f.getValue(), jVar2));
            case 2:
                androidx.compose.foundation.relocation.h hVar = (androidx.compose.foundation.relocation.h) this.y;
                androidx.compose.ui.geometry.c cVarM0 = androidx.compose.foundation.relocation.h.M0(hVar, (androidx.compose.ui.node.d1) this.z, (androidx.compose.ui.draw.b) this.A);
                if (cVarM0 == null) {
                    return null;
                }
                j jVar3 = hVar.L;
                if (androidx.compose.ui.unit.l.a(jVar3.R, 0L)) {
                    androidx.compose.foundation.internal.b.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarM0.i(jVar3.P0(cVarM0, jVar3.R, 0L) ^ (-9223372034707292160L));
            case 3:
                j5 j5Var = (j5) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                j5 j5Var2 = (j5) this.A;
                if (((Boolean) j5Var.c.d.invoke(k5.y)).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.b3(j5Var2, null, 6), 3, null);
                }
                return Boolean.TRUE;
            case 4:
                j6 j6Var = (j6) this.y;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.z;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.A;
                l6 l6Var = (l6) j6Var;
                if (l6Var.b()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.foundation.text.selection.q(l6Var, null, 1), 3, null);
                    a1Var.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 5:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) this.y;
                androidx.compose.runtime.changelist.a aVar = (androidx.compose.runtime.changelist.a) this.z;
                androidx.compose.runtime.g2 g2Var = (androidx.compose.runtime.g2) this.A;
                androidx.compose.runtime.changelist.b bVar3 = sVar.M;
                androidx.compose.runtime.changelist.a aVar2 = bVar3.b;
                try {
                    bVar3.b = aVar;
                    androidx.compose.runtime.g2 g2Var2 = sVar.G;
                    int[] iArr = sVar.o;
                    androidx.collection.z zVar = sVar.v;
                    sVar.o = null;
                    sVar.v = null;
                    try {
                        sVar.G = g2Var;
                        boolean z = bVar3.e;
                        try {
                            bVar3.e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar3.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        sVar.G = g2Var2;
                        sVar.o = iArr;
                        sVar.v = zVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar3.b = aVar2;
                    throw th3;
                }
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) this.y;
                androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) this.z;
                androidx.compose.runtime.changelist.k0 k0Var = (androidx.compose.runtime.changelist.k0) this.A;
                if (aVar3 != null) {
                    k2Var.a(k2Var.c(aVar3) - k2Var.t);
                }
                List listG = androidx.work.impl.v.g(k2Var, null, k2Var.t, null);
                androidx.compose.runtime.tooling.b bVar4 = (androidx.compose.runtime.tooling.b) kotlin.collections.p.K(listG);
                Integer num = bVar4 != null ? bVar4.b : null;
                List listH = k0Var.h(num);
                if (num != null && !listH.isEmpty()) {
                    listH = kotlin.collections.p.O(kotlin.collections.q.j(new androidx.compose.runtime.tooling.b(((androidx.compose.runtime.tooling.b) kotlin.collections.p.B(listH)).a, null, num)), kotlin.collections.p.y(1, listH));
                }
                return new androidx.compose.runtime.tooling.a(kotlin.collections.p.O(listG, listH));
            case 7:
                androidx.compose.runtime.internal.b bVar5 = (androidx.compose.runtime.internal.b) this.y;
                androidx.compose.runtime.internal.c cVar4 = (androidx.compose.runtime.internal.c) this.z;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                bVar5.a();
                androidx.compose.runtime.internal.a aVar4 = (androidx.compose.runtime.internal.a) cVar4.z;
                int i3 = xVar.e;
                do {
                    i = aVar4.get();
                } while (!aVar4.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return kotlin.y.a;
            case 8:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.y;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.z;
                androidx.work.impl.constraints.d dVar2 = (androidx.work.impl.constraints.d) this.A;
                if (vVar.e) {
                    androidx.work.y.e().a(androidx.work.impl.constraints.j.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(dVar2);
                }
                return kotlin.y.a;
            case 9:
                androidx.work.impl.utils.o oVar = (androidx.work.impl.utils.o) this.y;
                UUID uuid = (UUID) this.z;
                androidx.work.i iVar = (androidx.work.i) this.A;
                oVar.getClass();
                String string = uuid.toString();
                androidx.work.y yVarE = androidx.work.y.e();
                String str = androidx.work.impl.utils.o.c;
                yVarE.a(str, "Updating progress for " + uuid + " (" + iVar + ")");
                WorkDatabase workDatabase = oVar.a;
                workDatabase.b();
                try {
                    androidx.work.impl.model.p pVarC = workDatabase.w().c(string);
                    if (pVarC == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (pVarC.b == androidx.work.i0.y) {
                        androidx.work.impl.model.m mVar = new androidx.work.impl.model.m(string, iVar);
                        androidx.work.impl.model.n nVarV = workDatabase.v();
                        nVarV.getClass();
                        okhttp3.internal.platform.android.g.t(nVarV.a, false, true, new androidx.compose.material3.internal.r0(14, nVarV, mVar));
                    } else {
                        androidx.work.y.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    workDatabase.f();
                    return null;
                } catch (Throwable th4) {
                    try {
                        androidx.work.y.e().d(str, "Error updating Worker progress", th4);
                        throw th4;
                    } catch (Throwable th5) {
                        workDatabase.f();
                        throw th5;
                    }
                }
            case 10:
                androidx.compose.runtime.w2 w2Var = (androidx.compose.runtime.w2) this.y;
                androidx.compose.runtime.w2 w2Var2 = (androidx.compose.runtime.w2) this.z;
                androidx.compose.runtime.w2 w2Var3 = (androidx.compose.runtime.w2) this.A;
                List list = com.app.mlounge.ui.navigation.w.f;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.app.mlounge.ui.navigation.w) it.next()).a);
                }
                if (!((List) w2Var.getValue()).isEmpty()) {
                    Set setF0 = kotlin.collections.p.f0((List) w2Var.getValue());
                    List list2 = (List) w2Var.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!setF0.contains((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = kotlin.collections.p.O(list2, arrayList2);
                }
                List list3 = com.app.mlounge.ui.navigation.w.f;
                int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(list3, 10));
                if (iJ < 16) {
                    iJ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
                for (Object obj2 : list3) {
                    linkedHashMap.put(((com.app.mlounge.ui.navigation.w) obj2).a, obj2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) linkedHashMap.get((String) it2.next());
                    if (wVar != null) {
                        arrayList3.add(wVar);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    com.app.mlounge.ui.navigation.w wVar2 = (com.app.mlounge.ui.navigation.w) obj3;
                    boolean z2 = wVar2.e && !((Boolean) w2Var2.getValue()).booleanValue();
                    boolean zContains = ((Set) w2Var3.getValue()).contains(wVar2.b);
                    if (!z2 && !zContains) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 11:
                kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) this.y;
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.runtime.a1 a1Var3 = (androidx.compose.runtime.a1) this.A;
                if (!((Boolean) a1Var2.getValue()).booleanValue()) {
                    a1Var3.setValue(Boolean.FALSE);
                    if (aVar5 != null) {
                        aVar5.invoke();
                    }
                }
                return kotlin.y.a;
            case 12:
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
                androidx.compose.runtime.a1 a1Var4 = (androidx.compose.runtime.a1) this.A;
                lVar.invoke(this.z);
                a1Var4.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 13:
                com.app.mlounge.ui.viewmodel.r rVar = (com.app.mlounge.ui.viewmodel.r) this.y;
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.z;
                String strA = ((GamePlatform) ((androidx.compose.runtime.a1) this.A).getValue()).a();
                strA.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(rVar), null, null, new androidx.room.coroutines.c0(gameDetailResponse, rVar, strA, (kotlin.coroutines.d) null, 21), 3, null);
                return kotlin.y.a;
            case 14:
                ((kotlin.jvm.functions.p) this.y).invoke(((GamePlatform) ((androidx.compose.runtime.a1) this.A).getValue()).a(), ((Game) this.z).c());
                return kotlin.y.a;
            case 15:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.y;
                String str2 = (String) this.z;
                androidx.compose.runtime.a1 a1Var5 = (androidx.compose.runtime.a1) this.A;
                lVar2.invoke(str2);
                a1Var5.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 16:
                com.app.mlounge.ui.viewmodel.j0 j0Var = (com.app.mlounge.ui.viewmodel.j0) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(j0Var), null, null, new androidx.room.coroutines.c0(j0Var, (String) this.A, (MusicAlbumDetail) this.z, (kotlin.coroutines.d) null, 27), 3, null);
                return kotlin.y.a;
            case 17:
                com.app.mlounge.ui.viewmodel.j0 j0Var2 = (com.app.mlounge.ui.viewmodel.j0) this.y;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(j0Var2), null, null, new androidx.room.coroutines.c0(j0Var2, (String) this.A, (MusicArtistDetail) this.z, (kotlin.coroutines.d) null, 28), 3, null);
                return kotlin.y.a;
            case 18:
                String str3 = (String) this.y;
                androidx.compose.runtime.a1 a1Var6 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.runtime.a1 a1Var7 = (androidx.compose.runtime.a1) this.A;
                a1Var6.setValue(str3);
                a1Var7.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 19:
                com.app.mlounge.ui.screens.player.a1 a1Var8 = (com.app.mlounge.ui.screens.player.a1) this.y;
                androidx.activity.compose.t tVar = (androidx.activity.compose.t) this.z;
                Context context = (Context) this.A;
                androidx.media3.exoplayer.c0 c0Var = a1Var8.i;
                if (c0Var != null) {
                    c0Var.M(false);
                }
                try {
                    tVar.a(new String[]{"application/x-subrip", "text/vtt", "application/ttml+xml", "text/x-ssa", "*/*"});
                    break;
                } catch (Exception unused) {
                    Toast.makeText(context, "File picker not available", 0).show();
                }
                return kotlin.y.a;
            case 20:
                ((kotlin.jvm.functions.p) this.y).invoke(kotlin.text.k.g0((String) ((androidx.compose.runtime.a1) this.z).getValue()).toString(), kotlin.text.k.g0((String) ((androidx.compose.runtime.a1) this.A).getValue()).toString());
                return kotlin.y.a;
            case 21:
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                String str4 = (String) this.z;
                String str5 = (String) this.A;
                str4.getClass();
                pVar.invoke(str4, str5);
                return kotlin.y.a;
            case 22:
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.y;
                com.app.mlounge.ui.viewmodel.c2 c2Var = (com.app.mlounge.ui.viewmodel.c2) this.z;
                androidx.compose.runtime.a1 a1Var9 = (androidx.compose.runtime.a1) this.A;
                lVar3.invoke(c2Var);
                a1Var9.setValue(Boolean.FALSE);
                return kotlin.y.a;
            default:
                okhttp3.i iVar2 = (okhttp3.i) this.y;
                okhttp3.q qVar = (okhttp3.q) this.z;
                okhttp3.a aVar6 = (okhttp3.a) this.A;
                dagger.hilt.android.internal.b bVar6 = iVar2.b;
                bVar6.getClass();
                return bVar6.a(aVar6.h.d, qVar.a());
        }
    }

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
