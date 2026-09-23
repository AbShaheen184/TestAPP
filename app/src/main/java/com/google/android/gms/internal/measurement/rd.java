package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class rd {
    public ie a;
    public com.google.common.collect.h0 b;
    public ArrayList c;
    public Uri d;

    public ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = qd.y;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.j.b(it);
            }
            qd qdVar = !arrayList3.isEmpty() ? new qd(outputStream, arrayList3) : null;
            if (qdVar != null) {
                arrayList.add(qdVar);
            }
        }
        Iterator it2 = this.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            androidx.transition.k.h();
            return null;
        }
        throw null;
    }
}
