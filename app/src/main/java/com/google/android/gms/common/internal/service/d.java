package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public final n W;

    public d(Context context, Looper looper, x1 x1Var, n nVar, k kVar, k kVar2) {
        super(context, looper, 270, x1Var, kVar, kVar2);
        this.W = nVar;
    }

    @Override // com.google.android.gms.common.internal.e, com.google.android.gms.common.api.c
    public final int i() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.e
    public final com.google.android.gms.common.d[] q() {
        return com.google.android.gms.internal.base.d.b;
    }

    @Override // com.google.android.gms.common.internal.e
    public final Bundle r() {
        n nVar = this.W;
        nVar.getClass();
        Bundle bundle = new Bundle();
        String str = nVar.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.e
    public final boolean w() {
        return true;
    }
}
