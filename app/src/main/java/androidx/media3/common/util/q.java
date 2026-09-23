package androidx.media3.common.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static void a(Context context, t tVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            p pVar = new p(tVar);
            telephonyManager.registerTelephonyCallback(tVar.a, pVar);
            telephonyManager.unregisterTelephonyCallback(pVar);
        } catch (RuntimeException unused) {
            tVar.c(5);
        }
    }
}
