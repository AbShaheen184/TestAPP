package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.appsalt.internal.y0;
import j$.util.stream.DesugarCollectors;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends org.schabi.newpipe.extractor.playlist.a {
    public static final List i;
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public String h;

    static {
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.c(90, "default.jpg", 120, 3), new org.schabi.newpipe.extractor.utils.c(180, "mqdefault.jpg", 320, 2), new org.schabi.newpipe.extractor.utils.c(360, "hqdefault.jpg", LibretroCore.PSP_SCREEN_WIDTH, 2)};
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        i = Collections.unmodifiableList(arrayList);
    }

    public static List h0(String str) {
        return (List) i.stream().map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(androidx.privacysandbox.ads.adservices.java.internal.a.r("https://i.ytimg.com/vi/", str, "/"), 5)).collect(DesugarCollectors.toUnmodifiableList());
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List Q() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return h0(org.schabi.newpipe.extractor.services.youtube.i.d(this.g.f("playlistId", null)));
        } catch (Exception e) {
            try {
                return h0(this.f.e("currentVideoEndpoint").e("watchEndpoint").f("videoId", null));
            } catch (Exception unused) {
                org.mozilla.javascript.typedarrays.c.d("Could not get playlist thumbnails", e);
                return null;
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List U() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String V() {
        return "YouTube";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String X() {
        return "";
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final void d0() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.services.youtube.i.c(this.g.f("playlistId", null));
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long f0() {
        return -2L;
    }

    @Override // androidx.work.j0
    public final String h() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = this.g;
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        String strF = cVar.get("title") instanceof String ? cVar.f("title", null) : org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("title"), false);
        if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get playlist name");
        return null;
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f, MalformedURLException {
        org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
        org.schabi.newpipe.extractor.linkhandler.a aVar = (org.schabi.newpipe.extractor.linkhandler.a) this.d;
        URL urlM = org.schabi.newpipe.extractor.utils.g.m(aVar.y);
        String str = aVar.z;
        String strD = org.schabi.newpipe.extractor.utils.g.d(urlM, "v");
        String strD2 = org.schabi.newpipe.extractor.utils.g.d(urlM, "index");
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, f());
        kVarZ.G(str, "playlistId");
        if (strD != null) {
            kVarZ.G(strD, "videoId");
        }
        if (strD2 != null) {
            kVarZ.G(Integer.valueOf(Integer.parseInt(strD2)), "playlistIndex");
        }
        byte[] bytes = okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8);
        androidx.fragment.app.h hVarX = ((com.app.mlounge.data.music.e) this.e).x("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", org.schabi.newpipe.extractor.services.youtube.i.u(), bytes, cVarC);
        com.grack.nanojson.c cVarM = org.schabi.newpipe.extractor.utils.b.m(org.schabi.newpipe.extractor.services.youtube.i.s(hVarX));
        this.f = cVarM;
        com.grack.nanojson.c cVarE = cVarM.e("contents").e("twoColumnWatchNextResults").e("playlist").e("playlist");
        this.g = cVarE;
        if (org.schabi.newpipe.extractor.utils.g.j(cVarE)) {
            throw new org.schabi.newpipe.extractor.exceptions.b("Consent is required in some countries to view Mix playlists", new org.schabi.newpipe.extractor.exceptions.d("Could not get playlistData"));
        }
        List<String> list = (List) ((Map) hVarX.A).get("set-cookie");
        String strSubstring = "";
        if (list != null) {
            for (String str2 : list) {
                int iIndexOf = str2.indexOf("VISITOR_INFO1_LIVE");
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(iIndexOf + 19, str2.indexOf(";", iIndexOf));
                }
            }
        }
        this.h = strSubstring;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        return org.schabi.newpipe.extractor.stream.c.z;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() throws org.schabi.newpipe.extractor.exceptions.d {
        w0 w0Var = (w0) this.c;
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        new com.grack.nanojson.b(this.g.a("contents")).c().map(new g(k(), 0)).forEachOrdered(new y0(dVar, 7));
        new HashMap().put("VISITOR_INFO1_LIVE", this.h);
        com.grack.nanojson.c cVar = this.g;
        com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) cVar.a("contents").get(cVar.a("contents").size() - 1);
        if (cVar2 == null) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract next page url");
        }
        cVar2.e("playlistPanelVideoRenderer");
        com.grack.nanojson.c cVarE = cVar2.e("playlistPanelVideoRenderer").e("navigationEndpoint").e("watchEndpoint");
        String strF = cVarE.f("playlistId", null);
        String strF2 = cVarE.f("videoId", null);
        int iC = cVarE.c("index", 0);
        String strF3 = cVarE.f("params", null);
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(w0Var.c(), f());
        kVarZ.G(strF2, "videoId");
        kVarZ.G(strF, "playlistId");
        kVarZ.G(Integer.valueOf(iC), "playlistIndex");
        kVarZ.G(strF3, "params");
        okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8);
        return new org.schabi.newpipe.extractor.e(dVar, new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", null, null));
    }
}
