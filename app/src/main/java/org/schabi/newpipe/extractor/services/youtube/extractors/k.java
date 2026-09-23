package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends org.schabi.newpipe.extractor.playlist.a {
    public com.grack.nanojson.c f;
    public List g;

    public static org.schabi.newpipe.extractor.k j0(com.grack.nanojson.b bVar) {
        if (org.schabi.newpipe.extractor.utils.g.i(bVar)) {
            return null;
        }
        String strF = bVar.b(0).e("nextContinuationData").f("continuation", null);
        return new org.schabi.newpipe.extractor.k(androidx.compose.runtime.j.k("https://music.youtube.com/youtubei/v1/search?ctoken=", strF, "&continuation=", strF, "&prettyPrint=false"), null, null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List D() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e E(org.schabi.newpipe.extractor.k kVar) throws org.schabi.newpipe.extractor.exceptions.f {
        if (kVar != null) {
            String str = kVar.e;
            if (!org.schabi.newpipe.extractor.utils.g.h(str)) {
                org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(((w0) this.c).y);
                com.grack.nanojson.e eVar = new com.grack.nanojson.e();
                eVar.g();
                eVar.h("context");
                eVar.h("client");
                eVar.p("clientName", "WEB_REMIX");
                eVar.p("clientVersion", org.schabi.newpipe.extractor.services.youtube.i.v());
                eVar.p("hl", "en-GB");
                eVar.p("gl", f().e);
                eVar.p("platform", "DESKTOP");
                eVar.k("utcOffsetMinutes");
                eVar.m(Integer.toString(0));
                eVar.d();
                eVar.h("request");
                eVar.a("internalExperimentFlags");
                eVar.d();
                eVar.q("useSsl", true);
                eVar.d();
                eVar.h("user");
                eVar.q("lockedSafetyMode", false);
                eVar.d();
                eVar.d();
                eVar.d();
                byte[] bytes = eVar.b().getBytes(StandardCharsets.UTF_8);
                com.app.mlounge.data.music.e eVar2 = (com.app.mlounge.data.music.e) this.e;
                HashMap map = new HashMap(org.schabi.newpipe.extractor.services.youtube.i.m("https://music.youtube.com"));
                map.putAll(org.schabi.newpipe.extractor.services.youtube.i.f("67", org.schabi.newpipe.extractor.services.youtube.i.b));
                try {
                    com.grack.nanojson.c cVarE = ((com.grack.nanojson.c) androidx.appcompat.widget.x.p().m(org.schabi.newpipe.extractor.services.youtube.i.s(eVar2.w(str, map, bytes)))).e("continuationContents").e("musicShelfContinuation");
                    h0(jVar, cVarE.a("contents"));
                    return new org.schabi.newpipe.extractor.e(jVar, j0(cVarE.a("continuations")));
                } catch (com.grack.nanojson.d e) {
                    org.mozilla.javascript.typedarrays.c.d("Could not parse JSON", e);
                    return null;
                }
            }
        }
        kotlinx.coroutines.future.a.q("Page doesn't contain an URL");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final String e0() {
        for (com.grack.nanojson.c cVar : i0()) {
            com.grack.nanojson.c cVarE = cVar.e("didYouMeanRenderer");
            if (!cVarE.isEmpty()) {
                return org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.e("correctedQuery"), false);
            }
            com.grack.nanojson.c cVarE2 = cVar.e("showingResultsForRenderer");
            if (!cVarE2.isEmpty()) {
                return (String) org.schabi.newpipe.extractor.utils.b.e(cVarE2, "correctedQueryEndpoint.searchEndpoint.query", String.class);
            }
        }
        return "";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final boolean g0() {
        return i0().stream().anyMatch(new com.grack.nanojson.a(17));
    }

    public final void h0(org.schabi.newpipe.extractor.j jVar, com.grack.nanojson.b bVar) {
        bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(17)).filter(new com.grack.nanojson.a(18)).forEachOrdered(new org.schabi.newpipe.extractor.services.soundcloud.extractors.a(3, (String) c0().A.get(0), jVar));
    }

    public final List i0() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        List list2 = (List) this.f.e("contents").e("tabbedSearchResultsRenderer").a("tabs").b(0).e("tabRenderer").e("content").e("sectionListRenderer").a("contents").c().map(new org.schabi.newpipe.extractor.services.youtube.b(18)).filter(new com.grack.nanojson.a(19)).map(new org.schabi.newpipe.extractor.services.youtube.b(19)).collect(Collectors.toList());
        this.g = list2;
        return list2;
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str;
        String str2 = (String) c0().A.get(0);
        str2.getClass();
        switch (str2) {
            case "music_playlists":
                str = "Eg-KAQwIABAAGAAgACgBMABqChAEEAUQAxAKEAk%3D";
                break;
            case "music_artists":
                str = "Eg-KAQwIABAAGAAgASgAMABqChAEEAUQAxAKEAk%3D";
                break;
            case "music_albums":
                str = "Eg-KAQwIABAAGAEgACgAMABqChAEEAUQAxAKEAk%3D";
                break;
            case "music_songs":
                str = "Eg-KAQwIARAAGAAgACgAMABqChAEEAUQAxAKEAk%3D";
                break;
            case "music_videos":
                str = "Eg-KAQwIABABGAAgACgAMABqChAEEAUQAxAKEAk%3D";
                break;
            default:
                str = null;
                break;
        }
        com.grack.nanojson.e eVar2 = new com.grack.nanojson.e();
        eVar2.g();
        eVar2.h("context");
        eVar2.h("client");
        eVar2.p("clientName", "WEB_REMIX");
        eVar2.p("clientVersion", org.schabi.newpipe.extractor.services.youtube.i.v());
        eVar2.p("hl", "en-GB");
        eVar2.p("gl", f().e);
        eVar2.p("platform", "DESKTOP");
        eVar2.k("utcOffsetMinutes");
        eVar2.m(Integer.toString(0));
        eVar2.d();
        eVar2.h("request");
        eVar2.a("internalExperimentFlags");
        eVar2.d();
        eVar2.q("useSsl", true);
        eVar2.d();
        eVar2.h("user");
        eVar2.q("lockedSafetyMode", false);
        eVar2.d();
        eVar2.d();
        eVar2.p("query", c0().z);
        eVar2.p("params", str);
        eVar2.d();
        byte[] bytes = eVar2.b().getBytes(StandardCharsets.UTF_8);
        com.app.mlounge.data.music.e eVar3 = (com.app.mlounge.data.music.e) this.e;
        HashMap map = new HashMap(org.schabi.newpipe.extractor.services.youtube.i.m("https://music.youtube.com"));
        map.putAll(org.schabi.newpipe.extractor.services.youtube.i.f("67", org.schabi.newpipe.extractor.services.youtube.i.b));
        try {
            this.f = (com.grack.nanojson.c) androidx.appcompat.widget.x.p().m(org.schabi.newpipe.extractor.services.youtube.i.s(eVar3.w("https://music.youtube.com/youtubei/v1/search?prettyPrint=false", map, bytes)));
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse JSON", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() {
        org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(((w0) this.c).y);
        org.schabi.newpipe.extractor.k kVarJ0 = null;
        for (com.grack.nanojson.c cVar : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e(((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e(this.f, "contents.tabbedSearchResultsRenderer.tabs", com.grack.nanojson.b.class)).b(0), "tabRenderer.content.sectionListRenderer.contents", com.grack.nanojson.b.class)) {
            if (cVar.containsKey("musicShelfRenderer")) {
                com.grack.nanojson.c cVarE = cVar.e("musicShelfRenderer");
                h0(jVar, cVarE.a("contents"));
                kVarJ0 = j0(cVarE.a("continuations"));
            }
        }
        return new org.schabi.newpipe.extractor.e(jVar, kVarJ0);
    }
}
