package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);
    public final Intent e;

    public a(Intent intent) {
        this.e = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Y(parcel, 1, this.e, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
