package org.schabi.newpipe.extractor.services.peertube.extractors;

import androidx.appcompat.widget.x;
import androidx.compose.runtime.j;
import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.schabi.newpipe.extractor.k;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends org.schabi.newpipe.extractor.playlist.a {
    public final /* synthetic */ int f;
    public com.grack.nanojson.c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar, int i) {
        super(w0Var, aVar);
        this.f = i;
    }

    @Override // org.schabi.newpipe.extractor.f
    public org.schabi.newpipe.extractor.e E(k kVar) throws org.schabi.newpipe.extractor.exceptions.d {
        com.grack.nanojson.c cVar;
        String str = kVar.e;
        if (g.h(str)) {
            kotlinx.coroutines.future.a.q("Page doesn't contain an URL");
            return null;
        }
        String str2 = (String) ((com.app.mlounge.data.music.e) this.e).r(str).B;
        if (g.f(str2)) {
            cVar = null;
        } else {
            try {
                cVar = (com.grack.nanojson.c) x.p().m(str2);
            } catch (Exception e) {
                org.mozilla.javascript.typedarrays.c.d("Could not parse json data for playlist info", e);
                return null;
            }
        }
        if (cVar == null) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Unable to get PeerTube playlist info");
        }
        androidx.compose.ui.text.android.d.p(cVar);
        long jD = cVar.d("total", 0L);
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(((w0) this.c).y, 2);
        String strE = e();
        try {
            for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.h(cVar, "data")) {
                if (obj instanceof com.grack.nanojson.c) {
                    com.grack.nanojson.c cVarE = (com.grack.nanojson.c) obj;
                    if (cVarE.containsKey("video")) {
                        cVarE = cVarE.e("video");
                    }
                    dVar.b(cVarE.containsKey("videosLength") ? new c(cVarE, strE) : cVarE.containsKey("followersCount") ? new a(cVarE, strE) : new f(cVarE, strE));
                }
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Unable to extract list info", e2);
        }
        k kVar2 = null;
        try {
            String strI = org.schabi.newpipe.extractor.utils.b.i("start=(\\d*)", 1, str);
            if (!g.f(strI)) {
                long j = Long.parseLong(strI) + 12;
                if (j < jD) {
                    kVar2 = new k(str.replace(j.i("start=", strI), "start=" + j), null, null);
                }
            }
        } catch (NumberFormatException | org.schabi.newpipe.extractor.utils.e unused) {
        }
        return new org.schabi.newpipe.extractor.e(dVar, kVar2);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void J() {
        switch (this.f) {
            case 0:
                androidx.compose.ui.text.android.d.c(this.g.e("videoChannel"), e(), "avatars", "avatar");
                break;
            default:
                super.J();
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void K() {
        switch (this.f) {
            case 0:
                this.g.e("videoChannel").f("displayName", null);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public void L() {
        switch (this.f) {
            case 0:
                this.g.e("videoChannel").f("url", null);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List Q() {
        switch (this.f) {
            case 0:
                return androidx.compose.ui.text.android.d.f(this.g, e());
            default:
                String strF = this.g.f("artwork_url", null);
                if (!g.h(strF)) {
                    return org.schabi.newpipe.extractor.services.soundcloud.a.b(strF);
                }
                try {
                    Iterator it = y().a.iterator();
                    while (it.hasNext()) {
                        List list = ((org.schabi.newpipe.extractor.stream.g) it.next()).B;
                        if (!g.i(list)) {
                            return list;
                        }
                    }
                } catch (Exception unused) {
                }
                return Collections.EMPTY_LIST;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List U() {
        switch (this.f) {
            case 0:
                return androidx.compose.ui.text.android.d.c(this.g.e("ownerAccount"), e(), "avatars", "avatar");
            default:
                com.grack.nanojson.c cVar = this.g;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return org.schabi.newpipe.extractor.services.soundcloud.a.b(g.l(cVar.e("user").f("avatar_url", "")));
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String V() {
        switch (this.f) {
            case 0:
                return this.g.e("ownerAccount").f("displayName", null);
            default:
                com.grack.nanojson.c cVar = this.g;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return cVar.e("user").f("username", "");
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String X() {
        switch (this.f) {
            case 0:
                return this.g.e("ownerAccount").f("url", null);
            default:
                com.grack.nanojson.c cVar = this.g;
                List list = org.schabi.newpipe.extractor.services.soundcloud.a.a;
                return g.l(cVar.e("user").f("permalink_url", ""));
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long f0() {
        switch (this.f) {
            case 0:
                return this.g.d("videosLength", 0L);
            default:
                return this.g.d("track_count", 0L);
        }
    }

    @Override // androidx.work.j0
    public final String h() {
        switch (this.f) {
            case 0:
                return this.g.f("displayName", null);
            default:
                return this.g.f("title", null);
        }
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        switch (this.f) {
            case 0:
                try {
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().m((String) eVar.r(((org.schabi.newpipe.extractor.linkhandler.a) this.d).y).B);
                    this.g = cVar;
                    androidx.compose.ui.text.android.d.p(cVar);
                    return;
                } catch (com.grack.nanojson.d e) {
                    throw new org.schabi.newpipe.extractor.exceptions.d("Could not parse json", e);
                }
            default:
                try {
                    this.g = (com.grack.nanojson.c) x.p().m((String) eVar.t(j.k("https://api-v2.soundcloud.com/playlists/", ((org.schabi.newpipe.extractor.linkhandler.b) ((org.schabi.newpipe.extractor.linkhandler.a) this.d)).z, "?client_id=", org.schabi.newpipe.extractor.services.soundcloud.a.a(), "&representation=compact"), null, ((w0) this.c).c()).B);
                    return;
                } catch (com.grack.nanojson.d e2) {
                    org.mozilla.javascript.typedarrays.c.d("Could not parse json response", e2);
                    return;
                }
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        switch (this.f) {
            case 0:
                String strF = this.g.f("description", null);
                return g.h(strF) ? org.schabi.newpipe.extractor.stream.c.z : new org.schabi.newpipe.extractor.stream.c(strF, 3);
            default:
                String strF2 = this.g.f("description", null);
                return g.h(strF2) ? org.schabi.newpipe.extractor.stream.c.z : new org.schabi.newpipe.extractor.stream.c(strF2, 3);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() {
        switch (this.f) {
            case 0:
                return E(new k(androidx.constraintlayout.core.g.c(((org.schabi.newpipe.extractor.linkhandler.a) this.d).y, "/videos?start=0&count=12"), null, null));
            default:
                org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(((w0) this.c).y, 2);
                ArrayList arrayList = new ArrayList();
                this.g.a("tracks").c().forEachOrdered(new org.schabi.newpipe.extractor.services.soundcloud.extractors.a(0, dVar, arrayList));
                return new org.schabi.newpipe.extractor.e(dVar, new k(null, null, arrayList));
        }
    }
}
