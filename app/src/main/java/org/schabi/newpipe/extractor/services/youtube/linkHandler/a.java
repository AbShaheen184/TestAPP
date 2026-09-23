package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import androidx.compose.runtime.j;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.services.youtube.i;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends org.schabi.newpipe.extractor.linkhandler.c {
    public static final a b = new a(4);
    public static final Pattern c = Pattern.compile("playlist|watch|attribution_link|watch_popup|embed|feed|select_site|account|reporthistory|redirect");

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public final String h(String str) throws f {
        try {
            URL urlM = g.m(str);
            String path = urlM.getPath();
            if (!g.g(urlM) || (!i.x(urlM) && !i.i.contains(urlM.getHost().toLowerCase(Locale.ROOT)) && !urlM.getHost().equalsIgnoreCase("hooktube.com"))) {
                throw new f("The URL given is not a YouTube URL");
            }
            String strSubstring = path.substring(1);
            String[] strArrSplit = strSubstring.split("/");
            if ((strArrSplit.length <= 0 || !strArrSplit[0].startsWith("@")) && (strArrSplit.length != 1 || strArrSplit[0].isEmpty() || c.matcher(strArrSplit[0]).matches())) {
                if (!strSubstring.startsWith("user/") && !strSubstring.startsWith("channel/") && !strSubstring.startsWith("c/")) {
                    throw new f("The given URL is not a channel, a user or a handle URL");
                }
                String str2 = strArrSplit[1];
                if (g.f(str2)) {
                    throw new f("The given ID is not a YouTube channel or user ID");
                }
                return strArrSplit[0] + "/" + str2;
            }
            return strArrSplit[0];
        } catch (Exception e) {
            throw new f(j.i("Could not parse URL :", e.getMessage()), e);
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        try {
            h(str);
            return true;
        } catch (f unused) {
            return false;
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) {
        return j.i("https://www.youtube.com/", str);
    }
}
