package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends org.schabi.newpipe.extractor.playlist.a {
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public com.grack.nanojson.c j;

    public s(org.schabi.newpipe.extractor.services.youtube.j jVar, org.schabi.newpipe.extractor.linkhandler.e eVar) {
        super(jVar, eVar);
        List list = eVar.A;
        String str = org.schabi.newpipe.extractor.utils.g.i(list) ? null : (String) list.get(0);
        this.f = str;
        this.g = str == null || "all".equals(str) || "videos".equals(str);
        this.h = str == null || "all".equals(str) || "channels".equals(str);
        this.i = str == null || "all".equals(str) || "playlists".equals(str);
    }

    public static org.schabi.newpipe.extractor.k i0(com.grack.nanojson.c cVar) {
        if (org.schabi.newpipe.extractor.utils.g.j(cVar)) {
            return null;
        }
        return new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/search?prettyPrint=false", cVar.e("continuationEndpoint").e("continuationCommand").f("token", null), null);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List D() {
        return kotlin.comparisons.a.f(this.j.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e E(org.schabi.newpipe.extractor.k kVar) throws org.schabi.newpipe.extractor.search.a {
        w0 w0Var = (w0) this.c;
        if (kVar == null || org.schabi.newpipe.extractor.utils.g.h(kVar.e)) {
            kotlinx.coroutines.future.a.q("Page doesn't contain an URL");
            return null;
        }
        org.schabi.newpipe.extractor.localization.c cVarC = w0Var.c();
        org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(w0Var.y);
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, f());
        kVarZ.G(kVar.y, "continuation");
        com.grack.nanojson.b bVarA = org.schabi.newpipe.extractor.services.youtube.i.l("search", okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8), cVarC).a("onResponseReceivedCommands").b(0).e("appendContinuationItemsAction").a("continuationItems");
        h0(jVar, bVarA.b(0).e("itemSectionRenderer").a("contents"));
        return new org.schabi.newpipe.extractor.e(jVar, i0(bVarA.b(1).e("continuationItemRenderer")));
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final String e0() {
        com.grack.nanojson.c cVarE = this.j.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents").b(0).e("itemSectionRenderer");
        com.grack.nanojson.c cVarE2 = cVarE.a("contents").b(0).e("didYouMeanRenderer");
        if (!cVarE2.isEmpty()) {
            return (String) org.schabi.newpipe.extractor.utils.b.e(cVarE2, "correctedQueryEndpoint.searchEndpoint.query", String.class);
        }
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.a("contents").b(0).e("showingResultsForRenderer").e("correctedQuery"), false);
        return strN != null ? strN : "";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final boolean g0() {
        return !this.j.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents").b(0).e("itemSectionRenderer").a("contents").b(0).e("showingResultsForRenderer").isEmpty();
    }

    public final void h0(org.schabi.newpipe.extractor.j jVar, com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.search.a {
        com.google.android.material.internal.k kVarK = k();
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) it.next();
            if (cVar.containsKey("backgroundPromoRenderer")) {
                throw new org.schabi.newpipe.extractor.search.a(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("backgroundPromoRenderer").e("bodyText"), false));
            }
            boolean zContainsKey = cVar.containsKey("videoRenderer");
            boolean z = this.g;
            if (zContainsKey && z) {
                jVar.b(new a0(cVar.e("videoRenderer"), kVarK));
            } else if (cVar.containsKey("channelRenderer") && this.h) {
                jVar.b(new d(cVar.e("channelRenderer")));
            } else {
                boolean zContainsKey2 = cVar.containsKey("playlistRenderer");
                boolean z2 = this.i;
                if (zContainsKey2 && z2) {
                    jVar.b(new q(cVar.e("playlistRenderer")));
                } else if (cVar.containsKey("showRenderer") && z2) {
                    jVar.b(new t(cVar.e("showRenderer")));
                } else if (cVar.containsKey("lockupViewModel")) {
                    com.grack.nanojson.c cVarE = cVar.e("lockupViewModel");
                    String strF = cVarE.f("contentType", null);
                    if (("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(strF) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(strF)) && z2) {
                        jVar.b(new f(cVarE));
                    } else if ("LOCKUP_CONTENT_TYPE_VIDEO".equals(strF) && z) {
                        jVar.b(new c0(cVarE, kVarK));
                    }
                }
            }
        }
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) {
        String str = c0().z;
        org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
        String str2 = this.f;
        String str3 = "8AEB";
        if (!org.schabi.newpipe.extractor.utils.g.h(str2)) {
            str2.getClass();
            switch (str2) {
                case "playlists":
                    str3 = "EgIQA_ABAQ%3D%3D";
                    break;
                case "music_playlists":
                case "music_artists":
                case "music_albums":
                case "music_songs":
                case "music_videos":
                    str3 = "";
                    break;
                case "videos":
                    str3 = "EgIQAfABAQ%3D%3D";
                    break;
                case "channels":
                    str3 = "EgIQAvABAQ%3D%3D";
                    break;
            }
        }
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, f());
        kVarZ.G(str, "query");
        if (!org.schabi.newpipe.extractor.utils.g.h(str3)) {
            kVarZ.G(str3, "params");
        }
        this.j = org.schabi.newpipe.extractor.services.youtube.i.l("search", okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8), cVarC);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() throws org.schabi.newpipe.extractor.search.a {
        org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(((w0) this.c).y);
        org.schabi.newpipe.extractor.k kVarI0 = null;
        for (com.grack.nanojson.c cVar : this.j.e("contents").e("twoColumnSearchResultsRenderer").e("primaryContents").e("sectionListRenderer").a("contents")) {
            if (cVar.containsKey("itemSectionRenderer")) {
                h0(jVar, cVar.e("itemSectionRenderer").a("contents"));
            } else if (cVar.containsKey("continuationItemRenderer")) {
                kVarI0 = i0(cVar.e("continuationItemRenderer"));
            }
        }
        return new org.schabi.newpipe.extractor.e(jVar, kVarI0);
    }
}
