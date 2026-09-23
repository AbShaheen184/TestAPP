package org.schabi.newpipe.extractor.services.peertube.extractors;

import androidx.room.b0;
import java.util.List;
import java.util.Objects;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.stream.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class f implements h {
    public final com.grack.nanojson.c a;
    public String b;

    public f(com.grack.nanojson.c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String b() {
        com.grack.nanojson.c cVar = this.a;
        String str = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "account.name", String.class);
        String str2 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "account.host", String.class);
        l.c.getClass();
        return org.schabi.newpipe.extractor.services.peertube.linkHandler.a.c.o(b0.e("accounts/", str, "@", str2), this.b).y;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean c() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.a, "account.displayName", String.class);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long f() {
        return this.a.d("views", 0L);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final boolean g() {
        return false;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final long getDuration() {
        return this.a.d("duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getName() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.a, "name", String.class);
    }

    @Override // org.schabi.newpipe.extractor.d
    public final String getUrl() {
        String str = (String) org.schabi.newpipe.extractor.utils.b.e(this.a, "uuid", String.class);
        l.c.getClass();
        String str2 = this.b;
        Objects.requireNonNull(str, "ID cannot be null");
        return str2 + "/videos/watch/" + str;
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final void h() {
        androidx.compose.ui.text.android.d.c(this.a.e("account"), this.b, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final String m() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.a, "publishedAt", String.class);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final org.schabi.newpipe.extractor.localization.b n() {
        return org.schabi.newpipe.extractor.localization.b.a(m());
    }

    @Override // org.schabi.newpipe.extractor.d
    public final List o() {
        return androidx.compose.ui.text.android.d.f(this.a, this.b);
    }

    @Override // org.schabi.newpipe.extractor.stream.h
    public final int p() {
        return this.a.b("isLive") ? 4 : 2;
    }
}
