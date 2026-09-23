package org.schabi.newpipe.extractor.services.soundcloud.linkHandler;

import androidx.room.b0;
import java.util.List;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.linkhandler.c;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public static final a c = new a(0);
    public static final a d = new a(1);
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c, kotlin.collections.i0
    public final String h(String str) throws f {
        switch (this.b) {
            case 0:
                Pattern pattern = g.a;
                g.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$"), str);
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
                } catch (Exception e) {
                    throw new f(e.getMessage(), e);
                }
            default:
                Pattern pattern2 = g.a;
                g.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/sets/[0-9a-z_-]+/?([#?].*)?$"), str);
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.e(str);
                } catch (Exception e2) {
                    throw new f(b0.e("Could not get id of url: ", str, " ", e2.getMessage()), e2);
                }
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        switch (this.b) {
            case 0:
                return Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$").matcher(str.toLowerCase()).find();
            default:
                return Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/sets/[0-9a-z_-]+/?([#?].*)?$").matcher(str.toLowerCase()).find();
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) throws f {
        switch (this.b) {
            case 0:
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/users/" + str);
                } catch (Exception e) {
                    throw new f(e.getMessage(), e);
                }
            default:
                try {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.f("https://api.soundcloud.com/playlists/" + str);
                } catch (Exception e2) {
                    throw new f(e2.getMessage(), e2);
                }
        }
    }
}
