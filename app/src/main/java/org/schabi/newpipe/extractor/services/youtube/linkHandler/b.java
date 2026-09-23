package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import androidx.compose.runtime.j;
import j$.net.URLEncoder;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.services.youtube.i;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends org.schabi.newpipe.extractor.linkhandler.c {
    public static final b c = new b(0);
    public static final b d = new b(1);
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public /* bridge */ /* synthetic */ org.schabi.newpipe.extractor.linkhandler.a f(String str) {
        switch (this.b) {
            case 0:
                return f(str);
            default:
                return super.f(str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public final String h(String str) throws f {
        switch (this.b) {
            case 0:
                try {
                    URL urlM = g.m(str);
                    if (!g.g(urlM) || (!i.x(urlM) && !i.i.contains(urlM.getHost().toLowerCase(Locale.ROOT)))) {
                        throw new f("the url given is not a YouTube-URL");
                    }
                    String path = urlM.getPath();
                    if (!path.equals("/watch") && !path.equals("/playlist")) {
                        throw new f("the url given is neither a video nor a playlist URL");
                    }
                    String strD = g.d(urlM, "list");
                    if (strD == null) {
                        throw new f("the URL given does not include a playlist");
                    }
                    if (strD.matches("[a-zA-Z0-9_-]{10,}")) {
                        return strD;
                    }
                    throw new f("the list-ID given in the URL does not match the list pattern");
                } catch (Exception e) {
                    throw new f(j.i("Error could not parse URL: ", e.getMessage()), e);
                }
            default:
                return "";
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        switch (this.b) {
            case 0:
                try {
                    h(str);
                    return true;
                } catch (f unused) {
                    return false;
                }
            default:
                return false;
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    /* JADX INFO: renamed from: p */
    public org.schabi.newpipe.extractor.linkhandler.b f(String str) throws f {
        switch (this.b) {
            case 0:
                try {
                    URL urlM = g.m(str);
                    String strD = g.d(urlM, "list");
                    if (strD != null) {
                        String str2 = i.a;
                        if (strD.startsWith("RD")) {
                            String strD2 = g.d(urlM, "v");
                            if (strD2 == null) {
                                strD2 = i.d(strD);
                            }
                            return new org.schabi.newpipe.extractor.linkhandler.b(new org.schabi.newpipe.extractor.linkhandler.a(str, "https://www.youtube.com/watch?v=" + strD2 + "&list=" + strD, strD));
                        }
                    }
                    return super.f(str);
                } catch (MalformedURLException e) {
                    throw new f(j.i("Error could not parse URL: ", e.getMessage()), e);
                }
            default:
                return super.f(str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) {
        String strEncode;
        String str2;
        switch (this.b) {
            case 0:
                return j.i("https://www.youtube.com/playlist?list=", str);
            default:
                String str3 = !list.isEmpty() ? (String) list.get(0) : "";
                str3.getClass();
                switch (str3) {
                    case "playlists":
                        Pattern pattern = g.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQA_ABAQ%253D%253D";
                        break;
                    case "music_playlists":
                    case "music_artists":
                    case "music_albums":
                    case "music_songs":
                    case "music_videos":
                        Pattern pattern2 = g.a;
                        return j.i("https://music.youtube.com/search?q=", URLEncoder.encode(str, StandardCharsets.UTF_8));
                    case "videos":
                        Pattern pattern3 = g.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQAfABAQ%253D%253D";
                        break;
                    case "channels":
                        Pattern pattern4 = g.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=EgIQAvABAQ%253D%253D";
                        break;
                    default:
                        Pattern pattern5 = g.a;
                        strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8);
                        str2 = "&sp=8AEB";
                        break;
                }
                return androidx.privacysandbox.ads.adservices.java.internal.a.r("https://www.youtube.com/results?search_query=", strEncode, str2);
        }
    }
}
