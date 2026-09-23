package androidx.window.layout;

import android.os.Build;
import androidx.window.layout.util.e;
import androidx.window.layout.util.f;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {
    public final e b;

    public d() {
        this.b = Build.VERSION.SDK_INT >= 34 ? f.b : androidx.window.layout.util.c.f;
        q.a(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
