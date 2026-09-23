package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import j$.net.URLEncoder;
import j$.util.Base64;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends org.schabi.newpipe.extractor.playlist.a {
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.c h;
    public com.grack.nanojson.c i;
    public com.grack.nanojson.c j;
    public boolean k;

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List Q() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.b bVarA = this.k ? h0().e("playlistHeaderBanner").e("heroPlaylistThumbnailRenderer").e("thumbnail").a("thumbnails") : this.h.e("thumbnailRenderer").e("playlistVideoThumbnailRenderer").e("thumbnail").a("thumbnails");
        if (!org.schabi.newpipe.extractor.utils.g.i(bVarA)) {
            return org.schabi.newpipe.extractor.services.youtube.i.k(bVarA);
        }
        com.grack.nanojson.b bVarA2 = this.f.e("microformat").e("microformatDataRenderer").e("thumbnail").a("thumbnails");
        if (!org.schabi.newpipe.extractor.utils.g.i(bVarA2)) {
            return org.schabi.newpipe.extractor.services.youtube.i.k(bVarA2);
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get playlist thumbnails");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final List U() throws org.schabi.newpipe.extractor.exceptions.f {
        if (this.k) {
            return Collections.EMPTY_LIST;
        }
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.k(j0().e("thumbnail").a("thumbnails"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader avatars", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String V() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.k ? h0().e("ownerText") : j0().e("title"), false);
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader name", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final String X() throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.q(this.k ? h0().e("ownerText").a("runs").b(0).e("navigationEndpoint") : j0().e("navigationEndpoint"));
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get playlist uploader url", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final void d0() throws org.schabi.newpipe.extractor.exceptions.f {
        String str = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y;
        String str2 = org.schabi.newpipe.extractor.services.youtube.i.a;
        try {
            org.schabi.newpipe.extractor.services.youtube.i.c(org.schabi.newpipe.extractor.utils.g.d(org.schabi.newpipe.extractor.utils.g.m(str), "list"));
        } catch (MalformedURLException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not extract playlist type from malformed url", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.playlist.a
    public final long f0() {
        String strN;
        String strN2;
        if (this.k) {
            String strN3 = org.schabi.newpipe.extractor.services.youtube.i.n(h0().e("numVideosText"), false);
            if (strN3 != null) {
                try {
                    return Long.parseLong(strN3.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused) {
                }
            }
            String strN4 = org.schabi.newpipe.extractor.services.youtube.i.n(h0().a("byline").b(0).e("text"), false);
            if (strN4 != null) {
                try {
                    return Long.parseLong(strN4.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused2) {
                }
            }
        }
        com.grack.nanojson.b bVarA = (this.k ? h0() : i0()).a("briefStats");
        if (!bVarA.isEmpty() && (strN2 = org.schabi.newpipe.extractor.services.youtube.i.n(bVarA.b(0), false)) != null) {
            return Long.parseLong(strN2.replaceAll("\\D+", ""));
        }
        com.grack.nanojson.b bVarA2 = (this.k ? h0() : i0()).a("stats");
        if (bVarA2.isEmpty() || (strN = org.schabi.newpipe.extractor.services.youtube.i.n(bVarA2.b(0), false)) == null) {
            return -1L;
        }
        return Long.parseLong(strN.replaceAll("\\D+", ""));
    }

    @Override // androidx.work.j0
    public final String h() {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(i0().e("title"), false);
        return !org.schabi.newpipe.extractor.utils.g.h(strN) ? strN : this.f.e("microformat").e("microformatDataRenderer").f("title", null);
    }

    public final com.grack.nanojson.c h0() {
        if (this.j == null) {
            this.j = this.f.e("header").e("playlistHeaderRenderer");
        }
        return this.j;
    }

    public final com.grack.nanojson.c i0() {
        if (this.h == null) {
            this.h = (com.grack.nanojson.c) this.f.e("sidebar").e("playlistSidebarRenderer").a("items").c().filter(new com.grack.nanojson.a(22)).map(new org.schabi.newpipe.extractor.services.youtube.b(21)).findFirst().orElseThrow(new org.jsoup.internal.c(16));
        }
        return this.h;
    }

    public final com.grack.nanojson.c j0() {
        if (this.i == null) {
            this.i = (com.grack.nanojson.c) this.f.e("sidebar").e("playlistSidebarRenderer").a("items").c().filter(new com.grack.nanojson.a(21)).map(new org.schabi.newpipe.extractor.services.youtube.b(20)).findFirst().orElseThrow(new org.jsoup.internal.c(15));
        }
        return this.i;
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String strR;
        String str = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z;
        org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, f());
        kVarZ.G("VL" + str, "browseId");
        kVarZ.G("wgYCCAA%3D", "params");
        byte[] bytes = okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"$fields=sidebar,header,microformat,alerts"}[0];
        List listR = androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList);
        HashMap mapU = org.schabi.newpipe.extractor.services.youtube.i.u();
        if (listR.isEmpty()) {
            strR = "?prettyPrint=false";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = listR.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) "&");
                    }
                }
            }
            strR = androidx.privacysandbox.ads.adservices.java.internal.a.r("?", sb.toString(), "&prettyPrint=false");
        }
        com.grack.nanojson.c cVarM = org.schabi.newpipe.extractor.utils.b.m(org.schabi.newpipe.extractor.services.youtube.i.s(g0.a.x("https://www.youtube.com/youtubei/v1/browse".concat(strR), mapU, bytes, cVarC)));
        this.f = cVarM;
        org.schabi.newpipe.extractor.services.youtube.i.a(cVarM);
        this.k = this.f.containsKey("header") && !this.f.containsKey("sidebar");
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.c cVarC2 = org.schabi.newpipe.extractor.services.youtube.protos.playlist.d.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.a aVarE = org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.e();
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.b((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y, "VL" + str);
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.d((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y, str);
        aVarE.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b.c((org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.y);
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.b bVar = (org.schabi.newpipe.extractor.services.youtube.protos.playlist.b) aVarE.a();
        cVarC2.c();
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.d.b((org.schabi.newpipe.extractor.services.youtube.protos.playlist.d) cVarC2.y, bVar);
        org.schabi.newpipe.extractor.services.youtube.protos.playlist.d dVar = (org.schabi.newpipe.extractor.services.youtube.protos.playlist.d) cVarC2.a();
        com.google.android.material.internal.k kVarZ2 = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, f());
        String strEncodeToString = Base64.getUrlEncoder().encodeToString(dVar.toByteArray());
        Charset charset = StandardCharsets.UTF_8;
        kVarZ2.G(URLEncoder.encode(strEncodeToString, charset), "continuation");
        this.g = org.schabi.newpipe.extractor.services.youtube.i.l("browse", okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ2.z).getBytes(charset), cVarC);
    }

    @Override // org.schabi.newpipe.extractor.playlist.a, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        return new org.schabi.newpipe.extractor.stream.c(org.schabi.newpipe.extractor.services.youtube.i.n(i0().e("description"), true), 1);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.e y() {
        String strF;
        w0 w0Var = (w0) this.c;
        final org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(w0Var.y, 2);
        com.grack.nanojson.b bVarA = this.g.a("onResponseReceivedActions").b(0).e("reloadContinuationItemsCommand").a("continuationItems");
        if (bVarA.isEmpty()) {
            bVarA = this.g.a("onResponseReceivedActions").b(0).e("appendContinuationItemsAction").a("continuationItems");
        }
        com.grack.nanojson.b bVar = bVarA;
        final boolean zAnyMatch = h0().e("onDescriptionTap").e("commandExecutorCommand").a("commands").c().anyMatch(new com.grack.nanojson.a(20));
        final com.google.android.material.internal.k kVarK = k();
        bVar.c().forEach(new Consumer(this) { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                boolean zContainsKey = cVar.containsKey("playlistVideoRenderer");
                org.schabi.newpipe.extractor.channel.d dVar2 = dVar;
                com.google.android.material.internal.k kVar = kVarK;
                boolean z = zAnyMatch;
                p pVar = this;
                if (zContainsKey) {
                    dVar2.A(new n(cVar.e("playlistVideoRenderer"), kVar, z, pVar));
                    return;
                }
                if (!cVar.containsKey("richItemRenderer")) {
                    if (cVar.containsKey("lockupViewModel")) {
                        dVar2.A(new o(cVar.e("lockupViewModel"), kVar, z, pVar));
                        return;
                    }
                    return;
                }
                com.grack.nanojson.c cVarE = cVar.e("richItemRenderer");
                if (cVarE.containsKey("content")) {
                    com.grack.nanojson.c cVarE2 = cVarE.e("content");
                    if (cVarE2.containsKey("reelItemRenderer")) {
                        dVar2.A(new r(cVarE2.e("reelItemRenderer")));
                    }
                }
            }
        });
        org.schabi.newpipe.extractor.k kVar = null;
        if (!org.schabi.newpipe.extractor.utils.g.i(bVar)) {
            com.grack.nanojson.c cVarB = bVar.b(bVar.size() - 1);
            if (cVarB.containsKey("continuationItemRenderer")) {
                com.grack.nanojson.c cVarE = cVarB.e("continuationItemRenderer").e("continuationEndpoint");
                if (cVarE.containsKey("commandExecutorCommand")) {
                    cVarE = (com.grack.nanojson.c) cVarE.e("commandExecutorCommand").a("commands").c().filter(new com.grack.nanojson.a(23)).findFirst().orElse(new com.grack.nanojson.c());
                }
                strF = cVarE.e("continuationCommand").f("token", null);
            } else if (cVarB.containsKey("continuationItemViewModel")) {
                strF = cVarB.e("continuationItemViewModel").e("continuationCommand").e("innertubeCommand").e("continuationCommand").f("token", null);
            }
            if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
                com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(w0Var.c(), f());
                kVarZ.G(strF, "continuation");
                okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8);
                kVar = new org.schabi.newpipe.extractor.k("https://www.youtube.com/youtubei/v1/browse?prettyPrint=false", String.valueOf(zAnyMatch), null);
            }
        }
        return new org.schabi.newpipe.extractor.e(dVar, kVar);
    }
}
