package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.google.android.gms.internal.base.a implements k0 {
    @Override // com.google.android.gms.measurement.internal.k0
    public final void A(List list) {
        Parcel parcelH = h();
        parcelH.writeTypedList(list);
        I(parcelH);
    }
}
