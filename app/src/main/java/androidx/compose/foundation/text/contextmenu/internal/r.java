package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static void a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }
}
