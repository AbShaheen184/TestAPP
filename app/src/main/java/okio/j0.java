package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public static final i0 d = new i0();
    public boolean a;
    public long b;
    public long c;

    public j0 a() {
        this.a = false;
        return this;
    }

    public j0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        kotlinx.coroutines.future.a.u("No deadline");
        return 0L;
    }

    public j0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        kotlinx.coroutines.future.a.s(androidx.compose.runtime.j.h("timeout < 0: ", j));
        return null;
    }

    public long h() {
        return this.c;
    }
}
