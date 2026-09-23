package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k6(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iT = coil3.svg.internal.a.T(parcel);
                Bundle bundleF = null;
                String strK = null;
                boolean zJ = false;
                long jM = 0;
                long jM2 = 0;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jM = coil3.svg.internal.a.M(parcel, i);
                    } else if (c == 2) {
                        jM2 = coil3.svg.internal.a.M(parcel, i);
                    } else if (c == 3) {
                        zJ = coil3.svg.internal.a.J(parcel, i);
                    } else if (c == 7) {
                        bundleF = coil3.svg.internal.a.f(parcel, i);
                    } else if (c != '\b') {
                        coil3.svg.internal.a.S(parcel, i);
                    } else {
                        strK = coil3.svg.internal.a.k(parcel, i);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT);
                return new j6(jM, jM2, zJ, bundleF, strK);
            case 1:
                int iT2 = coil3.svg.internal.a.T(parcel);
                String strK2 = null;
                int iL = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iL = coil3.svg.internal.a.L(parcel, i2);
                    } else if (c2 == 2) {
                        strK2 = coil3.svg.internal.a.k(parcel, i2);
                    } else if (c2 != 3) {
                        coil3.svg.internal.a.S(parcel, i2);
                    } else {
                        intent = (Intent) coil3.svg.internal.a.j(parcel, i2, Intent.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT2);
                return new l6(iL, strK2, intent);
            case 2:
                int iT3 = coil3.svg.internal.a.T(parcel);
                int iL2 = 0;
                t9[] t9VarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        iL2 = coil3.svg.internal.a.L(parcel, i3);
                    } else if (c3 == 3) {
                        t9VarArr = (t9[]) coil3.svg.internal.a.l(parcel, i3, t9.CREATOR);
                    } else if (c3 != 4) {
                        coil3.svg.internal.a.S(parcel, i3);
                    } else {
                        int iN = coil3.svg.internal.a.N(parcel, i3);
                        int iDataPosition = parcel.dataPosition();
                        if (iN == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iN);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                coil3.svg.internal.a.p(parcel, iT3);
                return new p9(iL2, t9VarArr, strArr);
            case 3:
                int iT4 = coil3.svg.internal.a.T(parcel);
                long jM3 = 0;
                String strK3 = null;
                String strK4 = null;
                p9[] p9VarArr = null;
                byte[] bArrG = null;
                boolean zJ2 = false;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strK3 = coil3.svg.internal.a.k(parcel, i4);
                            break;
                        case 3:
                            strK4 = coil3.svg.internal.a.k(parcel, i4);
                            break;
                        case 4:
                            p9VarArr = (p9[]) coil3.svg.internal.a.l(parcel, i4, p9.CREATOR);
                            break;
                        case 5:
                            zJ2 = coil3.svg.internal.a.J(parcel, i4);
                            break;
                        case 6:
                            bArrG = coil3.svg.internal.a.g(parcel, i4);
                            break;
                        case 7:
                            jM3 = coil3.svg.internal.a.M(parcel, i4);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i4);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT4);
                return new q9(strK3, strK4, p9VarArr, zJ2, bArrG, jM3);
            case 4:
                int iT5 = coil3.svg.internal.a.T(parcel);
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        coil3.svg.internal.a.S(parcel, i5);
                    } else {
                        bArrG2 = coil3.svg.internal.a.g(parcel, i5);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT5);
                return new r9(bArrG2);
            case 5:
                int iT6 = coil3.svg.internal.a.T(parcel);
                String strK5 = null;
                byte[] bArrG3 = null;
                byte[][] bArrH = null;
                byte[][] bArrH2 = null;
                byte[][] bArrH3 = null;
                byte[][] bArrH4 = null;
                int[] iArrI = null;
                byte[][] bArrH5 = null;
                int[] iArrI2 = null;
                byte[][] bArrH6 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strK5 = coil3.svg.internal.a.k(parcel, i6);
                            break;
                        case 3:
                            bArrG3 = coil3.svg.internal.a.g(parcel, i6);
                            break;
                        case 4:
                            bArrH = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        case 5:
                            bArrH2 = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        case 6:
                            bArrH3 = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        case 7:
                            bArrH4 = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        case '\b':
                            iArrI = coil3.svg.internal.a.i(parcel, i6);
                            break;
                        case '\t':
                            bArrH5 = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        case '\n':
                            iArrI2 = coil3.svg.internal.a.i(parcel, i6);
                            break;
                        case 11:
                            bArrH6 = coil3.svg.internal.a.h(parcel, i6);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i6);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT6);
                return new s9(strK5, bArrG3, bArrH, bArrH2, bArrH3, bArrH4, iArrI, bArrH5, iArrI2, bArrH6);
            case 6:
                int iT7 = coil3.svg.internal.a.T(parcel);
                boolean zJ3 = false;
                int iL3 = 0;
                int iL4 = 0;
                int iL5 = 0;
                String strK6 = null;
                String strK7 = null;
                byte[] bArrG4 = null;
                double d = 0.0d;
                long jM4 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strK6 = coil3.svg.internal.a.k(parcel, i7);
                            break;
                        case 3:
                            jM4 = coil3.svg.internal.a.M(parcel, i7);
                            break;
                        case 4:
                            zJ3 = coil3.svg.internal.a.J(parcel, i7);
                            break;
                        case 5:
                            coil3.svg.internal.a.U(parcel, i7, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strK7 = coil3.svg.internal.a.k(parcel, i7);
                            break;
                        case 7:
                            bArrG4 = coil3.svg.internal.a.g(parcel, i7);
                            break;
                        case '\b':
                            iL3 = coil3.svg.internal.a.L(parcel, i7);
                            break;
                        case '\t':
                            iL4 = coil3.svg.internal.a.L(parcel, i7);
                            break;
                        case '\n':
                            iL5 = coil3.svg.internal.a.L(parcel, i7);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i7);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT7);
                return new t9(strK6, jM4, zJ3, d, strK7, bArrG4, iL3, iL4, iL5);
            case 7:
                int iT8 = coil3.svg.internal.a.T(parcel);
                boolean zJ4 = false;
                String strK8 = null;
                String strK9 = null;
                t9 t9Var = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        strK8 = coil3.svg.internal.a.k(parcel, i8);
                    } else if (c4 == 3) {
                        strK9 = coil3.svg.internal.a.k(parcel, i8);
                    } else if (c4 == 4) {
                        t9Var = (t9) coil3.svg.internal.a.j(parcel, i8, t9.CREATOR);
                    } else if (c4 != 5) {
                        coil3.svg.internal.a.S(parcel, i8);
                    } else {
                        zJ4 = coil3.svg.internal.a.J(parcel, i8);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT8);
                return new u9(strK8, strK9, t9Var, zJ4);
            case 8:
                int iT9 = coil3.svg.internal.a.T(parcel);
                ArrayList arrayListM = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 2) {
                        coil3.svg.internal.a.S(parcel, i9);
                    } else {
                        arrayListM = coil3.svg.internal.a.m(parcel, i9, u9.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT9);
                return new v9(arrayListM);
            default:
                int iT10 = coil3.svg.internal.a.T(parcel);
                int iL6 = 0;
                int iL7 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        iL6 = coil3.svg.internal.a.L(parcel, i10);
                    } else if (c5 != 2) {
                        coil3.svg.internal.a.S(parcel, i10);
                    } else {
                        iL7 = coil3.svg.internal.a.L(parcel, i10);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT10);
                return new w9(iL6, iL7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j6[i];
            case 1:
                return new l6[i];
            case 2:
                return new p9[i];
            case 3:
                return new q9[i];
            case 4:
                return new r9[i];
            case 5:
                return new s9[i];
            case 6:
                return new t9[i];
            case 7:
                return new u9[i];
            case 8:
                return new v9[i];
            default:
                return new w9[i];
        }
    }
}
