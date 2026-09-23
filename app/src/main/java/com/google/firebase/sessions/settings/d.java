package com.google.firebase.sessions.settings;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final com.google.firebase.sessions.b a;
    public final kotlin.coroutines.j b;

    public d(com.google.firebase.sessions.b bVar, kotlin.coroutines.j jVar) {
        bVar.getClass();
        jVar.getClass();
        this.a = bVar;
        this.b = jVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        com.google.firebase.sessions.b bVar = dVar.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.a).appendPath("settings");
        com.google.firebase.sessions.a aVar = bVar.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }
}
