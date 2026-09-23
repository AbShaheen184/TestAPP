package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.firebase.encoders.d {
    public static final b a = new b();
    public static final com.google.firebase.encoders.c b = new com.google.firebase.encoders.c("messagingClientEvent", com.google.android.datatransport.runtime.a.t(com.google.android.datatransport.runtime.a.s(com.google.firebase.encoders.proto.e.class, new com.google.firebase.encoders.proto.a(1))));

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        ((com.google.firebase.encoders.e) obj2).g(b, ((com.google.firebase.messaging.reporting.e) obj).a);
    }
}
