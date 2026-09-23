package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<m> CREATOR = new com.google.android.gms.measurement.internal.v(10);
    public final Bundle e;
    public androidx.collection.f y;
    public f z;

    public m(Bundle bundle) {
        this.e = bundle;
    }

    public final Map d() {
        if (this.y == null) {
            androidx.collection.f fVar = new androidx.collection.f(0);
            Bundle bundle = this.e;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        fVar.put(str, str2);
                    }
                }
            }
            this.y = fVar;
        }
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.T(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
