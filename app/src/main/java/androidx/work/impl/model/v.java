package androidx.work.impl.model;

import androidx.compose.material3.internal.r0;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final androidx.room.r a;
    public final b b = new b(6);

    public v(androidx.room.r rVar) {
        this.a = rVar;
    }

    public final void a(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            okhttp3.internal.platform.android.g.t(this.a, false, true, new r0(17, this, new u((String) it.next(), str)));
        }
    }
}
