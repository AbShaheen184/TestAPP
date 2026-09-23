package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h {
    public final boolean W;
    public final x1 X;
    public final Bundle Y;
    public final Integer Z;

    public a(Context context, Looper looper, x1 x1Var, Bundle bundle, g gVar, com.google.android.gms.common.api.h hVar) {
        super(context, looper, 44, x1Var, gVar, hVar);
        this.W = true;
        this.X = x1Var;
        this.Y = bundle;
        this.Z = (Integer) x1Var.f;
    }

    @Override // com.google.android.gms.common.internal.e, com.google.android.gms.common.api.c
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.e, com.google.android.gms.common.api.c
    public final boolean l() {
        return this.W;
    }

    @Override // com.google.android.gms.common.internal.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.e
    public final Bundle r() {
        x1 x1Var = this.X;
        boolean zEquals = this.z.getPackageName().equals((String) x1Var.c);
        Bundle bundle = this.Y;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) x1Var.c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
