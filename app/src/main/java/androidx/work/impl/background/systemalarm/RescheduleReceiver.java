package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.t;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = y.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y.e().a(a, "Received intent " + intent);
        try {
            t tVarB = t.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (t.n) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = tVarB.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    tVarB.i = pendingResultGoAsync;
                    if (tVarB.h) {
                        pendingResultGoAsync.finish();
                        tVarB.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            y.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
