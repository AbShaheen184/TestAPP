package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(27);
    public long A;
    public boolean B;
    public String C;
    public final u D;
    public long E;
    public u F;
    public final long G;
    public final u H;
    public String e;
    public String y;
    public m4 z;

    public e(e eVar) {
        com.google.android.gms.common.internal.x.g(eVar);
        this.e = eVar.e;
        this.y = eVar.y;
        this.z = eVar.z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 3, this.y);
        com.google.android.gms.dynamite.g.Y(parcel, 4, this.z, i);
        long j = this.A;
        com.google.android.gms.dynamite.g.d0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.B;
        com.google.android.gms.dynamite.g.d0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        com.google.android.gms.dynamite.g.Z(parcel, 7, this.C);
        com.google.android.gms.dynamite.g.Y(parcel, 8, this.D, i);
        long j2 = this.E;
        com.google.android.gms.dynamite.g.d0(parcel, 9, 8);
        parcel.writeLong(j2);
        com.google.android.gms.dynamite.g.Y(parcel, 10, this.F, i);
        com.google.android.gms.dynamite.g.d0(parcel, 11, 8);
        parcel.writeLong(this.G);
        com.google.android.gms.dynamite.g.Y(parcel, 12, this.H, i);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }

    public e(String str, String str2, m4 m4Var, long j, boolean z, String str3, u uVar, long j2, u uVar2, long j3, u uVar3) {
        this.e = str;
        this.y = str2;
        this.z = m4Var;
        this.A = j;
        this.B = z;
        this.C = str3;
        this.D = uVar;
        this.E = j2;
        this.F = uVar2;
        this.G = j3;
        this.H = uVar3;
    }
}
