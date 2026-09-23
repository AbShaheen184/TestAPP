package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class jf implements Runnable, Closeable {
    public boolean A;
    public final boolean B;
    public qf e;
    public final boolean y = ka.f(Thread.currentThread());
    public boolean z;

    public jf(qf qfVar, boolean z) {
        this.B = false;
        this.e = qfVar;
        this.B = z;
    }

    public final void a(com.google.common.util.concurrent.r rVar) {
        if (this.z) {
            kotlinx.coroutines.future.a.u("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.A) {
            kotlinx.coroutines.future.a.u("Signal is already attached to future");
        } else {
            this.A = true;
            rVar.a(this, com.google.common.util.concurrent.d0.e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qf qfVar = this.e;
        try {
            this.e = null;
            boolean z = this.A;
            if (!z) {
                if (this.z) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.z = true;
                if (this.y && !z) {
                    ka.f(Thread.currentThread());
                }
            }
            if (qfVar != null) {
                ((we) qfVar).close();
            }
            if (this.B) {
                bf.b(bf.c(), hf.D);
            }
        } catch (Throwable th) {
            if (qfVar != null) {
                try {
                    ((we) qfVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.z || !(z = this.A)) {
            ka.g().post(wc.z);
            return;
        }
        this.z = true;
        if (!this.y || z) {
            return;
        }
        ka.f(Thread.currentThread());
    }
}
