package com.google.android.gms.common;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends com.google.android.gms.internal.base.b implements IInterface {
    public final int e;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        x.b(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            kotlinx.coroutines.future.a.o(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.base.b
    public final boolean H(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.dynamic.a aVarJ = J();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.g.b(parcel2, aVarJ);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.e);
        return true;
    }

    public abstract byte[] I();

    public final com.google.android.gms.dynamic.a J() {
        return new com.google.android.gms.dynamic.b(I());
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarJ;
        if (obj instanceof l) {
            try {
                l lVar = (l) obj;
                if (lVar.e == this.e && (aVarJ = lVar.J()) != null) {
                    return Arrays.equals(I(), (byte[]) com.google.android.gms.dynamic.b.J(aVarJ));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
