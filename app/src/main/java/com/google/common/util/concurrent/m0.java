package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static a a(ListenableFuture listenableFuture, Class cls, z zVar, Executor executor) {
        int i = c.I;
        a aVar = new a(listenableFuture, cls, zVar);
        listenableFuture.a(aVar, _COROUTINE.b.G(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            kotlinx.coroutines.future.a.u(_COROUTINE.b.B("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static o0 c(Exception exc) {
        o0 o0Var = new o0();
        o0Var.m(exc);
        return o0Var;
    }

    public static p0 d(Object obj) {
        return obj == null ? p0.y : new p0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        l0 l0Var = new l0();
        l0Var.E = listenableFuture;
        listenableFuture.a(l0Var, d0.e);
        return l0Var;
    }

    public static t f(ListenableFuture listenableFuture, com.google.common.base.d dVar, Executor executor) {
        int i = u.H;
        t tVar = new t(listenableFuture, dVar);
        listenableFuture.a(tVar, _COROUTINE.b.G(executor, tVar));
        return tVar;
    }

    public static s g(ListenableFuture listenableFuture, z zVar, Executor executor) {
        int i = u.H;
        executor.getClass();
        s sVar = new s(listenableFuture, zVar);
        listenableFuture.a(sVar, _COROUTINE.b.G(executor, sVar));
        return sVar;
    }
}
