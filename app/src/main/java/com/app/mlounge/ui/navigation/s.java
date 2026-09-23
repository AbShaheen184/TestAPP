package com.app.mlounge.ui.navigation;

import android.net.Uri;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends w {
    public static final s g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = org.jsoup.helper.n.d;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.List", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.v(3.0f, 13.0f);
            gVar.s(2.0f);
            gVar.A(-2.0f);
            gVar.t(3.0f, 11.0f);
            gVar.A(2.0f);
            gVar.l();
            gVar.v(3.0f, 17.0f);
            gVar.s(2.0f);
            gVar.A(-2.0f);
            gVar.t(3.0f, 15.0f);
            gVar.A(2.0f);
            gVar.l();
            gVar.v(3.0f, 9.0f);
            gVar.s(2.0f);
            gVar.t(5.0f, 7.0f);
            gVar.t(3.0f, 7.0f);
            gVar.A(2.0f);
            gVar.l();
            gVar.v(7.0f, 13.0f);
            gVar.s(14.0f);
            gVar.A(-2.0f);
            gVar.t(7.0f, 11.0f);
            gVar.A(2.0f);
            gVar.l();
            gVar.v(7.0f, 17.0f);
            gVar.s(14.0f);
            gVar.A(-2.0f);
            gVar.t(7.0f, 15.0f);
            gVar.A(2.0f);
            gVar.l();
            gVar.v(7.0f, 7.0f);
            gVar.A(2.0f);
            gVar.s(14.0f);
            gVar.t(21.0f, 7.0f);
            gVar.t(7.0f, 7.0f);
            gVar.l();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
            fVarB = eVar.b();
            org.jsoup.helper.n.d = fVarB;
        }
        g = new s("sources?type={type}&id={id}&title={title}&season={season}&episode={episode}&mode={mode}", "Sources", fVarB, null, 40);
    }

    public static String a(String str, String str2, String str3, int i, String str4, int i2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        String strEncode = Uri.encode(str2);
        String strEncode2 = Uri.encode(str3);
        StringBuilder sbQ = androidx.compose.runtime.j.q("sources?type=", str, "&id=", strEncode, "&title=");
        sbQ.append(strEncode2);
        sbQ.append("&season=");
        sbQ.append(i);
        sbQ.append("&episode=");
        sbQ.append(i2);
        sbQ.append("&mode=");
        sbQ.append(str4);
        return sbQ.toString();
    }

    public static /* synthetic */ String b(s sVar, String str, String str2, String str3, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i = 0;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        String str4 = (i3 & 32) != 0 ? "play" : "download";
        sVar.getClass();
        return a(str, str2, str3, i, str4, i2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s);
    }

    public final int hashCode() {
        return 1498984087;
    }

    public final String toString() {
        return "Sources";
    }
}
