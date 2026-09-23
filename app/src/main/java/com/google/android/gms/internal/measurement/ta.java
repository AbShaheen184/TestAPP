package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta {
    public static final androidx.collection.f a = new androidx.collection.f(0);

    public static synchronized void a() {
        androidx.collection.f fVar = a;
        Iterator it = ((androidx.collection.e) fVar.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        fVar.clear();
    }
}
