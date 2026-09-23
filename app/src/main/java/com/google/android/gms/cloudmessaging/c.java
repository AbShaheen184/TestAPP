package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iT = coil3.svg.internal.a.T(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        coil3.svg.internal.a.S(parcel, i);
                    } else {
                        intent = (Intent) coil3.svg.internal.a.j(parcel, i, Intent.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
