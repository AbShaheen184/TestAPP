package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ d0 z;

    public x(c0 c0Var, long j) {
        this.y = j;
        Objects.requireNonNull(c0Var);
        this.z = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((c0) this.z).B(this.y);
                break;
            default:
                d3 d3Var = (d3) this.z;
                c0 c0Var = ((p1) d3Var.e).K;
                p1.j(c0Var);
                c0Var.y(this.y);
                d3Var.B = null;
                break;
        }
    }

    public x(d3 d3Var, long j) {
        this.y = j;
        Objects.requireNonNull(d3Var);
        this.z = d3Var;
    }
}
