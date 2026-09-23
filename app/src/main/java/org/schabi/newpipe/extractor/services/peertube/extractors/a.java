package org.schabi.newpipe.extractor.services.peertube.extractors;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements org.schabi.newpipe.extractor.channel.c {
    public final com.grack.nanojson.c a;
    public final String b;

    public a(com.grack.nanojson.c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final String a() {
        return this.a.f("description", null);
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long d() {
        return -1L;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return this.a.f("displayName", null);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        return this.a.f("url", null);
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final boolean i() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return androidx.compose.ui.text.android.d.c(this.a, this.b, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.channel.c
    public final long q() {
        return this.a.c("followersCount", 0);
    }
}
