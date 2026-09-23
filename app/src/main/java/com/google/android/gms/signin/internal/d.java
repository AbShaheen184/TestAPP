package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.measurement.internal.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new v(8);
    public final List e;
    public final String y;

    public d(String str, ArrayList arrayList) {
        this.e = arrayList;
        this.y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = g.e0(parcel, 20293);
        List<String> list = this.e;
        if (list != null) {
            int iE1 = g.e0(parcel, 1);
            parcel.writeStringList(list);
            g.f0(parcel, iE1);
        }
        g.Z(parcel, 2, this.y);
        g.f0(parcel, iE0);
    }
}
