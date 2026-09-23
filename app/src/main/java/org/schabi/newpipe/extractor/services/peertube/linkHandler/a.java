package org.schabi.newpipe.extractor.services.peertube.linkHandler;

import androidx.compose.runtime.j;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.linkhandler.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a c = new a(0);
    public static final a d = new a(1);
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    public static String s(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.startsWith("a/")) {
            return "accounts".concat(str.substring(1));
        }
        return str.startsWith("c/") ? "video-channels".concat(str.substring(1)) : str;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public final String h(String str) {
        switch (this.b) {
            case 0:
                return s(org.schabi.newpipe.extractor.utils.b.i("/((accounts|a)|(video-channels|c))/([^/?&#]*)", 0, str));
            default:
                try {
                    return org.schabi.newpipe.extractor.utils.b.i("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", 2, str);
                } catch (f unused) {
                    return org.schabi.newpipe.extractor.utils.b.i("/video-playlists/([^/?&#]*)", 1, str);
                }
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        switch (this.b) {
            case 0:
                try {
                    new URL(str);
                    return str.contains("/accounts/") || str.contains("/a/") || str.contains("/video-channels/") || str.contains("/c/");
                } catch (MalformedURLException unused) {
                    return false;
                }
            default:
                try {
                    new URL(str);
                    h(str);
                    return true;
                } catch (MalformedURLException | f unused2) {
                    return false;
                }
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String q(String str, String str2, List list) {
        String str3;
        switch (this.b) {
            case 0:
                if (str.matches("((accounts|a)|(video-channels|c))/([^/?&#]*)")) {
                    str = s(str);
                    str3 = "/";
                } else {
                    str3 = "/accounts/";
                }
                return j.j(str2, str3, str);
            default:
                return j.j(str2, "/api/v1/video-playlists/", str);
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) {
        switch (this.b) {
            case 0:
                l.c.A.getClass();
                break;
            default:
                l.c.A.getClass();
                break;
        }
        return q(str, "https://framatube.org", list);
    }
}
