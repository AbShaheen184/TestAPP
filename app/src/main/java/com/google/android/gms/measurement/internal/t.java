package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.google.android.gms.common.internal.safeparcel.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new android.support.v4.media.a(29);
    public final Bundle e;

    public t(Bundle bundle) {
        this.e = bundle;
    }

    public final Object d(String str) {
        return this.e.get(str);
    }

    public final Double e() {
        return Double.valueOf(this.e.getDouble(ES6Iterator.VALUE_PROPERTY));
    }

    public final String f() {
        return this.e.getString("currency");
    }

    public final Bundle h() {
        return new Bundle(this.e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.T(parcel, 2, h());
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
