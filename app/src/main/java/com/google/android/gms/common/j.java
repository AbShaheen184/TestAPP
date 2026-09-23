package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.base.g {
    public final Context a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = eVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = f.a;
        e eVar = this.b;
        Context context = this.a;
        int iB = eVar.b(context, i2);
        int i3 = g.e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(iB, context, "n");
            eVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
