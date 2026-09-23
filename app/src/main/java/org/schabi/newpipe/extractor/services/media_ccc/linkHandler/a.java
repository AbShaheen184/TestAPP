package org.schabi.newpipe.extractor.services.media_ccc.linkHandler;

import androidx.compose.runtime.j;
import java.util.List;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.linkhandler.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a b = new a(4);

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public final String h(String str) {
        return org.schabi.newpipe.extractor.utils.b.i("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/conferences/)|(?:media\\.ccc\\.de/[bc]/))([^/?&#]*)", 1, str);
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        try {
            return h(str) != null;
        } catch (f unused) {
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) {
        return j.i("https://media.ccc.de/c/", str);
    }
}
