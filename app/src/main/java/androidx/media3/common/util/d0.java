package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final d0 a = new d0();

    public final f0 a(Looper looper, Handler.Callback callback) {
        return new f0(new Handler(looper, callback));
    }
}
