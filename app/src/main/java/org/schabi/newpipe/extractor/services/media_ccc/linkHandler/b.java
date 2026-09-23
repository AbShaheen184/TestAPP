package org.schabi.newpipe.extractor.services.media_ccc.linkHandler;

import androidx.compose.runtime.j;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.utils.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i0 {
    public static final b b = new b(4);

    @Override // kotlin.collections.i0
    public final String h(String str) {
        String strI;
        try {
            strI = org.schabi.newpipe.extractor.utils.b.i("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", 1, str);
        } catch (e unused) {
            strI = null;
        }
        return strI == null ? org.schabi.newpipe.extractor.utils.b.i("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", 1, str) : strI;
    }

    @Override // kotlin.collections.i0
    public final String i(String str) {
        return org.schabi.newpipe.extractor.services.media_ccc.extractors.b.a.matcher(str).find() ? j.i("https://streaming.media.ccc.de/", str) : j.i("https://media.ccc.de/v/", str);
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        try {
            return h(str) != null;
        } catch (f unused) {
        }
    }
}
