package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((d) iInterface).getClass();
        obj.getClass();
        this.a.y.remove((Integer) obj);
    }
}
