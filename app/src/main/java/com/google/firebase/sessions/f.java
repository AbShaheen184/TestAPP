package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.google.firebase.encoders.d {
    public static final f a = new f();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("processName");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("pid");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("importance");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("defaultProcess");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, g0Var.a);
        eVar.c(c, g0Var.b);
        eVar.c(d, g0Var.c);
        eVar.a(e, g0Var.d);
    }
}
