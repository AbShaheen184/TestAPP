package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ r4 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ m3 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public e3(m3 m3Var, String str, String str2, r4 r4Var, boolean z, b6 b6Var) {
        this.y = str;
        this.z = str2;
        this.A = r4Var;
        this.B = z;
        this.D = b6Var;
        this.C = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        p4 p4Var;
        AtomicReference atomicReference;
        switch (this.e) {
            case 0:
                String str = this.z;
                String str2 = this.y;
                b6 b6Var = (b6) this.D;
                m3 m3Var = this.C;
                Bundle bundle = new Bundle();
                try {
                    try {
                        i0 i0Var = m3Var.A;
                        p1 p1Var = (p1) m3Var.e;
                        if (i0Var == null) {
                            u0 u0Var = p1Var.C;
                            p1.m(u0Var);
                            u0Var.C.c(str2, str, "Failed to get user properties; not connected to service");
                            p4Var = p1Var.F;
                            p1.k(p4Var);
                            p4Var.o0(b6Var, bundle);
                            return;
                        }
                        List<m4> listB = i0Var.B(str2, str, this.B, this.A);
                        Bundle bundle2 = new Bundle();
                        if (listB != null) {
                            for (m4 m4Var : listB) {
                                String str3 = m4Var.B;
                                String str4 = m4Var.y;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = m4Var.A;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = m4Var.D;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            m3Var.I();
                            p4 p4Var2 = p1Var.F;
                            p1.k(p4Var2);
                            p4Var2.o0(b6Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            u0 u0Var2 = ((p1) m3Var.e).C;
                            p1.m(u0Var2);
                            u0Var2.C.c(str2, e, "Failed to get user properties; remote exception");
                            p4Var = ((p1) m3Var.e).F;
                            p1.k(p4Var);
                            p4Var.o0(b6Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            p4 p4Var3 = ((p1) m3Var.e).F;
                            p1.k(p4Var3);
                            p4Var3.o0(b6Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.D;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m3 m3Var2 = this.C;
                            i0 i0Var2 = m3Var2.A;
                            if (i0Var2 == null) {
                                u0 u0Var3 = ((p1) m3Var2.e).C;
                                p1.m(u0Var3);
                                u0Var3.C.d("(legacy) Failed to get user properties; not connected to service", null, this.y, this.z);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(i0Var2.B(this.y, this.z, this.B, this.A));
                            } else {
                                atomicReference2.set(i0Var2.f(null, this.y, this.z, this.B));
                            }
                            m3Var2.I();
                            atomicReference = (AtomicReference) this.D;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            u0 u0Var4 = ((p1) this.C.e).C;
                            p1.m(u0Var4);
                            u0Var4.C.d("(legacy) Failed to get user properties; remote exception", null, this.y, e3);
                            ((AtomicReference) this.D).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.D;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.D).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public e3(m3 m3Var, AtomicReference atomicReference, String str, String str2, r4 r4Var, boolean z) {
        this.D = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = r4Var;
        this.B = z;
        this.C = m3Var;
    }
}
