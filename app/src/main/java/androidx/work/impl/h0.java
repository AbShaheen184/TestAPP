package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.widget.c2;
import androidx.compose.material3.internal.r0;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final androidx.work.impl.model.p a;
    public final Context b;
    public final String c;
    public final c2 d;
    public final androidx.work.impl.utils.taskexecutor.c e;
    public final androidx.work.b f;
    public final androidx.work.a0 g;
    public final d h;
    public final WorkDatabase i;
    public final androidx.work.impl.model.t j;
    public final androidx.work.impl.model.c k;
    public final ArrayList l;
    public final String m;
    public final CompletableJob n;

    public h0(z zVar) {
        androidx.work.impl.model.p pVar = (androidx.work.impl.model.p) zVar.e;
        this.a = pVar;
        this.b = (Context) zVar.g;
        String str = pVar.a;
        this.c = str;
        this.d = (c2) zVar.h;
        this.e = (androidx.work.impl.utils.taskexecutor.c) zVar.b;
        androidx.work.b bVar = (androidx.work.b) zVar.a;
        this.f = bVar;
        this.g = bVar.d;
        this.h = (d) zVar.c;
        WorkDatabase workDatabase = (WorkDatabase) zVar.d;
        this.i = workDatabase;
        this.j = workDatabase.w();
        this.k = workDatabase.r();
        ArrayList arrayList = (ArrayList) zVar.f;
        this.l = arrayList;
        this.m = androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.x("Work [ id=", str, ", tags={ "), kotlin.collections.p.I(arrayList, ",", null, null, null, 62), " } ]");
        this.n = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:93:0x028f  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static final Object a(final h0 h0Var, kotlin.coroutines.jvm.internal.c cVar) {
        g0 g0Var;
        boolean z;
        String str;
        String str2;
        OverwritingInputMerger overwritingInputMerger;
        androidx.work.i iVar;
        Object b0Var;
        Throwable th;
        String str3;
        CancellationException e;
        String str4;
        androidx.work.y yVarE;
        String strC;
        String str5 = h0Var.m;
        String str6 = h0Var.c;
        androidx.work.impl.utils.taskexecutor.c cVar2 = h0Var.e;
        WorkDatabase workDatabase = h0Var.i;
        androidx.work.b bVar = h0Var.f;
        androidx.work.a0 a0Var = bVar.m;
        androidx.work.impl.model.p pVar = h0Var.a;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i = g0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0Var.z = i - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(h0Var, cVar);
            }
        } else {
            g0Var = new g0(h0Var, cVar);
        }
        Object objWithContext = g0Var.e;
        int i2 = g0Var.z;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            androidx.work.k kVar = bVar.e;
            a0Var.getClass();
            boolean zW = kotlin.math.a.w();
            String str7 = pVar.x;
            String str8 = pVar.c;
            String str9 = pVar.d;
            if (!zW || str7 == null) {
                z = zW;
                str = str5;
                str2 = str7;
            } else {
                int iHashCode = pVar.hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    androidx.tracing.a.a(iHashCode, kotlin.math.a.S(str7));
                    z = zW;
                    str = str5;
                    str2 = str7;
                } else {
                    String strS = kotlin.math.a.S(str7);
                    try {
                        if (kotlin.math.a.G == null) {
                            z = zW;
                            try {
                                str2 = str7;
                                str = str5;
                                try {
                                    kotlin.math.a.G = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                } catch (Exception e2) {
                                    e = e2;
                                    kotlin.math.a.u(e, "asyncTraceBegin");
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str = str5;
                                str2 = str7;
                                kotlin.math.a.u(e, "asyncTraceBegin");
                            }
                        } else {
                            z = zW;
                            str = str5;
                            str2 = str7;
                        }
                        kotlin.math.a.G.invoke(null, Long.valueOf(kotlin.math.a.E), strS, Integer.valueOf(iHashCode));
                    } catch (Exception e4) {
                        e = e4;
                        z = zW;
                    }
                }
            }
            final int i3 = 0;
            if (((Boolean) workDatabase.o(new androidx.navigation.internal.h(new Callable(h0Var) { // from class: androidx.work.impl.y
                public final /* synthetic */ h0 b;

                {
                    this.b = h0Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i3) {
                        case 0:
                            h0 h0Var2 = this.b;
                            androidx.work.impl.model.p pVar2 = h0Var2.a;
                            androidx.work.i0 i0Var = pVar2.b;
                            String str10 = pVar2.c;
                            androidx.work.i0 i0Var2 = androidx.work.i0.e;
                            if (i0Var != i0Var2) {
                                String str11 = i0.a;
                                androidx.work.y.e().a(str11, str10 + " is not in ENQUEUED state. Nothing more to do");
                                return Boolean.TRUE;
                            }
                            if (pVar2.c() || (pVar2.b == i0Var2 && pVar2.k > 0)) {
                                h0Var2.g.getClass();
                                if (System.currentTimeMillis() < pVar2.a()) {
                                    androidx.work.y.e().a(i0.a, "Delaying execution for " + str10 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        default:
                            h0 h0Var3 = this.b;
                            androidx.work.impl.model.t tVar = h0Var3.j;
                            String str12 = h0Var3.c;
                            boolean z2 = false;
                            if (tVar.b(str12) == androidx.work.i0.e) {
                                tVar.h(androidx.work.i0.y, str12);
                                ((Number) okhttp3.internal.platform.android.g.t(tVar.a, false, true, new androidx.compose.material3.r(str12, 19))).intValue();
                                tVar.i(-256, str12);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }, 2))).booleanValue()) {
                return new c0();
            }
            if (pVar.c()) {
                iVar = pVar.e;
            } else {
                bVar.f.getClass();
                str9.getClass();
                String str10 = androidx.work.o.a;
                try {
                    try {
                        Object objNewInstance = Class.forName(str9).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                    } catch (Exception e5) {
                        e = e5;
                        androidx.work.y.e().d(androidx.work.o.a, "Trouble instantiating ".concat(str9), e);
                        overwritingInputMerger = null;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
                if (overwritingInputMerger == null) {
                    androidx.work.y.e().c(i0.a, "Could not create Input Merger ".concat(str9));
                    return new a0();
                }
                List listJ = kotlin.collections.q.j(pVar.e);
                androidx.work.impl.model.t tVar = h0Var.j;
                tVar.getClass();
                str6.getClass();
                ArrayList arrayListO = kotlin.collections.p.O(listJ, (List) okhttp3.internal.platform.android.g.t(tVar.a, true, false, new androidx.compose.material3.r(str6, 18)));
                androidx.work.h hVar = new androidx.work.h(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayListO.iterator();
                while (it.hasNext()) {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(((androidx.work.i) it.next()).a);
                    mapUnmodifiableMap.getClass();
                    linkedHashMap.putAll(mapUnmodifiableMap);
                }
                hVar.a(linkedHashMap);
                iVar = new androidx.work.i(hVar.a);
                android.support.v4.media.session.b.G(iVar);
            }
            UUID uuidFromString = UUID.fromString(str6);
            ArrayList arrayList = h0Var.l;
            c2 c2Var = h0Var.d;
            int i4 = pVar.k;
            ExecutorService executorService = bVar.a;
            CoroutineDispatcher coroutineDispatcher = bVar.b;
            androidx.work.impl.utils.o oVar = new androidx.work.impl.utils.o(workDatabase, cVar2);
            g0 g0Var2 = g0Var;
            androidx.work.impl.utils.n nVar = new androidx.work.impl.utils.n(workDatabase, h0Var.h, cVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.a = uuidFromString;
            workerParameters.b = iVar;
            workerParameters.c = new HashSet(arrayList);
            workerParameters.d = c2Var;
            workerParameters.e = i4;
            workerParameters.f = executorService;
            workerParameters.g = coroutineDispatcher;
            workerParameters.h = cVar2;
            workerParameters.i = kVar;
            workerParameters.j = oVar;
            workerParameters.k = nVar;
            try {
                androidx.work.x xVarA = kVar.a(h0Var.b, str8, workerParameters);
                xVarA.setUsed();
                kotlin.coroutines.h hVar2 = g0Var2.getContext().get(Job.Key);
                hVar2.getClass();
                Job job = (Job) hVar2;
                job.invokeOnCompletion(new androidx.compose.foundation.text.selection.a(1, xVarA, str2, h0Var, z));
                final int i5 = 1;
                Object objO = workDatabase.o(new androidx.navigation.internal.h(new Callable(h0Var) { // from class: androidx.work.impl.y
                    public final /* synthetic */ h0 b;

                    {
                        this.b = h0Var;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i5) {
                            case 0:
                                h0 h0Var2 = this.b;
                                androidx.work.impl.model.p pVar2 = h0Var2.a;
                                androidx.work.i0 i0Var = pVar2.b;
                                String str11 = pVar2.c;
                                androidx.work.i0 i0Var2 = androidx.work.i0.e;
                                if (i0Var != i0Var2) {
                                    String str12 = i0.a;
                                    androidx.work.y.e().a(str12, str11 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (pVar2.c() || (pVar2.b == i0Var2 && pVar2.k > 0)) {
                                    h0Var2.g.getClass();
                                    if (System.currentTimeMillis() < pVar2.a()) {
                                        androidx.work.y.e().a(i0.a, "Delaying execution for " + str11 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                h0 h0Var3 = this.b;
                                androidx.work.impl.model.t tVar2 = h0Var3.j;
                                String str13 = h0Var3.c;
                                boolean z2 = false;
                                if (tVar2.b(str13) == androidx.work.i0.e) {
                                    tVar2.h(androidx.work.i0.y, str13);
                                    ((Number) okhttp3.internal.platform.android.g.t(tVar2.a, false, true, new androidx.compose.material3.r(str13, 19))).intValue();
                                    tVar2.i(-256, str13);
                                    z2 = true;
                                }
                                return Boolean.valueOf(z2);
                        }
                    }
                }, 2));
                objO.getClass();
                if (!((Boolean) objO).booleanValue()) {
                    return new c0();
                }
                if (job.isCancelled()) {
                    return new c0();
                }
                androidx.work.impl.utils.taskexecutor.b bVar2 = cVar2.d;
                bVar2.getClass();
                CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(bVar2);
                try {
                    androidx.room.coroutines.c0 c0Var = new androidx.room.coroutines.c0(h0Var, xVarA, nVar, (kotlin.coroutines.d) null, 2);
                    g0Var2.z = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, c0Var, g0Var2);
                    b0Var = kotlin.coroutines.intrinsics.a.e;
                    if (objWithContext != b0Var) {
                    }
                    return b0Var;
                } catch (CancellationException e7) {
                    e = e7;
                    str3 = str;
                    str4 = i0.a;
                    yVarE = androidx.work.y.e();
                    strC = androidx.constraintlayout.core.g.c(str3, " was cancelled");
                    if (yVarE.a <= 4) {
                        Log.i(str4, strC, e);
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    String str11 = i0.a;
                    androidx.work.y.e().d(str11, str + " failed because it threw an exception/error", th);
                    return new a0();
                }
            } catch (Throwable unused) {
                String str12 = i0.a;
                androidx.work.y.e().c(str12, "Could not create Worker " + str8);
                return new a0();
            }
        }
        if (i2 != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            kotlin.a.e(objWithContext);
            str = str5;
        } catch (CancellationException e8) {
            e = e8;
            str3 = str5;
            str4 = i0.a;
            yVarE = androidx.work.y.e();
            strC = androidx.constraintlayout.core.g.c(str3, " was cancelled");
            if (yVarE.a <= 4) {
                Log.i(str4, strC, e);
            }
            throw e;
        } catch (Throwable th3) {
            th = th3;
            str = str5;
            String str13 = i0.a;
            androidx.work.y.e().d(str13, str + " failed because it threw an exception/error", th);
            return new a0();
        }
        androidx.work.w wVar = (androidx.work.w) objWithContext;
        wVar.getClass();
        b0Var = new b0(wVar);
        return b0Var;
    }

    public final void b(int i) {
        androidx.work.impl.model.t tVar = this.j;
        androidx.work.i0 i0Var = androidx.work.i0.e;
        String str = this.c;
        tVar.h(i0Var, str);
        this.g.getClass();
        tVar.g(str, System.currentTimeMillis());
        tVar.f(this.a.v, str);
        tVar.e(str, -1L);
        tVar.i(i, str);
    }

    public final void c() {
        this.g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        androidx.work.impl.model.t tVar = this.j;
        String str = this.c;
        tVar.g(str, jCurrentTimeMillis);
        tVar.h(androidx.work.i0.e, str);
        androidx.room.r rVar = tVar.a;
        ((Number) okhttp3.internal.platform.android.g.t(rVar, false, true, new androidx.compose.material3.r(str, 16))).intValue();
        tVar.f(this.a.v, str);
        okhttp3.internal.platform.android.g.t(rVar, false, true, new androidx.compose.material3.r(str, 17));
        tVar.e(str, -1L);
    }

    public final void d(androidx.work.w wVar) {
        wVar.getClass();
        String str = this.c;
        ArrayList arrayListL = kotlin.collections.q.l(str);
        while (true) {
            boolean zIsEmpty = arrayListL.isEmpty();
            androidx.work.impl.model.t tVar = this.j;
            if (zIsEmpty) {
                androidx.work.i iVar = ((androidx.work.t) wVar).a;
                iVar.getClass();
                tVar.f(this.a.v, str);
                okhttp3.internal.platform.android.g.t(tVar.a, false, true, new r0(16, iVar, str));
                return;
            }
            String str2 = (String) kotlin.collections.p.S(arrayListL);
            if (tVar.b(str2) != androidx.work.i0.C) {
                tVar.h(androidx.work.i0.A, str2);
            }
            arrayListL.addAll(this.k.a(str2));
        }
    }
}
