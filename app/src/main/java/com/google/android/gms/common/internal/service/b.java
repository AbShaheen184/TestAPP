package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.work.impl.v;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.measurement.ba;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v {
    public final /* synthetic */ int G;

    public /* synthetic */ b(int i) {
        this.G = i;
    }

    @Override // androidx.work.impl.v
    public com.google.android.gms.common.api.c e(Context context, Looper looper, x1 x1Var, Object obj, g gVar, h hVar) {
        switch (this.G) {
            case 1:
                return new ba(context, looper, 51, x1Var, gVar, hVar);
            case 2:
                x1Var.getClass();
                Integer num = (Integer) x1Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new com.google.android.gms.signin.internal.a(context, looper, x1Var, bundle, gVar, hVar);
            case 3:
                throw androidx.privacysandbox.ads.adservices.java.internal.a.k(obj);
            default:
                return super.e(context, looper, x1Var, obj, gVar, hVar);
        }
    }

    @Override // androidx.work.impl.v
    public /* synthetic */ com.google.android.gms.common.api.c f(Context context, Looper looper, x1 x1Var, Object obj, k kVar, k kVar2) {
        switch (this.G) {
            case 0:
                return new d(context, looper, x1Var, (n) obj, kVar, kVar2);
            default:
                return super.f(context, looper, x1Var, obj, kVar, kVar2);
        }
    }
}
