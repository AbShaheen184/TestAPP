package org.schabi.newpipe.extractor.services.bandcamp.linkHandler;

import java.util.List;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i0 {
    public static final b b = new b(4);

    @Override // kotlin.collections.i0
    public final String h(String str) {
        List list = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a;
        return str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+") ? str.split("bandcamp.com/\\?show=")[1] : i(str);
    }

    @Override // kotlin.collections.i0
    public final String i(String str) {
        return str.matches("\\d+") ? "https://bandcamp.com/?show=".concat(str) : g.l(str);
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        List list = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a;
        if (str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+")) {
            return true;
        }
        if (str.toLowerCase().matches("https?://.+\\..+/track/.+")) {
            return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(str);
        }
        return false;
    }
}
