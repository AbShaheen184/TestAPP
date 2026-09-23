package com.appsalt.lib;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsalt.Appsalt;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        if (l.a(intent != null ? intent.getAction() : null, "android.intent.action.BOOT_COMPLETED")) {
            String string = context.getSharedPreferences("fg-storage", 0).getString("apiKey", "");
            Appsalt.Companion companion = Appsalt.Companion;
            companion.initialize(context.getApplicationContext());
            if (companion.getLaunchOnBoot()) {
                companion.start(string);
            }
        }
    }
}
