package android.support.v4.media;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.d;
import androidx.activity.result.j;
import androidx.core.widget.f;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.v0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.t;
import com.google.android.gms.measurement.internal.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static void a(g gVar, Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        int i2 = gVar.e;
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = gVar.y;
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = gVar.z;
        com.google.android.gms.dynamite.g.d0(parcel, 3, 4);
        parcel.writeInt(i4);
        com.google.android.gms.dynamite.g.Z(parcel, 4, gVar.A);
        com.google.android.gms.dynamite.g.W(parcel, 5, gVar.B);
        com.google.android.gms.dynamite.g.a0(parcel, 6, gVar.C, i);
        com.google.android.gms.dynamite.g.T(parcel, 7, gVar.D);
        com.google.android.gms.dynamite.g.Y(parcel, 8, gVar.E, i);
        com.google.android.gms.dynamite.g.a0(parcel, 10, gVar.F, i);
        com.google.android.gms.dynamite.g.a0(parcel, 11, gVar.G, i);
        boolean z = gVar.H;
        com.google.android.gms.dynamite.g.d0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gVar.I;
        com.google.android.gms.dynamite.g.d0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = gVar.J;
        com.google.android.gms.dynamite.g.d0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        com.google.android.gms.dynamite.g.Z(parcel, 15, gVar.K);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        int iL = 0;
        android.support.v4.os.b bVar = null;
        Bundle bundleF = null;
        Bundle bundleF2 = null;
        Bundle bundleF3 = null;
        Account account = null;
        ArrayList arrayListM = null;
        String strK = null;
        String strK2 = null;
        switch (this.a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);
                    public final int e;
                    public final MediaDescriptionCompat y;

                    {
                        this.e = parcel.readInt();
                        this.y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.e + ", mDescription=" + this.y + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.e);
                        this.y.writeToParcel(parcel2, i);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = b.g(mediaDescription);
                CharSequence charSequenceI = b.i(mediaDescription);
                CharSequence charSequenceH = b.h(mediaDescription);
                CharSequence charSequenceC = b.c(mediaDescription);
                Bitmap bitmapE = b.e(mediaDescription);
                Uri uriF = b.f(mediaDescription);
                Bundle bundleD = b.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.K(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = c.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.F = mediaDescription;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                d dVar = new d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = android.support.v4.os.c.e;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.b.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.b)) {
                        android.support.v4.os.a aVar = new android.support.v4.os.a();
                        aVar.d = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (android.support.v4.os.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.e = bVar;
                return dVar;
            case 5:
                parcel.getClass();
                return new androidx.activity.result.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 6:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 7:
                f fVar = new f(parcel);
                fVar.e = parcel.readInt();
                return fVar;
            case 8:
                r rVar = new r();
                rVar.e = parcel.readInt();
                rVar.y = parcel.readInt();
                rVar.z = parcel.readInt() == 1;
                return rVar;
            case 9:
                u0 u0Var = new u0();
                u0Var.e = parcel.readInt();
                u0Var.y = parcel.readInt();
                u0Var.A = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    u0Var.z = iArr;
                    parcel.readIntArray(iArr);
                }
                return u0Var;
            case 10:
                v0 v0Var = new v0();
                v0Var.e = parcel.readInt();
                v0Var.y = parcel.readInt();
                int i3 = parcel.readInt();
                v0Var.z = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    v0Var.A = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                v0Var.B = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    v0Var.C = iArr3;
                    parcel.readIntArray(iArr3);
                }
                v0Var.E = parcel.readInt() == 1;
                v0Var.F = parcel.readInt() == 1;
                v0Var.G = parcel.readInt() == 1;
                v0Var.D = parcel.readArrayList(u0.class.getClassLoader());
                return v0Var;
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                int iT = coil3.svg.internal.a.T(parcel);
                long jM = 0;
                int iL2 = 0;
                String strK3 = null;
                String strK4 = null;
                String strK5 = null;
                String strK6 = null;
                Uri uri = null;
                String strK7 = null;
                String strK8 = null;
                ArrayList arrayListM2 = null;
                String strK9 = null;
                String strK10 = null;
                while (parcel.dataPosition() < iT) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iL2 = coil3.svg.internal.a.L(parcel, i5);
                            break;
                        case 2:
                            strK3 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case 3:
                            strK4 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case 4:
                            strK5 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case 5:
                            strK6 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) coil3.svg.internal.a.j(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strK7 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case '\b':
                            jM = coil3.svg.internal.a.M(parcel, i5);
                            break;
                        case '\t':
                            strK8 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case '\n':
                            arrayListM2 = coil3.svg.internal.a.m(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strK9 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        case '\f':
                            strK10 = coil3.svg.internal.a.k(parcel, i5);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i5);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT);
                return new GoogleSignInAccount(iL2, strK3, strK4, strK5, strK6, uri, strK7, jM, strK8, arrayListM2, strK9, strK10);
            case 13:
                int iT2 = coil3.svg.internal.a.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iL = coil3.svg.internal.a.L(parcel, i6);
                    } else if (c != 2) {
                        coil3.svg.internal.a.S(parcel, i6);
                    } else {
                        strK2 = coil3.svg.internal.a.k(parcel, i6);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT2);
                return new Scope(iL, strK2);
            case 14:
                int iT3 = coil3.svg.internal.a.T(parcel);
                PendingIntent pendingIntent = null;
                com.google.android.gms.common.b bVar2 = null;
                while (parcel.dataPosition() < iT3) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        iL = coil3.svg.internal.a.L(parcel, i7);
                    } else if (c2 == 2) {
                        strK = coil3.svg.internal.a.k(parcel, i7);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) coil3.svg.internal.a.j(parcel, i7, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        coil3.svg.internal.a.S(parcel, i7);
                    } else {
                        bVar2 = (com.google.android.gms.common.b) coil3.svg.internal.a.j(parcel, i7, com.google.android.gms.common.b.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT3);
                return new Status(iL, strK, pendingIntent, bVar2);
            case 15:
                int iT4 = coil3.svg.internal.a.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iL = coil3.svg.internal.a.L(parcel, i8);
                    } else if (c3 != 2) {
                        coil3.svg.internal.a.S(parcel, i8);
                    } else {
                        arrayListM = coil3.svg.internal.a.m(parcel, i8, com.google.android.gms.common.internal.j.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT4);
                return new m(iL, arrayListM);
            case 16:
                int iT5 = coil3.svg.internal.a.T(parcel);
                int iL3 = -1;
                long jM2 = 0;
                long jM3 = 0;
                int iL4 = 0;
                int iL5 = 0;
                int iL6 = 0;
                int iL7 = 0;
                String strK11 = null;
                String strK12 = null;
                while (parcel.dataPosition() < iT5) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iL4 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case 2:
                            iL5 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case 3:
                            iL6 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case 4:
                            jM2 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 5:
                            jM3 = coil3.svg.internal.a.M(parcel, i9);
                            break;
                        case 6:
                            strK11 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case 7:
                            strK12 = coil3.svg.internal.a.k(parcel, i9);
                            break;
                        case '\b':
                            iL7 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        case '\t':
                            iL3 = coil3.svg.internal.a.L(parcel, i9);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i9);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT5);
                return new com.google.android.gms.common.internal.j(iL4, iL5, iL6, jM2, jM3, strK11, strK12, iL7, iL3);
            case 17:
                int iT6 = coil3.svg.internal.a.T(parcel);
                int iL8 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iT6) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iL = coil3.svg.internal.a.L(parcel, i10);
                    } else if (c4 == 2) {
                        account = (Account) coil3.svg.internal.a.j(parcel, i10, Account.CREATOR);
                    } else if (c4 == 3) {
                        iL8 = coil3.svg.internal.a.L(parcel, i10);
                    } else if (c4 != 4) {
                        coil3.svg.internal.a.S(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) coil3.svg.internal.a.j(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT6);
                return new q(iL, account, iL8, googleSignInAccount);
            case 18:
                int iT7 = coil3.svg.internal.a.T(parcel);
                int iL9 = 0;
                boolean zJ = false;
                boolean zJ2 = false;
                IBinder iBinderK = null;
                com.google.android.gms.common.b bVar3 = null;
                while (parcel.dataPosition() < iT7) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iL9 = coil3.svg.internal.a.L(parcel, i11);
                    } else if (c5 == 2) {
                        iBinderK = coil3.svg.internal.a.K(parcel, i11);
                    } else if (c5 == 3) {
                        bVar3 = (com.google.android.gms.common.b) coil3.svg.internal.a.j(parcel, i11, com.google.android.gms.common.b.CREATOR);
                    } else if (c5 == 4) {
                        zJ = coil3.svg.internal.a.J(parcel, i11);
                    } else if (c5 != 5) {
                        coil3.svg.internal.a.S(parcel, i11);
                    } else {
                        zJ2 = coil3.svg.internal.a.J(parcel, i11);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT7);
                return new com.google.android.gms.common.internal.r(iL9, iBinderK, bVar3, zJ, zJ2);
            case 19:
                int iT8 = coil3.svg.internal.a.T(parcel);
                int iL10 = 0;
                boolean zJ3 = false;
                boolean zJ4 = false;
                int iL11 = 0;
                int iL12 = 0;
                while (parcel.dataPosition() < iT8) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iL10 = coil3.svg.internal.a.L(parcel, i12);
                    } else if (c6 == 2) {
                        zJ3 = coil3.svg.internal.a.J(parcel, i12);
                    } else if (c6 == 3) {
                        zJ4 = coil3.svg.internal.a.J(parcel, i12);
                    } else if (c6 == 4) {
                        iL11 = coil3.svg.internal.a.L(parcel, i12);
                    } else if (c6 != 5) {
                        coil3.svg.internal.a.S(parcel, i12);
                    } else {
                        iL12 = coil3.svg.internal.a.L(parcel, i12);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT8);
                return new l(iL10, zJ3, zJ4, iL11, iL12);
            case 20:
                int iT9 = coil3.svg.internal.a.T(parcel);
                com.google.android.gms.common.d[] dVarArr = null;
                com.google.android.gms.common.internal.f fVar2 = null;
                while (parcel.dataPosition() < iT9) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        bundleF3 = coil3.svg.internal.a.f(parcel, i13);
                    } else if (c7 == 2) {
                        dVarArr = (com.google.android.gms.common.d[]) coil3.svg.internal.a.l(parcel, i13, com.google.android.gms.common.d.CREATOR);
                    } else if (c7 == 3) {
                        iL = coil3.svg.internal.a.L(parcel, i13);
                    } else if (c7 != 4) {
                        coil3.svg.internal.a.S(parcel, i13);
                    } else {
                        fVar2 = (com.google.android.gms.common.internal.f) coil3.svg.internal.a.j(parcel, i13, com.google.android.gms.common.internal.f.CREATOR);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT9);
                f0 f0Var = new f0();
                f0Var.e = bundleF3;
                f0Var.y = dVarArr;
                f0Var.z = iL;
                f0Var.A = fVar2;
                return f0Var;
            case 21:
                int iT10 = coil3.svg.internal.a.T(parcel);
                boolean zJ5 = false;
                boolean zJ6 = false;
                int iL13 = 0;
                l lVar = null;
                int[] iArrI = null;
                int[] iArrI2 = null;
                while (parcel.dataPosition() < iT10) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            lVar = (l) coil3.svg.internal.a.j(parcel, i14, l.CREATOR);
                            break;
                        case 2:
                            zJ5 = coil3.svg.internal.a.J(parcel, i14);
                            break;
                        case 3:
                            zJ6 = coil3.svg.internal.a.J(parcel, i14);
                            break;
                        case 4:
                            iArrI = coil3.svg.internal.a.i(parcel, i14);
                            break;
                        case 5:
                            iL13 = coil3.svg.internal.a.L(parcel, i14);
                            break;
                        case 6:
                            iArrI2 = coil3.svg.internal.a.i(parcel, i14);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i14);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT10);
                return new com.google.android.gms.common.internal.f(lVar, zJ5, zJ6, iArrI, iL13, iArrI2);
            case 22:
                int iT11 = coil3.svg.internal.a.T(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = g.L;
                com.google.android.gms.common.d[] dVarArr2 = g.M;
                com.google.android.gms.common.d[] dVarArr3 = dVarArr2;
                int iL14 = 0;
                int iL15 = 0;
                int iL16 = 0;
                boolean zJ7 = false;
                int iL17 = 0;
                boolean zJ8 = false;
                String strK13 = null;
                IBinder iBinderK2 = null;
                Account account2 = null;
                String strK14 = null;
                while (parcel.dataPosition() < iT11) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iL14 = coil3.svg.internal.a.L(parcel, i15);
                            break;
                        case 2:
                            iL15 = coil3.svg.internal.a.L(parcel, i15);
                            break;
                        case 3:
                            iL16 = coil3.svg.internal.a.L(parcel, i15);
                            break;
                        case 4:
                            strK13 = coil3.svg.internal.a.k(parcel, i15);
                            break;
                        case 5:
                            iBinderK2 = coil3.svg.internal.a.K(parcel, i15);
                            break;
                        case 6:
                            scopeArr = (Scope[]) coil3.svg.internal.a.l(parcel, i15, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = coil3.svg.internal.a.f(parcel, i15);
                            break;
                        case '\b':
                            account2 = (Account) coil3.svg.internal.a.j(parcel, i15, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            coil3.svg.internal.a.S(parcel, i15);
                            break;
                        case '\n':
                            dVarArr2 = (com.google.android.gms.common.d[]) coil3.svg.internal.a.l(parcel, i15, com.google.android.gms.common.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (com.google.android.gms.common.d[]) coil3.svg.internal.a.l(parcel, i15, com.google.android.gms.common.d.CREATOR);
                            break;
                        case '\f':
                            zJ7 = coil3.svg.internal.a.J(parcel, i15);
                            break;
                        case '\r':
                            iL17 = coil3.svg.internal.a.L(parcel, i15);
                            break;
                        case 14:
                            zJ8 = coil3.svg.internal.a.J(parcel, i15);
                            break;
                        case 15:
                            strK14 = coil3.svg.internal.a.k(parcel, i15);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT11);
                return new g(iL14, iL15, iL16, strK13, iBinderK2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, zJ7, iL17, zJ8, strK14);
            case 23:
                int iT12 = coil3.svg.internal.a.T(parcel);
                int iL18 = 0;
                int iL19 = 0;
                PendingIntent pendingIntent2 = null;
                String strK15 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iT12) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iL18 = coil3.svg.internal.a.L(parcel, i16);
                    } else if (c8 == 2) {
                        iL19 = coil3.svg.internal.a.L(parcel, i16);
                    } else if (c8 == 3) {
                        pendingIntent2 = (PendingIntent) coil3.svg.internal.a.j(parcel, i16, PendingIntent.CREATOR);
                    } else if (c8 == 4) {
                        strK15 = coil3.svg.internal.a.k(parcel, i16);
                    } else if (c8 != 5) {
                        coil3.svg.internal.a.S(parcel, i16);
                    } else {
                        int iN = coil3.svg.internal.a.N(parcel, i16);
                        if (iN == 0) {
                            numValueOf = null;
                        } else {
                            coil3.svg.internal.a.V(parcel, iN, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                coil3.svg.internal.a.p(parcel, iT12);
                return new com.google.android.gms.common.b(iL18, iL19, pendingIntent2, strK15, numValueOf);
            case 24:
                int iT13 = coil3.svg.internal.a.T(parcel);
                long jM4 = -1;
                int iL20 = 0;
                boolean zJ9 = false;
                String strK16 = null;
                while (parcel.dataPosition() < iT13) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        strK16 = coil3.svg.internal.a.k(parcel, i17);
                    } else if (c9 == 2) {
                        iL20 = coil3.svg.internal.a.L(parcel, i17);
                    } else if (c9 == 3) {
                        jM4 = coil3.svg.internal.a.M(parcel, i17);
                    } else if (c9 != 4) {
                        coil3.svg.internal.a.S(parcel, i17);
                    } else {
                        zJ9 = coil3.svg.internal.a.J(parcel, i17);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT13);
                return new com.google.android.gms.common.d(strK16, iL20, jM4, zJ9);
            case 25:
                int iT14 = coil3.svg.internal.a.T(parcel);
                long jM5 = -1;
                boolean zJ10 = false;
                int iL21 = 0;
                int iL22 = 0;
                String strK17 = null;
                while (parcel.dataPosition() < iT14) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        zJ10 = coil3.svg.internal.a.J(parcel, i18);
                    } else if (c10 == 2) {
                        strK17 = coil3.svg.internal.a.k(parcel, i18);
                    } else if (c10 == 3) {
                        iL21 = coil3.svg.internal.a.L(parcel, i18);
                    } else if (c10 == 4) {
                        iL22 = coil3.svg.internal.a.L(parcel, i18);
                    } else if (c10 != 5) {
                        coil3.svg.internal.a.S(parcel, i18);
                    } else {
                        jM5 = coil3.svg.internal.a.M(parcel, i18);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT14);
                return new com.google.android.gms.common.q(zJ10, strK17, iL21, iL22, jM5);
            case 26:
                int iT15 = coil3.svg.internal.a.T(parcel);
                long jM6 = 0;
                long jM7 = 0;
                int iL23 = 0;
                while (parcel.dataPosition() < iT15) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        jM6 = coil3.svg.internal.a.M(parcel, i19);
                    } else if (c11 == 2) {
                        iL23 = coil3.svg.internal.a.L(parcel, i19);
                    } else if (c11 != 3) {
                        coil3.svg.internal.a.S(parcel, i19);
                    } else {
                        jM7 = coil3.svg.internal.a.M(parcel, i19);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT15);
                return new com.google.android.gms.measurement.internal.d(jM6, jM7, iL23);
            case 27:
                int iT16 = coil3.svg.internal.a.T(parcel);
                long jM8 = 0;
                long jM9 = 0;
                long jM10 = 0;
                boolean zJ11 = false;
                String strK18 = null;
                String strK19 = null;
                m4 m4Var = null;
                String strK20 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (parcel.dataPosition() < iT16) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strK18 = coil3.svg.internal.a.k(parcel, i20);
                            break;
                        case 3:
                            strK19 = coil3.svg.internal.a.k(parcel, i20);
                            break;
                        case 4:
                            m4Var = (m4) coil3.svg.internal.a.j(parcel, i20, m4.CREATOR);
                            break;
                        case 5:
                            jM8 = coil3.svg.internal.a.M(parcel, i20);
                            break;
                        case 6:
                            zJ11 = coil3.svg.internal.a.J(parcel, i20);
                            break;
                        case 7:
                            strK20 = coil3.svg.internal.a.k(parcel, i20);
                            break;
                        case '\b':
                            uVar = (u) coil3.svg.internal.a.j(parcel, i20, u.CREATOR);
                            break;
                        case '\t':
                            jM9 = coil3.svg.internal.a.M(parcel, i20);
                            break;
                        case '\n':
                            uVar2 = (u) coil3.svg.internal.a.j(parcel, i20, u.CREATOR);
                            break;
                        case 11:
                            jM10 = coil3.svg.internal.a.M(parcel, i20);
                            break;
                        case '\f':
                            uVar3 = (u) coil3.svg.internal.a.j(parcel, i20, u.CREATOR);
                            break;
                        default:
                            coil3.svg.internal.a.S(parcel, i20);
                            break;
                    }
                }
                coil3.svg.internal.a.p(parcel, iT16);
                return new e(strK18, strK19, m4Var, jM8, zJ11, strK20, uVar, jM9, uVar2, jM10, uVar3);
            case 28:
                int iT17 = coil3.svg.internal.a.T(parcel);
                while (parcel.dataPosition() < iT17) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        coil3.svg.internal.a.S(parcel, i21);
                    } else {
                        bundleF2 = coil3.svg.internal.a.f(parcel, i21);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT17);
                return new i(bundleF2);
            default:
                int iT18 = coil3.svg.internal.a.T(parcel);
                while (parcel.dataPosition() < iT18) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        coil3.svg.internal.a.S(parcel, i22);
                    } else {
                        bundleF = coil3.svg.internal.a.f(parcel, i22);
                    }
                }
                coil3.svg.internal.a.p(parcel, iT18);
                return new t(bundleF);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new d[i];
            case 5:
                return new androidx.activity.result.a[i];
            case 6:
                return new j[i];
            case 7:
                return new f[i];
            case 8:
                return new r[i];
            case 9:
                return new u0[i];
            case 10:
                return new v0[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new GoogleSignInAccount[i];
            case 13:
                return new Scope[i];
            case 14:
                return new Status[i];
            case 15:
                return new m[i];
            case 16:
                return new com.google.android.gms.common.internal.j[i];
            case 17:
                return new q[i];
            case 18:
                return new com.google.android.gms.common.internal.r[i];
            case 19:
                return new l[i];
            case 20:
                return new f0[i];
            case 21:
                return new com.google.android.gms.common.internal.f[i];
            case 22:
                return new g[i];
            case 23:
                return new com.google.android.gms.common.b[i];
            case 24:
                return new com.google.android.gms.common.d[i];
            case 25:
                return new com.google.android.gms.common.q[i];
            case 26:
                return new com.google.android.gms.measurement.internal.d[i];
            case 27:
                return new e[i];
            case 28:
                return new i[i];
            default:
                return new t[i];
        }
    }
}
