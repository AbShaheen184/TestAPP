package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends g0 implements RunnableFuture {
    public volatile r0 F;

    public z0(Callable callable) {
        this.F = new y0(this, callable);
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        r0 r0Var;
        if (p() && (r0Var = this.F) != null) {
            r0Var.c();
        }
        this.F = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        r0 r0Var = this.F;
        if (r0Var == null) {
            return super.j();
        }
        return "task=[" + r0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        r0 r0Var = this.F;
        if (r0Var != null) {
            r0Var.run();
        }
        this.F = null;
    }
}
