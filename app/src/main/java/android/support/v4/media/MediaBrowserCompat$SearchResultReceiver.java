package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.d;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends d {
    @Override // android.support.v4.os.d
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.K(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
