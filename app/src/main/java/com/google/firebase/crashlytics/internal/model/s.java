package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.google.firebase.encoders.d {
    public static final s a = new s();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("batteryLevel");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("batteryVelocity");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("proximityOn");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("orientation");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("ramUsed");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("diskUsed");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        b1 b1Var = (b1) ((e2) obj);
        eVar.g(b, b1Var.a);
        eVar.c(c, b1Var.b);
        eVar.a(d, b1Var.c);
        eVar.c(e, b1Var.d);
        eVar.b(f, b1Var.e);
        eVar.b(g, b1Var.f);
    }
}
