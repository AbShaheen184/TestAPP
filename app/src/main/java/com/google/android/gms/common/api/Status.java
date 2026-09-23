package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new android.support.v4.media.a(14);
    public final com.google.android.gms.common.b A;
    public final int e;
    public final String y;
    public final PendingIntent z;

    public Status(int i, String str, PendingIntent pendingIntent, com.google.android.gms.common.b bVar) {
        this.e = i;
        this.y = str;
        this.z = pendingIntent;
        this.A = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.e == status.e && x.j(this.y, status.y) && x.j(this.z, status.z) && x.j(this.A, status.A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.y, this.z, this.A});
    }

    public final String toString() {
        androidx.work.impl.k kVar = new androidx.work.impl.k(this);
        String strE = this.y;
        if (strE == null) {
            int i = this.e;
            switch (i) {
                case -1:
                    strE = "SUCCESS_CACHE";
                    break;
                case 0:
                    strE = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strE = androidx.compose.runtime.j.e(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    strE = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strE = "SERVICE_DISABLED";
                    break;
                case 4:
                    strE = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strE = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strE = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strE = "NETWORK_ERROR";
                    break;
                case 8:
                    strE = "INTERNAL_ERROR";
                    break;
                case 10:
                    strE = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strE = "ERROR";
                    break;
                case 14:
                    strE = "INTERRUPTED";
                    break;
                case 15:
                    strE = "TIMEOUT";
                    break;
                case 16:
                    strE = "CANCELED";
                    break;
                case 17:
                    strE = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strE = "DEAD_CLIENT";
                    break;
                case 19:
                    strE = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strE = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strE = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strE = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        kVar.g(strE, "statusCode");
        kVar.g(this.z, "resolution");
        return kVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.y);
        com.google.android.gms.dynamite.g.Y(parcel, 3, this.z, i);
        com.google.android.gms.dynamite.g.Y(parcel, 4, this.A, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
