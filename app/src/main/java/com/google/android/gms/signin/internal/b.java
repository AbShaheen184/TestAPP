package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.measurement.internal.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<b> CREATOR = new v(7);
    public final int e;
    public final int y;
    public final Intent z;

    public b(int i, int i2, Intent intent) {
        this.e = i;
        this.y = i2;
        this.z = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = g.e0(parcel, 20293);
        g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        g.d0(parcel, 2, 4);
        parcel.writeInt(this.y);
        g.Y(parcel, 3, this.z, i);
        g.f0(parcel, iE0);
    }
}
