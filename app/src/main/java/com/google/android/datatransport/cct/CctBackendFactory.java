package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.c;
import com.google.android.datatransport.runtime.backends.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public g create(c cVar) {
        com.google.android.datatransport.runtime.backends.b bVar = (com.google.android.datatransport.runtime.backends.b) cVar;
        return new b(bVar.a, bVar.b, bVar.c);
    }
}
