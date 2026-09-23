package org.schabi.newpipe.extractor.services.soundcloud.linkHandler;

import java.util.regex.Pattern;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i0 {
    public static final b b = new b(4);
    public static final Pattern c = Pattern.compile("^https?://(?:www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/(?!(?:tracks|albums|sets|reposts|followers|following)/?$)[0-9a-z_-]+/?(?:[#?].*)?$|^https?://on\\.soundcloud\\.com/[0-9a-zA-Z]+$");
    public static final Pattern d = Pattern.compile("^https?://api-v2\\.soundcloud.com/(tracks|albums|sets|reposts|followers|following)/([0-9a-z_-]+)/");

    @Override // kotlin.collections.i0
    public final String h(String str) throws f {
        Pattern pattern = d;
        if (pattern.matcher(str).find()) {
            return org.schabi.newpipe.extractor.utils.b.j(pattern, str, 1);
        }
        g.a(c, str);
        try {
            return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
        } catch (Exception e) {
            throw new f(e.getMessage(), e);
        }
    }

    @Override // kotlin.collections.i0
    public final String i(String str) throws f {
        try {
            return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/tracks/" + str);
        } catch (Exception e) {
            throw new f(e.getMessage(), e);
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        return c.matcher(str.toLowerCase()).find();
    }
}
