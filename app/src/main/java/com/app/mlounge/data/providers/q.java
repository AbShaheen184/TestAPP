package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final int $stable = 8;
    private static final String API_BASE = "https://www.eporner.com/api/v2";
    private static final String SITE = "https://www.eporner.com";
    private static final String TAG = "EpornerApi";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:125.0) Gecko/20100101 Firefox/125.0";
    private final okhttp3.y client;
    private final p cookieJar;
    private final com.google.gson.e gson;
    private final Map<String, String> headers;
    public static final o Companion = new o();
    private static final List<String> CATEGORIES = kotlin.collections.q.k("4K Ultra HD", "60 FPS", "Amateur", "Anal", "Asian", "ASMR", "BBW", "BDSM", "Big Ass", "Big Dick", "Big Tits", "Bisexual", "Blonde", "Blowjob", "Bondage", "Brunette", "Bukkake", "Creampie", "Cumshot", "Double Penetration", "Ebony", "Fat", "Fetish", "Fisting", "Footjob", "For Women", "Gay", "German", "Gonzo", "Group sex", "Hairy", "Handjob", "Hardcore", "HD Porn", "Hentai", "Indian", "Interracial", "Japanese", "Latina", "Lesbian", "Lingerie", "Massage", "Masturbation", "Mature", "MILF", "Office", "Old/Young", "Orgasm", "Orgy", "Outdoor", "Parody", "Party", "POV", "Public", "Pussy licking", "Reality", "Redhead", "Shemale", "Sleep", "Small Tits", "Squirt", "Striptease", "Students", "Swinger", "Teen", "Threesome", "Toys", "Uncategorized", "Uniform", "Vintage", "VR Porn", "Webcam");
    private static final Map<String, String> CATEGORY_SLUG = kotlin.collections.c0.k(new kotlin.k("4K Ultra HD", "4k"), new kotlin.k("60 FPS", "60-fps"), new kotlin.k("HD Porn", "hd-porn"), new kotlin.k("Old/Young", "old-young"), new kotlin.k("Group sex", "group-sex"), new kotlin.k("Pussy licking", "pussy-licking"), new kotlin.k("VR Porn", "vr-porn"));

    public q(okhttp3.y yVar) {
        p pVar = new p();
        this.cookieJar = pVar;
        okhttp3.x xVarA = yVar.a();
        xVarA.k = pVar;
        this.client = new okhttp3.y(xVarA);
        this.gson = new com.google.gson.e();
        this.headers = kotlin.collections.c0.k(new kotlin.k("User-Agent", UA), new kotlin.k("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,application/json;q=0.8,*/*;q=0.7"), new kotlin.k("Accept-Language", "en-US,en;q=0.5"), new kotlin.k("Referer", "https://www.eporner.com/"));
    }

    public final String b(String str, String str2, Map map) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            a0Var.a(entry.getKey(), entry.getValue());
        }
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                a0Var.a((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        if (str2 != null) {
            a0Var.a("Referer", str2);
        }
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        try {
            okhttp3.y yVar = this.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                String strA = g0VarE.D.A();
                if (g0VarE.N) {
                    g0VarE.close();
                    return strA;
                }
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("W", TAG, "HTTP " + g0VarE.A + " for " + str + " — " + kotlin.text.k.e0(LibretroCore.SCREEN_WIDTH, strA));
                g0VarE.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "Fetch failed for ".concat(str), e);
            return null;
        }
        Context context3 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.d(TAG, "Fetch failed for ".concat(str), e);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:67:0x00fd, B:69:0x0103, B:71:0x010e, B:73:0x0114, B:75:0x011f, B:77:0x012b, B:79:0x0133, B:80:0x013e, B:82:0x0144, B:84:0x0156, B:86:0x015e, B:90:0x016f, B:92:0x0175, B:94:0x0182, B:96:0x0188, B:98:0x0193, B:101:0x01a3), top: B:108:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:67:0x00fd, B:69:0x0103, B:71:0x010e, B:73:0x0114, B:75:0x011f, B:77:0x012b, B:79:0x0133, B:80:0x013e, B:82:0x0144, B:84:0x0156, B:86:0x015e, B:90:0x016f, B:92:0x0175, B:94:0x0182, B:96:0x0188, B:98:0x0193, B:101:0x01a3), top: B:108:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0175 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:67:0x00fd, B:69:0x0103, B:71:0x010e, B:73:0x0114, B:75:0x011f, B:77:0x012b, B:79:0x0133, B:80:0x013e, B:82:0x0144, B:84:0x0156, B:86:0x015e, B:90:0x016f, B:92:0x0175, B:94:0x0182, B:96:0x0188, B:98:0x0193, B:101:0x01a3), top: B:108:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:96:0x0188 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:67:0x00fd, B:69:0x0103, B:71:0x010e, B:73:0x0114, B:75:0x011f, B:77:0x012b, B:79:0x0133, B:80:0x013e, B:82:0x0144, B:84:0x0156, B:86:0x015e, B:90:0x016f, B:92:0x0175, B:94:0x0182, B:96:0x0188, B:98:0x0193, B:101:0x01a3), top: B:108:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    public final EpornerVideoDetail c(String str) {
        EpornerVideoDetail epornerVideoDetail;
        String strH;
        String str2;
        EpornerThumb epornerThumb;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.g gVarL;
        Integer numValueOf;
        com.google.gson.g gVarL2;
        Integer numValueOf2;
        com.google.gson.g gVarL3;
        Integer numValueOf3;
        com.google.gson.g gVarL4;
        Integer numValueOf4;
        String strH2;
        String strH3;
        String strP = str;
        if (kotlin.text.r.u(strP, "eporner_", false)) {
            strP = kotlin.text.k.P(strP, "eporner_");
        }
        String strR = androidx.privacysandbox.ads.adservices.java.internal.a.r("https://www.eporner.com/api/v2/video/id/?id=", strP, "&thumbsize=big&format=json");
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "getVideoDetail: ".concat(strR));
        String strB = b(strR, null, null);
        if (strB != null) {
            try {
                com.google.gson.j jVar = (com.google.gson.j) this.gson.d(com.google.gson.j.class, strB);
                if (jVar != null) {
                    com.google.gson.j jVarO = jVar.o("video");
                    if (jVarO != null) {
                        jVar = jVarO;
                    }
                    com.google.gson.g gVarL5 = jVar.l("id");
                    if (gVarL5 != null && (strH = gVarL5.h()) != null) {
                        com.google.gson.g gVarL6 = jVar.l("title");
                        String str3 = (gVarL6 == null || (strH3 = gVarL6.h()) == null) ? "" : strH3;
                        com.google.gson.g gVarL7 = jVar.l("keywords");
                        String strH4 = gVarL7 != null ? gVarL7.h() : null;
                        com.google.gson.g gVarL8 = jVar.l("views");
                        Long lValueOf = gVarL8 != null ? Long.valueOf(gVarL8.f()) : null;
                        com.google.gson.g gVarL9 = jVar.l("rate");
                        String strH5 = gVarL9 != null ? gVarL9.h() : null;
                        com.google.gson.g gVarL10 = jVar.l("added");
                        String strH6 = gVarL10 != null ? gVarL10.h() : null;
                        com.google.gson.g gVarL11 = jVar.l("length_min");
                        String str4 = (gVarL11 == null || (strH2 = gVarL11.h()) == null) ? "" : strH2;
                        com.google.gson.j jVarO2 = jVar.o("default_thumb");
                        epornerVideoDetail = null;
                        String str5 = "src";
                        if (jVarO2 != null) {
                            try {
                                com.google.gson.g gVarL12 = jVarO2.l("src");
                                if (gVarL12 != null) {
                                    str2 = strH4;
                                    String strH7 = gVarL12.h();
                                    String strS = strH7 != null ? kotlin.text.r.s(strH7, "\\/", "/", false) : null;
                                    gVarL3 = jVarO2.l("width");
                                    if (gVarL3 != null) {
                                        numValueOf3 = Integer.valueOf(gVarL3.c());
                                    } else {
                                        numValueOf3 = null;
                                    }
                                    gVarL4 = jVarO2.l("height");
                                    if (gVarL4 != null) {
                                        numValueOf4 = Integer.valueOf(gVarL4.c());
                                    } else {
                                        numValueOf4 = null;
                                    }
                                    epornerThumb = new EpornerThumb(strS, numValueOf3, numValueOf4);
                                } else {
                                    str2 = strH4;
                                }
                                gVarL3 = jVarO2.l("width");
                                if (gVarL3 != null) {
                                    numValueOf3 = Integer.valueOf(gVarL3.c());
                                } else {
                                    numValueOf3 = null;
                                }
                                gVarL4 = jVarO2.l("height");
                                if (gVarL4 != null) {
                                    numValueOf4 = Integer.valueOf(gVarL4.c());
                                } else {
                                    numValueOf4 = null;
                                }
                                epornerThumb = new EpornerThumb(strS, numValueOf3, numValueOf4);
                            } catch (Exception e) {
                                e = e;
                                Context context2 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.d(TAG, "parseDetailResponse failed", e);
                                return epornerVideoDetail;
                            }
                        } else {
                            str2 = strH4;
                            lValueOf = lValueOf;
                            epornerThumb = null;
                        }
                        com.google.gson.f fVarM = jVar.m("thumbs");
                        if (fVarM != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Iterator it2 = fVarM.e.iterator(); it2.hasNext(); it2 = it) {
                                com.google.gson.j jVarE = ((com.google.gson.g) it2.next()).e();
                                com.google.gson.g gVarL13 = jVarE.l(str5);
                                if (gVarL13 != null) {
                                    it = it2;
                                    String strH8 = gVarL13.h();
                                    String strS2 = strH8 != null ? kotlin.text.r.s(strH8, "\\/", "/", false) : null;
                                    gVarL = jVarE.l("width");
                                    if (gVarL != null) {
                                        numValueOf = Integer.valueOf(gVarL.c());
                                    } else {
                                        numValueOf = null;
                                    }
                                    gVarL2 = jVarE.l("height");
                                    if (gVarL2 != null) {
                                        numValueOf2 = Integer.valueOf(gVarL2.c());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    arrayList2.add(new EpornerThumb(strS2, numValueOf, numValueOf2));
                                    str5 = str5;
                                } else {
                                    it = it2;
                                }
                                gVarL = jVarE.l("width");
                                if (gVarL != null) {
                                    numValueOf = Integer.valueOf(gVarL.c());
                                } else {
                                    numValueOf = null;
                                }
                                gVarL2 = jVarE.l("height");
                                if (gVarL2 != null) {
                                    numValueOf2 = Integer.valueOf(gVarL2.c());
                                } else {
                                    numValueOf2 = null;
                                }
                                arrayList2.add(new EpornerThumb(strS2, numValueOf, numValueOf2));
                                str5 = str5;
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        return new EpornerVideoDetail("eporner_" + strH, str3, str2, lValueOf, strH5, strH6, str4, epornerThumb, arrayList);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                epornerVideoDetail = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EpornerResolveResponse d(String str) {
        String strI;
        com.google.gson.j jVarO;
        EpornerResolveResponse epornerResolveResponse;
        String strH;
        String strH2;
        String strP = str;
        strP.getClass();
        if (kotlin.text.r.u(strP, "eporner_", false)) {
            strP = kotlin.text.k.P(strP, "eporner_");
        }
        String str2 = strP;
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "warmupSession: visiting https://www.eporner.com to establish cookies");
        EpornerResolveResponse epornerResolveResponse2 = null;
        b("https://www.eporner.com/", null, null);
        com.app.mlounge.util.a.a("D", TAG, "warmupSession: done");
        String str3 = "https://www.eporner.com/embed/" + str2 + "/";
        com.app.mlounge.util.a.a("D", TAG, "resolveVideo: fetching embed ".concat(str3));
        String strB = b(str3, null, null);
        if (strB != null) {
            kotlin.text.g gVarS = androidx.compose.runtime.j.s("EP\\.video\\.player\\.hash\\s*=\\s*'([a-f0-9]+)'", 0, strB, strB);
            String str4 = gVarS != null ? (String) ((kotlin.collections.d0) gVarS.a()).get(1) : null;
            if (str4 == null || str4.length() != 32) {
                com.app.mlounge.util.a.a("W", TAG, "extractHash — no 32-char hex hash found in embed HTML");
                strI = null;
            } else {
                strI = kotlin.collections.p.I(new kotlin.ranges.d(0, 3, 1), "", null, null, new com.app.mlounge.data.local.dao.l(str4, 3), 30);
            }
            if (strI == null) {
                com.app.mlounge.util.a.a("W", TAG, "resolveVideo: hash not found in embed page for ".concat(str2));
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbQ = androidx.compose.runtime.j.q("https://www.eporner.com/xhr/video/", str2, "?hash=", strI, "&domain=www.eporner.com&pixelRatio=1&playerWidth=0&playerHeight=0&fallback=false&embed=true&supportedFormats=hls,dash,h265,vp9,av1,mp4&_=");
            sbQ.append(jCurrentTimeMillis);
            String string = sbQ.toString();
            com.app.mlounge.util.a.a("D", TAG, "resolveVideo: XHR ".concat(string));
            String strB2 = b(string, str3, kotlin.collections.c0.k(new kotlin.k("Accept", "application/json, text/plain, */*"), new kotlin.k("Origin", SITE), new kotlin.k("X-Requested-With", "XMLHttpRequest")));
            if (strB2 != null) {
                try {
                    com.google.gson.j jVar = (com.google.gson.j) this.gson.d(com.google.gson.j.class, strB2);
                    if (jVar != null && (jVarO = jVar.o("sources")) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        com.google.gson.j jVarO2 = jVarO.o("mp4");
                        if (jVarO2 != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it = ((com.google.gson.internal.l) jVarO2.e.keySet()).iterator();
                            while (((com.google.gson.internal.k) it).hasNext()) {
                                String str5 = (String) ((com.google.gson.internal.k) it).c().C;
                                epornerResolveResponse2 = epornerResolveResponse2;
                                try {
                                    com.google.gson.j jVarO3 = jVarO2.o(str5);
                                    if (jVarO3 != null) {
                                        com.google.gson.g gVarL = jVarO3.l("labelShort");
                                        String str6 = (gVarL == null || (strH2 = gVarL.h()) == null) ? str5 : strH2;
                                        com.google.gson.g gVarL2 = jVarO3.l("src");
                                        String strH3 = gVarL2 != null ? gVarL2.h() : epornerResolveResponse2;
                                        com.google.gson.g gVarL3 = jVarO3.l("default");
                                        linkedHashMap2.put(str5, new EpornerSourceDetail(str6, strH3, "mp4", Boolean.valueOf(gVarL3 != null ? gVarL3.b() : false)));
                                        jVarO2 = jVarO2;
                                        it = it;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    Context context2 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.d(TAG, "parseXhrResponse failed for ".concat(str2), e);
                                    return epornerResolveResponse2;
                                }
                            }
                            epornerResolveResponse = epornerResolveResponse2;
                            if (!linkedHashMap2.isEmpty()) {
                                linkedHashMap.put("mp4", linkedHashMap2);
                            }
                        } else {
                            epornerResolveResponse = null;
                        }
                        com.google.gson.j jVarO4 = jVarO.o("hls");
                        if (jVarO4 != null) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            Iterator it2 = ((com.google.gson.internal.l) jVarO4.e.keySet()).iterator();
                            while (((com.google.gson.internal.k) it2).hasNext()) {
                                String str7 = (String) ((com.google.gson.internal.k) it2).c().C;
                                com.google.gson.j jVarO5 = jVarO4.o(str7);
                                if (jVarO5 != null) {
                                    com.google.gson.g gVarL4 = jVarO5.l("labelShort");
                                    if (gVarL4 == null || (strH = gVarL4.h()) == null) {
                                        strH = str7;
                                    }
                                    com.google.gson.g gVarL5 = jVarO5.l("src");
                                    String strH4 = gVarL5 != null ? gVarL5.h() : epornerResolveResponse;
                                    com.google.gson.g gVarL6 = jVarO5.l("default");
                                    linkedHashMap3.put(str7, new EpornerSourceDetail(strH, strH4, "hls", Boolean.valueOf(gVarL6 != null ? gVarL6.b() : false)));
                                }
                            }
                            if (!linkedHashMap3.isEmpty()) {
                                linkedHashMap.put("hls", linkedHashMap3);
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            return new EpornerResolveResponse(linkedHashMap);
                        }
                        Context context3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("W", TAG, "parseXhrResponse — no sources in XHR response for " + str2);
                        return epornerResolveResponse;
                    }
                } catch (Exception e2) {
                    e = e2;
                    epornerResolveResponse2 = epornerResolveResponse2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.app.mlounge.data.remote.model.EpornerThumb] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final EpornerSearchDetails e(int i, String str) {
        EpornerSearchDetails epornerSearchDetails;
        com.google.gson.f fVarM;
        Object epornerVideo;
        String strH;
        ?? epornerThumb;
        String strH2;
        ?? r21;
        String strH3;
        String strH4;
        String strH5;
        String strH6;
        str.getClass();
        String strS = CATEGORY_SLUG.get(str);
        boolean z = false;
        if (strS == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            strS = kotlin.text.r.s(lowerCase, " ", "-", false);
        }
        String str2 = "https://www.eporner.com/api/v2/video/search/?query=" + strS + "&per_page=30&page=" + i + "&thumbsize=big&order=&format=json";
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "searchVideos: ".concat(str2));
        EpornerSearchDetails epornerSearchDetails2 = null;
        String strB = b(str2, null, null);
        if (strB != null) {
            try {
                com.google.gson.j jVar = (com.google.gson.j) this.gson.d(com.google.gson.j.class, strB);
                if (jVar != null && (fVarM = jVar.m("videos")) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fVarM.e.iterator();
                    while (it.hasNext()) {
                        com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                        com.google.gson.g gVarL = jVarE.l("id");
                        if (gVarL == null || (strH = gVarL.h()) == null) {
                            epornerSearchDetails = epornerSearchDetails2;
                            it = it;
                            epornerVideo = epornerSearchDetails;
                        } else {
                            com.google.gson.g gVarL2 = jVarE.l("title");
                            String str3 = (gVarL2 == null || (strH6 = gVarL2.h()) == null) ? "" : strH6;
                            com.google.gson.g gVarL3 = jVarE.l("keywords");
                            ?? H = gVarL3 != null ? gVarL3.h() : epornerSearchDetails2;
                            com.google.gson.g gVarL4 = jVarE.l("views");
                            ?? ValueOf = gVarL4 != null ? Long.valueOf(gVarL4.f()) : epornerSearchDetails2;
                            com.google.gson.g gVarL5 = jVarE.l("rate");
                            ?? H2 = gVarL5 != null ? gVarL5.h() : epornerSearchDetails2;
                            com.google.gson.g gVarL6 = jVarE.l("url");
                            ?? S = (gVarL6 == null || (strH5 = gVarL6.h()) == null) ? epornerSearchDetails2 : kotlin.text.r.s(strH5, "\\/", "/", z);
                            com.google.gson.g gVarL7 = jVarE.l("added");
                            ?? H3 = gVarL7 != null ? gVarL7.h() : epornerSearchDetails2;
                            com.google.gson.g gVarL8 = jVarE.l("length_min");
                            String str4 = (gVarL8 == null || (strH4 = gVarL8.h()) == null) ? "" : strH4;
                            com.google.gson.j jVarO = jVarE.o("default_thumb");
                            epornerSearchDetails = epornerSearchDetails2;
                            if (jVarO != null) {
                                try {
                                    com.google.gson.g gVarL9 = jVarO.l("src");
                                    ?? S2 = (gVarL9 == null || (strH2 = gVarL9.h()) == null) ? epornerSearchDetails : kotlin.text.r.s(strH2, "\\/", "/", false);
                                    com.google.gson.g gVarL10 = jVarO.l("width");
                                    ?? ValueOf2 = gVarL10 != null ? Integer.valueOf(gVarL10.c()) : epornerSearchDetails;
                                    com.google.gson.g gVarL11 = jVarO.l("height");
                                    epornerThumb = new EpornerThumb(S2, ValueOf2, gVarL11 != null ? Integer.valueOf(gVarL11.c()) : epornerSearchDetails);
                                } catch (Exception e) {
                                    e = e;
                                    Context context2 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.d(TAG, "parseSearchResponse failed", e);
                                    return epornerSearchDetails;
                                }
                            } else {
                                it = it;
                                epornerThumb = epornerSearchDetails;
                            }
                            com.google.gson.f fVarM2 = jVarE.m("thumbs");
                            if (fVarM2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Iterator it2 = fVarM2.e.iterator(); it2.hasNext(); it2 = it2) {
                                    com.google.gson.j jVarE2 = ((com.google.gson.g) it2.next()).e();
                                    com.google.gson.g gVarL12 = jVarE2.l("src");
                                    ?? S3 = (gVarL12 == null || (strH3 = gVarL12.h()) == null) ? epornerSearchDetails : kotlin.text.r.s(strH3, "\\/", "/", false);
                                    com.google.gson.g gVarL13 = jVarE2.l("width");
                                    ?? ValueOf3 = gVarL13 != null ? Integer.valueOf(gVarL13.c()) : epornerSearchDetails;
                                    com.google.gson.g gVarL14 = jVarE2.l("height");
                                    arrayList2.add(new EpornerThumb(S3, ValueOf3, gVarL14 != null ? Integer.valueOf(gVarL14.c()) : epornerSearchDetails));
                                }
                                r21 = arrayList2;
                            } else {
                                r21 = epornerSearchDetails;
                            }
                            epornerVideo = new EpornerVideo("eporner_" + strH, str3, H, ValueOf, H2, H3, str4, epornerThumb, r21, S);
                        }
                        if (epornerVideo != null) {
                            arrayList.add(epornerVideo);
                        }
                        epornerSearchDetails2 = epornerSearchDetails;
                        it = it;
                        z = false;
                    }
                    epornerSearchDetails = epornerSearchDetails2;
                    com.google.gson.g gVarL15 = jVar.l("total_count");
                    ?? ValueOf4 = gVarL15 != null ? Integer.valueOf(gVarL15.c()) : epornerSearchDetails;
                    com.google.gson.g gVarL16 = jVar.l("total_pages");
                    ?? ValueOf5 = gVarL16 != null ? Integer.valueOf(gVarL16.c()) : epornerSearchDetails;
                    com.google.gson.g gVarL17 = jVar.l("page");
                    ?? ValueOf6 = gVarL17 != null ? Integer.valueOf(gVarL17.c()) : epornerSearchDetails;
                    com.google.gson.g gVarL18 = jVar.l("per_page");
                    return new EpornerSearchDetails(ValueOf4, ValueOf5, ValueOf6, gVarL18 != null ? Integer.valueOf(gVarL18.c()) : epornerSearchDetails, arrayList);
                }
            } catch (Exception e2) {
                e = e2;
                epornerSearchDetails = epornerSearchDetails2;
            }
        }
        return null;
    }
}
