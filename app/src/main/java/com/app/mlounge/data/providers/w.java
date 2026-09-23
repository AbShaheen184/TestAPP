package com.app.mlounge.data.providers;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements l0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://4khdhub.one";
    public static final t Companion = new t();
    private static final Set<String> EXCLUDED_HOSTS = kotlin.collections.o.D(new String[]{"fileshub.fivay65193.workers.dev", "royal-moon-5c75.boles507773229.workers.dev"});
    private static final int MAX_RESULTS = 5;
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final m1 tmdbHelper;
    private final String name = "4KHDHub";
    private final long maxPageBodyLength = 5000000;

    public w(okhttp3.y yVar, m1 m1Var) {
        this.client = yVar;
        this.tmdbHelper = m1Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x033a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0348  */
    /* JADX WARN: Code duplicated, block: B:113:0x0364  */
    /* JADX WARN: Code duplicated, block: B:116:0x0382  */
    /* JADX WARN: Code duplicated, block: B:122:0x03af A[LOOP:1: B:120:0x03a9->B:122:0x03af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0382 -> B:117:0x0389). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0393 -> B:119:0x03a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(com.app.mlounge.data.providers.w r23, java.lang.String r24, java.lang.String r25, java.util.List r26, java.util.Set r27, kotlin.coroutines.jvm.internal.c r28) {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.providers.w.b(com.app.mlounge.data.providers.w, java.lang.String, java.lang.String, java.util.List, java.util.Set, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public static final String c(w wVar, String str) {
        wVar.getClass();
        if (kotlin.text.k.J(str)) {
            return "Unknown";
        }
        Pattern patternCompile = Pattern.compile("(\\d{3,4})p", 66);
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str);
        if (gVarA == null) {
            Pattern patternCompile2 = Pattern.compile("4K|UHD|2160", 66);
            patternCompile2.getClass();
            return patternCompile2.matcher(str).find() ? "2160p" : "Unknown";
        }
        Integer numW = kotlin.text.r.w((String) ((kotlin.collections.d0) gVarA.a()).get(1));
        if (numW == null) {
            return "1080p";
        }
        int iIntValue = numW.intValue();
        if (iIntValue >= 2160) {
            return "2160p";
        }
        if (iIntValue >= 1080) {
            return "1080p";
        }
        return iIntValue >= 720 ? "720p" : androidx.compose.runtime.j.d(iIntValue, "p");
    }

    public static final List e(w wVar, String str, String str2) {
        String str3;
        String strG;
        String strG2;
        String strOptString;
        String strG3;
        String string;
        int i;
        wVar.getClass();
        kotlin.collections.w wVar2 = kotlin.collections.w.e;
        try {
            String strH = wVar.h(str, str2);
            if (strH != null) {
                Pattern patternCompile = Pattern.compile("s\\('o','([^']+)'");
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(strH);
                matcher.getClass();
                kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strH);
                if (gVarA != null && (str3 = (String) kotlin.collections.p.E(1, gVarA.a())) != null && (strG = g(str3)) != null && (strG2 = g(strG)) != null) {
                    ArrayList arrayList = new ArrayList(strG2.length());
                    for (int i2 = 0; i2 < strG2.length(); i2++) {
                        char cCharAt = strG2.charAt(i2);
                        int i3 = 97;
                        if ('a' > cCharAt || cCharAt >= '{') {
                            i3 = 65;
                            if ('A' <= cCharAt && cCharAt < '[') {
                                i = (cCharAt - '4') % 26;
                            }
                            arrayList.add(Character.valueOf(cCharAt));
                        } else {
                            i = (cCharAt - 'T') % 26;
                        }
                        cCharAt = (char) (i + i3);
                        arrayList.add(Character.valueOf(cCharAt));
                    }
                    String strG4 = g(kotlin.collections.p.I(arrayList, "", null, null, null, 62));
                    if (strG4 != null) {
                        try {
                            strOptString = new JSONObject(strG4).optString("o");
                        } catch (Exception unused) {
                            strOptString = "";
                        }
                        strOptString.getClass();
                        if (!kotlin.text.k.J(strOptString) && (strG3 = g(strOptString)) != null && (string = kotlin.text.k.g0(strG3).toString()) != null && kotlin.text.r.u(string, "http", false)) {
                            Context context = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "4KHDHub", "greenmotors decoded: " + string);
                            return kotlin.collections.q.j(string);
                        }
                        return wVar2;
                    }
                }
            }
            return wVar2;
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            androidx.room.b0.h("greenmotors resolver: ", e.getMessage(), "E", "4KHDHub");
            return wVar2;
        }
    }

    public static final void f(List list, String str, Set set, String str2, String str3) {
        if (list.size() < 5 && kotlin.text.r.o(str3, "Direct", true)) {
            Set<String> set2 = EXCLUDED_HOSTS;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.k.z(str2, (String) it.next(), true)) {
                        return;
                    }
                }
            }
            String str4 = (kotlin.text.k.z(str2, ".mkv", true) || kotlin.jvm.internal.l.a(str, "2160p")) ? "mkv" : "mp4";
            if (set.add(str2 + "|4KHDHub " + str3 + "|" + str)) {
                list.add(new ChqStream(androidx.compose.runtime.j.i("4KHDHub ", str3), str2, str, str4, str4, null, null, null, null, null, null, null, null, 8064));
            }
        }
    }

    public static String g(String str) {
        try {
            String strReplace = str.replace('-', '+');
            strReplace.getClass();
            String strReplace2 = strReplace.replace('_', '/');
            strReplace2.getClass();
            byte[] bArrDecode = Base64.decode(strReplace2 + kotlin.text.r.r((4 - (strReplace2.length() % 4)) % 4, "="), 0);
            bArrDecode.getClass();
            return new String(bArrDecode, kotlin.text.a.a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new v(this, str, str2, num, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }

    public final String h(String str, String str2) {
        String strA;
        okhttp3.j0 j0Var;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            if (!kotlin.text.k.J(str2)) {
                a0Var.b("Referer", str2);
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null) {
                    strA = null;
                } else if (j0Var.n() > this.maxPageBodyLength) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("W", "4KHDHub", "fetchPage skipped (too large): " + j0Var.n() + "B");
                    strA = null;
                } else {
                    strA = j0Var.A();
                }
                g0VarE.close();
                return strA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final kotlin.k i(String str, String str2) {
        kotlin.k kVar;
        okhttp3.j0 j0Var;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            if (!kotlin.text.k.J(str2)) {
                a0Var.b("Referer", str2);
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null) {
                    kVar = null;
                } else if (j0Var.n() > this.maxPageBodyLength) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("W", "4KHDHub", "fetchPageWithRedirect skipped (too large): " + j0Var.n() + "B");
                    kVar = null;
                } else {
                    kVar = new kotlin.k(j0Var.A(), g0VarE.e.a.i);
                }
                g0VarE.close();
                return kVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:5:0x001a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f3 A[Catch: Exception -> 0x01e8, TryCatch #1 {Exception -> 0x01e8, blocks: (B:39:0x011a, B:42:0x0122, B:43:0x0138, B:45:0x013e, B:47:0x0183, B:49:0x0189, B:51:0x0191, B:74:0x0209, B:54:0x01a9, B:56:0x01af, B:58:0x01bc, B:61:0x01c3, B:63:0x01cb, B:65:0x01d3, B:71:0x01ea, B:72:0x01f3), top: B:81:0x011a }] */
    public final List j(String str, String str2) {
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "http";
        kotlin.collections.w wVar = kotlin.collections.w.e;
        try {
            kotlin.k kVarI = i(str, str2);
            if (kVarI != null) {
                String str8 = (String) kVarI.e;
                String str9 = (String) kVarI.y;
                if (kotlin.text.k.z(str9, "dl.php?link=", false)) {
                    try {
                        String queryParameter = Uri.parse(str9).getQueryParameter("link");
                        if (queryParameter != null && !kotlin.text.k.J(queryParameter)) {
                            Context context = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "4KHDHub", "extracted googleusercontent from redirect: ".concat(str9));
                            return kotlin.collections.q.j(new kotlin.k(queryParameter, "Direct"));
                        }
                    } catch (Exception e) {
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "4KHDHub", "redirect parse error: " + e.getMessage());
                    }
                }
                Iterator it = kotlin.collections.q.k(new kotlin.text.i("var\\s+url\\s*=\\s*'([^']+)'"), new kotlin.text.i("var\\s+url\\s*=\\s*\"([^\"]+)\""), new kotlin.text.i("'url'\\s*:\\s*'([^']+)'"), new kotlin.text.i("window\\.location\\.href\\s*=\\s*'([^']+)'"), new kotlin.text.i("<iframe[^>]+src=['\"]([^'\"]+)['\"]")).iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        str3 = null;
                        break;
                    }
                    kotlin.text.g gVarA = ((kotlin.text.i) it.next()).a(str8);
                    if (gVarA != null) {
                        str3 = (String) ((kotlin.collections.d0) gVarA.a()).get(1);
                        break;
                    }
                }
                if (str3 != null) {
                    String str10 = "";
                    if (!kotlin.text.r.u(str3, "http", false)) {
                        Pattern patternCompile = Pattern.compile("(https?://[^/]+)");
                        patternCompile.getClass();
                        str.getClass();
                        Matcher matcher = patternCompile.matcher(str);
                        matcher.getClass();
                        kotlin.text.g gVarA2 = kotlin.coroutines.g.a(matcher, 0, str);
                        if (gVarA2 == null || (str4 = (String) ((kotlin.collections.d0) gVarA2.a()).get(1)) == null) {
                            str4 = "";
                        }
                        str3 = str4 + "/" + kotlin.text.k.j0(str3, '/');
                    }
                    try {
                        String strH = h(str3, str);
                        if (strH != null) {
                            ArrayList arrayList = new ArrayList();
                            androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("<a[^>]*href=\"([^\"]+)\"[^>]*>([\\s\\S]*?)</a>", 0), strH));
                            while (m0Var.hasNext()) {
                                kotlin.text.g gVar = (kotlin.text.g) m0Var.next();
                                String str11 = (String) ((kotlin.collections.d0) gVar.a()).get(i);
                                CharSequence charSequence = (CharSequence) ((kotlin.collections.d0) gVar.a()).get(2);
                                Pattern patternCompile2 = Pattern.compile("<[^>]+>");
                                patternCompile2.getClass();
                                charSequence.getClass();
                                String strReplaceAll = patternCompile2.matcher(charSequence).replaceAll(str10);
                                strReplaceAll.getClass();
                                String string = kotlin.text.k.g0(strReplaceAll).toString();
                                if (kotlin.text.r.u(str11, str7, false)) {
                                    if (kotlin.text.k.z(string, "FSL", false) || kotlin.text.k.z(string, "Download File", false)) {
                                        str5 = str7;
                                        str6 = str10;
                                    } else {
                                        Locale locale = Locale.ROOT;
                                        String lowerCase = string.toLowerCase(locale);
                                        lowerCase.getClass();
                                        str5 = str7;
                                        str6 = str10;
                                        if (!kotlin.text.k.z(lowerCase, "download", false)) {
                                            if (kotlin.text.k.z(string, "PixelServer", false)) {
                                                arrayList.add(new kotlin.k(kotlin.text.r.s(str11, "/u/", "/api/file/", false), "PixelServer"));
                                            } else {
                                                String lowerCase2 = string.toLowerCase(locale);
                                                lowerCase2.getClass();
                                                if (kotlin.text.k.z(lowerCase2, "pixeldrain", false) || kotlin.text.k.z(str11, "pixeldrain", false)) {
                                                    arrayList.add(new kotlin.k(kotlin.text.r.s(str11, "/u/", "/api/file/", false), "PixelServer"));
                                                } else if (kotlin.text.k.z(str11, "cdn", false) || kotlin.text.k.z(str11, "stream", false)) {
                                                    arrayList.add(new kotlin.k(str11, "Direct"));
                                                } else {
                                                    String lowerCase3 = string.toLowerCase(locale);
                                                    lowerCase3.getClass();
                                                    if (kotlin.text.k.z(lowerCase3, "link", false)) {
                                                        arrayList.add(new kotlin.k(str11, "Direct"));
                                                    }
                                                }
                                            }
                                        }
                                        str7 = str5;
                                        str10 = str6;
                                        i = 1;
                                    }
                                    arrayList.add(new kotlin.k(str11, "FSL"));
                                    str7 = str5;
                                    str10 = str6;
                                    i = 1;
                                }
                            }
                            return arrayList;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Context context3 = com.app.mlounge.util.a.a;
                        androidx.room.b0.h("pixel resolver: ", e.getMessage(), "E", "4KHDHub");
                        return wVar;
                    }
                }
            }
            return wVar;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
