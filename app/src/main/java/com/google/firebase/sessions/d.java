package com.google.firebase.sessions;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.firebase.encoders.d {
    public static final d a = new d();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("appId");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a("deviceModel");
    public static final com.google.firebase.encoders.c d = com.google.firebase.encoders.c.a("sessionSdkVersion");
    public static final com.google.firebase.encoders.c e = com.google.firebase.encoders.c.a("osVersion");
    public static final com.google.firebase.encoders.c f = com.google.firebase.encoders.c.a("logEnvironment");
    public static final com.google.firebase.encoders.c g = com.google.firebase.encoders.c.a("androidAppInfo");

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        eVar.g(b, bVar.a);
        eVar.g(c, Build.MODEL);
        eVar.g(d, "3.0.5");
        eVar.g(e, Build.VERSION.RELEASE);
        eVar.g(f, a0.LOG_ENVIRONMENT_PROD);
        eVar.g(g, bVar.b);
    }
}
