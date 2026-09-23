package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.firebase.encoders.d {
    public static final k a = new k();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("networkType");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("mobileSubtype");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        v vVar = (v) ((i0) obj);
        eVar.g(b, vVar.a);
        eVar.g(c, vVar.b);
    }
}
