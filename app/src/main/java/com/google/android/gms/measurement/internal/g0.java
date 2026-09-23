package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.google.android.gms.internal.base.a implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List B(String str, String str2, boolean z, r4 r4Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = o5.a;
        parcelH.writeInt(z ? 1 : 0);
        o5.b(parcelH, r4Var);
        Parcel parcelC = c(parcelH, 14);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(m4.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void C(u uVar, r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, uVar);
        o5.b(parcelH, r4Var);
        H(parcelH, 1);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final String D(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        Parcel parcelC = c(parcelH, 11);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List E(String str, String str2, r4 r4Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, r4Var);
        Parcel parcelC = c(parcelH, 16);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(e.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void G(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 20);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void e(r4 r4Var, c4 c4Var, m0 m0Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        o5.b(parcelH, c4Var);
        o5.c(parcelH, m0Var);
        H(parcelH, 29);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List f(String str, String str2, String str3, boolean z) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        ClassLoader classLoader = o5.a;
        parcelH.writeInt(z ? 1 : 0);
        Parcel parcelC = c(parcelH, 15);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(m4.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void i(e eVar, r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, eVar);
        o5.b(parcelH, r4Var);
        H(parcelH, 12);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void k(long j, String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeLong(j);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        H(parcelH, 10);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void l(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 18);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List m(String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        Parcel parcelC = c(parcelH, 17);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(e.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final byte[] n(u uVar, String str) {
        Parcel parcelH = h();
        o5.b(parcelH, uVar);
        parcelH.writeString(str);
        Parcel parcelC = c(parcelH, 9);
        byte[] bArrCreateByteArray = parcelC.createByteArray();
        parcelC.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void o(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 25);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void p(r4 r4Var, Bundle bundle, k0 k0Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        o5.b(parcelH, bundle);
        o5.c(parcelH, k0Var);
        H(parcelH, 31);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void q(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 6);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void r(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 26);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void s(r4 r4Var, d dVar) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        o5.b(parcelH, dVar);
        H(parcelH, 30);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void t(m4 m4Var, r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, m4Var);
        o5.b(parcelH, r4Var);
        H(parcelH, 2);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final i u(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        Parcel parcelC = c(parcelH, 21);
        i iVar = (i) o5.a(parcelC, i.CREATOR);
        parcelC.recycle();
        return iVar;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void v(Bundle bundle, r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, bundle);
        o5.b(parcelH, r4Var);
        H(parcelH, 19);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void x(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 4);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void z(r4 r4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, r4Var);
        H(parcelH, 27);
    }
}
