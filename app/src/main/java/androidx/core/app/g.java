package androidx.core.app;

import android.app.Notification;
import androidx.compose.animation.core.j2;
import com.google.firebase.messaging.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j2 {
    public CharSequence y;

    @Override // androidx.compose.animation.core.j2
    public final void j(n nVar) {
        new Notification.BigTextStyle((Notification.Builder) nVar.z).setBigContentTitle(null).bigText(this.y);
    }

    @Override // androidx.compose.animation.core.j2
    public final String m() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
