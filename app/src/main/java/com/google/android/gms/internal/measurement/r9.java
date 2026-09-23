package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<r9> CREATOR = new k6(4);
    public final byte[] e;

    public r9(byte[] bArr) {
        this.e = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.U(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
