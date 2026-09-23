package com.google.android.gms.measurement.internal;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends h0 {
    public boolean A;
    public final androidx.media3.exoplayer.dash.manifest.t B;
    public final androidx.media3.exoplayer.source.r0 C;
    public final androidx.work.impl.k D;
    public com.google.android.gms.internal.base.g z;

    public u3(p1 p1Var) {
        super(p1Var);
        this.A = true;
        this.B = new androidx.media3.exoplayer.dash.manifest.t(this);
        androidx.media3.exoplayer.source.r0 r0Var = new androidx.media3.exoplayer.source.r0();
        r0Var.A = this;
        p1 p1Var2 = (p1) this.e;
        r0Var.z = new t3(r0Var, p1Var2, 0);
        p1Var2.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        r0Var.e = jElapsedRealtime;
        r0Var.y = jElapsedRealtime;
        this.C = r0Var;
        this.D = new androidx.work.impl.k(this);
    }

    @Override // com.google.android.gms.measurement.internal.h0
    public final boolean y() {
        return false;
    }

    public final void z() {
        v();
        if (this.z == null) {
            this.z = new com.google.android.gms.internal.base.g(Looper.getMainLooper(), 3);
        }
    }
}
