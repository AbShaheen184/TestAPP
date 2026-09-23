package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new g();
    public final int e;

    public h(int i) {
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.e == ((h) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("DefaultLazyKey(index="), this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }
}
