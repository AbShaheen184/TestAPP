package okhttp3.internal.cache;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {
    public final /* synthetic */ h A;
    public final String e;
    public final long y;
    public final ArrayList z;

    public e(h hVar, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.A = hVar;
        this.e = str;
        this.y = j;
        this.z = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            okhttp3.internal.e.b((h0) it.next());
        }
    }
}
