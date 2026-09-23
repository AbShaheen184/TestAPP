package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends n5 implements i0 {
    public final j4 d;
    public Boolean e;
    public String f;

    public w1(j4 j4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.x.g(j4Var);
        this.d = j4Var;
        this.f = null;
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List B(String str, String str2, boolean z, r4 r4Var) {
        h(r4Var);
        String str3 = r4Var.e;
        com.google.android.gms.common.internal.x.g(str3);
        j4 j4Var = this.d;
        try {
            List<n4> list = (List) j4Var.e().C(new t1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (n4 n4Var : list) {
                if (z || !p4.a0(n4Var.c)) {
                    arrayList.add(new m4(n4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            j4Var.b().C.c(u0.D(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            j4Var.b().C.c(u0.D(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void C(u uVar, r4 r4Var) {
        com.google.android.gms.common.internal.x.g(uVar);
        h(r4Var);
        I(new androidx.core.provider.m(6, this, uVar, r4Var, false));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final String D(r4 r4Var) {
        h(r4Var);
        j4 j4Var = this.d;
        try {
            return (String) j4Var.e().C(new q1(j4Var, r4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            j4Var.b().C.c(u0.D(r4Var.e), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List E(String str, String str2, r4 r4Var) {
        h(r4Var);
        String str3 = r4Var.e;
        com.google.android.gms.common.internal.x.g(str3);
        j4 j4Var = this.d;
        try {
            return (List) j4Var.e().C(new t1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            j4Var.b().C.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void G(r4 r4Var) {
        com.google.android.gms.common.internal.x.d(r4Var.e);
        com.google.android.gms.common.internal.x.g(r4Var.P);
        c(new r1(this, r4Var, 4));
    }

    public final void H(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        j4 j4Var = this.d;
        if (zIsEmpty) {
            j4Var.b().C.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.e == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f) && !com.google.android.gms.common.util.b.b(j4Var.I.e, Binder.getCallingUid()) && !com.google.android.gms.common.h.a(j4Var.I.e).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.e = Boolean.valueOf(z2);
                }
                if (this.e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                j4Var.b().C.b(u0.D(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f == null) {
            Context context = j4Var.I.e;
            int callingUid = Binder.getCallingUid();
            int i = com.google.android.gms.common.g.e;
            if (com.google.android.gms.common.util.b.e(callingUid, context, str)) {
                this.f = str;
            }
        }
        if (str.equals(this.f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void I(Runnable runnable) {
        j4 j4Var = this.d;
        if (j4Var.e().B()) {
            runnable.run();
        } else {
            j4Var.e().E(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        j4 j4Var = this.d;
        ArrayList arrayList = null;
        k0 j0Var = null;
        m0 l0Var = null;
        switch (i) {
            case 1:
                u uVar = (u) o5.a(parcel, u.CREATOR);
                r4 r4Var = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                C(uVar, r4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                m4 m4Var = (m4) o5.a(parcel, m4.CREATOR);
                r4 r4Var2 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                t(m4Var, r4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                r4 r4Var3 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                x(r4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) o5.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                o5.d(parcel);
                com.google.android.gms.common.internal.x.g(uVar2);
                com.google.android.gms.common.internal.x.d(string);
                H(string, true);
                I(new androidx.core.provider.m(7, this, uVar2, string, false));
                parcel2.writeNoException();
                return true;
            case 6:
                r4 r4Var4 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                q(r4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                r4 r4Var5 = (r4) o5.a(parcel, r4.CREATOR);
                byte b = parcel.readInt() != 0;
                o5.d(parcel);
                h(r4Var5);
                String str = r4Var5.e;
                com.google.android.gms.common.internal.x.g(str);
                try {
                    List<n4> list2 = (List) j4Var.e().C(new q1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (n4 n4Var : list2) {
                        if (b != false || !p4.a0(n4Var.c)) {
                            arrayList2.add(new m4(n4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    j4Var.b().C.c(u0.D(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    j4Var.b().C.c(u0.D(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) o5.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                o5.d(parcel);
                byte[] bArrN = n(uVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                o5.d(parcel);
                k(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                r4 r4Var6 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                String strD = D(r4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 12:
                e eVar = (e) o5.a(parcel, e.CREATOR);
                r4 r4Var7 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                i(eVar, r4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) o5.a(parcel, e.CREATOR);
                o5.d(parcel);
                com.google.android.gms.common.internal.x.g(eVar2);
                com.google.android.gms.common.internal.x.g(eVar2.z);
                com.google.android.gms.common.internal.x.d(eVar2.e);
                H(eVar2.e, true);
                I(new com.google.common.util.concurrent.k0(15, this, new e(eVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = o5.a;
                z = parcel.readInt() != 0;
                r4 r4Var8 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                List listB = B(string6, string7, z, r4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = o5.a;
                z = parcel.readInt() != 0;
                o5.d(parcel);
                List listF = f(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                r4 r4Var9 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                List listE = E(string11, string12, r4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                o5.d(parcel);
                List listM = m(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 18:
                r4 r4Var10 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                l(r4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
                r4 r4Var11 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                v(bundle, r4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                r4 r4Var12 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                G(r4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                r4 r4Var13 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                i iVarU = u(r4Var13);
                parcel2.writeNoException();
                if (iVarU == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarU.writeToParcel(parcel2, 1);
                return true;
            case 24:
                r4 r4Var14 = (r4) o5.a(parcel, r4.CREATOR);
                Bundle bundle2 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                h(r4Var14);
                String str2 = r4Var14.e;
                com.google.android.gms.common.internal.x.g(str2);
                if (!j4Var.f0().G(null, f0.T0)) {
                    try {
                        list = (List) j4Var.e().C(new u1(this, r4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        j4Var.b().C.c(u0.D(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) j4Var.e().D(new u1(this, r4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        j4Var.b().C.c(u0.D(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                r4 r4Var15 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                o(r4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                r4 r4Var16 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                r(r4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                r4 r4Var17 = (r4) o5.a(parcel, r4.CREATOR);
                o5.d(parcel);
                z(r4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                r4 r4Var18 = (r4) o5.a(parcel, r4.CREATOR);
                c4 c4Var = (c4) o5.a(parcel, c4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    l0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new l0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                o5.d(parcel);
                e(r4Var18, c4Var, l0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                r4 r4Var19 = (r4) o5.a(parcel, r4.CREATOR);
                d dVar = (d) o5.a(parcel, d.CREATOR);
                o5.d(parcel);
                s(r4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                r4 r4Var20 = (r4) o5.a(parcel, r4.CREATOR);
                Bundle bundle3 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j0Var = iInterfaceQueryLocalInterface2 instanceof k0 ? (k0) iInterfaceQueryLocalInterface2 : new j0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                o5.d(parcel);
                p(r4Var20, bundle3, j0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void c(Runnable runnable) {
        j4 j4Var = this.d;
        if (j4Var.e().B()) {
            runnable.run();
        } else {
            j4Var.e().G(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void e(r4 r4Var, c4 c4Var, m0 m0Var) {
        h(r4Var);
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        this.d.e().E(new androidx.appcompat.view.menu.e(this, str, c4Var, m0Var, 2, false));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List f(String str, String str2, String str3, boolean z) {
        H(str, true);
        j4 j4Var = this.d;
        try {
            List<n4> list = (List) j4Var.e().C(new t1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (n4 n4Var : list) {
                if (z || !p4.a0(n4Var.c)) {
                    arrayList.add(new m4(n4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            j4Var.b().C.c(u0.D(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            j4Var.b().C.c(u0.D(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void h(r4 r4Var) {
        com.google.android.gms.common.internal.x.g(r4Var);
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        H(str, false);
        this.d.l0().B(r4Var.y);
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void i(e eVar, r4 r4Var) {
        com.google.android.gms.common.internal.x.g(eVar);
        com.google.android.gms.common.internal.x.g(eVar.z);
        h(r4Var);
        e eVar2 = new e(eVar);
        eVar2.e = r4Var.e;
        I(new androidx.core.provider.m(5, this, eVar2, r4Var, false));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void k(long j, String str, String str2, String str3) {
        I(new s1(this, str2, str3, str, j, 0));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void l(r4 r4Var) {
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        H(str, false);
        I(new r1(this, r4Var, 3));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final List m(String str, String str2, String str3) {
        H(str, true);
        j4 j4Var = this.d;
        try {
            return (List) j4Var.e().C(new t1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            j4Var.b().C.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final byte[] n(u uVar, String str) {
        com.google.android.gms.common.internal.x.d(str);
        com.google.android.gms.common.internal.x.g(uVar);
        H(str, true);
        j4 j4Var = this.d;
        s0 s0Var = j4Var.b().J;
        p1 p1Var = j4Var.I;
        q0 q0Var = p1Var.G;
        String str2 = uVar.e;
        s0Var.b(q0Var.a(str2), "Log and bundle. event");
        j4Var.c().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) j4Var.e().D(new h1(this, uVar, str)).get();
            if (bArr == null) {
                j4Var.b().C.b(u0.D(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            j4Var.c().getClass();
            j4Var.b().J.d("Log and bundle processed. event, size, time_ms", p1Var.G.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            j4Var.b().C.d("Failed to log and bundle. appId, event, error", u0.D(str), p1Var.G.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            j4Var.b().C.d("Failed to log and bundle. appId, event, error", u0.D(str), p1Var.G.a(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void o(r4 r4Var) {
        com.google.android.gms.common.internal.x.d(r4Var.e);
        com.google.android.gms.common.internal.x.g(r4Var.P);
        c(new r1(this, r4Var, 6));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void p(r4 r4Var, Bundle bundle, k0 k0Var) {
        h(r4Var);
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        this.d.e().E(new v1(this, r4Var, bundle, k0Var, str));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void q(r4 r4Var) {
        h(r4Var);
        I(new r1(this, r4Var, 2));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void r(r4 r4Var) {
        com.google.android.gms.common.internal.x.d(r4Var.e);
        com.google.android.gms.common.internal.x.g(r4Var.P);
        c(new r1(this, r4Var, 5));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void s(r4 r4Var, d dVar) {
        h(r4Var);
        I(new androidx.core.provider.m(9, this, r4Var, dVar));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void t(m4 m4Var, r4 r4Var) {
        com.google.android.gms.common.internal.x.g(m4Var);
        h(r4Var);
        I(new androidx.core.provider.m(8, this, m4Var, r4Var, false));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final i u(r4 r4Var) {
        h(r4Var);
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        j4 j4Var = this.d;
        try {
            return (i) j4Var.e().D(new q1(this, r4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            j4Var.b().C.c(u0.D(str), e, "Failed to get consent. appId");
            return new i(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void v(Bundle bundle, r4 r4Var) {
        h(r4Var);
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.g(str);
        I(new androidx.appcompat.view.menu.e(this, bundle, str, r4Var, 4, false));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void x(r4 r4Var) {
        h(r4Var);
        I(new r1(this, r4Var, 0));
    }

    @Override // com.google.android.gms.measurement.internal.i0
    public final void z(r4 r4Var) {
        h(r4Var);
        I(new r1(this, r4Var, 1));
    }
}
