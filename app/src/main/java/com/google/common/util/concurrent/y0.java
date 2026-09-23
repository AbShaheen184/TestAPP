package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends r0 {
    public final /* synthetic */ z0 A;
    public final Object B;
    public final /* synthetic */ int z = 0;

    public y0(z0 z0Var, Callable callable) {
        this.A = z0Var;
        callable.getClass();
        this.B = callable;
    }

    @Override // com.google.common.util.concurrent.r0
    public final void a(Throwable th) {
        switch (this.z) {
            case 0:
                this.A.m(th);
                break;
            default:
                this.A.m(th);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.r0
    public final void b(Object obj) {
        switch (this.z) {
            case 0:
                this.A.n((ListenableFuture) obj);
                break;
            default:
                this.A.l(obj);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.r0
    public final boolean d() {
        switch (this.z) {
            case 0:
                break;
        }
        return this.A.isDone();
    }

    @Override // com.google.common.util.concurrent.r0
    public final Object e() {
        switch (this.z) {
            case 0:
                y yVar = (y) this.B;
                ListenableFuture listenableFutureCall = yVar.call();
                _COROUTINE.a.u(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", yVar);
                return listenableFutureCall;
            default:
                return ((Callable) this.B).call();
        }
    }

    @Override // com.google.common.util.concurrent.r0
    public final String f() {
        switch (this.z) {
            case 0:
                return ((y) this.B).toString();
            default:
                return ((Callable) this.B).toString();
        }
    }

    public y0(z0 z0Var, y yVar) {
        this.A = z0Var;
        this.B = yVar;
    }
}
