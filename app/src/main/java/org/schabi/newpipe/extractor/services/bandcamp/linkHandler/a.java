package org.schabi.newpipe.extractor.services.bandcamp.linkHandler;

import com.grack.nanojson.d;
import java.io.IOException;
import java.util.List;
import kotlin.collections.g0;
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
    public String h(String str) throws f {
        switch (this.b) {
            case 0:
                try {
                    return String.valueOf(org.schabi.newpipe.extractor.utils.b.f((String) g0.a.r(g.l(str)).B, "data-band").d("id", 0L));
                } catch (d | IOException | ArrayIndexOutOfBoundsException e) {
                    org.mozilla.javascript.typedarrays.c.d("Download failed", e);
                    return null;
                }
            default:
                return super.h(str);
        }
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        switch (this.b) {
            case 0:
                String lowerCase = str.toLowerCase();
                String[] strArrSplit = lowerCase.split("/");
                if (strArrSplit.length != 3 && strArrSplit.length != 4) {
                    return false;
                }
                if ((strArrSplit.length != 4 || strArrSplit[3].equals("releases") || strArrSplit[3].equals("music") || strArrSplit[3].equals("album") || strArrSplit[3].equals("track")) && !strArrSplit[2].equals("daily.bandcamp.com")) {
                    return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(lowerCase);
                }
                return false;
            default:
                if (str.toLowerCase().matches("https?://.+\\..+/album/.+")) {
                    return org.schabi.newpipe.extractor.services.bandcamp.extractors.b.d(str);
                }
                return false;
        }
    }

    @Override // org.schabi.newpipe.extractor.linkhandler.c
    public final String r(String str, List list) throws f {
        switch (this.b) {
            case 0:
                com.grack.nanojson.c cVarA = org.schabi.newpipe.extractor.services.bandcamp.extractors.b.a(str);
                if (!cVarA.b("error")) {
                    return g.l(cVarA.f("bandcamp_url", null));
                }
                org.mozilla.javascript.typedarrays.c.b("JSON does not contain a channel URL (invalid id?) or is otherwise invalid");
                return null;
            default:
                return g.l(str);
        }
    }
}
