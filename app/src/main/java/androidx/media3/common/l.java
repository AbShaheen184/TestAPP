package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new k(1);
    public final String A;
    public final byte[] B;
    public int e;
    public final UUID y;
    public final String z;

    public l(Parcel parcel) {
        this.y = new UUID(parcel.readLong(), parcel.readLong());
        this.z = parcel.readString();
        String string = parcel.readString();
        String str = androidx.media3.common.util.i0.a;
        this.A = string;
        this.B = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        return Objects.equals(this.z, lVar.z) && Objects.equals(this.A, lVar.A) && Objects.equals(this.y, lVar.y) && Arrays.equals(this.B, lVar.B);
    }

    public final int hashCode() {
        if (this.e == 0) {
            int iHashCode = this.y.hashCode() * 31;
            String str = this.z;
            this.e = Arrays.hashCode(this.B) + androidx.privacysandbox.ads.adservices.java.internal.a.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.A);
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.y;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeByteArray(this.B);
    }

    public l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.y = uuid;
        this.z = str;
        str2.getClass();
        this.A = i0.p(str2);
        this.B = bArr;
    }
}
