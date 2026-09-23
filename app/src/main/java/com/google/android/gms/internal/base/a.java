package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {
    public final /* synthetic */ int d;
    public final IBinder e;
    public final String f;

    public /* synthetic */ a(IBinder iBinder, String str, int i) {
        this.d = i;
        this.e = iBinder;
        this.f = str;
    }

    public void H(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.e.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void I(Parcel parcel) {
        try {
            this.e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.e.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public Parcel c(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.e.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel h() {
        switch (this.d) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f);
                return parcelObtain2;
        }
    }
}
