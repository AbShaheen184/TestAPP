package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import android.net.Uri;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends androidx.lifecycle.s0 {
    public final Semaphore A;
    public final Semaphore B;
    public final kotlin.o C;
    public final Context b;
    public final com.app.mlounge.data.repository.r c;
    public final com.app.mlounge.data.local.prefs.y1 d;
    public final com.app.mlounge.data.download.h e;
    public final okhttp3.y f;
    public volatile List g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final MutableSharedFlow p;
    public final SharedFlow q;
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final int v;
    public final int w;
    public final String x;
    public final MutableSharedFlow y;
    public final SharedFlow z;

    public w1(Context context, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.download.h hVar, okhttp3.y yVar, androidx.lifecycle.j0 j0Var) {
        rVar.getClass();
        y1Var.getClass();
        hVar.getClass();
        yVar.getClass();
        j0Var.getClass();
        this.b = context;
        this.c = rVar;
        this.d = y1Var;
        this.e = hVar;
        this.f = yVar;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        this.g = wVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(wVar);
        this.h = MutableStateFlow;
        this.i = FlowKt.stateIn(FlowKt.flowOn(new androidx.compose.material3.internal.j0(MutableStateFlow, this, 2), Dispatchers.getDefault()), androidx.lifecycle.m0.g(this), SharingStarted.Companion.getEagerly(), wVar);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.j = MutableStateFlow2;
        this.k = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(wVar);
        this.l = MutableStateFlow3;
        this.m = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(new m(null, null, null, null, 63));
        this.n = MutableStateFlow4;
        this.o = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.p = mutableSharedFlowMutableSharedFlow$default;
        this.q = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        String str = (String) j0Var.a("type");
        this.r = str == null ? "" : str;
        String str2 = (String) j0Var.a("id");
        String str3 = str2 != null ? str2 : "";
        this.s = str3;
        Integer numW = kotlin.text.r.w(str3);
        this.t = numW != null ? numW.intValue() : 0;
        String str4 = (String) j0Var.a("title");
        String strDecode = Uri.decode(str4 == null ? "Sources" : str4);
        strDecode.getClass();
        this.u = strDecode;
        Integer num = (Integer) j0Var.a("season");
        this.v = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) j0Var.a("episode");
        this.w = num2 != null ? num2.intValue() : 0;
        String str5 = (String) j0Var.a("mode");
        this.x = str5 == null ? "play" : str5;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.y = mutableSharedFlowMutableSharedFlow$default2;
        this.z = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        m();
        this.A = SemaphoreKt.Semaphore$default(4, 0, 2, null);
        this.B = SemaphoreKt.Semaphore$default(4, 0, 2, null);
        this.C = new kotlin.o(new com.app.mlounge.ui.screens.sources.c(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(w1 w1Var, ChqStream chqStream, kotlin.coroutines.jvm.internal.c cVar) {
        q1 q1Var;
        Exception e;
        ChqStream chqStream2;
        Semaphore semaphore = w1Var.A;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i = q1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1Var.A = i - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(w1Var, cVar);
            }
        } else {
            q1Var = new q1(w1Var, cVar);
        }
        Object objWithContext = q1Var.y;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = q1Var.A;
        kotlin.coroutines.d dVar = null;
        boolean zBooleanValue = false;
        try {
            try {
                if (i2 == 0) {
                    kotlin.a.e(objWithContext);
                    Boolean boolN = chqStream.n();
                    Boolean bool = Boolean.TRUE;
                    if (!kotlin.jvm.internal.l.a(boolN, bool) && !kotlin.jvm.internal.l.a(chqStream.k(), "torrent") && !kotlin.text.r.u(chqStream.m(), "magnet:", false) && kotlin.text.r.u(chqStream.m(), "http", false) && !kotlin.jvm.internal.l.a(chqStream.l(), "hls") && !kotlin.jvm.internal.l.a(chqStream.k(), "hls") && !kotlin.text.k.z(chqStream.m(), ".m3u8", false)) {
                        if (!kotlin.text.k.z(chqStream.m(), "googleusercontent.com", false) && !kotlin.text.k.z(chqStream.m(), ".workers.dev", false) && !kotlin.text.k.z(chqStream.m(), "freehandyflix.online", false) && !kotlin.text.k.z(chqStream.m(), "nexabloom.top", false) && !kotlin.text.k.z(chqStream.m(), "norami.top", false) && !kotlin.text.k.z(chqStream.m(), "mikora.top", false) && !kotlin.text.k.z(chqStream.m(), "vyrnex.top", false) && !kotlin.text.k.z(chqStream.m(), "zhaevor.top", false) && !kotlin.text.k.z(chqStream.m(), "megaplay.buzz", false)) {
                            q1Var.e = chqStream;
                            q1Var.A = 1;
                            if (semaphore.acquire(q1Var) != aVar) {
                            }
                            return aVar;
                        }
                        Context context = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "SourcesViewModel", androidx.room.b0.e("Source check [", chqStream.g(), "] skipped (CDN fast-path) ", kotlin.text.k.f0(60, chqStream.m())));
                    }
                    return bool;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chqStream2 = q1Var.e;
                    try {
                        kotlin.a.e(objWithContext);
                        zBooleanValue = ((Boolean) objWithContext).booleanValue();
                    } catch (Exception e2) {
                        e = e2;
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "SourcesViewModel", "Source check failed [" + chqStream2.g() + "]: " + e.getMessage());
                    }
                    semaphore.release();
                    return Boolean.valueOf(zBooleanValue);
                }
                chqStream = q1Var.e;
                kotlin.a.e(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                androidx.compose.foundation.text.input.internal.k kVar = new androidx.compose.foundation.text.input.internal.k(chqStream, w1Var, dVar, 16);
                q1Var.e = chqStream;
                q1Var.A = 2;
                objWithContext = BuildersKt.withContext(io2, kVar, q1Var);
                if (objWithContext != aVar) {
                    chqStream2 = chqStream;
                    zBooleanValue = ((Boolean) objWithContext).booleanValue();
                    semaphore.release();
                    return Boolean.valueOf(zBooleanValue);
                }
                return aVar;
            } catch (Exception e3) {
                ChqStream chqStream3 = chqStream;
                e = e3;
                chqStream2 = chqStream3;
                Context context3 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "SourcesViewModel", "Source check failed [" + chqStream2.g() + "]: " + e.getMessage());
            }
        } catch (Throwable th) {
            semaphore.release();
            throw th;
        }
    }

    public static final Long f(w1 w1Var, String str, Map map) {
        Long lX;
        String strG;
        w1Var.getClass();
        if (!kotlin.text.k.z(str, "googleusercontent.com", false) && !kotlin.text.k.z(str, ".workers.dev", false)) {
            try {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str);
                a0Var.c("HEAD", null);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        a0Var.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = w1Var.f;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                try {
                    if (!g0VarE.N || (strG = okhttp3.g0.g("Content-Length", g0VarE)) == null || (lX = kotlin.text.r.x(strG)) == null || lX.longValue() <= 0) {
                        lX = null;
                    }
                    g0VarE.close();
                    return lX;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dagger.internal.d.b(g0VarE, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final String g(w1 w1Var, long j) {
        if (j >= 1073741824) {
            return String.format(Locale.US, "%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.073741824E9d)}, 1));
        }
        if (j >= 1048576) {
            return String.format(Locale.US, "%.0f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
        }
        if (j >= 1024) {
            return String.format(Locale.US, "%.0f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
        }
        return j + " B";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(w1 w1Var, kotlin.coroutines.jvm.internal.c cVar) {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i = t1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1Var.z = i - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(w1Var, cVar);
            }
        } else {
            t1Var = new t1(w1Var, cVar);
        }
        Object objFirst = t1Var.e;
        int i2 = t1Var.z;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = w1Var.d.P;
            t1Var.z = 1;
            objFirst = FlowKt.first(flow, t1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        return kotlin.collections.g0.g(kotlin.collections.p.e0(w1Var.c.F), (Set) objFirst);
    }

    public static final void i(w1 w1Var, List list) {
        MutableStateFlow mutableStateFlow = w1Var.l;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o0((String) it.next(), n0.e, 0));
        }
        mutableStateFlow.setValue(arrayList);
    }

    public static final Object j(w1 w1Var, g0 g0Var) {
        w1Var.g = kotlin.collections.w.e;
        int iK = kotlin.text.k.K(w1Var.s, '|', 0, 6);
        Integer numW = iK >= 0 ? kotlin.text.r.w(w1Var.s.substring(iK + 1)) : null;
        String string = kotlin.text.k.g0(kotlin.text.k.b0(w1Var.u, " - ")).toString();
        com.app.mlounge.data.repository.r rVar = w1Var.c;
        String str = w1Var.s;
        rVar.getClass();
        str.getClass();
        string.getClass();
        Object objL = w1Var.l(FlowKt.channelFlow(new androidx.compose.foundation.relocation.g(rVar, str, string, numW, null, 1)), g0Var);
        return objL == kotlin.coroutines.intrinsics.a.e ? objL : kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0160, code lost:
    
        if (r0.emit(r16, r8) == r9) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(com.app.mlounge.ui.viewmodel.w1 r26, com.app.mlounge.data.remote.model.ChqStream r27, com.app.mlounge.ui.viewmodel.l r28, kotlin.coroutines.jvm.internal.c r29) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.w1.k(com.app.mlounge.ui.viewmodel.w1, com.app.mlounge.data.remote.model.ChqStream, com.app.mlounge.ui.viewmodel.l, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final Object l(Flow flow, g0 g0Var) {
        Object objCollect = flow.collect(new androidx.compose.animation.a0(5, this, new ArrayList(), new LinkedHashSet()), g0Var);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
    }

    public final void m() {
        if (((Boolean) this.j.getValue()).booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new g0(this, null, 1), 3, null);
    }
}
