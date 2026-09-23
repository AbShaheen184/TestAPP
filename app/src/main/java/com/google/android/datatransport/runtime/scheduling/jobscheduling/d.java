package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.media3.exoplayer.m;
import com.appsalt.internal.k0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ Runnable A;
    public final /* synthetic */ k0 e;
    public final /* synthetic */ com.google.android.datatransport.runtime.k y;
    public final /* synthetic */ int z;

    public /* synthetic */ d(k0 k0Var, com.google.android.datatransport.runtime.k kVar, int i, Runnable runnable) {
        this.e = k0Var;
        this.y = kVar;
        this.z = i;
        this.A = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.datatransport.runtime.k kVar = this.y;
        int i = this.z;
        Runnable runnable = this.A;
        k0 k0Var = this.e;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var.f;
        try {
            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var.c;
            Objects.requireNonNull(gVar2);
            gVar.L(new e(gVar2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) k0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                gVar.L(new m(k0Var, kVar, i));
            } else {
                k0Var.c(kVar, i);
            }
        } catch (com.google.android.datatransport.runtime.synchronization.a unused) {
            ((com.google.android.datatransport.runtime.j) k0Var.d).u(kVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
