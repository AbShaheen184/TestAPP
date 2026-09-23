package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<v9> CREATOR = new k6(8);
    public final List e;

    public v9(ArrayList arrayList) {
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v9) {
            return this.e.equals(((v9) obj).e);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (u9 u9Var : this.e) {
            if (!z) {
                sb.append(", ");
            }
            u9Var.d(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.b0(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
