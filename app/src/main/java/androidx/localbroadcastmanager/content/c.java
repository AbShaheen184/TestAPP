package androidx.localbroadcastmanager.content;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Object d = new Object();
    public static c e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public c(Context context) {
        new a(this, context.getMainLooper(), 0);
    }
}
