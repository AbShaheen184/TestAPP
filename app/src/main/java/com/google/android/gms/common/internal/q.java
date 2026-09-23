package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.a(17);
    public final GoogleSignInAccount A;
    public final int e;
    public final Account y;
    public final int z;

    public q(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.e = i;
        this.y = account;
        this.z = i2;
        this.A = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.Y(parcel, 2, this.y, i);
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(this.z);
        com.google.android.gms.dynamite.g.Y(parcel, 4, this.A, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
