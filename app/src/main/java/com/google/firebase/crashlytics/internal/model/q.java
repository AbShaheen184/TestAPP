package com.google.firebase.crashlytics.internal.model;

import org.mozilla.javascript.NativeSymbol;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.google.firebase.encoders.d {
    public static final q a = new q();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("pc");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a(NativeSymbol.TYPE_NAME);
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("file");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("offset");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("importance");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        x0 x0Var = (x0) ((z1) obj);
        eVar.b(b, x0Var.a);
        eVar.g(c, x0Var.b);
        eVar.g(d, x0Var.c);
        eVar.b(e, x0Var.d);
        eVar.c(f, x0Var.e);
    }
}
