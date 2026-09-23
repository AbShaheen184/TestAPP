package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ad implements Runnable {
    public final Object A;
    public final /* synthetic */ int e = 0;
    public final long y;
    public final Object z;

    public ad(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.a("firebase-iid-executor", 0));
        this.A = firebaseMessaging;
        this.y = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.z = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.A).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.A).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((vc) this.z).run();
                long j = this.y;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                com.google.common.util.concurrent.v0 v0Var = (com.google.common.util.concurrent.v0) this.A;
                v0Var.getClass();
                com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0(Executors.callable(this, null));
                com.google.common.util.concurrent.t0 t0Var = new com.google.common.util.concurrent.t0(z0Var, v0Var.y.schedule(z0Var, j, timeUnit));
                t0Var.a(new vc(t0Var, 1), com.google.common.util.concurrent.d0.e);
                return;
            case 1:
                com.google.android.gms.measurement.internal.d3 d3Var = (com.google.android.gms.measurement.internal.d3) this.A;
                d3Var.E((com.google.android.gms.measurement.internal.a3) this.z, false, this.y);
                d3Var.B = null;
                com.google.android.gms.measurement.internal.m3 m3VarP = ((com.google.android.gms.measurement.internal.p1) d3Var.e).p();
                m3VarP.v();
                m3VarP.w();
                m3VarP.J(new com.google.common.util.concurrent.k0(m3VarP, (com.google.android.gms.measurement.internal.a3) null));
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.z;
                com.google.firebase.messaging.n nVarX = com.google.firebase.messaging.n.x();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.A;
                if (nVarX.C(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!com.google.firebase.messaging.n.x().C(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!com.google.firebase.messaging.n.x().A(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.y);
                            }
                            if (!com.google.firebase.messaging.n.x().C(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            com.google.android.gms.common.api.internal.o oVar = new com.google.android.gms.common.api.internal.o();
                            oVar.c = this;
                            oVar.a();
                            if (!com.google.firebase.messaging.n.x().C(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!com.google.firebase.messaging.n.x().C(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (com.google.firebase.messaging.n.x().C(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public ad(com.google.android.gms.measurement.internal.d3 d3Var, com.google.android.gms.measurement.internal.a3 a3Var, long j) {
        this.z = a3Var;
        this.y = j;
        Objects.requireNonNull(d3Var);
        this.A = d3Var;
    }

    public ad(bd bdVar, vc vcVar, com.google.common.util.concurrent.v0 v0Var, long j) {
        this.z = vcVar;
        this.A = v0Var;
        this.y = j;
    }
}
