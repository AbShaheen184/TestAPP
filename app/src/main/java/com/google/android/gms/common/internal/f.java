package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f> CREATOR = new android.support.v4.media.a(21);
    public final int[] A;
    public final int B;
    public final int[] C;
    public final l e;
    public final boolean y;
    public final boolean z;

    public f(l lVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.e = lVar;
        this.y = z;
        this.z = z2;
        this.A = iArr;
        this.B = i;
        this.C = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Y(parcel, 1, this.e, i);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        com.google.android.gms.dynamite.g.X(parcel, 4, this.A);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 4);
        parcel.writeInt(this.B);
        com.google.android.gms.dynamite.g.X(parcel, 6, this.C);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
