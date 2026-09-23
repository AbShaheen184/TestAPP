package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.util.Log;
import com.appsalt.internal.k0;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final Context a;
    public final com.google.android.gms.common.api.internal.m b;
    public final com.google.android.material.internal.k c;
    public final long d;
    public com.google.android.material.internal.k e;
    public com.google.android.material.internal.k f;
    public m g;
    public final v h;
    public final com.google.firebase.crashlytics.internal.persistence.c i;
    public final com.google.firebase.crashlytics.a j;
    public final com.google.firebase.crashlytics.a k;
    public final j l;
    public final com.google.firebase.crashlytics.internal.a m;
    public final com.google.android.material.behavior.d n;
    public final com.google.firebase.crashlytics.internal.concurrency.d o;

    public q(com.google.firebase.g gVar, v vVar, com.google.firebase.crashlytics.internal.a aVar, com.google.android.gms.common.api.internal.m mVar, com.google.firebase.crashlytics.a aVar2, com.google.firebase.crashlytics.a aVar3, com.google.firebase.crashlytics.internal.persistence.c cVar, j jVar, com.google.android.material.behavior.d dVar, com.google.firebase.crashlytics.internal.concurrency.d dVar2) {
        this.b = mVar;
        gVar.a();
        this.a = gVar.a;
        this.h = vVar;
        this.m = aVar;
        this.j = aVar2;
        this.k = aVar3;
        this.i = cVar;
        this.l = jVar;
        this.n = dVar;
        this.o = dVar2;
        this.d = System.currentTimeMillis();
        this.c = new com.google.android.material.internal.k(9);
    }

    public final void a(k0 k0Var) {
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        this.e.p();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.d(new p(this));
                this.g.g();
                if (!k0Var.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(k0Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((com.google.android.gms.tasks.j) ((AtomicReference) k0Var.i).get()).a);
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(k0 k0Var) {
        Future<?> futureSubmit = this.o.a.e.submit(new n(this, k0Var, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        try {
            com.google.android.material.internal.k kVar = this.e;
            com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) kVar.z;
            String str = (String) kVar.y;
            cVar.getClass();
            if (new File((File) cVar.c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
