package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<b4> CREATOR = new v(2);
    public final Bundle A;
    public final int B;
    public final long C;
    public String D;
    public final long e;
    public byte[] y;
    public final String z;

    public b4(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.e = j;
        this.y = bArr;
        this.z = str;
        this.A = bundle;
        this.B = i;
        this.C = j2;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.dynamite.g.U(parcel, 2, this.y);
        com.google.android.gms.dynamite.g.Z(parcel, 3, this.z);
        com.google.android.gms.dynamite.g.T(parcel, 4, this.A);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 4);
        parcel.writeInt(this.B);
        com.google.android.gms.dynamite.g.d0(parcel, 6, 8);
        parcel.writeLong(this.C);
        com.google.android.gms.dynamite.g.Z(parcel, 7, this.D);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
