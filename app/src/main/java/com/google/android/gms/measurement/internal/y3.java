package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<y3> CREATOR = new v(1);
    public final String e;
    public final long y;
    public final int z;

    public y3(int i, long j, String str) {
        this.e = str;
        this.y = j;
        this.z = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 1, this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 8);
        parcel.writeLong(this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
