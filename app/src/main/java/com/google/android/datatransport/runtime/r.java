package com.google.android.datatransport.runtime;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.android.datatransport.f {
    public final Set a;
    public final k b;
    public final s c;

    public r(Set set, k kVar, s sVar) {
        this.a = set;
        this.b = kVar;
        this.c = sVar;
    }

    public final androidx.compose.runtime.internal.c a(String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new androidx.compose.runtime.internal.c(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
