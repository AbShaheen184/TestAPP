package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(16);
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;
    public final int e;
    public final int y;
    public final int z;

    public j(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.e = i;
        this.y = i2;
        this.z = i3;
        this.A = j;
        this.B = j2;
        this.C = str;
        this.D = str2;
        this.E = i4;
        this.F = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z);
        com.google.android.gms.dynamite.g.d0(parcel, 4, 8);
        parcel.writeLong(this.A);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 8);
        parcel.writeLong(this.B);
        com.google.android.gms.dynamite.g.Z(parcel, 6, this.C);
        com.google.android.gms.dynamite.g.Z(parcel, 7, this.D);
        com.google.android.gms.dynamite.g.d0(parcel, 8, 4);
        parcel.writeInt(this.E);
        com.google.android.gms.dynamite.g.d0(parcel, 9, 4);
        parcel.writeInt(this.F);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
