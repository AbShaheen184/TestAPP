package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<u9> CREATOR = new k6(7);
    public final boolean A;
    public final String e;
    public final String y;
    public final t9 z;

    public u9(String str, String str2, t9 t9Var, boolean z) {
        this.e = str;
        this.y = str2;
        this.z = t9Var;
        this.A = z;
    }

    public final void d(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        this.z.d(sb);
        sb.append(", ");
        sb.append(this.A);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return wf.c(this.e, u9Var.e) && wf.c(this.y, u9Var.y) && wf.c(this.z, u9Var.z) && this.A == u9Var.A;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 3, this.y);
        com.google.android.gms.dynamite.g.Y(parcel, 4, this.z, i);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
