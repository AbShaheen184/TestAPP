package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<r4> CREATOR = new v(6);
    public final String A;
    public final long B;
    public final long C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final long G;
    public final String H;
    public final long I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final Boolean M;
    public final long N;
    public final List O;
    public final String P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final long T;
    public final int U;
    public final String V;
    public final int W;
    public final long X;
    public final String Y;
    public final String Z;
    public final long a0;
    public final int b0;
    public final long c0;
    public final String e;
    public final String y;
    public final String z;

    public r4(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        com.google.android.gms.common.internal.x.d(str);
        this.e = str;
        this.y = true == TextUtils.isEmpty(str2) ? null : str2;
        this.z = str3;
        this.G = j;
        this.A = str4;
        this.B = j2;
        this.C = j3;
        this.D = str5;
        this.E = z;
        this.F = z2;
        this.H = str6;
        this.I = j4;
        this.J = i;
        this.K = z3;
        this.L = z4;
        this.M = bool;
        this.N = j5;
        this.O = list;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = z5;
        this.T = j6;
        this.U = i2;
        this.V = str10;
        this.W = i3;
        this.X = j7;
        this.Y = str11;
        this.Z = str12;
        this.a0 = j8;
        this.b0 = i4;
        this.c0 = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 3, this.y);
        com.google.android.gms.dynamite.g.Z(parcel, 4, this.z);
        com.google.android.gms.dynamite.g.Z(parcel, 5, this.A);
        com.google.android.gms.dynamite.g.d0(parcel, 6, 8);
        parcel.writeLong(this.B);
        com.google.android.gms.dynamite.g.d0(parcel, 7, 8);
        parcel.writeLong(this.C);
        com.google.android.gms.dynamite.g.Z(parcel, 8, this.D);
        com.google.android.gms.dynamite.g.d0(parcel, 9, 4);
        parcel.writeInt(this.E ? 1 : 0);
        com.google.android.gms.dynamite.g.d0(parcel, 10, 4);
        parcel.writeInt(this.F ? 1 : 0);
        com.google.android.gms.dynamite.g.d0(parcel, 11, 8);
        parcel.writeLong(this.G);
        com.google.android.gms.dynamite.g.Z(parcel, 12, this.H);
        com.google.android.gms.dynamite.g.d0(parcel, 14, 8);
        parcel.writeLong(this.I);
        com.google.android.gms.dynamite.g.d0(parcel, 15, 4);
        parcel.writeInt(this.J);
        com.google.android.gms.dynamite.g.d0(parcel, 16, 4);
        parcel.writeInt(this.K ? 1 : 0);
        com.google.android.gms.dynamite.g.d0(parcel, 18, 4);
        parcel.writeInt(this.L ? 1 : 0);
        Boolean bool = this.M;
        if (bool != null) {
            com.google.android.gms.dynamite.g.d0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.google.android.gms.dynamite.g.d0(parcel, 22, 8);
        parcel.writeLong(this.N);
        List<String> list = this.O;
        if (list != null) {
            int iE1 = com.google.android.gms.dynamite.g.e0(parcel, 23);
            parcel.writeStringList(list);
            com.google.android.gms.dynamite.g.f0(parcel, iE1);
        }
        com.google.android.gms.dynamite.g.Z(parcel, 25, this.P);
        com.google.android.gms.dynamite.g.Z(parcel, 26, this.Q);
        com.google.android.gms.dynamite.g.Z(parcel, 27, this.R);
        com.google.android.gms.dynamite.g.d0(parcel, 28, 4);
        parcel.writeInt(this.S ? 1 : 0);
        com.google.android.gms.dynamite.g.d0(parcel, 29, 8);
        parcel.writeLong(this.T);
        com.google.android.gms.dynamite.g.d0(parcel, 30, 4);
        parcel.writeInt(this.U);
        com.google.android.gms.dynamite.g.Z(parcel, 31, this.V);
        com.google.android.gms.dynamite.g.d0(parcel, 32, 4);
        parcel.writeInt(this.W);
        com.google.android.gms.dynamite.g.d0(parcel, 34, 8);
        parcel.writeLong(this.X);
        com.google.android.gms.dynamite.g.Z(parcel, 35, this.Y);
        com.google.android.gms.dynamite.g.Z(parcel, 36, this.Z);
        com.google.android.gms.dynamite.g.d0(parcel, 37, 8);
        parcel.writeLong(this.a0);
        com.google.android.gms.dynamite.g.d0(parcel, 38, 4);
        parcel.writeInt(this.b0);
        com.google.android.gms.dynamite.g.d0(parcel, 39, 8);
        parcel.writeLong(this.c0);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }

    public r4(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.e = str;
        this.y = str2;
        this.z = str3;
        this.G = j3;
        this.A = str4;
        this.B = j;
        this.C = j2;
        this.D = str5;
        this.E = z;
        this.F = z2;
        this.H = str6;
        this.I = j4;
        this.J = i;
        this.K = z3;
        this.L = z4;
        this.M = bool;
        this.N = j5;
        this.O = arrayList;
        this.P = str7;
        this.Q = str8;
        this.R = str9;
        this.S = z5;
        this.T = j6;
        this.U = i2;
        this.V = str10;
        this.W = i3;
        this.X = j7;
        this.Y = str11;
        this.Z = str12;
        this.a0 = j8;
        this.b0 = i4;
        this.c0 = j9;
    }
}
