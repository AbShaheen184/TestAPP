package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.caverock.androidsvg.x1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final Context a;
    public final androidx.compose.runtime.snapshots.j b;
    public final x1 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final p h;
    public final androidx.collection.f e = new androidx.collection.f(0);
    public boolean g = false;

    public r(FirebaseMessaging firebaseMessaging, androidx.compose.runtime.snapshots.j jVar, p pVar, x1 x1Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = jVar;
        this.h = pVar;
        this.c = x1Var;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(com.google.android.gms.tasks.s sVar) throws IOException {
        try {
            org.jsoup.helper.n.g(sVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        x1 x1Var = this.c;
        a(x1Var.B(x1Var.m0(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        x1 x1Var = this.c;
        a(x1Var.B(x1Var.m0(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    public final boolean e() throws IOException {
        o oVarA;
        while (true) {
            synchronized (this) {
                try {
                    oVarA = this.h.a();
                    if (oVarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = oVarA.b;
                String str2 = oVarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + oVarA + ".");
                    }
                } else if (str.equals("S")) {
                    b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + oVarA + ".");
                }
                p pVar = this.h;
                synchronized (pVar) {
                    try {
                        androidx.compose.runtime.internal.c cVar = pVar.a;
                        String str3 = oVarA.c;
                        synchronized (((ArrayDeque) cVar.A)) {
                            try {
                                if (((ArrayDeque) cVar.A).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) cVar.B).execute(new androidx.work.p(cVar, 9));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = oVarA.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) arrayDeque.poll();
                            if (jVar != null) {
                                jVar.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j) {
        this.f.schedule(new t(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
