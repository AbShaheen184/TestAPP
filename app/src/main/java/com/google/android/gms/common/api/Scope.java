package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new android.support.v4.media.a(13);
    public final int e;
    public final String y;

    public Scope(int i, String str) {
        x.e(str, "scopeUri must not be null or empty");
        this.e = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.y.equals(((Scope) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.y);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
