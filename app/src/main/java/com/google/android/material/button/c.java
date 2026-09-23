package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.customview.view.b {
    public static final Parcelable.Creator<c> CREATOR = new p(6);
    public boolean z;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.z = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
