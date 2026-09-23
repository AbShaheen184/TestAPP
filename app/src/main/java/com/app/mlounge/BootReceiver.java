package com.app.mlounge;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Log.d("BootReceiver", "Received boot broadcast: " + intent.getAction());
        if (kotlin.jvm.internal.l.a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || kotlin.jvm.internal.l.a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON")) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            com.app.mlounge.util.c.e((Application) applicationContext);
        }
    }
}
