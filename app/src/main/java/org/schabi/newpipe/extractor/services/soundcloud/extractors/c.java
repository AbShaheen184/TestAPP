package org.schabi.newpipe.extractor.services.soundcloud.extractors;

import java.util.List;
import org.schabi.newpipe.extractor.stream.h;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {
    public final com.grack.nanojson.c a;

    public c(com.grack.nanojson.c cVar) {
        this.a = cVar;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return g.l(this.a.e("user").f("permalink_url", null));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return this.a.e("user").b("verified");
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return this.a.e("user").f("username", null);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() {
        return this.a.d("playback_count", 0L);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() {
        return this.a.d("duration", 0L) / 1000;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("title", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return g.l(this.a.f("permalink_url", null));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void h() {
        org.schabi.newpipe.extractor.services.soundcloud.a.b(this.a.e("user").f("avatar_url", null));
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() {
        return this.a.f("created_at", null);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final org.schabi.newpipe.extractor.localization.b n() {
        return org.schabi.newpipe.extractor.services.soundcloud.a.d(m());
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return org.schabi.newpipe.extractor.services.soundcloud.a.c(this.a);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        return 3;
    }
}
