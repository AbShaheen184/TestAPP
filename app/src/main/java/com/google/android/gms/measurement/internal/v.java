package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public static void a(u uVar, Parcel parcel, int i) {
        String str = uVar.e;
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 2, str);
        com.google.android.gms.dynamite.g.Y(parcel, 3, uVar.y, i);
        com.google.android.gms.dynamite.g.Z(parcel, 4, uVar.z);
        long j = uVar.A;
        com.google.android.gms.dynamite.g.d0(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = uVar.B;
        com.google.android.gms.dynamite.g.d0(parcel, 6, 8);
        parcel.writeLong(j2);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }

    public static void b(m4 m4Var, Parcel parcel) {
        int i = m4Var.e;
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(i);
        com.google.android.gms.dynamite.g.Z(parcel, 2, m4Var.y);
        long j = m4Var.z;
        com.google.android.gms.dynamite.g.d0(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = m4Var.A;
        if (l != null) {
            com.google.android.gms.dynamite.g.d0(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        com.google.android.gms.dynamite.g.Z(parcel, 6, m4Var.B);
        com.google.android.gms.dynamite.g.Z(parcel, 7, m4Var.C);
        Double d = m4Var.D;
        if (d != null) {
            com.google.android.gms.dynamite.g.d0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iT = coil3.svg.internal.a.T(parcel);
                long jM = 0;
                long jM2 = 0;
                String strK = null;
                t tVar = null;
                String strK2 = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strK = coil3.svg.internal.a.k(parcel, i);
                    } else if (c == 3) {
                        tVar = (t) coil3.svg.internal.a.j(parcel, i, t.CREATOR);
                    } else if (c == 4) {
                        strK2 = coil3.svg.internal.a.k(parcel, i);
                    } else if (c == 5) {
                        jM = coil3.svg.internal.a.M(parcel, i);
                    } else if (c != 6) {
                        coil3.svg.internal.a.S(parcel, i);
                    } else {
                        jM2 = coil3.svg.internal.a.M(parcel, i);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT);
                return new u(strK, tVar, strK2, jM, jM2);
            case 1:
                int iT2 = coil3.svg.internal.a.T(parcel);
                int iL = 0;
                long jM3 = 0;
                String strK3 = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strK3 = coil3.svg.internal.a.k(parcel, i2);
                    } else if (c2 == 2) {
                        jM3 = coil3.svg.internal.a.M(parcel, i2);
                    } else if (c2 != 3) {
                        coil3.svg.internal.a.S(parcel, i2);
                    } else {
                        iL = coil3.svg.internal.a.L(parcel, i2);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT2);
                return new y3(iL, jM3, strK3);
            case 2:
                int iT3 = coil3.svg.internal.a.T(parcel);
                byte[] bArrG = null;
                String strK4 = null;
                Bundle bundleF = null;
                String strK5 = null;
                long jM4 = 0;
                long jM5 = 0;
                int iL2 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            jM4 = coil3.svg.internal.a.M(parcel, i3);
                            break;
                        case 2:
                            bArrG = coil3.svg.internal.a.g(parcel, i3);
                            break;
                        case 3:
                            strK4 = coil3.svg.internal.a.k(parcel, i3);
                            break;
                        case 4:
                            bundleF = coil3.svg.internal.a.f(parcel, i3);
                            break;
                        case 5:
                            iL2 = coil3.svg.internal.a.L(parcel, i3);
                            break;
                        case 6:
                            jM5 = coil3.svg.internal.a.M(parcel, i3);
                            break;
                        case 7:
                            strK5 = coil3.svg.internal.a.k(parcel, i3);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i3);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT3);
                return new b4(jM4, bArrG, strK4, bundleF, iL2, jM5, strK5);
            case 3:
                int iT4 = coil3.svg.internal.a.T(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iT4) {
                            coil3.svg.internal.a.p(parcel, iT4);
                            return new c4(arrayList);
                        }
                        int i4 = parcel.readInt();
                        if (((char) i4) != 1) {
                            coil3.svg.internal.a.S(parcel, i4);
                        } else {
                            int iN = coil3.svg.internal.a.N(parcel, i4);
                            int iDataPosition = parcel.dataPosition();
                            if (iN == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i5 = parcel.readInt();
                            for (int i6 = 0; i6 < i5; i6++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iN);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 4:
                int iT5 = coil3.svg.internal.a.T(parcel);
                ArrayList arrayListM = null;
                while (parcel.dataPosition() < iT5) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        coil3.svg.internal.a.S(parcel, i7);
                    } else {
                        arrayListM = coil3.svg.internal.a.m(parcel, i7, b4.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT5);
                return new d4(arrayListM);
            case 5:
                int iT6 = coil3.svg.internal.a.T(parcel);
                String strK6 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strK7 = null;
                String strK8 = null;
                Double dValueOf = null;
                long jM6 = 0;
                int iL3 = 0;
                while (parcel.dataPosition() < iT6) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iL3 = coil3.svg.internal.a.L(parcel, i8);
                            break;
                        case 2:
                            strK6 = coil3.svg.internal.a.k(parcel, i8);
                            break;
                        case 3:
                            jM6 = coil3.svg.internal.a.M(parcel, i8);
                            break;
                        case 4:
                            int iN2 = coil3.svg.internal.a.N(parcel, i8);
                            if (iN2 == 0) {
                                lValueOf = null;
                            } else {
                                coil3.svg.internal.a.V(parcel, iN2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iN3 = coil3.svg.internal.a.N(parcel, i8);
                            if (iN3 == 0) {
                                fValueOf = null;
                            } else {
                                coil3.svg.internal.a.V(parcel, iN3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strK7 = coil3.svg.internal.a.k(parcel, i8);
                            break;
                        case 7:
                            strK8 = coil3.svg.internal.a.k(parcel, i8);
                            break;
                        case '\b':
                            int iN4 = coil3.svg.internal.a.N(parcel, i8);
                            if (iN4 == 0) {
                                dValueOf = null;
                            } else {
                                coil3.svg.internal.a.V(parcel, iN4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i8);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT6);
                return new m4(iL3, strK6, jM6, lValueOf, fValueOf, strK7, strK8, dValueOf);
            case 6:
                int iT7 = coil3.svg.internal.a.T(parcel);
                long jM7 = 0;
                long jM8 = 0;
                long jM9 = 0;
                long jM10 = 0;
                long jM11 = 0;
                long jM12 = 0;
                long jM13 = 0;
                long jM14 = 0;
                boolean zJ = false;
                int iL4 = 0;
                boolean zJ2 = false;
                boolean zJ3 = false;
                int iL5 = 0;
                int iL6 = 0;
                String strK9 = "";
                String strK10 = strK9;
                String strK11 = strK10;
                String strK12 = strK11;
                String strK13 = null;
                String strK14 = null;
                String strK15 = null;
                String strK16 = null;
                String strK17 = null;
                String strK18 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strK19 = null;
                String strK20 = null;
                int iL7 = 100;
                boolean zJ4 = true;
                boolean zJ5 = true;
                long jM15 = -2147483648L;
                while (parcel.dataPosition() < iT7) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            strK13 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 3:
                            strK14 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 4:
                            strK15 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 5:
                            strK16 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 6:
                            jM7 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 7:
                            jM8 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case '\b':
                            strK17 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case '\t':
                            zJ4 = coil3.svg.internal.a.J(parcel, i9);
                            break;
                        case '\n':
                            zJ = coil3.svg.internal.a.J(parcel, i9);
                            break;
                        case 11:
                            jM15 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case '\f':
                            strK18 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case Token.GETPROP /* 33 */:
                        default:
                            coil3.svg.internal.a.S(parcel, i9);
                            break;
                        case 14:
                            jM9 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 15:
                            iL4 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case 16:
                            zJ5 = coil3.svg.internal.a.J(parcel, i9);
                            break;
                        case 18:
                            zJ2 = coil3.svg.internal.a.J(parcel, i9);
                            break;
                        case 21:
                            int iN5 = coil3.svg.internal.a.N(parcel, i9);
                            if (iN5 == 0) {
                                boolValueOf = null;
                            } else {
                                coil3.svg.internal.a.V(parcel, iN5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jM10 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 23:
                            int iN6 = coil3.svg.internal.a.N(parcel, i9);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iN6 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition2 + iN6);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strK9 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 26:
                            strK10 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 27:
                            strK19 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 28:
                            zJ3 = coil3.svg.internal.a.J(parcel, i9);
                            break;
                        case 29:
                            jM11 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 30:
                            iL7 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case 31:
                            strK11 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case ' ':
                            iL5 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case Token.GETPROPNOWARN /* 34 */:
                            jM12 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case '#':
                            strK20 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                            strK12 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case Token.SETPROP /* 37 */:
                            jM13 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case Token.SETPROP_SUPER /* 38 */:
                            iL6 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case Token.GETELEM /* 39 */:
                            jM14 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT7);
                return new r4(strK13, strK14, strK15, strK16, jM7, jM8, strK17, zJ4, zJ, jM15, strK18, jM9, iL4, zJ5, zJ2, boolValueOf, jM10, arrayList3, strK9, strK10, strK19, zJ3, jM11, iL7, strK11, iL5, jM12, strK20, strK12, jM13, iL6, jM14);
            case 7:
                int iT8 = coil3.svg.internal.a.T(parcel);
                Intent intent = null;
                int iL8 = 0;
                int iL9 = 0;
                while (parcel.dataPosition() < iT8) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        iL8 = coil3.svg.internal.a.L(parcel, i10);
                    } else if (c3 == 2) {
                        iL9 = coil3.svg.internal.a.L(parcel, i10);
                    } else if (c3 != 3) {
                        coil3.svg.internal.a.S(parcel, i10);
                    } else {
                        intent = (Intent) coil3.svg.internal.a.j(parcel, i10, Intent.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT8);
                return new com.google.android.gms.signin.internal.b(iL8, iL9, intent);
            case 8:
                int iT9 = coil3.svg.internal.a.T(parcel);
                ArrayList<String> arrayList4 = null;
                String strK21 = null;
                while (parcel.dataPosition() < iT9) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        int iN7 = coil3.svg.internal.a.N(parcel, i11);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iN7 == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iN7);
                            arrayList4 = arrayListCreateStringArrayList2;
                        }
                    } else if (c4 != 2) {
                        coil3.svg.internal.a.S(parcel, i11);
                    } else {
                        strK21 = coil3.svg.internal.a.k(parcel, i11);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT9);
                return new com.google.android.gms.signin.internal.d(strK21, arrayList4);
            case 9:
                int iT10 = coil3.svg.internal.a.T(parcel);
                com.google.android.gms.common.b bVar = null;
                int iL10 = 0;
                com.google.android.gms.common.internal.r rVar = null;
                while (parcel.dataPosition() < iT10) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iL10 = coil3.svg.internal.a.L(parcel, i12);
                    } else if (c5 == 2) {
                        bVar = (com.google.android.gms.common.b) coil3.svg.internal.a.j(parcel, i12, com.google.android.gms.common.b.CREATOR);
                    } else if (c5 != 3) {
                        coil3.svg.internal.a.S(parcel, i12);
                    } else {
                        rVar = (com.google.android.gms.common.internal.r) coil3.svg.internal.a.j(parcel, i12, com.google.android.gms.common.internal.r.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT10);
                return new com.google.android.gms.signin.internal.e(iL10, bVar, rVar);
            default:
                int iT11 = coil3.svg.internal.a.T(parcel);
                Bundle bundleF2 = null;
                while (parcel.dataPosition() < iT11) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        coil3.svg.internal.a.S(parcel, i13);
                    } else {
                        bundleF2 = coil3.svg.internal.a.f(parcel, i13);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT11);
                return new com.google.firebase.messaging.m(bundleF2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new u[i];
            case 1:
                return new y3[i];
            case 2:
                return new b4[i];
            case 3:
                return new c4[i];
            case 4:
                return new d4[i];
            case 5:
                return new m4[i];
            case 6:
                return new r4[i];
            case 7:
                return new com.google.android.gms.signin.internal.b[i];
            case 8:
                return new com.google.android.gms.signin.internal.d[i];
            case 9:
                return new com.google.android.gms.signin.internal.e[i];
            default:
                return new com.google.firebase.messaging.m[i];
        }
    }
}
