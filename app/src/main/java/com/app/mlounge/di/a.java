package com.app.mlounge.di;

import androidx.compose.foundation.lazy.grid.u;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.google.android.material.shape.y;
import java.io.IOException;
import kotlin.text.k;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.j0;
import okhttp3.s;
import okhttp3.t;
import okio.f;
import okio.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // okhttp3.t
    public final g0 a(u uVar) throws IOException {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) uVar.i;
                a0 a0VarA = b0Var.a();
                a0VarA.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                a0VarA.b("Accept", "image/webp,image/apng,image/svg+xml,image/jpeg,image/png,image/*;q=0.8");
                if (k.z(b0Var.a.d, "eporner.com", false)) {
                    a0VarA.b("Referer", "https://www.eporner.com/");
                }
                return uVar.f(new b0(a0VarA));
            case 1:
                a0 a0VarA2 = ((b0) uVar.i).a();
                a0VarA2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                return uVar.f(new b0(a0VarA2));
            case 2:
                b0 b0Var2 = (b0) uVar.i;
                y yVarG = b0Var2.a.g();
                yVarG.a("api_key", "f3c627493095a7e40ceca68355c94c6d");
                s sVarC = yVarG.c();
                a0 a0VarA3 = b0Var2.a();
                a0VarA3.a = sVarC;
                return uVar.f(new b0(a0VarA3));
            case 3:
                g0 g0VarF = uVar.f((b0) uVar.i);
                String strG = g0.g("Content-Encoding", g0VarF);
                if (strG == null || !strG.equalsIgnoreCase("gzip")) {
                    return g0VarF;
                }
                j0 j0Var = g0VarF.D;
                f fVar = new f();
                p pVar = new p(j0Var.P());
                try {
                    try {
                        fVar.n0(pVar);
                        break;
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        if (!k.z(message, "gzip finished without exhausting source", false)) {
                            throw e;
                        }
                    }
                    pVar.close();
                    f0 f0VarN = g0VarF.n();
                    f0VarN.f.y("Content-Encoding");
                    f0VarN.f.y("Content-Length");
                    i0 i0Var = j0.y;
                    f0VarN.g = new i0(j0Var.x(), fVar.y, fVar);
                    return f0VarN.a();
                } catch (Throwable th) {
                    pVar.close();
                    throw th;
                }
            default:
                a0 a0VarA4 = ((b0) uVar.i).a();
                a0VarA4.a("trakt-api-key", TraktManager.CLIENT_ID);
                a0VarA4.a("trakt-api-version", "2");
                a0VarA4.a("Content-Type", "application/json");
                return uVar.f(new b0(a0VarA4));
        }
    }
}
