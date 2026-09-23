package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.customview.view.b {
    public static final Parcelable.Creator<b> CREATOR = new p(5);
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int z;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt() == 1;
        this.C = parcel.readInt() == 1;
        this.D = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
    }

    public b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.z = bottomSheetBehavior.N;
        this.A = bottomSheetBehavior.e;
        this.B = bottomSheetBehavior.b;
        this.C = bottomSheetBehavior.I;
        this.D = bottomSheetBehavior.J;
    }
}
