package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.measurement.internal.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<e> CREATOR = new v(9);
    public final int e;
    public final com.google.android.gms.common.b y;
    public final r z;

    public e(int i, com.google.android.gms.common.b bVar, r rVar) {
        this.e = i;
        this.y = bVar;
        this.z = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = g.e0(parcel, 20293);
        g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        g.Y(parcel, 2, this.y, i);
        g.Y(parcel, 3, this.z, i);
        g.f0(parcel, iE0);
    }
}
