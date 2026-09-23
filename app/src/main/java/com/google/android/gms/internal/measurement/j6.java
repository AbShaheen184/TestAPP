package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<j6> CREATOR = new k6(0);
    public final Bundle A;
    public final String B;
    public final long e;
    public final long y;
    public final boolean z;

    public j6(long j, long j2, boolean z, Bundle bundle, String str) {
        this.e = j;
        this.y = j2;
        this.z = z;
        this.A = bundle;
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 8);
        parcel.writeLong(this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        com.google.android.gms.dynamite.g.T(parcel, 7, this.A);
        com.google.android.gms.dynamite.g.Z(parcel, 8, this.B);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
