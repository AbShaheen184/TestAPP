package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ com.google.common.util.concurrent.x0 c;
    public final /* synthetic */ s5 d;
    public final /* synthetic */ Executor e;

    public ca(AtomicBoolean atomicBoolean, Context context, com.google.common.util.concurrent.x0 x0Var, s5 s5Var, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = x0Var;
        this.d = s5Var;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            com.google.common.util.concurrent.x0 x0Var = this.c;
            s5 s5Var = this.d;
            Executor executor = this.e;
            com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0();
            z0Var.F = new com.google.common.util.concurrent.y0(z0Var, s5Var);
            executor.execute(z0Var);
            x0Var.n(z0Var);
        }
    }
}
