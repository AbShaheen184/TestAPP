package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements l0 {
    public static final int $stable = 8;
    private static final String DEFAULT_API_BASE = "https://ballerinacappuccinalovestungtungtungsahur.com";
    private static final String PLAYER_ORIGIN = "https://vidlove.cc";
    private static final String STREAM_REFERER = "https://player.vidlove.cc/";
    private static final String TAG = "Movies111";
    private String apiBase;
    private final Mutex baseMutex;
    private final okhttp3.y client;
    private final com.google.gson.e gson;
    private final String name;
    public static final p0 Companion = new p0();
    private static final Map<String, String> SERVER_NAMES = kotlin.collections.c0.k(new kotlin.k("moviebox", "MovieBox"), new kotlin.k("vidapi", "VidAPI"), new kotlin.k("ipcloud", "IPCloud"), new kotlin.k("tcloud", "TCloud"), new kotlin.k("vixsrc", "VixSrc"), new kotlin.k("1embed", "1Embed"), new kotlin.k("xpass", "XPass"), new kotlin.k("vidrift", "VidRift"), new kotlin.k("lookmovie", "LookMovie"), new kotlin.k("vidnest", "VidNest"));
    private static final List<String> DEFAULT_MOVIE_ORDER = kotlin.collections.q.k("moviebox", "vidapi", "ipcloud", "tcloud", "vixsrc", "1embed", "xpass", "vidrift", "lookmovie", "vidnest");
    private static final List<String> DEFAULT_TV_ORDER = kotlin.collections.q.k("moviebox", "ipcloud", "tcloud", "vidapi");
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36";

    public v0(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = TAG;
        this.gson = new com.google.gson.e();
        this.baseMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public static final void b(v0 v0Var, List list, String str, String str2, String str3, String str4) {
        String str5 = str3;
        v0Var.getClass();
        String str6 = "hls";
        if (!kotlin.text.k.z(str, ".m3u8", false) && !kotlin.text.k.z(str, "mpegurl", false) && !kotlin.text.k.z(str, "/hls", false) && !kotlin.jvm.internal.l.a(str4, "hls")) {
            str6 = "mp4";
        }
        String str7 = str6;
        String strI = (str5 == null || kotlin.text.k.J(str5) || str5.equalsIgnoreCase("Auto")) ? androidx.compose.runtime.j.i("Movies111 - ", str2) : androidx.compose.runtime.j.k("Movies111 - ", str2, " (", str5, ")");
        if (str5 == null) {
            str5 = "Auto";
        }
        list.add(new ChqStream(strI, str, str5, str7, str7, null, kotlin.collections.c0.k(new kotlin.k("User-Agent", UA), new kotlin.k("Referer", STREAM_REFERER), new kotlin.k("Origin", kotlin.text.k.h0(STREAM_REFERER, '/'))), null, null, null, null, str2, null, 6016));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    public static final String c(v0 v0Var, com.google.gson.j jVar) {
        String strH;
        com.google.gson.f fVarD;
        com.google.gson.g gVarL;
        String strH2;
        okhttp3.g0 g0VarE;
        String strG;
        com.google.gson.g gVarL2;
        String strH3;
        v0Var.getClass();
        com.google.gson.g gVarL3 = jVar.l("manifest");
        if (gVarL3 == null) {
            strH = null;
        } else {
            if (!(gVarL3 instanceof com.google.gson.k)) {
                gVarL3 = null;
            }
            if (gVarL3 != null) {
                strH = gVarL3.h();
            } else {
                strH = null;
            }
        }
        if (strH == null || !kotlin.text.r.u(kotlin.text.k.i0(strH).toString(), "#EXTM3U", false)) {
            com.google.gson.g gVarL4 = jVar.l("qualities");
            if (gVarL4 == null) {
                fVarD = null;
            } else {
                if (!(gVarL4 instanceof com.google.gson.f)) {
                    gVarL4 = null;
                }
                if (gVarL4 != null) {
                    fVarD = gVarL4.d();
                } else {
                    fVarD = null;
                }
            }
            String str = "mp4";
            if (fVarD != null) {
                Iterator it = fVarD.e.iterator();
                it.getClass();
                while (it.hasNext()) {
                    com.google.gson.g gVar = (com.google.gson.g) it.next();
                    gVar.getClass();
                    if ((gVar instanceof com.google.gson.j) && (gVarL2 = gVar.e().l("type")) != null) {
                        if (!(gVarL2 instanceof com.google.gson.k)) {
                            gVarL2 = null;
                        }
                        if (gVarL2 != null && (strH3 = gVarL2.h()) != null) {
                            if (kotlin.text.k.z(strH3, "mp4", true)) {
                                return "mp4";
                            }
                            if (kotlin.text.k.z(strH3, "m3u8", true) || kotlin.text.k.z(strH3, "mpegurl", true)) {
                            }
                        }
                    }
                }
                gVarL = jVar.l("url");
                if (gVarL != null) {
                    if (!(gVarL instanceof com.google.gson.k)) {
                        gVarL = null;
                    }
                    if (gVarL != null && (strH2 = gVarL.h()) != null) {
                        try {
                            okhttp3.y yVar = v0Var.client;
                            okhttp3.a0 a0Var = new okhttp3.a0();
                            a0Var.d(strH2);
                            a0Var.c("HEAD", null);
                            a0Var.b("User-Agent", UA);
                            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                            yVar.getClass();
                            g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                            try {
                                strG = okhttp3.g0.g("Content-Type", g0VarE);
                                if (strG == null) {
                                    strG = "";
                                }
                                if (kotlin.text.k.z(strG, "mpegurl", true) || (!kotlin.text.k.z(strG, "mp4", true) && !kotlin.text.k.z(strG, "quicktime", true) && kotlin.text.k.J(strG) && okhttp3.g0.g("Content-Length", g0VarE) == null)) {
                                    str = "hls";
                                }
                                g0VarE.close();
                                return str;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    dagger.internal.d.b(g0VarE, th);
                                    throw th2;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                gVarL = jVar.l("url");
                if (gVarL != null) {
                    if (!(gVarL instanceof com.google.gson.k)) {
                        gVarL = null;
                    }
                    if (gVarL != null) {
                        okhttp3.y yVar2 = v0Var.client;
                        okhttp3.a0 a0Var2 = new okhttp3.a0();
                        a0Var2.d(strH2);
                        a0Var2.c("HEAD", null);
                        a0Var2.b("User-Agent", UA);
                        okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                        yVar2.getClass();
                        g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                        strG = okhttp3.g0.g("Content-Type", g0VarE);
                        if (strG == null) {
                            strG = "";
                        }
                        if (kotlin.text.k.z(strG, "mpegurl", true)) {
                            str = "hls";
                        } else {
                            str = "hls";
                        }
                        g0VarE.close();
                        return str;
                    }
                }
            }
        }
        return "hls";
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(v0 v0Var, String str, kotlin.coroutines.jvm.internal.c cVar) {
        q0 q0Var;
        ArrayList arrayList;
        v0Var.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i = q0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0Var.label = i - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(v0Var, cVar);
            }
        } else {
            q0Var = new q0(v0Var, cVar);
        }
        Object objI = q0Var.result;
        int i2 = q0Var.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(objI);
                q0Var.L$0 = null;
                q0Var.label = 1;
                objI = v0Var.i(str + "/source-order");
                Object obj = kotlin.coroutines.intrinsics.a.e;
                if (objI == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objI);
            }
            com.google.gson.j jVar = (com.google.gson.j) objI;
            if (jVar == null) {
                return DEFAULT_TV_ORDER;
            }
            com.google.gson.g gVarL = jVar.l("tv");
            if (gVarL == null) {
                arrayList = null;
            } else {
                if (!(gVarL instanceof com.google.gson.f)) {
                    gVarL = null;
                }
                if (gVarL != null) {
                    com.google.gson.f fVarD = gVarL.d();
                    arrayList = new ArrayList();
                    for (com.google.gson.g gVar : fVarD.e) {
                        gVar.getClass();
                        String strH = gVar instanceof com.google.gson.k ? gVar.h() : null;
                        if (strH != null) {
                            arrayList.add(strH);
                        }
                    }
                } else {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                if (arrayList2 != null) {
                    return arrayList2;
                }
            }
            return DEFAULT_TV_ORDER;
        } catch (Exception unused) {
            return DEFAULT_TV_ORDER;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007d A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:35:0x0079, B:37:0x007d, B:38:0x0080), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:35:0x0079, B:37:0x007d, B:38:0x0080), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(v0 v0Var, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        r0 r0Var;
        Mutex mutex;
        int i;
        Mutex mutex2;
        String str;
        v0Var.getClass();
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i2 = r0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(v0Var, cVar);
            }
        } else {
            r0Var = new r0(v0Var, cVar);
        }
        Object obj = r0Var.result;
        int i3 = r0Var.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i3 == 0) {
                kotlin.a.e(obj);
                String str2 = v0Var.apiBase;
                if (str2 != null) {
                    return str2;
                }
                mutex = v0Var.baseMutex;
                r0Var.L$0 = mutex;
                r0Var.I$0 = 0;
                r0Var.label = 1;
                if (mutex.lock(null, r0Var) != aVar) {
                    i = 0;
                }
                return aVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = (Mutex) r0Var.L$0;
                try {
                    kotlin.a.e(obj);
                    str = (String) obj;
                    if (str != null) {
                        v0Var.apiBase = str;
                    } else {
                        str = DEFAULT_API_BASE;
                    }
                    mutex2.unlock(null);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            i = r0Var.I$0;
            Mutex mutex3 = (Mutex) r0Var.L$0;
            kotlin.a.e(obj);
            mutex = mutex3;
            String str3 = v0Var.apiBase;
            if (str3 != null) {
                mutex.unlock(null);
                return str3;
            }
            r0Var.L$0 = mutex;
            r0Var.I$0 = i;
            r0Var.I$1 = 0;
            r0Var.label = 2;
            String strJ = v0Var.j();
            if (strJ != aVar) {
                mutex2 = mutex;
                obj = strJ;
                str = (String) obj;
                if (str != null) {
                    v0Var.apiBase = str;
                } else {
                    str = DEFAULT_API_BASE;
                }
                mutex2.unlock(null);
                return str;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    public static okhttp3.b0 h(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", UA);
        a0Var.b("Accept", "application/json, text/plain, */*");
        a0Var.b("Referer", "https://vidlove.cc/");
        a0Var.b("Origin", PLAYER_ORIGIN);
        return new okhttp3.b0(a0Var);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new u0(this, str2, num, num2, str, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }

    public final com.google.gson.j i(String str) {
        okhttp3.j0 j0Var;
        try {
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0VarH = h(str);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarH, false).e();
            try {
                String strA = (!g0VarE.N || (j0Var = g0VarE.D) == null) ? null : j0Var.A();
                g0VarE.close();
                if (strA == null) {
                    return null;
                }
                return (com.google.gson.j) this.gson.d(com.google.gson.j.class, strA);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "fetchJson failed: " + str, e);
            return null;
        }
    }

    public final String j() {
        String str;
        try {
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0VarH = h("https://vidlove.cc/movie/533535");
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarH, false).e();
            try {
                okhttp3.j0 j0Var = g0VarE.D;
                String strA = j0Var != null ? j0Var.A() : null;
                g0VarE.close();
                if (strA != null) {
                    Pattern patternCompile = Pattern.compile("src=\"(/assets/index-[^\"]+\\.js)\"");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strA);
                    matcher.getClass();
                    kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, strA);
                    if (gVarA != null && (str = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) != null) {
                        okhttp3.y yVar2 = this.client;
                        okhttp3.b0 b0VarH2 = h(PLAYER_ORIGIN.concat(str));
                        yVar2.getClass();
                        okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0VarH2, false).e();
                        try {
                            okhttp3.j0 j0Var2 = g0VarE2.D;
                            String strA2 = j0Var2 != null ? j0Var2.A() : null;
                            g0VarE2.close();
                            if (strA2 != null) {
                                Pattern patternCompile2 = Pattern.compile("serverConfigs-[A-Za-z0-9_-]+\\.js");
                                patternCompile2.getClass();
                                Matcher matcher2 = patternCompile2.matcher(strA2);
                                matcher2.getClass();
                                kotlin.text.g gVarA2 = kotlin.coroutines.g.a(matcher2, 0, strA2);
                                if (gVarA2 != null) {
                                    String strGroup = gVarA2.a.group();
                                    strGroup.getClass();
                                    okhttp3.y yVar3 = this.client;
                                    okhttp3.b0 b0VarH3 = h("https://vidlove.cc/assets/".concat(strGroup));
                                    yVar3.getClass();
                                    okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0VarH3, false).e();
                                    try {
                                        okhttp3.j0 j0Var3 = g0VarE3.D;
                                        String strA3 = j0Var3 != null ? j0Var3.A() : null;
                                        g0VarE3.close();
                                        if (strA3 != null) {
                                            Pattern patternCompile3 = Pattern.compile("const e=\"(https://[^\"]+)\"");
                                            patternCompile3.getClass();
                                            Matcher matcher3 = patternCompile3.matcher(strA3);
                                            matcher3.getClass();
                                            kotlin.text.g gVarA3 = kotlin.coroutines.g.a(matcher3, 0, strA3);
                                            String str2 = gVarA3 != null ? (String) ((kotlin.collections.d0) gVarA3.a()).get(1) : null;
                                            Context context = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.a("D", TAG, "resolved api base: " + str2);
                                            return str2;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            dagger.internal.d.b(g0VarE3, th);
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                dagger.internal.d.b(g0VarE2, th3);
                                throw th4;
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    dagger.internal.d.b(g0VarE, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "resolveApiBase failed", e);
            return null;
        }
    }
}
