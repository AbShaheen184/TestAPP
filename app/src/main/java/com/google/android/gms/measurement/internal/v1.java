package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String y;
    public final /* synthetic */ r4 z;

    public /* synthetic */ v1(w1 w1Var, r4 r4Var, Bundle bundle, k0 k0Var, String str) {
        this.A = w1Var;
        this.z = r4Var;
        this.B = bundle;
        this.C = k0Var;
        this.y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p4 p4Var;
        switch (this.e) {
            case 0:
                w1 w1Var = (w1) this.A;
                r4 r4Var = this.z;
                Bundle bundle = (Bundle) this.B;
                k0 k0Var = (k0) this.C;
                String str = this.y;
                j4 j4Var = w1Var.d;
                j4Var.W();
                try {
                    k0Var.A(j4Var.e0(bundle, r4Var));
                    return;
                } catch (RemoteException e) {
                    j4Var.b().C.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.A;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m3 m3Var = (m3) this.C;
                            i0 i0Var = m3Var.A;
                            if (i0Var == null) {
                                u0 u0Var = ((p1) m3Var.e).C;
                                p1.m(u0Var);
                                u0Var.C.d("(legacy) Failed to get conditional properties; not connected to service", null, this.y, (String) this.B);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(i0Var.E(this.y, (String) this.B, this.z));
                            } else {
                                atomicReference2.set(i0Var.m(null, this.y, (String) this.B));
                            }
                            m3Var.I();
                            atomicReference = (AtomicReference) this.A;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th) {
                            ((AtomicReference) this.A).notify();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        u0 u0Var2 = ((p1) ((m3) this.C).e).C;
                        p1.m(u0Var2);
                        u0Var2.C.d("(legacy) Failed to get conditional properties; remote exception", null, this.y, e2);
                        ((AtomicReference) this.A).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.A;
                    }
                }
                break;
            default:
                b6 b6Var = (b6) this.B;
                String str2 = (String) this.A;
                String str3 = this.y;
                m3 m3Var2 = (m3) this.C;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i0 i0Var2 = m3Var2.A;
                        if (i0Var2 == null) {
                            p1 p1Var = (p1) m3Var2.e;
                            u0 u0Var3 = p1Var.C;
                            p1.m(u0Var3);
                            u0Var3.C.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            p4Var = p1Var.F;
                        } else {
                            arrayList = p4.q0(i0Var2.E(str3, str2, this.z));
                            m3Var2.I();
                            p4Var = ((p1) m3Var2.e).F;
                        }
                    } catch (RemoteException e3) {
                        u0 u0Var4 = ((p1) m3Var2.e).C;
                        p1.m(u0Var4);
                        u0Var4.C.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    p1.k(p4Var);
                    p4Var.p0(b6Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    p4 p4Var2 = ((p1) m3Var2.e).F;
                    p1.k(p4Var2);
                    p4Var2.p0(b6Var, arrayList);
                    throw th2;
                }
        }
    }

    public v1(m3 m3Var, String str, String str2, r4 r4Var, b6 b6Var) {
        this.y = str;
        this.A = str2;
        this.z = r4Var;
        this.B = b6Var;
        this.C = m3Var;
    }

    public v1(m3 m3Var, AtomicReference atomicReference, String str, String str2, r4 r4Var) {
        this.A = atomicReference;
        this.y = str;
        this.B = str2;
        this.z = r4Var;
        this.C = m3Var;
    }
}
