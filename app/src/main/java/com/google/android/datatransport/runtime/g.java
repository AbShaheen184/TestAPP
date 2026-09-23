package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.google.firebase.encoders.d {
    public static final g a = new g();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("currentCacheSizeBytes", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));
    public static final com.google.firebase.encoders.c c = new com.google.firebase.encoders.c("maxCacheSizeBytes", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(2))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.firebase.transport.f fVar = (com.google.android.datatransport.runtime.firebase.transport.f) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.b(b, fVar.a);
        eVar.b(c, fVar.b);
    }
}
