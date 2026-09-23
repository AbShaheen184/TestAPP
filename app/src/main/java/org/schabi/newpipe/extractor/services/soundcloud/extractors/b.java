package org.schabi.newpipe.extractor.services.soundcloud.extractors;

import androidx.appcompat.widget.x;
import androidx.compose.runtime.j;
import androidx.core.view.w0;
import androidx.emoji2.text.g;
import androidx.fragment.app.h;
import androidx.room.b0;
import com.app.mlounge.data.music.e;
import j$.net.URLEncoder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.g0;
import org.schabi.newpipe.extractor.channel.d;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {
    public com.grack.nanojson.c f;
    public boolean g;

    @Override // org.schabi.newpipe.extractor.f
    public final long A() {
        return this.f.d("duration", 0L) / 1000;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void B() {
        this.f.f("license", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void C() {
        this.f.d("likes_count", -1L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void F() {
        this.f.f("sharing", null).equals("public");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final g G() throws org.schabi.newpipe.extractor.exceptions.f, IOException {
        d dVar = new d(((w0) this.c).y, 2);
        String strG = g();
        Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
        Charset charset = StandardCharsets.UTF_8;
        h hVarT = g0.a.t(b0.e("https://api-v2.soundcloud.com/tracks/", URLEncoder.encode(strG, charset), "/related?client_id=", URLEncoder.encode(org.schabi.newpipe.extractor.services.soundcloud.a.a(), charset)), null, l.b.c());
        int i = hVarT.y;
        if (i >= 400) {
            kotlinx.coroutines.future.a.w(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Could not get streams from API, HTTP "));
            return null;
        }
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().m((String) hVarT.B);
            for (Object obj : cVar.a("collection")) {
                if (obj instanceof com.grack.nanojson.c) {
                    dVar.A(new c((com.grack.nanojson.c) obj));
                }
            }
            try {
                if (!cVar.f("next_href", null).contains("client_id=")) {
                    org.schabi.newpipe.extractor.services.soundcloud.a.a();
                }
            } catch (Exception unused) {
            }
            return dVar;
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int I() {
        return 3;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        String[] strArrSplit = this.f.f("tag_list", null).split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (String str : strArrSplit) {
            if (str.startsWith("\"")) {
                sb.append(str.replace("\"", ""));
                z = true;
            } else if (z) {
                if (str.endsWith("\"")) {
                    sb.append(" ");
                    sb.append(str.replace("\"", ""));
                    arrayList.add(sb.toString());
                    z = false;
                } else {
                    sb.append(" ");
                    sb.append(str);
                }
            } else if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        return this.f.f("created_at", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Q() {
        return org.schabi.newpipe.extractor.services.soundcloud.a.c(this.f);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void R() throws org.schabi.newpipe.extractor.exceptions.f {
        S("(#t=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void T() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.services.soundcloud.a.d(P());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        com.grack.nanojson.c cVar = this.f;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return org.schabi.newpipe.extractor.services.soundcloud.a.b(org.schabi.newpipe.extractor.utils.g.l(cVar.e("user").f("avatar_url", "")));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String V() {
        com.grack.nanojson.c cVar = this.f;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return cVar.e("user").f("username", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String X() {
        com.grack.nanojson.c cVar = this.f;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        return org.schabi.newpipe.extractor.utils.g.l(cVar.e("user").f("permalink_url", ""));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Y() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Z() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void a0() {
        this.f.d("playback_count", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void b0() {
        this.f.e("user").b("verified");
    }

    public final String c0(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strJ = j.j(str, "?client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a());
        String strF = this.f.f("track_authorization", null);
        if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
            strJ = j.j(strJ, "&track_authorization=", strF);
        }
        try {
            return ((com.grack.nanojson.c) x.p().m((String) g0.a.r(strJ).B)).f("url", null);
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse streamable URL", e);
            return null;
        }
    }

    @Override // androidx.work.j0
    public final String g() {
        return String.valueOf(this.f.d("id", 0L));
    }

    @Override // androidx.work.j0
    public final String h() {
        return this.f.f("title", null);
    }

    @Override // androidx.work.j0
    public final void m(e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y;
        List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
        Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().m((String) eVar.t(b0.e("https://api-v2.soundcloud.com/resolve?url=", URLEncoder.encode(str, StandardCharsets.UTF_8), "&client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a()), null, l.b.c()).B);
            this.f = cVar;
            String strF = cVar.f("policy", "");
            if (strF.equals("ALLOW") || strF.equals("MONETIZE")) {
                return;
            }
            this.g = false;
            if (strF.equals("SNIP")) {
                throw new org.schabi.newpipe.extractor.exceptions.a("This track is a SoundCloud Go+ track");
            }
            if (!strF.equals("BLOCK")) {
                throw new org.schabi.newpipe.extractor.exceptions.b("Content not available: policy ".concat(strF));
            }
            throw new org.schabi.newpipe.extractor.exceptions.a("This track is not available in user's country");
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List p() throws org.schabi.newpipe.extractor.exceptions.d {
        ArrayList arrayList = new ArrayList();
        if (this.f.b("streamable") && this.g) {
            try {
                com.grack.nanojson.b bVarA = this.f.e("media").a("transcodings");
                if (!org.schabi.newpipe.extractor.utils.g.i(bVarA)) {
                    bVarA.c().forEachOrdered(new a(1, this, arrayList));
                    return arrayList;
                }
            } catch (NullPointerException e) {
                throw new org.schabi.newpipe.extractor.exceptions.d("Could not get audio streams", e);
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() {
        this.f.f("genre", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        return new org.schabi.newpipe.extractor.stream.c(this.f.f("description", null), 3);
    }
}
