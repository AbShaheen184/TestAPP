package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public j(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
