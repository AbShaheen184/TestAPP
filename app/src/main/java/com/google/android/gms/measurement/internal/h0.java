package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends d0 {
    public boolean y;

    public h0(p1 p1Var) {
        super(p1Var);
        ((p1) this.e).X++;
    }

    public final void w() {
        if (this.y) {
            return;
        }
        kotlinx.coroutines.future.a.u("Not initialized");
    }

    public final void x() {
        if (this.y) {
            kotlinx.coroutines.future.a.u("Can't initialize twice");
        } else {
            if (y()) {
                return;
            }
            ((p1) this.e).Z.incrementAndGet();
            this.y = true;
        }
    }

    public abstract boolean y();
}
