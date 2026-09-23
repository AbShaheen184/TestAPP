package androidx.media3.ui;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.measurement.internal.o2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c0(com.google.firebase.crashlytics.internal.common.q qVar, Throwable th) {
        this.e = 17;
        Map map = Collections.EMPTY_MAP;
        this.y = qVar;
        this.z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.inject.a aVar;
        switch (this.e) {
            case 0:
                h0.a((h0) this.y, (Bitmap) this.z);
                return;
            case 1:
                Runnable runnable = (Runnable) this.y;
                androidx.room.y yVar = (androidx.room.y) this.z;
                try {
                    runnable.run();
                    return;
                } finally {
                    yVar.a();
                }
            case 2:
                androidx.work.impl.d dVar = (androidx.work.impl.d) this.y;
                androidx.work.impl.model.j jVar = (androidx.work.impl.model.j) this.z;
                synchronized (dVar.k) {
                    try {
                        Iterator it = dVar.j.iterator();
                        while (it.hasNext()) {
                            ((androidx.work.impl.a) it.next()).b(jVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 3:
                ((androidx.work.impl.k) ((com.google.firebase.messaging.n) this.y).z).t((androidx.work.impl.j) this.z, 3);
                return;
            case 4:
                List<androidx.work.impl.constraints.controllers.a> list = (List) this.y;
                androidx.navigation.u uVar = (androidx.navigation.u) this.z;
                for (androidx.work.impl.constraints.controllers.a aVar2 : list) {
                    Object obj = uVar.e;
                    androidx.work.impl.constraints.controllers.b bVar = aVar2.a;
                    aVar2.b.getChannel().mo28trySendJP2dKIU(bVar.e(obj) ? new androidx.work.impl.constraints.b(bVar.d()) : androidx.work.impl.constraints.a.a);
                }
                return;
            case 5:
                androidx.work.impl.t tVar = (androidx.work.impl.t) this.y;
                String string = ((UUID) this.z).toString();
                string.getClass();
                androidx.work.impl.utils.g.a(tVar, string);
                return;
            case 6:
                ServerSocket serverSocket = (ServerSocket) this.y;
                com.app.mlounge.data.remote.ntv.d dVar2 = (com.app.mlounge.data.remote.ntv.d) this.z;
                while (!serverSocket.isClosed()) {
                    try {
                        dVar2.g.execute(new c0(7, dVar2, serverSocket.accept()));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 7:
                com.app.mlounge.data.remote.ntv.d dVar3 = (com.app.mlounge.data.remote.ntv.d) this.y;
                Socket socket = (Socket) this.z;
                try {
                    socket.getClass();
                    dVar3.b(socket);
                    return;
                } catch (Exception e) {
                    Context context = com.app.mlounge.util.a.a;
                    androidx.room.b0.h("handle error: ", e.getMessage(), "D", "LoopbackHlsProxy");
                    try {
                        socket.close();
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            case 8:
                Toast.makeText((Context) this.y, (String) this.z, 1).show();
                return;
            case 9:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.y;
                JobParameters jobParameters = (JobParameters) this.z;
                int i = JobInfoSchedulerService.e;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 10:
                ((com.google.common.util.concurrent.c0) this.y).t((ListenableFuture) this.z);
                return;
            case 11:
                ((com.google.common.util.concurrent.c0) this.y).q((com.google.common.collect.b0) this.z);
                return;
            case 12:
                com.google.firebase.components.p pVar = (com.google.firebase.components.p) this.y;
                com.google.firebase.inject.b bVar2 = (com.google.firebase.inject.b) this.z;
                if (pVar.b != com.google.firebase.components.p.d) {
                    kotlinx.coroutines.future.a.u("provide() can be called only once.");
                    return;
                }
                synchronized (pVar) {
                    aVar = pVar.a;
                    pVar.a = null;
                    pVar.b = bVar2;
                    break;
                }
                aVar.c(bVar2);
                return;
            case 13:
                com.google.firebase.components.o oVar = (com.google.firebase.components.o) this.y;
                com.google.firebase.inject.b bVar3 = (com.google.firebase.inject.b) this.z;
                synchronized (oVar) {
                    try {
                        if (oVar.b == null) {
                            oVar.a.add(bVar3);
                        } else {
                            oVar.b.add(bVar3.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 14:
                com.google.firebase.concurrent.a aVar3 = (com.google.firebase.concurrent.a) this.y;
                Runnable runnable2 = (Runnable) this.z;
                Process.setThreadPriority(aVar3.c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 15:
                Callable callable = (Callable) this.y;
                com.google.firebase.concurrent.g gVar = (com.google.firebase.concurrent.g) ((com.google.android.gms.tasks.q) this.z).e;
                try {
                    gVar.l(callable.call());
                    return;
                } catch (Exception e2) {
                    gVar.m(e2);
                    return;
                }
            case 16:
                ((com.google.firebase.crashlytics.internal.common.m) this.y).c((String) this.z, Boolean.FALSE);
                return;
            case 17:
                com.google.firebase.crashlytics.internal.common.q qVar = (com.google.firebase.crashlytics.internal.common.q) this.y;
                Throwable th3 = (Throwable) this.z;
                Map map = Collections.EMPTY_MAP;
                com.google.firebase.crashlytics.internal.common.m mVar = qVar.g;
                Thread threadCurrentThread = Thread.currentThread();
                mVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.google.firebase.crashlytics.internal.common.s sVar = mVar.n;
                if (sVar == null || !sVar.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = mVar.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    com.google.firebase.crashlytics.internal.metadata.c cVar = new com.google.firebase.crashlytics.internal.metadata.c(strE, j, map);
                    com.google.firebase.crashlytics.internal.persistence.c cVar2 = mVar.m;
                    cVar2.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    cVar2.h(th3, threadCurrentThread, "error", cVar, false);
                    return;
                }
                return;
            case 18:
                com.google.firebase.crashlytics.internal.send.b bVar4 = (com.google.firebase.crashlytics.internal.send.b) this.y;
                CountDownLatch countDownLatch = (CountDownLatch) this.z;
                try {
                    com.google.android.datatransport.runtime.s.a().d.c(((com.google.android.datatransport.runtime.k) bVar4.h.e).b(com.google.android.datatransport.d.z), 1);
                    break;
                } catch (Exception unused3) {
                }
                countDownLatch.countDown();
                return;
            case 19:
                ((o2) this.y).a((Intent) this.z);
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.y;
                com.google.android.gms.tasks.j jVar2 = (com.google.android.gms.tasks.j) this.z;
                try {
                    jVar2.b(firebaseMessaging.a());
                    return;
                } catch (Exception e3) {
                    jVar2.a(e3);
                    return;
                }
            case 21:
                com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.y;
                com.google.android.gms.tasks.j jVar3 = (com.google.android.gms.tasks.j) this.z;
                try {
                    jVar3.b(iVar.a());
                    return;
                } catch (Exception e4) {
                    jVar3.a(e4);
                    return;
                }
            default:
                HandlerContext.scheduleResumeAfterDelay$lambda$1((CancellableContinuation) this.y, (HandlerContext) this.z);
                return;
        }
    }

    public /* synthetic */ c0(com.google.common.util.concurrent.c0 c0Var, int i, ListenableFuture listenableFuture) {
        this.e = 10;
        this.y = c0Var;
        this.z = listenableFuture;
    }

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
