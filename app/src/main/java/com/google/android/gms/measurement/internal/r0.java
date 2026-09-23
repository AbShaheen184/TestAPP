package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends com.google.android.gms.common.internal.e {
    @Override // com.google.android.gms.common.internal.e, com.google.android.gms.common.api.c
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.e
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.e
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.e
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
