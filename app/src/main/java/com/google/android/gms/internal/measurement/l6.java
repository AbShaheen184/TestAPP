package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<l6> CREATOR = new k6(1);
    public final int e;
    public final String y;
    public final Intent z;

    public l6(int i, String str, Intent intent) {
        this.e = i;
        this.y = str;
        this.z = intent;
    }

    public static l6 d(Activity activity) {
        return new l6(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.e == l6Var.e && Objects.equals(this.y, l6Var.y) && Objects.equals(this.z, l6Var.z);
    }

    public final int hashCode() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.y);
        com.google.android.gms.dynamite.g.Y(parcel, 3, this.z, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
