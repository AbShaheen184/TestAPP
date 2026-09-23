package org.jsoup.helper;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import org.jsoup.parser.e0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final Charset c = Charset.forName("ISO-8859-1");
    public d a;
    public e b;

    public final org.jsoup.nodes.g a() {
        d dVar = this.a;
        dVar.getClass();
        org.jsoup.a.e(1, "method");
        dVar.b = 1;
        com.google.android.datatransport.runtime.j jVarA = null;
        e eVarF = e.f(dVar, null);
        this.b = eVarF;
        n.D(eVarF);
        e eVar = this.b;
        n.y("Request must be executed (with .execute(), .get(), or .post() before parsing response", eVar.m);
        org.jsoup.internal.a aVar = eVar.h;
        if (eVar.g != null) {
            org.jsoup.internal.a aVar2 = new org.jsoup.internal.a(new org.jsoup.internal.d(new ByteArrayInputStream(eVar.g.array(), 0, eVar.g.limit())), 0);
            eVar.n = false;
            aVar = aVar2;
        }
        if (eVar.n) {
            throw new o("Input stream already read and parsed, cannot re-read.");
        }
        n.D(aVar);
        eVar.n = true;
        String str = eVar.j;
        String externalForm = eVar.a.toExternalForm();
        e0 e0Var = eVar.p.k;
        try {
            jVarA = b.a(aVar, str, externalForm, e0Var);
            org.jsoup.nodes.g gVarC = b.c(jVarA, externalForm, e0Var);
            ((org.jsoup.internal.a) jVarA.z).close();
            eVar.j = gVarC.G.y.name();
            eVar.i();
            return gVarC;
        } catch (Throwable th) {
            if (jVarA != null) {
                ((org.jsoup.internal.a) jVarA.z).close();
            }
            throw th;
        }
    }
}
