package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.firebase.encoders.d {
    public static final g a = new g();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("identifier");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("version");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("displayVersion");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("organization");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("installationUuid");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("developmentPlatform");
    public static final com.google.firebase.encoders.c h = com.google.firebase.encoders.c.a("developmentPlatformVersion");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        k0 k0Var = (k0) ((u1) obj);
        eVar.g(b, k0Var.a);
        eVar.g(c, k0Var.b);
        eVar.g(d, k0Var.c);
        eVar.g(e, null);
        eVar.g(f, k0Var.d);
        eVar.g(g, k0Var.e);
        eVar.g(h, k0Var.f);
    }
}
