package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d4> CREATOR = new v(4);
    public final List e;

    public d4(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.b0(parcel, 1, this.e);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
