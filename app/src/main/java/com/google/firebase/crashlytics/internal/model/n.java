package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.google.firebase.encoders.d {
    public static final n a = new n();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("type");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("reason");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("frames");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("causedBy");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("overflowCount");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        t0 t0Var = (t0) ((x1) obj);
        eVar.g(b, t0Var.a);
        eVar.g(c, t0Var.b);
        eVar.g(d, t0Var.c);
        eVar.g(e, t0Var.d);
        eVar.c(f, t0Var.e);
    }
}
