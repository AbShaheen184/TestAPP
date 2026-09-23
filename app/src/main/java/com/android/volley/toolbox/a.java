package com.android.volley.toolbox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public long a;
    public final String b;

    public a(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        "".equals(str2);
    }

    public static a a(b bVar) throws IOException {
        if (androidx.compose.ui.input.pointer.util.b.e(bVar) != 538247942) {
            throw new IOException();
        }
        String strG = androidx.compose.ui.input.pointer.util.b.g(bVar);
        String strG2 = androidx.compose.ui.input.pointer.util.b.g(bVar);
        long jF = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF2 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF3 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        long jF4 = androidx.compose.ui.input.pointer.util.b.f(bVar);
        int iE = androidx.compose.ui.input.pointer.util.b.e(bVar);
        if (iE < 0) {
            kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(iE, "readHeaderList size="));
            return null;
        }
        List arrayList = iE == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iE; i++) {
            arrayList.add(new com.android.volley.b(androidx.compose.ui.input.pointer.util.b.g(bVar).intern(), androidx.compose.ui.input.pointer.util.b.g(bVar).intern()));
        }
        return new a(strG, strG2, jF, jF2, jF3, jF4, arrayList);
    }
}
