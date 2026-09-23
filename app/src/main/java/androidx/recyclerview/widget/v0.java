package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new android.support.v4.media.a(10);
    public int[] A;
    public int B;
    public int[] C;
    public ArrayList D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int e;
    public int y;
    public int z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        if (this.z > 0) {
            parcel.writeIntArray(this.A);
        }
        parcel.writeInt(this.B);
        if (this.B > 0) {
            parcel.writeIntArray(this.C);
        }
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeList(this.D);
    }
}
