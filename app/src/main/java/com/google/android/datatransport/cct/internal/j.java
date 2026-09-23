package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements com.google.firebase.encoders.d {
    public static final j a = new j();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("requestTimeMs");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("requestUptimeMs");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("clientInfo");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("logSource");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("logSourceName");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("logEvent");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("qosTier");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.b(b, tVar.a);
        eVar.b(c, tVar.b);
        eVar.g(d, tVar.c);
        eVar.g(e, tVar.d);
        eVar.g(f, tVar.e);
        eVar.g(g, tVar.f);
        eVar.g(h, j0.e);
    }
}
