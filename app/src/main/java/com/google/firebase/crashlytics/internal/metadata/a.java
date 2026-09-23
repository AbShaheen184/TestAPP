package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.google.firebase.encoders.d {
    public static final a a = new a();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("rolloutId");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("parameterKey");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("parameterValue");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("variantId");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("templateVersion");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        b bVar = (b) ((n) obj);
        eVar.g(b, bVar.b);
        eVar.g(c, bVar.c);
        eVar.g(d, bVar.d);
        eVar.g(e, bVar.e);
        eVar.b(f, bVar.f);
    }
}
