package com.app.mlounge.ui.screens.player;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements okhttp3.t {
    @Override // okhttp3.t
    public final okhttp3.g0 a(androidx.compose.foundation.lazy.grid.u uVar) {
        okhttp3.u uVarS;
        okhttp3.b0 b0Var = (okhttp3.b0) uVar.i;
        okhttp3.g0 g0VarF = uVar.f(b0Var);
        String strG = okhttp3.g0.g("Content-Type", g0VarF);
        if (strG == null) {
            strG = "";
        }
        String str = b0Var.a.i;
        okhttp3.j0 j0Var = g0VarF.D;
        if (j0Var == null || j0Var.n() >= 1048576) {
            return g0VarF;
        }
        if (!kotlin.text.k.z(strG, "mpegurl", true) && !kotlin.text.k.z(str, ".m3u8", false)) {
            return g0VarF;
        }
        String strA = j0Var.A();
        if (kotlin.text.k.z(strA, "#EXT-X-STREAM-INF", false)) {
            strA = kotlin.collections.p.I(kotlin.text.k.M(strA), "\n", null, null, new com.app.mlounge.ui.t(20), 30);
        }
        if (kotlin.text.k.z(strG, "octet-stream", false)) {
            strG = "application/vnd.apple.mpegurl";
        }
        okhttp3.f0 f0VarN = g0VarF.n();
        androidx.compose.ui.graphics.vector.g gVar = f0VarN.f;
        gVar.getClass();
        kotlin.collections.builders.c.G("Content-Type");
        kotlin.collections.builders.c.H(strG, "Content-Type");
        gVar.y("Content-Type");
        kotlin.collections.builders.c.E(gVar, "Content-Type", strG);
        okhttp3.i0 i0Var = okhttp3.j0.y;
        kotlin.text.i iVar = okhttp3.u.e;
        try {
            uVarS = kotlin.collections.o.s(strG);
        } catch (IllegalArgumentException unused) {
            uVarS = null;
        }
        kotlin.k kVarD = kotlin.collections.q.d(uVarS);
        Charset charset = (Charset) kVarD.e;
        okhttp3.u uVar2 = (okhttp3.u) kVarD.y;
        okio.f fVar = new okio.f();
        charset.getClass();
        int length = strA.length();
        strA.getClass();
        charset.getClass();
        if (length < 0) {
            kotlinx.coroutines.future.a.s(androidx.compose.runtime.j.g("endIndex < beginIndex: ", length, " < ", 0));
        } else if (length > strA.length()) {
            kotlinx.coroutines.future.a.k(androidx.privacysandbox.ads.adservices.java.internal.a.v("endIndex > string.length: ", length, " > "), strA.length());
        } else if (charset.equals(kotlin.text.a.a)) {
            fVar.t0(0, length, strA);
        } else {
            byte[] bytes = strA.substring(0, length).getBytes(charset);
            bytes.getClass();
            fVar.write(bytes, 0, bytes.length);
        }
        f0VarN.g = new okhttp3.i0(uVar2, fVar.y, fVar);
        return f0VarN.a();
    }
}
