package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.firebase.encoders.d {
    public static final d a = new d();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("eventsDroppedCount", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));
    public static final com.google.firebase.encoders.c c = new com.google.firebase.encoders.c("reason", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(3))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.firebase.transport.d dVar = (com.google.android.datatransport.runtime.firebase.transport.d) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.b(b, dVar.a);
        eVar.g(c, dVar.b);
    }
}
