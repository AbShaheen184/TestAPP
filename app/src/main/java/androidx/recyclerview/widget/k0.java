package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends androidx.customview.view.b {
    public static final Parcelable.Creator<k0> CREATOR = new androidx.compose.runtime.snapshots.p(4);
    public Parcelable z;

    public k0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = parcel.readParcelable(classLoader == null ? c0.class.getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.z, 0);
    }
}
