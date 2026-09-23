package com.google.android.gms.dynamite;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.google.android.gms.internal.base.a {
    public final com.google.android.gms.dynamic.a J(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.g.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.google.android.gms.internal.common.g.b(parcelH, bVar2);
        Parcel parcelA = a(parcelH, 2);
        com.google.android.gms.dynamic.a aVarI = com.google.android.gms.dynamic.b.I(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarI;
    }

    public final com.google.android.gms.dynamic.a K(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.g.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.google.android.gms.internal.common.g.b(parcelH, bVar2);
        Parcel parcelA = a(parcelH, 3);
        com.google.android.gms.dynamic.a aVarI = com.google.android.gms.dynamic.b.I(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarI;
    }
}
