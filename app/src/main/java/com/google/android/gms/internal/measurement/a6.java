package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 extends com.google.android.gms.internal.base.a implements b6 {
    public a6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void w(Bundle bundle) {
        Parcel parcelH = h();
        o5.b(parcelH, bundle);
        H(parcelH, 1);
    }
}
