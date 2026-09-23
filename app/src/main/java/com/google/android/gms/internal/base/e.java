package com.google.android.gms.internal.base;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends _COROUTINE.a {
    public static void d0(Context context, o oVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(oVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(oVar, intentFilter);
        }
    }
}
