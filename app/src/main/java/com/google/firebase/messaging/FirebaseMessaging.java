package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.exoplayer.source.a0;
import com.appsalt.internal.z;
import com.caverock.androidsvg.x1;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.measurement.internal.o2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static z j;
    public static com.google.firebase.inject.b k = new com.google.firebase.components.f(1);
    public static ScheduledThreadPoolExecutor l;
    public final com.google.firebase.g a;
    public final Context b;
    public final x1 c;
    public final f d;
    public final b1 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final androidx.compose.runtime.snapshots.j h;
    public boolean i;

    public FirebaseMessaging(com.google.firebase.g gVar, com.google.firebase.inject.b bVar, com.google.firebase.inject.b bVar2, com.google.firebase.installations.d dVar, com.google.firebase.inject.b bVar3, com.google.firebase.events.c cVar) {
        gVar.a();
        Context context = gVar.a;
        final androidx.compose.runtime.snapshots.j jVar = new androidx.compose.runtime.snapshots.j();
        jVar.b = 0;
        jVar.c = context;
        gVar.a();
        com.google.android.gms.cloudmessaging.b bVar4 = new com.google.android.gms.cloudmessaging.b(gVar.a);
        final x1 x1Var = new x1();
        x1Var.a = gVar;
        x1Var.b = jVar;
        x1Var.c = bVar4;
        x1Var.d = bVar;
        x1Var.e = bVar2;
        x1Var.f = dVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.a("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.a("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.a("Firebase-Messaging-File-Io", 0));
        this.i = false;
        k = bVar3;
        this.a = gVar;
        this.e = new b1(this, cVar);
        gVar.a();
        final Context context2 = gVar.a;
        this.b = context2;
        o2 o2Var = new o2();
        this.h = jVar;
        this.c = x1Var;
        this.d = new f(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(o2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        final int i = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g
            public final /* synthetic */ FirebaseMessaging y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.tasks.s sVarQ;
                int i2;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.y;
                        if (firebaseMessaging.e.k() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.y;
                        final Context context3 = firebaseMessaging2.b;
                        k.a(context3);
                        x1 x1Var2 = firebaseMessaging2.c;
                        final boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesE = u.e(context3);
                            if (!sharedPreferencesE.contains("proxy_retention") || sharedPreferencesE.getBoolean("proxy_retention", false) != zF) {
                                com.google.android.gms.cloudmessaging.b bVar5 = (com.google.android.gms.cloudmessaging.b) x1Var2.c;
                                if (bVar5.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(bVar5.b);
                                    synchronized (nVarP) {
                                        i2 = nVarP.e;
                                        nVarP.e = i2 + 1;
                                    }
                                    sVarQ = nVarP.q(new com.google.android.gms.cloudmessaging.m(i2, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    com.google.android.gms.tasks.s sVar = new com.google.android.gms.tasks.s();
                                    sVar.m(iOException);
                                    sVarQ = sVar;
                                }
                                sVarQ.c(new androidx.arch.core.executor.a(2), new com.google.android.gms.tasks.f() { // from class: com.google.firebase.messaging.l
                                    @Override // com.google.android.gms.tasks.f
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor editorEdit = u.e(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.a("Firebase-Messaging-Topics-Io", 0));
        org.jsoup.helper.n.h(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p pVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                androidx.compose.runtime.snapshots.j jVar2 = jVar;
                x1 x1Var2 = x1Var;
                synchronized (p.class) {
                    try {
                        WeakReference weakReference = p.b;
                        pVar = weakReference != null ? (p) weakReference.get() : null;
                        if (pVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            p pVar2 = new p();
                            synchronized (pVar2) {
                                pVar2.a = androidx.compose.runtime.internal.c.q(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            p.b = new WeakReference(pVar2);
                            pVar = pVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new r(firebaseMessaging, jVar2, pVar, x1Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new h(this, 0));
        final int i2 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g
            public final /* synthetic */ FirebaseMessaging y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.tasks.s sVarQ;
                int i3;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.y;
                        if (firebaseMessaging.e.k() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.y;
                        final Context context3 = firebaseMessaging2.b;
                        k.a(context3);
                        x1 x1Var2 = firebaseMessaging2.c;
                        final boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesE = u.e(context3);
                            if (!sharedPreferencesE.contains("proxy_retention") || sharedPreferencesE.getBoolean("proxy_retention", false) != zF) {
                                com.google.android.gms.cloudmessaging.b bVar5 = (com.google.android.gms.cloudmessaging.b) x1Var2.c;
                                if (bVar5.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(bVar5.b);
                                    synchronized (nVarP) {
                                        i3 = nVarP.e;
                                        nVarP.e = i3 + 1;
                                    }
                                    sVarQ = nVarP.q(new com.google.android.gms.cloudmessaging.m(i3, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    com.google.android.gms.tasks.s sVar = new com.google.android.gms.tasks.s();
                                    sVar.m(iOException);
                                    sVarQ = sVar;
                                }
                                sVarQ.c(new androidx.arch.core.executor.a(2), new com.google.android.gms.tasks.f() { // from class: com.google.firebase.messaging.l
                                    @Override // com.google.android.gms.tasks.f
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor editorEdit = u.e(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j2, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.a("TAG", 0));
                }
                l.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized z c(Context context) {
        try {
            if (j == null) {
                j = new z(context, 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(com.google.firebase.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        com.google.android.gms.common.internal.x.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        com.google.android.gms.tasks.i iVarD;
        androidx.compose.ui.input.pointer.util.b bVarD = d();
        if (!h(bVarD)) {
            return (String) bVarD.b;
        }
        String strC = androidx.compose.runtime.snapshots.j.c(this.a);
        f fVar = this.d;
        synchronized (fVar) {
            iVarD = (com.google.android.gms.tasks.i) ((androidx.collection.f) fVar.b).get(strC);
            if (iVarD == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                x1 x1Var = this.c;
                iVarD = x1Var.B(x1Var.m0(androidx.compose.runtime.snapshots.j.c((com.google.firebase.g) x1Var.a), "*", new Bundle())).i(this.g, new a0(9, this, strC, bVarD)).d((Executor) fVar.a, new androidx.media3.exoplayer.analytics.c(11, fVar, strC));
                ((androidx.collection.f) fVar.b).put(strC, iVarD);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) org.jsoup.helper.n.f(iVarD);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final androidx.compose.ui.input.pointer.util.b d() {
        androidx.compose.ui.input.pointer.util.b bVarC;
        z zVarC = c(this.b);
        com.google.firebase.g gVar = this.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String strC = androidx.compose.runtime.snapshots.j.c(this.a);
        synchronized (zVarC) {
            bVarC = androidx.compose.ui.input.pointer.util.b.c(zVarC.a.getString(strD + "|T|" + strC + "|*", null));
        }
        return bVarC;
    }

    public final void e() {
        com.google.android.gms.tasks.s sVarJ;
        int i;
        com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.c.c;
        if (bVar.c.w() >= 241100000) {
            com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(bVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (nVarP) {
                i = nVarP.e;
                nVarP.e = i + 1;
            }
            sVarJ = nVarP.q(new com.google.android.gms.cloudmessaging.m(i, 5, bundle, 1)).j(com.google.android.gms.cloudmessaging.h.z, com.google.android.gms.cloudmessaging.d.z);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            com.google.android.gms.tasks.s sVar = new com.google.android.gms.tasks.s();
            sVar.m(iOException);
            sVarJ = sVar;
        }
        sVarJ.c(this.f, new h(this, 1));
    }

    public final boolean f() {
        Context context = this.b;
        k.a(context);
        if (!k.b(context)) {
            return false;
        }
        if (this.a.b(com.google.firebase.analytics.connector.a.class) != null) {
            return true;
        }
        return u.d() && k != null;
    }

    public final synchronized void g(long j2) {
        b(j2, new ad(this, Math.min(Math.max(30L, 2 * j2), 28800L)));
        this.i = true;
    }

    public final boolean h(androidx.compose.ui.input.pointer.util.b bVar) {
        if (bVar != null) {
            return System.currentTimeMillis() > bVar.a + 604800000 || !this.h.b().equals((String) bVar.c);
        }
        return true;
    }
}
