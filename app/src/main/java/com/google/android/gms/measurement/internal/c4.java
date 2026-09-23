package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<c4> CREATOR = new v(3);
    public final List e;

    public c4(ArrayList arrayList) {
        this.e = arrayList;
    }

    public static c4 d(z2... z2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(z2VarArr[0].e));
        return new c4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        List list = this.e;
        if (list != null) {
            int iE1 = com.google.android.gms.dynamite.g.e0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            com.google.android.gms.dynamite.g.f0(parcel, iE1);
        }
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
