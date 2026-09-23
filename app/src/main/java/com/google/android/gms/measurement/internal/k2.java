package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ s2 F;
    public final /* synthetic */ String e;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public k2(s2 s2Var, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.e = str;
        this.y = str2;
        this.z = j;
        this.A = j2;
        this.B = bundle;
        this.C = z;
        this.D = z2;
        this.E = z3;
        this.F = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.E(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
    }
}
