package com.google.android.material.sidesheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.customview.view.b {
    public static final Parcelable.Creator<b> CREATOR = new p(8);
    public final int z;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = parcel.readInt();
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z);
    }

    public b(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.z = sideSheetBehavior.h;
    }
}
