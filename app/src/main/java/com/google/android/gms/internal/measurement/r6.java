package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends n5 implements d6 {
    public final /* synthetic */ com.google.common.util.concurrent.k0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(m6 m6Var, com.google.common.util.concurrent.k0 k0Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.d = k0Var;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        d();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void d() {
        this.d.run();
    }
}
