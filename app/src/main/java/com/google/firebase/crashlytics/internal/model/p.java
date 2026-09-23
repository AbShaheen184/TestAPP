package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements com.google.firebase.encoders.d {
    public static final p a = new p();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("name");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("importance");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("frames");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        v0 v0Var = (v0) ((a2) obj);
        eVar.g(b, v0Var.a);
        eVar.c(c, v0Var.b);
        eVar.g(d, v0Var.c);
    }
}
