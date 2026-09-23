package org.schabi.newpipe.extractor.services.youtube.extractors;

import androidx.core.view.w0;
import com.appsalt.internal.y0;
import com.google.protobuf.x0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.Base64;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.collections.g0;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends org.schabi.newpipe.extractor.f {
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;
    public com.grack.nanojson.c h;
    public com.grack.nanojson.c i;
    public com.grack.nanojson.c j;
    public com.grack.nanojson.c k;
    public com.grack.nanojson.c l;
    public com.grack.nanojson.c m;
    public com.grack.nanojson.b n;
    public int o;
    public String p;
    public String q;
    public int r;

    public static String e0(String str, String str2, List list) {
        String strConcat = str.concat("ManifestUrl");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.schabi.newpipe.extractor.utils.d dVar = (org.schabi.newpipe.extractor.utils.d) it.next();
            Serializable serializable = dVar.e;
            if (serializable != null) {
                String strF = ((com.grack.nanojson.c) serializable).f(strConcat, null);
                if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
                    Serializable serializable2 = dVar.y;
                    if (serializable2 == null) {
                        return androidx.compose.runtime.j.j(strF, "?", str2);
                    }
                    return strF + "?pot=" + ((String) serializable2) + "&" + str2;
                }
            }
        }
        return "";
    }

    public static boolean i0(com.grack.nanojson.c cVar, String str) {
        return !str.equals(cVar.e("videoDetails").f("videoId", null));
    }

    public static long j0(com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = null;
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(25)).filter(new com.grack.nanojson.a(26)).findFirst().orElse(null);
        if (cVar != null) {
            String strF2 = cVar.e("accessibilityData").e("accessibilityData").f("label", null);
            if (strF2 == null) {
                strF2 = cVar.e("accessibility").f("label", null);
            }
            strF = strF2 == null ? cVar.e("defaultText").e("accessibility").e("accessibilityData").f("label", null) : strF2;
            if (strF != null && strF.toLowerCase().contains("no likes")) {
                return 0L;
            }
        }
        if (strF == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not get like count from accessibility data");
            return 0L;
        }
        try {
            Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not parse \"", strF, "\" as a long"), e);
        }
    }

    public static long k0(com.grack.nanojson.b bVar) throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(24)).filter(new com.grack.nanojson.a(25)).findFirst().orElse(null);
        if (cVar == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find buttonViewModel object");
            return 0L;
        }
        String strF = cVar.f("accessibilityText", null);
        if (strF == null) {
            org.mozilla.javascript.typedarrays.c.b("Could not find buttonViewModel's accessibilityText string");
            return 0L;
        }
        try {
            Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
            return Long.parseLong(strF.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not parse \"", strF, "\" as a long"), e);
        }
    }

    public static Optional l0(String str, String str2) {
        try {
            return Optional.of(LocalDate.parse(str, DateTimeFormatter.ofPattern(str2, Locale.ENGLISH)));
        } catch (DateTimeParseException unused) {
            return Optional.empty();
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final long A() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String str = null;
        try {
            return Long.parseLong(this.f.e("videoDetails").f("lengthSeconds", null));
        } catch (Exception unused) {
            Iterator it = Arrays.asList(this.i, null).iterator();
            while (it.hasNext()) {
                com.grack.nanojson.b bVarA = ((com.grack.nanojson.c) it.next()).a("adaptiveFormats");
                if (!bVarA.isEmpty()) {
                    try {
                        return Math.round(Long.parseLong(bVarA.b(0).f("approxDurationMs", str)) / 1000.0f);
                    } catch (NumberFormatException unused2) {
                        continue;
                    }
                }
            }
            org.mozilla.javascript.typedarrays.c.b("Could not get duration");
            return 0L;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void B() {
        com.grack.nanojson.c cVarE = h0().e("metadataRowContainer").e("metadataRowContainerRenderer").a("rows").b(0).e("metadataRowRenderer");
        if (org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.a("contents").b(0), false) != null) {
            "Licence".equals(org.schabi.newpipe.extractor.services.youtube.i.n(cVarE.e("title"), false));
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void C() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (this.f.e("videoDetails").b("allowRatings")) {
            com.grack.nanojson.b bVarA = g0().e("videoActions").e("menuRenderer").a("topLevelButtons");
            try {
                try {
                    k0(bVarA);
                } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                    j0(bVarA);
                }
            } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                org.mozilla.javascript.typedarrays.c.d("Could not get like count", e);
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List D() {
        return kotlin.comparisons.a.f(this.g.e("contents").e("twoColumnWatchNextResults").e("results").e("results").a("contents"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void F() {
        if (this.l.b("isUnlisted")) {
            return;
        }
        g0().a("badges").c().anyMatch(new com.grack.nanojson.a(29));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final androidx.emoji2.text.g G() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        if (o() != 0) {
            return null;
        }
        try {
            org.schabi.newpipe.extractor.j jVar = new org.schabi.newpipe.extractor.j(((w0) this.c).y);
            this.g.e("contents").e("twoColumnWatchNextResults").e("secondaryResults").e("secondaryResults").a("results").c().map(new g(k(), 1)).filter(new com.grack.nanojson.a(27)).forEach(new y0(jVar, 8));
            return jVar;
        } catch (Exception e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get related videos", e);
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void H() throws org.schabi.newpipe.extractor.exceptions.f {
        if (!this.g.containsKey("engagementPanels")) {
            List list = Collections.EMPTY_LIST;
            return;
        }
        com.grack.nanojson.b bVar = (com.grack.nanojson.b) this.g.a("engagementPanels").c().filter(new x(0)).map(new org.schabi.newpipe.extractor.services.youtube.b(27)).findFirst().orElse(null);
        if (bVar == null) {
            List list2 = Collections.EMPTY_LIST;
            return;
        }
        long jA = A();
        ArrayList arrayList = new ArrayList();
        for (com.grack.nanojson.c cVar : bVar.c().map(new org.schabi.newpipe.extractor.services.youtube.b(28))) {
            int iC = cVar.e("onTap").e("watchEndpoint").c("startTimeSeconds", -1);
            if (iC == -1) {
                org.mozilla.javascript.typedarrays.c.b("Could not get stream segment start time.");
                return;
            }
            if (iC > jA) {
                return;
            }
            if (org.schabi.newpipe.extractor.utils.g.h(org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("title"), false))) {
                org.mozilla.javascript.typedarrays.c.b("Could not get stream segment title.");
                return;
            }
            org.schabi.newpipe.extractor.stream.d dVar = new org.schabi.newpipe.extractor.stream.d();
            String str = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y;
            if (cVar.containsKey("thumbnail")) {
                com.grack.nanojson.b bVarA = cVar.e("thumbnail").a("thumbnails");
                if (!bVarA.isEmpty()) {
                    org.schabi.newpipe.extractor.services.youtube.i.e(bVarA.b(bVarA.size() - 1).f("url", null));
                }
            }
            arrayList.add(dVar);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int I() {
        a();
        return this.r;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void M() {
        a();
        ArrayList arrayList = new ArrayList();
        com.grack.nanojson.b bVarA = this.m.a("captionTracks");
        for (int i = 0; i < bVarA.size(); i++) {
            String strF = bVarA.b(i).f("languageCode", null);
            String strF2 = bVarA.b(i).f("baseUrl", null);
            String strF3 = bVarA.b(i).f("vssId", null);
            if (strF != null && strF2 != null && strF3 != null) {
                boolean zStartsWith = strF3.startsWith("a.");
                String strC = androidx.constraintlayout.core.g.c(strF2.replaceAll("&fmt=[^&]*", "").replaceAll("&tlang=[^&]*", ""), "&fmt=ttml");
                org.schabi.newpipe.extractor.i iVar = org.schabi.newpipe.extractor.i.TTML;
                iVar.getClass();
                strF.concat(".".concat("ttml"));
                arrayList.add(new org.schabi.newpipe.extractor.stream.i(strC, true, iVar, strF, zStartsWith));
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        return org.schabi.newpipe.extractor.utils.b.g(this.f.e("videoDetails").a("keywords"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        String strN;
        String strF = this.l.f("uploadDate", "");
        if (strF.isEmpty()) {
            strF = this.l.f("publishDate", "");
        }
        if (!strF.isEmpty()) {
            return strF;
        }
        com.grack.nanojson.c cVarE = this.l.e("liveBroadcastDetails");
        String strF2 = cVarE.f("endTimestamp", "");
        if (strF2.isEmpty()) {
            strF2 = cVarE.f("startTimestamp", "");
        }
        if (!strF2.isEmpty()) {
            return strF2;
        }
        a();
        if (this.r == 4 || (strN = org.schabi.newpipe.extractor.services.youtube.i.n(g0().e("dateText"), false)) == null) {
            return null;
        }
        if (strN.startsWith("Premiered on ")) {
            return strN.substring(13);
        }
        return strN.startsWith("Premiered ") ? strN.substring(10) : strN;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Q() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.k(this.n);
        } catch (Exception unused) {
            org.mozilla.javascript.typedarrays.c.b("Could not get thumbnails");
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void R() throws org.schabi.newpipe.extractor.exceptions.f {
        S("((#|&|\\?)t=\\d*h?\\d*m?\\d+s?)");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void T() {
        String strP = P();
        try {
            try {
                org.schabi.newpipe.extractor.localization.b.b(strP);
            } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                LocalDateTime localDateTimeNow = LocalDateTime.now();
                org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) org.schabi.newpipe.extractor.timeago.a.a.get("en");
                (bVar == null ? null : new com.google.android.material.internal.k(25, bVar, localDateTimeNow)).y(strP);
            }
        } catch (org.schabi.newpipe.extractor.exceptions.f unused2) {
            Optional optionalL0 = l0(strP, "MMM dd, yyyy");
            if (!optionalL0.isPresent()) {
                optionalL0 = l0(strP, "dd MMM yyyy");
                Objects.requireNonNull(optionalL0);
            }
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        com.grack.nanojson.c cVarE = h0().e("owner").e("videoOwnerRenderer");
        List listK = cVarE.containsKey("avatarStack") ? org.schabi.newpipe.extractor.services.youtube.i.k(cVarE.e("avatarStack").e("avatarStackViewModel").a("avatars").b(0).e("avatarViewModel").e("image").a("sources")) : org.schabi.newpipe.extractor.services.youtube.i.k(cVarE.e("thumbnail").a("thumbnails"));
        if (!listK.isEmpty() || this.o != 0) {
            return listK;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader avatars");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String V() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.f.e("videoDetails").f("author", null);
        if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get uploader name");
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void W() throws org.schabi.newpipe.extractor.exceptions.f {
        com.grack.nanojson.c cVarE;
        String strN;
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) org.schabi.newpipe.extractor.utils.b.e(this.k, "owner.videoOwnerRenderer", com.grack.nanojson.c.class);
        if (cVar.containsKey("subscriberCountText")) {
            strN = org.schabi.newpipe.extractor.services.youtube.i.n(cVar.e("subscriberCountText"), false);
        } else {
            com.grack.nanojson.c cVarE2 = cVar.e("navigationEndpoint");
            String str = org.schabi.newpipe.extractor.services.youtube.i.a;
            try {
                cVarE = ((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e(cVarE2, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems", com.grack.nanojson.b.class)).b(0).e("listItemViewModel");
            } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
                cVarE = null;
            }
            strN = cVarE.e("subtitle").f("content", null).split("•")[1];
        }
        if (org.schabi.newpipe.extractor.utils.g.h(strN)) {
            return;
        }
        try {
            org.schabi.newpipe.extractor.utils.g.k(strN);
        } catch (NumberFormatException e) {
            org.mozilla.javascript.typedarrays.c.d("Could not get uploader subscriber count", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String X() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.f.e("videoDetails").f("channelId", null);
        if (org.schabi.newpipe.extractor.utils.g.h(strF)) {
            org.mozilla.javascript.typedarrays.c.b("Could not get uploader url");
            return null;
        }
        return org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.i("channel/" + strF);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Y() {
        a();
        return d0(3, "adaptiveFormats", "video-only", new v(this, true));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Z() {
        a();
        return d0(2, "formats", "video", new v(this, false));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void a0() throws org.schabi.newpipe.extractor.exceptions.f {
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(g0().e("viewCount").e("videoViewCountRenderer").e("viewCount"), false);
        if (org.schabi.newpipe.extractor.utils.g.h(strN)) {
            strN = this.f.e("videoDetails").f("viewCount", null);
            if (org.schabi.newpipe.extractor.utils.g.h(strN)) {
                org.mozilla.javascript.typedarrays.c.b("Could not get view count");
                return;
            }
        }
        if (strN.toLowerCase().contains("no views")) {
            return;
        }
        Long.parseLong(strN.replaceAll("\\D+", ""));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void b0() {
        com.grack.nanojson.c cVarE;
        com.grack.nanojson.c cVarE2 = h0().e("owner").e("videoOwnerRenderer");
        if (cVarE2.containsKey("badges")) {
            org.schabi.newpipe.extractor.services.youtube.i.w(cVarE2.a("badges"));
            return;
        }
        com.grack.nanojson.c cVarE3 = cVarE2.e("navigationEndpoint");
        String str = org.schabi.newpipe.extractor.services.youtube.i.a;
        try {
            cVarE = ((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e(cVarE3, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems", com.grack.nanojson.b.class)).b(0).e("listItemViewModel");
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            cVarE = null;
        }
        if (cVarE == null) {
            return;
        }
        cVarE.e("title").a("attachmentRuns").c().anyMatch(new com.grack.nanojson.a(11));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    public final a c0(String str, com.grack.nanojson.c cVar, org.schabi.newpipe.extractor.services.youtube.a aVar, int i, String str2, String str3) throws Exception {
        String strReplace;
        String strJ;
        boolean z;
        int i2;
        if (cVar.containsKey("url")) {
            strReplace = cVar.f("url", null);
        } else {
            String strF = cVar.f("cipher", cVar.f("signatureCipher", null));
            if (org.schabi.newpipe.extractor.utils.g.h(strF)) {
                return null;
            }
            Map map = (Map) Arrays.stream(strF.split("&")).map(new z(14)).filter(new x(10)).collect(Collectors.toMap(new z(15), new z(16), new org.jsoup.internal.i(1)));
            String str4 = (String) map.getOrDefault("s", "");
            org.schabi.newpipe.extractor.exceptions.f fVar = org.schabi.newpipe.extractor.services.youtube.h.g;
            if (fVar != null) {
                throw fVar;
            }
            org.schabi.newpipe.extractor.services.youtube.h.a(str);
            if (org.schabi.newpipe.extractor.services.youtube.h.c == null) {
                try {
                    org.schabi.newpipe.extractor.services.youtube.h.c = org.schabi.newpipe.extractor.services.youtube.k.a(org.schabi.newpipe.extractor.services.youtube.h.b);
                } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                    org.schabi.newpipe.extractor.services.youtube.h.g = e;
                    throw e;
                } catch (Exception e2) {
                    org.schabi.newpipe.extractor.services.youtube.h.g = new org.schabi.newpipe.extractor.exceptions.f("Could not get signature parameter deobfuscation JavaScript function", e2);
                    throw e2;
                }
            }
            try {
                String strL = org.schabi.newpipe.extractor.utils.b.l(org.schabi.newpipe.extractor.services.youtube.h.c, "deobfuscate", str4);
                if (strL == null) {
                    strL = "";
                }
                strReplace = ((String) map.get("url")) + "&" + ((String) map.get("sp")) + "=" + strL;
            } catch (Exception e3) {
                org.mozilla.javascript.typedarrays.c.d("Could not run signature parameter deobfuscation JavaScript function", e3);
                return null;
            }
        }
        HashMap map2 = org.schabi.newpipe.extractor.services.youtube.h.a;
        Pattern pattern = org.schabi.newpipe.extractor.services.youtube.l.a;
        if (strReplace.contains("&n=") || strReplace.contains("?n=")) {
            try {
                strJ = org.schabi.newpipe.extractor.utils.b.j(org.schabi.newpipe.extractor.services.youtube.l.a, strReplace, 1);
            } catch (org.schabi.newpipe.extractor.utils.e unused) {
                strJ = null;
            }
        } else {
            strJ = null;
        }
        if (strJ != null) {
            HashMap map3 = org.schabi.newpipe.extractor.services.youtube.h.a;
            String str5 = (String) map3.get(strJ);
            if (str5 != null) {
                strReplace = strReplace.replace(strJ, str5);
            } else {
                org.schabi.newpipe.extractor.services.youtube.h.a(str);
                org.schabi.newpipe.extractor.exceptions.f fVar2 = org.schabi.newpipe.extractor.services.youtube.h.f;
                if (fVar2 != null) {
                    throw fVar2;
                }
                if (org.schabi.newpipe.extractor.services.youtube.h.e == null) {
                    try {
                        String strB = org.schabi.newpipe.extractor.services.youtube.l.b(org.schabi.newpipe.extractor.services.youtube.h.b);
                        org.schabi.newpipe.extractor.services.youtube.h.d = strB;
                        org.schabi.newpipe.extractor.services.youtube.h.e = org.schabi.newpipe.extractor.services.youtube.l.a(org.schabi.newpipe.extractor.services.youtube.h.b, strB);
                    } catch (org.schabi.newpipe.extractor.exceptions.f e4) {
                        org.schabi.newpipe.extractor.services.youtube.h.f = e4;
                        throw e4;
                    } catch (Exception e5) {
                        org.schabi.newpipe.extractor.services.youtube.h.f = new org.schabi.newpipe.extractor.exceptions.f("Could not get throttling parameter deobfuscation JavaScript function", e5);
                        throw e5;
                    }
                }
                try {
                    String strL2 = org.schabi.newpipe.extractor.utils.b.l(org.schabi.newpipe.extractor.services.youtube.h.e, org.schabi.newpipe.extractor.services.youtube.h.d, strJ);
                    if (org.schabi.newpipe.extractor.utils.g.h(strL2)) {
                        throw new IllegalStateException("Extracted n-parameter is empty");
                    }
                    map3.put(strJ, strL2);
                    strReplace = strReplace.replace(strJ, strL2);
                } catch (Exception e6) {
                    org.mozilla.javascript.typedarrays.c.d("Could not run throttling parameter deobfuscation JavaScript function", e6);
                    return null;
                }
            }
        }
        String strJ2 = androidx.compose.runtime.j.j(strReplace, "&cpn=", str2);
        if (str3 != null) {
            strJ2 = androidx.compose.runtime.j.j(strJ2, "&pot=", str3);
        }
        com.grack.nanojson.c cVarE = cVar.e("initRange");
        com.grack.nanojson.c cVarE2 = cVar.e("indexRange");
        String strF2 = cVar.f("mimeType", "");
        if (strF2.contains("codecs")) {
            String str6 = strF2.split("\"")[1];
        }
        aVar.B = cVar.c("bitrate", 0);
        cVar.c("width", 0);
        cVar.c("height", 0);
        Integer.parseInt(cVarE.f("start", "-1"));
        Integer.parseInt(cVarE.f("end", "-1"));
        Integer.parseInt(cVarE2.f("start", "-1"));
        Integer.parseInt(cVarE2.f("end", "-1"));
        cVar.f("quality", null);
        cVar.b("isDrc");
        Long.parseLong(cVar.f("lastModified", "-1"));
        aVar.F = cVar.f("xtags", null);
        int i3 = this.r;
        if (i3 == 4 || i3 == 6) {
            cVar.c("targetDurationSec", 0);
        }
        if (i == 2 || i == 3) {
            z = true;
            cVar.c("fps", 0);
        } else if (i == 1) {
            Integer.parseInt(cVar.f("audioSampleRate", null));
            cVar.c("audioChannels", 2);
            String strF3 = cVar.e("audioTrack").f("id", null);
            if (org.schabi.newpipe.extractor.utils.g.h(strF3)) {
                z = true;
            } else {
                aVar.C = strF3;
                int iIndexOf = strF3.indexOf(".");
                z = true;
                if (iIndexOf != -1) {
                    org.schabi.newpipe.extractor.utils.b.c(strF3.substring(0, iIndexOf)).ifPresent(new y0(aVar, 9));
                }
                String str7 = aVar.F;
                String str8 = org.schabi.newpipe.extractor.services.youtube.i.a;
                if (str7 == null) {
                    i2 = 0;
                } else {
                    try {
                        String str9 = (String) org.schabi.newpipe.extractor.services.youtube.protos.video.b.c(Base64.getUrlDecoder().decode(str7)).b().stream().filter(new com.grack.nanojson.a(10)).findFirst().map(new org.schabi.newpipe.extractor.services.youtube.b(9)).orElse(null);
                        if (str9 != null) {
                            switch (str9) {
                                case "descriptive":
                                    i2 = 3;
                                    break;
                                case "dubbed":
                                case "dubbed-auto":
                                    i2 = 2;
                                    break;
                                case "secondary":
                                    i2 = 4;
                                    break;
                                case "original":
                                    i2 = 1;
                                    break;
                                default:
                                    i2 = 0;
                                    break;
                            }
                        } else {
                            i2 = 0;
                        }
                    } catch (x0 unused2) {
                    }
                }
                aVar.H = i2;
            }
            aVar.D = cVar.e("audioTrack").f("displayName", null);
        } else {
            z = true;
        }
        Long.parseLong(cVar.f("contentLength", String.valueOf(-1L)));
        Long.parseLong(cVar.f("approxDurationMs", String.valueOf(-1L)));
        a aVar2 = new a(strJ2, aVar);
        int i4 = this.r;
        if (i4 == 2) {
            aVar2.z = !cVar.f("type", "").equalsIgnoreCase("FORMAT_STREAM_TYPE_OTF");
        } else {
            aVar2.z = i4 != 6 ? z : false;
        }
        return aVar2;
    }

    public final ArrayList d0(final int i, final String str, String str2, Function function) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            final String str3 = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z;
            ArrayList arrayList = new ArrayList();
            Stream.of((Object[]) new org.schabi.newpipe.extractor.utils.d[]{new org.schabi.newpipe.extractor.utils.d(this.i, new org.schabi.newpipe.extractor.utils.d(this.q, null)), new org.schabi.newpipe.extractor.utils.d(this.h, new org.schabi.newpipe.extractor.utils.d(this.p, null)), new org.schabi.newpipe.extractor.utils.d(null, new org.schabi.newpipe.extractor.utils.d(null, null))}).flatMap(new Function() { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.w
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    org.schabi.newpipe.extractor.utils.d dVar = (org.schabi.newpipe.extractor.utils.d) obj;
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) dVar.e;
                    org.schabi.newpipe.extractor.utils.d dVar2 = (org.schabi.newpipe.extractor.utils.d) dVar.y;
                    final String str4 = (String) dVar2.e;
                    final String str5 = (String) dVar2.y;
                    if (cVar != null) {
                        String str6 = str;
                        if (cVar.containsKey(str6)) {
                            Stream streamC = cVar.a(str6).c();
                            final y yVar = this.a;
                            final int i2 = i;
                            final String str7 = str3;
                            return streamC.map(new Function() { // from class: org.schabi.newpipe.extractor.services.youtube.extractors.u
                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    y yVar2 = yVar;
                                    String str8 = str7;
                                    String str9 = str4;
                                    String str10 = str5;
                                    com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj2;
                                    try {
                                        int iC = cVar2.c("itag", 0);
                                        org.schabi.newpipe.extractor.services.youtube.a[] aVarArr = org.schabi.newpipe.extractor.services.youtube.a.I;
                                        for (int i3 = 0; i3 < 57; i3++) {
                                            org.schabi.newpipe.extractor.services.youtube.a aVar = aVarArr[i3];
                                            if (iC == aVar.y) {
                                                org.schabi.newpipe.extractor.services.youtube.a aVar2 = new org.schabi.newpipe.extractor.services.youtube.a(aVar);
                                                int i4 = aVar2.G;
                                                if (i4 == i2) {
                                                    return yVar2.c0(str8, cVar2, aVar2, i4, str9, str10);
                                                }
                                                return null;
                                            }
                                        }
                                        throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.q("itag ", iC, " is not supported"));
                                    } catch (org.schabi.newpipe.extractor.exceptions.d unused) {
                                        return null;
                                    }
                                }
                            }).filter(new com.grack.nanojson.a(28));
                        }
                    }
                    return Stream.empty();
                }
            }).map(function).forEachOrdered(new net.luminis.quic.send.f(1, arrayList));
            return arrayList;
        } catch (Exception e) {
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not get ", str2, " streams"), e);
        }
    }

    public final com.grack.nanojson.c f0(String str) {
        return (com.grack.nanojson.c) this.g.e("contents").e("twoColumnWatchNextResults").e("results").e("results").a("contents").c().filter(new org.schabi.newpipe.extractor.h(str, 5)).map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(str, 6)).findFirst().orElse(new com.grack.nanojson.c());
    }

    public final com.grack.nanojson.c g0() {
        com.grack.nanojson.c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        com.grack.nanojson.c cVarF0 = f0("videoPrimaryInfoRenderer");
        this.j = cVarF0;
        return cVarF0;
    }

    @Override // androidx.work.j0
    public final String h() throws org.schabi.newpipe.extractor.exceptions.f {
        a();
        String strF = this.f.e("videoDetails").f("title", null);
        if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
            return strF;
        }
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(g0().e("title"), false);
        if (!org.schabi.newpipe.extractor.utils.g.h(strN)) {
            return strN;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get name");
        return null;
    }

    public final com.grack.nanojson.c h0() {
        com.grack.nanojson.c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        com.grack.nanojson.c cVarF0 = f0("videoSecondaryInfoRenderer");
        this.k = cVarF0;
        return cVarF0;
    }

    @Override // androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.d {
        String str = ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z;
        org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
        org.schabi.newpipe.extractor.localization.a aVarF = f();
        Random random = org.schabi.newpipe.extractor.services.youtube.i.g;
        String strD = org.schabi.newpipe.extractor.utils.b.d(16, random);
        this.q = strD;
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j("ANDROID", "21.03.36");
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(26, jVar, new androidx.appcompat.widget.o(36, "MOBILE", null, null, "Android", "16"));
        Map mapH = kotlin.coroutines.g.h("com.google.android.youtube/21.03.36 (Linux; U; Android 15; " + cVarC.a() + ") gzip");
        jVar.A = org.schabi.newpipe.extractor.services.youtube.i.t(kVar, cVarC, aVarF, mapH, "https://youtubei.googleapis.com/youtubei/v1/");
        com.google.android.material.internal.k kVarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVarC, aVarF, kVar);
        kVarA.w("playerRequest");
        kotlin.coroutines.g.b(kVarA, str, strD);
        kVarA.q();
        kVarA.H("disablePlayerResponse", false);
        com.grack.nanojson.c cVarE = org.schabi.newpipe.extractor.utils.b.m(org.schabi.newpipe.extractor.services.youtube.i.s(g0.a.x(androidx.compose.runtime.j.k("https://youtubei.googleapis.com/youtubei/v1/reel/reel_item_watch?prettyPrint=false&t=", org.schabi.newpipe.extractor.utils.b.d(12, random), "&id=", str, "&$fields=playerResponse"), mapH, okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarA.z).getBytes(StandardCharsets.UTF_8), cVarC))).e("playerResponse");
        this.f = cVarE;
        com.grack.nanojson.c cVarE2 = cVarE.e("playabilityStatus");
        String strF = cVarE2.f("status", null);
        if (strF != null && !strF.equalsIgnoreCase("ok")) {
            String strF2 = cVarE2.f("reason", null);
            if (strF2 != null) {
                if (strF.equalsIgnoreCase("login_required")) {
                    if (strF2.contains("inappropriate for some users")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This age-restricted video cannot be watched anonymously");
                    }
                    if (strF2.contains("private")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is private");
                    }
                    if (strF2.contains("a bot")) {
                        throw new org.schabi.newpipe.extractor.exceptions.b(androidx.compose.runtime.j.k("YouTube probably temporarily blocked anonymous watch access with this IP , got error ", strF, ": \"", strF2, "\""));
                    }
                }
                if (strF.equalsIgnoreCase("unplayable") || strF.equalsIgnoreCase("error")) {
                    if (strF2.contains("Music Premium")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is a YouTube Music Premium video");
                    }
                    if (strF2.contains("payment")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is a paid video");
                    }
                    if (strF2.contains("members")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is only available for members of the channel of this video");
                    }
                    if (strF2.contains("country")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a("This video is not available in client's country.");
                    }
                    if (strF2.contains("closed") || strF2.contains("terminated")) {
                        throw new org.schabi.newpipe.extractor.exceptions.a(strF2);
                    }
                }
            }
            throw new org.schabi.newpipe.extractor.exceptions.b(androidx.compose.runtime.j.k("Got error ", strF, ": \"", strF2, "\""));
        }
        if (i0(this.f, str)) {
            throw new org.schabi.newpipe.extractor.exceptions.d("ANDROID player response is not valid");
        }
        this.i = this.f.e("streamingData");
        this.m = this.f.e("captions").e("playerCaptionsTracklistRenderer");
        if (this.f.e("playabilityStatus").containsKey("liveStreamability")) {
            this.r = 4;
        } else if (this.f.e("videoDetails").b("isPostLiveDvr")) {
            this.r = 6;
        } else {
            this.r = 2;
        }
        try {
            String strD2 = org.schabi.newpipe.extractor.utils.b.d(16, random);
            this.p = strD2;
            com.grack.nanojson.c cVarI = kotlin.coroutines.g.i(aVarF, cVarC, str, strD2);
            if (!i0(cVarI, str)) {
                this.h = cVarI.e("streamingData");
                if (org.schabi.newpipe.extractor.utils.g.j(this.m)) {
                    this.m = cVarI.e("captions").e("playerCaptionsTracklistRenderer");
                }
            }
        } catch (Exception unused) {
        }
        try {
            com.grack.nanojson.c cVarJ = kotlin.coroutines.g.j(cVarC, aVarF, str);
            if (!i0(cVarJ, str)) {
                this.l = cVarJ.e("microformat").e("playerMicroformatRenderer");
                com.grack.nanojson.c cVarE3 = cVarJ.e("videoDetails").e("thumbnail");
                if (cVarE3.containsKey("thumbnails")) {
                    this.n = cVarE3.a("thumbnails");
                } else {
                    this.n = this.f.e("videoDetails").e("thumbnail").a("thumbnails");
                }
            }
        } catch (Exception unused2) {
            this.l = new com.grack.nanojson.c();
            this.n = this.f.e("videoDetails").e("thumbnail").a("thumbnails");
        }
        com.google.android.material.internal.k kVarZ = org.schabi.newpipe.extractor.services.youtube.i.z(cVarC, aVarF);
        kVarZ.G(str, "videoId");
        kVarZ.H("contentCheckOk", true);
        kVarZ.H("racyCheckOk", true);
        this.g = org.schabi.newpipe.extractor.services.youtube.i.l(ES6Iterator.NEXT_METHOD, okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarZ.z).getBytes(StandardCharsets.UTF_8), cVarC);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int o() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int i2 = h0().e("metadataRowContainer").e("metadataRowContainerRenderer").a("rows").c().flatMap(new org.schabi.newpipe.extractor.services.youtube.b(29)).flatMap(new org.schabi.newpipe.extractor.services.youtube.b(22)).map(new org.schabi.newpipe.extractor.services.youtube.b(23)).anyMatch(new com.grack.nanojson.a(24)) ? 18 : 0;
        this.o = i2;
        return i2;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List p() {
        a();
        return d0(1, "adaptiveFormats", "audio", new net.luminis.quic.crypto.e(this, 3));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void q() {
        this.l.f("category", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String r() {
        a();
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.d(this.i, null)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return e0("dash", "mpd_version=7", androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        String strF;
        String strReplace;
        ArrayList arrayList;
        int i;
        a();
        final int i2 = 1;
        String strN = org.schabi.newpipe.extractor.services.youtube.i.n(h0().e("description"), true);
        if (!org.schabi.newpipe.extractor.utils.g.h(strN)) {
            return new org.schabi.newpipe.extractor.stream.c(strN, 1);
        }
        com.grack.nanojson.c cVarE = h0().e("attributedDescription");
        Pattern pattern = org.schabi.newpipe.extractor.services.youtube.f.a;
        final int i3 = 0;
        if (org.schabi.newpipe.extractor.utils.g.j(cVarE) || (strF = cVarE.f("content", null)) == null) {
            strReplace = null;
        } else {
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            cVarE.a("commandRuns").c().forEach(new Consumer() { // from class: org.schabi.newpipe.extractor.services.youtube.d
                /* JADX WARN: Code duplicated, block: B:21:0x0053  */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String strQ;
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    switch (i2) {
                        case 0:
                            int iC = cVar.c("startIndex", -1);
                            int iC2 = cVar.c("length", 0);
                            if (iC >= 0 && iC2 >= 1) {
                                int i4 = iC2 + iC;
                                boolean zContainsKey = cVar.containsKey("strikethrough");
                                ArrayList arrayList4 = arrayList2;
                                ArrayList arrayList5 = arrayList3;
                                if (zContainsKey) {
                                    arrayList4.add(new e(iC, "<s>", "</s>", null));
                                    arrayList5.add(new e(i4, "<s>", "</s>", null));
                                }
                                if (cVar.b("italic")) {
                                    arrayList4.add(new e(iC, "<i>", "</i>", null));
                                    arrayList5.add(new e(i4, "<i>", "</i>", null));
                                }
                                if (cVar.containsKey("weightLabel") && !"FONT_WEIGHT_NORMAL".equals(cVar.f("weightLabel", null))) {
                                    arrayList4.add(new e(iC, "<b>", "</b>", null));
                                    arrayList5.add(new e(i4, "<b>", "</b>", null));
                                    break;
                                }
                            }
                            break;
                        default:
                            com.grack.nanojson.c cVarE2 = cVar.e("onTap").e("innertubeCommand");
                            int iC3 = cVar.c("startIndex", -1);
                            boolean z = false;
                            int iC4 = cVar.c("length", 0);
                            if (iC3 >= 0 && iC4 >= 1 && (strQ = i.q(cVarE2)) != null) {
                                try {
                                    URL url = new URL(strQ);
                                    if (i.x(url)) {
                                        z = true;
                                    } else {
                                        String host = url.getHost();
                                        if (host.equalsIgnoreCase("www.youtube-nocookie.com") || host.equalsIgnoreCase("youtu.be")) {
                                            z = true;
                                        }
                                    }
                                } catch (MalformedURLException unused) {
                                }
                                String strR = androidx.privacysandbox.ads.adservices.java.internal.a.r("<a href=\"", org.jsoup.nodes.l.d(strQ), "\">");
                                String strReplaceFirst = cVar.e("onTapOptions").e("accessibilityInfo").f("accessibilityLabel", "").replaceFirst(" Channel Link", "");
                                Function bVar = (z || strReplaceFirst.isEmpty() || strReplaceFirst.startsWith("YouTube: ")) ? new b(6) : new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(strReplaceFirst, 4);
                                arrayList2.add(new e(iC3, strR, "</a>", bVar));
                                arrayList3.add(new e(iC3 + iC4, strR, "</a>", bVar));
                                break;
                            }
                            break;
                    }
                }
            });
            cVarE.a("styleRuns").c().forEach(new Consumer() { // from class: org.schabi.newpipe.extractor.services.youtube.d
                /* JADX WARN: Code duplicated, block: B:21:0x0053  */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String strQ;
                    com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
                    switch (i3) {
                        case 0:
                            int iC = cVar.c("startIndex", -1);
                            int iC2 = cVar.c("length", 0);
                            if (iC >= 0 && iC2 >= 1) {
                                int i4 = iC2 + iC;
                                boolean zContainsKey = cVar.containsKey("strikethrough");
                                ArrayList arrayList4 = arrayList2;
                                ArrayList arrayList5 = arrayList3;
                                if (zContainsKey) {
                                    arrayList4.add(new e(iC, "<s>", "</s>", null));
                                    arrayList5.add(new e(i4, "<s>", "</s>", null));
                                }
                                if (cVar.b("italic")) {
                                    arrayList4.add(new e(iC, "<i>", "</i>", null));
                                    arrayList5.add(new e(i4, "<i>", "</i>", null));
                                }
                                if (cVar.containsKey("weightLabel") && !"FONT_WEIGHT_NORMAL".equals(cVar.f("weightLabel", null))) {
                                    arrayList4.add(new e(iC, "<b>", "</b>", null));
                                    arrayList5.add(new e(i4, "<b>", "</b>", null));
                                    break;
                                }
                            }
                            break;
                        default:
                            com.grack.nanojson.c cVarE2 = cVar.e("onTap").e("innertubeCommand");
                            int iC3 = cVar.c("startIndex", -1);
                            boolean z = false;
                            int iC4 = cVar.c("length", 0);
                            if (iC3 >= 0 && iC4 >= 1 && (strQ = i.q(cVarE2)) != null) {
                                try {
                                    URL url = new URL(strQ);
                                    if (i.x(url)) {
                                        z = true;
                                    } else {
                                        String host = url.getHost();
                                        if (host.equalsIgnoreCase("www.youtube-nocookie.com") || host.equalsIgnoreCase("youtu.be")) {
                                            z = true;
                                        }
                                    }
                                } catch (MalformedURLException unused) {
                                }
                                String strR = androidx.privacysandbox.ads.adservices.java.internal.a.r("<a href=\"", org.jsoup.nodes.l.d(strQ), "\">");
                                String strReplaceFirst = cVar.e("onTapOptions").e("accessibilityInfo").f("accessibilityLabel", "").replaceFirst(" Channel Link", "");
                                Function bVar = (z || strReplaceFirst.isEmpty() || strReplaceFirst.startsWith("YouTube: ")) ? new b(6) : new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(strReplaceFirst, 4);
                                arrayList2.add(new e(iC3, strR, "</a>", bVar));
                                arrayList3.add(new e(iC3 + iC4, strR, "</a>", bVar));
                                break;
                            }
                            break;
                    }
                }
            });
            Collections.sort(arrayList2, Comparator.comparingInt(new org.jsoup.select.a(1)));
            Collections.sort(arrayList3, Comparator.comparingInt(new org.jsoup.select.a(2)));
            String strReplace2 = strF.replace((char) 160, ' ');
            Stack stack = new Stack();
            Stack stack2 = new Stack();
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < arrayList3.size()) {
                int iMin = i6 < arrayList2.size() ? Math.min(((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c, ((org.schabi.newpipe.extractor.services.youtube.e) arrayList2.get(i6)).c) : ((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c;
                sb.append(org.jsoup.nodes.l.d(strReplace2.substring(i5, iMin)));
                if (((org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4)).c == iMin) {
                    org.schabi.newpipe.extractor.services.youtube.e eVar = (org.schabi.newpipe.extractor.services.youtube.e) arrayList3.get(i4);
                    i4++;
                    while (true) {
                        if (stack.empty()) {
                            arrayList = arrayList3;
                            break;
                        }
                        org.schabi.newpipe.extractor.services.youtube.e eVar2 = (org.schabi.newpipe.extractor.services.youtube.e) stack.pop();
                        String str = eVar2.a;
                        String str2 = eVar2.b;
                        Function function = eVar2.d;
                        arrayList = arrayList3;
                        if (str.equals(eVar.a)) {
                            if (function != null && (i = eVar2.e) >= 0) {
                                sb.replace(i, sb.length(), (String) function.apply(sb.substring(eVar2.e)));
                            }
                            sb.append(str2);
                            break;
                        }
                        sb.append(str2);
                        stack2.push(eVar2);
                        arrayList3 = arrayList;
                    }
                    while (!stack2.empty()) {
                        org.schabi.newpipe.extractor.services.youtube.e eVar3 = (org.schabi.newpipe.extractor.services.youtube.e) stack2.pop();
                        sb.append(eVar3.a);
                        stack.push(eVar3);
                    }
                } else {
                    arrayList = arrayList3;
                    org.schabi.newpipe.extractor.services.youtube.e eVar4 = (org.schabi.newpipe.extractor.services.youtube.e) arrayList2.get(i6);
                    sb.append(eVar4.a);
                    eVar4.e = sb.length();
                    stack.push(eVar4);
                    i6++;
                }
                i5 = iMin;
                arrayList3 = arrayList;
            }
            sb.append(org.jsoup.nodes.l.d(strReplace2.substring(i5)));
            strReplace = sb.toString().replace("\n", "<br>").replace("  ", " &nbsp;");
        }
        if (!org.schabi.newpipe.extractor.utils.g.h(strReplace)) {
            return new org.schabi.newpipe.extractor.stream.c(strReplace, 1);
        }
        String strF2 = this.f.e("videoDetails").f("shortDescription", null);
        if (strF2 == null) {
            strF2 = org.schabi.newpipe.extractor.services.youtube.i.n(this.l.e("description"), false);
        }
        return new org.schabi.newpipe.extractor.stream.c(strF2, 3);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String u() {
        try {
            return org.schabi.newpipe.extractor.services.youtube.i.n(this.f.e("playabilityStatus").e("errorScreen").e("playerErrorMessageRenderer").e("reason"), false);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void v() throws org.schabi.newpipe.extractor.exceptions.d {
        String str = "playerLiveStoryboardSpecRenderer";
        try {
            com.grack.nanojson.c cVarE = this.f.e("storyboards");
            if (!cVarE.containsKey("playerLiveStoryboardSpecRenderer")) {
                str = "playerStoryboardSpecRenderer";
            }
            String strF = cVarE.e(str).f("spec", null);
            if (strF == null) {
                List list = Collections.EMPTY_LIST;
                return;
            }
            String[] strArrSplit = strF.split("\\|");
            String str2 = strArrSplit[0];
            ArrayList arrayList = new ArrayList(strArrSplit.length - 1);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].split("#");
                if (strArrSplit2.length == 8 && Integer.parseInt(strArrSplit2[5]) != 0) {
                    int i2 = Integer.parseInt(strArrSplit2[2]);
                    int i3 = Integer.parseInt(strArrSplit2[3]);
                    int i4 = Integer.parseInt(strArrSplit2[4]);
                    String str3 = str2.replace("$L", String.valueOf(i - 1)).replace("$N", strArrSplit2[6]) + "&sigh=" + strArrSplit2[7];
                    if (str3.contains("$M")) {
                        int iCeil = (int) Math.ceil(((double) i2) / ((double) (i3 * i4)));
                        ArrayList arrayList2 = new ArrayList(iCeil);
                        for (int i5 = 0; i5 < iCeil; i5++) {
                            arrayList2.add(str3.replace("$M", String.valueOf(i5)));
                        }
                    } else {
                        Collections.singletonList(str3);
                    }
                    Integer.parseInt(strArrSplit2[0]);
                    Integer.parseInt(strArrSplit2[1]);
                    Integer.parseInt(strArrSplit2[5]);
                    arrayList.add(new org.schabi.newpipe.extractor.stream.d());
                }
            }
        } catch (Exception e) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not get frames", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String w() {
        a();
        Object[] objArr = {new org.schabi.newpipe.extractor.utils.d(this.h, null), new org.schabi.newpipe.extractor.utils.d(null, null), new org.schabi.newpipe.extractor.utils.d(this.i, null)};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return e0("hls", "", Collections.unmodifiableList(arrayList));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void z() {
    }
}
