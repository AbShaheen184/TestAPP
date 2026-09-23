package org.schabi.newpipe.extractor.services.peertube.linkHandler;

import androidx.compose.runtime.j;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i0 {
    public static final b b = new b(4);

    @Override // kotlin.collections.i0
    public final String h(String str) {
        return org.schabi.newpipe.extractor.utils.b.i("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", 4, str);
    }

    @Override // kotlin.collections.i0
    public final String i(String str) {
        l.c.A.getClass();
        return j(str, "https://framatube.org");
    }

    @Override // kotlin.collections.i0
    public final String j(String str, String str2) {
        return j.j(str2, "/videos/watch/", str);
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) {
        if (str.contains("/playlist/")) {
            return false;
        }
        try {
            new URL(str);
            h(str);
            return true;
        } catch (MalformedURLException | f unused) {
            return false;
        }
    }
}
