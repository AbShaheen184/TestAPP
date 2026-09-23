package androidx.media3.extractor;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    n[] a();

    default n[] b(Uri uri, Map map) {
        return a();
    }
}
