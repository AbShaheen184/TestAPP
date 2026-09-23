package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.a(25);
    public final int A;
    public final long B;
    public final boolean e;
    public final String y;
    public final int z;

    public q(boolean z, String str, int i, int i2, long j) {
        this.e = z;
        this.y = str;
        this.z = t1.D(i) - 1;
        this.A = com.google.firebase.b.a0(i2) - 1;
        this.B = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z);
        com.google.android.gms.dynamite.g.d0(parcel, 4, 4);
        parcel.writeInt(this.A);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 8);
        parcel.writeLong(this.B);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
