package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public final int a;

    public p(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(k kVar);

    public abstract com.google.android.gms.common.d[] b(k kVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(k kVar);

    public abstract void f(androidx.work.impl.k kVar, boolean z);
}
