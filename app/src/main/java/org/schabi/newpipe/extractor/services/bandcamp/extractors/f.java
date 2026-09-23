package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.compose.runtime.j;
import androidx.core.view.w0;
import androidx.emoji2.text.g;
import com.appsalt.internal.y0;
import j$.time.DateTimeException;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import kotlin.collections.q;
import org.jsoup.parser.e0;
import org.jsoup.select.i;
import org.schabi.newpipe.extractor.h;
import org.schabi.newpipe.extractor.services.youtube.extractors.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class f extends org.schabi.newpipe.extractor.f {
    public final /* synthetic */ int f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.c h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar, int i) {
        super(w0Var, aVar);
        this.f = i;
    }

    public static com.grack.nanojson.c c0(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.utils.b.f(str, "data-tralbum");
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Faulty JSON; page likely does not contain album data", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            org.mozilla.javascript.typedarrays.c.d("JSON does not exist", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.schabi.newpipe.extractor.f
    public long A() {
        switch (this.f) {
            case 0:
                V v = this.g.a("trackinfo").b(0).get("duration");
                return (long) (v instanceof Number ? ((Number) v).doubleValue() : 0.0d);
            default:
                return super.A();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void B() {
        switch (this.f) {
            case 0:
                this.h.c("license_type", 0);
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public /* bridge */ /* synthetic */ g G() {
        switch (this.f) {
            case 0:
                return f0();
            default:
                return super.G();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int I() {
        switch (this.f) {
            case 0:
                return 3;
            default:
                return 4;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List O() {
        switch (this.f) {
            case 0:
                org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) this.i;
                gVar.getClass();
                return (List) q.f(new i("itemprop", "keywords", 0), gVar).stream().map(new androidx.media3.exoplayer.audio.f(9)).collect(Collectors.toList());
            default:
                return super.O();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String P() {
        switch (this.f) {
            case 0:
                return this.h.f("publish_date", null);
            default:
                return super.P();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List Q() {
        switch (this.f) {
            case 0:
                com.grack.nanojson.c cVar = this.g;
                return (cVar.containsKey("art_id") && cVar.get("art_id") == 0) ? Collections.EMPTY_LIST : b.b(this.g.d("art_id", 0L), true);
            default:
                return org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b(this.h, "thumb", "poster");
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void T() throws org.schabi.newpipe.extractor.exceptions.f {
        switch (this.f) {
            case 0:
                String strP = P();
                List list = b.a;
                try {
                    ZonedDateTime.parse(strP, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH)).toInstant();
                    return;
                } catch (DateTimeException e) {
                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not parse date '", strP, "'"), e);
                }
            default:
                return;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List U() {
        switch (this.f) {
            case 0:
                return b.c((String) ((org.jsoup.nodes.g) this.i).V("band-photo").stream().map(new androidx.media3.exoplayer.audio.f(19)).findFirst().orElse(""));
            default:
                return super.U();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String V() {
        switch (this.f) {
            case 0:
                return this.g.f("artist", null);
            default:
                return this.g.f("conference", null);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String X() {
        switch (this.f) {
            case 0:
                return androidx.privacysandbox.ads.adservices.java.internal.a.r("https://", l().split("/")[2], "/");
            default:
                return j.i("https://streaming.media.ccc.de/", this.g.f("slug", null));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Y() {
        switch (this.f) {
            case 0:
                break;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Z() {
        switch (this.f) {
            case 0:
                return Collections.EMPTY_LIST;
            default:
                return g0("video", new androidx.media3.exoplayer.audio.f(26));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void a0() {
        int i = this.f;
    }

    public String e0(String str) {
        return (String) this.h.a("streams").c().map(new androidx.media3.exoplayer.audio.f(25)).filter(new h(str, 2)).map(new a(str, 1)).findFirst().orElse("");
    }

    public org.schabi.newpipe.extractor.channel.d f0() {
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(((w0) this.c).y, 1);
        ((org.jsoup.nodes.g) this.i).V("recommended-album").stream().map(new androidx.media3.exoplayer.audio.f(21)).forEach(new y0(dVar, 5));
        return dVar;
    }

    public List g0(String str, Function function) {
        return (List) this.h.a("streams").stream().filter(new com.grack.nanojson.a(0)).map(new androidx.media3.exoplayer.audio.f(22)).filter(new h(str, 1)).flatMap(new androidx.media3.exoplayer.audio.f(24)).filter(new com.grack.nanojson.a(1)).map(function).collect(Collectors.toList());
    }

    @Override // androidx.work.j0
    public String h() {
        switch (this.f) {
            case 0:
                return this.h.f("title", null);
            default:
                return this.h.f("display", null);
        }
    }

    @Override // androidx.work.j0
    public String l() {
        switch (this.f) {
            case 0:
                return org.schabi.newpipe.extractor.utils.g.l(this.g.f("url", null));
            default:
                return super.l();
        }
    }

    @Override // androidx.work.j0
    public void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        switch (this.f) {
            case 0:
                String str = (String) eVar.r(((org.schabi.newpipe.extractor.linkhandler.a) this.d).y).B;
                this.i = e0.a(str, "");
                com.grack.nanojson.c cVarC0 = c0(str);
                this.g = cVarC0;
                this.h = cVarC0.e("current");
                if (this.g.a("trackinfo").size() > 1) {
                    throw new org.schabi.newpipe.extractor.exceptions.d("Page is actually an album, not a track");
                }
                com.grack.nanojson.c cVarB = this.g.a("trackinfo").b(0);
                if (cVarB.containsKey("file") && cVarB.get("file") == 0) {
                    throw new org.schabi.newpipe.extractor.exceptions.a("This track is not available without being purchased");
                }
                return;
            default:
                org.schabi.newpipe.extractor.linkhandler.a aVar = (org.schabi.newpipe.extractor.linkhandler.a) this.d;
                org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
                if (org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b == null) {
                    try {
                        org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b = (com.grack.nanojson.b) new com.google.android.material.behavior.d(com.grack.nanojson.b.class).m((String) eVar.t("https://streaming.media.ccc.de/streams/v2.json", null, cVarC).B);
                    } catch (com.grack.nanojson.d e) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Could not parse JSON.", e);
                    } catch (IOException e2) {
                        throw new org.schabi.newpipe.extractor.exceptions.d("Could not get live stream JSON.", e2);
                    }
                    break;
                }
                com.grack.nanojson.b bVar = org.schabi.newpipe.extractor.services.media_ccc.extractors.b.b;
                for (int i = 0; i < bVar.size(); i++) {
                    com.grack.nanojson.c cVarB2 = bVar.b(i);
                    com.grack.nanojson.b bVarA = cVarB2.a("groups");
                    for (int i2 = 0; i2 < bVarA.size(); i2++) {
                        String strF = bVarA.b(i2).f("group", null);
                        com.grack.nanojson.b bVarA2 = bVarA.b(i2).a("rooms");
                        for (int i3 = 0; i3 < bVarA2.size(); i3++) {
                            com.grack.nanojson.c cVarB3 = bVarA2.b(i3);
                            if (aVar.z.equals(cVarB2.f("mandator", null) + "/" + cVarB3.f("slug", null))) {
                                this.g = cVarB2;
                                this.i = strF;
                                this.h = cVarB3;
                                return;
                            }
                        }
                    }
                }
                throw new org.schabi.newpipe.extractor.exceptions.d(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not find room matching id: '", aVar.z, "'"));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public List p() {
        switch (this.f) {
            case 0:
                org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
                aVar.a = "mp3-128";
                aVar.b = this.g.a("trackinfo").b(0).e("file").f("mp3-128", null);
                aVar.c = true;
                aVar.e = org.schabi.newpipe.extractor.i.MP3;
                aVar.f = 128;
                return Collections.singletonList(aVar.a());
            default:
                return g0("audio", new androidx.media3.exoplayer.audio.f(23));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public void q() {
        switch (this.f) {
            case 0:
                break;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String r() {
        switch (this.f) {
            case 1:
                return e0("dash");
            default:
                return super.r();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public org.schabi.newpipe.extractor.stream.c s() {
        switch (this.f) {
            case 0:
                String[] strArr = {this.h.f("about", null), this.h.f("lyrics", null), this.h.f("credits", null)};
                Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
                return new org.schabi.newpipe.extractor.stream.c((String) Arrays.stream(strArr).filter(new x(12)).collect(Collectors.joining("\n\n")), 3);
            default:
                return new org.schabi.newpipe.extractor.stream.c(j.j(this.g.f("description", null), " - ", (String) this.i), 3);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public String w() {
        switch (this.f) {
            case 1:
                return e0("hls");
            default:
                return super.w();
        }
    }

    private final void d0() {
    }

    private final void h0() {
    }
}
