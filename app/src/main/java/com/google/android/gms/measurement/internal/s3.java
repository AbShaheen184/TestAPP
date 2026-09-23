package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 implements Runnable {
    public final long e;
    public final long y;
    public final /* synthetic */ androidx.work.impl.k z;

    public s3(androidx.work.impl.k kVar, long j, long j2) {
        Objects.requireNonNull(kVar);
        this.z = kVar;
        this.e = j;
        this.y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = ((p1) ((u3) this.z.z).e).D;
        p1.m(m1Var);
        m1Var.E(new androidx.appcompat.widget.z0(this, 21));
    }
}
