package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.util.Base64;
import androidx.compose.foundation.text.u0;
import androidx.room.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.c0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.y;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final Object b = c0.k(new kotlin.k("Origin", "https://cdnlivetv.tv"), new kotlin.k("Referer", "https://cdnlivetv.tv/"), new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36"));
    public final y a;

    public q(y yVar) {
        yVar.getClass();
        this.a = yVar;
    }

    public static final String a(q qVar, String str) {
        String str2;
        qVar.getClass();
        try {
            Pattern patternCompile = Pattern.compile("window\\._econfig\\s*=\\s*'([^']+)'");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str);
            if (gVarA == null || (str2 = (String) kotlin.collections.p.E(1, gVarA.a())) == null) {
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("W", "NtvStreamExtractor", "DLHD no window._econfig found in tiestep embed");
                return null;
            }
            String strC = c(str2);
            if (strC != null) {
                int length = (strC.length() + 3) / 4;
                int[] iArr = {2, 0, 3, 1};
                String[] strArr = new String[4];
                int i = 0;
                while (i < 4) {
                    int i2 = i + 1;
                    String strSubstring = strC.substring(i * length, Math.min(i2 * length, strC.length()));
                    if (strSubstring.length() >= 4) {
                        String str3 = strSubstring.substring(0, 3) + strSubstring.substring(4);
                        int i3 = iArr[i];
                        String strC2 = c(str3);
                        if (strC2 != null) {
                            strArr[i3] = strC2;
                            i = i2;
                        }
                    }
                }
                for (int i4 = 0; i4 < 4; i4++) {
                    if (strArr[i4] != null) {
                    }
                }
                String strD = d(kotlin.collections.p.I(kotlin.collections.o.q(strArr), "", null, null, null, 62));
                if (strD != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(strD);
                        String strOptString = jSONObject.optString("stream_url", "");
                        String strOptString2 = jSONObject.optString("stream_url_nop2p", "");
                        if (!kotlin.text.k.J(strOptString2)) {
                            strOptString = strOptString2;
                        }
                        strOptString.getClass();
                        String string = kotlin.text.k.g0(strOptString).toString();
                        if (kotlin.text.r.u(string, "http", false) && (kotlin.text.k.z(string, ".m3u8", false) || kotlin.text.k.z(string, ".mp4", false))) {
                            Context context2 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "DLHD tiestep decrypted stream");
                            return string;
                        }
                        Context context3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("W", "NtvStreamExtractor", "DLHD tiestep payload has no playable URL");
                        return null;
                    } catch (Exception unused) {
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Context context4 = com.app.mlounge.util.a.a;
            b0.h("DLHD tiestep decrypt error: ", e.getMessage(), "E", "NtvStreamExtractor");
        }
    }

    public static final String b(q qVar, String str) {
        String str2;
        String str3;
        String string;
        qVar.getClass();
        Pattern patternCompile = Pattern.compile("STREAM_URL\\s*=\\s*[\"']([^\"']+)[\"']");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str);
        if (gVarA != null && (str3 = (String) kotlin.collections.p.E(1, gVarA.a())) != null && (string = kotlin.text.k.g0(kotlin.text.r.s(str3, "\\/", "/", false)).toString()) != null) {
            if (!kotlin.text.k.z(string, ".m3u8", false)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        kotlin.text.g gVarS = androidx.compose.runtime.j.s("window\\.atob\\(['\"]([A-Za-z0-9+/=]+)['\"]\\)", 0, str, str);
        if (gVarS != null && (str2 = (String) kotlin.collections.p.E(1, gVarS.a())) != null) {
            try {
                byte[] bArrDecode = Base64.decode(str2, 0);
                bArrDecode.getClass();
                String string2 = kotlin.text.k.g0(new String(bArrDecode, kotlin.text.a.a)).toString();
                if (kotlin.text.k.z(string2, ".m3u8", false)) {
                    return string2;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String c(String str) {
        try {
            String strReplace = str.replace('-', '+');
            strReplace.getClass();
            String strReplace2 = strReplace.replace('_', '/');
            strReplace2.getClass();
            byte[] bArrDecode = Base64.decode(strReplace2 + kotlin.text.r.r((4 - (strReplace2.length() % 4)) % 4, "="), 0);
            bArrDecode.getClass();
            return new String(bArrDecode, kotlin.text.a.d);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str) {
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

    public static Object e(q qVar, Context context, String str, kotlin.coroutines.jvm.internal.c cVar) {
        com.app.mlounge.data.local.dao.g gVar = new com.app.mlounge.data.local.dao.g(10);
        qVar.getClass();
        return TimeoutKt.withTimeoutOrNull(25000L, new j(context, str, gVar, null, 1), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Context context, String str, String str2, String str3, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.A = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objWithContext = oVar.y;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = oVar.A;
        int i3 = 3;
        kotlin.coroutines.d dVar = null;
        if (i2 == 0) {
            kotlin.a.e(objWithContext);
            if (str3 != null) {
                oVar.e = null;
                oVar.A = 1;
                Object objE = e(this, context, str3, oVar);
                if (objE != aVar) {
                    return objE;
                }
            } else {
                String strE = b0.e("https://ntv.cx/watch/", str, "/", str2);
                Context context2 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "Resolving sports stream via watch page: ".concat(strE));
                oVar.e = context;
                oVar.A = 2;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new u0(strE, this, dVar, i3), oVar);
                if (objWithContext != aVar) {
                }
            }
        }
        if (i2 == 1) {
            kotlin.a.e(objWithContext);
            return objWithContext;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = oVar.e;
        kotlin.a.e(objWithContext);
        String str4 = (String) objWithContext;
        if (str4 == null) {
            return null;
        }
        oVar.e = null;
        oVar.A = 3;
        Object objE2 = e(this, context, str4, oVar);
        return objE2 == aVar ? aVar : objE2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        if (r6 == r8) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, kotlin.coroutines.jvm.internal.c r23) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.ntv.q.g(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
