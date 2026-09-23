package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.firebase.encoders.d {
    public static final b a = new b();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("window", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));
    public static final com.google.firebase.encoders.c c = new com.google.firebase.encoders.c("logSourceMetrics", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(2))));
    public static final com.google.firebase.encoders.c d = new com.google.firebase.encoders.c("globalMetrics", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(3))));
    public static final com.google.firebase.encoders.c e = new com.google.firebase.encoders.c("appNamespace", a.t(a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(4))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.android.datatransport.runtime.firebase.transport.a aVar = (com.google.android.datatransport.runtime.firebase.transport.a) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, aVar.a);
        eVar.g(c, aVar.b);
        eVar.g(d, aVar.c);
        eVar.g(e, aVar.d);
    }
}
