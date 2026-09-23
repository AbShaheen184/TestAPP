package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends androidx.customview.view.b {
    public static final Parcelable.Creator<k2> CREATOR = new androidx.compose.runtime.snapshots.p(1);
    public boolean A;
    public int z;

    public k2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = parcel.readInt();
        this.A = parcel.readInt() != 0;
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
