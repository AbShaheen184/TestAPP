package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends androidx.customview.view.b {
    public static final Parcelable.Creator<x> CREATOR = new androidx.compose.runtime.snapshots.p(9);
    public boolean A;
    public CharSequence z;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.z) + "}";
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.z, parcel, i);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
