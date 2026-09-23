package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.google.firebase.encoders.d {
    public static final f a = new f();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("filename");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("contents");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        h0 h0Var = (h0) ((r1) obj);
        eVar.g(b, h0Var.a);
        eVar.g(c, h0Var.b);
    }
}
