package com.google.firebase;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z) {
        synchronized (g.k) {
            try {
                for (g gVar : new ArrayList(g.l.values())) {
                    if (gVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).a;
                            if (!z) {
                                ((com.google.firebase.heartbeatinfo.d) gVar2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
