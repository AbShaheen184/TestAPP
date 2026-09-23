package org.schabi.newpipe.extractor.services.peertube.extractors;

import androidx.appcompat.widget.x;
import androidx.compose.runtime.j;
import androidx.core.view.w0;
import androidx.emoji2.text.g;
import androidx.fragment.app.h;
import androidx.room.b0;
import com.appsalt.internal.y0;
import j$.net.URLEncoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import kotlin.collections.g0;
import org.schabi.newpipe.extractor.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends org.schabi.newpipe.extractor.f {
    public final String f;
    public com.grack.nanojson.c g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public org.schabi.newpipe.extractor.exceptions.f k;

    public e(org.schabi.newpipe.extractor.services.peertube.b bVar, org.schabi.newpipe.extractor.linkhandler.a aVar) {
        super(bVar, aVar);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.f = e();
    }

    public static String f0(com.grack.nanojson.c cVar, String str, String str2, String str3) {
        if ("fileDownloadUrl".equals(str)) {
            str3 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "fileUrl", String.class);
        }
        return str3.replace("-fragmented.".concat(str2), ".m3u8");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long A() {
        return this.g.d("duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void B() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void C() {
        this.g.d("likes", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void F() {
        this.g.e("privacy").c("id", 0);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final g G() throws org.schabi.newpipe.extractor.exceptions.f {
        String str;
        com.grack.nanojson.c cVar;
        List<String> listO = O();
        boolean zIsEmpty = listO.isEmpty();
        String str2 = this.f;
        if (zIsEmpty) {
            str = str2 + "/api/v1/accounts/" + ((String) org.schabi.newpipe.extractor.utils.b.e(this.g, "account.name", String.class)) + "@" + ((String) org.schabi.newpipe.extractor.utils.b.e(this.g, "account.host", String.class)) + "/videos?start=0&count=8";
        } else {
            String strC = androidx.constraintlayout.core.g.c(str2, "/api/v1/search/videos");
            StringBuilder sb = new StringBuilder("start=0&count=8&sort=-createdAt");
            for (String str3 : listO) {
                sb.append("&tagsOneOf=");
                Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
                sb.append(URLEncoder.encode(str3, StandardCharsets.UTF_8));
            }
            str = strC + "?" + ((Object) sb);
        }
        if (org.schabi.newpipe.extractor.utils.g.f(str)) {
            return null;
        }
        org.schabi.newpipe.extractor.channel.d dVar = new org.schabi.newpipe.extractor.channel.d(((w0) this.c).y, 2);
        String str4 = (String) ((com.app.mlounge.data.music.e) this.e).r(str).B;
        if (org.schabi.newpipe.extractor.utils.g.f(str4)) {
            cVar = null;
        } else {
            try {
                cVar = (com.grack.nanojson.c) x.p().m(str4);
            } catch (com.grack.nanojson.d e) {
                org.mozilla.javascript.typedarrays.c.d("Could not parse json data for related videos", e);
                return null;
            }
        }
        if (cVar != null) {
            try {
                for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.h(cVar, "data")) {
                    if (obj instanceof com.grack.nanojson.c) {
                        f fVar = new f((com.grack.nanojson.c) obj, str2);
                        if (!fVar.getUrl().equals(((org.schabi.newpipe.extractor.linkhandler.a) this.d).y)) {
                            dVar.A(fVar);
                        }
                    }
                }
            } catch (Exception e2) {
                org.mozilla.javascript.typedarrays.c.d("Could not extract related videos", e2);
                return null;
            }
        }
        return dVar;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void H() throws org.schabi.newpipe.extractor.exceptions.f {
        ArrayList arrayList = new ArrayList();
        try {
            com.grack.nanojson.c cVarE0 = e0("chapters");
            if (cVarE0 == null || !cVarE0.containsKey("chapters")) {
                return;
            }
            com.grack.nanojson.b bVarA = cVarE0.a("chapters");
            for (int i = 0; i < bVarA.size(); i++) {
                com.grack.nanojson.c cVarB = bVarA.b(i);
                cVarB.f("title", null);
                cVarB.c("timecode", 0);
                arrayList.add(new org.schabi.newpipe.extractor.stream.d());
            }
        } catch (IOException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get stream segments", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int I() {
        return this.g.b("isLive") ? 4 : 2;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void J() {
        androidx.compose.ui.text.android.d.c(this.g.e("channel"), this.f, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void K() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void L() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void M() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.exceptions.f fVar = this.k;
        if (fVar != null) {
            throw fVar;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void N() {
        try {
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        return org.schabi.newpipe.extractor.utils.b.g(this.g.a("tags"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "publishedAt", String.class);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Q() {
        return androidx.compose.ui.text.android.d.f(this.g, this.f);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void R() throws org.schabi.newpipe.extractor.exceptions.f {
        S("((#|&|\\?)start=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void T() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.localization.b.a(P());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        return androidx.compose.ui.text.android.d.c(this.g.e("account"), this.f, "avatars", "avatar");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String V() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "account.displayName", String.class);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String X() {
        return ((w0) this.c).b().o(b0.e("accounts/", (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "account.name", String.class), "@", (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "account.host", String.class)), this.f).y;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Y() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Z() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (I() == 2) {
            g0();
            return arrayList;
        }
        try {
            Stream map = this.g.a("streamingPlaylists").c().map(new androidx.media3.exoplayer.audio.f(27));
            Objects.requireNonNull(arrayList);
            map.forEachOrdered(new y0(arrayList, 6));
            return arrayList;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get video streams", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void a0() {
        this.g.d("views", 0L);
    }

    public final void c0(com.grack.nanojson.c cVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        i iVarA = i.a(strSubstring);
        String strJ = j.j(str, "-", strSubstring);
        org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
        aVar.a = strJ + "-" + str2 + "-PROGRESSIVE_HTTP";
        aVar.b = str3;
        aVar.c = true;
        aVar.e = iVarA;
        aVar.f = -1;
        org.schabi.newpipe.extractor.stream.b bVarA = aVar.a();
        ArrayList arrayList = this.i;
        arrayList.add(bVarA);
        if (!org.schabi.newpipe.extractor.utils.g.h(str4)) {
            String strF0 = z ? f0(cVar, str2, strSubstring, str3) : str4.replace("master", ((Number) org.schabi.newpipe.extractor.utils.b.e(cVar, "resolution.id", Number.class)).toString());
            org.schabi.newpipe.extractor.stream.a aVar2 = new org.schabi.newpipe.extractor.stream.a();
            aVar2.a = j.j(strJ, "-", "HLS");
            aVar2.b = strF0;
            aVar2.c = true;
            aVar2.d = 3;
            aVar2.e = iVarA;
            aVar2.f = -1;
            org.schabi.newpipe.extractor.stream.b bVarA2 = aVar2.a();
            if (!org.schabi.newpipe.extractor.stream.e.a(bVarA2, arrayList)) {
                arrayList.add(bVarA2);
            }
        }
        String str5 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "torrentUrl", String.class);
        if (org.schabi.newpipe.extractor.utils.g.h(str5)) {
            return;
        }
        org.schabi.newpipe.extractor.stream.a aVar3 = new org.schabi.newpipe.extractor.stream.a();
        aVar3.a = strJ + "-" + str2 + "-TORRENT";
        aVar3.b = str5;
        aVar3.c = true;
        aVar3.d = 5;
        aVar3.e = iVarA;
        aVar3.f = -1;
        arrayList.add(aVar3.a());
    }

    public final void d0(com.grack.nanojson.c cVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        i iVarA = i.a(strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(strSubstring);
        boolean z2 = cVar.containsKey("hasAudio") && !cVar.b("hasAudio");
        org.schabi.newpipe.extractor.stream.j jVar = new org.schabi.newpipe.extractor.stream.j(str3, true, iVarA, 1, str, z2, null);
        ArrayList arrayList = this.j;
        arrayList.add(jVar);
        if (!org.schabi.newpipe.extractor.utils.g.h(str4)) {
            String strF0 = z ? f0(cVar, str2, strSubstring, str3) : str4.replace("master", ((Number) org.schabi.newpipe.extractor.utils.b.e(cVar, "resolution.id", Number.class)).toString());
            if (strF0 == null) {
                kotlinx.coroutines.future.a.u("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                return;
            } else {
                org.schabi.newpipe.extractor.stream.j jVar2 = new org.schabi.newpipe.extractor.stream.j(strF0, true, iVarA, 3, str, z2, null);
                if (!org.schabi.newpipe.extractor.stream.e.a(jVar2, arrayList)) {
                    arrayList.add(jVar2);
                }
            }
        }
        String str5 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "torrentUrl", String.class);
        if (org.schabi.newpipe.extractor.utils.g.h(str5)) {
            return;
        }
        if (str5 != null) {
            arrayList.add(new org.schabi.newpipe.extractor.stream.j(str5, true, iVarA, 5, str, z2, null));
        } else {
            kotlinx.coroutines.future.a.u("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
        }
    }

    public final com.grack.nanojson.c e0(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        h hVarR = ((com.app.mlounge.data.music.e) this.e).r(this.f + "/api/v1/videos/" + ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z + "/" + str);
        int i = hVarR.y;
        if (i == 400) {
            return null;
        }
        if (i != 200) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Could not get segments from API. Response code: "));
        }
        try {
            return (com.grack.nanojson.c) x.p().m((String) hVarR.B);
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse json data for segments", e);
            return null;
        }
    }

    public final void g0() throws org.schabi.newpipe.extractor.exceptions.f {
        h0(this.g.a("files"), "");
        try {
            for (com.grack.nanojson.c cVar : this.g.a("streamingPlaylists").c()) {
                h0(cVar.a("files"), cVar.f("playlistUrl", null));
            }
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get streams", e);
        }
    }

    @Override // androidx.work.j0
    public final String h() {
        return (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "name", String.class);
    }

    public final void h0(com.grack.nanojson.b bVar, String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String str2;
        try {
            boolean z = !org.schabi.newpipe.extractor.utils.g.h(str) && str.endsWith("-master.m3u8");
            for (com.grack.nanojson.c cVar : bVar.c()) {
                String str3 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, cVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl", String.class);
                if (org.schabi.newpipe.extractor.utils.g.h(str3)) {
                    return;
                }
                String str4 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar, "resolution.label", String.class);
                String str5 = cVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl";
                if (str4.toLowerCase().contains("audio")) {
                    str2 = str;
                    c0(cVar, z, str4, str5, str3, str2);
                } else {
                    str2 = str;
                    d0(cVar, z, str4, str5, str3, str2);
                }
                str = str2;
            }
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get streams from array", e);
        }
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        org.schabi.newpipe.extractor.linkhandler.a aVar = (org.schabi.newpipe.extractor.linkhandler.a) this.d;
        String str = aVar.z;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f;
        sb.append(str2);
        sb.append("/api/v1/videos/");
        sb.append(str);
        try {
            com.grack.nanojson.c cVar = (com.grack.nanojson.c) x.p().m((String) eVar.r(sb.toString()).B);
            this.g = cVar;
            if (cVar == null) {
                throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract PeerTube stream data");
            }
            androidx.compose.ui.text.android.d.p(cVar);
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                try {
                    for (Object obj : (com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e((com.grack.nanojson.c) x.p().m((String) ((com.app.mlounge.data.music.e) this.e).r(str2 + "/api/v1/videos/" + aVar.z + "/captions").B), "data", com.grack.nanojson.b.class)) {
                        if (obj instanceof com.grack.nanojson.c) {
                            com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj;
                            String str3 = str2 + ((String) org.schabi.newpipe.extractor.utils.b.e(cVar2, "captionPath", String.class));
                            String str4 = (String) org.schabi.newpipe.extractor.utils.b.e(cVar2, "language.id", String.class);
                            i iVarA = i.a(str3.substring(str3.lastIndexOf(".") + 1));
                            if (iVarA != null && !org.schabi.newpipe.extractor.utils.g.h(str4)) {
                                if (str4 == null) {
                                    throw new IllegalStateException("The language code of the subtitles stream has been not set or is null. Make sure you specified an non null language code with setLanguageCode.");
                                }
                                str4.concat(".".concat(iVarA.y));
                                arrayList.add(new org.schabi.newpipe.extractor.stream.i(str3, true, iVarA, str4, false));
                            }
                        }
                    }
                } catch (Exception e) {
                    this.k = new org.schabi.newpipe.extractor.exceptions.f("Could not get subtitles", e);
                }
            }
        } catch (com.grack.nanojson.d e2) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not extract PeerTube stream data", e2);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int o() {
        return ((Boolean) org.schabi.newpipe.extractor.utils.b.e(this.g, "nsfw", Boolean.class)).booleanValue() ? 18 : 0;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List p() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty() && this.j.isEmpty() && I() == 2) {
            g0();
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        try {
            String str = (String) org.schabi.newpipe.extractor.utils.b.e(this.g, "description", String.class);
            if (str.length() == 250 && str.substring(247).equals("...")) {
                try {
                    str = (String) org.schabi.newpipe.extractor.utils.b.e((com.grack.nanojson.c) x.p().m((String) g0.a.r(this.f + "/api/v1/videos/" + ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z + "/description").B), "description", String.class);
                } catch (com.grack.nanojson.d | IOException unused) {
                }
            }
            return new org.schabi.newpipe.extractor.stream.c(str, 2);
        } catch (org.schabi.newpipe.extractor.exceptions.f unused2) {
            return org.schabi.newpipe.extractor.stream.c.z;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void t() {
        this.g.d("dislikes", 0L);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void v() throws org.schabi.newpipe.extractor.exceptions.d {
        ArrayList arrayList = new ArrayList();
        try {
            com.grack.nanojson.c cVarE0 = e0("storyboards");
            if (cVarE0 == null || !cVarE0.containsKey("storyboards")) {
                return;
            }
            for (Object obj : cVarE0.a("storyboards")) {
                if (obj instanceof com.grack.nanojson.c) {
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    String strF = cVar.f("storyboardPath", null);
                    int iC = cVar.c("spriteWidth", 0);
                    int iC2 = cVar.c("spriteHeight", 0);
                    int iC3 = cVar.c("totalWidth", 0) / iC;
                    int iC4 = cVar.c("totalHeight", 0) / iC2;
                    cVar.c("spriteDuration", 0);
                    Object[] objArr = {androidx.constraintlayout.core.g.c(this.f, strF)};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    Collections.unmodifiableList(arrayList2);
                    arrayList.add(new org.schabi.newpipe.extractor.stream.d());
                }
            }
        } catch (IOException e) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not get frames", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String w() {
        a();
        return (I() != 2 || org.schabi.newpipe.extractor.utils.g.j(this.g.e("files"))) ? this.g.a("streamingPlaylists").b(0).f("playlistUrl", "") : this.g.e("files").f("playlistUrl", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void x() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void z() {
        try {
            new Locale((String) org.schabi.newpipe.extractor.utils.b.e(this.g, "language.id", String.class));
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
        }
    }
}
