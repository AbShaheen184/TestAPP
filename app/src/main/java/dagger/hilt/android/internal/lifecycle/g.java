package dagger.hilt.android.internal.lifecycle;

import android.os.Looper;
import androidx.compose.runtime.j;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final HashSet a = new HashSet();

    public final void a() {
        if (dagger.hilt.android.internal.b.a == null) {
            dagger.hilt.android.internal.b.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != dagger.hilt.android.internal.b.a) {
            kotlinx.coroutines.future.a.u("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw j.b(it);
        }
    }
}
