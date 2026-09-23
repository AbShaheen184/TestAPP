package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {
    public final Parcelable e;
    public static final a y = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(3);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.e = parcelable == y ? null : parcelable;
        } else {
            kotlinx.coroutines.future.a.q("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    public b() {
        this.e = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.e = parcelable == null ? y : parcelable;
    }
}
