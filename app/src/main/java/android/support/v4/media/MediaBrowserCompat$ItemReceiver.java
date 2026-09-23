package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d {
    @Override // android.support.v4.os.d
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.K(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
