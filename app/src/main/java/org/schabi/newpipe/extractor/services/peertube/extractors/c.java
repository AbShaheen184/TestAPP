package org.schabi.newpipe.extractor.services.peertube.extractors;

import java.util.List;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements org.schabi.newpipe.extractor.playlist.d {
    public final com.grack.nanojson.c a;
    public final com.grack.nanojson.c b;
    public final String c;

    public c(com.grack.nanojson.c cVar, String str) {
        this.a = cVar;
        this.b = cVar.e("uploader");
        this.c = str;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final void a() {
        if (g.h(this.a.f("description", null))) {
            org.schabi.newpipe.extractor.stream.c cVar = org.schabi.newpipe.extractor.stream.c.z;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        return this.b.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() {
        return this.a.c("videosLength", 0);
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return this.b.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return androidx.compose.ui.text.android.d.f(this.a, this.c);
    }
}
