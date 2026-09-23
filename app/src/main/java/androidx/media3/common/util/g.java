package androidx.media3.common.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final d0 a;
    public boolean b;

    public g() {
        this(d0.a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            this.a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                a();
            } else {
                boolean z = false;
                while (!this.b && jElapsedRealtime < j2) {
                    try {
                        this.a.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    this.a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public g(d0 d0Var) {
        this.a = d0Var;
    }
}
