package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements com.google.firebase.encoders.d {
    public static final w a = new w();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("rolloutId");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("variantId");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        f1 f1Var = (f1) ((g2) obj);
        eVar.g(b, f1Var.a);
        eVar.g(c, f1Var.b);
    }
}
