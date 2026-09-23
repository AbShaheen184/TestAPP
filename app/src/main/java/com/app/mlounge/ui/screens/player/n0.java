package com.app.mlounge.ui.screens.player;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements okhttp3.t {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public n0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    @Override // okhttp3.t
    public final okhttp3.g0 a(androidx.compose.foundation.lazy.grid.u uVar) {
        boolean z;
        String str = this.g;
        String str2 = this.f;
        String str3 = this.b;
        String str4 = this.a;
        String str5 = this.d;
        String str6 = this.e;
        String str7 = this.c;
        okhttp3.b0 b0Var = (okhttp3.b0) uVar.i;
        okhttp3.s sVar = b0Var.a;
        String str8 = sVar.d;
        if (kotlin.text.r.n(str8, "googleusercontent.com", false) || kotlin.text.r.n(str8, "googleapis.com", false)) {
            return uVar.f(b0Var);
        }
        okhttp3.a0 a0VarA = b0Var.a();
        if (str4.length() <= 0) {
            str4 = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36";
        }
        a0VarA.b("User-Agent", str4);
        if (str3.length() > 0) {
            a0VarA.b("Referer", str3);
        }
        a0VarA.b("X-Requested-With", "com.android.chrome");
        String strD0 = kotlin.text.k.d0(str8, ".");
        if (kotlin.text.k.z(str8, "vixsrc", true)) {
            z = true;
        } else {
            List listK = kotlin.collections.q.k(".ts", ".m3u8", ".m4s", "/key/", "segment");
            if (!listK.isEmpty()) {
                Iterator it = listK.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (kotlin.text.k.z(sVar.i, (String) it.next(), false)) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        }
        if (str7.length() <= 0 || !(str8.equals(str7) || kotlin.text.r.n(str8, ".".concat(str7), false) || (str5.length() > 3 && (strD0.equals(str5) || kotlin.text.r.n(strD0, ".".concat(str5), false))))) {
            str6.getClass();
            if ((str6.length() > 0 && (str8.equals(str6) || kotlin.text.r.n(str8, ".".concat(str6), false))) || z) {
                if (str2.length() > 0) {
                    a0VarA.b("Origin", str2);
                }
                if (str.length() > 0) {
                    a0VarA.b("Cookie", str);
                }
                if (z) {
                    a0VarA.b("Sec-Fetch-Dest", "empty");
                    a0VarA.b("Sec-Fetch-Mode", "cors");
                    a0VarA.b("Sec-Fetch-Site", "cross-site");
                }
            }
        } else {
            if (str2.length() > 0) {
                a0VarA.b("Origin", str2);
            }
            if (str.length() > 0) {
                a0VarA.b("Cookie", str);
            }
            if (z) {
                a0VarA.b("Sec-Fetch-Dest", "empty");
                a0VarA.b("Sec-Fetch-Mode", "cors");
                a0VarA.b("Sec-Fetch-Site", "cross-site");
            }
        }
        okhttp3.g0 g0VarF = uVar.f(new okhttp3.b0(a0VarA));
        if (g0VarF.A == 206) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "CinemaHQ-Player", androidx.room.b0.e("[NET] RES 206 Partial: ", kotlin.text.k.f0(60, sVar.i), " range=", okhttp3.g0.g("Content-Range", g0VarF)));
        }
        return g0VarF;
    }
}
