package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import java.util.List;
import org.jsoup.nodes.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements org.schabi.newpipe.extractor.playlist.d {
    public final j a;

    public e(j jVar) {
        this.a = jVar;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String b() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final long d() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.playlist.d
    public final String e() {
        return this.a.V("by-artist").d().replace("by ", "");
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.V("release-title").d();
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.V("album-link").b("abs:href");
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return b.c(this.a.V("album-art").b("src"));
    }
}
