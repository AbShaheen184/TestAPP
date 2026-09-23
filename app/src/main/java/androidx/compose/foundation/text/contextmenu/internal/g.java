package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import android.view.ActionMode;
import android.view.SurfaceView;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.r0;
import androidx.media3.ui.g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.f0;
import androidx.work.impl.h0;
import androidx.work.impl.z;
import androidx.work.y;
import com.caverock.androidsvg.x1;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    private final void a() {
        boolean z;
        androidx.work.impl.k kVar = (androidx.work.impl.k) this.y;
        androidx.work.impl.j jVar = (androidx.work.impl.j) this.z;
        c2 c2Var = (c2) this.A;
        androidx.work.impl.d dVar = (androidx.work.impl.d) kVar.y;
        dVar.getClass();
        androidx.work.impl.model.j jVar2 = jVar.a;
        String str = jVar2.a;
        ArrayList arrayList = new ArrayList();
        androidx.work.impl.model.p pVar = (androidx.work.impl.model.p) dVar.e.o(new androidx.navigation.internal.h(new androidx.work.impl.c(0, dVar, arrayList, str), 2));
        if (pVar == null) {
            y.e().h(androidx.work.impl.d.l, "Didn't find WorkSpec for id " + jVar2);
            dVar.e(jVar2);
            return;
        }
        synchronized (dVar.k) {
            try {
                synchronized (dVar.k) {
                    z = dVar.c(str) != null;
                }
                if (z) {
                    Set set = (Set) dVar.h.get(str);
                    if (((androidx.work.impl.j) set.iterator().next()).a.b == jVar2.b) {
                        set.add(jVar);
                        y.e().a(androidx.work.impl.d.l, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        dVar.e(jVar2);
                    }
                    return;
                }
                if (pVar.t != jVar2.b) {
                    dVar.e(jVar2);
                    return;
                }
                z zVar = new z(dVar.b, dVar.c, dVar.d, dVar, dVar.e, pVar, arrayList);
                if (c2Var != null) {
                    zVar.h = c2Var;
                }
                h0 h0Var = new h0(zVar);
                androidx.concurrent.futures.l lVarA = androidx.work.s.a(h0Var.e.b.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), new f0(h0Var, null, 1));
                lVarA.y.a(new g(5, dVar, lVarA, h0Var), dVar.d.d);
                dVar.g.put(str, h0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                dVar.h.put(str, hashSet);
                y.e().a(androidx.work.impl.d.l, androidx.work.impl.d.class.getSimpleName() + ": processing " + jVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                i iVar = (i) this.y;
                e eVar = (e) this.z;
                f fVar = (f) this.A;
                ActionMode actionModeStartActionMode = iVar.a.startActionMode(new o(eVar), 1);
                kotlin.jvm.internal.l.a(iVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    fVar.close();
                    return;
                }
                return;
            case 1:
                androidx.emoji2.text.m mVar = (androidx.emoji2.text.m) this.y;
                com.google.firebase.b bVar = (com.google.firebase.b) this.z;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A;
                try {
                    androidx.emoji2.text.u uVarN = com.google.android.gms.dynamite.g.n(mVar.a);
                    if (uVarN == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) ((androidx.emoji2.text.i) uVarN.b);
                    synchronized (tVar.d) {
                        tVar.f = threadPoolExecutor;
                        break;
                    }
                    ((androidx.emoji2.text.i) uVarN.b).a(new androidx.emoji2.text.l(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bVar.Q(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                r0 r0Var = (r0) this.y;
                d0 d0Var = (d0) this.z;
                androidx.media3.exoplayer.source.v vVar = (androidx.media3.exoplayer.source.v) this.A;
                androidx.media3.exoplayer.analytics.g gVar = r0Var.c;
                a1 a1VarG = d0Var.g();
                x1 x1Var = gVar.A;
                q0 q0Var = gVar.D;
                q0Var.getClass();
                x1Var.getClass();
                x1Var.b = com.google.common.collect.h0.o(a1VarG);
                if (!a1VarG.isEmpty()) {
                    x1Var.e = (androidx.media3.exoplayer.source.v) a1VarG.get(0);
                    vVar.getClass();
                    x1Var.f = vVar;
                }
                if (((androidx.media3.exoplayer.source.v) x1Var.d) == null) {
                    x1Var.d = x1.F(q0Var, (com.google.common.collect.h0) x1Var.b, (androidx.media3.exoplayer.source.v) x1Var.e, (t0) x1Var.a);
                }
                x1Var.r0(((c0) q0Var).l());
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.y;
                Handler handler = (Handler) this.z;
                androidx.media3.common.util.o oVar = (androidx.media3.common.util.o) this.A;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.activity.l(oVar, 18));
                    }
                    synchronized (androidx.media3.exoplayer.audio.d0.s) {
                        try {
                            int i = androidx.media3.exoplayer.audio.d0.u - 1;
                            androidx.media3.exoplayer.audio.d0.u = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = androidx.media3.exoplayer.audio.d0.t;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                androidx.media3.exoplayer.audio.d0.t = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new androidx.activity.l(oVar, 18));
                    }
                    synchronized (androidx.media3.exoplayer.audio.d0.s) {
                        try {
                            int i2 = androidx.media3.exoplayer.audio.d0.u - 1;
                            androidx.media3.exoplayer.audio.d0.u = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = androidx.media3.exoplayer.audio.d0.t;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                androidx.media3.exoplayer.audio.d0.t = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 4:
                g0.a((g0) this.y, (SurfaceView) this.z, (androidx.activity.l) this.A);
                return;
            case 5:
                androidx.work.impl.d dVar = (androidx.work.impl.d) this.y;
                androidx.concurrent.futures.l lVar = (androidx.concurrent.futures.l) this.z;
                h0 h0Var = (h0) this.A;
                dVar.getClass();
                try {
                    zBooleanValue = ((Boolean) lVar.y.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (dVar.k) {
                    try {
                        androidx.work.impl.model.j jVarQ = coil3.svg.internal.a.q(h0Var.a);
                        String str = jVarQ.a;
                        if (dVar.c(str) == h0Var) {
                            dVar.b(str);
                        }
                        y.e().a(androidx.work.impl.d.l, androidx.work.impl.d.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = dVar.j.iterator();
                        while (it.hasNext()) {
                            ((androidx.work.impl.a) it.next()).b(jVarQ, zBooleanValue);
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                WorkDatabase workDatabase = (WorkDatabase) this.y;
                String str2 = (String) this.z;
                androidx.work.impl.t tVar2 = (androidx.work.impl.t) this.A;
                androidx.work.impl.model.t tVarW = workDatabase.w();
                tVarW.getClass();
                str2.getClass();
                Iterator it2 = ((List) okhttp3.internal.platform.android.g.t(tVarW.a, true, false, new androidx.compose.material3.r(str2, 14))).iterator();
                while (it2.hasNext()) {
                    androidx.work.impl.utils.g.a(tVar2, (String) it2.next());
                }
                return;
            case 8:
                com.google.firebase.crashlytics.internal.common.q qVar = (com.google.firebase.crashlytics.internal.common.q) this.y;
                String str3 = (String) this.z;
                String str4 = (String) this.A;
                com.google.firebase.crashlytics.internal.common.m mVar2 = qVar.g;
                mVar2.getClass();
                try {
                    ((b1) mVar2.d.d).p(str3, str4);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = mVar2.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 9:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.y;
                Intent intent = (Intent) this.z;
                com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.A;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    jVar.b(null);
                }
            case 10:
                com.google.android.material.internal.k kVar = (com.google.android.material.internal.k) this.y;
                retrofit2.g gVar2 = (retrofit2.g) this.z;
                retrofit2.r0 r0Var2 = (retrofit2.r0) this.A;
                retrofit2.n nVar = (retrofit2.n) kVar.z;
                if (nVar.y.A()) {
                    gVar2.e(nVar, new IOException("Canceled"));
                    return;
                } else {
                    gVar2.i(nVar, r0Var2);
                    return;
                }
            default:
                ((retrofit2.g) this.z).e((retrofit2.n) ((com.google.android.material.internal.k) this.y).z, (Throwable) this.A);
                return;
        }
    }
}
