package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.firebase.encoders.d {
    public static final m a = new m();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("threads");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("exception");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("appExitInfo");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("signal");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("binaries");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        r0 r0Var = (r0) ((b2) obj);
        eVar.g(b, r0Var.a);
        eVar.g(c, r0Var.b);
        eVar.g(d, r0Var.c);
        eVar.g(e, r0Var.d);
        eVar.g(f, r0Var.e);
    }
}
