package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public d(int i, PendingIntent pendingIntent, String str) {
        IconCompat iconCompatB = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatB;
        if (iconCompatB != null && iconCompatB.d() == 2) {
            this.e = iconCompatB.c();
        }
        this.f = h.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
