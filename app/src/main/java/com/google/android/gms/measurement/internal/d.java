package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(26);
    public final long e;
    public final int y;
    public final long z;

    public d(long j, long j2, int i) {
        this.e = j;
        this.y = i;
        this.z = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 8);
        parcel.writeLong(this.z);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
