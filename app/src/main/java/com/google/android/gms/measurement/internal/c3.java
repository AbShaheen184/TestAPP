package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ d3 y;

    public c3(d3 d3Var, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(d3Var);
                this.y = d3Var;
                break;
            default:
                Objects.requireNonNull(d3Var);
                this.y = d3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                d3 d3Var = this.y;
                d3Var.B = d3Var.G;
                break;
            default:
                this.y.G = null;
                break;
        }
    }
}
