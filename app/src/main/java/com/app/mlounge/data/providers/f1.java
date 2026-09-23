package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final int $stable = 8;
    private static final String BASE = "https://noodlemagazine.com";
    private static final String TAG = "NoodleMag";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36";
    private final Context appContext;
    private final okhttp3.y client;
    private final x0 cookieJar;
    private final com.google.gson.e gson;
    private final Map<String, String> headers;
    private boolean webViewWarmedUp;
    public static final w0 Companion = new w0();
    private static final List<String> CATEGORIES = kotlin.collections.q.k("4K Ultra HD", "60 FPS", "Amateur", "Anal", "Asian", "ASMR", "BBW", "BDSM", "Big Ass", "Big Dick", "Big Tits", "Bisexual", "Blonde", "Blowjob", "Bondage", "Brunette", "Bukkake", "Creampie", "Cumshot", "Double Penetration", "Ebony", "Fat", "Fetish", "Fisting", "Footjob", "For Women", "Gay", "German", "Gonzo", "Group sex", "Hairy", "Handjob", "Hardcore", "HD Porn", "Hentai", "Indian", "Interracial", "Japanese", "Latina", "Lesbian", "Lingerie", "Massage", "Masturbation", "Mature", "MILF", "Office", "Old/Young", "Orgasm", "Orgy", "Outdoor", "Parody", "Party", "POV", "Public", "Pussy licking", "Reality", "Redhead", "Shemale", "Sleep", "Small Tits", "Squirt", "Striptease", "Students", "Swinger", "Teen", "Threesome", "Toys", "Uncategorized", "Uniform", "Vintage", "VR Porn", "Webcam");

    public f1(Context context, okhttp3.y yVar) {
        this.appContext = context;
        x0 x0Var = new x0();
        this.cookieJar = x0Var;
        okhttp3.x xVarA = yVar.a();
        xVarA.k = x0Var;
        this.client = new okhttp3.y(xVarA);
        this.gson = new com.google.gson.e();
        this.headers = kotlin.collections.c0.k(new kotlin.k("User-Agent", UA), new kotlin.k("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"), new kotlin.k("Accept-Language", "en-US,en;q=0.5"), new kotlin.k("Sec-Fetch-Dest", "document"), new kotlin.k("Sec-Fetch-Mode", "navigate"), new kotlin.k("Sec-Fetch-Site", "none"), new kotlin.k("Sec-Fetch-User", "?1"), new kotlin.k("Upgrade-Insecure-Requests", "1"));
    }

    public final String d(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            a0Var.a(entry.getKey(), entry.getValue());
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, kotlin.coroutines.jvm.internal.c cVar) {
        y0 y0Var;
        String str2;
        kotlin.text.g gVarS;
        String str3;
        String string;
        String str4;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i = y0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0Var.label = i - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object obj = y0Var.result;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        int i2 = y0Var.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            str2 = str;
            y0Var.L$0 = str2;
            y0Var.label = 1;
            if (h(y0Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) y0Var.L$0;
            kotlin.a.e(obj);
            str2 = str5;
        }
        String strP = kotlin.text.k.P(str2, "noodle_");
        String strConcat = "https://noodlemagazine.com/watch/".concat(strP);
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "getVideoDetail: ".concat(strConcat));
        String strD = d(strConcat);
        if (strD == null || (gVarS = androidx.compose.runtime.j.s("<title>([^<]+)", 0, strD, strD)) == null || (str3 = (String) ((kotlin.collections.d0) gVarS.a()).get(1)) == null || (string = kotlin.text.k.g0(str3).toString()) == null) {
            return null;
        }
        kotlin.text.g gVarS2 = androidx.compose.runtime.j.s("<meta\\s+property=\"og:image\"\\s+content=\"([^\"]+)", 0, strD, strD);
        if (gVarS2 == null || (str4 = (String) ((kotlin.collections.d0) gVarS2.a()).get(1)) == null) {
            str4 = "";
        }
        return new EpornerVideoDetail("noodle_".concat(strP), string, null, null, null, null, null, str4.length() > 0 ? new EpornerThumb(str4, null, null) : null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, kotlin.coroutines.jvm.internal.c cVar) {
        z0 z0Var;
        String str2;
        com.google.gson.f fVarM;
        EpornerSourceDetail epornerSourceDetail;
        String strH;
        com.google.gson.g gVarL;
        String strH2;
        String strH3;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i = z0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0Var.label = i - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object obj = z0Var.result;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        int i2 = z0Var.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            z0Var.L$0 = str;
            z0Var.label = 1;
            if (h(z0Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) z0Var.L$0;
            kotlin.a.e(obj);
        }
        String strConcat = "https://noodlemagazine.com/watch/".concat(kotlin.text.k.P(str, "noodle_"));
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "resolveVideo: ".concat(strConcat));
        String strD = d(strConcat);
        if (strD != null) {
            kotlin.text.g gVarS = androidx.compose.runtime.j.s("window\\.playlist\\s*=\\s*(\\{[\\s\\S]+?\\});", 0, strD, strD);
            if (gVarS == null || (str2 = (String) ((kotlin.collections.d0) gVarS.a()).get(1)) == null) {
                com.app.mlounge.util.a.a("W", TAG, "extractVideoSources — window.playlist not found");
                return null;
            }
            try {
                com.google.gson.j jVar = (com.google.gson.j) this.gson.d(com.google.gson.j.class, str2);
                if (jVar != null && (fVarM = jVar.m("sources")) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = fVarM.e.iterator();
                    it.getClass();
                    boolean z = false;
                    while (true) {
                        String str3 = "mp4";
                        if (!it.hasNext()) {
                            break;
                        }
                        com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                        com.google.gson.g gVarL2 = jVarE.l("file");
                        if (gVarL2 != null && (strH = gVarL2.h()) != null && (gVarL = jVarE.l("label")) != null && (strH2 = gVarL.h()) != null) {
                            com.google.gson.g gVarL3 = jVarE.l("type");
                            if (gVarL3 != null && (strH3 = gVarL3.h()) != null) {
                                str3 = strH3;
                            }
                            com.google.gson.g gVarL4 = jVarE.l("default");
                            boolean zB = gVarL4 != null ? gVarL4.b() : false;
                            if (!z && zB) {
                                z = true;
                            }
                            String str4 = strH2 + "p";
                            linkedHashMap.put(str4, new EpornerSourceDetail(str4, strH, str3, Boolean.valueOf(zB)));
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("W", TAG, "extractVideoSources — no sources in playlist");
                        return null;
                    }
                    if (!z && (epornerSourceDetail = (EpornerSourceDetail) kotlin.collections.p.C(linkedHashMap.values())) != null) {
                        linkedHashMap.put(kotlin.collections.p.A(linkedHashMap.keySet()), EpornerSourceDetail.a(epornerSourceDetail));
                    }
                    Map mapSingletonMap = Collections.singletonMap("mp4", linkedHashMap);
                    mapSingletonMap.getClass();
                    return new EpornerResolveResponse(mapSingletonMap);
                }
            } catch (Exception e) {
                Context context3 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.d(TAG, "extractVideoSources — failed to parse playlist JSON", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v4 com.app.mlounge.data.remote.model.EpornerVideo, still in use, count: 3, list:
          (r15v4 com.app.mlounge.data.remote.model.EpornerVideo) from 0x0238: MOVE (r27v4 com.app.mlounge.data.remote.model.EpornerVideo) = (r15v4 com.app.mlounge.data.remote.model.EpornerVideo) (LINE:569)
          (r15v4 com.app.mlounge.data.remote.model.EpornerVideo) from 0x0233: MOVE (r27v6 com.app.mlounge.data.remote.model.EpornerVideo) = (r15v4 com.app.mlounge.data.remote.model.EpornerVideo) (LINE:564)
          (r15v4 com.app.mlounge.data.remote.model.EpornerVideo) from 0x0270: PHI (r27v5 com.app.mlounge.data.remote.model.EpornerVideo) = 
          (r15v4 com.app.mlounge.data.remote.model.EpornerVideo)
          (r27v4 com.app.mlounge.data.remote.model.EpornerVideo)
          (r27v6 com.app.mlounge.data.remote.model.EpornerVideo)
         binds: [B:87:0x0261, B:81:0x0238, B:79:0x021f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final java.lang.Object g(int r27, java.lang.String r28, kotlin.coroutines.jvm.internal.c r29) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.providers.f1.g(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(kotlin.coroutines.jvm.internal.c cVar) {
        b1 b1Var;
        kotlin.y yVar = kotlin.y.a;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i = b1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1Var.label = i - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objWithContext = b1Var.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = b1Var.label;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (this.webViewWarmedUp) {
                return yVar;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            e1 e1Var = new e1(this, null);
            b1Var.label = 1;
            objWithContext = BuildersKt.withContext(main, e1Var, b1Var);
            if (objWithContext == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objWithContext);
        }
        boolean zBooleanValue = ((Boolean) objWithContext).booleanValue();
        if (zBooleanValue) {
            this.webViewWarmedUp = true;
        }
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", TAG, "warmupWithWebView: done success=" + zBooleanValue);
        return yVar;
    }
}
