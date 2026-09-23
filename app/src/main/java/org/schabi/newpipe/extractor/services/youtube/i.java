package org.schabi.newpipe.extractor.services.youtube;

import androidx.appcompat.widget.o;
import androidx.appcompat.widget.x;
import j$.net.URLDecoder;
import j$.util.stream.DesugarCollectors;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import kotlin.collections.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static String a = null;
    public static String b = null;
    public static boolean c = false;
    public static Optional d = Optional.empty();
    public static final String[] e = {"INNERTUBE_CONTEXT_CLIENT_VERSION\":\"([0-9\\.]+?)\"", "innertube_context_client_version\":\"([0-9\\.]+?)\"", "client.version=([0-9\\.]+)"};
    public static final String[] f = {"window\\[\"ytInitialData\"\\]\\s*=\\s*(\\{.*?\\});", "var\\s*ytInitialData\\s*=\\s*(\\{.*?\\});"};
    public static final Random g = new Random();
    public static final Set h;
    public static final Set i;
    public static final Set j;

    static {
        Pattern.compile("&c=WEB");
        Pattern.compile("&c=WEB_EMBEDDED_PLAYER");
        Pattern.compile("&c=ANDROID");
        Pattern.compile("&c=IOS");
        Pattern.compile("&c=VISIONOS");
        Object[] objArr = {"google.", "m.google.", "www.google."};
        HashSet hashSet = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(obj, "duplicate element: "));
                return;
            }
        }
        h = Collections.unmodifiableSet(hashSet);
        String[] strArr = {"invidio.us", "dev.invidio.us", "www.invidio.us", "redirect.invidious.io", "invidious.snopyta.org", "yewtu.be", "tube.connect.cafe", "tubus.eduvid.org", "invidious.kavin.rocks", "invidious.site", "invidious-us.kavin.rocks", "piped.kavin.rocks", "vid.mint.lgbt", "invidiou.site", "invidious.fdn.fr", "invidious.048596.xyz", "invidious.zee.li", "vid.puffyan.us", "ytprivate.com", "invidious.namazso.eu", "invidious.silkky.cloud", "ytb.trom.tf", "invidious.exonip.de", "inv.riverside.rocks", "invidious.blamefran.net", "y.com.cm", "invidious.moomoo.me", "yt.cyberhost.uk"};
        HashSet hashSet2 = new HashSet(28);
        for (int i3 = 0; i3 < 28; i3++) {
            String str = strArr[i3];
            Objects.requireNonNull(str);
            if (!hashSet2.add(str)) {
                com.google.firebase.platforminfo.b.f(str, "duplicate element: ");
                return;
            }
        }
        i = Collections.unmodifiableSet(hashSet2);
        Object[] objArr2 = {"youtube.com", "www.youtube.com", "m.youtube.com", "music.youtube.com"};
        HashSet hashSet3 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj2 = objArr2[i4];
            Objects.requireNonNull(obj2);
            if (!hashSet3.add(obj2)) {
                kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(obj2, "duplicate element: "));
                return;
            }
        }
        j = Collections.unmodifiableSet(hashSet3);
    }

    public static com.google.android.material.internal.k A(org.schabi.newpipe.extractor.localization.c cVar, org.schabi.newpipe.extractor.localization.a aVar, com.google.android.material.internal.k kVar) {
        com.grack.nanojson.c cVar2 = new com.grack.nanojson.c();
        com.google.android.material.internal.k kVar2 = new com.google.android.material.internal.k(15, false);
        Stack stack = new Stack();
        kVar2.y = stack;
        kVar2.z = cVar2;
        stack.push(cVar2);
        kVar2.w("context");
        kVar2.w("client");
        com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) kVar.y;
        kVar2.G((String) jVar.y, "clientName");
        kVar2.G((String) jVar.z, "clientVersion");
        kVar2.G("WATCH", "clientScreen");
        o oVar = (o) kVar.z;
        kVar2.G((String) oVar.b, "platform");
        String str = (String) jVar.A;
        if (str != null) {
            kVar2.G(str, "visitorData");
        }
        String str2 = (String) oVar.c;
        if (str2 != null) {
            kVar2.G(str2, "deviceMake");
        }
        String str3 = (String) oVar.d;
        if (str3 != null) {
            kVar2.G(str3, "deviceModel");
        }
        String str4 = (String) oVar.e;
        if (str4 != null) {
            kVar2.G(str4, "osName");
        }
        String str5 = (String) oVar.f;
        if (str5 != null) {
            kVar2.G(str5, "osVersion");
        }
        int i2 = oVar.a;
        if (i2 > 0) {
            kVar2.G(Integer.valueOf(i2), "androidSdkVersion");
        }
        kVar2.G(cVar.b(), "hl");
        kVar2.G(aVar.e, "gl");
        kVar2.G(0, "utcOffsetMinutes");
        kVar2.q();
        kVar2.w("request");
        com.grack.nanojson.b bVar = new com.grack.nanojson.b();
        kVar2.G(bVar, "internalExperimentFlags");
        stack.push(bVar);
        kVar2.q();
        kVar2.H("useSsl", true);
        kVar2.q();
        kVar2.w("user");
        kVar2.H("lockedSafetyMode", false);
        kVar2.q();
        kVar2.q();
        return kVar2;
    }

    public static void a(com.grack.nanojson.c cVar) throws org.schabi.newpipe.extractor.exceptions.b {
        com.grack.nanojson.b bVarA = cVar.a("alerts");
        if (org.schabi.newpipe.extractor.utils.g.i(bVarA)) {
            return;
        }
        com.grack.nanojson.c cVarE = bVarA.b(0).e("alertRenderer");
        String strN = n(cVarE.e("text"), false);
        if (cVarE.f("type", "").equalsIgnoreCase("ERROR")) {
            if (strN == null || !(strN.contains("This account has been terminated") || strN.contains("This channel was removed"))) {
                throw new org.schabi.newpipe.extractor.exceptions.b(androidx.privacysandbox.ads.adservices.java.internal.a.r("Got error: \"", strN, "\""));
            }
            if (!strN.matches(".*violat(ed|ion|ing).*") && !strN.contains("infringement")) {
                throw new org.schabi.newpipe.extractor.exceptions.a(strN);
            }
            throw new org.schabi.newpipe.extractor.exceptions.a(strN);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.contains("webcache.googleusercontent.com") ? str.split("cache:")[1] : str;
    }

    public static int c(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (org.schabi.newpipe.extractor.utils.g.h(str)) {
            org.mozilla.javascript.typedarrays.c.b("Could not extract playlist type from empty playlist id");
            return 0;
        }
        if (str.startsWith("RDAMVM") || str.startsWith("RDCLAK")) {
            return 3;
        }
        if (str.startsWith("RDGMEM")) {
            return 5;
        }
        return str.startsWith("RD") ? 2 : 1;
    }

    public static String d(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (org.schabi.newpipe.extractor.utils.g.h(str)) {
            org.mozilla.javascript.typedarrays.c.b("Video id could not be determined from empty playlist id");
            return null;
        }
        if (str.startsWith("RDMM")) {
            return str.substring(4);
        }
        if (str.startsWith("RDAMVM") || str.startsWith("RDCLAK")) {
            return str.substring(6);
        }
        if (str.startsWith("RDGMEM")) {
            throw new org.schabi.newpipe.extractor.exceptions.f("Video id could not be determined from genre mix id: ".concat(str));
        }
        if (!str.startsWith("RD")) {
            throw new org.schabi.newpipe.extractor.exceptions.f("Video id could not be determined from playlist id: ".concat(str));
        }
        if (str.length() == 13) {
            return str.substring(2);
        }
        throw new org.schabi.newpipe.extractor.exceptions.f("Video id could not be determined from mix id: ".concat(str));
    }

    public static String e(String str) {
        if (str.startsWith("//")) {
            str = str.substring(2);
        }
        if (str.startsWith("http://")) {
            return org.schabi.newpipe.extractor.utils.g.l(str);
        }
        return !str.startsWith("https://") ? "https://".concat(str) : str;
    }

    public static Map f(String str, String str2) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        List listR = androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{str2}[0];
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-YouTube-Client-Name", listR), new AbstractMap.SimpleEntry("X-YouTube-Client-Version", androidx.compose.runtime.j.r(obj2, arrayList2, obj2, arrayList2))};
        HashMap map = new HashMap(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(key, "duplicate key: "));
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static String g() throws org.schabi.newpipe.extractor.exceptions.d {
        boolean zBooleanValue;
        if (!org.schabi.newpipe.extractor.utils.g.h(a)) {
            return a;
        }
        try {
            if (!c) {
                try {
                    a = org.schabi.newpipe.extractor.utils.g.e((String) g0.a.s("https://www.youtube.com/sw.js", m("https://www.youtube.com")).B, e);
                    c = true;
                } catch (org.schabi.newpipe.extractor.utils.e e2) {
                    org.mozilla.javascript.typedarrays.c.d("Could not extract YouTube WEB InnerTube client version from sw.js", e2);
                }
            }
        } catch (Exception unused) {
            if (!c) {
                String str = (String) g0.a.s("https://www.youtube.com/results?search_query=&ucbcb=1", i()).B;
                try {
                    Stream streamC = ((com.grack.nanojson.c) x.p().m(org.schabi.newpipe.extractor.utils.g.e(str, f))).e("responseContext").a("serviceTrackingParams").c();
                    String strH = h(streamC, "CSI", "cver");
                    a = strH;
                    if (strH == null) {
                        try {
                            a = org.schabi.newpipe.extractor.utils.g.e(str, e);
                        } catch (org.schabi.newpipe.extractor.utils.e unused2) {
                        }
                    }
                    if (org.schabi.newpipe.extractor.utils.g.h(a)) {
                        a = h(streamC, "ECATCHER", "client.version");
                    }
                    if (a == null) {
                        org.mozilla.javascript.typedarrays.c.b("Could not extract YouTube WEB InnerTube client version from HTML search results page");
                        return null;
                    }
                    c = true;
                } catch (com.grack.nanojson.d | org.schabi.newpipe.extractor.utils.e e3) {
                    org.mozilla.javascript.typedarrays.c.d("Could not get ytInitialData", e3);
                    return null;
                }
            }
        }
        if (c) {
            return a;
        }
        if (d.isPresent()) {
            zBooleanValue = ((Boolean) d.get()).booleanValue();
        } else {
            com.grack.nanojson.e eVar = new com.grack.nanojson.e();
            eVar.g();
            eVar.h("context");
            eVar.h("client");
            eVar.p("hl", "en-GB");
            eVar.p("gl", "GB");
            eVar.p("clientName", "WEB");
            eVar.p("clientVersion", "2.20260120.01.00");
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
            eVar.q("fetchLiveState", true);
            eVar.d();
            androidx.fragment.app.h hVarW = g0.a.w("https://www.youtube.com/youtubei/v1/guide?prettyPrint=false", f("1", "2.20260120.01.00"), eVar.b().getBytes(StandardCharsets.UTF_8));
            Optional optionalOf = Optional.of(Boolean.valueOf(((String) hVarW.B).length() > 5000 && hVarW.y == 200));
            d = optionalOf;
            zBooleanValue = ((Boolean) optionalOf.get()).booleanValue();
        }
        if (!zBooleanValue) {
            throw new org.schabi.newpipe.extractor.exceptions.d("Could not get YouTube WEB client version");
        }
        a = "2.20260120.01.00";
        return "2.20260120.01.00";
    }

    public static String h(Stream stream, String str, String str2) {
        Stream streamFilter = stream.filter(new org.schabi.newpipe.extractor.h(str, 3)).flatMap(new b(11)).filter(new org.schabi.newpipe.extractor.h(str2, 4));
        int i2 = 8;
        return (String) streamFilter.map(new b(i2)).filter(new com.grack.nanojson.a(i2)).findFirst().orElse(null);
    }

    public static Map i() {
        Object[] objArr = {"SOCS=".concat("CAE=")};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("Cookie", androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList))};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            return Collections.unmodifiableMap(map);
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(key, "duplicate key: "));
        return null;
    }

    public static String j(String str) {
        if (str.startsWith("user/")) {
            return androidx.compose.runtime.j.i("https://www.youtube.com/feeds/videos.xml?user=", str.replace("user/", ""));
        }
        return str.startsWith("channel/") ? androidx.compose.runtime.j.i("https://www.youtube.com/feeds/videos.xml?channel_id=", str.replace("channel/", "")) : "https://www.youtube.com/feeds/videos.xml?channel_id=".concat(str);
    }

    public static List k(com.grack.nanojson.b bVar) {
        return (List) bVar.c().filter(new com.grack.nanojson.a(12)).map(new b(10)).collect(DesugarCollectors.toUnmodifiableList());
    }

    public static com.grack.nanojson.c l(String str, byte[] bArr, org.schabi.newpipe.extractor.localization.c cVar) {
        return org.schabi.newpipe.extractor.utils.b.m(s(g0.a.x(androidx.privacysandbox.ads.adservices.java.internal.a.r("https://www.youtube.com/youtubei/v1/", str, "?prettyPrint=false"), u(), bArr, cVar)));
    }

    public static Map m(String str) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        List listR = androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("Origin", listR), new AbstractMap.SimpleEntry("Referer", listR)};
        HashMap map = new HashMap(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(key, "duplicate key: "));
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static String n(com.grack.nanojson.c cVar, boolean z) {
        if (!org.schabi.newpipe.extractor.utils.g.j(cVar)) {
            if (cVar.containsKey("simpleText")) {
                return cVar.f("simpleText", null);
            }
            com.grack.nanojson.b<com.grack.nanojson.c> bVarA = cVar.a("runs");
            if (!bVarA.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (com.grack.nanojson.c cVar2 : bVarA) {
                    String strF = cVar2.f("text", null);
                    if (z) {
                        if (cVar2.containsKey("navigationEndpoint")) {
                            String strQ = q(cVar2.e("navigationEndpoint"));
                            if (!org.schabi.newpipe.extractor.utils.g.h(strQ)) {
                                strF = androidx.compose.runtime.j.k("<a href=\"", org.jsoup.nodes.l.d(strQ), "\">", org.jsoup.nodes.l.d(strF), "</a>");
                            }
                        }
                        boolean z2 = false;
                        boolean z3 = cVar2.containsKey("bold") && cVar2.b("bold");
                        boolean z4 = cVar2.containsKey("italics") && cVar2.b("italics");
                        if (cVar2.containsKey("strikethrough") && cVar2.b("strikethrough")) {
                            z2 = true;
                        }
                        if (z3) {
                            sb.append("<b>");
                        }
                        if (z4) {
                            sb.append("<i>");
                        }
                        if (z2) {
                            sb.append("<s>");
                        }
                        sb.append(strF);
                        if (z2) {
                            sb.append("</s>");
                        }
                        if (z4) {
                            sb.append("</i>");
                        }
                        if (z3) {
                            sb.append("</b>");
                        }
                    } else {
                        sb.append(strF);
                    }
                }
                String string = sb.toString();
                return z ? string.replaceAll("\\n", "<br>").replaceAll(" {2}", " &nbsp;") : string;
            }
        }
        return null;
    }

    public static String o(com.grack.nanojson.c cVar, String str) {
        String strN = n(cVar, false);
        if (strN != null) {
            return strN;
        }
        throw new org.schabi.newpipe.extractor.exceptions.f("Could not extract text: ".concat(str));
    }

    public static List p(com.grack.nanojson.c cVar) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return k(cVar.e("thumbnail").a("thumbnails"));
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not get thumbnails from InfoItem", e2);
            return null;
        }
    }

    public static String q(com.grack.nanojson.c cVar) {
        if (cVar.containsKey("urlEndpoint")) {
            String strF = cVar.e("urlEndpoint").f("url", null);
            if (strF.startsWith("https://www.youtube.com/redirect?")) {
                strF = strF.substring(23);
            }
            if (strF.startsWith("/redirect?")) {
                for (String str : strF.substring(10).split("&")) {
                    if (str.split("=")[0].equals("q")) {
                        String str2 = str.split("=")[1];
                        Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
                        return URLDecoder.decode(str2, StandardCharsets.UTF_8);
                    }
                }
            } else {
                if (strF.startsWith("http")) {
                    return strF;
                }
                if (strF.startsWith("/channel") || strF.startsWith("/user") || strF.startsWith("/watch")) {
                    return "https://www.youtube.com".concat(strF);
                }
            }
        }
        if (cVar.containsKey("browseEndpoint")) {
            com.grack.nanojson.c cVarE = cVar.e("browseEndpoint");
            String strF2 = cVarE.f("canonicalBaseUrl", null);
            String strF3 = cVarE.f("browseId", null);
            if (strF3 != null) {
                if (strF3.startsWith("UC")) {
                    return "https://www.youtube.com/channel/".concat(strF3);
                }
                if (strF3.startsWith("VL")) {
                    return "https://www.youtube.com/playlist?list=".concat(strF3.substring(2));
                }
            }
            if (!org.schabi.newpipe.extractor.utils.g.h(strF2)) {
                return androidx.compose.runtime.j.i("https://www.youtube.com", strF2);
            }
        }
        if (cVar.containsKey("watchEndpoint")) {
            StringBuilder sb = new StringBuilder("https://www.youtube.com/watch?v=");
            sb.append(cVar.e("watchEndpoint").f("videoId", null));
            if (cVar.e("watchEndpoint").containsKey("playlistId")) {
                sb.append("&list=");
                sb.append(cVar.e("watchEndpoint").f("playlistId", null));
            }
            if (cVar.e("watchEndpoint").containsKey("startTimeSeconds")) {
                sb.append("&t=");
                sb.append(cVar.e("watchEndpoint").c("startTimeSeconds", 0));
            }
            return sb.toString();
        }
        if (cVar.containsKey("watchPlaylistEndpoint")) {
            return androidx.compose.runtime.j.i("https://www.youtube.com/playlist?list=", cVar.e("watchPlaylistEndpoint").f("playlistId", null));
        }
        if (cVar.containsKey("showDialogCommand")) {
            try {
                return q((com.grack.nanojson.c) org.schabi.newpipe.extractor.utils.b.e(((com.grack.nanojson.b) org.schabi.newpipe.extractor.utils.b.e(cVar, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems", com.grack.nanojson.b.class)).b(0), "listItemViewModel.rendererContext.commandContext.onTap.innertubeCommand", com.grack.nanojson.c.class));
            } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            }
        }
        if (cVar.containsKey("commandMetadata")) {
            com.grack.nanojson.c cVarE2 = cVar.e("commandMetadata").e("webCommandMetadata");
            if (cVarE2.containsKey("url")) {
                return androidx.compose.runtime.j.i("https://www.youtube.com", cVarE2.f("url", null));
            }
        }
        return null;
    }

    public static String r(com.grack.nanojson.c cVar) {
        if (org.schabi.newpipe.extractor.utils.g.j(cVar)) {
            return null;
        }
        com.grack.nanojson.b bVarA = cVar.a("runs");
        if (bVarA.isEmpty()) {
            return null;
        }
        Iterator<E> it = bVarA.iterator();
        while (it.hasNext()) {
            String strQ = q(((com.grack.nanojson.c) it.next()).e("navigationEndpoint"));
            if (!org.schabi.newpipe.extractor.utils.g.h(strQ)) {
                return strQ;
            }
        }
        return null;
    }

    public static String s(androidx.fragment.app.h hVar) throws org.schabi.newpipe.extractor.exceptions.f {
        String str;
        int i2 = hVar.y;
        String str2 = (String) hVar.C;
        if (i2 == 404) {
            throw new org.schabi.newpipe.extractor.exceptions.b("Not found (\"" + i2 + " " + ((String) hVar.z) + "\")");
        }
        String str3 = (String) hVar.B;
        if (str3.length() < 50) {
            org.mozilla.javascript.typedarrays.c.b("JSON response is too short");
            return null;
        }
        URL url = new URL(str2);
        if (url.getHost().equalsIgnoreCase("www.youtube.com")) {
            String path = url.getPath();
            if (path.equalsIgnoreCase("/oops") || path.equalsIgnoreCase("/error")) {
                throw new org.schabi.newpipe.extractor.exceptions.b("Content unavailable");
            }
        }
        Iterator it = ((Map) hVar.A).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            if (str4 != null && str4.equalsIgnoreCase("Content-Type") && !((List) entry.getValue()).isEmpty()) {
                str = (String) ((List) entry.getValue()).get(0);
                break;
            }
        }
        if (str == null || !str.toLowerCase().contains("text/html")) {
            return str3;
        }
        throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Got HTML document, expected JSON response (latest url was: \"", str2, "\")"));
    }

    public static String t(com.google.android.material.internal.k kVar, org.schabi.newpipe.extractor.localization.c cVar, org.schabi.newpipe.extractor.localization.a aVar, Map map, String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = org.schabi.newpipe.extractor.utils.b.m(s(g0.a.w(androidx.compose.runtime.j.j(str, "visitor_id", "?prettyPrint=false"), map, okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) A(cVar, aVar, kVar).z).getBytes(StandardCharsets.UTF_8)))).e("responseContext").f("visitorData", null);
        if (!org.schabi.newpipe.extractor.utils.g.h(strF)) {
            return strF;
        }
        org.mozilla.javascript.typedarrays.c.b("Could not get visitorData");
        return null;
    }

    public static HashMap u() {
        HashMap map = new HashMap(m("https://www.youtube.com"));
        map.putAll(f("1", g()));
        Object[] objArr = {"SOCS=".concat("CAE=")};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        map.put("Cookie", androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList));
        return map;
    }

    public static String v() {
        String[] strArr = e;
        if (!org.schabi.newpipe.extractor.utils.g.h(b)) {
            return b;
        }
        com.grack.nanojson.e eVar = new com.grack.nanojson.e();
        eVar.g();
        eVar.h("context");
        eVar.h("client");
        eVar.p("clientName", "WEB_REMIX");
        eVar.p("clientVersion", "1.20260121.03.00");
        eVar.p("hl", "en-GB");
        eVar.p("gl", "GB");
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
        eVar.p("input", "");
        eVar.d();
        byte[] bytes = eVar.b().getBytes(StandardCharsets.UTF_8);
        HashMap map = new HashMap(m("https://music.youtube.com"));
        map.putAll(f("67", "2.20260120.01.00"));
        androidx.fragment.app.h hVarW = g0.a.w("https://music.youtube.com/youtubei/v1/music/get_search_suggestions?prettyPrint=false", map, bytes);
        if (((String) hVarW.B).length() > 500 && hVarW.y == 200) {
            b = "1.20260121.03.00";
            return "1.20260121.03.00";
        }
        try {
            b = org.schabi.newpipe.extractor.utils.g.e((String) g0.a.s("https://music.youtube.com/sw.js", m("https://music.youtube.com")).B, strArr);
        } catch (Exception unused) {
            b = org.schabi.newpipe.extractor.utils.g.e((String) g0.a.s("https://music.youtube.com/?ucbcb=1", i()).B, strArr);
        }
        return b;
    }

    public static boolean w(com.grack.nanojson.b bVar) {
        if (org.schabi.newpipe.extractor.utils.g.i(bVar)) {
            return false;
        }
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            String strF = ((com.grack.nanojson.c) it.next()).e("metadataBadgeRenderer").f("style", null);
            if (strF != null && (strF.equals("BADGE_STYLE_TYPE_VERIFIED") || strF.equals("BADGE_STYLE_TYPE_VERIFIED_ARTIST"))) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(URL url) {
        return j.contains(url.getHost().toLowerCase(Locale.ROOT));
    }

    public static int y(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        int i2;
        if (!str.matches(".*\\d.*") && !str.equalsIgnoreCase("SHORTS")) {
            throw new org.schabi.newpipe.extractor.exceptions.f("Error duration string contains no digits: ".concat(str));
        }
        String[] strArrSplit = str.contains(":") ? str.split(":") : str.split("\\.");
        int[] iArr = {24, 60, 60, 1};
        int length = 4 - strArrSplit.length;
        if (length < 0) {
            throw new org.schabi.newpipe.extractor.exceptions.f("Error duration string with unknown format: ".concat(str));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            int i5 = iArr[i4 + length];
            String str2 = strArrSplit[i4];
            if (str2 == null || str2.isEmpty()) {
                i2 = 0;
            } else {
                Pattern pattern = org.schabi.newpipe.extractor.utils.g.a;
                try {
                    i2 = Integer.parseInt(str2.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
            }
            i3 = (i3 + i2) * i5;
        }
        return i3;
    }

    public static com.google.android.material.internal.k z(org.schabi.newpipe.extractor.localization.c cVar, org.schabi.newpipe.extractor.localization.a aVar) {
        com.grack.nanojson.c cVar2 = new com.grack.nanojson.c();
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(15, false);
        Stack stack = new Stack();
        kVar.y = stack;
        kVar.z = cVar2;
        stack.push(cVar2);
        kVar.w("context");
        kVar.w("client");
        kVar.G(cVar.b(), "hl");
        kVar.G(aVar.e, "gl");
        kVar.G("WEB", "clientName");
        kVar.G(g(), "clientVersion");
        kVar.G("https://www.youtube.com", "originalUrl");
        kVar.G("DESKTOP", "platform");
        kVar.G(0, "utcOffsetMinutes");
        kVar.q();
        kVar.w("request");
        com.grack.nanojson.b bVar = new com.grack.nanojson.b();
        kVar.G(bVar, "internalExperimentFlags");
        stack.push(bVar);
        kVar.q();
        kVar.H("useSsl", true);
        kVar.q();
        kVar.w("user");
        kVar.H("lockedSafetyMode", false);
        kVar.q();
        kVar.q();
        return kVar;
    }
}
