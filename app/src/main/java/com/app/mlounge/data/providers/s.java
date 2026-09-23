package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.emulator.LibretroCore;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final int $stable = 8;
    private static final String BASE = "https://www.xvideos.com";
    private static final String TAG = "EpornerScraper";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:125.0) Gecko/20100101 Firefox/125.0";
    private final okhttp3.y client;
    private final Map<String, String> headers = kotlin.collections.c0.k(new kotlin.k("User-Agent", UA), new kotlin.k("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"), new kotlin.k("Accept-Language", "en-US,en;q=0.5"), new kotlin.k("Referer", "https://www.xvideos.com/"));
    public static final r Companion = new r();
    private static final List<String> CATEGORIES = kotlin.collections.q.k("4K Ultra HD", "60 FPS", "Amateur", "Anal", "Asian", "ASMR", "BBW", "BDSM", "Big Ass", "Big Dick", "Big Tits", "Bisexual", "Blonde", "Blowjob", "Bondage", "Brunette", "Bukkake", "Creampie", "Cumshot", "Double Penetration", "Ebony", "Fat", "Fetish", "Fisting", "Footjob", "For Women", "Gay", "German", "Gonzo", "Group sex", "Hairy", "Handjob", "Hardcore", "HD Porn", "Hentai", "Indian", "Interracial", "Japanese", "Latina", "Lesbian", "Lingerie", "Massage", "Masturbation", "Mature", "MILF", "Office", "Old/Young", "Orgasm", "Orgy", "Outdoor", "Parody", "Party", "POV", "Public", "Pussy licking", "Reality", "Redhead", "Shemale", "Sleep", "Small Tits", "Squirt", "Striptease", "Students", "Swinger", "Teen", "Threesome", "Toys", "Uncategorized", "Uniform", "Vintage", "VR Porn", "Webcam");

    public s(okhttp3.y yVar) {
        this.client = yVar;
    }

    public static kotlin.k c(String str) {
        if (kotlin.text.r.u(str, "xvideos_", false)) {
            str = kotlin.text.k.P(str, "xvideos_");
        }
        return kotlin.text.r.u(str, "/", false) ? new kotlin.k(str, str) : new kotlin.k("/video".concat(str), str);
    }

    public final String b(String str) {
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
}
