package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j0 {
    public j0 e;

    public o(j0 j0Var) {
        j0Var.getClass();
        this.e = j0Var;
    }

    @Override // okio.j0
    public final j0 a() {
        return this.e.a();
    }

    @Override // okio.j0
    public final j0 b() {
        return this.e.b();
    }

    @Override // okio.j0
    public final long c() {
        return this.e.c();
    }

    @Override // okio.j0
    public final j0 d(long j) {
        return this.e.d(j);
    }

    @Override // okio.j0
    public final boolean e() {
        return this.e.e();
    }

    @Override // okio.j0
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // okio.j0
    public final j0 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }

    @Override // okio.j0
    public final long h() {
        return this.e.h();
    }
}
