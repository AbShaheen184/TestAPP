package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public IBinder d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // androidx.room.d
    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.b);
            parcelObtain.writeStringArray(strArr);
            this.d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
