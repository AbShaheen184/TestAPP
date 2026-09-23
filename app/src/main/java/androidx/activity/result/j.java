package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(6);
    public final int A;
    public final IntentSender e;
    public final Intent y;
    public final int z;

    public j(IntentSender intentSender, Intent intent, int i, int i2) {
        this.e = intentSender;
        this.y = intent;
        this.z = i;
        this.A = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.y, i);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }
}
