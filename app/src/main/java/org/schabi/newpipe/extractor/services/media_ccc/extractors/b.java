package org.schabi.newpipe.extractor.services.media_ccc.extractors;

import androidx.compose.runtime.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Pattern a = Pattern.compile("\\w+/\\w+");
    public static com.grack.nanojson.b b = null;

    public static List a(String str) {
        if (g.h(str)) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {new org.schabi.newpipe.extractor.a(-1, str, -1, 4)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return j.r(obj, arrayList, obj, arrayList);
    }

    public static List b(com.grack.nanojson.c cVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        String strF = cVar.f(str, null);
        if (!g.h(strF)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, strF, -1, 2));
        }
        String strF2 = cVar.f(str2, null);
        if (!g.h(strF2)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, strF2, -1, 1));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
