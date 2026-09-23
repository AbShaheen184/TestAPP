package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(24);
    public final boolean A;
    public final String e;
    public final int y;
    public final long z;

    public d(String str, int i, long j, boolean z) {
        this.e = str;
        this.y = i;
        this.z = j;
        this.A = z;
    }

    public final long d() {
        long j = this.z;
        return j == -1 ? this.y : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (x.j(this.e, dVar.e) && d() == dVar.d() && this.A == dVar.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Long.valueOf(d()), Boolean.valueOf(this.A)});
    }

    public final String toString() {
        androidx.work.impl.k kVar = new androidx.work.impl.k(this);
        kVar.g(this.e, "name");
        kVar.g(Long.valueOf(d()), "version");
        kVar.g(Boolean.valueOf(this.A), "is_fully_rolled_out");
        return kVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 1, this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.y);
        long jD = d();
        com.google.android.gms.dynamite.g.d0(parcel, 3, 8);
        parcel.writeLong(jD);
        com.google.android.gms.dynamite.g.d0(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
