package com.app.mlounge.data.providers;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final int $stable = 0;
    public static final h INSTANCE = new h();
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

    public static String a(h hVar, okhttp3.y yVar, String str) {
        String strA;
        yVar.getClass();
        str.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            a0Var.b("Accept-Language", "en-US,en;q=0.5");
            a0Var.b("Connection", "keep-alive");
            a0Var.b("Upgrade-Insecure-Requests", "1");
            a0Var.b("Sec-Fetch-Dest", "document");
            a0Var.b("Sec-Fetch-Mode", "navigate");
            a0Var.b("Sec-Fetch-Site", "none");
            a0Var.b("Sec-Fetch-User", "?1");
            if (!kotlin.text.k.J("")) {
                a0Var.b("Referer", "");
            }
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, new okhttp3.b0(a0Var), false).e();
            try {
                if (g0VarE.N) {
                    okhttp3.j0 j0Var = g0VarE.D;
                    if (j0Var != null) {
                        strA = j0Var.A();
                    }
                    g0VarE.close();
                    return strA;
                }
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("E", "CatalogHelper", "fetchPage HTTP " + g0VarE.A + ": " + str);
                strA = null;
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
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", "CatalogHelper", androidx.room.b0.e("fetchPage exception for ", str, ": ", e.getMessage()));
            return null;
        }
    }
}
