package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final AtomicLong b = new AtomicLong();
    public final long a;

    public n(androidx.media3.datasource.l lVar, long j) {
        this(lVar, lVar.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public n(androidx.media3.datasource.l lVar, Uri uri, Map map, long j, long j2, long j3) {
        this.a = j2;
    }
}
