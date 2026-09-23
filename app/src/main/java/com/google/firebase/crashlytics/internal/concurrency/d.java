package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import androidx.compose.foundation.s0;
import java.util.concurrent.ExecutorService;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final c d = new c();
    public final b a;
    public final b b;
    public final b c;

    public d(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.a = new b(executorService);
        this.b = new b(executorService);
        n.o(null);
        this.c = new b(executorService2);
    }

    public static final void a() {
        if (((Boolean) new s0(0, d, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 12).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new s0(0, d, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 13).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
