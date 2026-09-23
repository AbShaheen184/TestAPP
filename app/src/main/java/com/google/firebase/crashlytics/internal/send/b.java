package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.internal.c;
import androidx.media3.exoplayer.trackselection.e;
import com.google.android.datatransport.d;
import com.google.android.gms.tasks.j;
import com.google.android.material.internal.k;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final c h;
    public final k i;
    public int j;
    public long k;

    public b(c cVar, com.google.firebase.crashlytics.internal.settings.a aVar, k kVar) {
        double d = aVar.d;
        double d2 = aVar.e;
        long j = ((long) aVar.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = cVar;
        this.i = kVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(com.google.firebase.crashlytics.internal.common.b bVar, j jVar) {
        String str = "Sending report through Google DataTransport: " + bVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.E(new com.google.android.datatransport.a(bVar.a, d.z, null), new e(this, jVar, SystemClock.elapsedRealtime() - this.d < 2000, bVar));
    }
}
