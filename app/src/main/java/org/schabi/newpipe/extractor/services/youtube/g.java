package org.schabi.newpipe.extractor.services.youtube;

import java.util.regex.Pattern;
import kotlin.collections.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Pattern a = Pattern.compile("player\\\\/([a-z0-9]{8})\\\\/");
    public static final Pattern b = Pattern.compile("\"jsUrl\":\"(/s/player/[A-Za-z0-9]+/player_ias\\.vflset/[A-Za-z_-]+/base\\.js)\"");

    public static String a() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            try {
                return "https://www.youtube.com/s/player/" + org.schabi.newpipe.extractor.utils.b.j(a, (String) g0.a.t("https://www.youtube.com/iframe_api", null, org.schabi.newpipe.extractor.localization.c.z).B, 1) + "/player_ias.vflset/en_GB/base.js";
            } catch (org.schabi.newpipe.extractor.utils.e e) {
                org.mozilla.javascript.typedarrays.c.d("IFrame resource didn't provide JavaScript base player's hash", e);
                return null;
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not fetch IFrame resource", e2);
            return null;
        }
    }
}
