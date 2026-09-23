package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e4 extends a4 {
    public boolean z;

    public e4(j4 j4Var) {
        super(j4Var);
        this.y.O++;
    }

    public final void w() {
        if (this.z) {
            return;
        }
        kotlinx.coroutines.future.a.u("Not initialized");
    }

    public final void x() {
        if (this.z) {
            kotlinx.coroutines.future.a.u("Can't initialize twice");
            return;
        }
        y();
        this.y.P++;
        this.z = true;
    }

    public abstract void y();
}
