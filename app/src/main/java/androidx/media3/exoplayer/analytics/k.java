package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k c;
    public final String a;
    public final androidx.compose.ui.scrollcapture.h b;

    static {
        new k("");
        c = new k("preload");
    }

    public k(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new androidx.compose.ui.scrollcapture.h(3) : null;
    }

    public final synchronized LogSessionId a() {
        androidx.compose.ui.scrollcapture.h hVar;
        hVar = this.b;
        hVar.getClass();
        return (LogSessionId) hVar.b;
    }
}
