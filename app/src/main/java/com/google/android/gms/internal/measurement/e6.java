package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 extends com.google.android.gms.internal.base.a implements f6 {
    public e6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final int b() {
        Parcel parcelC = c(h(), 2);
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final void g(String str, String str2, Bundle bundle, long j) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, bundle);
        parcelH.writeLong(j);
        H(parcelH, 1);
    }
}
