package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.core.view.w0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.o;
import org.jsoup.helper.n;
import org.jsoup.nodes.g;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;
import org.jsoup.select.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends org.schabi.newpipe.extractor.playlist.a {
    public g f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.b h;
    public String i;

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List Q() {
        com.grack.nanojson.c cVar = this.g;
        return (cVar.containsKey("art_id") && cVar.get("art_id") == 0) ? Collections.EMPTY_LIST : b.b(this.g.d("art_id", 0L), true);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List U() {
        return b.c((String) this.f.V("band-photo").stream().map(new androidx.media3.exoplayer.audio.f(18)).findFirst().orElse(""));
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String V() {
        return this.g.f("artist", null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String X() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r("https://", ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y.split("/")[2], "/");
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long f0() {
        return this.h.size();
    }

    @Override // androidx.work.j0
    public final String h() {
        return this.i;
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str = (String) eVar.r(((org.schabi.newpipe.extractor.linkhandler.b) ((org.schabi.newpipe.extractor.linkhandler.a) this.d)).y).B;
        this.f = e0.a(str, "");
        com.grack.nanojson.c cVarC0 = f.c0(str);
        this.g = cVarC0;
        this.h = cVarC0.a("trackinfo");
        try {
            this.i = org.schabi.newpipe.extractor.utils.b.f(str, "data-embed").f("album_title", null);
            if (this.h.isEmpty()) {
                throw new org.schabi.newpipe.extractor.exceptions.a("Album needs to be purchased");
            }
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Faulty JSON; page likely does not contain album data", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            org.mozilla.javascript.typedarrays.c.d("JSON does not exist", e2);
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() throws org.schabi.newpipe.extractor.exceptions.f {
        g gVar = this.f;
        gVar.getClass();
        n.A("trackInfo");
        j jVar = (j) o.B(gVar, j.class).filter(new org.jsoup.select.f(new h(8, "trackInfo", false), gVar, 1)).findFirst().orElse(null);
        if (jVar == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find trackInfo in document");
            return null;
        }
        org.jsoup.select.e eVarV = jVar.V("tralbum-about");
        org.jsoup.select.e eVarV2 = jVar.V("tralbum-credits");
        g gVar2 = this.f;
        gVar2.getClass();
        n.A("license");
        j jVar2 = (j) o.B(gVar2, j.class).filter(new org.jsoup.select.f(new h(8, "license", false), gVar2, 1)).findFirst().orElse(null);
        if (eVarV.isEmpty() && eVarV2.isEmpty() && jVar2 == null) {
            return org.schabi.newpipe.extractor.stream.c.z;
        }
        StringBuilder sb = new StringBuilder();
        if (!eVarV.isEmpty()) {
            j jVar3 = (j) eVarV.c();
            Objects.requireNonNull(jVar3);
            sb.append(jVar3.X());
        }
        if (!eVarV2.isEmpty()) {
            j jVar4 = (j) eVarV2.c();
            Objects.requireNonNull(jVar4);
            sb.append(jVar4.X());
        }
        if (jVar2 != null) {
            sb.append(jVar2.X());
        }
        return new org.schabi.newpipe.extractor.stream.c(sb.toString(), 1);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() {
        w0 w0Var = (w0) this.c;
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        for (int i = 0; i < this.h.size(); i++) {
            com.grack.nanojson.c cVarB = this.h.b(i);
            if (this.h.size() < 10) {
                dVar.A(new org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a(cVarB, X(), w0Var));
            } else {
                String strX = X();
                List listQ = Q();
                org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a aVar = new org.schabi.newpipe.extractor.services.bandcamp.extractors.streaminfoitem.a(cVarB, strX, null);
                aVar.c = listQ;
                dVar.A(aVar);
            }
        }
        return new org.schabi.newpipe.extractor.e(dVar, null);
    }
}
