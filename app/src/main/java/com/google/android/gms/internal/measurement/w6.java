package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w6 implements Runnable {
    public final /* synthetic */ a7 A;
    public final long e;
    public final long y;
    public final boolean z;

    public w6(a7 a7Var, boolean z) {
        Objects.requireNonNull(a7Var);
        this.A = a7Var;
        this.e = System.currentTimeMillis();
        this.y = SystemClock.elapsedRealtime();
        this.z = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        a7 a7Var = this.A;
        if (a7Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            a7Var.b(e, false, this.z);
            b();
        }
    }

    public void b() {
    }
}
