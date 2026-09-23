package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f0> CREATOR = new android.support.v4.media.a(20);
    public f A;
    public Bundle e;
    public com.google.android.gms.common.d[] y;
    public int z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.T(parcel, 1, this.e);
        com.google.android.gms.dynamite.g.a0(parcel, 2, this.y, i);
        int i2 = this.z;
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(i2);
        com.google.android.gms.dynamite.g.Y(parcel, 4, this.A, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
